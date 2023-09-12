package kr.hs.emirim.ex10_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnMain : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMain = findViewById(R.id.btnMain)
        btnMain.setOnClickListener{
            var intent = Intent(applicationContext, SecondActivity::class.java) //내가 시작하고 싶은 엑티브티 이름을 쓰면 된다
            startActivity(intent)

        }
    }
}