package com.example.androidfinalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class DetailsActivity : AppCompatActivity() {

    companion object{
    const val EXTRA_COSTUME = "extra_costume"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        supportActionBar?.hide()

        val tvName : TextView = findViewById(R.id.costume_name)
        val tvPrice : TextView = findViewById(R.id.costume_price)
        val tvSize : TextView = findViewById(R.id.costume_size)
        val tvDetail : TextView = findViewById(R.id.costume_description)
        val tvPieces : TextView = findViewById(R.id.costume_pieces)
        val tvSource : TextView = findViewById(R.id.costume_source)

        val costumeImg : ImageView = findViewById(R.id.costume_image)

        val costume =intent.getParcelableExtra<Costume>(EXTRA_COSTUME) as Costume
        tvName.text = costume.name
        tvPrice.text = "Rp. ${costume.price.toString()}"
        tvSize.text = costume.size
        tvDetail.text = costume.detail
        tvPieces.text = costume.pieces.toString()
        tvSource.text = costume.source
        costumeImg.setImageResource(costume.photo)
        setActionBarTitle(costume.name)

    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
}