package jp.techacademy.yuki.miyamoto3.kotolinlog

import android.util.Log

open class Human: Animal, Thinkable {
    // 引数付きコンストラクタ
    var hobby: String
    constructor(name: String, age: Int, hobby:String): super(name, age) {
        this.hobby = hobby
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }

    // Movableインターフェイスのメソッドをオーバーライド
    override fun think() {
        Log.d("kotlintest",  "「私は" + this.hobby + "について考える。」")
    }
}