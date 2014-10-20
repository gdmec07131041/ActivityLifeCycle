package cn.edu.gdmec.s17731041.activitylifecycle;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ActivityLifeCycle extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_life_cycle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_life_cycle, menu);
        return true;
    }
    
}
