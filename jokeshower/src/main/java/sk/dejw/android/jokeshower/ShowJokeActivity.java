package sk.dejw.android.jokeshower;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowJokeActivity extends AppCompatActivity {

    public static final String EXTRA_JOKE = "joke";

    public String mJoke = "";

    TextView mJokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_joke);

        mJokeTextView = (TextView) findViewById(R.id.tv_joke_text);

        Intent startingIntent = getIntent();
        if (startingIntent != null) {
            if (startingIntent.hasExtra(EXTRA_JOKE)) {
                mJoke = startingIntent.getExtras().getString(EXTRA_JOKE);
            }
        }
        mJokeTextView.setText(mJoke);
    }
}
