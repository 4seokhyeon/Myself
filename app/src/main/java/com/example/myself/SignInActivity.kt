package com.example.myself

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SignInActivity : AppCompatActivity() {
    //아이디 입력하는 화면
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editId = findViewById<TextView>(R.id.in_id1)
        val userId=intent.getStringExtra("userid")
        editId.setText(userId)
        val editPassword = findViewById<TextView>(R.id.in_pw1)
        val userPw = intent.getStringExtra("userpassward")
        editPassword.setText(userPw)

        val btnLogin = findViewById<Button>(R.id.button3)
        val btnSignUp = findViewById<Button>(R.id.button4)

        btnLogin.setOnClickListener {
            val id = editId.text.toString()
            val password = editPassword.text.toString()

            if (id.isNotEmpty() && password.isNotEmpty()) {
                // 로그인 성공
                Toast.makeText(this, "로그인 성공", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("userId", id)


                startActivity(intent)

            } else {
                // 아이디 또는 비밀번호가 비어있음
                Toast.makeText(this, "아이디/비밀번호를 확인해주세요", Toast.LENGTH_SHORT).show()
            }
        }

        btnSignUp.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}