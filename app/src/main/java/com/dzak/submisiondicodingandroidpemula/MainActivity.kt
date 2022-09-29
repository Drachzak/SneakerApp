package com.dzak.submisiondicodingandroidpemula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dzak.submisiondicodingandroidpemula.Adapter.AdapterSepatu
import com.dzak.submisiondicodingandroidpemula.Data.DataSepatu
import com.dzak.submisiondicodingandroidpemula.model.ProfileActivity
import com.dzak.submisiondicodingandroidpemula.model.sepatu
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val list: ArrayList<sepatu> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Recycler_Sepatu.setHasFixedSize(true)
        list.addAll(DataSepatu.listdatasepatu)

        Recycler_Sepatu.layoutManager = LinearLayoutManager(this)
        val listsepatu = AdapterSepatu(list)
        Recycler_Sepatu.adapter = listsepatu
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }


    private fun setMode(milihitem: Int) {
        when (milihitem) {
            R.id.menu_profile -> {
                startActivity(Intent(this, ProfileActivity::class.java))
            }
        }
    }

}