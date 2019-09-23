package com.example.college;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2,ed3,ed4;
    Button btn;
    String getName, getRoll, getAdmission, getColl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=(EditText)findViewById(R.id.nm);
        ed2=(EditText)findViewById(R.id.roll);
        ed3=(EditText)findViewById(R.id.admsn);
        ed4=(EditText)findViewById(R.id.col);

        btn= (Button)findViewById(R.id.but);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                getName=ed1.getText().toString();
                getRoll=ed2.getText().toString();
                getAdmission=ed3.getText().toString();
                getColl=ed4.getText().toString();

                Toast.makeText(getApplicationContext(),getName+ "" + getRoll +"" + getAdmission+ "" +
                        "" +  getColl,Toast.LENGTH_SHORT).show();



            }
        });


    }
}
