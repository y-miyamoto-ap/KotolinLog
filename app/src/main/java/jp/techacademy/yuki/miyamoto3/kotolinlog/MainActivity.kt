package jp.techacademy.yuki.miyamoto3.kotolinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("田中", 30, "Kotlin")
        val human2 = Human("鈴木", 43, "Log")

        human1.say()
        human1.think()

        human2.say()
        human2.think()
    }
}