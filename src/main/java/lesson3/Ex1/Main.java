package lesson3.Ex1;

import java.util.Arrays;

//1.	Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
public class Main  {


   public static <T extends Number> void swap(T[] arr, int x, int y) {
     T s=arr[x];
     arr[x]=arr[y];
     arr[y]=s;
   }


    public static void main(String[] args) {
Integer[] array= {1,2,3,4,5};
        System.out.println(Arrays.deepToString(array));
swap(array,0,1);
        System.out.println(Arrays.deepToString(array));


    }
}
