package jp.techacademy.hisakazu.matsuo.human

import android.os.Bundle
import android.support.v7.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("松尾寿一", 62,"Golf")
        human1.say()
        human1.think()
        val human2 = Human ("松尾", 30,"Tennis")
        human2.say()
        human2. think()

    }
}