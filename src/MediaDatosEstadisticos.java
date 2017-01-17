public class MediaDatosEstadisticos {
    
    private int numeroDeDatosEstadisticos;
    private float tiempoTotal, numeroTotalDeComparaciones, numeroTotalDeMovimientos;
    
    public MediaDatosEstadisticos(){
        numeroDeDatosEstadisticos = 0;
        tiempoTotal = 0;
        numeroTotalDeMovimientos = 0;
        numeroTotalDeComparaciones = 0;
    }
    
    public void añadeDatosEstadisticos(DatosEstadisticos datosEstadisticos){
        tiempoTotal += datosEstadisticos.dameTiempo();
        numeroTotalDeMovimientos += datosEstadisticos.dameMovimientos();
        numeroTotalDeComparaciones += datosEstadisticos.dameComparaciones();
        numeroDeDatosEstadisticos++;
    }
    
    public float dameMediaTiempos(){
        return media(tiempoTotal);
    }


    public float dameMediaComparaciones(){
        return media(numeroTotalDeComparaciones);
    }

    public float dameMediaMovimientos(){
        return media(numeroTotalDeMovimientos);
    }

    private float media(float total) {
        return total / numeroDeDatosEstadisticos;
    }
}