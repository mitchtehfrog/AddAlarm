package edu.elon.cs.addalarm;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AddAlarmActivity extends Activity {

    private AddAlarmView addAlarmView;
    private Integer[] hours = new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12};
    private Integer[] minutes = new Integer[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,
            18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,
            47,48,49,50,51,52,53,54,55,56,57,58,59};
    private ArrayAdapter<Integer> hourAdapter = new ArrayAdapter<Integer>(this,
            android.R.layout.simple_spinner_item, hours);
    private ArrayAdapter<Integer> minuteAdapter = new ArrayAdapter<Integer>(this,
            android.R.layout.simple_spinner_item, minutes);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_alarm);
        Spinner hourSpinner = (Spinner) findViewById(R.id.hourspinner);
        Spinner minuteSpinner = (Spinner) findViewById(R.id.minutespinner);
        hourSpinner.setAdapter(hourAdapter);
        minuteSpinner.setAdapter(minuteAdapter);
        addAlarmView.setHours(hourSpinner);
        addAlarmView.setMinutes(minuteSpinner);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_alarm, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
