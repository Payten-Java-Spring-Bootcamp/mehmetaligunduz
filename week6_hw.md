1. Conway’in Kanunu’ nu (Conway’s Law) açıklayınız.
Bir yazılımın geliştirilme sürecinde çok sayıdaki farklı modülün farklı kişiler tarafından geliştirilmesi sürecinde yaşanan iletişimin yazılıma da yansımasından bahsetmektedir. Örneğin bir yazılımın ara-yüzünü tasarlayan ve arkadaki kodları yazan iki farklı kişi olduğunu düşünelim, yazılımın tamamlanması için bu iki kişinin birbiri ile iletişim halinde olması gerekecektir. Ara-yüzde görülen her özellik aslında bu iletişimin bir sonucu olacak ve yazılımın başarısı, işlevselliği kullanılabilirliği gibi çok sayıdaki özellik de bu iletişime bağlı olacaktır.

2. Software as a Service (SaaS), Platform as a Service (PaaS), Infrastructure as a Service (IaaS), On-Premises kavramlarını örneklerle açıklayınız.
* Software as a Service (SaaS): Hizmet olarak yazılım kullanıcılara internet üzerinden bulut tabanlı uygulamalara erişim ve kullanım olanağı sağlayan, merkezi olarak barındırılan, aboneliğe bağlı bir lisanslama ve dağıtım modelidir. 
* Platform as a Service (PaaS): Hizmet olarak platform (PaaS), bulut basit tabanlı uygulamalardan bulut özellikli gelişmiş kurumsal uygulamalara kadar her şeyi dağıtmanıza olanak tanıyan kaynakların yer aldığı, geliştirme ve dağıtıma yönelik eksiksiz bir bulut ortamıdır.
* Infrastructure as a Service (IaaS): Hizmet olarak altyapı (IaaS) isteğe bağlı olarak kullandıkça öde modeliyle temel bilgi işlem, depolama ve ağ kaynakları sunan bir bulut bilişim hizmeti türüdür. IaaS, hizmet olarak yazılım (SaaS), hizmet olarak platform (PaaS) ve sunucusuz ile birlikte dört bulut hizmeti türünden biridir.
* On-Premises: Şirket içi yazılım, sunucu grubu veya bulut gibi uzak bir tesiste değil, yazılımı kullanan kişi veya kuruluşun tesislerinde bulunan bilgisayarlara kurulur ve çalıştırılır. Şirket içi yazılıma bazen "shrinkwrap" yazılımı denir ve şirket dışı yazılıma genellikle "hizmet olarak yazılım" veya "bulut bilişim" denir.

3. Continuous Integration, Continuous Delivery ve Continuous Deployment 
kavramlarını açıklayınız.
Continuous Integration(CI): Sürekli entegrasyon mimarisi yapılan değişiklikler/geliştirmeler sonucu oluşan yeni sürümün, bir boru hattı (pipeline) vasıtasıyla, mevcut sürüm ile sürekli şekilde otomatik olarak birleştirilmesini sağlar. Burada önemli olan nokta sürecin bir boru hattı (pipeline) üzerinden yürütülüyor olması dır.
Continuous Delivery(CD):  istenilen bir sürümün istenilen bir ortama elle tetiklemek suretiyle deploy edilebilmesidir. Yani biz istemedikçe deployment sağlanmaz, deployment istediğimizde süreci manuel olarak başlatırız.
Continuous Deployment: Sürekli dağıtım, yazılım işlevlerinin sıklıkla otomatik dağıtımlar aracılığıyla sağlandığı bir yazılım mühendisliği yaklaşımıdır.

4. API Gateway pattern’ı açıklayınız.
Apı gateway mikro servislerden yada kullanıcılardan gelen isteklerin doğru end-pointlere yönlendirir. Tüm client isteklerini tek bir noktadan yürümemizi sağlar. Gateway gelen isteği tanımlanan yapıya göre ilgili mikroservice a iletir. API gateway pattern e örnek olarak Netflix verilebilir.

5. Backend for frontend (BFF) pattern’ ı açıklayınız.
Her client için ayrı bir api-gateway tanımlanmasını konu alır. Yani yukarıdaki 3 durum için (web-ui,mobile-app,3rd app) 3 farklı BFF ile sorunlarımızı çözümlemeye çalışan pattern’e denir.
Her client için ayrı bir BFF API oluşturarak yukarıda bahsettiğimiz sorunlara çözüm getiriyoruz. 

6. Circuit-breaker pattern’ ı açıklayınız.
Circuit breaker bir devre anahtarı gibi davranarak belli bir thresholdun(eşik değeri) üstünde hata alındığında, response dönemeyen servise gelen requestleri servise iletmeden(open_state), requestlere bir hata mesajı veya bilgi verici mesajla dönüş yaparak sistemin gereksiz yere aşırı yüklenmesini engeller. Belli bir timeouttan sonra gelen requestlerin bir kısmını servise ileterek test yapıp sistem durumunu kontrol eder(half_open state). Eğer sıkıntı giderilmiş ise bütün isteklerin geçmesine izin verir (closed state) ve sistem düzeni korunmuş olur, eğer test çağrıları da hata mesajı alıyorsa, yine requestlere error donup bu döngüyü devam ettirir.

7. Microservice chassis pattern’ ı kısaca açıklayınız
Microservice chasis pattern cross cutting concernu terk ederek method overriding önüne geçiyor. Bu yolla yapılan değişiklikler bütün servislerde tekrarlanmıyor.


