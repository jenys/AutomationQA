import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Cat> catsList = new ArrayList<>();
        catsList.add(new Cat("Мурзик", "рыжий", 4));
        catsList.add(new Cat("Бегемот", "чёрный", 5));
        catsList.add(new Cat ("Клоп", "рыжий", 2));

        ArrayList<Dog> dogsList = new ArrayList<>();
        dogsList.add(new Dog("Рыжик", "рыжий", 6));
        dogsList.add(new Dog("Мухтар", "белый", 9));
        dogsList.add(new Dog("Аристотель", "серобурмалиновый", 2));
        dogsList.add(new Dog("Хатико", "рыжий", 1));

        ArrayList<Animals> shelterList = new ArrayList<>();
        shelterList.addAll(dogsList);
        shelterList.addAll(catsList);

        //Взять из приюта случайное животное
        int random = (int) (Math.random() * shelterList.size());
        System.out.println("Мы взяли из приюта случайное животное по имени " + shelterList.get(random).toString() + "\n");

        //«Мама, хочу рыжую собачку!»
        ListIterator itr = shelterList.listIterator();
        System.out.println("Вот такие рыжие собаки у нас есть:\n");

        while (itr.hasNext()) {
            Animals animal = (Animals) itr.next();
            if (animal.color == "рыжий" && animal.age > 4) {
                System.out.println(animal.name + ", окрас " + animal.color + ", возраст " + animal.age + " лет."); }

            if (animal.color == "рыжий" && animal.age < 4 && animal.age > 1) {
                System.out.println(animal.name + ", окрас " + animal.color + ", возраст " + animal.age + " года."); }

            if (animal.color == "рыжий" && animal.age == 1) {
                System.out.println(animal.name + ", окрас " + animal.color + ", возраст " + animal.age + " год."); }
        }
    }
}
