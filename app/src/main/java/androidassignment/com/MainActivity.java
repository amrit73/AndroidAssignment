package androidassignment.com;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bmicalculator,tax,car,digittoword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bmicalculator =findViewById(R.id.bmicalculator);
        tax=findViewById(R.id.taxcalculator);
        car=findViewById(R.id.car);
        digittoword=findViewById(R.id.digitwordconverter);
        bmicalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, bmicalculator.class);
                startActivity(intent);
            }
        });
        tax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, taxcalculator.class);
                startActivity(intent);

            }
        });
        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, caradd.class);
                startActivity(intent);
            }
        });
        digittoword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, digitnumberconverter.class);
                startActivity(intent);
            }
        });


    }
}
