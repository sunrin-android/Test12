package com.example.test12;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    Button button3, button4, button5, button6;
    TextView text2;
    int classNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);

        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);

        text2 = findViewById(R.id.text2);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button4:
                Intent intent = new Intent(this, DetailActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("classNo", 4);
                startActivity(intent);
                break;
            case R.id.button5:
                Intent intent2 = new Intent(this, DetailActivity.class);
                intent2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent2.putExtra("classNo", 5);
                startActivity(intent2);
                break;
            case R.id.button6:
                Intent intent3 = new Intent(this, DetailActivity.class);
                intent3.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent3.putExtra("classNo", 6);
                startActivity(intent3);
                break;
            case R.id.button3:
                finish();
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode == 100 && resultCode == RESULT_OK){
            classNo = data.getIntExtra("classNo", 0);
            text2.setText("2학년 " + String.valueOf(classNo) + "반");
        }
    }
}
