package com.oleg_kuzmenkov.android.nrghelloworld2;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class Hello extends AppCompatActivity {

    private Button mDateButton;
    private TextView mDateTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        mDateTextView = (TextView)findViewById(R.id.date_text_view);

        mDateButton = (Button)findViewById(R.id.button);
        mDateButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                //Toast.makeText(QuizActivity.this,R.string.correct_toast,Toast.LENGTH_SHORT).show();
                mDateTextView.setText(getDate());
            }
        });

    }

    /**
     * Get current date
     */
    @NonNull
    private String getDate() {
        Date currentDate = new Date();

        if (currentDate!= null)
            return currentDate.toString();
        else
            return "Today is today:))";

    }
}
