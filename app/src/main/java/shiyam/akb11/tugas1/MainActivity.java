package shiyam.akb11.tugas1;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Tgl. Buat : 7 April 2019
    //Nama      : Shiyam Robato. R
    //Kelas     : AKB-11
    //NIM       : 10116471


    private Button mulai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView txtMonitoring;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        txtMonitoring=(TextView)findViewById(R.id.txtMon);
//        Typeface customfont=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
//        txtMonitoring.setTypeface(customfont);
        mulai = (Button)findViewById(R.id.btnMulai);
        mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mulai = new Intent(getApplicationContext(),Verifikasi_Activity.class);
                startActivity(mulai);
            }
        });
    }
}
