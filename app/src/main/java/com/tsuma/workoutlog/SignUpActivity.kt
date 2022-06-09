package com.tsuma.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import java.util.regex.Pattern

class SignUpActivity : AppCompatActivity() {
    lateinit var btnSignUp: Button
    lateinit var tilFirstname:TextInputLayout
    lateinit var tilLastName:TextInputLayout
    lateinit var tilEmailsign: TextInputLayout
    lateinit var tilPasswordSignup: TextInputLayout
    lateinit var tilConfirm:TextInputLayout
    lateinit var etFirstname:TextInputEditText
    lateinit var etlastName:TextInputEditText
    lateinit var etEmailsignup: TextInputEditText
    lateinit var etPasswordsign: TextInputEditText
    lateinit var etConfirm:TextInputEditText
    lateinit var tvLogin:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        btnSignUp = findViewById(R.id.btnSignup)
        tilFirstname=findViewById(R.id.tilFirstname)
        tilLastName=findViewById(R.id.tilLastname)
        tilEmailsign = findViewById(R.id.tilEmailsign)
        etEmailsignup = findViewById(R.id.etEmailsignup)
        tilPasswordSignup=findViewById(R.id.tilPasswordSignup)
        etFirstname =findViewById(R.id.etFirstname)
        etlastName= findViewById(R.id.etlastName)
        etPasswordsign=findViewById(R.id.etPasswordsign)
        tilConfirm=findViewById(R.id.tilConfirm)
        etConfirm=findViewById(R.id.etConfirm)
        tvLogin = findViewById(R.id.tvLogin)
        btnSignUp.setOnClickListener { validate() }


        tvLogin.setOnClickListener {
            var intent= Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }



    }
    fun validate() {
        var error=false
        tilEmailsign.error= null
        tilPasswordSignup.error= null
        tilFirstname.error=null
        tilLastName.error=null
        tilConfirm.error=null
        var Firstname = etFirstname.text.toString()
        if (Firstname.isBlank()) {
            tilFirstname.error = "Firstname is required"
            error = true
        }
        var lastname = etlastName.text.toString()
        if (lastname.isBlank()) {
            tilLastName.error = " Lastname is required"
            error = true
        }
        if (error != true) {
        }


        var email = etEmailsignup.text.toString()
        if (email.isBlank()) {
            tilEmailsign.error = "Email is required"
            error = true

        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            tilEmailsign.error = "Email address is invalid "
            error = true

        }
        var password= etPasswordsign.text.toString()
        if (password.isBlank()) {
            tilPasswordSignup.error = "Password is required"
            error = true
        }
        if (error != true) {
        }
        var confirm = etConfirm.text.toString()
        if (confirm.isBlank()){
            tilConfirm.error = "Confirm  is required"
            error = true
        }
        if (error  !=true) {

        }
        if (password != confirm){
            tilConfirm.error = "incorrect"
            error = true
        }
        if (error  !=true) {

        }

    }
}
