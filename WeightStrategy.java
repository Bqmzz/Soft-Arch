package behavioral;

import java.util.Comparator;
import java.util.List;

public class WeightStrategy implements SortStrategy {
    @Override
    public void customSort(List<Person> people) {
        // YOU ARE NOT ALLOWED TO MODIFY THE CODE ABOVE THIS COMMENT !!
        // YOU MAY ADD UP TO 5 LINES OF CODE BELOW THIS COMMENT !! A LINE OF CODE MAY CONTAIN UP TO ONE SEMI-COLON !!
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2){
                return p1.getWeight().compareTo(p2.getWeight());
            }
        });
    }
}