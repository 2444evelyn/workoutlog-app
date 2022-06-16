package com.tsuma.workoutlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class Home_pageActivity : AppCompatActivity() {
    lateinit var bnvHome: BottomNavigationView
    lateinit var fcvHome: FragmentContainerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        castViews()
        setupBottomNav()
    }
    fun castViews(){
        bnvHome=findViewById(R.id.bnvHome)
        fcvHome=findViewById(R.id.fcvHome)
    }
    fun setupBottomNav(){
        bnvHome.setOnItemSelectedListener { item->
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