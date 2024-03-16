package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast("onCreate");
        Log.e(TAG, "ошибки (error)");
        Log.w(TAG, "предупреждения (warning)");
        Log.i(TAG, "информация (info)");
        Log.d(TAG, "отладка (degub)");
        Log.v(TAG, "подробности (verbose)");
    }

    @Override
    protected void onStart() {
        super.onStart();
        showToast("onStart");
        Log.d(TAG, "старт");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showToast("onResume");
        Log.d(TAG, "возобновлён");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showToast("onPause");
        Log.d(TAG, "пауза");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showToast("onRestart");
        Log.d(TAG, "перезапуск");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showToast("onStop");
        Log.d(TAG, "стоп");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showToast("onDestroy");
        Log.d(TAG, "удалить");
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}