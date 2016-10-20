package edu.tecii.android.practica6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtA1, txtA2, txtA3, txtA4, txtB1, txtB2, txtB3, txtB4, txtPY;
    Button btncalc;
    double PPA, A1, A2, A3, A4, PPB, B1, B2, B3, B4, PF, PY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtA1 = (EditText)findViewById(R.id.txtA1);
        txtA2 = (EditText)findViewById(R.id.txtA2);
        txtA3 = (EditText)findViewById(R.id.txtA3);
        txtA4 = (EditText)findViewById(R.id.txtA4);
        txtB1 = (EditText)findViewById(R.id.txtB1);
        txtB2 = (EditText)findViewById(R.id.txtB2);
        txtB3 = (EditText)findViewById(R.id.txtB3);
        txtB4 = (EditText)findViewById(R.id.txtB4);
        txtPY = (EditText)findViewById(R.id.txtPY);
        btncalc = (Button) findViewById(R.id.btncalc);
    }

    public void calcular (View v){
        A1 = Double.parseDouble(txtA1.getText().toString());
        A2 = Double.parseDouble(txtA2.getText().toString());
        A3 = Double.parseDouble(txtA3.getText().toString());
        A4 = Double.parseDouble(txtA4.getText().toString());
        B1 = Double.parseDouble(txtB1.getText().toString());
        B2 = Double.parseDouble(txtB2.getText().toString());
        B3 = Double.parseDouble(txtB3.getText().toString());
        B4 = Double.parseDouble(txtB4.getText().toString());
        PPA = (0.20 * A1) + (0.20 * A2) + (0.25 * A3) + (0.35 * A4);
        PPB = (0.20 * B1) + (0.20 * B2) + (0.25 * B3) + (0.35 * B4);
        PF = 10.5;
        PY = (PF / 0.35) - (0.30 * PPA) - (0.35 * PPB);
        txtPY.setText(PY + "");
    }
}
