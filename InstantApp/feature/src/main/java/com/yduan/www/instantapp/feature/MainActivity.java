package com.yduan.www.instantapp.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView catText = (TextView) findViewById(R.id.cat);
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (button.getText().equals(getString(R.string.sleep))) {
                            catText.setText(R.string.cat_asleep);
                            button.setText(R.string.wake);
                        } else {
                            catText.setText(R.string.cat_awake);
                            button.setText(R.string.sleep);
                        }
                    }
                }
        );
    }
}
