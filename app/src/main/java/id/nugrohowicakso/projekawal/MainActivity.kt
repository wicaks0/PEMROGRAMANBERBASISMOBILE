package id.nugrohowicakso.projekawal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //memperkenalkan button yang sudah ditambahkan di layout
        val btnsayur: Button = findViewById(R.id.btnsayur)
        btnsayur.setOnClickListener (this)

        val btnbuah: Button = findViewById(R.id.btnbuah)
        btnbuah.setOnClickListener (this)

    }
    //Membuat Intent agar dapat pindah activity
    override fun onClick(v: View?) {
        when (v?.id){
            R.id.btnsayur ->{
                val pindah = Intent(this@MainActivity,sayur::class.java)
                startActivity(pindah)
            }

            R.id.btnbuah ->{
                val pindah = Intent(this@MainActivity,buah::class.java)
                startActivity(pindah)
            }

        }
    }
}