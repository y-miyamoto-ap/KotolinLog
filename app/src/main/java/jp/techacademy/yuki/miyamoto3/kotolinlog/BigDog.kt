package jp.techacademy.yuki.miyamoto3.kotolinlog

import android.util.Log

class BigDog(name: String, age: Int) : Dog(name, age) {
    override fun say() {
        super.say()
        Log.d("kotlintest", "大きな犬です。")
    }
}