package splash.royal.com.twoactivityswitchlife;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by bhargavagugamsetty on 28/03/16.
 */
public class SecondActivity extends Activity implements View.OnClickListener {

    private final static String TAG="In this SecondActivity: ";
    Button secondSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        Log.v(TAG, "Activity Created");
        secondSwitch = (Button) findViewById(R.id.second_button);
        secondSwitch.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent switch2 = new Intent(v.getContext(),FirstActivity.class);
        startActivity(switch2);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "On Start", Toast.LENGTH_SHORT);
        Log.i(TAG,"Activity started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "On resume", Toast.LENGTH_SHORT);
        Log.i(TAG, "Activity Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "on Pause", Toast.LENGTH_SHORT);
        Log.i(TAG, "Activity Paused");

    }



    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "on Stop", Toast.LENGTH_SHORT);
        Log.i(TAG, "Activity Stopped");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "on Restart", Toast.LENGTH_SHORT);
        Log.i(TAG, "Activity Restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "on Destroyed", Toast.LENGTH_SHORT);
        Log.i(TAG, "Activity Destroyed");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Toast.makeText(this, "on Saved Instance", Toast.LENGTH_SHORT);
        Log.i(TAG, "Activity Saved Instance");

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Toast.makeText(this, "on Restore Instance ", Toast.LENGTH_SHORT);
        Log.i(TAG, "Activity Restore Instance");
    }


}
