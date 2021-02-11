package com.example.chatapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ResetPassActivity extends AppCompatActivity {

    EditText sendMail;
    Button resetBtn;

    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_pass);
        sendMail = findViewById(R.id.sendEmail);
        resetBtn = findViewById(R.id.resetBtn);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Log In");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String email = sendMail.getText().toString();

               if (email.equals(""))
               {
                   sendMail.setError("Please fill the fields");
               }else {
                   firebaseAuth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
                       @Override
                       public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()){
                                Toast.makeText(getApplicationContext(),"Please check your Email",Toast.LENGTH_LONG).show();
                                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
                            }else {
                                String error = task.getException().getMessage();
                                Toast.makeText(getApplicationContext(),error,Toast.LENGTH_LONG).show();
                            }
                       }
                   });
               }
            }
        });
    }
}