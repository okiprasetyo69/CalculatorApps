package com.calculatorapps.anonymous.calculatorapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText result;
    private EditText bilang1;
    private EditText bilang2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prosesUI();
    }

    private void prosesUI() {
        result= (EditText) findViewById(R.id.hasil);
        bilang1= (EditText) findViewById(R.id.editText2);
        bilang2= (EditText) findViewById(R.id.editText3);
    }

    public void HitungTambah(View HitungTambah) {
        float bil1 = Float.parseFloat(bilang1.getText().toString());
        float bil2 = Float.parseFloat(bilang2.getText().toString());
        float hasilper;
        hasilper = (float) (bil1 + bil2);
        result.setText(" " +hasilper);

    }
    public void HitungKurang(View HitungKurang) {
        float bil1 = Float.parseFloat(bilang1.getText().toString());
        float bil2 = Float.parseFloat(bilang2.getText().toString());
        float hasilper;
        hasilper = (float) (bil1 - bil2);
        result.setText(""+hasilper);

    }
    public void HitungKali(View HitungKali) {
        float bil1 = Float.parseFloat(bilang1.getText().toString());
        float bil2 = Float.parseFloat(bilang2.getText().toString());
        float hasilper;
        hasilper = (float) (bil1 * bil2);
        result.setText(""+hasilper);

    }
    public void HitungBagi(View HitungBagi) {
        float bil1 = Float.parseFloat(bilang1.getText().toString());
        float bil2 = Float.parseFloat(bilang2.getText().toString());
        float hasilper;
        hasilper = (float) (bil1 / bil2);
        result.setText(""+hasilper);

    }
}
