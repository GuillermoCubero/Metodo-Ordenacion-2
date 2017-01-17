public class CalculadorEstadisticas {
    public static DatosEstadisticos estadisticaOrdenaVector(OrdenarVector ordenarVector, int size, Boolean random){
        DatosEstadisticos datosEstadisticos = new DatosEstadisticos();
        int[] vector = GeneraCaso.generaVector(size, random);
        ordenarVector.ordena(vector, datosEstadisticos);
        CompruebaCaso.compruebaVector(vector, size);
        return datosEstadisticos;
    }

    public static MediaDatosEstadisticos estadisticaOrdenaVectorAleatorio(OrdenarVector ordenarVector, int size){
        MediaDatosEstadisticos mediaDatosEstadisticos = new MediaDatosEstadisticos();
        for (int i = 0; i < 10; i++) mediaDatosEstadisticos.añadeDatosEstadisticos(estadisticaOrdenaVector(ordenarVector, size, true));
        return mediaDatosEstadisticos;
    }

    public static DatosEstadisticos[] estadisticasOrdenaVectoresInversos(OrdenarVector ordenarVector, int[] size){
        DatosEstadisticos[] datosEstadisticos = new DatosEstadisticos[size.length];
        for (int i = 0; i < size.length; i++)datosEstadisticos[i] = estadisticaOrdenaVector(ordenarVector, size[i], false);
        return datosEstadisticos;
    }

    public static MediaDatosEstadisticos[] estadisticasOrdenaVectoresAleatorios(OrdenarVector ordenarVector, int[] size){
        MediaDatosEstadisticos[] mediaDatosEstadisticos = new MediaDatosEstadisticos[size.length];
        for (int i = 0; i < size.length; i++)mediaDatosEstadisticos[i] = estadisticaOrdenaVectorAleatorio(ordenarVector, size[i]);
        return mediaDatosEstadisticos;
    }
}