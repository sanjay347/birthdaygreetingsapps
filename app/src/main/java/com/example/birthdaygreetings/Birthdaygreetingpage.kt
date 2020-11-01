package com.example.birthdaygreetings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_birthdaygreetingpage.*

class Birthdaygreetingpage : AppCompatActivity() {

    companion object {
        const val NAME_EXTRA = "name_extra"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdaygreetingpage)


        val name = intent.getStringExtra(NAME_EXTRA)
        BirthdayGreeting.text ="Happy Bithday\n$name!!"
    }
}