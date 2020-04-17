public class Electrodomestico extends Producto{
    private int garantia;
    
     public Electrodomestico(int id, String marca, 
             float precio, int garantia) {
        super(id, marca, precio);
        this.garantia = garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }
     
     
    
}
