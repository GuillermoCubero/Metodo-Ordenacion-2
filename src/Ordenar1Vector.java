public class Ordenar1Vector implements OrdenarVector {
    public void ordena (int[] vec, DatosEstadisticos de){
        long start = System.currentTimeMillis();
        int[] nuevo = new int[vec.length];
        nuevo[0] = vec[0];
        de.añadeMovimiento();
        for(int i = 1; i < vec.length; i++){
            int j = 0;
            while((j < i) && (nuevo[j] <= vec[i])){
                de.añadeComparacion();
                j += 1;
            }
            for(int k = i-1; k >= j; k--){
                nuevo[k+1] = nuevo[k];
                de.añadeMovimiento();
            }
            nuevo[j] = vec[i];
            de.añadeMovimiento();
        }
        de.añadeTiempo((float) (System.currentTimeMillis() - start));
        System.arraycopy(nuevo, 0, vec, 0, vec.length);
    }
    
    public String nombreMetodo (){
        return "Inserción lineal";
    }
}