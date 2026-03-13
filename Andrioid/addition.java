package com.example.addition;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
EditText txtnumber1,txtnumber2,txtresult;
Button btnsum;
double a,b,c;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
txtnumber1=findViewById(R.id.txtnumber1);
txtnumber2=findViewById(R.id.txtnumber2);
txtresult=findViewById(R.id.txtresult);
btnsum=findViewById(R.id.btnsum);
btnsum=(Button) findViewById(R.id.btnsum);
btnsum.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
a=Double.parseDouble(txtnumber1.getText().toString());
b=Double.parseDouble(txtnumber2.getText().toString());
c=a+b;
txtresult.setText(Double.toString(c));
}
});
}
}