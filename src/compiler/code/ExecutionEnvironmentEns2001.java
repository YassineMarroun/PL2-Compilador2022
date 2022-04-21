package compiler.code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import compiler.intermediate.MemoriaPrograma;
import compiler.intermediate.Textos;
import compiler.semantic.type.TypeSimple;
import es.uned.lsi.compiler.code.ExecutionEnvironmentIF;
import es.uned.lsi.compiler.code.MemoryDescriptorIF;
import es.uned.lsi.compiler.code.RegisterDescriptorIF;
import es.uned.lsi.compiler.intermediate.OperandIF;
import es.uned.lsi.compiler.intermediate.QuadrupleIF;
import es.uned.lsi.compiler.intermediate.TemporalIF;

/**
 * Class for the ENS2001 Execution environment.
 */

public class ExecutionEnvironmentEns2001 
    implements ExecutionEnvironmentIF
{    
    private final static int      MAX_ADDRESS = 65535; 
    private final static String[] REGISTERS   = {
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
        translate.append(";" + quadruple.toString());
        translate.append("\n");
        
        switch(quadruple.getOperation()) {
            case "INICIO":

                MemoriaPrograma memoria = new MemoriaPrograma();
                int sizeTextos = memoria.sizeTextos;

                // Salto incondicional al inicio del programa
                translate.append("BR /" + quadruple.getResult());
                translate.append("\n");
                int inicioTextos = Integer.parseInt(quadruple.getResult().toString()) - memoria.sizeTextos;
                // Añadir los textos
                HashMap<String, String> textos = Textos.getTextos();
                
                break;
            case "HALT":
                translate.append("HALT");
                translate.append("\n");
                break;
            case "WSTRING":
                break;
            case "WLN":
                break;
            case "WINT":
                break;
        }
        return translate.toString(); 
    }

    private String getDireccion(OperandIF operando) {

        if(operando instanceof TemporalIF) {
            return "/" + ((TemporalIF)operando);
        }

        return "";
    }
}
