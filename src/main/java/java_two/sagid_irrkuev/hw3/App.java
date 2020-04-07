package java_two.sagid_irrkuev.hw3;

import java_two.sagid_irrkuev.hw3.phonebook.Human;
import java_two.sagid_irrkuev.hw3.phonebook.PhoneBook;

public class App {
    public static void main(String[] args) {
        String[] strings = {"1", "2", "3", "4", "5", "5", "4", "3", "2", "1", "1", "2", "2", "4", "4", "3", "2", "1"};
        System.out.println(StringUtils.checkRepeat(strings));

        PhoneBook myBook = new PhoneBook();
        myBook.add(new Human("Bagrov", "Oleg"), "9125555555");
        myBook.add(new Human("Bagrov", "Vlad"), "9120000000");
        myBook.add(new Human("Bagrov", "Nick"), "9121111111");
        myBook.add(new Human("Kozlov", "Oleg"), "9122222222");
        myBook.add(new Human("Kozlov", "Mike"), "9123333333");
        myBook.add(new Human("Nikulin", "Oleg"), "9124444444");
        myBook.add(new Human("Markov", "Oleg"), "9126666666");
        myBook.add(new Human("Gilin", "Oleg"), "9127777777");
        myBook.add(new Human("Nagaev", "Oleg"), "9128888888");
        myBook.add(new Human("Covalev", "Oleg"), "9129999999");

        System.out.println(myBook.get("Ivanov"));
        System.out.println(myBook.get("Bagrov"));
        System.out.println(myBook.get("Kozlov"));
        System.out.println(myBook.get("Gilin"));
    }
}
