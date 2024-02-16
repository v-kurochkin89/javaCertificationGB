import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
    // словарь для имен и номеров
    private HashMap<String, Set<String>> phoneBook = new HashMap<>();

    // добавление нового номера телефона к имени
    public void addPhone(String name, String phone) {
        phoneBook.computeIfAbsent(name, k -> new HashSet<>()).add(phone);
    }

    // удаление номера телефона у конкретного имени
    public void removePhone(String name, String phone) {
        if (phoneBook.containsKey(name)) {
            Set<String> phones = phoneBook.get(name);
            phones.remove(phone);
            if (phones.isEmpty()) {
                phoneBook.remove(name);
            }
        }
    }

    // удаление контакта (имени и всех его номеров)
    public void removeContact(String name) {
        phoneBook.remove(name);
    }

    // вывод телефонной книги с сортировкой по количеству номеров
    public void printSortedPhoneBook() {
        phoneBook.entrySet().stream()
                .sorted((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
