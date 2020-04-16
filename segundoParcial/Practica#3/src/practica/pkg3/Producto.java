package practica.pkg3;

/**
 *
 * @author erick
 */
public abstract class Producto {
    /* Atributos */
    protected int id;
    protected float precio;
    protected String marca;
    protected String descripcion;
    protected int existencias;
    
    /* Metodos */

    public Producto(int id, String marca, float precio) {
        this.id = id;
        this.marca = marca;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }
    
    
    
    
}
