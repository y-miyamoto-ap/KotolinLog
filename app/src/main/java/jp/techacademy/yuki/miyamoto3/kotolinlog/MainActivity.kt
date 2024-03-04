package jp.techacademy.yuki.miyamoto3.kotolinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var human = Human("田中", 30)
        human.say()
        human.think("Humanクラス")

        human = Human("鈴木", 43)
        human.say()
        human.think("定義")
    }
}