package compiler.code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import compiler.intermediate.MemoriaPrograma;
import compiler.intermediate.Textos;
import compiler.intermediate.Value;
import compiler.intermediate.Variable;
import compiler.semantic.type.TypeSimple;
import es.uned.lsi.compiler.code.ExecutionEnvironmentIF;
import es.uned.lsi.compiler.code.MemoryDescriptorIF;
import es.uned.lsi.compiler.code.RegisterDescriptorIF;
import es.uned.lsi.compiler.intermediate.LabelFactory;
import es.uned.lsi.compiler.intermediate.LabelFactoryIF;
import es.uned.lsi.compiler.intermediate.LabelIF;
import es.uned.lsi.compiler.intermediate.OperandIF;
import es.uned.lsi.compiler.intermediate.QuadrupleIF;
import es.uned.lsi.compiler.intermediate.TemporalIF;

/**
 * Class for the ENS2001 Execution environment.
 */

public class ExecutionEnvironmentEns2001 
    implements ExecutionEnvironmentIF
{    
    private final static int MAX_ADDRESS = 65535;
    private final static int STACK_ADDRESS = 65000;
    private final static int DISPLAY_ADDRESS = 65001;
    private final static int FP_ADDRESS = 64999;

    private final static String[] REGISTERS = {
       ".PC", ".SP", ".SR", ".IX", ".IY", ".A", 
       ".R0", ".R1", ".R2", ".R3", ".R4", 
       ".R5", ".R6", ".R7", ".R8", ".R9"
    };
    
    private RegisterDescriptorIF registerDescriptor;
    private MemoryDescriptorIF   memoryDescriptor;
    
    /**
     * Constructor for ENS2001Environment.
     */
    public ExecutionEnvironmentEns2001 ()
    {       
        super ();
    }
    
    /**
     * Returns the size of the type within the architecture.
     * @return the size of the type within the architecture.
     */
    @Override
    public final int getTypeSize (TypeSimple type)
    {      
        return 1;  
    }
    
    /**
     * Returns the registers.
     * @return the registers.
     */
    @Override
    public final List<String> getRegisters ()
    {
        return Arrays.asList (REGISTERS);
    }
    
    /**
     * Returns the memory size.
     * @return the memory size.
     */
    @Override
    public final int getMemorySize ()
    {
        return MAX_ADDRESS;
    }
           
    /**
     * Returns the registerDescriptor.
     * @return Returns the registerDescriptor.
     */
    @Override
    public final RegisterDescriptorIF getRegisterDescriptor ()
    {
        return registerDescriptor;
    }

    /**
     * Returns the memoryDescriptor.
     * @return Returns the memoryDescriptor.
     */
    @Override
    public final MemoryDescriptorIF getMemoryDescriptor ()
    {
        return memoryDescriptor;
    }

    /**
     * Translate a quadruple into a set of final code instructions. 
     * @param cuadruple The quadruple to be translated.
     * @return a quadruple into a set of final code instructions. 
     */
    @Override
    public final String translate (QuadrupleIF quadruple)
    {      
        StringBuilder translate = new StringBuilder();
        LabelFactoryIF lF = new LabelFactory();
        translate.append(";" + quadruple.toString());
        translate.append("\n");
        
        switch(quadruple.getOperation()) {
            case "INICIO":
                MemoriaPrograma memoria = new MemoriaPrograma();
                memoria.asignarMemoria();
                // Salto incondicional al inicio del programa
                translate.append("BR /" + quadruple.getResult());
                translate.append("\n");
                translate.append("ORG " + memoria.inicioTextos);
                translate.append("\n");
                
                // Añadir los textos
                HashMap<String, String> textos = Textos.getTextos();
                for(Entry<String, String> e : textos.entrySet()) {
                    translate.append(e.getKey() + ": DATA " + e.getValue());
                    translate.append("\n");
                }
                translate.append("ORG " + quadruple.getResult());
                translate.append("\n");

                // Registro de Activación del Programa Principal
                int sizeProgramaPrincipal = STACK_ADDRESS - memoria.sizePrincipal;
                translate.append("MOVE #" + sizeProgramaPrincipal + ", .SP");
                translate.append("\n");
                translate.append("MOVE #" + DISPLAY_ADDRESS + ", .R0");
                translate.append("\n");
                translate.append("MOVE #" + FP_ADDRESS + ", [.R0]");
                translate.append("\n");
                translate.append("MOVE #" + FP_ADDRESS + ", .IX");
                translate.append("\n");
                break;
            case "HALT":
                translate.append("HALT");
                translate.append("\n");
                break;
            case "WSTRING":
                translate.append("WRSTR /" + quadruple.getResult());
                translate.append("\n");
                translate.append("WRCHAR #10");
                translate.append("\n");
                break;
            case "WLN":
                translate.append("WRCHAR #10");
                translate.append("\n");
                break;
            case "WINT":
                translate.append("WRINT " + getDireccion(quadruple.getResult()));
                translate.append("\n");
                translate.append("WRCHAR #10");
                translate.append("\n");
                break;
            case "MV":
                translate.append("MOVE " + getDireccion(quadruple.getFirstOperand()) + "," + getDireccion(quadruple.getResult()));
                translate.append("\n");
                break;
            case "ADD":
                translate.append("ADD " + getDireccion(quadruple.getFirstOperand()) + "," + getDireccion(quadruple.getSecondOperand()));
                translate.append("\n");
                translate.append("MOVE .A, " + getDireccion(quadruple.getResult()));
                translate.append("\n");
                break;
            case "SUB":
                translate.append("SUB " + getDireccion(quadruple.getFirstOperand()) + "," + getDireccion(quadruple.getSecondOperand()));
                translate.append("\n");
                translate.append("MOVE .A," + getDireccion(quadruple.getResult()));
                translate.append("\n");
                break;
            case "MUL":
                translate.append("MUL " + getDireccion(quadruple.getFirstOperand()) + "," + getDireccion(quadruple.getSecondOperand()));
                translate.append("\n");
                translate.append("MOVE .A, " + getDireccion(quadruple.getResult()));
                translate.append("\n");
                break;
            case "MVA":
                // Guardar una dirección de una variable    
                String direccion = getDireccion(quadruple.getFirstOperand());
                String valorDireccion = direccion.replace("/", "#");
                translate.append("MOVE " + valorDireccion + ",.R1");
                translate.append("\n");
                translate.append("MOVE .R1," + getDireccion(quadruple.getResult()));
                translate.append("\n");
                break;
            case "MVP":
                // Acceder a la posición de memoria y guardar el resultado
                String direccionP = getDireccion(quadruple.getFirstOperand());
                String valorDireccionP = direccionP.replace("/", "#");
                translate.append("MOVE " + valorDireccionP + ",.R1");
                translate.append("\n");
                translate.append("MOVE [.R1], .R2");
                translate.append("\n");
                translate.append("MOVE [.R2], " + getDireccion(quadruple.getResult()));
                translate.append("\n");
                break;
            case "STP":
                // Guardar un valor en una dirección de memoria
                String direccionS = getDireccion(quadruple.getResult());
                String valorDireccionS = direccionS.replace("/", "#");
                translate.append("MOVE " + valorDireccionS + ",.R1");
                translate.append("\n");
                translate.append("MOVE [.R1], .R2");
                translate.append("\n");
                translate.append("MOVE " + getDireccion(quadruple.getFirstOperand()) + ",[.R2]");
                translate.append("\n");
                break;
            case "LS":
                LabelIF labelLSV = lF.create();
                LabelIF labelLSF = lF.create();
                // Se comparan los dos operandos
                translate.append("CMP " + getDireccion(quadruple.getFirstOperand()) + "," + getDireccion(quadruple.getSecondOperand()));
                translate.append("\n");
                // Se comprueba bit de signo (1 si es negativo)
                translate.append("BN /" + labelLSV);
                translate.append("\n");
                translate.append("MOVE #0," + getDireccion(quadruple.getResult()));
                translate.append("\n");
                translate.append("BR /" + labelLSF);
                translate.append("\n");
                translate.append(labelLSV + ":");
                translate.append("\n");
                translate.append("MOVE #1," + getDireccion(quadruple.getResult()));
                translate.append("\n");
                translate.append(labelLSF + ":");
                translate.append("\n");
                break;
            case "EQ":
                LabelIF labelEQV = lF.create();
                LabelIF labelEQF = lF.create();
                // Se comparan los dos operandos
                translate.append("CMP " + getDireccion(quadruple.getFirstOperand()) + "," + getDireccion(quadruple.getSecondOperand()));
                translate.append("\n");
                // Se comprueba bit de signo (1 si es negativo)
                translate.append("BZ /" + labelEQV);
                translate.append("\n");
                translate.append("MOVE #0," + getDireccion(quadruple.getResult()));
                translate.append("\n");
                translate.append("BR /" + labelEQF);
                translate.append("\n");
                translate.append(labelEQV + ":");
                translate.append("\n");
                translate.append("MOVE #1," + getDireccion(quadruple.getResult()));
                translate.append("\n");
                translate.append(labelEQF + ":");
                translate.append("\n");
                break;
            case "AND":
                translate.append("AND " + getDireccion(quadruple.getFirstOperand()) + "," + getDireccion(quadruple.getSecondOperand()));
                translate.append("\n");
                translate.append("MOVE .A" + getDireccion(quadruple.getResult()));
                translate.append("\n");
                break;
            case "NOT":
                LabelIF labelNV = lF.create();
                LabelIF labelNF = lF.create();
                // Se comparan los dos operandos
                translate.append("CMP #1, " + getDireccion(quadruple.getFirstOperand()));
                translate.append("\n");
                // Se comprueba si es cero
                translate.append("BZ /" + labelNV);
                translate.append("\n");
                translate.append("MOVE #0," + getDireccion(quadruple.getResult()));
                translate.append("\n");
                translate.append("BR /" + labelNF);
                translate.append("\n");
                translate.append(labelNV + ":");
                translate.append("MOVE #1," + getDireccion(quadruple.getResult()));
                translate.append("\n");
                translate.append(labelNF + ":");
                translate.append("\n");
                break;
             case "BRTRUE":
                translate.append("CMP #1, " + getDireccion(quadruple.getResult()));
                translate.append("\n");
                translate.append("BZ /" + quadruple.getFirstOperand());
                translate.append("\n");
                break;
             case "BR":
                translate.append("BR /" + quadruple.getResult());
                translate.append("\n");
                break;
             case "INLABEL":
                translate.append(quadruple.getResult() + ":");
                translate.append("\n");
                translate.append("NOP");
                translate.append("\n");
                break;
            // Mayor    
            case "GR":
                LabelIF labelGRV = lF.create();
                LabelIF labelGRF = lF.create();
                // Se comparan los dos operandos
                translate.append("CMP " + getDireccion(quadruple.getSecondOperand()) + "," + getDireccion(quadruple.getFirstOperand()));
                translate.append("\n");
                // Se comprueba bit de signo (1 si es negativo)
                translate.append("BN /" + labelGRV);
                translate.append("\n");
                translate.append("NOVE #0," + getDireccion(quadruple.getResult()));
                translate.append("\n");
                translate.append("BR /" + labelGRF);
                translate.append("\n");
                translate.append(labelGRV + ":");
                translate.append("\n");
                translate.append("MOVE #1," + getDireccion(quadruple.getResult()));
                translate.append("\n");
                translate.append(labelGRF + ":");
                translate.append("\n");
                break;
            case "CALL";
                break;
        }
        return translate.toString(); 
    }

    private String getDireccion(OperandIF operando) {

        if(operando instanceof TemporalIF) {
            // .iX
            return "#-" + ((TemporalIF)operando).getAddress();
        }
        if(operando instanceof Value) {
            return "#" + ((Value)operando).getValue();
        }

        if(operando instanceof Variable) {
            return "/" + ((Variable)operando).getSymbol().getDireccionMemoria();
        }

        return "";
    }

    private boolean esLocal(Variable variable) {
        return 
    }
}
