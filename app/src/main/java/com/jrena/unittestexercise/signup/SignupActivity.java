package com.jrena.unittestexercise.signup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

import com.jrena.unittestexercise.R;
import com.jrena.unittestexercise.utils.ValidationUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemClick;

public class SignupActivity extends AppCompatActivity {
    @BindView(R.id.txt_first_name)
    TextView txtFirstName;
    @BindView(R.id.txt_middle_name)
    TextView txtMiddleName;
    @BindView(R.id.txt_last_name)
    TextView txtLastName;
    @BindView(R.id.txt_email)
    TextView txtEmail;
    @BindView(R.id.txt_phone_number)
    TextView txtPhoneNumber;
    @BindView(R.id.txt_password)
    TextView txtPassword;
    @BindView(R.id.txt_confirm_password)
    TextView txtConfirmPassword;
    @BindView(R.id.spin_gender)
    Spinner spinGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_submit)
    void onClickSubmit(){
        //TODO: Add your code here
    }
}
