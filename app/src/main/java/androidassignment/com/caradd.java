package androidassignment.com;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class caradd extends AppCompatActivity {
    EditText make, year, color, purchase, engine;
    TextView resultmake, resultyear, resultcolor, resultpurchase, resultengine, display;
    Button createcarr, creatediesel;
    GetterSetter getset = new GetterSetter();
    public class GetterSetter {

        private String enternumbmer;
        private String make;
        private String color;
        private String year;
        private String purchase;

        public String getMake() {
            return make;
        }
        public void setMake(String make) {
            this.make = make;
        }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public String getYear() {
            return year;
        }
        public void setYear(String year) {
            this.year = year;
        }
        public String getPurchase() {
            return purchase;
        }
        public void setPurchase(String purchase) {
            this.purchase = purchase;
        }
        public String getEngine() {
            return engine;
        }
        public void setEngine(String engine) {
            this.engine = engine;
        }
        private String engine;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caradd);
        make = findViewById(R.id.et_make);
        year = findViewById(R.id.et_year);
        color = findViewById(R.id.et_color);
        purchase = findViewById(R.id.et_purchase);
        engine = findViewById(R.id.et_engine);
        createcarr = findViewById(R.id.btn_createcarr);
        creatediesel = findViewById(R.id.btn_creatediesel);
        display = findViewById(R.id.display);

        createcarr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getset.setMake(make.getText().toString());
                getset.setColor(color.getText().toString());
                getset.setYear(year.getText().toString());
                getset.setPurchase(purchase.getText().toString());
                getset.setEngine(engine.getText().toString());
                String values = display.getText() +
                        "\r\n" +" The Vechile is Manufacture by "+ getset.getMake() +
                        "\r\n" + " Made Year: "+ getset.getColor() +
                        "\r\n" + "Car color: " + getset.getYear() +
                        "\r\n" +  "Current value: "+ getset.getPurchase() +
                        "\r\n" + "Engine per liter: " + getset.getEngine() +
                        "\r\n";
                display.setText(values);
            }
        });

    }
}
