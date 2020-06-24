package com.example.huaweianalyticsexample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import com.huawei.hms.analytics.HiAnalytics;
import com.huawei.hms.analytics.HiAnalyticsInstance;


public class SettingActivity extends AppCompatActivity {
    private Button btnSave;
    private EditText editFavorSport;
    private String strFavorSport;
    HiAnalyticsInstance instance;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        instance = HiAnalytics.getInstance(this);


        btnSave = (Button)findViewById(R.id.save_setting_button);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editFavorSport = (EditText)findViewById(R.id.edit_favorite_sport);
                strFavorSport = editFavorSport.getText().toString().trim();
                instance.setUserProfile("favor_sport",strFavorSport);
            }
        });
    }
}