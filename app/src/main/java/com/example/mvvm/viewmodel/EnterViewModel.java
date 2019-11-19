package com.example.mvvm.viewmodel;

import android.content.Context;
import android.widget.Toast;

import androidx.databinding.ObservableField;

import com.example.mvvm.model.Enter;

public class EnterViewModel {

    private Enter model;

    public ObservableField<String> login;
    public ObservableField<String> password;

    public EnterViewModel(){
        login = new ObservableField<>();
        password = new ObservableField<>();
    }

    public void onEnter(Context context){
        model = new Enter(this.login.get(), this.password.get());
        Toast.makeText(context, model.toString(), Toast.LENGTH_LONG).show();
    }
}
