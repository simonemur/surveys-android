package org.geobricks;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SurveyAndroidActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main);
        
        TextView t = new TextView(this);
        
        
        setContentView(t);
    }
}