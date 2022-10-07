package qualifier4;



@QualifierMultiple2(FazlaSecenekler.IKINCI)
public class Patron3 implements PatronInterface {

    @Override
    public String surum(String data) {
        return "QualifierMultiple 2: " + data;
    }
}
