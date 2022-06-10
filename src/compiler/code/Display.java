package compiler.code;

public class Display {

    private static Display display = null;
    private static int nivelActual = 0;

    protected Display() {
    }

    public static Display getDisplay() {
        if(display == null) {
            display = new Display();
        }
        return display;
    }

    public int getNivelActual() {
        return nivelActual;
    }

    public void setNivelActual(int actual) {
        nivelActual = actual;
    }
}