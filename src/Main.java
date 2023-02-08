import person.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> noblePeople = new ArrayList<>(); // создаем и заполняем список благородных людей
        noblePeople.add(new Person("Софья", "Августа Фредерика Анхальт-Цербстская", 67));
        noblePeople.add(new Person("Максимилиана", "Вильгельмина Августа София Мария Гессен-Прирейнская", 55));
        noblePeople.add(new Person("Виктория", "Алиса Елена Луиза Беатриса Гессен-Дармштадская", 46));
        noblePeople.add(new Person("Фридерика", "Луиза Шарлотта Вильгельмина Прусская", 62));

        Comparator<Person> comparator = (Person o1, Person o2) -> {
            int o1SurnameLength = o1.getSurname().split("-| ").length;
            int o1SignificantLength = Math.min(o1SurnameLength, 5);

            int o2SurnameLength = o2.getSurname().split("-| ").length;
            int o2SignificantLength = Math.min(o2SurnameLength, 5);

            if (o1SignificantLength < o2SignificantLength) {
                return 1;
            } else if (o1SignificantLength > o2SignificantLength) {
                return -1;
            } else {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
        };

        Collections.sort(noblePeople, comparator); // сортируем список, значимое количество - 5
        System.out.println(noblePeople); // все работает корректно
    }
}
