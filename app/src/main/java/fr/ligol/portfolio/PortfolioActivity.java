package fr.ligol.portfolio;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class PortfolioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_porfolio);

        findViewById(R.id.spotify_streamer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastMessage(R.string.spotify_streamer);
            }
        });
        findViewById(R.id.super_duo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastMessage(R.string.super_duo);
            }
        });
        findViewById(R.id.built_it_bigger).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastMessage(R.string.built_it_bigger);
            }
        });
        findViewById(R.id.xyz_reader).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastMessage(R.string.xyz_reader);
            }
        });
        findViewById(R.id.capstone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastMessage(R.string.capstone);
            }
        });
    }

    private void showToastMessage(@StringRes int stringId) {
        Toast.makeText(PortfolioActivity.this, PortfolioActivity.this.getString(R.string.toast_format_message, PortfolioActivity.this.getString(stringId)), Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_porfolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
