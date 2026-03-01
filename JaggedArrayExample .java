/*2D Jagged Array in Java

A 2D jagged array in Java is an array of arrays where each row can have a different number of columns. Unlike a regular 2D array (matrix), the inner arrays are not required to be of the same length.*/
class JaggedArrayExample {
    public static void main(String[] args) {

        int[][] arr = new int[3][];

        arr[0] = new int[]{1, 2};
        arr[1] = new int[]{3, 4, 5, 6};
        arr[2] = new int[]{7, 8, 9};

        // Printing jagged array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}