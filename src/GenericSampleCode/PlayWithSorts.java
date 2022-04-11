package GenericSampleCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlayWithSorts {
    public static void main(String[] args) {
        String[] temp = {"one", "hello", "a"};
        List<String> list = new ArrayList<>(Arrays.asList(temp));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, (String first, String second) ->
                Integer.compare(first.length(), second.length()));
        System.out.println(list);

    }
}
