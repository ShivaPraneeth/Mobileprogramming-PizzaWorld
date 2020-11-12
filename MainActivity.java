package com.example.loginandsignup;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.google.firebase.auth.FirebaseAuth;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

   Button OrderDetailsbtn;
   Button Combobtn;



    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OrderDetailsbtn=findViewById(R.id.orderDetails);
        Combobtn=findViewById(R.id.Combo);


        OrderDetailsbtn.setOnClickListener(this);
        Combobtn.setOnClickListener(this);



        listview  = findViewById(R.id.listview);

        String[] values = new String[]{
                "Cheese Pizza", "Veggie Pizza", "Pepporoni Pizza"," Meat Pizza" ,"Margherita Pizza","BBQ Chicken Pizza","Hawaiian Pizza"," Buffalo Pizza"," Supreme Pizza","The Works Pizza"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                android.R.id.text1, values);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0)
                {
                    Intent intent = new Intent(view.getContext(), Activity_Cheesepizza.class);
                    startActivity(intent);
                }
                if(position == 1)
                {
                    Intent intent = new Intent(view.getContext(), Activity_Veggiepizza.class);
                    startActivity(intent);
                }
                if(position == 2)
                {
                    Intent intent = new Intent(view.getContext(), Activity_Pepperonipizza.class);
                    startActivity(intent);
                }
                if(position == 3)
                {
                    Intent intent = new Intent(view.getContext(), Activity_Meatpizza.class);
                    startActivity(intent);
                }
                if(position == 4)
                {
                    Intent intent = new Intent(view.getContext(), Activity_Margheritapizza.class);
                    startActivity(intent);
                }
                if(position == 5)
                {
                    Intent intent = new Intent(view.getContext(), Activity_BBQChickenpizza.class);
                    startActivity(intent);
                }
                if(position == 6)
                {
                    Intent intent = new Intent(view.getContext(), Activity_Hawaiianpizza.class);
                    startActivity(intent);
                }
                if(position == 7)
                {
                    Intent intent = new Intent(view.getContext(), Activity_Buffalopizza.class);
                    startActivity(intent);
                }
                if(position == 8)
                {
                    Intent intent = new Intent(view.getContext(), Activity_Supremepizza.class);
                    startActivity(intent);
                }
                if(position == 9)
                {
                    Intent intent = new Intent(view.getContext(), Activity_Workspizza.class);
                    startActivity(intent);
                }


            }
        });
    }




    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();//logout
        startActivity(new Intent(getApplicationContext(),Login.class));
        finish();
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.orderDetails:
                Intent intent = new Intent(this.getApplicationContext(),orderDetails.class);
                this.startActivity(intent);
                break;
            case R.id.Combo:
                Intent intent1= new Intent(this.getApplicationContext(),Combo.class);
                this.startActivity(intent1);
                break;





        }
    }

}
