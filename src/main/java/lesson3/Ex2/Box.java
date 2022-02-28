package lesson3.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {
        List<T> arrayList=new ArrayList<>();
     void addFruit (T fruit) {
           arrayList.add(fruit);
     }
     float getWeightF () {
         float w = 0;
         for (T a: arrayList)
             w += a.getWeight();
         return w;
       //return  (arrayList.size()* fruit.getWeight());
        }


    public boolean compare(Box box) {
        return Math.abs( this.getWeightF() - box.getWeightF())< 0.0001;}

   public void moveFruit(Box<T> box) {
         this.arrayList.addAll( box.arrayList);
         this.arrayList.clear();



     }



}
