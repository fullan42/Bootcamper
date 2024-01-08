# Name of the Project:
Bootcamper.com
## purpose
Bootcamp providerlar ile developerları tek bir çatı altında toplamak.
## çıktı
-Geliştiriciler siteden tüm bootcamp providerların hazırladığı bootcampleri görebilir ve başvurabilirler.
-bootcamp providerlar kendi sitelerinden ziyade doğrudan geliştiricilerin tamamen bootcamp için geldiği sitede yayınlayabilirler veya kendi sitelerinde yayınlı olan bootcamplerin reklamını yapabilirler.
## hedef kitle
yazılımcılar veya bootkampe katılmak isteyen yazılımcı adayları, Bootcamp Providerlar(kendi reklamlarını da yapabilirler)
## potansiyel rakipler
CourseCompare, SwitchUp, Course Report, Coder Space, patika.dev
## Website özellikleri
kullanıcı arayüzü ve validasyonu (provider admin, user ve visitor hepsi ayrı ayrı olacak)
ilan( bootcampler için)
profil(providerlar için)
feedback(bootcamp sonrası userların verimlilik puanı verebilmesi için )(nps score check)
## Gelir modeli
Site içerisinde ve bootcamp içerisinde bulunan video resim vb. yada listeleme esnasında google adsense ile oluşturulmuş reklam blokları.
## Class diagram 

```mermaid
class Bootcamp {
    -String name
    -Date deadline
    -Date whenStartDate
    -User[] users
    -String subject
    -String place
    -double price
    -Feedback[] feedback
    -Provider provider
}

class User {
    -String name
    -String email
    -String surname
    -Bootcamp[] appliedBootcamps
}

class Provider {
    -String name
    -String website
    -Bootcamp[] bootcamps
}

class Feedback {
    -int rate
    -int numberOfComments
    -User user
    -Bootcamp bootcamp
}
