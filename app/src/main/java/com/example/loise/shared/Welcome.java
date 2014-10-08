package com.example.loise.shared;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.loise.shared.R;

public class Welcome extends Activity implements View.OnClickListener {
    TextView tvfirstname,tvpassword,tvlastname,tvemail;
    EditText etfirstname,etlastname,etemail,etpassword;
    Button btnlogin,btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome2);
        //initialization of values
        etfirstname = (EditText) findViewById(R.id.etfirstname);
        etlastname = (EditText) findViewById(R.id.etlastname);
        etemail  = (EditText) findViewById(R.id.etemail);
        etpassword = (EditText) findViewById(R.id.etpassword);
        btnlogin = (Button) findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(this);
        btnsubmit = (Button) findViewById(R.id.btnsubmit);
        btnsubmit.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.welcome, menu);
        return true;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnlogin:
                Toast .makeText(getApplication(),"login" ,Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplication(),LoginScreen.class));
                break;
            case R.id.btnsubmit:
                String password = "njoki";
                String userName = "loise";
                if(etemail.getText().toString().equals("")&& etpassword.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Fill in the empty fileds", Toast.LENGTH_SHORT).show();
                }
                //check if the userName is entered
                else if(etemail.getText().toString().equals(userName))
                {
                    Toast.makeText(getApplicationContext(), "Fill in the empty fileds", Toast.LENGTH_SHORT).show();
                }
                else if(etpassword.getText().toString().equals(password)){
                    Toast.makeText(getApplicationContext(), "fill in your password", Toast.LENGTH_SHORT).show();
                }
                else if(!etemail.getText().toString().equals(userName)){
                    Toast.makeText(getApplicationContext(), "username not correct", Toast.LENGTH_SHORT).show();
                }
                else if(!etpassword.getText().toString().equals(password)){
                    Toast.makeText(getApplicationContext(), "fill the correct password", Toast.LENGTH_SHORT).show();
                }
                else if (etemail.getText().toString().equals(userName) &&
                        etpassword.getText().toString().equals(password)){
                    Toast.makeText(getApplicationContext(), "login is success", Toast.LENGTH_SHORT).show();
                }
                Toast .makeText(getApplication(),"submit",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),HomeScreen.class));
                break;
            default:
                break;

        }


    }
}
