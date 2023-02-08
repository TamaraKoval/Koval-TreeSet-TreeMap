import person.Person;
import person.PersonGrandeurComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> noblePeople = new ArrayList<>(); // создаем и заполняем список благородных людей
        noblePeople.add(new Person("Софья", "Августа Фредерика Анхальт-Цербстская", 67));
        noblePeople.add(new Person("Максимилиана", "Вильгельмина Августа София Мария Гессен-Прирейнская", 55));
        noblePeople.add(new Person("Виктория", "Алиса Елена Луиза Беатриса Гессен-Дармштадская", 46));
        noblePeople.add (new Person("Фридерика", "Луиза Шарлотта Вильгельмина Прусская", 62));

        Collections.sort(noblePeople, new PersonGrandeurComparator(5)); // сортируем список, значимое количество - 5
        System.out.println(noblePeople); // все работает корректно

        Collections.sort(noblePeople, new PersonGrandeurComparator(3)); // сортируем список, значимое количество - 3
        System.out.println(noblePeople); // все работает корректно
    }
}
