public class Principal{
    public static void main(String[]args){
        
        int[] caso = GeneraCaso.generaVector(100, true);
        DatosEstadisticos tiempo = new DatosEstadisticos();
        Ordenar1Vector vec = new Ordenar1Vector();
        vec.ordena(caso, tiempo);
        CompruebaCaso.compruebaVector(caso, caso.length);
    }
    
}
