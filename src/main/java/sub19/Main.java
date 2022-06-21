package sub19;

class ArrayCalculation {

    int[] arr = { 0, 1, 2, 3, 4 };

    public int divide(int denominatorIndex, int numeratorIndex)
            throws ArithmeticException, ArrayIndexOutOfBoundsException {       // 분모, 분자 인덱스
        return arr[denominatorIndex] / arr[numeratorIndex];
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayCalculation arrayCalculation = new ArrayCalculation();

            System.out.println("2 / 1 = " + arrayCalculation.divide(2, 1));
        try {
            System.out.println("1 / 0 = " + arrayCalculation.divide(1, 0)); // java.lang.ArithmeticException: "/ by zero"
        } catch (ArithmeticException a) {
            a.printStackTrace();
        }

        try{
            System.out.println("Try to divide using out of index element = "
                    + arrayCalculation.divide(5, 0)); // java.lang.ArrayIndexOutOfBoundsException: 5
        } catch (ArrayIndexOutOfBoundsException b){
            b.printStackTrace();
        }
    }
}