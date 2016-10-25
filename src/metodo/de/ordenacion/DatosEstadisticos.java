public class DatosEstadisticos{
    
    public double tiempoini;
    public double tiempofin;
    
    public DatosEstadisticos(){
        tiempoini = 0;
        tiempofin = 0;
    }
    
    public void añadeTiempo(double tiempofin){
        tiempofin = System.currentTimeMillis();
    }
    
    public void estableceTiempo(double tiempoini){
        tiempoini = System.currentTimeMillis();
    }
    
    public double dameTiempo(){
        double tiempo = tiempofin - tiempoini;
        return tiempo;
    }
}