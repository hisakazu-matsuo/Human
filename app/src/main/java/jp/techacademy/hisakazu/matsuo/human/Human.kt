package jp.techacademy.hisakazu.matsuo.human

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class Human: Animal {
    //引数付きコンストラクタ
    constructor(name: String, age: Int) : super(name, age) {
    }


    //Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest","私の名前は" + this.name + "です。" + "年は" + this.age + "です。")
    }
}