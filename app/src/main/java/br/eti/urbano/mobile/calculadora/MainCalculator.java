package br.eti.urbano.mobile.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainCalculator extends AppCompatActivity {

    private EditText txt_result, concatena;
    float numA = 0;
    String operacao = "";

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn_vir, btn0, btnsomar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calculator);

        //Capturando o txt que está na activity, e iniciando com 0
        txt_result = (EditText) findViewById(R.id.txt_result);
        txt_result.setText("");


        btn1 = (Button)findViewById(R.id.btn_1);
        btn2 = (Button)findViewById(R.id.btn_2);
        btn3 = (Button)findViewById(R.id.btn_3);
        btn4 = (Button)findViewById(R.id.btn_4);
        btn5 = (Button)findViewById(R.id.btn_5);
        btn6 = (Button)findViewById(R.id.btn_6);
        btn7 = (Button)findViewById(R.id.btn_7);
        btn8 = (Button)findViewById(R.id.btn_8);
        btn9 = (Button)findViewById(R.id.btn_9);
        btn0 = (Button)findViewById(R.id.btn_0);
        btn_vir = (Button)findViewById(R.id.btn_virg);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatena = (EditText)findViewById(R.id.txt_result);
                txt_result.setText(concatena.getText().toString()+ "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatena = (EditText)findViewById(R.id.txt_result);
                txt_result.setText(concatena.getText().toString()+ "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatena = (EditText)findViewById(R.id.txt_result);
                txt_result.setText(concatena.getText().toString()+ "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatena = (EditText)findViewById(R.id.txt_result);
                txt_result.setText(concatena.getText().toString()+ "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatena = (EditText)findViewById(R.id.txt_result);
                txt_result.setText(concatena.getText().toString()+ "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatena = (EditText)findViewById(R.id.txt_result);
                txt_result.setText(concatena.getText().toString()+ "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatena = (EditText)findViewById(R.id.txt_result);
                txt_result.setText(concatena.getText().toString()+ "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatena = (EditText)findViewById(R.id.txt_result);
                txt_result.setText(concatena.getText().toString()+ "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatena = (EditText)findViewById(R.id.txt_result);
                txt_result.setText(concatena.getText().toString()+ "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatena = (EditText)findViewById(R.id.txt_result);
                txt_result.setText(concatena.getText().toString()+ "0");
            }
        });

        btn_vir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatena = (EditText)findViewById(R.id.txt_result);
                txt_result.setText(concatena.getText().toString()+ ",");
            }
        });


    }






    public void  Calculo(String tipoOperacao){
        numA = Float.parseFloat(txt_result.getText().toString());
        operacao = tipoOperacao;
        txt_result.setText("");
    }

    public void mostraResultado (){
        float numB = Integer.parseInt(txt_result.getText().toString());
        float result = 0;

        if (operacao.equals("+")){
            result = numB + numA;
        } else {
            result = 0;
        }

        if (operacao.equals("-")){
            result = numA - numB;
        } else {
            result = 0;
        }


        if (operacao.equals("/")){
            result = numA / numB;
        } else {
            result = 0;
        }

        if (operacao.equals("*")){
            result = numB * numA;
        } else {
            result = 0;
        }

        txt_result.setText(String.valueOf(result));

    }



    public void Clicarbotao(View view) {

        switch (view.getId()){
            case R.id.btn_limpar:
                txt_result.setText("");
                numA = 0;
                operacao = "";
                break;
            case R.id.btn_soma:
                Calculo("+");
                break;
            case R.id.btn_subtracao:
                concatena = (EditText)findViewById(R.id.txt_result);
                txt_result.setText(concatena.getText().toString());
                Calculo("-");
                break;
            case R.id.btn_multiplicacao:
                Calculo("*");
                break;
            case R.id.btn_divisao:
                Calculo("/");
                break;
            case R.id.btn_result:
                mostraResultado();
                break;

            default:

                break;
        }
    }





}
