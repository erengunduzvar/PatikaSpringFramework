package qualifier;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifierCdi")
@ApplicationScoped
public class Calisan {

//    @Inject //Defaultta çalışacak kod
//    private PatronInterface patronInterface;

    @Inject
    @QualifierMultiple//DI oluşturmuş olduk
    private PatronInterface patronInterface;


    public String getData(String data)
    {
        return patronInterface.surum(data);
    }
}
