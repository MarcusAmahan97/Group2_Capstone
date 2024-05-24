package com.example.ptexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button getNorthBoundRoutes;
    private Button getSouthBoundRoutes;
    private Button getNorthWestRoutes;
    private Button getNumberRoutes;
    TextView JeepneyRoutesMainMenu;
    Button NorthBoundRoutes;
    Button SouthBoundRoutes;
    Button NorthWestRoutes;
    Button NumberRoutes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NorthBoundRoutes = (Button) findViewById(R.id.btnNorth);
        SouthBoundRoutes = (Button) findViewById(R.id.btnSouth);
        NorthWestRoutes = (Button) findViewById(R.id.btnNorWes);
        NumberRoutes = (Button) findViewById(R.id.btnNumer);

        NorthBoundRoutes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NorthBoundRoutes();

            }
        });
    }

    public void NorthBoundRoutes() {
        Intent intent = new Intent(this, NorthBoundRoutesMenu.class);
        startActivity(intent);

        SouthBoundRoutes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SouthBoundRoutes();

            }
        });
    }

    public void SouthBoundRoutes() {
        Intent intent = new Intent(this, SouthBoundRoutesMenu.class);
        startActivity(intent);

        NorthWestRoutes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NorthWestRoutes();

            }
        });
    }

    public void NorthWestRoutes() {
        Intent intent = new Intent(this, BuhanginRoutes.class);
        startActivity(intent);

        NumberRoutes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NumberRoutes();

            }
        });
    }

    public void NumberRoutes() {
        Intent intent = new Intent(this, NumericalRoutes.class);
        startActivity(intent);}

}