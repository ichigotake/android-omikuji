package omikuji.example.com.omikuji;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends ActionBarActivity {

    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView) findViewById(R.id.result);
        Button omikujiButton = (Button) findViewById(R.id.omikuji);
        omikujiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                omikuji();
            }
        });
    }

    private void omikuji() {
        int number = new Random().nextInt() % 2;
        switch (number) {
            case 0:
                result.setText("大吉です！");
                break;
            case 1:
                result.setText("末吉です");
                break;
        }
    }


}
