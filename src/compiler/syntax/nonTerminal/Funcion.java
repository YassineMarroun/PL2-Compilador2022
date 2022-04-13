package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class Funcion extends NonTerminal {

    private ArrayList<Sentencia> sentencias;

    public Funcion(ArrayList<Sentencia> sentencias, Sentencia sentencia) {
        super();
        this.sentencias = sentencias;
        this.sentencias.add(0, sentencia);
    }

    public int comprobarDevolver(ArrayList<Sentencia> sentencias) {
        
        int numeroDevolver = 0;

        for(Sentencia s : sentencias) {
            if(s instanceof SentenciaDevolver) {
                numeroDevolver++;
            }
            // Si es un if o un for, comprobar su listado de sentencias
            else if(s instanceof SentenciaIf) {
                ArrayList<Sentencia> sIF = ((SentenciaIf)s).getSentenciasIF();
                ArrayList<Sentencia> sElse = ((SentenciaIf)s).getSentenciasElse();
                numeroDevolver += comprobarDevolver(sIF) + comprobarDevolver(sElse);
            }
            else if(s instanceof SentenciaFor) {
                ArrayList<Sentencia> sFor = ((SentenciaFor)s).getSentencias();
                numeroDevolver += comprobarDevolver(sFor);
            }
        }
        return numeroDevolver;
    }
    
    public ArrayList<Sentencia> getSentencias() {
        return sentencias;
    }

    public void setSentencias(ArrayList<Sentencia> sentencias) {
        this.sentencias = sentencias;
    }
}
