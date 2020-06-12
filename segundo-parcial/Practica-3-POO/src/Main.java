public class Main {
    public static void main(String[] args){
        /*creamos instancias de los productos */
        Producto productos[] = new Producto[11];
        // Electrodomésticos
        productos[0] = new Electrodomestico(1853,"LG", 7600.0f, 2);
        productos[0].setDescripcion("Televisión LED, 32 pulg");
        productos[0].setExistencias(15);
        
        productos[1] = new Electrodomestico(2026,"Mabe", 5400.0f, 2);
        productos[1].setDescripcion("Lavadora con 8 funciones");
        productos[1].setExistencias(8);
        
        productos[2] = new Electrodomestico(434,"Sony", 3500.5f, 1);
        productos[2].setDescripcion("Barra de Sonido");
        productos[2].setExistencias(200);
        
        productos[3] = new Electrodomestico(3202,"Samsung", 29999.99f, 2);
        productos[3].setDescripcion("Galaxy S10+");
        productos[3].setExistencias(560);
        
        productos[4] = new Electrodomestico(24232,"Apple", 20000.0f, 3);
        productos[4].setDescripcion("iPad Pro 128GB");
        productos[4].setExistencias(560);
        
        // Víveres
        productos[5] = new Vivere(4757,"Alpura", 13.5f, "12/09/2020");
        productos[5].setDescripcion("Leche deslactosada 1lt");
        productos[5].setExistencias(560);
        
        productos[6] = new Vivere(5432,"Santa Clara", 17.5f, "12/09/2020");
        productos[6].setDescripcion("Leche deslactosada 1lt");
        productos[6].setExistencias(560);
        
        productos[7] = new Vivere(2345,"La Costeña", 30.5f, "12/09/2020");
        productos[7].setDescripcion("Chiles rojos");
        productos[7].setExistencias(560);
        
        productos[8] = new Vivere(322,"La Costeña", 23.5f, "12/09/2020");
        productos[8].setDescripcion("Frijoles Refritos");
        productos[8].setExistencias(560);
        
        productos[9] = new Vivere(3422,"Sonrics", 130.5f, "12/09/2020");
        productos[9].setDescripcion("Paletas de dulce");
        productos[9].setExistencias(560);
        
        productos[10] = new Vivere(4157,"Lala", 12.5f, "12/09/2020");
        productos[10].setDescripcion("Leche entera 1lt");
        productos[10].setExistencias(560);
        
        InterfazGrafica ventana = new InterfazGrafica(productos);
        ventana.setVisible(true);
    }
}
