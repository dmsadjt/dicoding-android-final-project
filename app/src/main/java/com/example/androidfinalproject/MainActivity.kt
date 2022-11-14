package com.example.androidfinalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var rvCostume : RecyclerView
    private var list: ArrayList<Costume> = arrayListOf()
    private var title = "Costume Catalog"

    private fun showSelectedCostume(costume : Costume){
        val goToDetails = Intent(this@MainActivity, DetailsActivity::class.java)
        goToDetails.putExtra(DetailsActivity.EXTRA_COSTUME, costume)
        startActivity(goToDetails)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
//        setSupportActionBar(findViewById(R.id.toolbar))

        rvCostume = findViewById(R.id.rv_costume)
        rvCostume.setHasFixedSize(true)

        list.addAll(CostumeData.listData)
        showRecyclerList()

        val profile = Profile(
            "Muhammad Dimas Adijanto",
            "its.dee.mus@gmail.com",
            R.drawable.foto_profil
        )

        val aboutMeBtn : ImageView = findViewById(R.id.about_page)
        aboutMeBtn.setImageResource(profile.photo)
        aboutMeBtn.setOnClickListener(this)
    }


    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private fun showRecyclerList() {
        rvCostume.layoutManager = LinearLayoutManager(this)
        val listAdapter = ListAdapter(list)
        rvCostume.adapter = listAdapter

        listAdapter.setOnItemClickCallback(object: ListAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Costume) {
                showSelectedCostume(data)
            }
        })
    }

    override fun onClick(p0: View?) {
        val profile = Profile(
            "Muhammad Dimas Adijanto",
            "its.dee.mus@gmail.com",
            R.drawable.foto_profil
        )

        val moveObjectWithParcel =Intent(this@MainActivity, ProfileActivity::class.java)
        moveObjectWithParcel.putExtra(ProfileActivity.EXTRA_PROFILE, profile)
        startActivity(moveObjectWithParcel)
    }
}