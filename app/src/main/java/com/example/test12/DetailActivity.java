package com.example.test12;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
    int classNo;
    TextView text2, text3;
    Button button7, button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        classNo = intent.getIntExtra("classNo", 0);

        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);

        button7.setOnClickListener(this);
        button8.setOnClickListener(this);

        text3 = findViewById(R.id.text3);
        text3.setText("2학년 " + String.valueOf(classNo) + "반");
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button7:
                finish();
                break;
            case R.id.button8:
                Intent intent2 = new Intent(DetailActivity.this, MainActivity.class);
                intent2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent2);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("classNo", classNo);
        setResult(RESULT_OK, intent);
        super.onBackPressed();
    }
}
