package person;

import java.util.Comparator;

public class PersonGrandeurComparator implements Comparator<Person> {
    private int significantAmount;

    public PersonGrandeurComparator(int significantAmount) {
        this.significantAmount = significantAmount;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int o1SurnameLength = o1.getSurname().split("-| ").length;
        int o1SignificantLength = o1SurnameLength < significantAmount ? o1SurnameLength : significantAmount;

        int o2SurnameLength = o2.getSurname().split("-| ").length;
        int o2SignificantLength = o2SurnameLength < significantAmount ? o2SurnameLength : significantAmount;

        if (o1SignificantLength < o2SignificantLength) {
            return 1;
        } else if (o1SignificantLength > o2SignificantLength) {
            return -1;
        } else {
            return Integer.compare(o2.getAge(), o1.getAge());
        }
    }
}
