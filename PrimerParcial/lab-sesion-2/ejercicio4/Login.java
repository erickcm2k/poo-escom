import java.util.Scanner;
public class Login {
    private String username;
    private String password;

    public Login(){
        this.username = "na";
        this.password = "****";
    }

    public Login(String username, String password){
        this.username = username;
        this.password = password;
    }

    public Login(String username) {
        this.username = username;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean validaPassword(String username) {
        return this.password.length() > 5;
    }

    public boolean autenticaPassword(String password) {
        return this.password != password;
    }
    
    public boolean revisaPassword(String password) {
        return password != this.username;
    }
    
    public boolean accion(String password) {
        
        System.out.println("Ingresa una opción: ");
        Scanner scanner = new Scanner(System.in);
        char respuesta;
        
        do{
            respuesta = scanner.next().toLowerCase().charAt(0);
            switch(respuesta){
                case 'a': {
                    System.out.println(autenticaPassword(password)); 
                    break;
                }
                case 'b': {
                    System.out.println(revisaPassword(password));
                }
    
                case 'c': {
    
                    if(validaPassword(password)) {
                        return true;
                    } else {
                        return false;
                    }
    
                }
            }
            System.out.println("Presione 's' si quiere repetir el menú. ");
            respuesta = scanner.next().toLowerCase().charAt(0);
        } while(respuesta != 's');

        return false;

    }
    
    

}