package com.planning.college.fragmentdemo4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.planning.college.fragment.ResourceFragment;


/**
 * 演示fragment向activity传值
 */
public class MainActivity extends AppCompatActivity implements ResourceFragment.MyListener {

    private TextView tv_show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_show = findViewById(R.id.tv_show);

    }

    @Override
    public void sendMessage(String str) {//回传数据进行展示
        if(str != null && !"".equals(str)){
            tv_show.setText(str);
        }
    }
}
