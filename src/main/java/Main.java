public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        // добавляем номер телефона для имени
        phoneBook.addPhone("Виктория", "+79261234567");
        phoneBook.addPhone("Борис", "+79269876543");
        phoneBook.addPhone("Владислав", "+79161234567");
        phoneBook.addPhone("Виктория", "+79051234567");
        phoneBook.addPhone("Алексей", "+79057654321");
        phoneBook.addPhone("Злата", "+79167654321");
        phoneBook.addPhone("Владислав", "+79161232567");
        phoneBook.addPhone("Борис", "+79269216543");
        phoneBook.addPhone("Владислав", "+79162235167");

        // удаляем конкретный номер у имени
        phoneBook.removePhone("Виктория", "+79261234567");

        // удаляем контакт из телефонной книги
        phoneBook.removeContact("Алексей");

        // выводим отсортированную телефонную книгу
        phoneBook.printSortedPhoneBook();
    }
}
