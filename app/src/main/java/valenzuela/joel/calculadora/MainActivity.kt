package valenzuela.joel.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import valenzuela.joel.calculadora.R.id

class MainActivity : AppCompatActivity() {
    var numero1 = ""
    var numero2 = ""
    var resultado = 0
    var operando:Char = 'c'
    val btnC: Button = findViewById(id.btnC)
    val btn0: Button = findViewById(id.btn0)
    val btn1: Button = findViewById(id.btn1)
    val btn2: Button = findViewById(id.btn2)
    val btn3: Button = findViewById(id.btn3)
    val btn4: Button = findViewById(id.btn4)
    val btn5: Button = findViewById(id.btn5)
    val btn6: Button = findViewById(id.btn6)
    val btn7: Button = findViewById(id.btn7)
    val btn8: Button = findViewById(id.btn8)
    val btn9: Button = findViewById(id.btn9)
    val btnSuma: Button = findViewById(id.btnSuma)
    val btnResta: Button = findViewById(id.btnResta)
    val btnMultiplicacion: Button = findViewById(id.btnMultiplicacion)
    val btnDivision: Button = findViewById(id.btnDividir)
    val btnResultado: Button = findViewById(id.btnResultado)
    val numSuperior: TextView = findViewById(id.numSuperior)
    val numInferior: TextView = findViewById(id.numInferior)
    val areaNum: TextView = findViewById(id.areaNum)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        areaNum.setBackgroundResource(R.color.lightgray)

        btnC.setOnClickListener {
            numSuperior.setText("")
            numInferior.setText("0")
            numero1 = ""
            numero2 = ""
            resultado = 0
        }
        btn0.setOnClickListener {
            if(!numeroMayor10Digitos()){
                numero1 += "0"
                numInferior.setText(numero1)
            }
        }
        btn1.setOnClickListener {
            if(!numeroMayor10Digitos()){
                numero1 += "1"
                numInferior.setText(numero1)
            }
        }
        btn2.setOnClickListener {
            if(!numeroMayor10Digitos()){
                numero1 += "2"
                numInferior.setText(numero1)
            }
        }
        btn3.setOnClickListener {
            if(!numeroMayor10Digitos()){
                numero1 += "3"
                numInferior.setText(numero1)
            }
        }
        btn4.setOnClickListener {
            if(!numeroMayor10Digitos()){
                numero1 += "4"
                numInferior.setText(numero1)
            }
        }
        btn5.setOnClickListener {
            if(!numeroMayor10Digitos()){
                numero1 += "5"
                numInferior.setText(numero1)
            }
        }
        btn6.setOnClickListener {
            if(!numeroMayor10Digitos()){
                numero1 += "6"
                numInferior.setText(numero1)
            }
        }
        btn7.setOnClickListener {
            if(!numeroMayor10Digitos()){
                numero1 += "7"
                numInferior.setText(numero1)
            }
        }
        btn8.setOnClickListener {
            if(!numeroMayor10Digitos()){
                numero1 += "8"
                numInferior.setText(numero1)
            }
        }
        btn9.setOnClickListener {
            if(!numeroMayor10Digitos()){
                numero1 += "9"
                numInferior.setText(numero1)
            }
        }
        btnSuma.setOnClickListener {
            numSuperior.setText(numero1)
            numInferior.setText("0")
            var temp = numero1
            numero2 = temp
            numero1 = ""
            operando = '+'
        }
        btnResta.setOnClickListener {
            numSuperior.setText(numero1)
            numInferior.setText("0")
            var temp = numero1
            numero2 = temp
            numero1 = ""
            operando = '-'
        }
        btnMultiplicacion.setOnClickListener {
            numSuperior.setText(numero1)
            numInferior.setText("0")
            var temp = numero1
            numero2 = temp
            numero1 = ""
            operando = '*'
        }
        btnDivision.setOnClickListener {
            numSuperior.setText(numero1)
            numInferior.setText("0")
            var temp = numero1
            numero2 = temp
            numero1 = ""
            operando = '/'
        }
        btnResultado.setOnClickListener {
            numSuperior.setText("")
            numInferior.setText(obtenerResultado(operando).toString())

        }
    }
    fun obtenerResultado(operando:Char):Float{
        var operacion = numero1 + operando + numero2
        return operacion.toFloat()
    }
    fun numeroMayor10Digitos():Boolean{
        if(numero1.length > 10){
            return true
        }else{
            return false
        }
    }
}