class arrayOperation {
    public static int[] maxMinElement(int[] arr) {
        int[] maxMin = new int[] { -1, -1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxMin[0]) {
                maxMin[0] = arr[i];
            }
            if (maxMin[1] == -1) {
                maxMin[1] = arr[i];
            }
            if (arr[i] > -1 && arr[i] < maxMin[1]) {
                maxMin[1] = arr[i];
            }

        }
        return maxMin;
    }
}

public class ARR2 {
    public static void main(String args[]) {
        int[] array1 = new int[] { 1, 2, 3, 4, 5 };
        int[] array2 = arrayOperation.maxMinElement(array1);

        if (array2[0] == -1) {
            System.out.println("No positive Element found in Array");
        } else {
            System.out.println("Maximum Element is: " + array2[0] + ", Minimun Element is: " + array2[1]);

        }
    }
}
