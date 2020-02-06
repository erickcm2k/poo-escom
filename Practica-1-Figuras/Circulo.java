import java.lang.Math;

class Circulo {
    private float radio;

    public Circulo(float radio){
        this.radio = radio;
    }

    public float getRadio(){
        return radio;
    }

    public float calcularArea(){
        return (float)(radio * Math.PI);
    }

    public float calcularPerimetro(){
        return (float)(Math.PI * radio * 2);
    }

    
}