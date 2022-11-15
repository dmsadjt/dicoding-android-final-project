package com.example.androidfinalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class ProfileActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_PROFILE = "extra_person"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        setSupportActionBar(findViewById(R.id.toolbar))
        val profile = intent.getParcelableExtra<Profile>(EXTRA_PROFILE)

        val title : TextView = findViewById(R.id.toolbar_title)
        val photo : ImageView = findViewById(R.id.self_image)
        val name : TextView = findViewById(R.id.user_name)
        val email : TextView = findViewById(R.id.user_email)


        photo.setImageResource(profile!!.photo)
        name.text = profile.name
        title.text = profile.name
        email.text = profile.email
    }
}