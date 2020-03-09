package jp.techacademy.hisakazu.matsuo.human

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

   override fun onCreate(savedInstanceState: Bundle?) {
          super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_main)



        //val human = Human("松尾", 62)      // 名前を松尾、年齢62歳で、Humanのインスタンスを作る
       val human1= Human()
          human1. say()

       val human2= Human()
          human2. think()


    }
}
