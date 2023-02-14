package com.example.yash_khopkar_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,
            buttondot,buttonclr,buttonmul,buttonadd,buttonsub,buttondiv,buttoneql;

    TextView textView;
    String ans;
    float Valueone, Valuetwo;
    boolean Addition,Substraction,Multiplication,Division,equal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);
        button9=(Button)findViewById(R.id.button9);
        buttondot=(Button)findViewById(R.id.buttondot);
        button10=(Button)findViewById(R.id.button10);
        buttonadd=(Button)findViewById(R.id.buttonadd);
        buttonsub=(Button)findViewById(R.id.buttonsub);
        buttondiv=(Button)findViewById(R.id.buttondiv);
        buttonmul=(Button)findViewById(R.id.buttonmul);
        buttoneql=(Button)findViewById(R.id.buttoneql);
        buttonclr=(Button)findViewById(R.id.buttonclr);
        textView=(TextView) findViewById(R.id.Text);

            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    check();
                    textView.setText(textView.getText() + "1");
                }
            });
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    check();
                    textView.setText(textView.getText() + "2");
                }
            });
            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    check();
                    textView.setText(textView.getText() + "3");
                }
            });
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    check();
                    textView.setText(textView.getText() + "4");

                }
            });
            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    check();
                    textView.setText(textView.getText() + "5");
                }
            });
            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    check();
                    textView.setText(textView.getText() + "6");
                }
            });
            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    check();
                    textView.setText(textView.getText() + "7");
                }
            });
            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    check();
                    textView.setText(textView.getText() + "8");
                }
            });
            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    check();
                    textView.setText(textView.getText() + "9");
                }
            });
            button10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    check();
                    textView.setText(textView.getText() + "0");
                }
            });
            buttondot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    check();
                    textView.setText(textView.getText() + ".");
                }
            });
            buttonadd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    check();
                    textView.setText(textView.getText() + "+");
                }
            });
            buttonsub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    check();
                    textView.setText(textView.getText() + "-");
                }
            });
            buttonmul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    check();
                    textView.setText(textView.getText() + "*");
                }
            });
            buttondiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    check();
                    textView.setText(textView.getText() + "/");
                }
            });
            buttoneql.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String txt = textView.getText().toString();
                    try {
                        Expression expression = null;
                        try {
                            expression = new ExpressionBuilder(txt).build();
                            double result = expression.evaluate();
                            textView.setText(txt + "=" + result + " ");
                        } catch (Exception e) {
                            textView.setText("Error");
                        }
                    } catch (ArithmeticException a) {
                        textView.setText("Error");
                    }


                }
            });
        buttonclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
            }
        });
    }
    public void check() {
        if (textView.getText().toString().contains(" 1") || textView.getText().toString().contains(" 2")
                || textView.getText().toString().contains(" 3") || textView.getText().toString().contains(" 4")
                || textView.getText().toString().contains(" 5") || textView.getText().toString().contains(" 6")
                || textView.getText().toString().contains(" 7") || textView.getText().toString().contains(" 8")
                || textView.getText().toString().contains(" 9") || textView.getText().toString().contains(" 0")) {

            String a = textView.getText().toString();
            String b[] = a.split(" ");
            textView.setText(b[1]);
        }
    }
}