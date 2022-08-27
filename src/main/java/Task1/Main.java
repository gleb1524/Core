package Task1;

public class Main {

    private static long result;

    public static void main(String[] args) {
       int[][] myArray = fillArray();
        System.out.println("Max value in array: " + getMaxValue(myArray));
        System.out.println("Min value in array: " + getMinValue(myArray));
        System.out.println("Average  value in array: " + getAvgValue(myArray));
    }

    private static int[][] fillArray() {

        int arrayLength = 10;
        int random = 100;

        int[][] array = new int[arrayLength][arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength; j++) {
                array[i][j] = getRandomVal(random);
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        return array;
    }

    private static int getRandomVal(int a) {

        if(a < 100){
            a += 100;
        }
        result += (result + (a%2) + a*a) >>> 1;
        if(result > a){
            result -= (a - (result%a))/ 2;
            return (int) result;
        }else{
            result += (a - (result%a))/2;
        }
        return (int) result;
    }

    private static int getMaxValue(int[][] arr){
        int max = 0;
        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                if (max < ints[j]) {
                    max = ints[j];
                }
            }
        }
        return max;
    }

    private static int getMinValue(int[][] arr){
        int min = 0;
        for (int[] ints : arr) {
            for (int i = 0; i < arr.length; i++) {
                if(min > ints[i]){
                    min = ints[i];
                }
            }
        }
        return min;
    }

    private static int getAvgValue(int[][] arr){
        int avg = 0;
        for (int[] ints : arr) {
            for (int i = 0; i < arr.length; i++) {
                avg += ints[i];
            }
        }
        return avg / (arr.length * arr.length);
    }
}
