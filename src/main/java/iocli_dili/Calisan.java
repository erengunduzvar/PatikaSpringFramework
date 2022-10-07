package iocli_dili;


import lombok.ToString;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "ioclicdliCalisan")
@ApplicationScoped
public class Calisan {

    //aradaki Interface kullanım şekli (IOC)inversion of control'un ornegidir..
    @Inject //DI oluşturmuş olduk
    private PatronInterface patronInterface;

    //no args constructor
    public Calisan() {
        //patronInterface = new Patron();
    }

    public String getData(String data)
    {
        return patronInterface.surum("17");
    }
}
