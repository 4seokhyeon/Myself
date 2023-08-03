package com.example.myself

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //회원가입 화
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val editName = findViewById<EditText>(R.id.in_name)
        val editId = findViewById<EditText>(R.id.in_id)
        val editPassword = findViewById<EditText>(R.id.in_pw)
        val btnSignUp = findViewById<Button>(R.id.btn_sig)


        btnSignUp.setOnClickListener {
            val id = editId.text.toString()
            val password = editPassword.text.toString()
            val name = editName.text.toString()

            if (name.isNotEmpty() && id.isNotEmpty() && password.isNotEmpty()) {
                // 회원가입 성공
                Toast.makeText(this, "회원가입 성공", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, SignInActivity::class.java)
                intent.putExtra("userid",id)
                intent.putExtra("userpassward",password)
                intent.putExtra("username",name)
                startActivity(intent)
                //finish()
            } else {
                // 입력되지 않은 정보가 있음
                Toast.makeText(this, "입력되지 않은 정보가 있습니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}