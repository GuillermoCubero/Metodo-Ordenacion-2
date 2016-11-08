public class ComparaMetodos{
    public static void main(String[]args){
        
        int[] caso = GeneraCaso.generaVector(100000, true);
        int[] caso2 = GeneraCaso.generaVector(100000, false);
        
        DatosEstadisticos datosa = new DatosEstadisticos();
        DatosEstadisticos datosi = new DatosEstadisticos();
        MediaDatosEstadisticos media = new MediaDatosEstadisticos();
        MediaDatosEstadisticos media2 = new MediaDatosEstadisticos();
        Ordenar1Vector vec = new Ordenar1Vector();
        Ordenar2Vector vec2 = new Ordenar2Vector();
        
        System.out.println(vec.nombreMetodo());
        System.out.println();
        System.out.println("<--Orden aleatorio-->");
        vec.ordena(caso, datosa);
        CompruebaCaso.compruebaVector(caso, caso.length);
        System.out.print("Tiempo: ");
        System.out.println(datosa.dameTiempo());
        System.out.print("Movimientos: ");
        System.out.println(datosa.dameMovimientos());
        System.out.print("Comparaciones: ");
        System.out.println(datosa.dameComparaciones());
        
        System.out.println("<--Orden inverso-->");
        vec.ordena(caso2, datosi);
        CompruebaCaso.compruebaVector(caso2, caso.length);
        System.out.print("Tiempo: ");
        System.out.println(datosi.dameTiempo());
        System.out.print("Movimientos: ");
        System.out.println(datosi.dameMovimientos());
        System.out.print("Comparaciones: ");
        System.out.println(datosi.dameComparaciones());
        
        System.out.println("<--Medias-->");
        media.añadeDatosEstadisticos(datosa);
        media.añadeDatosEstadisticos(datosi);
        System.out.print("Media Tiempos: ");
        System.out.println(media.dameMediaTiempos());
        System.out.print("Media Movimientos: ");
        System.out.println(media.dameMediaMovimientos());
        System.out.print("Media comparaciones: ");
        System.out.println(media.dameMediaComparaciones());
        
        
        System.out.println();
        
        datosa.estableceTiempo(0);
        datosa.estableceComparaciones(0);
        datosa.estableceMovimientos(0);
        datosi.estableceTiempo(0);
        datosi.estableceComparaciones(0);
        datosi.estableceMovimientos(0);
        
        System.out.println(vec2.nombreMetodo());
        System.out.println();
        System.out.println("<--Orden aleatorio-->");
        vec2.ordena(caso, datosa);
        CompruebaCaso.compruebaVector(caso, caso.length);
        System.out.print("Tiempo: ");
        System.out.println(datosa.dameTiempo());
        System.out.print("Movimientos: ");
        System.out.println(datosa.dameMovimientos());
        System.out.print("Comparaciones: ");
        System.out.println(datosa.dameComparaciones());
        
        System.out.println("<--Orden inverso-->");
        vec2.ordena(caso2, datosi);
        CompruebaCaso.compruebaVector(caso2, caso.length);
        System.out.print("Tiempo: ");
        System.out.println(datosi.dameTiempo());
        System.out.print("Movimientos: ");
        System.out.println(datosi.dameMovimientos());
        System.out.print("Comparaciones: ");
        System.out.println(datosi.dameComparaciones());
        
        System.out.println("<--Medias-->");
        media2.añadeDatosEstadisticos(datosa);
        media2.añadeDatosEstadisticos(datosi);
        System.out.print("Media Tiempos: ");
        System.out.println(media2.dameMediaTiempos());
        System.out.print("Media Movimientos: ");
        System.out.println(media2.dameMediaMovimientos());
        System.out.print("Media comparaciones: ");
        System.out.println(media2.dameMediaComparaciones());
    }
}