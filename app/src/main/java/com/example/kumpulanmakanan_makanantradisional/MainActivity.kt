package com.example.kumpulanmakanan_makanantradisional

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testData = createResepData()
        resep_parts.layoutManager = LinearLayoutManager(this)
        resep_parts.setHasFixedSize(true)
        resep_parts.adapter = ResepAdapter(testData, { resepItem : ResepData -> resepItemClicked(resepItem) })
    }
    private fun resepItemClicked(resepItem : ResepData) {
        val showDetailActivityIntent = Intent(this, ResepDetailActivity::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, resepItem.namaMakanan.toString())
        showDetailActivityIntent.putExtra(Intent.EXTRA_COMPONENT_NAME, resepItem.daerahMakanan.toString())
        showDetailActivityIntent.putExtra(Intent.EXTRA_SPLIT_NAME, resepItem.resepMakanan.toString())
        showDetailActivityIntent.putExtra(Intent.EXTRA_REFERRER, resepItem.fotoResep.toString())
        startActivity(showDetailActivityIntent)
    }
    private fun createResepData() : List<ResepData> {
        val partList = ArrayList<ResepData>()
        partList.add(ResepData("Gado-Gado","Surabaya","\tBahan:\n-\t2 buah tempe goreng\n-\t2 buah tahu goreng\n-\t2 butir telur rebus, kupas\n-\t1 buah kentang rebus, kupas kulitnya\n-\t4 lembar daun selada cina, cuci besih\n-\t1/4 mentimun, kupas, cuci bersih\n-\t1/2 buah wortel, kupas, irisl\n-\t3 lonjor kacang panjang, iris 3 cm\n-\t50 gram taoge, bersihkan akarnya\n-\t2 buah lontong" +
                "\n\n\tSaus Kacang:\n-\t150 gram kacang tanah goreng\n-\t4 siung bawang putih, goreng\n-\t2 buah cabai merah, buang bijinya\n-\t1 1/2 sdm gula merah, sisir\n-\t1 sdt garam\n-\t500 ml santan dari 1/4 butir kelapa\n-\t1 sdm air asam" +
                "\n\n\tPelengkap Makanan:\n-\temping, kerupuk udang, bawang goreng, kecap manis,\n\tsambal" +
                "\n\n Cara Membuat:\n1.\tSaus kacang: Blender kacang, bawang, cabai, gula merah\n\t\tdan garam hingga halus.\n2.\tRebus campuran kacang dengan santan.\n3.\tMasak sambil aduk-aduk hingga matang dan\n\t\tmeletup-letup. Angkat dan dinginkan.\n4.\tRebus wortel, kacang panjang, taoge hingga matang.\n\t\tAngkat dan tiriskan.\n5.\tPotong-potong semua bahan dan lontong.\n6.\tAtur lontong, potongan tempe, tahu, kentang, telur dan semua sayuran.\n7.\tSiram dengan saus kacang", R.drawable.gado))
        partList.add(ResepData("Pecel Pincuk","Madiun","\tBahan:\n-\t1 ikat daun singkong, siangi daunnya\n-\t1/2 ikat kemangi, siangi daunnya\n-\t1 buah mentimun, kupas, buang bijinya, potong dadu kecil\n-\t3 sdm petal dna, cuci bersih\n-\t50 gram taoge, bersihkan ekornya." +
                "\n\n\tBumbu Kacang:\n-\t75 gram kacang tanah kupas, sangrai\n-\t40 gram gula merah\n-\t1 sdm asam jawa\n-\t1 1/2 sdt garam" +
                "\n\n\tBumbu Kacang (di Goreng):\n-\t75 gram kacang tanah kupas, sangrai\n-\t2 siung bawang putih \n-\t3 buah cabai rawit\n-\t1 buab cabai merah, buang bijinya\n-\t2 lembar daun jeruk" +
                "\n\n\tPelengkap Makanan:\n-\tRempeyek kacang dan Tempe mendoan" +
                "\n\n\tCara Membuat:\n1.\tRebus daun singkong hingga lunak, peras airnya lalu\n\t\tiris-iris,Sisihkan.\n2.\tSeduh taoge dengan air panas hingga Iayu, tiriskan.\n3.\tBumbu kacang: masukkan kacang dan semua bumbu yang\n\t\tdigoreng.\n4.\tTambahkan air matang, asam, guta, dan garam, aduk rata\n\t\thingga bumbu sedikit encer.\n5.\tAmbil selembar daun pisang, buat pincuk.\n6.\tLetakkan nasi putih dalam pincuk.\n7.\tCampur daun singkong. kemangi, mentimun, petai,dan\n\t\ttaoge.\n8.\tSiram sayuran dengan bumbu kacang.\n9.\tSajikan dengan peterigkap Rempeyek Kacang dan Tempe\n\t\tMendoan.", R.drawable.pecel))
        partList.add(ResepData("Megono","Pekalongan","\tBahan:\n-\t12 Bawang merah\n-\t5 Bawang putih\n-\tKetumbar\n-\tKemiri\n-\tTrasi mentah\n-\tTauge\n-\t1 potongTempe\n-\tKacang panjang\n-\tKelapa yang sudah diparut\n-\tsecukupnya Garam\n-\tsedikit Micin\n-\tsecukupnya Gula\n-\tRempah rempah seperti daun jeruk, daun salam, serai, dan\n\tlaos." +
                "\n\n\tCara Membuat:\n1.\tBumbu seperti bawang merah bawang putih kemiri\n\t\tketumbar dan trasi dihaluskan terlebih dahulu .\n2.\tBahan bahan seperti tempe kacang panjang\n\t\tdi potong-potong sesuka selera.\n3.\tBumbu bumbunya ditaroh diatas Bahan bahan yang sudah\n\t\tdi potong potong,tauge, kelapa yang sudah diparut, dan \n\t\trempah-rempah dikukus sampe 30 menit .\n4.\tSetelah 30 menit dicampur biar rata.\n5.\tSetelah itu siap dihidangkan.\n", R.drawable.megono))
        partList.add(ResepData("Sego Gono","Temanggung","\tBahan:\n-\t1 mug (bawaan magic com) beras putih\n-\t1/2 ikat daun lembayung/daun kacang. siangi dan cuci\n\t\tbersih\n-\t3 batang kacang panjang potong2 pendek\n-\t1 papan tempe uk kecil potong kecil\n-\t1 genggam teri cuci bersih\n-\t5 sdm kelapa parut\n-\t3 siung bawang putih\n-\tsecukupnya Gula pasir\n-\t3 lembar daun salam" +
                "\n\n\tBumbu Halus: \n-\t3 siung bawang putih, cabe rawit(sesuai selera) dan\n\t\tsecukupnya garam" +
                "\n\n\tCara Membuat:\n1.\tSiap kan bahan2.\n2.\tHaluskan bumbu2.\n3.\tBuat aron.\n4.\tSetelah aron matang campurkan semua bahan ke aron\n\t\tberas. Cicipi rasa, kalau dirasa kurang asin tambahi garam\n\t\tatau bila suka tambahin penyedap.\n5.\tKukus sampai matang, kemudian sajikan dengan ikan asin\n\t\tatau tempe kemul.", R.drawable.gono))
        partList.add(ResepData("Ketan Juruh","Solo","\tBahan:" +
                "\n1.\tNasi Ketan: 1 gelas ketan(cuci), 2 gelas air, 2 lembar daun\n\t\tpandan, 3 krim bubuk(merek tersera), 1 sdt garam." +
                "\n2.\tTaburan Kelapa: 250 gr kelapa muda parut, secukupnya\n\t\tgaram." +
                "\n3.\tSaus Gula Merah: 300 gr gula merah, 200 ml air, sejumput\n\t\tgaram, 1 lembar daun pandan, 2 sdm tepung maizena\n\t\tlarutkan dengan 5 sdm air." +
                "\n\n\tCara Membuat:\n1.\tCuci bersih beras ketan, lalu tiriskan, masukkan dalam\n\t\tpanci rice cooker, tambahkan air, garam, fiber creme\n\t\tdan daun pandan, aduk rata, usahakan jangan sampai\n\t\tada fiber creme yg menggerindil, gunakan air hangat jika\n\t\tingin lebih memudahkan si krimer larut, masak, tekan\n\t\t“cook”, biarkan sampai matang.\n2.\tSetelah matang, biarkan saja dulu jangan dibuka2, selang\n\t\t15 menit baru dibuka dan diaduk, siap digunakan dan\n\t\tdisajikan lebih lanjut.\n3.\tSementara itu, campur dan aduk kelapa parut dengan\n\t\tsedikit garam, kukus hingga matang, sisihkan.\n4.\tJuruh / Saus Gula Merah : dalam satu panci, campur dan\n\t\taduk seluruh bahan juruh diatas, kecuali\n\t\tlarutan maizena, masak diatas api kecil hingga gula larut\n\t\tsambil diaduk2 sampai mendidih, kemudiang tuang\n\t\tperlahan larutan maizena, aduk hingga mengental dan\n\t\tmendidih sekali lagi, matikan api.\n5.\tPenyajian : tuang ketan dalam satu wadah secukupnya,\n\t\ttaburi dengan kelapa secukupnya, kemudian\n\t\tsiram dengan Juruh / Saus gula merahnya, sajikan\n", R.drawable.juruh))
        partList.add(ResepData("Lentog Tanjung","Kudus","\tBahan 1:\n-\tLontong Secukupnya\n-\tSayur Nangka: 300 gr nangka iris tipis, 2 lembar daun salam,\n\t2 lengkuas di paparkan, 1 liter sandan dari 1 butir kelapa,\n\t1 sdt garam, 1 sdm gula pasir.\n-\tBumbu Halus: 6 siung bawang merah, 3 siung bawang putih,\n\t3 butir kemiri." +
                "\n\n\tBahan 2:\n-\tOpor Tahu: 10 buah tahu di potong segitiga lalu di goreng\n\thingga berkulit, 1 papan tempe di potong segitiga hingga\n\tberkulit, 2 batang serai di paparkan, 3 lembar\n\tdaun jeruk, 2 lembar daun salam, 300 ml santan kental,\n\t700 ml santan encer, 1 sdt garam, 1 sdm gula pasir.\n-\tBumbu Halus: 10 siung bawang merah, 5 siung bawang\n\tputih, 4 butir kemiri, 1 sdm ketumbar, 1/2 sdt merica\n\tbubuk, 1/4 sdt jinten, 2 cm jare." +
                "\n\n\tCara Membuat:" +
                "\n1.\tSayur Nangka: campur bumbu halus, daun salam,\n\t\tlengkuas, nangka dan santan. Masak sampai semua\n\t\tbahan matang dan nangka agak hancur. Angkat, sisihkan.\n" +
                "2.\tOpor Tahu : dalam panci rebus santan sedang, tahu dan\n\t\ttempe.\n" +
                "3.\tTumis bumbu halus sampai harum dan matang,\n\t\ttambahkan serai, daun salam, lengkuas, dan daun jeruk.\n\t\tMasukkan bumbu kedalam rebusan. Tambahkan garam\n\t\tdan gula pasir. Masak hingga bumbu meresap.\n\t\tTerakhir masukkan santan kental. Aduk² hingga santan\n\t\tmendidih. Matikan api.\n" +
                "4.\tPenyajian: Ambil piring, alasi dengan daun pisang,\n\t\tmasukkan potongan lontong, beri sayur nangka tahu\n\t\tdan tempe. Siram dengan kuah kental opor tahu Beri\n\t\ttaburan bawang goreng. Sajikan.\n", R.drawable.lentog))

        return partList
    }
}
