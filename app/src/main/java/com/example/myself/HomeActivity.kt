package com.example.myself

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class HomeActivity : AppCompatActivity() {
    //프로필 화일
    private lateinit var imageView: ImageView
    private val imageArray = arrayOf(
        R.drawable.main,
        R.drawable.dangdang,
        R.drawable.jeju,
        R.drawable.jejui1,
        R.drawable.seol

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val tvUserId = findViewById<TextView>(R.id.bl_id)
        val userId = intent.getStringExtra("userId")
        tvUserId.text = "아이디 :$userId"

        val tvUserName = findViewById<TextView>(R.id.bl_name)
        /*val userName = intent.getStringExtra("username")*/
        tvUserName.text = "💻이름 :사석현"

        val tvUserAge = findViewById<TextView>(R.id.bl_age)
        tvUserAge.text = "🐰🐰나이 : 25"

        val tvUserMb = findViewById<TextView>(R.id.bl_mbti)
        tvUserMb.text = "💊MBTI : ISFJ"

        imageView = findViewById(R.id.p_main)
        setRandomImage()

        // 종료 버튼 클릭 시 SignInActivity로 이동
        findViewById<Button>(R.id.btn_end).setOnClickListener {
            setRandomImage()
            finish()
        }
    }

    private fun setRandomImage() {
        val randomIndex = (imageArray.indices).random()
        val randomImageResource = imageArray[randomIndex]
        imageView.setImageResource(randomImageResource)
    }
}