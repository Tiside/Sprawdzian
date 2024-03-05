// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Przedmioty
        Przedmiot matematyka = new Przedmiot("matematyka");
        Przedmiot biologia = new Przedmiot("biologia");
        //Studenty
        Student student = new Student("Stanislav", "Bazhan", 1, 2024);
        Student student1 = new Student("Adam", "Karczewski", 2, 2024);
        //Dodawanie przedmiotu( Dziala)
        student.dodajPrzedmiot(matematyka);
        student1.dodajPrzedmiot(biologia);
        //Wypisanie studentow
        System.out.println(student1);
        System.out.println(student);


    }
}