package com.example.myself

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class SignUpActivity : AppCompatActivity() {

    private lateinit var in_name: EditText
    private lateinit var in_id: EditText
    private lateinit var in_pw: EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)


        in_name = findViewById(R.id.in_name)
        in_id = findViewById(R.id.in_id)
        in_pw = findViewById(R.id.in_pw)


        val btn_sig = findViewById<Button>(R.id.btn_sig)
        btn_sig.setOnClickListener {
            val resultIntent = Intent(this,SignInActivity::class.java)
            resultIntent.putExtra("name",in_name.text.toString())
            resultIntent.putExtra("ID",in_id.text.toString())
            resultIntent.putExtra("pw",in_pw.text.toString())
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }
    }
}