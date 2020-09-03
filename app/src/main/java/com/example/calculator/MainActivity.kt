package com.example.calculator
import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.calculator.viewModel.MyViewModel
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {
    var model = MyViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numberOne.setOnClickListener({model.changeRes(numberOne.text.toString())})
        numberTwo.setOnClickListener({model.changeRes(numberTwo.text.toString())})
        numberThree.setOnClickListener({model.changeRes(numberThree.text.toString())})
        numberFour.setOnClickListener({model.changeRes(numberFour.text.toString())})
        numberFive.setOnClickListener({model.changeRes(numberFive.text.toString())})
        numberSix.setOnClickListener({model.changeRes(numberSix.text.toString())})
        resetBtn.setOnClickListener({model.resetData()})
        sumBtn.setOnClickListener({model.getSum()})
        resultBtn.setOnClickListener({model.result()})

        model.liveData.observe(this, Observer { it: String ->
            textField.text = it
        })
    }


//    fun changeRes (tV: TextView) {
//        if (sum.equals("")) {
//            textField.text = tV.text;
//            sum = textField.text.toString();
//        } else {
//            textField.text = textField.text.toString() + tV.text;
//            sum = textField.text.toString();
//        }
//    }
//
//    fun resetData () {
//        textField.text = "0"
//        sum = ""
//        res.clear()
//    }
//
//    fun getSum () {
//        res.add(textField.text as String)
//        textField.text = "+"
//        sum = ""
//    }
//
//    fun result (){
//        var i:Long = 0
//        res.add(textField.text as String)
//
//        for (key in res) {
//            i += key.toInt()
//        }
//
//        textField.text = i.toString()
//        res.clear()
//    }


}


