import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        String password;

        nombre = scanner.nextLine();
        password = scanner.nextLine();

        Login primerLogin = new Login(nombre, password);
        primerLogin.accion("123456");
        
    }
}