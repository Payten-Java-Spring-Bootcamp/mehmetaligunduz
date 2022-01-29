1-) Concurrent programlama birçok seyi ayni anda yapmaktir. Parallel programlama bir şeyi kucuk parcalara bolup aynı anda yapmaktır.
2-) Semaphore senkronizasyon aracıdır. Mutex ise ayni anda okuma ve yazma işlemini engellemek için bir kilitleme mekanizmasıdır. Birden fazla kaynak varsa semaphore kullanılmalıdır.Tek bir ortak kaynak varsa mutex kullanılmalıdır.
3-) Sinif yapilari acisindan fark yoktur ikisininde parent classi throwable dir.
Eger hata durumu programin calismasini tamamen engelliyor ise bu errordur.
Eger hata durumu programin calismasina engel degil ise ve sadece hata programin bir fonksiyonuna etki ediyorsa bu exceptiondir. Ornek olarak dosyanin olmamasi yada acilamamasi bu durum Exceptiondir.
4-) Scheduling, planli calistirma yada istenilen zaman diliminde calistirilmasini saglar. bu islem threadler ile sağlanır.
@EnableScheduling
@Scheduling(fixedDelay = 1200)
5-) Call edilen metodun tamamlanmasini beklemez 
6-) High availability surdurulebilirligi temsil eder. .
7-) Lifecycle esas alinir.
8-) ortak dil oluşturma prensibidir. 
9-) Core Domain: Entitylerin bulundugu domain business domaini destekler
Supporting Domain: isleyisi destek olan yapi mesela kullanici girisi ile bazi bolumlere erişimin kisitlanmasi
Generic Domain: loglama, watch
10-) Anemic domain model, hiç bir fonksiyonelliği olmayan içerisinde hiçbir fonksiyon barındırmayan sadece property lerden oluşmuş bir modeldir ve düşünüldüğünde OOP'e aykırı bir yapı teşkil eder. Rich domain model ise anemic domain modellerinin dezavantajlarını yok eder.
