package com.example.ptexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NumericalRoutes extends AppCompatActivity {

    private Button getRoute1;
    private Button getRoute2;
    private Button getRoute3;
    private Button getRoute4;
    private Button getRoute5;
    private Button getRoute6;
    private Button getRoute7;
    private Button getRoute8;
    private Button getRoute9;
    private Button getRoute10;
    private Button getRoute11;
    private Button getRoute12;
    private Button getRoute13;

    Button Route1;
    Button Route2;
    Button Route3;
    Button Route4;
    Button Route5;
    Button Route6;
    Button Route7;
    Button Route8;
    Button Route9;
    Button Route10;
    Button Route11;
    Button Route12;
    Button Route13;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numerical_routes);

        Route1 = (Button) findViewById(R.id. btnRt1);
        Route2 = (Button) findViewById(R.id. btnRt2);
        Route3 = (Button) findViewById(R.id. btnRt3);
        Route4 = (Button) findViewById(R.id. btnRt4);
        Route5 = (Button) findViewById(R.id. btnRt5);
        Route6 = (Button) findViewById(R.id. btnRt6);
        Route7 = (Button) findViewById(R.id. btnRt7);
        Route8 = (Button) findViewById(R.id. btnRt8);
        Route9 = (Button) findViewById(R.id. btnRt9);
        Route10 = (Button) findViewById(R.id. btnRt10);
        Route11 = (Button) findViewById(R.id. btnRt11);
        Route12 = (Button) findViewById(R.id. btnRt12);
        Route13 = (Button) findViewById(R.id. btnRt13);

        Route1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Route1();

            }
        });
    }

    public void Route1() {
        Intent intent = new Intent(this, Route1.class);
        startActivity(intent);

        Route2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Route2();

            }
        });
    }

    public void Route2() {
        Intent intent = new Intent(this, Route2.class);
        startActivity(intent);
        Route3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Route3();

            }
        });
    }

    public void Route3() {
        Intent intent = new Intent(this, Route3.class);
        startActivity(intent);
        Route4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Route4();

            }
        });
    }

    public void Route4() {
        Intent intent = new Intent(this, Route4.class);
        startActivity(intent);
        Route5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Route5();

            }
        });
    }

    public void Route5() {
        Intent intent = new Intent(this, Route5.class);
        startActivity(intent);
        Route6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Route6();

            }
        });
    }

    public void Route6() {
        Intent intent = new Intent(this, Route6.class);
        startActivity(intent);
        Route7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Route7();

            }
        });
    }

    public void Route7() {
        Intent intent = new Intent(this, Route7.class);
        startActivity(intent);

        Route8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Route8();

            }
        });
    }

    public void Route8() {
        Intent intent = new Intent(this, Route8.class);
        startActivity(intent);

        Route9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Route9();

            }
        });
    }

    public void Route9() {
        Intent intent = new Intent(this, Route9.class);
        startActivity(intent);
        Route10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Route10();

            }
        });
    }

    public void Route10() {
        Intent intent = new Intent(this, Route10.class);
        startActivity(intent);
        Route11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Route11();

            }
        });
    }

    public void Route11() {
        Intent intent = new Intent(this, Route11.class);
        startActivity(intent);
        Route12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Route12();

            }
        });
    }

    public void Route12() {
        Intent intent = new Intent(this, Route12.class);
        startActivity(intent);
        Route13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Route13();

            }
        });
    }

    public void Route13() {
        Intent intent = new Intent(this, Route13.class);
        startActivity(intent);
    }
}