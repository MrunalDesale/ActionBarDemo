package com.example.myfirst.pickerdate;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatePicker dp=(DatePicker)findViewById(R.id.datePicker);
        dp.init(2015,12,21,onDateChangedListener);
        dp.setCalendarViewShown(false);
        dp.setSpinnersShown(true);
    }
    DatePicker.OnDateChangedListener onDateChangedListener=new DatePicker.OnDateChangedListener()
    {
        @Override
        public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth)
        {
            TextView tv=(TextView)findViewById(R.id.editText);
            tv.setText(Integer.toString(dayOfMonth)+"/"+Integer.toString(monthOfYear+1)+"/"+Integer.toString(year));
        }
    };
}