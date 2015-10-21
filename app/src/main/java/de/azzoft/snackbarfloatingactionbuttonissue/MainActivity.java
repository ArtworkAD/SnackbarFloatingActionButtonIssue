package de.azzoft.snackbarfloatingactionbuttonissue;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (fab.getVisibility() == View.VISIBLE) {
                    fab.hide();
                } else {
                    fab.show();
                }

                Snackbar.make(findViewById(R.id.coordinatorLayout), "Foobar", Snackbar.LENGTH_LONG).show();
            }
        });
    }
}
