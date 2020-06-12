public class Punto {
    private double coordX;
    private double coordY;

    public Punto() {
        this.coordX = 10.0;
        this.coordY = 10.0;
    }

    public Punto(double coordX, double coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }    

    public double getCoordX() {
        return this.coordX;
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public double getCoordY() {
        return this.coordY;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }
}