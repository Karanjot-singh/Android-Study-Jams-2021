package com.cybertron.omnitrix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun change(view :View){
        val omnitrix : ImageButton = findViewById(R.id.button)
//        button
        val character: ImageView= findViewById(R.id.character)

        val x : Int = (1..8).random()

        when(x){
            1 ->{character.setImageResource(R.drawable.canon)            }
            2 ->character.setImageResource(R.drawable.wild)
            3 ->character.setImageResource(R.drawable.diamond)
            4 ->character.setImageResource(R.drawable.fire)
            5 ->character.setImageResource(R.drawable.four)
            6 ->character.setImageResource(R.drawable.grey)
            7 ->character.setImageResource(R.drawable.humung)
            8 ->character.setImageResource(R.drawable.wild)

//            9-> character.setImageResource(R.drawable.humung)

        }


    }
}