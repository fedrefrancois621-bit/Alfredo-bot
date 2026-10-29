
package com.alfredobot;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(24, 24, 24, 24);
        layout.setBackgroundColor(Color.rgb(15, 23, 42));

        TextView title = new TextView(this);
        title.setText("AlfredoBot");
        title.setTextSize(30);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);

        TextView subtitle = new TextView(this);
        subtitle.setText(
            "MODE DEMO\n\n" +
            "EMA 9 / EMA 21\n" +
            "RSI 14\n\n" +
            "Analiz siyal 1 minit\n\n" +
            "Pa gen lòd otomatik."
        );
        subtitle.setTextSize(19);
        subtitle.setTextColor(Color.rgb(100, 220, 180));
        subtitle.setGravity(Gravity.CENTER);
        subtitle.setPadding(0, 30, 0, 0);

        layout.addView(title);
        layout.addView(subtitle);

        setContentView(layout);
    }
}
