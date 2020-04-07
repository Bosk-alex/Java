package java_two.sagid_irrkuev.hw3.phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    Map<Human, String> book = new HashMap<>();

    public void add(Human human, String phoneNumber) {
        book.put(human, phoneNumber);
    }

    public List<String> get(String name) {
        List<String> phoneList = new ArrayList<>();
        for (Map.Entry<Human, String> entry : book.entrySet()) {
            if (entry.getKey().getSurname().equals(name)) {
                phoneList.add(entry.getValue());
            }
        }
        return phoneList;
    }

}
