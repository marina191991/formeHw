package lesson3.Ex2;
/*


2.	Задача:
a.	Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
b.	Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
c.	Для хранения фруктов внутри коробки можно использовать ArrayList (ArrayList обсудим на следующем уроке);
d.	Сделать метод getWeight(), который высчитывает вес коробки,
зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
e.	Внутри класса Box сделать метод compare(),
 который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра.
 true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
f.	Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
g.	Не забываем про метод добавления фрукта в коробку.
*/

public class Main {
    public static void main(String[] args) {

        Box<Apple> boxApple = new Box <>();
        Box<Apple> boxApple1 = new Box <>();


        for (int i=0; i<3;i++) {

            boxApple.addFruit(new Apple());
            boxApple1.addFruit(new Apple());
        }


        System.out.println(boxApple.getWeightF());
        System.out.println(boxApple.getWeightF());//получить вес


        Box<Orange> boxOrange = new Box<>();
        Box<Orange> boxOrange1 = new Box<>();
        for (int i=0; i<3;i++) {
            boxOrange.addFruit(new Orange());
            boxOrange1.addFruit(new Orange());
        }

        System.out.println(boxApple1.compare(boxApple));
        System.out.println(boxOrange .compare(boxApple));
       boxApple.moveFruit(boxApple1);
        System.out.println(boxApple1.getWeightF());
        System.out.println(boxApple.getWeightF());

    }
}
