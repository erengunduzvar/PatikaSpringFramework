package qualifier4;



@QualifierMultiple2(FazlaSecenekler.UCUNCU)
public class Patron4 implements PatronInterface {

    @Override
    public String surum(String data) {
        return "QualifierMultiple 3: " + data;
    }
}
