package com.example.loguin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {
    private Button btnMas;
    private Button btnMenos;
    private Button btnMultiplo;
    private Button btnDiv;

    private TextView tvResultado;
    private float numero1 = 0.0f;
    private float numero2 = 0.0f;
    private String operador = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        btnMas = findViewById(R.id.btnMas);
        btnMenos = findViewById(R.id.btnMenos);
        btnMultiplo = findViewById(R.id.btnMultiplo);
        btnDiv = findViewById(R.id.btnDiv);
        tvResultado= findViewById(R.id.tvResultado);


    }

    public void escribirCero(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor==0.0f){
            tvResultado.setText("0");
        }else{
            tvResultado.setText(tvResultado.getText() + "0");
        }
    }

    public void escribirUno(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor==0.0f){
            tvResultado.setText("1");
        }else{
            tvResultado.setText(tvResultado.getText() + "1");
        }
    }

    public void escribirDos(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor==0.0f){
            tvResultado.setText("2");
        }else{
            tvResultado.setText(tvResultado.getText() + "2");
        }
    }

    public void escribirTres(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor==0.0f){
            tvResultado.setText("3");
        }else{
            tvResultado.setText(tvResultado.getText() + "3");
        }
    }

    public void escribirCuatro(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor==0.0f){
            tvResultado.setText("4");
        }else{
            tvResultado.setText(tvResultado.getText() + "4");
        }
    }

    public void escribirCinco(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor==0.0f){
            tvResultado.setText("5");
        }else{
            tvResultado.setText(tvResultado.getText() + "5");
        }
    }

    public void escribirSeis(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor==0.0f){
            tvResultado.setText("6");
        }else{
            tvResultado.setText(tvResultado.getText() + "6");
        }
    }

    public void escribirSiete(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor==0.0f){
            tvResultado.setText("7");
        }else{
            tvResultado.setText(tvResultado.getText() + "7");
        }
    }

    public void escribirOcho(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor==0.0f){
            tvResultado.setText("8");
        }else{
            tvResultado.setText(tvResultado.getText() + "8");
        }
    }

    public void escribirNueve(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor==0.0f){
            tvResultado.setText("9");
        }else{
            tvResultado.setText(tvResultado.getText() + "9");
        }
    }

    public void Dividir(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operador ="/";
        tvResultado.setText("0");
    }

    public void Sumar(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operador ="+";
        tvResultado.setText("0");

    }

    public void Restar(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operador ="-";
        tvResultado.setText("0");
    }

    public void Multiplicar(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operador ="x";
        tvResultado.setText("0");
    }

    public void Porcentaje(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operador ="%";
        tvResultado.setText("0");
    }

    public void limpiarTv(View view) {
        tvResultado.setText("0");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operador = "";
    }

    public void borrarDigito(View view) {
        if (tvResultado.getText().toString().length() != 1) {
            tvResultado.setText(tvResultado.getText().toString().substring(0, tvResultado.getText().toString().length() - 1));
        } else {
            tvResultado.setText("0");
        }
    }

    public void GuardarNumero1(View view){
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        tvResultado.setText("0");
    }

    public String Reemplazo(String num){
        if(num.endsWith(".0")) {
            num = num.replace(".0", "");
        }
        return num;
    }

    public void resultadoIgual(View view){
        numero2 = Float.parseFloat(tvResultado.getText().toString());
        String segundo = Reemplazo(tvResultado.getText().toString());

        //Suma
        if(operador == "/"){
            if(numero2 == 0.0f){
                tvResultado.setText("0");
                Toast.makeText(this,"OPERACIÓN NO VÁLIDA",Toast.LENGTH_LONG).show();
            }else{
                float resultado = numero1 / numero2;
                tvResultado.setText(resultado+"");
            }
        }else if(operador == "x"){
            float resultado =  numero1 * numero2;
            tvResultado.setText(resultado+"");

        }else if(operador == "-"){
            float resultado =  numero1 - numero2;
            tvResultado.setText(resultado+"");
        }else if(operador == "+"){
            float resultado =  numero1 + numero2;
            tvResultado.setText(resultado+"");
        }
    }
}