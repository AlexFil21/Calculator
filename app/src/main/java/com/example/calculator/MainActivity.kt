package com.example.calculator
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.calculator.viewModel.MyViewModel
import kotlinx.android.synthetic.main.activity_main.*


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


}


