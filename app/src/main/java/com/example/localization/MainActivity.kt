package com.example.localization

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var greetingTextView: TextView

    var name =" David"

    val deck= mutableListOf<Card>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        greetingTextView= findViewById(R.id.welcomeTextView)

        val button= findViewById<Button>(R.id.button)

        button.setOnClickListener {
        buttonPressed()
        }

        //--------------------------
        createDeck()
        val currentCard = deck[1]
        val card2 = deck[0]

        if (currentCard.value> card2.value){
            Log.d("!!!", "${currentCard.suite} ${currentCard.value}" + "är större än ${card2} ${card2.value}")
        }

        //deck.shuffle()    blandar korten


        // ge värde till en bild

        val imageView = findViewById<ImageView>(R.id.imageView)
        //väljer kort som ska visas upp
        imageView.setImageResource(currentCard.image)







    }

    fun createDeck (){
        val card = Card (R.drawable.animal, 1, "clubs")
        val card1 = Card (R.drawable.animal, 2, "clubs")

        deck.add(card)
        deck.add(card1)

    }

    fun buttonPressed(){
    greetingTextView.text=getString(R.string.new_greeting, name)

    }

}