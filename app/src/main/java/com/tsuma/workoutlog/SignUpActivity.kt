package com.tsuma.workoutlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class SignUpActivity : AppCompatActivity() {
    lateinit var btnSignUp: Button
    lateinit var tilFirstname:TextInputLayout
    lateinit var tilLastName:TextInputLayout
    lateinit var tilEmail: TextInputLayout
    lateinit var tilPassword: TextInputLayout
    lateinit var tilConfirm:TextInputLayout
    lateinit var etFirst:TextInputEditText
    lateinit var etName:TextInputEditText
    lateinit var etEmail: TextInputEditText
    lateinit var etPassword: TextInputEditText
    lateinit var etConfirm:TextInputEditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        btnSignUp = findViewById(R.id.btnSignup)
        tilFirstname=findViewById(R.id.tilFirstname)
        tilLastName=findViewById(R.id.tilLastname)
        tilEmail = findViewById(R.id.tilEmail)
        etEmail=findViewById(R.id.etEmail)
        tilPassword=findViewById(R.id.tilPassword)
        etPassword=findViewById(R.id.etPassword)
        tilConfirm=findViewById(R.id.tilConfirm)
        etConfirm=findViewById(R.id.etConfirm)
        btnSignUp.setOnClickListener { validate() }


    }
    fun validate() {
        var error=false
        tilEmail.error= null
        tilPassword.error= null
        tilFirstname.error=null

        var firstname = etFirst.text.toString()
        if (firstname.isBlank()) {
            tilFirstname.error = "Firstname is required"
            error = true
        }
        var lastname = etName.text.toString()
        if (lastname.isBlank()) {
            tilPassword.error = "Password is required"
            error = true
        }
        if (error != true) {
        }


        var email = etEmail.text.toString()
        if (email.isBlank()) {
            tilEmail.error = "Email is required"
            error = true
        }
        var password= etPassword.text.toString()
        if (password.isBlank()) {
            tilPassword.error = "Password is required"
            error = true
        }
        if (error != true) {
        }
    }
}