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
        if(autenticaPassword(password) && revisaPassword(password) && validaPassword(password)){
            setPassword(password);
            return true;
        } else {
            return false;
        }
    }
    
    

}