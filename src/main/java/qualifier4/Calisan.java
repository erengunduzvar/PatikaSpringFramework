package qualifier4;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifier4Cdi")
@ApplicationScoped
public class Calisan {

//    @Inject //Defaultta çalışacak kod
//    private PatronInterface patronInterface;

    @Inject
    @QualifierMultiple2(FazlaSecenekler.BIRINCI)//DI oluşturmuş olduk //enum ile degeri secme
    private PatronInterface patronInterface;


    public String getData(String data)
    {
        return patronInterface.surum(data);
    }
}
