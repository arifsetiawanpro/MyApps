package com.example.myapps.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class LocalStorageHelper {
    private Context context;
    private SharedPreferences sharedPreferences;

    private String keyLogin = "loginKey";

    public LocalStorageHelper(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences("MyApps", Context.MODE_PRIVATE);
    }

    public void setLoginStatus(boolean status) {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean(keyLogin, status);
            editor.apply();
        }

    public boolean getStatusLogin() {
        return sharedPreferences.getBoolean(keyLogin, false);
    }
}
