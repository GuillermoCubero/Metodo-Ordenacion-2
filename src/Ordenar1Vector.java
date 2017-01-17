public class Ordenar1Vector implements OrdenarVector {
    public void ordena (int[] vector, DatosEstadisticos datosEstadisticos){
        int[] nuevo = new int[vector.length];
        datosEstadisticos.estableceTiempo(System.currentTimeMillis());
        nuevo[0] = vector[0];
        datosEstadisticos.añadeMovimiento();
        for(int i = 1; i < vector.length; i++){
            int j = 0;
            datosEstadisticos.añadeComparacion();
            while((j < i) && (nuevo[j] <= vector[i])){
                datosEstadisticos.añadeComparacion();
                j += 1;
            }
            for(int k = i-1; k >= j; k--){
                nuevo[k+1] = nuevo[k];
                datosEstadisticos.añadeMovimiento();
            }
            nuevo[j] = vector[i];
            datosEstadisticos.añadeMovimiento();
        }
        datosEstadisticos.estableceTiempo((System.currentTimeMillis() - datosEstadisticos.dameTiempo())/1000);
        System.arraycopy(nuevo, 0, vector, 0, vector.length);
    }
    
    public String nombreMetodo (){
        return "Inserción lineal";
    }
}