package com.harshita.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun createbirthdaycard(view: View) {
        val intent =  Intent(this, BirthdayGreetingActivity::class.java)
        val name= editText.editableText.toString()
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA,name)
        Toast.makeText(this,"button was $name",Toast.LENGTH_SHORT).show()
        startActivity(intent)

    }
}