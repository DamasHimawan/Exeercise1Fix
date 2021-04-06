package com.example.exeercise1fix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;



public class ActivityLihatData extends AppCompatActivity {
    TextView tvnama,tvnomor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        switch (nama) {
            case "Inayah":
                tvnama.setText("Inayah");
                tvnomor.setText("0812222222222");
                break;
            case "Ilham":
                tvnama.setText("Ilham");
                tvnomor.setText("0812222222223");
                break;
            case "Eris":
                tvnama.setText("Eris");
                tvnomor.setText("0812222222224");
                break;
            case "Fikri":
                tvnama.setText("Maul");
                tvnomor.setText("0812222222225");
                break;
            case "Intan":
                tvnama.setText("Intan");
                tvnomor.setText("0812112222226");
                break;
            case "Vina":
                tvnama.setText("Vina");
                tvnomor.setText("0812888978222");
                break;
            case "Gita":
                tvnama.setText("Gita");
                tvnomor.setText("0812209868623");
                break;
            case "Vian":
                tvnama.setText("Vian");
                tvnomor.setText("0812277654224");
                break;
            case "Lutfi":
                tvnama.setText("Lutfi");
                tvnomor.setText("081226774525");
                break;
        }
    }
}