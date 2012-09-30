package tasteofperu.android;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class NearbyActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearby);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_nearby, menu);
        return true;
    }
}
