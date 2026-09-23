package com.slice.remote;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("SLICE\n\nRemote Admin");
        text.setTextSize(28);
        text.setPadding(40, 80, 40, 40);

        setContentView(text);
    }
}
