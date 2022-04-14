package compiler.intermediate;

import java.util.HashMap;

public class Textos {
    
    private static HashMap<String, String> textos = new  HashMap<String, String>();
    private static int nextID = 1;

    public static String addTexto(String texto) {

        String label = "text_" + nextID;
        textos.put(label, texto);
        nextID++;

        return label;
    }

    public static HashMap<String, String> getTextos() {

        for(Entry<String, string> e : textos.) {

        }
        return textos;
    }
}
