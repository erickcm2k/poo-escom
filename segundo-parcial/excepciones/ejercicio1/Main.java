package ejercicio1;

public class Main {
    public static void main(String[] args) {
        int d = 1;
        int n = 4;
        int arr[] = new int[5];
        double resp = 0;

        try {
            System.out.println("Instrucción después de la excepción.");
            for(int i = 0; i < 7; ++i) {
                arr[i] = i;
            }
            resp = n / d;
        } catch (ArithmeticException e) {
            System.out.println("Excepcion aritmética capturada.");
            d++;
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("Excepcion de índice fuera de arreglo capturada.");
        }
        resp = n / d;
        System.out.println("El resultado es: " + resp);
    }
}