package com.example.myself

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class HomeActivity : AppCompatActivity() {//프로필 화일
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val tvUserId = findViewById<TextView>(R.id.bl_id)
        val userId = intent.getStringExtra("userId")
        tvUserId.text = "아이디 :$userId"

        val tvUserName = findViewById<TextView>(R.id.bl_name)
        val userName = intent.getStringExtra("username")
        tvUserName.text = "이름 :$userName"



        // 종료 버튼 클릭 시 SignInActivity로 이동
        findViewById<Button>(R.id.btn_end).setOnClickListener {
            finish()
        }
    }
}