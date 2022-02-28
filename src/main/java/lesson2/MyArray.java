package lesson2;

public class MyArray {
    static private final int i=4;

    static void createArray(String[][] myArray) throws MyArraySizeException, MyArrayDataException {

        if ((myArray.length!=i) || (myArray[0].length!=i)) {
            throw new MyArraySizeException("Размер массива должен быть 4х4");
    } sumArray(myArray);
    }
    static void sumArray(String[][] myArray) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {

                try {
                    int k = Integer.parseInt(myArray[i][j]);
                    sum += k;
                   } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Значение в ячейке " + "[" + i + "]" + "[" + j + "]" + " не является числовым символом");
                }
            }
        }
            System.out.println("Sum="+sum);
    }

}
