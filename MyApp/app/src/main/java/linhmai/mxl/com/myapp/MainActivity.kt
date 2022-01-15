package linhmai.mxl.com.myapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.buttonRoll)
        rollButton.setOnClickListener(){
            rollDice()
        }

    }
    class Dice(val numSide: Int){
        fun roll():Int{
            return (1..numSide).random()
        }

    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView:TextView = findViewById(R.id.textViewRoll)
        resultTextView.text = diceRoll.toString()
    }
    

}