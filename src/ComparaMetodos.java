public class ComparaMetodos{
    public static void main(String[]args){
        
        int[] caso = GeneraCaso.generaVector(100000, true);
        int[] caso2 = GeneraCaso.generaVector(100000, false);
        
        DatosEstadisticos tiempo = new DatosEstadisticos();
        Ordenar1Vector vec = new Ordenar1Vector();
        Ordenar2Vector vec2 = new Ordenar2Vector();
        
        System.out.println(vec.nombreMetodo());
        System.out.println();
        System.out.println("<--Orden aleatorio-->");
        vec.ordena(caso, tiempo);
        CompruebaCaso.compruebaVector(caso, caso.length);
        System.out.print("Tiempo: ");
        System.out.println(tiempo.dameTiempo());
        
        tiempo.estableceTiempo(0);
        
        System.out.println("<--Orden inverso-->");
        vec.ordena(caso2, tiempo);
        CompruebaCaso.compruebaVector(caso2, caso.length);
        System.out.print("Tiempo: ");
        System.out.println(tiempo.dameTiempo());
        
        System.out.println();
        
        System.out.println(vec2.nombreMetodo());
        System.out.println();
        System.out.println("<--Orden aleatorio-->");
        vec2.ordena(caso, tiempo);
        CompruebaCaso.compruebaVector(caso, caso.length);
        System.out.print("Tiempo: ");
        System.out.println(tiempo.dameTiempo());
        
        tiempo.estableceTiempo(0);
        
        System.out.println("<--Orden inverso-->");
        vec2.ordena(caso2, tiempo);
        CompruebaCaso.compruebaVector(caso2, caso.length);
        System.out.print("Tiempo: ");
        System.out.println(tiempo.dameTiempo());
    }
}
