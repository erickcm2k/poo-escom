class Cuadrado {
    private float lado;

    public Cuadrado(float lado){
        this.lado = lado;
    }
    public float getLado(){
        return lado;
    }
    public float calcularArea(){
        return lado * lado;
    }
    public float calculaPerimetro(){
        return 4 * lado;
    }
}
