package com.dicoding.picodiploma.pgatour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Detail extends AppCompatActivity {
    public static final String EXTRA_PLAYER = "extra_player";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView textView = findViewById(R.id.tv_playername);
        TextView textView1 = findViewById(R.id.tv_location);
        TextView textView2 = findViewById(R.id.tv_contry);
        TextView textView3 = findViewById(R.id.tv_year);
        TextView textView4 = findViewById(R.id.tv_majorwin);
        TextView textView5 = findViewById(R.id.tv_turnamenwin);
        CircleImageView imageView = findViewById(R.id.pga1);

        PGATour pgaTour = getIntent().getParcelableExtra(EXTRA_PLAYER);

        assert pgaTour != null;
        imageView.setImageResource(pgaTour.getPlayerimage());
        String text = " Player name =   " + pgaTour.getPlayername();
        textView.setText(text);
        String text1 = " Location Player =   " + pgaTour.getLocation();
        textView1.setText(text1);
        String text2 = " Country Name =   " + pgaTour.getCountry();
        textView2.setText(text2);
        String text3 = " Year Play =   " + pgaTour.getYear();
        textView3.setText(text3);
        String text4 = " Major Champion =   " + pgaTour.getMajorwin();
        textView4.setText(text4);
        String text5 = " Tournament Cups =   " + pgaTour.getTurnamenwin();
        textView5.setText(text5);
    }
}