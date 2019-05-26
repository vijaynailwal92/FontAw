package vijay.com.fontaw;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Typeface fontFamily = Typeface.createFromAsset(getAssets(), "fonts/fontawesome-webfont.ttf");
        TextView txtAndroid = (TextView) findViewById(R.id.txtAndroid);
        TextView txtHTML = (TextView) findViewById(R.id.txtHTML);


        txtAndroid.setText("\uf17b");
        txtAndroid.setTypeface(fontFamily);
        txtHTML.setText("\uf13b");
        txtHTML.setTypeface(fontFamily);
    }
}