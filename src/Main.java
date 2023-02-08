import person.Person;
import person.PersonGrandeurComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        List<Person> noblePeople = new ArrayList<>(); // создаем и заполняем список благородных людей
        noblePeople.add(new Person("Софья", "Августа Фредерика Анхальт-Цербстская", 67));
        noblePeople.add(new Person("Максимилиана", "Вильгельмина Августа София Мария Гессен-Прирейнская", 55));
        noblePeople.add(new Person("Виктория", "Алиса Елена Луиза Беатриса Гессен-Дармштадская", 46));
        noblePeople.add(new Person("Фридерика", "Луиза Шарлотта Вильгельмина Прусская", 62));
        noblePeople.add(new Person("София", "Мария Доротея Августа Луиза", 15));
        noblePeople.add(new Person("Мария", "София Фредерика Дагмар", 17));

        Predicate<Person> tooYoung = person -> person.getAge() <= 18;
        noblePeople.removeIf(tooYoung);
        // noblePeople.removeIf(person -> person.getAge() <= 18);


        Collections.sort(noblePeople, new PersonGrandeurComparator(5));
        System.out.println(noblePeople);
    }
}
