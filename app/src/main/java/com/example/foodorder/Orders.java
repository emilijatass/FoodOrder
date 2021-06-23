package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Orders extends AppCompatActivity {

Button pizzabutton,burgerbutton,caesarsaladbutton,pastabutton;


//declaring a string to take my choices in it
     String choices=" ";
     Double price=0.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        pizzabutton=(Button) findViewById(R.id.pizzabutton);
        burgerbutton=(Button) findViewById(R.id.burgerbutton);
        caesarsaladbutton=(Button) findViewById(R.id.caesarsaladbutton);
        pastabutton=(Button) findViewById(R.id.pastabutton);


    }
    public void add_to_list(View view){

        if(view==findViewById(R.id.pizzabutton)){
            choices= choices +"pizza"+"\n";
            price=price+40;
        }
        else if(view==findViewById(R.id.burgerbutton)){
            choices= choices +"burger"+"\n";
            price=price+25;
        }
        else if(view==findViewById(R.id.caesarsaladbutton)){
            choices= choices +"caesarsalad"+"\n";
            price=price+50;
        }
        else if(view==findViewById(R.id.pastabutton))
        {
            choices= choices +"pasta"+"\n";
            price=price+50;
        }

    }

    public void makeOrder(View view){

        Intent i=new Intent(Orders.this,OrderDetails.class);
        Bundle bundle=new Bundle();
        bundle.putString("choices",choices);
        bundle.putDouble("price",price);
        i.putExtras(bundle);
        startActivity(i);
    }
}
