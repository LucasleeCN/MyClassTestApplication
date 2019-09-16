package com.example.myclasstestapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        Button but1 = findViewById(R.id.button1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog1 = new AlertDialog.Builder(LoginActivity.this);
                dialog1.setTitle("More Information");
                dialog1.setMessage("For more information,welcome to bistu.edu.cn!");
                dialog1.setCancelable(false);
                dialog1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog1.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog1.show();
            }
        });

        Button but2 = findViewById(R.id.button2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog2 = new AlertDialog.Builder(LoginActivity.this);
                dialog2.setTitle("Welcome to Login!");
                LayoutInflater uidinflater = getLayoutInflater();
                final View view1 = uidinflater.inflate(R.layout.new_login_layout, null);
                dialog2.setView(view1);
                dialog2.setMessage("please input your id and password！");
                dialog2.setCancelable(false);
                dialog2.setPositiveButton("login", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText uid = view1.findViewById(R.id.userid);
                        EditText pwd = view1.findViewById(R.id.pwd);
                        if (uid.getText().toString().equals("abc") && pwd.getText().toString().equals("123")) {
                            Toast.makeText(LoginActivity.this, "welcome,login successful！", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(LoginActivity.this, "login failed！please input the correct password", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                dialog2.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog2.show();
            }
        });
    }

}
