package androidassignment.com;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class bmicalculator extends AppCompatActivity {
    EditText height,weight;
    Button compute;
    Double ansswer;
    TextView result;
    Double weight1, height1;
    GetterSetter getset= new GetterSetter();
    public class GetterSetter {
        public String getHeight() {
            return height;
        }
        public void setHeight(String height) {
            this.height = height;
        }
        public String getWeight() {
            return weight;
        }
        public void setWeight(String weight) {
            this.weight = weight;
        }
        private String height;
        private String weight;

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalculator);
        height=findViewById(R.id.height);
        weight=findViewById(R.id.weight);
        compute=findViewById(R.id.computebmi);
        result=findViewById(R.id.txtresult);

        compute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getset.setHeight(height.getText().toString());
                getset.setWeight(weight.getText().toString());

                Double heightt= Double.parseDouble(getset.getHeight());
                Double weightt = Double.parseDouble(getset.getWeight());

                Double a = heightt;
                Double b = weightt;
                ansswer = b/((a*a)/10000);
                result.setText(ansswer.toString());
                switch (v.getId()){
                    case R.id.computebmi:
                        if(ansswer<18.5){
                            Toast.makeText(bmicalculator.this, "Category: Underweight", Toast.LENGTH_SHORT).show();
                        }
                        else if (ansswer>=18.5 && ansswer<=24.9 ){
                            Toast.makeText(bmicalculator.this, "Category: Normal Weight", Toast.LENGTH_SHORT).show();

                        }
                        else if (ansswer>=25 && ansswer<=29.9){
                            Toast.makeText(bmicalculator.this, "Category: Overweight", Toast.LENGTH_SHORT).show();
                        }
                        else if(ansswer >=30){
                            Toast.makeText(bmicalculator.this, "Category: Obesity", Toast.LENGTH_SHORT).show();

                        }
                        break;
                }
            }
        });
    }
}
