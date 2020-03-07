package com.example.miwoklang;

import android.view.View;
import android.widget.Toast;

public class NumbersClickListener implements View.OnClickListener{
    @Override
    public void onClick(View view){
        Toast.makeText(view.getContext(),"Open Numbers List",Toast.LENGTH_SHORT).show();
    }
}
