package jp.techacademy.hisakazu.matsuo.human

import android.os.Bundle
import android.support.v7.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("松尾寿一", 62)
        human.say()
        human. think()

    }
}