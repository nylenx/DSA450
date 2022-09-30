class arrayOperation{
    public static int[] reverse(int[] arr) {
        int temp;
        for(int i=0;i<Math.round(arr.length/2.0);i++){
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }
}

public class ARR1 {
    public static void main(String args[]) {
        int[] array1 = new int[]{1,2,3,4,5};

        int[] array2 = arrayOperation.reverse(array1);

        int count=0;
        while(count<array2.length){
            System.out.println(array2[count]);
            count++;
        }
    }
}
