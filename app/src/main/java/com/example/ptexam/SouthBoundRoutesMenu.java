package com.example.ptexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SouthBoundRoutesMenu extends AppCompatActivity {
    private Button getMaaAgdao;
    private Button getMaaBankerohan;
    private Button getMatinaCrossingAgdao;
    private Button getMatinaAplayaAgdao;
    private Button getMatinaPangiRamonMagsaysayAvenue;
    private Button getEcolandSMCity;
    private Button getBangkalRamonMagsaysayAvenue;
    private Button getUlasRamonMagsaysayAvenue;
    private Button getPuanRamonMagsaysayAvenue;
    private Button getBagoAplayaRoxasAvenue;
    private Button getTalomoRoxasAvenue;
    private Button getCatalunanGrandeRoxasAvenue;
    private Button getMintalRoxasAvenue;
    private Button getCalinanRoxasAvenue;
    private Button getTorilRoxasAvenue;
    Button MaaAgdao;
    Button MaaBankerohan;
    Button MatinaCrossingAgdao;
    Button MatinaAplayaAgdao;
    Button MatinaPangiRamonMagsaysayAvenue;
    Button EcolandSMCity;
    Button BangkalRamonMagsaysayAvenue;
    Button UlasRamonMagsaysayAvenue;
    Button PuanRamonMagsaysayAvenue;
    Button BagoAplayaRoxasAvenue;
    Button TalomoRoxasAvenue;
    Button CatalunanGrandeRoxasAvenue;
    Button MintalRoxasAvenue;
    Button CalinanRoxasAvenue;
    Button TorilRoxasAvenue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_south_bound_routes_menu);

        MaaAgdao = (Button) findViewById(R.id.btnMaaAgdao);
        MaaBankerohan = (Button) findViewById(R.id.btnMaaBanke);
        MatinaCrossingAgdao = (Button) findViewById(R.id.btnMtnaCross);
        MatinaAplayaAgdao = (Button) findViewById(R.id.btnMtnaAplya);
        MatinaPangiRamonMagsaysayAvenue = (Button) findViewById(R.id.btnMtnaPangi);
        EcolandSMCity = (Button) findViewById(R.id.btnEcolandSM);
        BangkalRamonMagsaysayAvenue = (Button) findViewById(R.id.btnBangkal);
        UlasRamonMagsaysayAvenue = (Button) findViewById(R.id.btnUlas);
        PuanRamonMagsaysayAvenue = (Button) findViewById(R.id.btnPuan);
        BagoAplayaRoxasAvenue = (Button) findViewById(R.id.btnBagoAplya);
        TalomoRoxasAvenue = (Button) findViewById(R.id.btnTalomo);
        CatalunanGrandeRoxasAvenue = (Button) findViewById(R.id.btnCatGrande);
        MintalRoxasAvenue = (Button) findViewById(R.id.btnMintal);
        CalinanRoxasAvenue = (Button) findViewById(R.id.btnCalinan);
        TorilRoxasAvenue = (Button) findViewById(R.id.btnToril);

        MaaAgdao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MaaAgdao();

            }
        });
    }

    public void MaaAgdao() {
        Intent intent = new Intent(SouthBoundRoutesMenu.this, MaaAgdao.class);
        startActivity(intent);

        MaaBankerohan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MaaBankerohan();

            }
        });
    }

    public void MaaBankerohan() {
        Intent intent = new Intent(SouthBoundRoutesMenu.this, MaaBankerohan.class);
        startActivity(intent);

        MatinaCrossingAgdao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MatinaCrossingAgdao();

            }
        });
    }

    public void MatinaCrossingAgdao() {
        Intent intent = new Intent(SouthBoundRoutesMenu.this, MatinaCrossingAgdao.class);
        startActivity(intent);

        MatinaAplayaAgdao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MatinaAplayaAgdao();

            }
        });
    }

    public void MatinaAplayaAgdao() {
        Intent intent = new Intent(SouthBoundRoutesMenu.this, MatinaAplayaAgdao.class);
        startActivity(intent);

        MatinaPangiRamonMagsaysayAvenue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MatinaPangiRamonMagsaysayAvenue();

            }
        });
    }

    public void MatinaPangiRamonMagsaysayAvenue() {
        Intent intent = new Intent(SouthBoundRoutesMenu.this, MatinaPangiRamonMagsaysayAvenue.class);
        startActivity(intent);

        EcolandSMCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EcolandSMCity();

            }
        });
    }

    public void EcolandSMCity() {
        Intent intent = new Intent(SouthBoundRoutesMenu.this, EcolandSMCity.class);
        startActivity(intent);

        BangkalRamonMagsaysayAvenue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BangkalRamonMagsaysayAvenue();

            }
        });
    }

    public void BangkalRamonMagsaysayAvenue() {
        Intent intent = new Intent(SouthBoundRoutesMenu.this, BangkalRamonMagsaysayAvenue.class);
        startActivity(intent);

        UlasRamonMagsaysayAvenue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UlasRamonMagsaysayAvenue();

            }
        });
    }

    public void UlasRamonMagsaysayAvenue() {
        Intent intent = new Intent(SouthBoundRoutesMenu.this, UlasRamonMagsaysayAvenue.class);
        startActivity(intent);

        PuanRamonMagsaysayAvenue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PuanRamonMagsaysayAvenue();

            }
        });
    }

    public void PuanRamonMagsaysayAvenue() {
        Intent intent = new Intent(SouthBoundRoutesMenu.this, PuanRamonMagsaysayAvenue.class);
        startActivity(intent);

        BagoAplayaRoxasAvenue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BagoAplayaRoxasAvenue();

            }
        });
    }

    public void BagoAplayaRoxasAvenue() {
        Intent intent = new Intent(SouthBoundRoutesMenu.this, BagoAplayaRoxasAvenue.class);
        startActivity(intent);

        TalomoRoxasAvenue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TalomoRoxasAvenue();

            }
        });
    }

    public void TalomoRoxasAvenue() {
        Intent intent = new Intent(this, TalomoRoxasAvenue.class);
        startActivity(intent);

        CatalunanGrandeRoxasAvenue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CatalunanGrandeRoxasAvenue();

            }
        });
    }

    public void CatalunanGrandeRoxasAvenue() {
        Intent intent = new Intent(this, CatalunanGrandeRoxasAvenue.class);
        startActivity(intent);

        MintalRoxasAvenue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MintalRoxasAvenue();

            }
        });
    }

    public void MintalRoxasAvenue() {
        Intent intent = new Intent(this, MintalRoxasAvenue.class);
        startActivity(intent);

        CalinanRoxasAvenue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalinanRoxasAvenue();

            }
        });
    }

    public void CalinanRoxasAvenue() {
        Intent intent = new Intent(this, CalinanRoxasAvenue.class);
        startActivity(intent);

        TorilRoxasAvenue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TorilRoxasAvenue();

            }
        });
    }

    public void TorilRoxasAvenue() {
        Intent intent = new Intent(this, TorilRoxasAvenue.class);
        startActivity(intent);}


    }