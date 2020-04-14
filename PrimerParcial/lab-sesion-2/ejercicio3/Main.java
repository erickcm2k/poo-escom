class Main{
    public static void main(String[] args) {
        
        String miRFC = generarRFC("Erick", "Castañeda", "Martinez", "2000/07/10");
        System.out.println(miRFC);
        
    }

    public static Integer incidenciasCaracter(String cadenaPrueba, char caracterABuscar) {
        Integer incidencias = 0;
        cadenaPrueba = cadenaPrueba.toLowerCase();
        for(Integer i = 0; i < cadenaPrueba.length(); i++) {
            if(cadenaPrueba.charAt(i) == caracterABuscar){
                incidencias++;
            }
        }
        return incidencias;
    }

    public static String generarRFC(String nombre, String apellidoPaterno, String apellidoMaterno, String fechaNacimiento) {
        String RFC = "";

        RFC += apellidoPaterno.charAt(0);
        RFC += obtenerPrimeraVocal(apellidoPaterno);
        RFC += apellidoMaterno.charAt(0);
        RFC += nombre.charAt(0);
        RFC += segundaParteRFC(fechaNacimiento);

        return RFC.toUpperCase();
    }

    public static char obtenerPrimeraVocal(String apellido){
        String vocales = "aeiou";
        apellido = apellido.toLowerCase();

        for(Integer i = 0; i < apellido.length(); i++) {
            if(vocales.contains(String.valueOf(apellido.charAt(i)))){
                return apellido.charAt(i);
            }
        }
        return 0; // En caso de no encontrar una vocal
    }

    public static String segundaParteRFC(String fecha){

        String segundaParteRFC = "";
        String[] nuevaFecha = fecha.split("/");
        String año = nuevaFecha[0];
        String mes = nuevaFecha[1];
        String dia = nuevaFecha[2];

        segundaParteRFC += año.charAt(2);
        segundaParteRFC += año.charAt(3);

        segundaParteRFC += mes.charAt(0);
        segundaParteRFC += mes.charAt(1);

        segundaParteRFC += dia.charAt(0);
        segundaParteRFC += dia.charAt(1);

        return segundaParteRFC;
    }
}