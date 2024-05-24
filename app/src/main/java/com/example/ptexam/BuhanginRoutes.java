package com.example.ptexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BuhanginRoutes extends AppCompatActivity {

    private Button getBuhanginViaJPLaurel;
    private Button getBuhanginViaDacudao;
    private Button getCampCatitipanViaJPLaurel;
    private Button getCampCatitipanViaDacudao;
    private Button getLandmarkIIIRizalSt;
    private Button getJadeValley;
    private Button getCommunal;
    private Button getElRio;
    private Button getCabantian;
    private Button getTigatto;
    private Button getIndangan;
    private Button getJuliville;
    private Button getAcacia;
    private Button getMandug;
    private Button getMahayag;
    private Button getCallawa;

    Button BuhanginViaJPLaurel;
    Button BuhanginViaDacudao;
    Button CampCatitipanViaJPLaurel;
    Button CampCatitipanViaDacudao;
    Button LandmarkIIIRizalSt;
    Button JadeValley;
    Button Communal;
    Button ElRio;
    Button Cabantian;
    Button Tigatto;
    Button Indangan;
    Button Juliville;
    Button Acacia;
    Button Mandug;
    Button Mahayag;
    Button Callawa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buhangin_routes);

        BuhanginViaJPLaurel = (Button) findViewById(R.id. btnBuhanginJPL);
        BuhanginViaDacudao = (Button) findViewById(R.id. btnBuhanginDacu);
        CampCatitipanViaJPLaurel = (Button) findViewById(R.id. btnCampCatiJPL);
        CampCatitipanViaDacudao = (Button) findViewById(R.id. btnCampCatiDacu);
        LandmarkIIIRizalSt = (Button) findViewById(R.id. btnLandmark);
        JadeValley = (Button) findViewById(R.id. btnJadeValley);
        Communal = (Button) findViewById(R.id. btnCommu);
        ElRio = (Button) findViewById(R.id. btnElRio);
        Cabantian = (Button) findViewById(R.id. btnCaban);
        Tigatto = (Button) findViewById(R.id.btnTiga);
        Indangan = (Button) findViewById(R.id.btnIndan);
        Juliville = (Button) findViewById(R.id.btnJuli);
        Acacia = (Button) findViewById(R.id.btnAcac);
        Mandug = (Button) findViewById(R.id.btnMand);
        Mahayag = (Button) findViewById(R.id.btnMahay);
        Callawa = (Button) findViewById(R.id.btnCall);

        BuhanginViaJPLaurel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BuhanginViaJPLaurel();

            }
        });
    }

    public void BuhanginViaJPLaurel() {
        Intent intent = new Intent(this, BuhanginViaJPLaurel.class);
        startActivity(intent);
        BuhanginViaDacudao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BuhanginViaDacudao();

            }
        });
    }

    public void BuhanginViaDacudao() {
        Intent intent = new Intent(this, BuhanginViaDacudao.class);
        startActivity(intent);

        CampCatitipanViaJPLaurel .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CampCatitipanViaJPLaurel ();

            }
        });
    }

    public void CampCatitipanViaJPLaurel () {
        Intent intent = new Intent(this, CampCatitipanViaJPLaurel .class);
        startActivity(intent);
        CampCatitipanViaDacudao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CampCatitipanViaDacudao();

            }
        });
    }

    public void CampCatitipanViaDacudao() {
        Intent intent = new Intent(this, CampCatitipanViaDacudao.class);
        startActivity(intent);
        LandmarkIIIRizalSt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LandmarkIIIRizalSt();

            }
        });
    }

    public void LandmarkIIIRizalSt () {
        Intent intent = new Intent(this, LandmarkIIIRizalSt.class);
        startActivity(intent);
        JadeValley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JadeValley();

            }
        });
    }

    public void JadeValley() {
        Intent intent = new Intent(this, JadeValley.class);
        startActivity(intent);

        Communal .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Communal ();

            }
        });
    }

    public void Communal () {
        Intent intent = new Intent(this, Communal.class);
        startActivity(intent);
        ElRio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ElRio();

            }
        });
    }

    public void ElRio() {
        Intent intent = new Intent(this, ElRio.class);
        startActivity(intent);
        Cabantian .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cabantian ();

            }
        });
    }

    public void Cabantian () {
        Intent intent = new Intent(this, Cabantian.class);
        startActivity(intent);
        Tigatto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tigatto();

            }
        });
    }

    public void Tigatto() {
        Intent intent = new Intent(this, Tigatto.class);
        startActivity(intent);
        Indangan .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Indangan ();

            }
        });
    }

    public void Indangan () {
        Intent intent = new Intent(this, Indangan.class);
        startActivity(intent);
        Juliville.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Juliville();

            }
        });
    }

    public void Juliville() {
        Intent intent = new Intent(this, Juliville.class);
        startActivity(intent);
        Acacia .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Acacia ();

            }
        });
    }

    public void  Acacia() {
        Intent intent = new Intent(this, Acacia.class);
        startActivity(intent);
        Mandug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mandug();

            }
        });
    }

    public void Mandug() {
        Intent intent = new Intent(this, Mandug.class);
        startActivity(intent);

        Mahayag .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mahayag ();

            }
        });
    }

    public void Mahayag() {
        Intent intent = new Intent(this, Mahayag.class);
        startActivity(intent);
        Callawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Callawa();

            }
        });
    }

    public void Callawa() {
        Intent intent = new Intent(this, Callawa.class);
        startActivity(intent);

    }
}