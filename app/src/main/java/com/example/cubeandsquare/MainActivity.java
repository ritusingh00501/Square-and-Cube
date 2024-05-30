package com.example.cubeandsquare;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.*;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText T1=(EditText) findViewById(R.id.Text1);
        EditText T2=(EditText) findViewById(R.id.Text2);
        TextView Cube=(TextView) findViewById(R.id.CubeResult);
        TextView Square=(TextView) findViewById(R.id.SquareResult);
        Button B1=(Button) findViewById(R.id.buttoncube);
        Button B2=(Button) findViewById(R.id.buttonsquare);

        B1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int n1,cube;
                n1=Integer.parseInt(T1.getText().toString().trim());
                //n2=Integer.parseInt(T2.getText().toString().trim());
                cube=n1*n1*n1;
                Cube.setText("Cube of "+n1+" is "+cube);
                Toast.makeText(MainActivity.this, "Cube is"+cube,Toast.LENGTH_SHORT).show();
            }
        });
        B2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int n2,square;
                n2=Integer.parseInt(T2.getText().toString().trim());
                //n2=Integer.parseInt(T2.getText().toString().trim());
                square=n2*n2;
                Square.setText("Cube of "+n2+" is "+square);
                Toast.makeText(MainActivity.this, "Square is"+square,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
