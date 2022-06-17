package com.tsuma.workoutlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.tsuma.workoutlog.databinding.ActivityHomePageBinding
import com.tsuma.workoutlog.databinding.ActivityLoginBinding

class Home_pageActivity : AppCompatActivity() {
    lateinit var binding:ActivityHomePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        castViews()
        setupBottomNav()
    }
    fun castViews(){

    }
    fun setupBottomNav(){
        binding.bnvHome.setOnItemSelectedListener { item->
            when(item.itemId){
                R.id.plan -> {
                     var trasaction=supportFragmentManager.beginTransaction()
                    trasaction.replace(R.id.fcvHome,PlanFragment())
                    trasaction.commit()
                    true
                }
                R.id.track -> {
                    var trasaction=supportFragmentManager.beginTransaction()
                    trasaction.replace(R.id.fcvHome,TrackFragment())
                        trasaction.commit()
                    true

            }
                R.id.profile -> {
                    var trasaction=supportFragmentManager.beginTransaction()
                    trasaction.replace(R.id.fcvHome,ProfileFragment())
                    trasaction.commit()
                    true
                }


                else->false
            }
        }
    }
}