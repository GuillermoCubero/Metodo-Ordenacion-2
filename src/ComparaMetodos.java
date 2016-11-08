public class ComparaMetodos{
    public static void main(String[]args){
        
        int[] caso = GeneraCaso.generaVector(100000, true);
        int[] caso2 = GeneraCaso.generaVector(100000, false);
        
        DatosEstadisticos tiempo = new DatosEstadisticos();
        Ordenar1Vector vec = new Ordenar1Vector();
        Ordenar2Vector vec2 = new Ordenar2Vector();
      
        vec.ordena(caso, tiempo);
        CompruebaCaso.compruebaVector(caso, caso.length);
        System.out.println(tiempo.dameTiempo());
        
        tiempo.estableceTiempo(0);
        
        vec.ordena(caso2, tiempo);
        CompruebaCaso.compruebaVector(caso2, caso.length);
        System.out.println(tiempo.dameTiempo());
        
        vec2.ordena(caso, tiempo);
        CompruebaCaso.compruebaVector(caso, caso.length);
        System.out.println(tiempo.dameTiempo());
        
        tiempo.estableceTiempo(0);
        
        vec2.ordena(caso2, tiempo);
        CompruebaCaso.compruebaVector(caso2, caso.length);
        System.out.println(tiempo.dameTiempo());
    }
}
