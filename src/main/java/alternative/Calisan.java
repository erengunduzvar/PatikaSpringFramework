package alternative;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternativedi")
@ApplicationScoped
public class Calisan {

    //aradaki Interface kullanım şekli (IOC)inversion of control'un ornegidir..
    @Inject //DI oluşturmuş olduk
    private PatronInterface patronInterface;


    public String getData(String data)
    {
        return patronInterface.surum(data);
    }
}
