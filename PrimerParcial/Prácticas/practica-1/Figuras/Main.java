class Main {
    public static void main(String[] args) {
        
        System.out.println();
        Figura figuras[] = new Figura[3];

        // Rectángulo
        Punto p1R = new Punto(1,1);
        Punto p2R = new Punto(3,4);
        figuras[0] = new Figura(p1R, p2R);
        figuras[0].imprimirInformacion();
        System.out.println();

        // Círculo
        Punto p1C = new Punto();
        figuras[1] = new Figura(p1C, 18.5);
        figuras[1].imprimirInformacion();
        System.out.println();

        // Triángulo
        Punto p1T = new Punto(13, 10);
        Punto p2T = new Punto(25, 20);
        Punto p3T = new Punto(40, 40);
        figuras[2] = new Figura(p1T, p2T, p3T);
        figuras[2].imprimirInformacion();
        System.out.println();
    }
}