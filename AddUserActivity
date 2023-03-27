package com.example.userprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import java.lang.String;

public class AddUserActivity extends AppCompatActivity {

    public EditText editFirstName;
    public EditText editLastName;
    public EditText editEmail;
    public String degreeProgram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
    }


    public void addUser(View view) {

        editFirstName = (EditText)findViewById(R.id.fname);
        String firstName = editFirstName.getText().toString();
        editLastName = (EditText)findViewById(R.id.lname);
        String lastName = editLastName.getText().toString();
        editEmail = (EditText)findViewById(R.id.uemail);
        String email = editEmail.getText().toString();

        RadioGroup rgProgram = findViewById(R.id.rgProgram);
        switch(rgProgram.getCheckedRadioButtonId()) {
            case R.id.rbTITE:
                degreeProgram = "Tietotekniikka";
                break;
            case R.id.rbTUTA:
                degreeProgram = "Tuotantotalous";
                break;
            case R.id.rbLATE:
                degreeProgram = "Laskennallinen tekniikka";
                break;
            case R.id.rbSATE:
                degreeProgram = "Sähkötekniikka";
                break;
        }
        UserStorage.getInstance().addUser(new User(firstName, lastName, email, degreeProgram));
    }
    public void listUser(View view) {

        UserStorage.getInstance().listUser();
    }
}
