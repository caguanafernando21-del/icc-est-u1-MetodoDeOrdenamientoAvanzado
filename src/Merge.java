public class Merge {

    // Metodo principal de Merge Sort
    public static void mergeSort(int[] arreglo, int izquierda, int derecha) {

        // Verifica que haya mas de un elemento
        if (izquierda < derecha) {

            // Obtiene el punto medio del arreglo
            int medio = (izquierda + derecha) / 2;

            // Divide la parte izquierda
            mergeSort(arreglo, izquierda, medio);

            // Divide la parte derecha
            mergeSort(arreglo, medio + 1, derecha);

            // Une las dos partes ordenadas
            merge(arreglo, izquierda, medio, derecha);
        }
    }

    // Metodo para unir y ordenar las divisiones
    public static void merge(int[] arreglo, int izquierda, int medio, int derecha) {

        // Tamaño de los arreglos temporales
        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;

        // Arreglos temporales
        int[] izquierdaArray = new int[n1];
        int[] derechaArray = new int[n2];

        // Copia datos al arreglo izquierdo
        for (int i = 0; i < n1; i++) {
            izquierdaArray[i] = arreglo[izquierda + i];
        }

        // Copia datos al arreglo derecho
        for (int j = 0; j < n2; j++) {
            derechaArray[j] = arreglo[medio + 1 + j];
        }

        // Variables para recorrer arreglos
        int i = 0;
        int j = 0;

        // Posicion inicial del arreglo original
        int k = izquierda;

        // Compara elementos y ordena
        while (i < n1 && j < n2) {

            if (izquierdaArray[i] <= derechaArray[j]) {

                arreglo[k] = izquierdaArray[i];
                i++;

            } else {

                arreglo[k] = derechaArray[j];
                j++;
            }

            k++;
        }

        // Copia elementos restantes del arreglo izquierdo
        while (i < n1) {

            arreglo[k] = izquierdaArray[i];
            i++;
            k++;
        }

        // Copia elementos restantes del arreglo derecho
        while (j < n2) {

            arreglo[k] = derechaArray[j];
            j++;
            k++;
        }
    }


}

