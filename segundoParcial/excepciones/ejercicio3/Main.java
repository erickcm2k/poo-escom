public class Main {
    public static void lanzaThrow() {
        try {
            new NullPointerException("Descripción de la excepción").fillInStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Se captura por primera vez la excepción.");
            throw e;
        }

    }
    public static void main(String[] args) {
        try {
            lanzaThrow();
        }catch(NullPointerException e){
            System.out.println("Se recaptura la excepción: " + e);
        }
    }
}