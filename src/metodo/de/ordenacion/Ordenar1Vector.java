public class Ordenar1Vector implements OrdenarVector {
    public void ordena (int[] vec, DatosEstadisticos de){
        int[] nuevo = new int[vec.length];
        nuevo[0] = vec[0];
        for(int i = 1; i < vec.length; i++){
            int j = 1;
            while((j < i) && (nuevo[j] <= vec[i])){
                j += 1;
            }
            for(int k = i-1; k < j; k++){
                nuevo[k+1] = nuevo[k];
            }
            nuevo[j] = vec[i];
        }
        System.arraycopy(nuevo, 0, vec, 0, vec.length);
    }
    
    public String nombreMetodo (){
        return "Inserción lineal";
    }
}