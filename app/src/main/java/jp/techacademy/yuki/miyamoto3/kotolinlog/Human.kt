package jp.techacademy.yuki.miyamoto3.kotolinlog

import android.util.Log

open class Human(
    name: String, age: Int,
    var hobby: String
) : Animal(name, age), Thinkable {

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }

    // Movableインターフェイスのメソッドをオーバーライド
    override fun think() {
        Log.d("kotlintest",  "「私は" + this.hobby + "について考える。」")
    }
}