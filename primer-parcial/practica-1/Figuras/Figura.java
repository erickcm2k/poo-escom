public class Figura {
    private String nombre;
    private double area;
    private double perimetro;

    public Figura(){
        this.nombre = "";
        this.area = 0;
        this.perimetro = 0;
    }

    /* Constructor que genera un círculo */
    public Figura (Punto p1, double radio) {
        this.nombre = "Circulo";
        this.area = Math.PI * radio;
        this.perimetro = Math.PI * 2.0 * radio;
    }

    /* Constructor que genera un rectángulo */
    public Figura (Punto p1, Punto p2) {
        this.nombre = "Rectangulo";
        double alto = Math.abs(p1.getCoordX() - p2.getCoordX());         
        double ancho = Math.abs(p1.getCoordY() - p2.getCoordY()); 
        this.area = alto * ancho;
        this.perimetro = 2 * (alto + ancho);        
    }

    /* Constructor que genera un triángulo */
    public Figura (Punto p1, Punto p2, Punto p3) {
        this.nombre = "Triangulo";

        //distancia de P1 a P2
        double a = Math.sqrt( Math.pow(p1.getCoordX() - p2.getCoordX(), 2) + Math.pow(p1.getCoordY() - p2.getCoordY(), 2) );    
        //distancia de P1 a P3
        double b = Math.sqrt( Math.pow(p1.getCoordX() - p3.getCoordX(), 2) + Math.pow(p1.getCoordY() - p3.getCoordY(), 2) );    
        //distancia de P2 a P3
        double c = Math.sqrt( Math.pow(p2.getCoordX() - p3.getCoordX(), 2) + Math.pow(p2.getCoordY() - p3.getCoordY(), 2) );    
        // Semiperímetro
        double p = (a + b + c) / 2;

        double areaTriangulo = Math.sqrt( p * ( (p - a) * (p - b) * (p - c) ) );
        double perimetroTriangulo = a + b + c;

        this.area = areaTriangulo;
        this.perimetro = perimetroTriangulo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return this.perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public void imprimirInformacion(){
        System.out.println("Datos de la figura geometrica \n");
        System.out.println("Nombre: " + nombre);
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
}