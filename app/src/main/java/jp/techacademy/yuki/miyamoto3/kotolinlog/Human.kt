package jp.techacademy.yuki.miyamoto3.kotolinlog

import android.util.Log

open class Human: Animal, Thinkable {
    // 引数付きコンストラクタ
    constructor(name: String, age: Int): super(name, age) {
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }

    // Movableインターフェイスのメソッドをオーバーライド
    override fun think(hobby: String) {
        Log.d("kotlintest",  "「私は" + hobby + "について考える。」")
    }
}