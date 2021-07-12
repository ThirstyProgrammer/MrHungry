package id.bachtiar.harits.mrhungry

import id.bachtiar.harits.mrhungry.model.CookingStep
import id.bachtiar.harits.mrhungry.model.Food

object FoodData {

    private val foodNames = arrayOf(
        "Rendang",
        "Nasi Goreng",
        "Sushi",
        "Ramen",
        "Tom Yam",
        "Pad Thai",
        "Dim Sum",
        "Bebek Peking",
        "Bulgogi",
        "Tacos"
    )

    private val foodCountry = arrayOf(
        "Indonesia",
        "Indonesia",
        "Jepang",
        "Jepang",
        "Thailand",
        "Thailand",
        "Hong Kong",
        "China",
        "Korea Selatan",
        "Mexico"
    )

    private val foodDescription = arrayOf(
        "Masakan daging asli Indonesia yang berasal dari Minangkabau. Masakan ini dihasilkan dari proses memasak suhu rendah dalam waktu lama menggunakan aneka rempah-rempah dan santan. Proses memasaknya memakan waktu berjam-jam (biasanya sekitar empat jam) hingga yang tinggal hanyalah potongan daging berwarna hitam pekat dan dedak. Dalam suhu ruangan, rendang dapat bertahan hingga berminggu-minggu.",
        "Sajian nasi yang digoreng dalam sebuah wajan atau penggorengan menghasilkan cita rasa berbeda karena dicampur dengan bumbu-bumbu seperti bawang putih, bawang merah, merica dan kecap manis. Selain itu, ditambahkan bahan-bahan pelengkap seperti telur, sayur-sayuran, makanan laut, atau daging.",
        "Makanan Jepang yang terdiri dari nasi yang dibentuk bersama lauk (neta) berupa makanan laut, daging, sayuran mentah atau sudah dimasak. Nasi susyi mempunyai rasa masam yang lembut karena dibumbui campuran cuka beras, garam, dan gula.",
        "Masakan mi kuah Jepang yang berasal dari China. Orang Jepang juga menyebut ramen sebagai chuka soba (中華そば soba dari Tiongkok) atau shina soba (支那そば) karena soba atau o-soba dalam bahasa Jepang sering juga berarti mi.",
        "Sup yang berasal dari Thailand. Sup ini merupakan salah satu makanan Thailand yang terkenal. Di Thailand, tom yum biasanya dibuat dengan udang (tom yum goong), ayam (tom yum gai), ikan (tom yum pla), atau makanan laut yang dicampur (tom yum talay atau tom yum po taek) dan jamur.",
        "Hidangan kwetiau goreng yang lazim dijajakan sebagai jajanan kakilima di Thailand. Hidangan ini dibuat dari kwetiau atau mi beras yang direndam dalam air, kemudian ditumis dengan campuran telur dan irisan tahu, serta dibumbui dengan asam jawa, kecap ikan (nampla น้ำปลา), ebi, bawang putih dan bawang merah, cabai merah dan gula jawa, disajikan dengan irisan jeruk limau serta irisan kacang tanah goreng.",
        "Istilah dari bahasa Kantonis dan artinya adalah \"makanan kecil\". Biasanya dim sum dimakan sebagai sarapan atau sarsi. Namun karena dimsum populer ke dunia dari Hongkong maka istilah dimsum lebih populer dibandingkan dianxin.",
        "Bebek Peking dibuat menggunakan daging bebek khusus diternakkan untuk makanan ini. Bebek-bebek digemukkan dengan cara memberikan makanan bergizi, pada saat bebek-bebek kekenyangan, peternak-peternak mungkin saja memasukkan makanan ke dalam kerongkongan sang bebek secara paksa. Ini yang kemudian menjadikan bebek Peking juga dikenal dengan nama bebek isi. Bebek tadi disajikan setelah dipanggang dengan kayu-kayu bakar khusus yang akan menambah wangi daging bebek yang dipanggang.",
        "Olahan daging asal Korea. Daging yang digunakan antara lain daging sirloin atau bagian daging sapi pilihan. Bumbu bulgogi adalah campuran kecap asin dan gula ditambah rempah lain bergantung pada resep dan daerah di Korea. Sebelum dimakan, daun selada digunakan untuk membungkus bulgogi bersama kimchi, bawang putih, atau bumbu penyedap lain.",
        "Makanan khas Meksiko yang terdiri atas gulungan atau lipatan tortilla yang diisi dengan berbagai macam masakan di dalamnya. Salah satu versi Taco terdapat di makanan khas Tex-Mex, yakni Breakfast Taco (Taco untuk Sarapan) yang terdiri atas telur dadar dan kombinasi kentang, sosis dan/atau daging babi asap (bacon)."
    )

    private val foodIngredients = arrayOf<List<String>>(
        arrayListOf(
            "1 kg daging sapi, potong dadu 5 cm",
            "1 lembar daun kunyit, simplukan",
            "2 buah bunga lawang utuh",
            "4 butir kapulaga",
            "1 bungkus royco kaldu sapi",
            "6 sdm kelapa parut, sangrai hingga keluar minyak",
            "10 lembar daun jeruk purut",
            "3 batang serai, memarkan",
            "5 cm kayu manis",
            "2 buah asam kandis/asam gelugor",
            "2.5 liter santan kelapa",
            "5 sdm minyak sayur",
        ),
        arrayListOf(
            "600 gr nasi putih",
            "1 siung bawang putih, iris halus",
            "2 buah cabai merah, iris serong",
            "1 sdm royco kaldu ayam",
            "2 sdm minyak, untuk menumis",
            "70 gr wortel, kupas, potong dadu kecil",
            "3 butir bawang merah, iris halus",
            "2 sdm bango kecap manis",
            "1 batang daun bawang"
        ),
        arrayListOf(
            "Ikan salmon segar",
            "Nori potong memanjang",
            "Nasi yang sudah masak",
            "Cuka beras",
            "Kaldu jamur"
        ),
        arrayListOf(
            "Mie telur",
            "2 buah wortel iris korek api",
            "Daun bawang (iris)",
            "Rumput laut",
            "Suwiran daging sapi",
            "Bakso ikan",
            "Telur rebus",
            "Pokcoy",
            "2 siung bawang putih",
            "1/2 buah bawang bombay",
            "2 sdm kecap asin",
            "1 sdm saus tiram",
            "1 sdm kecap ikan",
            "Merica",
            "Garam"
        ),
        arrayListOf(
            "Tahu sutra secukupnya",
            "Crabs stik",
            "Udang secukupnya",
            "Bakso seafood campur",
            "Jamur kancing",
            "Sawi pakcoy",
            "1 buah wortel",
            "Sayuran sesuai selera",
            "10 cabai rawit utuh",
            "3 batang serai (memarkan)",
            "5 lembar daun jeruk",
            "2 buah jeruk nipis, ambil airnya",
            "1 sdm ebi",
            "3 siung bawang putih",
            "30 gr cabai merah kering, buang bijinya lalu rendam air panas",
            "1 ruas jahe (memarkan)",
            "2 sdm minyak ikan",
            "1,5 liter kaldu udang",
        ),
        arrayListOf(
            "500 gr mi pad thai (kwetiau)",
            "4 sdm minyak goreng",
            "5 siung bawang putih, cincang halus",
            "5 butir bawang merah, cincang halus",
            "200 gr udang, kupas",
            "250 gr tahu putih, iris bentuk korek api, goreng setengah matang",
            "200 gr taoge",
            "20 lembar daun kucai, potong-potong",
            "10 ml air asam jawa",
            "1 sdt garam",
            "15 sdm kecap ikan",
        ),
        arrayListOf(
            "3 potong ayam paha, fillet dagingnya",
            "1 sdt garam",
            "1 sdm gula pasir",
            "1 sdm minyak wijen",
            "1/2 sdt lada halus",
            "3/4 sdm kecap asin",
            "3/4 sdm saus tiram",
            "25 gr sagu tani",
            "1 lembar daun bawang, iris",
            "15 buah kulit pangsit rebus",
            "1 sdt bubuk seaweed untuk topping",
            "5 sachet saus sambal",
            "1 sdt gula pasir",
            "3 sdm air panas",
        ),
        arrayListOf(
            "1 ekor bebek ukuran sedang",
            "3 sdm madu",
            "1 ruas jahe",
            "1 sdm minyak wijen",
            "3 sdm kecap manis",
            "2 sdm kecap asin",
            "Secukupnya garam",
            "3 sdm kecap manis (saus)",
            "4 sdm kecap asin (saus)",
            "2 sdm minyak zaitun (saus)",
            "1 sdt minyak wijen (saus)",
            "2 cabai rawit merah buang biji potong2 (saus)",
            "1 ruas jahe, iris kecil (saus)",
        ),
        arrayListOf(
            "250 gr daging sapi",
            "Secukupnya margarin",
            "2 siung bawang putih, haluskan",
            "1 sdm kecap manis",
            "1 sdt paprika bubuk",
            "1/4 sdt lada hitam kasar",
            "1/4 sdt jahe bubuk",
            "2 sdt saus tiram",
            "1/2 sdt garam",
            "1/2 sdt gula",
            "1/2 buah bawang bombay iris",
            "1 batang daun bawang cincang",
            "2 sdt wijen sangrai/panggang",
            "1 sdt madu",
            "1 sdt minyak wijen",
            "1/2 sdt wijen sangrai/panggang (bahan tabur)",
            "1 batang daun bawang iris (bahan tabur)",
        ),
        arrayListOf(
            "500 gr daging sapi giling (mince beef)",
            "1 buah bawang merah besar",
            "1 set taco shell n kit (bumbu taco instan, salsa sauce)",
            "Secukupnya garam",
            "Secukupnya minyak untuk menumis",
            "Keju cheddar parut",
            "Daun selada",
            "Acar chillies",
        ),
    )

    private val cookingStep = arrayOf<List<CookingStep>>(
        arrayListOf(
            CookingStep(1, "Di dalam wajan, tumis bumbu halus, daun jeruk, dan serai hingga harum."),
            CookingStep(2, "Tambahkan daging sapi, santan, dan royco kaldu sapi. Aduk terus menerus hingga daging matang. Kecilkan api."),
            CookingStep(3, "Tambahkan sisa bahan, masak hingga kuah mengering dan daging sapi lunak."),
            CookingStep(4, "Rendang sapi siap disajikan")
        ),
        arrayListOf(
            CookingStep(1, "Panaskan minyak, tumis bawang putih, bawang merah hingga harum."),
            CookingStep(2, "Masukkan wortel dan cabai, aduk hingga tercampur rata. Masak hingga wortel mulai layu."),
            CookingStep(3, "Tambahkan nasi, royco kaldu ayam, dan bango kecap manis, aduk rata."),
            CookingStep(4, "Tambahkan daun bawang, aduk rata. Angkat dan sajikan."),
            CookingStep(5, "Nasi goreng siap disajikan.")
        ),
        arrayListOf(
            CookingStep(1, "Bersihkan ikan salmon."),
            CookingStep(2, "Potong dengan memanjang dengan ketebalan sedang."),
            CookingStep(3, "Siapkan wadah untuk nasi"),
            CookingStep(4, "Masukkan nasi, cuka beras, dan kaldu jamur, aduk rata."),
            CookingStep(5, "Cetak nasi dengan cetakan khusus untuk sushi. Bisa juga dibentuk sendiri dengan tangan."),
            CookingStep(6, "Letakkan potongan salmon di atas nasi."),
            CookingStep(7, "Potong nori dengan memanjang dan lilitkan"),
            CookingStep(8, "Sushi salmon nigiri siap dinikmati")
        ),
        arrayListOf(
            CookingStep(1, "Untuk kuah, tumis bawang putih dan bawang bombai."),
            CookingStep(2, "Tuang air rebusan daging sapi."),
            CookingStep(3, "Beri bumbu pelengkap, angkat jika sudah mendidih."),
            CookingStep(4, "Rebus mie dan pokcoy."),
            CookingStep(5, "Taruh mie dan pokcoy di mangkuk."),
            CookingStep(6, "Siram kuah, beri topping daging suwir, wortel iris, rumput laut, telur rebus, dan bakso ikan.")
        ),
        arrayListOf(
            CookingStep(1, "Goreng bawang putih, ebi dan cabai kering sampai wangi, angkat lalu blender beserta minyaknya, sisihkan."),
            CookingStep(2, "Buat kaldu udang dari kulit dan kepala udang yang disangrai lalu dituangi air, rebus sampai mendidih, angkat lalu saring."),
            CookingStep(3, "Setelah itu masukkan bumbu yang sudah di blender, masukkan serai, daun jeruk, jahe, bumbui gara, gula dan lada bubuk."),
            CookingStep(4, "Setelah mendidih masukkan semua bahan isian, biarkan mendidih kembali, tes rasa bila sudah pas matikan api."),
            CookingStep(5, "Berikan perasan jeruk nipis, taburi daun ketumbar."),
            CookingStep(6, "Tom yam siap disajikan.")
        ),
        arrayListOf(
            CookingStep(1, "Panaskan minyak, tumis bawang putih dan bawang merah hingga harum."),
            CookingStep(2, "Masukkan udang, masak hingga berubah warna."),
            CookingStep(3, "Masukkan mi pad thai dan tahu, aduk rata."),
            CookingStep(4, "Masukkan air asam jawa, garam dan kecap ikan, aduk rata."),
            CookingStep(5, "Tambahkan taoge dan kucai, adung sebentar, angkat."),
            CookingStep(6, "Pad thai siap disajikan.")
        ),
        arrayListOf(
            CookingStep(1, "Ambil 1/3 ayam fillet, cincang halus. Blender 2/3 sisa ayam fillet. Campur jadi 1, sisihkan."),
            CookingStep(2, "Tambah garam, gula pasir, minyak wijen, lada halus, kecap asin, saus tiram, sagu tani, dan daun bawang, aduk rata."),
            CookingStep(3, "Ambil 1 lembar kulit, isi 1 sdm adonan, bentuk adonan dimsum."),
            CookingStep(4, "Gunting ujung kulit, beri topping seaweed."),
            CookingStep(5, "Kukus selama kurang lebih 20 menit."),
            CookingStep(6, "Ambil saus sambal, 1 sdt gula pasir, air panas, aduk rata untuk jadi saus."),
            CookingStep(7, "Dim sum sip disajikan")
        ),
        arrayListOf(
            CookingStep(1, "Lamuri bebek dengan cuka selama 2 jam, simpan di kulkas."),
            CookingStep(2, "Bersihkan sampai wangi cuka hilang, rebus dengan serai dan 1 sdt garam selama 15 menit api besar."),
            CookingStep(3, "Tiriskan bebek. Lumuri dengan campuran madu, jahe, minyak wijen, kecap manis, kecap asin, dan garam, diamkan selama 2 jam."),
            CookingStep(4, "Panggang di oven 150 derajat selama 55 menit pakai yang di putar2 atau di bolak balik selama memanggang agar rata."),
            CookingStep(5, "Campurkan semua bahan untuk saus menjadi satu."),
            CookingStep(6, "Bebek peking siap disajikan dengan saus."),
        ),
        arrayListOf(
            CookingStep(1, "Iris daging tipis."),
            CookingStep(2, "Baluri daging dengan bawang putih, paprika bubuk, lada hitam, jahe, saus tiram, garam, gula, bawang bombay, daun bawang, wijen, madu dan minyak wijen."),
            CookingStep(3, "Masukkan kulkas, biarkan minimal 30 menit."),
            CookingStep(4, "Panaskan sedikit mentega, masukkang daging yang telah dimarinasi."),
            CookingStep(5, "Daging akan mengeluarkan air dengan sendirinya. Masak hingga air habis dan daging matang."),
            CookingStep(6, "Angkat, taburi dengan bahan tabur."),
            CookingStep(7, "Bulgogi siap disajikan."),
        ),
        arrayListOf(
            CookingStep(1, "Siapkan bahan-bahannya, panaskan wajan, tumis bawang merah sampai harum."),
            CookingStep(1, "Masukan daging sapi giling, masukan bumbu siap saji, tumis hingga matang."),
            CookingStep(1, "Masukan taco shell ke dalam oven yang sudah dipanaskan selama 5 menit hingga renyah."),
            CookingStep(1, "Masukkan daging, keju cheddar, daun selada, acar chillies dan saus salsa, kedalam taco shell."),
            CookingStep(1, "Tacos siap disajikan."),
        ),
    )

    private val foodImages = intArrayOf(
        R.drawable.rendang,
        R.drawable.nasi_goreng,
        R.drawable.sushi,
        R.drawable.ramen,
        R.drawable.tom_yam,
        R.drawable.pad_thai,
        R.drawable.dim_sum,
        R.drawable.bebek_peking,
        R.drawable.bulgogi,
        R.drawable.tacos
    )

    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            foodNames.forEachIndexed { index, _ ->
                val food = Food()
                food.name = foodNames[index]
                food.photo = foodImages[index]
                food.country = foodCountry[index]
                food.description = foodDescription[index]
                food.ingredients = foodIngredients[index]
                food.cookingStep = cookingStep[index]
                list.add(food)
            }
            return list
        }

}