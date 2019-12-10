package edu.fje.sopadelletres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sopalletres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sopalletres);
    }

    public void Jugarr(View view){
        Intent Jugar = new Intent(this, sopalletres.class);
        startActivity(Jugar);
    }
}
