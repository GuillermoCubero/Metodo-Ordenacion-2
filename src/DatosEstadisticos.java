public class DatosEstadisticos{
    
    public double tiempo;
    
    public DatosEstadisticos(){
        tiempo = 0;
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
}