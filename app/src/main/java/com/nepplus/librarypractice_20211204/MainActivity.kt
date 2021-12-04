package com.nepplus.librarypractice_20211204

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    fun setupEvents(){

        btnCall.setOnClickListener {

//            전화 연결 해도 되는지 권한 확인 -> ok 일때만 전화연결.



//            010-2222-5555 에 실제 전화 연결

            val myUri = Uri.parse("tel:010-2222-5555")
            val myIntent = Intent(Intent.ACTION_CALL, myUri)
            startActivity(myIntent)

        }

        imgProfile.setOnClickListener {

            val myIntent = Intent(this, ViewPhotoActivity::class.java)
            startActivity(myIntent)

        }

    }

    fun setValues(){}

}