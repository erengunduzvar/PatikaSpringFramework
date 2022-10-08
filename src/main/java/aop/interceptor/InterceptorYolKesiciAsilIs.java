package aop.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@InetceptorYolKesici
public class InterceptorYolKesiciAsilIs {

    @AroundInvoke public Object loglama(InvocationContext context)
    {
        System.out.println("İlk Hali: "+context.getMethod().getName());

        //kullanici giris yapmis mi
        boolean isLogin = false; //true yaparsam giris yap erroruna girer
        Object Iscontinue = null;
        if(isLogin){
            System.out.println("Sisteme gir !");
            return null;
        }
        else {
            try {
                Iscontinue = context.proceed(); //devam etmesini sagla
                System.out.println("Sonraki hali "+Iscontinue);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            return Iscontinue;
        }

    }

}
