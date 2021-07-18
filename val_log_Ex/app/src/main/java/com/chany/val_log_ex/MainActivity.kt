package com.chany.val_log_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var value= "여기는 val1입니다."
        val value2="여기는 val2입니다."

//        value="여기는 value가 아닙니다.!"
//        value2="value2는 val이라 못 바꿉니다."
        val test="여기는 테스트 값입니다."
        Log.e("MainActivity",test) //오류
        Log.w("MainActivity",test) //경고
        Log.i("MainActivity",test) //정보
        Log.d("MainActivity",test) //디버그
        Log.v("MainActivity",test) //상세
    }
}