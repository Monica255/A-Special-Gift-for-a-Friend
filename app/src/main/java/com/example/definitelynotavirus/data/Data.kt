package com.example.definitelynotavirus.data

data class Events(
    val date: String = "",

    val des: String = ""
)

object Data{
    fun getListEvents():List<Events>{
        var events=ArrayList<Events>()
        events.add(Events("4 Juli 1187", "Perang Salib: Salahuddin Ayyubi mengalahkan Guy dari Lusignan pada Pertempuran Hittin."))
        events.add(Events("4 Juli 1456","Mehmed II bersama pasukan Utsmaniyah memulai pengepungan Nándorfehérvár (Beograd) dalam usahanya menundukkan Kerajaan Hongaria."))
        events.add(Events("4 Juli 1927", "Soekarno dan Dr. Tjipto Mangunkusumo mendirikan Perserikatan Nasional Indonesia (PNI) di Bandung."))
        events.add(Events("4 Juli 1943","Perang Dunia II: Pertempuran Kursk antara Jerman Nazi dan Uni Soviet dimulai."))
        events.add(Events("4 Juli 1954","Penutupan Piala Dunia FIFA 1954, dilaksanakan di Stadion Wankdorf, Bern, Swiss. Jerman Barat menjadi juara, gelar juara yang pertama kalinya, mengalahkan Hongaria dengan skor 3-2."))
        events.add(Events("4 Juli 2001", "humm apa yaa? kyk ada hari penting tp gatau apa. Coba klik dlu"))
        events.add(Events("4 Juli 2004","Penutupan Kejuaraan Eropa UEFA 2004, dilaksanakan di Stadion da Luz, Lisboa, Portugal. Yunani menjadi juara, gelar juara yang pertama kalinya, mengalahkan Portugal dengan skor 1-0."))
        events.add(Events("4 Juli 2012","Malam penganugerahan Anugerah Musik Indonesia 2012, dilaksanakan di Tenis Indoor Senayan, Jakarta."))
        events.add(Events("4 Juli 2013","London Array diresmikan oleh perdana menteri Inggris David Cameron"))
        events.add(Events("4 Juli 2016", "Sidang Isbat menentapkan 1 Syawal 1437 Hijriah sama dengan 6 Juli 2016."))
        return events
    }
}