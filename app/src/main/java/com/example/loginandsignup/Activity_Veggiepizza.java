package com.example.loginandsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Veggiepizza extends AppCompatActivity implements View.OnClickListener {
    Button orderbtn;
    Button homebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__veggiepizza);
        orderbtn= findViewById(R.id.order);
        orderbtn.setOnClickListener(this);
        homebtn=findViewById(R.id.home);
        homebtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.order:
                Intent intent = new Intent(this.getApplicationContext(),activity_order.class);
                this.startActivity(intent);
                break;
            case R.id.home:
                Intent intent1 = new Intent(this.getApplicationContext(),MainActivity.class);
                this.startActivity(intent1);
                break;
        }
    }
}