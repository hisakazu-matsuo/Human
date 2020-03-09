package jp.techacademy.hisakazu.matsuo.human

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

   override fun onCreate(savedInstanceState: Bundle?) {
          super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_main)

       val human1= Human("松尾", 62,"Golf")
          human1. say()
          human1. think()

    }
}
//再度Push