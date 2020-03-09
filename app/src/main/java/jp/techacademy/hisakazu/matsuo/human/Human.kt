package jp.techacademy.hisakazu.matsuo.human

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*

open class Human: Animal, Thinkable {
    //引数付きコンストラクタ
    constructor(name: String="`松尾寿一", age: Int=62) : super(name, age) {

       }


    //Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest","私の名前は" + this.name + "です。" + "年は" + this.age + "です。")
    }



    //Thinkableクラスのメソッドをオーバーライド
    override fun think() {
        val hobby= "Golf"
        Log.d("kotlintest","私は" +hobby  +"について考える。")
    }


}