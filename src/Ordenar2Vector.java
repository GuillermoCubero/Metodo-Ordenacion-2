public class Ordenar2Vector implements OrdenarVector {
    
    public void ordena (int[] vector, DatosEstadisticos datosEstadisticos){
        int n, npart, nelement, part, menor,  m;             
        int[] vecs, aux;
        n = vector.length;
        vecs = new int[n];
        datosEstadisticos.estableceComparaciones(0);
        datosEstadisticos.estableceMovimientos(0);
        
        datosEstadisticos.estableceTiempo(System.currentTimeMillis());
        nelement = npart = (int) Math.sqrt(n);        
        aux = new int[npart+1];

        if(nelement*npart < n){
            nelement++;
            if(npart*nelement < n)npart++;
        }
        
        for (part = 1; part <= npart; part++) selpart(vector, n, aux, nelement, part, datosEstadisticos);
        
        for (m = 0; m < n; m++){
            menor = aux[0];
            part = 1;
            for (int e = 1; e <= npart; e++){
                datosEstadisticos.añadeComparacion();
                if (aux[e-1] < menor){
                    menor = aux[e-1];
                    part = e;
                }
            }
            datosEstadisticos.añadeMovimiento();
            vecs[m] = menor;
            selpart(vector, n, aux, nelement, part, datosEstadisticos);
        }
        datosEstadisticos.estableceTiempo((System.currentTimeMillis() - datosEstadisticos.dameTiempo())/1000);
        for (m = 0; m < n; m++)vector[m] = vecs[m];
    }
    private void selpart(int[] vec, int n, int[] aux, int nele, int part, DatosEstadisticos de)
    {     
        int primero, ultimo, pos, menor, elem;
        
        primero = (part-1)*nele;
        ultimo = (nele*part < n)?nele*part-1:n-1;
        menor = vec[primero];
        pos = primero;
        
        for (elem = primero+1; elem <= ultimo; elem++){
            de.añadeComparacion();
            if (vec[elem] < menor){
                menor = vec[elem];
                pos = elem;
            }
        }
        de.añadeMovimiento();
        aux[part-1] = menor;
        vec[pos] =  Integer.MAX_VALUE;
    }
    public String nombreMetodo (){
        return "Selección Cuadrática";
    }
}