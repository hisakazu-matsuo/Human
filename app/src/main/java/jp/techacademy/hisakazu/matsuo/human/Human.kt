package jp.techacademy.hisakazu.matsuo.human

import android.util.Log

open class Human: Animal, Thinkable {

    var hobby: String="Golf"

    //引数付きコンストラクタ
    constructor(name: String = "", age: Int=0) : super(name, age) {
    }

    //Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。" + "年は" + this.age + "です。")
    }

    override fun think(){
            Log.d("kotlintest", "私は" + hobby + "について考える。")
        }
}

