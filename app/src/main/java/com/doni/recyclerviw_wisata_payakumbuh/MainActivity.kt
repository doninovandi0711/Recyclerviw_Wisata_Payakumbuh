package com.doni.recyclerviw_wisata_payakumbuh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title= "OBJEK WISATA PAYAKUMBUH"

        val wisataList = listOf<Wisata>(
            Wisata(
                R.drawable.jembatankelok9,
                "Jembatan Kelok 9",
                "Jembatan Kelok 9 adalah  adalah ruas jalan berkelok yang terletak sekitar 30 km sebelah timur dari Kota Payakumbuh, Sumatra Barat menuju Provinsi Riau.Di sekitar Jalan Kelok 9 saat ini telah dibangun jembatan layang sepanjang 2,5 km. Jembatan ini membentang meliuk-liuk menyusuri dua dinding bukit terjal dengan tinggi tiang-tiang beton bervariasi mencapai 58 meter. Terhitung, jembatan ini enam kali menyeberangi bolak balik bukit."
            ),
            Wisata(
                R.drawable.lembahharau,
                "Lembah Harau",
                "Lembah Harau merupakan lembah yang subur terletak di kecamatan harau,Kabupaten 50 kota,Provinsi sumatra barat.Berada sekitar 138 kmdari padang dan sekitar 47km dari bukittinggi atau sekitar 18 km dari kota payakumbuh dan 2 km dari pusat pemerintahan kabupaten 50 kota."
            ),
            Wisata(
                R.drawable.ngalauindah,
                "Ngalau Indah",
                " Ngalau Indah merupakan salah satu tempat wisata alam berupa gua dan kompleks hutan yang terletak di Kota Payakumbuh, Sumatra Barat, Indonesia. Terdapat beragam aktivitas yang dapat dilakukan di Gua Indah. Selain gua, objek dan fasilitas yang ada antara lain taman, tempat bermain, kolam renang, dan juga tempat olahraga."
            ),
            Wisata(
                R.drawable.batangtabik,
                "Batang Tabik",
                "Batang Tabik adalah wilayah seluas 34 hektar di kecamatan luak,Kab.Lima Puluh Kota dengan jarak 5,6 km dari seputar Payakumbuh yang dapat di capai kurang lebih selama 12 menit perjalanan. Di sana, terdapat objek wisata pemandian alam dan waterboom yang baru di buka. "
            ),
            Wisata(
                R.drawable.bukikbulektaram,
                "Bukik Bulek Taram",
                "Bukik Bulek Taram merupakan objek wisata yang telatak di Nagari Taram, Kecamatan Harau, Kabupaten Lima Puluh Kota, Sumatra Barat, Indonesia. Letaknya berjarak 11,5 kilometer dari Kota Payakumbuh."
            ),
            Wisata(
                R.drawable.kapalobandataram,
                "Kapalo Banda Taram",
                "Kapalo Banda Taram adalah sebuah danau di payakumbuh,kabupaten lima puluh kota,sumatra barat.danau itu di kelilingi bukit-bukit hijau yang indah.pepohonan di sekitar danau juga menghidupkan suasana damai yang tercipta."
            ),
            Wisata(
                R.drawable.airterjunlubuakbulan,
                "Air Terjun Lubuak Bulan",
                " Air terjun Lubuak Bulan nan cantik ini mempunyai keunikan yang sangat jarang dijumpai pada air terjun biasanya. Di sini, air yang terjun disambut kolam berbentuk bulat tanpa sungai sesudahnya. Jadi, air tersebut seakan hilang ditelan bumi.Untuk penamaan lokasi, air terjun Lubuak Bulan diambil dari ciri khas unik tempat ini. Air cucuran dari air terjun ini jatuh tepat di kolam atau yang sering disebut lubuk. Kolam tersebut memiliki bentuk menyerupai bulan sehingga diberi nama Lubuak Bulan.  "
            ),
            Wisata(
                R.drawable.nagariseribumenhir,
                "Nagari Seribu Menhir",
                "Nagari Seribu Menhir merupakan Situs cagar budaya Menhir di Nagari Maek, Kabupaten Limapuluh Kota, Sumatera Barat yang juga dikenal sebagai Nagari Dengan Seribu Menhir ternyata belum banyak dikunjungi wisatawan namun peninggalan sejarah itu seakan tidak kenal putus asa menunggu kedatangan pengunjung."
            ),
            Wisata(
                R.drawable.paralayangtaehbukik,
                "Paralayang Taeh Bukik",
                "Taeh Bukik,Kecamatan Payakumbuh terletak dibagian utara ibu kota Kabupaten Limapuluh Kota. Luas Nagari Taeh Bukik: 26,91 kilometer persegi dari 27,05 kilometer persegi luas Kecamatan Payakumbuh. Memiliki Gunung Bungsu, wilayah ini menjadi spot bagi pecinta olahraga paralayang Terbang dari ketinggian dan mengandalkan angin untuk melihat pemandangan luar biasa dari atas tentunya menjadi sensasi tersendiri bagi para penikmatnya. Pengunjung dapat melihat keindahan hamparan hijau dari Bukik Taeh. Bahkan, event sport bertaraf internasional juga diselenggarakan di Taeh. Kalau Anda yang hobi paralayang, bisa datang ke Bukik Taeh di Gunung Bungsu. "
            ),
            Wisata(
                R.drawable.puncakmarajo,
                "Puncak Marajo",
                "Puncak Marajo, begitulah namanya. Bagi Anda yang berwisata ke Kota Payakumbuh dan Kabupaten Limapuluh Kota, akan rugi jika tak berkunjung ke tempat ini. Teristimewa saat waktu pagi hari Minggu. Ya, jika tidak hujan, setiap pagi Minggu ratusan warga Luak Limopuluah bercampur dengan wisatawan jogging ke Puncak Marajo. Membelah kabut sembari mengeluarkan keringat. Segeerrr..."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_wisata)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = WisataAdaptor(this, wisataList){
            val intent = Intent (this, DetailWisata::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }
}
