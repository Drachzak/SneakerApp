package com.dzak.submisiondicodingandroidpemula.model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.dzak.submisiondicodingandroidpemula.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    companion object {
        const val juduldetailsepatu = "extra_name"
        const val hargadetailsepatu = "extra_harga"
        const val EXTRA_DESKRIPSI = "extra_deskripsi"
        const val EXTRA_GAMBAR = "extra_gambar"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        txt_namadetail.text = intent.getStringExtra(juduldetailsepatu)
        txt_hargadetail.text = intent.getStringExtra(hargadetailsepatu)
        txt_deskripsidetail.text = intent.getStringExtra(EXTRA_DESKRIPSI)
        img_detail.setImageResource(intent.getStringExtra(EXTRA_GAMBAR)!!.toInt())

        btn_detailbuy.setOnClickListener {
            Snackbar.make(
                findViewById(R.id.detaillayout),
                "Silahkan cek barang di checkout",
                Snackbar.LENGTH_INDEFINITE
            )
                .setAction("OK") {
                }.show()
        }
        btn_detailshare.setOnClickListener {
            Toast.makeText(this, "Barang ini telah di masukan ke keranjang >_<", Toast.LENGTH_SHORT)
                .show()
        }
    }

}
