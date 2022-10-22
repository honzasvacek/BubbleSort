public class Main {
    public static void main(String[] args) {
        int arr[] = {9,5,8,1,7,5,3,8,4,9,1,2,7};
        arr = bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
    public static int[] bubbleSort(int arr[]){
        int length = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < length; j++) {
                if (arr[j] > arr[j+1]){
                    int x = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = x;
                }

            }
            length--;
        }


        return arr;
    }
}