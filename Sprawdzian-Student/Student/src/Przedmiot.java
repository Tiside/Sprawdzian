import java.util.Objects;

public class Przedmiot {
    private String przedmiot;
    private int liczbaPonktow;

    public Przedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    public Przedmiot(){

    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public double getLiczbaPonktow() {
        return liczbaPonktow;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    public void setLiczbaPonktow(int liczbaPonktow) {
        this.liczbaPonktow = liczbaPonktow;
    }

    @Override
    public String toString() {
        return "Przedmiot{" +
                "przedmiot='" + przedmiot + '\'' +
                ", liczbaPonktow=" + liczbaPonktow +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Przedmiot przedmiot1 = (Przedmiot) o;
        return Double.compare(liczbaPonktow, przedmiot1.liczbaPonktow) == 0 && Objects.equals(przedmiot, przedmiot1.przedmiot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(przedmiot, liczbaPonktow);
    }
}
