package com.example.lokityee;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends Activity {

    private EditText message6,message7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.evaluate);
        message6 = findViewById(R.id.editText6);
        message7 = findViewById(R.id.editText7);

    }

    public void evaluateresults(View view) {
        String messages = message6.getText().toString();
        String messages1 = message7.getText().toString();
        if (messages.contains("D"))
        {
            Toast toast = Toast.makeText(this, R.string.toast_message,
                                          Toast.LENGTH_SHORT);
             toast.show();

        }
    }
}
