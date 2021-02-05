package org.ollide.rosandroid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class sendWait_Complete extends sendDestin {
    private TextView myTextView3;
    private Button come_back_to_main;

    protected void onCreate(Bundle savedInstanceState2) {
        super.onCreate(savedInstanceState2);
        setContentView(R.layout.send_wait_back_to_main);

        myTextView3 = (TextView) findViewById(R.id.textView7);
        myTextView3.setText("Your package is sending now, please wait.");

        come_back_to_main = (Button) findViewById(R.id.confirm1);

        node.is_robot_completed_task = true;/////***************/////

        if(node.is_robot_completed_task) {
            String prx = "Room";
            SharedPreferences sharedPref = getSharedPreferences("conserve", 0);
            r2 = sharedPref.getString("Room2", "001");
            myTextView3.setText("Your package delivery service to room " + r2 +" is complete now, please press the button below to confirm");
            come_back_to_main.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "You have confirmed, thanks for your trust.", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(sendWait_Complete.this, MainActivity.class);
                    startActivity(intent);
                }
            });
        }

    }
}