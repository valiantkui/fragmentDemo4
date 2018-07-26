package com.planning.college.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.planning.college.fragmentdemo4.R;

/**
 * Created by KUIKUI on 2018-05-22.
 */

public class ResourceFragment extends Fragment {

    private EditText et_content;
    private MyListener listener;
    private Button btn_pass;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listener= (MyListener) getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_resource,null);
        et_content = view.findViewById(R.id.et_content);
        btn_pass = view.findViewById(R.id.send);
        btn_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //点击按钮时，editText中的值传递到activity
                String info = et_content.getText().toString().trim();
                listener.sendMessage(info);//通过接口回调的形式发送数据
            }
        });

        return view;

    }

    public interface  MyListener{
        public abstract void sendMessage(String str);
    }
}
