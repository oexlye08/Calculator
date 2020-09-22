package id.my.okisulton.kotlinsimplecalculator

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var nomer1: Int? =null
    var nomer2: Int? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @SuppressLint("SetTextI18n")
    fun sum(view: View) {

        if (number1.text.toString().equals("") ){
            number1.setError("Masukkan nomor")
        }else if(number2.text.toString().equals("")){
            number2.setError("Masukkan nomor")
        }else{
            val a = number1.text.toString().toInt()
            val b = number2.text.toString().toInt()
            val result = a + b

            textView.text = "Result is : $result"
        }
    }

    @SuppressLint("SetTextI18n")
    fun sub(view: View) {
        if (number1.text.toString().equals("") ){
            number1.setError("Masukkan nomor")
        }else if(number2.text.toString().equals("")){
            number2.setError("Masukkan nomor")
        }else{
            val a = number1.text.toString().toInt()
            val b = number2.text.toString().toInt()
            val result = a - b

            textView.text = "Result is : $result"
        }
    }
    @SuppressLint("SetTextI18n")
    fun multiply(view: View) {
        if (number1.text.toString().equals("") ){
            number1.setError("Masukkan nomor")
        }else if(number2.text.toString().equals("")){
            number2.setError("Masukkan nomor")
        }else{
            val a = number1.text.toString().toInt()
            val b = number2.text.toString().toInt()
            val result = a * b

            textView.text = "Result is : $result"
        }
    }
    @SuppressLint("SetTextI18n")
    fun div(view: View) {
        if (number1.text.toString().equals("") ){
            number1.setError("Masukkan nomor")
        }else if(number2.text.toString().equals("")){
            number2.setError("Masukkan nomor")
        }else{
            val a = number1.text.toString().toInt()
            val b = number2.text.toString().toInt()
            val result = a / b

            textView.text = "Result is : $result"
        }
    }
}

