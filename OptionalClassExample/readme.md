# Java Optional Sınıfı Kullanımı
Bu proje, Java'da Optional sınıfının kullanımını göstermektedir. Optional, Java 8'de tanıtılan bir sınıftır ve bir nesnenin olup olmadığını kontrol etmek için kullanılır.

## OptionalClassExample.java
Bu dosya, Optional sınıfının farklı kullanım örneklerini içermektedir. İlgili kod parçacıkları şunları içerir:

- Optional.empty() ile boş bir Optional nesnesi oluşturulur ve isPresent() metodu ile içinde değer olup olmadığı kontrol edilir.
- Bir değer içeren bir Optional nesnesi oluşturulur ve isPresent() metodu ile içinde değer olup olmadığı kontrol edilir.
- Optional.ofNullable() ile bir değeri alırken null kontrolü yapılır ve isPresent() metodu ile içinde değer olup olmadığı kontrol edilir.
- ifPresent() metodu ile bir değerin varlığında belirli bir işlem yapılır.
- orElse() ve orElseGet() metotları ile bir değer olmadığında varsayılan bir değer veya bir sağlayıcı fonksiyon kullanılır.
- orElseGet() metodu, varsayılan değeri sağlayıcı fonksiyonu çağırarak elde eder. Bu sayede varsayılan değer gereksiz yere hesaplanmamış olur.

## Nasıl Çalıştırılır?
- Herhangi bir Java uyumlu IDE'de (IntelliJ IDEA, Eclipse) projeyi açın.
- OptionalClassExample.java dosyasını çalıştırarak çıktıları gözlemleyebilirsiniz.


![image](https://github.com/esmanur-karatas/NewWithJava8/assets/83882274/770edfe6-8441-4aad-b9e0-3961cf48dda3)
