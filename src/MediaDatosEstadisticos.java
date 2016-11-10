public class MediaDatosEstadisticos {
    
    int numdatos;
    float tiempos, numcomp, nummov;
    
    public MediaDatosEstadisticos(){
        numdatos = 0;
        tiempos = 0;
        nummov = 0;
        numcomp = 0;
    }
    
    public void añadeDatosEstadisticos(DatosEstadisticos de){
        numdatos +=1;
        tiempos += de.dameTiempo();
        nummov += de.dameMovimientos();
        numcomp += de.dameComparaciones();
    }
    
    public float dameMediaTiempos(){
        return tiempos/numdatos;
    }
    
    public float dameMediaComparaciones(){
        return numcomp/numdatos;
    }
    
    public float dameMediaMovimientos(){
        return nummov/numdatos;
    }
}