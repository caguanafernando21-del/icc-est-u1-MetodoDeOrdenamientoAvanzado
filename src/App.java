


public class App {
    public static void main(String[] args) {

        // Arreglo inicial
        int[] numeros = {8, 3, 1, 7, 0, 10, 2};
        System.out.println("arreglo orignal");
        for (int num : numeros) {
            System.out.print(num + " ");
        }




        // Llamada a Merge Sort
        Merge.mergeSort(numeros, 0, numeros.length - 1);

        // Mostrar arreglo ordenado
        System.out.println("Arreglo ordenado:");

        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}

