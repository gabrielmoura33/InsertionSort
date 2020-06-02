package Aplicacao;

public class InsertionSort {
    public void insertSort(int array[])
    {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1; 

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
    void insertionSortD(int array[]) {
        int tamanho = array.length;
        int i, j, tmp;
        for (i = 1; i < tamanho; i++) {
            j = i;
            while (j > 0 && array[j - 1] < array[j]) {
                tmp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = tmp;
                j--;
            }
        }
    }

    public void imprimirArray(int array[])
    {
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");

        System.out.println();
    }

}