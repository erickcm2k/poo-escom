class Figuras {
    public static void main(String[] args) {

        Cuadrado cuadrado1 = new Cuadrado(10.0f);
        float area = cuadrado1.calcularArea();
        float perimetro = cuadrado1.calculaPerimetro();
        System.out.println("\nArea cuadrado: " + area + "\nPerimetro cuadrado " + perimetro);    

        TrianguloEquilatero triangulo1 = new TrianguloEquilatero(20.0f);
        System.out.println("Area del circulo: " + triangulo1.calcularArea() + "\nPerimetro: " + triangulo1.calcularPerimetro());

        Circulo circulo1 = new Circulo(10.0f);
        System.out.println("El area del circulo es: " + circulo1.calcularArea() + "\nPerimetro: " + circulo1.calcularPerimetro());
    }
}