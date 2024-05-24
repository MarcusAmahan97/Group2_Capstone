package com.example.ptexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NorthBoundRoutesMenu extends AppCompatActivity {
    private Button getSasaViaRCastillo;
    private Button getSasaViaJPLaurel;
    private Button getSasaViaCabaguio;
    private Button getPanacanViaJPLaurel;
    private Button getPanacanViaBuhanginIlustre;
    private Button getPanacanviaCabaguio;
    private Button getPanacanviaSMCity;
    private Button getDoñaPilar;
    private Button getTibungcoViaRCastillo;
    private Button getTibungcoViaBuhangin;
    private Button getTibungcoViaCabaguio;
    private Button getBunawanViaSasa;
    private Button getBunawanViaBuhangin;
    private Button getLasangViaSasa;
    private Button getLasangViaBuhangin;
    private Button getPanaboCityDavaoCity;
    Button SasaViaRCastillo;
    Button SasaViaJPLaurel;
    Button SasaViaCabaguio;
    Button PanacanViaJPLaurel;
    Button PanacanViaBuhanginIlustre;
    Button PanacanviaCabaguio;
    Button PanacanviaSMCity;
    Button DoñaPilar;
    Button TibungcoViaRCastillo;
    Button TibungcoViaBuhangin;
    Button TibungcoViaCabaguio;
    Button BunawanViaSasa;
    Button BunawanViaBuhangin;
    Button LasangViaSasa;
    Button LasangViaBuhangin;
    Button PanaboCityDavaoCity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north_bound_routes_menu);

        SasaViaRCastillo = (Button) findViewById(R.id. btnSasaRCas);
        SasaViaJPLaurel = (Button) findViewById(R.id. btnSasaJPL);
        SasaViaCabaguio = (Button) findViewById(R.id. btnSasaCab);
        PanacanViaJPLaurel = (Button) findViewById(R.id. btnPanJPL);
        PanacanViaBuhanginIlustre = (Button) findViewById(R.id. btnPanIlus);
        PanacanviaCabaguio = (Button) findViewById(R.id. btnPanCabag);
        PanacanviaSMCity = (Button) findViewById(R.id. btnPanSM);
        DoñaPilar = (Button) findViewById(R.id. btnDoñPil);
        TibungcoViaRCastillo = (Button) findViewById(R.id. btnTibRCas);
        TibungcoViaBuhangin = (Button) findViewById(R.id. btnTibBuha);
        TibungcoViaCabaguio = (Button) findViewById(R.id. btnTibCab);
        BunawanViaSasa = (Button) findViewById(R.id. btnBunaSasa);
        BunawanViaBuhangin = (Button) findViewById(R.id. btnBunaBuha);
        LasangViaSasa = (Button) findViewById(R.id. btnLasSasa);
        LasangViaBuhangin = (Button) findViewById(R.id. btnLasBuha);
        PanaboCityDavaoCity = (Button) findViewById(R.id. btnPanabo);

        SasaViaRCastillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SasaViaRCastillo();

            }
        });
    }

    public void SasaViaRCastillo() {
        Intent intent = new Intent(this, SasaViaRCastillo.class);
        startActivity(intent);

        SasaViaJPLaurel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SasaViaJPLaurel();

            }
        });
    }

    public void SasaViaJPLaurel() {
        Intent intent = new Intent(this, SasaViaJPLaurel.class);
        startActivity(intent);

        SasaViaCabaguio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SasaViaCabaguio();

            }
        });
    }

    public void SasaViaCabaguio() {
        Intent intent = new Intent(this, SasaViaCabaguio.class);
        startActivity(intent);

        PanacanViaJPLaurel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PanacanViaJPLaurel();

            }
        });
    }

    public void PanacanViaJPLaurel() {
        Intent intent = new Intent(this, PanacanViaJPLaurel.class);
        startActivity(intent);

        PanacanViaBuhanginIlustre.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            PanacanViaBuhanginIlustre();

        }
    });
}

    public void PanacanViaBuhanginIlustre() {
        Intent intent = new Intent(this, PanacanViaBuhanginIlustre.class);
        startActivity(intent);

        PanacanviaCabaguio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PanacanviaCabaguio();

            }
        });
    }

    public void PanacanviaCabaguio() {
        Intent intent = new Intent(this, PanacanviaCabaguio.class);
        startActivity(intent);

        PanacanviaSMCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PanacanviaSMCity();

            }
        });
    }

    public void PanacanviaSMCity() {
        Intent intent = new Intent(this, PanacanSMCity.class);
        startActivity(intent);

        DoñaPilar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoñaPilar();

            }
        });
    }

    public void DoñaPilar() {
        Intent intent = new Intent(this, DonaPilar.class);
        startActivity(intent);

        TibungcoViaRCastillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TibungcoViaRCastillo();

            }
        });
    }

    public void TibungcoViaRCastillo() {
        Intent intent = new Intent(this, TibungcoViaRCastillo.class);
        startActivity(intent);

        TibungcoViaBuhangin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TibungcoViaBuhangin();

            }
        });
    }

    public void TibungcoViaBuhangin() {
        Intent intent = new Intent(this, TibungcoViaBuhangin.class);
        startActivity(intent);

        TibungcoViaCabaguio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TibungcoViaCabaguio();

            }
        });
    }

    public void TibungcoViaCabaguio() {
        Intent intent = new Intent(this, TibungcoViaCabaguio.class);
        startActivity(intent);

        BunawanViaSasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BunawanViaSasa();

            }
        });
    }

    public void BunawanViaSasa() {
        Intent intent = new Intent(this, BunawanViaSasa.class);
        startActivity(intent);

        BunawanViaBuhangin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BunawanViaBuhangin();

            }
        });
    }

    public void BunawanViaBuhangin() {
        Intent intent = new Intent(this, BunawanViaBuhangin.class);
        startActivity(intent);

        LasangViaSasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LasangViaSasa();

            }
        });
    }

    public void LasangViaSasa() {
        Intent intent = new Intent(this, LasangViaSasa.class);
        startActivity(intent);

        LasangViaBuhangin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LasangViaBuhangin();

            }
        });
    }

    public void LasangViaBuhangin() {
        Intent intent = new Intent(this, LasangViaBuhangin.class);
        startActivity(intent);

        PanaboCityDavaoCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PanaboCityDavaoCity();

            }
        });
    }

    public void PanaboCityDavaoCity() {
        Intent intent = new Intent(this, PanaboCityDavaoCity.class);
        startActivity(intent);}




    }