package com.sjs.edu.mytablelayout;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button1 = (Button)findViewById(R.id.button1);
        final Button button2 = (Button)findViewById(R.id.button2);
        final EditText editText1 = (EditText)findViewById(R.id.editText1);
        final EditText editText2 = (EditText)findViewById(R.id.editText2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Toast.makeText(getApplicationContext(),"버튼1",Toast.LENGTH_SHORT).show();
                editText1.setText("배고파");
                editText2.setText("밥먹자");
                v.setBackgroundColor(Color.DKGRAY);

                button2.setBackgroundColor(Color.LTGRAY);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"버튼2",Toast.LENGTH_SHORT).show();
                editText1.setText("집에가자");
                editText2.setText("안녕");
                v.setBackgroundColor(Color.DKGRAY);
                button1.setBackgroundColor(Color.LTGRAY);

            }
        });
    }
}
