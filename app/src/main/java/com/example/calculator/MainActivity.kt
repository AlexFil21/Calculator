package com.example.calculator
import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {
    var res: ArrayList<String> = ArrayList();
    var sum: String = "";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.setOnClickListener({changeRes(textView)})
        textView1.setOnClickListener({changeRes(textView1)})
        textView2.setOnClickListener({changeRes(textView2)})
        textView4.setOnClickListener({changeRes(textView4)})
        textView5.setOnClickListener({changeRes(textView5)})
        textView6.setOnClickListener({changeRes(textView6)})
        textViewC.setOnClickListener({resetData()})
        textViewPlus.setOnClickListener({getSum()})
        textViewCompare.setOnClickListener({result()})
    }

    fun changeRes (tV: TextView) {
        if (sum.equals("")) {
            text.text = tV.text;
            sum = text.text.toString();
        } else {
            text.text = text.text.toString() + tV.text;
            sum = text.text.toString();
        }
    }

    fun resetData () {
        text.text = "0"
        sum = ""
        res.clear()
    }

    fun getSum () {
        res.add(text.text as String)
        text.text = "+"
        sum = ""
    }

    fun result (){
        var i:Int = 0
        res.add(text.text as String)

        for (key in res) {
            i += key.toInt()
        }

        text.text = i.toString()
        res.clear()
    }


}

