
# Java Optional Sınıfı Kullanımı
Bu proje, Java'da Optional sınıfının kullanımını göstermektedir. Optional, Java 8'de tanıtılan bir sınıftır ve null kontrolü yapmadan nesneler üzerinde işlem yapmayı sağlar.

## Proje İçeriği
- OptionalClass2.java: Optional sınıfının kullanımını gösteren bir örnek. Araba ve Motor sınıfları kullanılarak bir Araba nesnesi oluşturulurken, Motor nesnesinin null olup olmadığı kontrol edilir.
- Motor.java: Araba sınıfında kullanılan Motor nesnesini temsil eden sınıf.
- Araba.java: Motor sınıfını içeren Araba nesnesini temsil eden sınıf.

## OptionalClass2.java
Bu sınıf, Optional sınıfının kullanımını göstermektedir. İlgili kod parçacıkları şunları içerir:

- Bir Motor nesnesi oluşturulur.
- Bu Motor nesnesi, Araba nesnesinin bir bileşeni olarak kullanılırken, Optional.ofNullable() yöntemi ile null kontrolü yapılır. Null değer alındığında bir istisna fırlatılır.
- Araba nesnesi oluşturulur ve ekrana yazdırılır.
  ## Motor.java ve Araba.java
Bu sınıflar, Motor ve Araba nesnelerini temsil eder. Araba sınıfında, Motor nesnesinin Optional olarak kullanımı gösterilmektedir.

## Nasıl Kullanılır?
- Herhangi bir Java uyumlu IDE'de (IntelliJ IDEA, Eclipse) projeyi açın.
- İlgilendiğiniz sınıf dosyalarını çalıştırarak çıktıları gözlemleyin.

![image](https://github.com/esmanur-karatas/NewWithJava8/assets/83882274/ceee67e3-4543-4fcb-a6af-363c75ea8188)



![image](https://github.com/esmanur-karatas/NewWithJava8/assets/83882274/2474eb3c-be13-4364-b932-7ebedaa00314)
