package qualifier;


import javax.enterprise.inject.Default;

@Default
public class Patron1 implements PatronInterface {

//@Alternative: aynı anda sadece 1 proje çalışıyor gerisi inaktif durumda
//@@ualifier: aynı anda birden fazla proje çalışıyor ancak default olarak çalışacak projeyi seçebiliyoruz

    @Override
    public String surum(String data) {
        return "Default Data:" + data;
    }
}
