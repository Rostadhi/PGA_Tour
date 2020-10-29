package com.dicoding.picodiploma.pgatour;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;


import java.util.ArrayList;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPGA;
    private final ArrayList<PGATour> list = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvPGA = findViewById(R.id.rv_pgatour);
        rvPGA.setHasFixedSize(true);

        list.addAll(PGATourData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvPGA.setLayoutManager(new LinearLayoutManager(this));
        PGATourAdapter pgaTourAdapter = new PGATourAdapter(list);
        rvPGA.setAdapter(pgaTourAdapter);

        pgaTourAdapter.setOnItemClickCall(new PGATourAdapter.OnItemClickCall() {
            @Override
            public void onItemClick(PGATour pgaTourData) {
                showselectedplayer(pgaTourData);
            }
        });
    }
    private void showselectedplayer(PGATour pgaTour){
        Toast.makeText(this, "your choose" + pgaTour.getPlayername(), Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(MainActivity.this, Detail.class);
        intent.putExtra(Detail.EXTRA_PLAYER, pgaTour);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuabout, menu);
        return super.onCreateOptionsMenu(menu);
    }
}