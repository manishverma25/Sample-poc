package coml.sample.poc.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;


import javax.inject.Inject;

import coml.sample.poc.R;
import dagger.android.support.DaggerAppCompatActivity;

public class AuthActivity extends DaggerAppCompatActivity {

    private static final String TAG = "AuthActivity";

//    @Inject
//    Drawable logo;
//
//    @Inject
//    RequestManager requestManager;

    @Inject
    public String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        setLogo();
        Toast.makeText(this," str : "+str, Toast.LENGTH_LONG).show();
    }

    private void setLogo(){
//        requestManager
//                .load(logo)
//                .into((ImageView)findViewById(R.id.login_logo));
    }
}










