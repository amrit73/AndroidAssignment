package androidassignment.com;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class taxcalculator extends AppCompatActivity implements View.OnClickListener {
    EditText salary;
    Button calculate;
    Double valuestore;
    TextView result;
    GetterSetter getset =new GetterSetter();
    public class GetterSetter {
        public String getSalary() {
            return salary;
        }
        public void setSalary(String salary) {
            this.salary = salary;
        }
        private String salary;
        public String getEnternumbmer() {
            return enternumbmer;
        }
        public void setEnternumbmer(String enternumbmer) {
            this.enternumbmer = enternumbmer;
        }
        private String enternumbmer;
        private String make;
        private String color;
        private String year;
        private String purchase;


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taxcalculator);
        salary=findViewById(R.id.et_salary);
        calculate=findViewById(R.id.btn_calculate);
        result = findViewById(R.id.tv_result);
        calculate.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        getset.setSalary(salary.getText().toString());
        Double salaryy=Double.parseDouble(getset.getSalary());
        Double a= salaryy;
        valuestore= a*12;
        switch (v.getId()){
            case R.id.btn_calculate:
                if(valuestore>=1 && valuestore<200000){
                    Double tax = (valuestore/100);
                    result.setText("Your tax amount is RS" + tax.toString());
                    Toast.makeText(this, "Tax amount is low", Toast.LENGTH_SHORT).show();
                }
                else if (valuestore>=200000 && valuestore<350000){
                    Double tax= 2000 +((valuestore -200000)* 0.15);
                    result.setText("Your tax amount is RS" + tax.toString());
                    Toast.makeText(this, "Tax amount is medium", Toast.LENGTH_SHORT).show();
                }
                else if(valuestore>=350000){
                    Double tax= 2000 + 22500 +((valuestore - 350000)*0.25);
                    result.setText("Your tax amount is RS" + tax.toString());
                    Toast.makeText(this, "Tax amount is high", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
