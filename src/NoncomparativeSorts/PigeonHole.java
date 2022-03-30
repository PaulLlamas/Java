package NoncomparativeSorts;

import java.util.ArrayList;
import java.util.Arrays;

public class PigeonHole {
    public static final int OLDEST = 130;
    public static void runPigeonHoleSort(Person[] arr){
        ArrayList<Person>[] age = new ArrayList[OLDEST];
        for (int i = 0; i < age.length; i++) {
            age[i] = new ArrayList<>();
        }
        for (Person person: arr) {
            age[person.getAge()].add(person);
        }
        int count = 0;
        for(int indexArray = 0; indexArray < age.length; indexArray++){
            for(int indexList = 0; indexList < age[indexArray].size(); indexList++){
                arr[count] = age[indexArray].get(indexList);
                count++;
            }
        }
    }

    public static void main(String[] args) {
        Person[] test = {new Person("Bob", 50),
                new Person("Jill", 52),
                new Person("Tom", 50),
                new Person("Suzy", 22),
                new Person("Katie", 2)};
        System.out.println(Arrays.toString(test));
        runPigeonHoleSort(test);
        System.out.println(Arrays.toString(test));
    }
}
