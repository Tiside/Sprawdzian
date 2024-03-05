import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private String imie;
    private String nazwisko;
    private int index;
    private int rokStuduiow;
    ArrayList<Przedmiot> listaprzedmiotow = new ArrayList<>();


    public Student(String imie, String nazwisko, int index, int rokStuduiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.index = index;
        this.rokStuduiow = rokStuduiow;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double getRokStuduiow() {
        return rokStuduiow;
    }

    public ArrayList<Przedmiot> getListaprzedmiotow() {
        return listaprzedmiotow;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", index=" + index +
                ", rokStuduiow=" + rokStuduiow +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(rokStuduiow, student.rokStuduiow) == 0 && Objects.equals(imie, student.imie) && Objects.equals(nazwisko, student.nazwisko) && Objects.equals(listaprzedmiotow, student.listaprzedmiotow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, rokStuduiow, listaprzedmiotow);
    }

    public void dodajPrzedmiot(Przedmiot przedmiot){
        listaprzedmiotow.add(przedmiot);

    }
}
