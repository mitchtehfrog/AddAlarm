package edu.elon.cs.addalarm;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by mthompson31 on 10/23/2015.
 */
public class AddAlarmView extends View {

    private Spinner hourSpinner;
    private Spinner minuteSpinner;




    public AddAlarmView(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas){

    }


    public void setHours(Spinner hourSpinner){
        this.hourSpinner = hourSpinner;
    }

    public void setMinutes(Spinner minuteSpinner){
        this.minuteSpinner = minuteSpinner;
    }
}
