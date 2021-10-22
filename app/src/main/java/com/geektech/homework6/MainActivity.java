package com.geektech.homework6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ContextMenu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.GenericArrayType;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private EditText EditText_email, EditText_password;
    private Button button;
    private TextView parol, vxod, voyti, textView;
    String email = "admin@gmail.com";
    String passsword = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText_email = findViewById(R.id.pochta);
        EditText_password = findViewById(R.id.parol);
        button = findViewById(R.id.voyti);
        textView = findViewById(R.id.vypolnite);
        parol = findViewById(R.id.vhod);
        vxod = findViewById(R.id.zabyli);
        voyti = findViewById(R.id.tephere);
        button.setOnClickListener(view -> {
            ;
            if (EditText_email.getText().toString().equals(email) && EditText_password.getText().toString().equals(passsword)) {
                EditText_password.setVisibility(View.GONE);
                EditText_email.setVisibility(View.GONE);
                button.setVisibility(View.GONE);
                textView.setVisibility(View.GONE);
                vxod.setVisibility(View.GONE);
                voyti.setVisibility(View.GONE);
                parol.setVisibility(View.GONE);
                Toast.makeText(this, "Вы успешно вошли!", Toast.LENGTH_LONG).show();

            } else if (EditText_email.getText().toString().isEmpty() && EditText_password.getText().toString().isEmpty()) {
                Toast.makeText(this, "Поля пустые, Пожалуйста ввидите данные!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Неправильные данные!", Toast.LENGTH_SHORT).show();
            }
        });
        EditText_email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (EditText_email.getText().toString().isEmpty()) {
                    ;
                    button.setBackground(ContextCompat.getDrawable(MainActivity.this, R.color.grey));
                } else {
                    button.setBackground(ContextCompat.getDrawable(MainActivity.this, R.color.orange));

                }
            }
        });
        EditText_password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (EditText_password.getText().toString().isEmpty()) {
                    button.setBackground(ContextCompat.getDrawable(MainActivity.this, R.color.grey));
                } else {
                    button.setBackground(ContextCompat.getDrawable(MainActivity.this, R.color.orange));
                }

            }
        });

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
    }

}