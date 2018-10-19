package com.example.example2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PersonalDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_data);

        findViewById(R.id.Siguiente).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarDatos();
            }
        });
    }
    void enviarDatos(){
        String nombre = ((EditText) findViewById(R.id.Nombre)).getText().toString();
        String apellido = ((EditText) findViewById(R.id.Apellidos)).getText().toString();
    }

}
