package shiyam.akb11.tugas1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MasukActivity extends AppCompatActivity {

    //Tgl. Buat : 7 April 2019
    //Nama      : Shiyam Robato. R
    //Kelas     : AKB-11
    //NIM       : 10116471


    final String Nama = "kamu";
    private String nama;
    TextView message;
    Button oke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masuk);

        message = (TextView) findViewById(R.id.txtHallo);

        Bundle exBundle = getIntent().getExtras();
        nama = exBundle.getString(Nama);
        message.setText("Beres! Sekarang "+nama+" udah bisa ngecek penggunaan HP mu tiap hari buat bantu "+ nama +" ngatur waktu");
        oke = (Button) findViewById(R.id.btnOke);
        oke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
            }
        });
    }
}
