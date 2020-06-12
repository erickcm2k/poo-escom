package ejercicio4;

public class Main {
    static void metodoA() throws IllegalAccessException {
        try {
            System.out.println("Desde el metodo A...");
            throw new IllegalAccessException("Descripción de la excepción...");
        } finally {
            System.out.println("Bloque finally del método");
        }
    }

    static void metodoB() {
        try {
            System.out.println("Desde el método N...");
            return;
        } finally {
            System.out.println("Bloque finally del método B");
        }
    }

    static void metodoC() {
        try {
            System.out.println("Desde el método C...");
        } finally {
            System.out.println("Bloque finally del método C");
        }
    }

    public static void main(String[] args) {
        try {
            metodoA();
        } catch(IllegalAccessException e) {
            System.out.println("Capturando la excepcion del método A: " + e);
        }
        metodoB();
        metodoC();
    }
}