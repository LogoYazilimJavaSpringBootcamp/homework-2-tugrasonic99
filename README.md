# homework-2

# Java dünyasındaki framework’ler ve çözdükleri problemler nedir?(Spring MVC, JSP,
Struct, Vaadin). Örnekler ile açıklayın. (20 Puan)

Spring MVC: Model-View-Controller yapılarıyla interaktif ve dinamik Java web applikasyonları yaratımını sağlar. Bahsedilen bu üç yapı Spring MVC'nin hafif ama güçlü katmanlarını oluşturur.Model üzerinden proje çerçevesinde kullanılcacak değerler sınıflar tarafından atanır. View, web applikasyonunun oluşturacağı sayfalarda model değerlerini gösterebilmek adına kullanılır. Controller model üzerinde değişiklik yapmayı sağlar. Annotations sayesinde fonksiyon ve değerlerin erişebilirliğini artırır. 

JSP: HTML dosyalarında Java kontrolü sağlar. Servlet kullanan uygulamalar(Java Server-Client tabanlı canlı uygulamalar) kontrolünün zorluğunu minimuma indirmek için yaratılan bir arayüzdür.
 
Struts: Spring MVC gibi, MVC modelini Java web uygulamaları yapmak için kullanan bir yapıdır. Spring MVC'den ana farkı daha büyük çaplı olup belirli bir yapı mimarisi olmamamasıdır. 

Vaadin: Java temelli GUI odaklı web uygulama tasarım framework'u. Tıpkı Spring MVC gibi annotation içerir ve uygulama yaratışını hem arka plan. hem de GUI taraflı kolaylaştırır.


# Katmanlı mimari nedir? (10 Puan)

Katmanlı mimari, projenin birbiriyle fonksiyonel olarak çalışan katmanlarca yapılmasıyla oluşan bir programlama mimari tipidir. Bu katmanlar belirli bir sıraya göre
sıralandıktan sonra sadece kendilerinin direkt aşağısındaki katmanlarla görüşebilir. Projeden projeye değişen katman yapıları olsa da, genel anlamda kabul edilen 4 ana katman vardır:
		 1- Presentation Katmanı: Kullanıcı etkileşiminden sorumludur.
		 2- Application/Business Katmanı: Fonksiyonel yükümlülüklerden sorumludur.
		 3- Domain Katmanı: Algoritmalardan ve genel proje üyelerinden sorumludur.
		 4- Infrastructure/Persistence/Database Katmanı: Data ve datayı manipule eden tüm fonksiyon ve databaselerden sorumludur.

# Garbage collector nedir, nasıl çalışır? Diğer C++ ile karşılaştırın. (10 Puan)

Garbage collector, Java Sanal Makinesi'nin hafıza problemleri yaşamaması adına otomatik olarak çalışan bir süreçtir. Yeni bir obje oluşturulduğu zaman bu objeler hafızada yerlerini bir hafıza yığınında bulur, en üste en son oluşturulan obje dahil olur. Hafıza yığınında daha önce oluşturulmuş ama herhangi bir kullanımı-referansı olmayan objelerin silinmesini sağlar. Her ne kadar Java'da otomatik olarak çalışsa da System.gc() ve System.runFinalization() komutlarıyla manuel çalıştırılabilir. Manuel çalıştırmanın olağan sebebi daha önce ulaşılabilen bir değeri olan objenin null bir değer olarak atanması veya bir loop boyunca oluşacak ama bir daha kullanılmayacak olan objelerin oluşması olabilir. Böyle durumlarda bu objelere bir daha ulaşılamayacağı için garbage collector çağrılırp hafıza yığınından silinmesi akıllıca olur.
     
C++ ile farkı: Ana fark Java'da garbage collector otomatik olarak çalışıyorken, C/C++ dillerinde hafıza kontrolünü yazarın kendisinin yapmasıdır. Sabit bir hafıza değeri olduğundan dolayıdır. Bu durumdan dolayı garbage collector, C/C++ dillerinde manuel olarak çağrılır.

# Spring frameworkünün kullandığı design patternlar neler? (10 Puan)


Singleton Pattern: Singleton Pattern'ın genel amacı spesifik bir sınıfın, belirlenen container içerisinde sadece bir kullanılan objesi olmasıdır.
 
MVC Pattern: Model-View-Controller mimarisini kullanan pattern. Modelin amacı uygulama ile ilgili bilgi ve önemli değerleri taşımaktır. View, modeli uygulmada göstermek için kullanılır. Contoller ise model üzerinde değişiklikler yapılabilmesini sağlar.

Proxy Pattern: Kullanılan kütüphane veya yapılar arasında arayüz tabirinde süreçler bulunduran pattern. Bir yapı fonksiyonu çağrıldığı zaman, o fonksiyonun kendi işini farklı bir fonksiyona gönderip onun sonucunu kullanır.

Factory Pattern: Toplu Bean'ler yaratılan pattern. Bu işlem BeanFactory ve ApplicationContext kullanılarak gerçekleştirir. ApplicationContext, BeanFactory'nin enterprise versiyonu olduğundan BeanFactory'nin gelişmiş versiyonu olarak kabul edilip kullanılabilir.

Dependency Injection/Inversion of Control Pattern: Hali hazırda kullanılan dependency'leri kontrol edilmesini ve yaratılan objelerin(bean) birbilerine bağlı kalmasını(wired) sağlar.



# Creational Patterns neler? Önceki ödevde oluşturulan nesnelerinizi factory Design
patterni ile oluşacak şekilde düzenleyin. (25 Puan)

Nesnelerin nasıl yaratılacağına dair mimari planlama yöntemleridir. Ana amaç mümkün olabildiği kadar esnek obje yaratımı ve tekrar kullanılabilirliğidir.

Factory Metodu: Arayüz kullanan, birbirlerinden farklı obje yaratabilen bir sınıf kullanarak birbirlerinden farklı obje yaratır.
     
Abstract Factory Metodu: Birbirlerine belirli mantıksal bağlantısı olan sınıfları sadece birbirlerinin ilişkileri tanımı üzerinden yaratan bir pattern.

Builder Metodu: Tek bir arayüz kullanarak karmaşık sınıflar yaratımını sağlar. Bu sınıfların yaratımı adım adım olur. Bu süreci farklı sınıflar yaratımında kullanılabilir.

Prototype Metodu: Hali hazırda oluşmuş olan spesifik bir sınıfın objelerini kopyalayarak yeni objelerin yaratımında bu sınıfı örnek alır.

Singleton Metodu: Belirli bir sınıfın tek bir oluşmuş olan instance'ı olmasını sağlar
 
# Singleton ve AbstractFactory patterlerini implemente eden kodu yazın.(25 Puan)
