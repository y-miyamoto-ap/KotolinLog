package jp.techacademy.yuki.miyamoto3.kotolinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var human = Human("田中", 30, "Kotlin")
        human.say()
        human.think()

        human = Human("鈴木", 43, "Log")
        human.say()
        human.think()
    }
}