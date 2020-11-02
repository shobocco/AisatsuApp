package jp.techacademy.shirou.ogata.aisatsuapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.app.TimePickerDialog
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
    }

    override fun onClick(v:View){
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->


                if(hour >= 2 && hour <=9){
                    //2時～9時
                    textView2.text = "おはよう"

                }else if(hour >= 10 && hour <= 17){
                    //10時～17時
                    textView2.text = "こんにちは"
                }else {
                    //18時～1時
                    textView2.text = "こんばんは"
                }
            },
            13, 0, true)
        timePickerDialog.show()

    }
}
