public class ComparaMetodos {
    static int[] sizes =  {1000, 2000, 4000, 8000, 16000, 32000};
    public static void main(String[]args){
        tablaEstadistica(new Ordenar1Vector());
        System.out.println("<-------------------------->");
        tablaEstadistica(new Ordenar2Vector());
    }

    private static void tablaEstadistica(OrdenarVector ordenarVector) {
        System.out.println(ordenarVector.nombreMetodo());
        DatosEstadisticos[] datosEstadisticosVectorInverso = CalculadorEstadisticas.estadisticasOrdenaVectoresInversos(ordenarVector, sizes);
        MediaDatosEstadisticos[] mediaDatosEstadisticosVectorAleatorio = CalculadorEstadisticas.estadisticasOrdenaVectoresAleatorios(ordenarVector, sizes);
        printTable(datosEstadisticosVectorInverso);
        printTable(mediaDatosEstadisticosVectorAleatorio);
    }
    private static void printTable(DatosEstadisticos[] datosEstadisticos) {
        System.out.println("\nVector inversamente ordenado\n");
        System.out.printf("        %-10s %-15s %-10s\n", "Tiempo", "Comparaciones", "Movimientos");
        for (int i = 0; i < sizes.length; i++) {
            System.out.printf("%-8d%-10f %-15d %-10d\n",
                    sizes[i],
                    datosEstadisticos[i].dameTiempo(),
                    datosEstadisticos[i].dameComparaciones(),
                    datosEstadisticos[i].dameMovimientos());
        }
    }

    private static void printTable(MediaDatosEstadisticos[] mediaDatosEstadisticos) {
        System.out.println("\nVector aleatorio\n");
        System.out.printf("        %-10s %-15s %-10s\n", "Tiempo", "Comparaciones", "Movimientos");
        for (int i = 0; i < sizes.length; i++) {
            System.out.printf("%-8d%-10f %-15f %-10f\n",
                    sizes[i],
                    mediaDatosEstadisticos[i].dameMediaTiempos(),
                    mediaDatosEstadisticos[i].dameMediaComparaciones(),
                    mediaDatosEstadisticos[i].dameMediaMovimientos());
        }
    }
}