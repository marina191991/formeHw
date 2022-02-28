package lesson2;/*1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
  При подаче массива другого размера необходимо бросить исключение lesson2.MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
  Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
  должно быть брошено исключение lesson2.MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения lesson2.MyArraySizeException и
  lesson2.MyArrayDataException и вывести результат расчета.*/

public class Main {
    public static void main(String[] args) {

        String[][] arr1= new String[3][2];

        String[][] arr2 = {{"1", "0", "3", "4"},
                {"9", "0", "6", "0"},
                {"6", "0", "6", "7"},
                {"9", "4", "6", "8"}
        };
        String[][] arr3 = {{"1", "D", "3", "4"},
                {"9", "0", "6", "0"},
                {"6", "0", "6", "7"},
                {"9", "4", "6", "8"}
        };
        System.out.println("Ex.1");
        try {
            MyArray.createArray(arr1);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();


        System.out.println("Ex.2. Correct array");
        try {
            MyArray.createArray(arr2);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.getMessage();
        }
        System.out.println();


        System.out.println("Ex.2. Invalid array");
        try {
            MyArray.createArray(arr3);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());}
        catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
