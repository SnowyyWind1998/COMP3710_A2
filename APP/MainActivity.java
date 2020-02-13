package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtF, txtC, txtKM, txtMile, txtKG, txtLB, txtLitre, txtG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtF = findViewById(R.id.txtF);
        txtC = findViewById(R.id.txtC);
        txtKM = findViewById(R.id.txtKM);
        txtMile = findViewById(R.id.txtMile);
        txtKG = findViewById(R.id.txtKG);
        txtLB = findViewById(R.id.txtLB);
        txtLitre = findViewById(R.id.txtLitre);
        txtG = findViewById(R.id.txtG);


        txtF.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strF = s.toString();
                Log.i("UnitConverter", "Value in txtF = " + strF);

                if (!txtF.isFocused()) return;
                if (strF.length() == 0) return;


                try {
                    double valF = Double.parseDouble(strF);
                    double valC = (valF - 32.0)*5/9;
                    String strC = Double.toString(valC);
                    Log.i("UnitConverter", "Value in txtC = " + strC);

                    MainActivity.this.txtC.setText(strC);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtC.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strC = s.toString();
                Log.i("UnitConverter", "Value in txtC = " + strC);

                if (!txtC.isFocused()) return;
                if (strC.length() == 0) return;

                try {
                    double valC = Double.parseDouble(strC);
                    double valF = valC*9/5 + 32;
                    String strF = Double.toString(valF);
                    Log.i("UnitConverter", "Value in txtF = " + strF);

                    MainActivity.this.txtF.setText(strF);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtKM.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strKM = s.toString();
                Log.i("UnitConverter", "Value in txtKM = " + strKM);

                if (!txtKM.isFocused()) return;
                if (strKM.length() == 0) return;


                try {
                    double valKM = Double.parseDouble(strKM);
                    double valMile = valKM * 0.62137;
                    String strMile = Double.toString(valMile);
                    Log.i("UnitConverter", "Value in txtMile = " + strMile);

                    MainActivity.this.txtMile.setText(strMile);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtMile.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strMile = s.toString();
                Log.i("UnitConverter", "Value in txtMile = " + strMile);

                if (!txtMile.isFocused()) return;
                if (strMile.length() == 0) return;


                try {
                    double valMile = Double.parseDouble(strMile);
                    double valKM = valMile / 0.62137;
                    String strKM = Double.toString(valKM);
                    Log.i("UnitConverter", "Value in txtKM = " + strKM);

                    MainActivity.this.txtKM.setText(strKM);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtKG.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strKG = s.toString();
                Log.i("UnitConverter", "Value in txtKG = " + strKG);

                if (!txtKG.isFocused()) return;
                if (strKG.length() == 0) return;


                try {
                    double valKG = Double.parseDouble(strKG);
                    double valLB = valKG * 2.2;
                    String strLB = Double.toString(valLB);
                    Log.i("UnitConverter", "Value in txtLB = " + strLB);

                    MainActivity.this.txtLB.setText(strLB);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtLB.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strLB = s.toString();
                Log.i("UnitConverter", "Value in txtC = " + strLB);

                if (!txtLB.isFocused()) return;
                if (strLB.length() == 0) return;

                try {
                    double valLB = Double.parseDouble(strLB);
                    double valKG = valLB / 2.2;
                    String strKG = Double.toString(valKG);
                    Log.i("UnitConverter", "Value in txtKG = " + strKG);

                    MainActivity.this.txtKG.setText(strKG);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtLitre.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strLitre = s.toString();
                Log.i("UnitConverter", "Value in txtLitre = " + strLitre);

                if (!txtLitre.isFocused()) return;
                if (strLitre.length() == 0) return;


                try {
                    double valLitre = Double.parseDouble(strLitre);
                    double valG = valLitre/3.785;
                    String strG = Double.toString(valG);
                    Log.i("UnitConverter", "Value in txtG = " + strG);

                    MainActivity.this.txtG.setText(strG);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtG.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strG = s.toString();
                Log.i("UnitConverter", "Value in txtG = " + strG);

                if (!txtG.isFocused()) return;
                if (strG.length() == 0) return;

                try {
                    double valG = Double.parseDouble(strG);
                    double valLitre = valG*3.785;
                    String strLitre = Double.toString(valLitre);
                    Log.i("UnitConverter", "Value in txtLitre = " + strLitre);

                    MainActivity.this.txtLitre.setText(strLitre);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

    }
}
