# PatikaSpringFramework
for Spring Framework IOC,DI,AOP

**Inversion Of Control:**
(IOC) (Kontrolü Tersine Çevirme)
IOC ile DI aynı şey değildir.
IOC kontrolü tersine çevirir.

**Loose Coupleding:**
(Bağlantılı nesneler arasındaki bir nesnenin kaybolması ile ortaya çıkan krizin önüne geçmek)
IOC -> Spring Framework Core tarafından kullanılıyor.

**DI:**
Eğer kodumuzdaki objeleri standart olarak bildiğimiz şekilde yaratırsak bu bir çok sorun doğurabiliyor. Çökme hafıza kontrol sorunları, test sürecinin zorlaşması vs vs o yüzden biz bildiğimiz tanımlama şekli olan "class name = new class();" satırını yazmak yerine yaratılacak objenin üstüne @Inject ekliyoruz.

**AOP(Aspect Oriented Programming):**
-Authorization
-Security
-Logging
-Exception
-Cache Control
