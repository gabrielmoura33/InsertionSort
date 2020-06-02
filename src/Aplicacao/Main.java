package Aplicacao;

public class Main {

    public static void main(String[] args) {
        int[] array2000, array4000, array8000, array16000, array32000, array64000, array128000;
        var airbNbData = new AirbNBData("dados_airbnb.txt");
        var insertionSort = new InsertionSort();

        array2000 = airbNbData.getAll(2000);
        // 2seg 910 ms; 3seg 348ms; 2seg 854ms; 3seg 50ms; 3seg 52ms
//        insertionSort.insertSort(array2000);

        insertionSort.insertionSortD(array2000);
        insertionSort.imprimirArray(array2000);

//        3seg 50 ms; 2seg 997ms ;  2seg 715ms; 2 seg 929ms ; 3seg 37ms
//        array4000 = airbNbData.getAll(4000);
//        insertionSort.insertSort(array4000);
//        insertionSort.imprimirArray(array4000);

//        2 seg 977 ms; 2seg 981ms; 2seg 890ms; 3seg 90ms; 3 seg 75ms
//        array8000 = airbNbData.getAll(8000);
//        insertionSort.insertSort(array8000);
//        insertionSort.imprimirArray(array8000);

        // 3 seg 43 ms; 2seg 937ms ; 2seg 929ms; 2seg 849ms; 2seg 964ms
//        array16000 = airbNbData.getAll(16000);
//        insertionSort.insertSort(array16000);
//        insertionSort.imprimirArray(array16000);

//        3seg 91ms; 2seg 829ms; 2 seg 932ms; 2seg 937ms; 2seg 889ms
//          array32000 = airbNbData.getAll(32000);
//          insertionSort.insertSort(array32000);
//          insertionSort.imprimirArray(array32000);

        // 2s 878 ms; 3seg 116ms; 3seg 21ms; 3seg 29ms; 2seg 804ms
//          array64000 = airbNbData.getAll(64000);
//          insertionSort.insertSort(array64000);
//          insertionSort.imprimirArray(array64000);

//         2s 887ms; 3s 40ms; 2seg 929ms; 2seg 883ms; 3seg 10ms
//          array128000 = airbNbData.getAll(128000);
//          insertionSort.insertSort(array128000);
//          insertionSort.imprimirArray(array128000);

    }
}
