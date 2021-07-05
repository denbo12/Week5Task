package com.denbofa.week5task

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denbofa.week5task.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), ProfileAdapter.OnItemClickListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myProfileAdapter: ProfileAdapter
    private lateinit var users: List<ProfileModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        users = listOf(
                ProfileModel("JOHN","lUKE Okon", R.mipmap.ic_pic1),
                ProfileModel("Mark", "Emmanuel", R.mipmap.ic_pic2),
                ProfileModel("JOHN","lUKE Okon", R.mipmap.ic_pic1),
                ProfileModel("Mark", "Emmanuel", R.mipmap.ic_pic2),
                ProfileModel("JOHN","lUKE Okon", R.mipmap.ic_pic1),
                ProfileModel("Mark", "Emmanuel", R.mipmap.ic_pic2),
                ProfileModel("JOHN","lUKE Okon", R.mipmap.ic_pic1),
                ProfileModel("Mark", "Emmanuel", R.mipmap.ic_pic2),
                ProfileModel("JOHN","lUKE Okon", R.mipmap.ic_pic1),
                ProfileModel("Mark", "Emmanuel", R.mipmap.ic_pic2),
                ProfileModel("JOHN","lUKE Okon", R.mipmap.ic_pic1),
                ProfileModel("Mark", "Emmanuel", R.mipmap.ic_pic2),
                ProfileModel("JOHN","lUKE Okon", R.mipmap.ic_pic1),
                ProfileModel("Mark", "Emmanuel", R.mipmap.ic_pic2),
                ProfileModel("JOHN","lUKE Okon", R.mipmap.ic_pic1),
                ProfileModel("Mark", "Emmanuel", R.mipmap.ic_pic2),
                ProfileModel("JOHN","lUKE Okon", R.mipmap.ic_pic1),
                ProfileModel("Mark", "Emmanuel", R.mipmap.ic_pic2),
                ProfileModel("JOHN","lUKE Okon", R.mipmap.ic_pic1),
                ProfileModel("Mark", "Emmanuel", R.mipmap.ic_pic2)
        )

        myProfileAdapter = ProfileAdapter(users, this)
        binding.recyclerView.adapter = myProfileAdapter
    }

    override fun onItemClick(position: Int) {
        users.get(position)
        val intent: Intent = Intent(this, ProfilePageActivity::class.java)
        startActivity(intent)
    }
}