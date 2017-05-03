package com.googlog.www.hsslazywork;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.googlog.www.hsslazylibrary.util.App;
import com.googlog.www.hsslazylibrary.util.AppInfoUtil;
import com.googlog.www.hsslazylibrary.util.DateUtil;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int day = DateUtil.getDay(new Date());
        App.longToast(AppInfoUtil.getLauncherClassName(this));
    }
}
