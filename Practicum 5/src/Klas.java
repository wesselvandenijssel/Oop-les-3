import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> deLeerlingen;

    // Constructor
    public Klas(String kC) {
        this.klasCode = kC;
        this.deLeerlingen = new ArrayList<>();
    }

    // Methods
    public void voegLeerlingToe(Leerling I) {
        deLeerlingen.add(I);
    }

    public void wijzigCijfer(String nm, double nweCijfer) {
        for (Leerling leerling : deLeerlingen) {
            if (leerling.getNaam().equals(nm)) {
                leerling.setCijfer(nweCijfer);
                break;
            }
        }
    }

    public ArrayList<Leerling> getLeerlingen() {
        return deLeerlingen;
    }

    public int aantalLeerlingen() {
        return deLeerlingen.size();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("In klas " + klasCode + " zitten de volgende leerlingen: \n");
        for (Leerling leerling : deLeerlingen) {
            result.append(leerling.toString()).append("\n");
        }
        return result.toString();
    }
}
