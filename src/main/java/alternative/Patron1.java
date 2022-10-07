package alternative;

import javax.enterprise.inject.Alternative;

@Alternative//aynı anda sadece 1 proje çalışıyor gerisi inaktif durumda
public class Patron1 implements PatronInterface {


    @Override
    public String surum(String data) {
        return "patron 1" + data;
    }
}
