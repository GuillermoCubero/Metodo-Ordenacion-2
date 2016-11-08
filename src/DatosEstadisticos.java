public class DatosEstadisticos{
    
    public double tiempo;
    public int ncomp;
    public int nmov;
    
    public DatosEstadisticos(){
        tiempo = 0;
        ncomp = 0;
        nmov = 0;
    }
    
    public void añadeTiempo(double tiemponuevo){
        tiempo += tiemponuevo;
    }
    
    public void estableceTiempo(double tiemponuevo){
        tiempo = tiemponuevo;
    }
    
    public double dameTiempo(){
        return tiempo;
    }
    
    public void añadeComparacion(){
        ncomp += 1;
    }
    
    public void añadeMovimiento(){
        nmov += 1;
    }
    
    public void estableceComparaciones(int comp){
        ncomp = comp;
    }
    
    public void estableceMovimientos(int mov){
        nmov = mov;
    }
    
    public int dameComparaciones(){
        return ncomp;
    }
    
    public int dameMovimientos(){
        return nmov;
    }
}