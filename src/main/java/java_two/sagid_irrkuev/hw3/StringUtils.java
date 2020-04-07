package java_two.sagid_irrkuev.hw3;

import java.util.*;

class StringUtils {
    static Map<String, Integer> checkRepeat(String[] strings) {
        Set<String> stringSet = new HashSet<>(Arrays.asList(strings));
        Map<String, Integer> words = new HashMap<>(stringSet.size());

        for (String word : stringSet) {
            int counter = 0;
            for (String string : strings) {
                if (word.equals(string)) counter++;
            }
            words.put(word, counter);
        }

        return words;
    }
}
