package cdi;

//kapsam
//yaşam süresi
//performans + -

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.ConversationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;

//@ApplicationScoped bütün uygulama boyunca çalışıyor
//@RequestScoped 1 istek boyunca çalışır
//@SessionScoped 1 kullanıcı için yaşar o user ancak logout olunca biter
//@Dependent bulunduğu yapı hangi scopeta ise o scope'a göre davranır.
//@ConversationScoped belli istek boyunca yaşar.

public class _00_Scoped {
}
