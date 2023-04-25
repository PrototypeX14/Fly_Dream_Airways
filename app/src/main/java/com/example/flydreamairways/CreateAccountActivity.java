package com.example.flydreamairways;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class CreateAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_account);
    }

    public void continue_OnClick(@NonNull View v) {
        final EditText first_name_input= v.findViewById(R.id.first_name_input);
        final EditText last_name_input = v.findViewById(R.id.last_name_label);
        final EditText email_input = v.findViewById(R.id.email_input);
        final EditText phone_input = v.findViewById(R.id.phone_number_input);
        final EditText password_input = v.findViewById(R.id.password_input);
        final EditText confirm_password_input = v.findViewById(R.id.confirm_password_create_input);
        final EditText address_input = v.findViewById(R.id.address_input);
        Boolean pass = Boolean.TRUE;

        if (first_name_input.getText() == null) {
            TextView first_name_req_label = v.findViewById(R.id.first_name_required_label);
            first_name_req_label.setVisibility(View.VISIBLE);
            pass = Boolean.FALSE;
        }

        if (last_name_input.getText() == null) {
            TextView last_name_req_label = v.findViewById(R.id.last_name_required_label);
            last_name_req_label.setVisibility(View.VISIBLE);
            pass = Boolean.FALSE;
        }

        if (email_input.getText() == null) {
            TextView email_req_label = v.findViewById(R.id.email_required_label);
            email_req_label.setVisibility(View.VISIBLE);
            pass = Boolean.FALSE;
        }

        if (phone_input.getText() == null) {
            TextView phone_req_label = v.findViewById(R.id.phone_number_required_label);
            phone_req_label.setVisibility(View.VISIBLE);
            pass = Boolean.FALSE;
        }

        if(password_input.getText() == null) {
            TextView password_req_label = v.findViewById(R.id.password_required_label);
            password_req_label.setVisibility(View.VISIBLE);
            pass = Boolean.FALSE;
        }

        if(confirm_password_input.getText() == null) {
            TextView confirm_pw_req_label = v.findViewById(R.id.confirm_password_required_label);
            confirm_pw_req_label.setVisibility(View.VISIBLE);
            pass = Boolean.FALSE;
        } else if (password_input.getText() != confirm_password_input.getText()) {
            TextView pw_mismatch_label = v.findViewById(R.id.password_mismatch_label);
            pw_mismatch_label.setVisibility(View.VISIBLE);
            pass = Boolean.FALSE;
        }

        if (address_input.getText() == null) {
            TextView address_req_label = v.findViewById(R.id.address_required_label);
            address_req_label.setVisibility(View.VISIBLE);
            pass = Boolean.FALSE;
        }

        if (pass == Boolean.TRUE) {
            Intent intent = new Intent(this, AddPaymentActivity.class);
            this.startActivity(intent);
        }
    }
}
