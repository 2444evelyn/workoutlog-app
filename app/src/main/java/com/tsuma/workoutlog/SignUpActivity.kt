package com.tsuma.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.tsuma.workoutlog.databinding.ActivityLoginBinding
import com.tsuma.workoutlog.databinding.ActivitySignUpBinding
import java.util.regex.Pattern

class SignUpActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        castView()
    }




    fun castView(){
        binding.tvLogin.setOnClickListener {
            var intent= Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }



    }
    fun validate() {
        var error=false
        binding.tilEmailsign.error= null
        binding.tilPasswordSignup.error= null
        binding.tilFirstname.error=null
        binding.tilLastname.error=null
        binding.tilConfirm.error=null
        var Firstname = binding.etFirstname.text.toString()
        if (Firstname.isBlank()) {
            binding.tilFirstname.error = "Firstname is required"
            error = true
        }
        var lastname = binding.etlastName.text.toString()
        if (lastname.isBlank()) {
            binding.tilLastname.error = " Lastname is required"
            error = true
        }
        if (error != true) {
        }


        var email = binding.etEmailsignup.text.toString()
        if (email.isBlank()) {
            binding.tilEmailsign.error = "Email is required"
            error = true

        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            binding.tilEmailsign.error = "Email address is invalid "
            error = true

        }
        var password= binding.etPasswordsign.text.toString()
        if (password.isBlank()) {
            binding.tilPasswordSignup.error = "Password is required"
            error = true
        }
        if (error != true) {
        }
        var confirm = binding.etConfirm.text.toString()
        if (confirm.isBlank()){
            binding.tilConfirm.error = "Confirm  is required"
            error = true
        }
        if (error  !=true) {

        }
        if (password != confirm){
            binding.tilConfirm.error = "incorrect"
            error = true
        }
        if (error  !=true) {

        }

    }
}
