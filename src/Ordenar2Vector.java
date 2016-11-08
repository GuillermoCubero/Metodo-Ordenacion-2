public class Ordenar2Vector implements OrdenarVector {
    public void ordena (int[] vec, DatosEstadisticos de){
        long start = System.currentTimeMillis();
        
        int[] nuevo = new int[vec.length];
        int part;
        
        int npartes = (int) Math.sqrt(vec.length);
        int[] aux = new int[npartes];
        int nelementos = npartes;
        
        if(nelementos*npartes < vec.length){
            nelementos += 1;
            if(npartes*nelementos < vec.length){
                npartes += 1;
            }
        }
        
        for(part = 1; part < npartes; part++){
            selpart(vec, vec.length, aux, nelementos, part); 
        }
        for(int m = 0; m < vec.length; m++){
            int menor = aux[0];
            part = 1;
            for(int e = 1; e < npartes; e++){
                if(aux[e] < menor){
                    menor = aux[e];
                    part = e;
                }
            }
            nuevo[m] = menor;
            selpart(vec, vec.length, aux, nelementos, part);
        }
        de.añadeTiempo((float) (System.currentTimeMillis() - start));
        System.arraycopy(nuevo, 0, vec, 0, vec.length);
    }
    
    public void selpart(int[] vec, int length, int[] aux, int nelementos, int part){
        int INT_MAX = 2147483647;
        int primero = (part-1)*nelementos+1;
        int ultimo;
        if(nelementos*part < length){
            ultimo = nelementos*part;
        }else{
            ultimo = length;
        }
        int pos = primero;
        int menor = vec[primero];
        for(int elem = primero+1; elem < ultimo; elem++){
            if(vec[elem] < menor){
                menor = vec[elem];
                pos = elem;
            }
        }
        aux[part] = menor;
        vec[pos] = INT_MAX;
    }
    
    public String nombreMetodo (){
        return "Selección Cuadrática";
    }
}