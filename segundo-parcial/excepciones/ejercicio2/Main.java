package ejercicio2;

public class Main {
 public static void main(String[] args) {
     try {
         throw new Exception("Lanzando la excepción.");
     } catch(Exception e) {
         System.err.println("Excepción capturada.");
         System.err.println("e.getMessage(): " + e.getMessage());
         System.err.println("e.getLocalizedMessage(): " + e.getLocalizedMessage());
         System.err.println("e.toString();");
         System.err.println("e.printStackTrace();");
         e.printStackTrace(System.err);
     }
 }
}