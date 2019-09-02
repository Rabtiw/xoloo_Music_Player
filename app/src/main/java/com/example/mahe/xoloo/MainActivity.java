package com.example.mahe.xoloo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    static String pass,passn,usern,user,s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usern="rishabh";
        passn="mit123";

    }
    public void display(View view)
    {
        EditText editText=(EditText)findViewById(R.id.editText);
        pass=editText.getText().toString();
        EditText editText2=(EditText)findViewById(R.id.editText2);
        user=editText2.getText().toString();
        if(usern.compareTo(user)==0)
        {
            if(pass.equalsIgnoreCase(passn))
            {
                Toast toast=Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                toast.show();
                Intent intent=new Intent(this,musiclist.class);
                startActivity(intent);
            }
            else
            {
                Toast toast=Toast.makeText(getApplicationContext(),"Login Unsuccessful",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                toast.show();
            }
        }
        else
        {
            Toast toast=Toast.makeText(getApplicationContext(),"Login Unsuccessful.",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
            toast.show();
        }

    }
}
