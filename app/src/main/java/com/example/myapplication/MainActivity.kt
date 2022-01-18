package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var liczba = 1;

        when(liczba)
        {
            0 -> liczba = 4;
            1 -> findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.ash_greninja);
            2 -> findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.nebby_solgaleo);
            3 -> findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.nebby_solgaleo);
            4 -> findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.nebby_solgaleo);
            5 -> liczba = 1;
            else -> liczba =1;
        }

        findViewById<Button>(R.id.zmianaObrazkaDOWN).setOnClickListener {
            if (liczba == 1)
                liczba = 4;
            else
                liczba -=1;

            if(liczba == 1)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.ash_greninja);
            else if(liczba == 2)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.nebby_solgaleo);
            else if(liczba == 3)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.ash_krookodile);
            else if(liczba == 4)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.ash_noivern);



        }
        findViewById<Button>(R.id.zmianaObrazkaUP).setOnClickListener {
            if (liczba == 4)
                liczba = 1;
            else
                liczba +=1;

            if(liczba == 1)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.ash_greninja);
            else if(liczba == 2)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.nebby_solgaleo);
            else if(liczba == 3)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.ash_krookodile);
            else if(liczba == 4)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.ash_noivern);
        }
    }
}