import java.util.Locale;
import java.util.Scanner;

/**
 * 1. Эки класс тузунуз
 * Apartment (title, price, address)
 * Квартира( название, цена, адрес)
 * Student ( fullName, phoneNumber, address, bankAccount)
 * Студент (ФИО, номер телефона,  адрес, банковский счет)
 * 2.Apartment классына эки обьект, Student классына 6 обьект тузуп, алардын полелерин толтурунуз.
 * (бир квартиранын жана 3 студенттин аддрестери окшош болсун , ' экинчи квартиранын жана  калган уч студенттердин адрестери окшош болсун)
 * 3.Студентерди озунчо массивге, квартираларды озунчо массивге салыныз.
 * 4.Консольдон квартиранын названиясын берсениз, ошол квартираны жана анда жашаган студенттерди консольго чыгара турган  метод тузунуз
 * 5.Квартира классынын ичинде бир payPerMonth(); деген методу болсун, ал метод ар бир студенке канча сомдон кварплата беруусун чыгарсын.
 * 6.Студент классынын ичинде бир liveIn(); деген метод болсун, ал метод студенттин капчыгына жараша ал квартирада канча ай жашай алуусун чыгарсын.
 * 7.Студен классында дагы бир changeInfo(); деген метод болсун ал метод студенттин данныйларын озгортуп берсин
 */

public class Main {
    public static void main(String[] args) {

        Apartment apartment1 = new Apartment();
        apartment1.setTitle("Ihlas");
        apartment1.setAddress("Bishkek");
        apartment1.setPrice(15000);

        Apartment apartment2 = new Apartment();
        apartment2.setTitle("Peaksoft");
        apartment2.setAddress("Osh");
        apartment2.setPrice(12700);

        Student student1 = new Student();
        student1.setName("Altynbek");
        student1.setPhoneNumber(777111111);
        student1.setAddress("Osh");
        student1.setBankAccount(7000);

        Student student2 = new Student();
        student2.setName("Bilal");
        student2.setPhoneNumber(505505050);
        student2.setAddress("Osh");
        student2.setBankAccount(6800);

        Student student3 = new Student();
        student3.setName("Baytik");
        student3.setPhoneNumber(990999999);
        student3.setAddress("Osh");
        student3.setBankAccount(7500);

        Student student4 = new Student();
        student4.setName("Kanykei");
        student4.setPhoneNumber(773737373);
        student4.setAddress("Bishkek");
        student4.setBankAccount(7200);

        Student student5 = new Student();
        student5.setName("Aidana");
        student5.setPhoneNumber(220202020);
        student5.setAddress("Bishkek");
        student5.setBankAccount(7300);

        Student student6 = new Student();
        student6.setName("Saltanat");
        student6.setPhoneNumber(555010101);
        student6.setAddress("Bishkek");
        student6.setBankAccount(8000);

        Apartment[] apartments = {apartment1, apartment2};

        for (Apartment apartment : apartments) {
            apartment.showInfo();
        }

        Student[] students = {student1, student2, student3, student4, student5, student6};

        for (Student student : students) {
            student.showIfo();
        }
        System.out.println("___________________________________________");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write title: ");
        String title = scanner.nextLine();
        apartmentAndTenant(title, apartments, students);

        System.out.println("___________________________");

//        double payPerMonth = apartment1.payPerMonth(3);
//
//        apartment1.liveIn(student6, payPerMonth );


    }
    public static void apartmentAndTenant(String title, Apartment[] apartments, Student[] students){
        for (Apartment apartment : apartments) {
            boolean trueOrFalse = title.toUpperCase().equals(apartment.getTitle().toUpperCase());
            if (trueOrFalse){
                apartment.showInfo();

                for (Student student : students) {
                    if (apartment.getAddress().toLowerCase().equals(student.getAddress().toLowerCase(Locale.ROOT))){
                        student.showIfo();
                    }
                }
            }
        }
    }

}