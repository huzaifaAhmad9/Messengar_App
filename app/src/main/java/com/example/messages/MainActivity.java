package com.example.messages;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText phn,msg;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        phn = findViewById(R.id.phone_number);
        msg = findViewById(R.id.message);
        SMS();
    }

    public void SMS(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = phn.getText().toString();
                String sms = msg.getText().toString();
                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(ph,null,sms,null,null);
                Toast.makeText(MainActivity.this, "Message Sent Successfully!!", Toast.LENGTH_LONG).show();
            }
        });
    }
}