# Java Stream API Örnekleri
Bu projede Java Stream API'nin kullanımını gösteren basit örnekler bulunmaktadır. Stream API, Java'da koleksiyonlar üzerinde işlem yapmayı kolaylaştıran ve paralel işlemler için destek sunan bir API'dir.

## StreamApiExample.java
Bu dosyada ArrayList üzerinde Stream API'nin kullanımı örneklenmiştir. İlgili kod parçacığı şu işlemleri gerçekleştirir:

Bir ArrayList oluşturulur ve içine şehir isimleri eklenir.

- stream() metoduyla bir Stream oluşturulur.
- filter() metoduyla baş harfi "İ" ile başlayan şehirler filtrelenir.
- map() metoduyla şehir isimleri büyük harfe dönüştürülür.
- sorted() metoduyla şehir isimleri alfabetik olarak sıralanır.
- forEach() metoduyla her bir şehir ismi yazdırılır.


## ArrayStreamExample.java
Bu dosyada ise bir dizi üzerinde Stream API'nin kullanımı gösterilmiştir. İlgili kod parçacığı şu işlemleri gerçekleştirir:

Bir dizi oluşturulur ve içine 1'den 12'ye kadar olan sayılar eklenir.
- Arrays.stream() metoduyla bir Stream oluşturulur.
- filter() metoduyla 3'ten büyük olan sayılar filtrelenir.
- map() metoduyla sayılar iki katına çıkarılır.
- sorted() metoduyla sayılar küçükten büyüğe sıralanır.
- forEach() metoduyla her bir sayı yazdırılır.

## Nasıl Çalıştırılır?
Her bir sınıf dosyasını Java uyumlu bir IDE'de (örneğin IntelliJ IDEA, Eclipse) açın.

Dosyaları çalıştırarak çıktıları gözlemleyebilirsiniz.


![image](https://github.com/esmanur-karatas/NewWithJava8/assets/83882274/42734fb2-bc59-47ac-9dca-d42218cc39f0)



![image](https://github.com/esmanur-karatas/NewWithJava8/assets/83882274/b58b78f4-212b-4174-91b7-60ffc9a7da26)
