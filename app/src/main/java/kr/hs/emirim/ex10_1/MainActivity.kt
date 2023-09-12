package kr.hs.emirim.ex10_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    lateinit var btnMain : Button
    lateinit var radioGroup : RadioGroup
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var intent: Intent

        btnMain = findViewById(R.id.btnMain)
        radioGroup = findViewById(R.id.radioGroup)
        intent = Intent(applicationContext, SecondActivity::class.java)

        btnMain.setOnClickListener{
            if(radioGroup.checkedRadioButtonId == R.id.radioButton){
                intent = Intent(applicationContext, SecondActivity::class.java)
            }else
                intent = Intent(applicationContext,ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}