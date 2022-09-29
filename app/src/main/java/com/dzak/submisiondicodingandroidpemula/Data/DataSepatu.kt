package com.dzak.submisiondicodingandroidpemula.Data

import com.dzak.submisiondicodingandroidpemula.R
import com.dzak.submisiondicodingandroidpemula.model.sepatu

object DataSepatu {
    private val Nama = arrayOf(
        "Compas x Jason Ranti",
        "Puma x BMW",
        "Yeezy",
        "Airmax 720",
        "Nike Blazer Vintage",
        "Air Jordan x Dior",
        "Adidas EQT x Dragon Ball",
        "Jordan Bred Toe",
        "Vans x ShakeJunt",
        "Converse x OFF White",
    )
    private val Harga = arrayOf(
        "IDR.799.000,00",
        "IDR.1.199.000,00",
        "IDR.3.000.000,00",
        "IDR.2.200.000,00",
        "IDR.1.000.000,00",
        "IDR.100.000.000,00",
        "IDR.2.600.000,00",
        "IDR.4.000.000,00",
        "IDR.1.200.000,00",
        "IDR.7.899.000,00",
    )
    private val Ukuran = arrayOf(
        "Ukuran : 35 - 45",
        "Ukuran : 35 - 45",
        "Ukuran : 35 - 45",
        "Ukuran : 35 - 45",
        "Ukuran : 35 - 45",
        "Ukuran : 35 - 45",
        "Ukuran : 35 - 45",
        "Ukuran : 35 - 45",
        "Ukuran : 35 - 45",
        "Ukuran : 35 - 45",
    )
    private val Deskripsi = arrayOf(
        "Cocok di kalangan anak muda bercorak warna warni cocok untuk wanita,tampil stylish model baru brand anak negri",
        "Cocok di kalangan pecinta otomotif terutama mobil dan motor BMW dan di sertai warna hitam yang sesuai dengan logo BMW",
        "Cocok di kalangan anak muda pecinta outfit hypebeast,sepatu ini berbahan kain sintetis yang awet dan bentuk yang simetris unik",
        "Cocok di kalangan anak muda pecinta sepatu running dengan air bounce disertai model modern yang simpel dan nyaman di pakai",
        "Cocok di kalangan anak muda bercorak warna hitam cocok untuk wanita dan pria model sepatu high dan mid cocok untuk sekolah dan jalan-jalan",
        "Cocok di kalangan crazy rich,sepatu ini sangat mewah dengan logo dior dan logo nikenya sangat cocok saat di gabung",
        "Cocok di kalangan para pecinta anime Dragon Ball z,sepatu adidas pertama yang collab bersama Dragon Ball z",
        "Cocok di kalangan pecinta Air Jordan disertai warna yang berkomposisi merah dan hitam sangat cocok di gabung dan bentuk retro taun 90an",
        "Cocok di kalangan anak muda pecinta Vans,kali ini Vans ber kolaborasi dengan Shake Junt",
        "Cocok di kalangan anak pecinta OFF White,harga nya yang wow sangat berbeda dari converse biasa,warna transparannya membuat sepatu ini terlihat unik ",
    )
    private val Gambar = arrayOf(
        R.drawable.jason_compass,
        R.drawable.puma,
        R.drawable.yeezy,
        R.drawable.airmax,
        R.drawable.nikeblazer,
        R.drawable.jordandior,
        R.drawable.eqtdragonball,
        R.drawable.jordanbred,
        R.drawable.vansshakejunt,
        R.drawable.converseoffwhite,
    )
    val listdatasepatu: ArrayList<sepatu>
        get(){
            val list = arrayListOf<sepatu>()
            for (position in Nama.indices) {
                val sepatu = sepatu()
                sepatu.name = Nama[position]
                sepatu.harga = Harga[position]
                sepatu.ukuran = Ukuran[position]
                sepatu.deskripsi = Deskripsi[position]
                sepatu.gambar = Gambar[position]
                list.add(sepatu)
            }
            return list
        }
}