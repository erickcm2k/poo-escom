import java.lang.Math;

class TrianguloEquilatero {
    public float lado;

    public TrianguloEquilatero(float lado){
        this.lado = lado;
    }

    public float getLado(){
        return lado;
    }

    public float calcularArea(){
        return (float)((Math.sqrt(3) * Math.pow(lado, 2)) / 4);
    }

    public float calcularPerimetro(){
        return 3 * lado;
    }    

}