package coml.sample.poc.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;


import androidx.lifecycle.ViewModelProviders;

import javax.inject.Inject;

import coml.sample.poc.R;
import coml.sample.poc.ui.viewmodel.AuthViewModel;
import coml.sample.poc.ui.viewmodel.ViewModelProviderFactory;
import dagger.android.support.DaggerAppCompatActivity;

public class AuthActivity extends DaggerAppCompatActivity {

    private static final String TAG = "AuthActivity";

//    @Inject
//    Drawable logo;
//
//    @Inject
//    RequestManager requestManager;


    AuthViewModel viewModel;


    @Inject
    ViewModelProviderFactory providerFactory;

    @Inject
    public String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);


        viewModel = ViewModelProviders.of(this, providerFactory).get(AuthViewModel.class);

        Log.d("mvv"," viewModel  .."+viewModel);
        setLogo();
        Toast.makeText(this," str : "+str, Toast.LENGTH_LONG).show();
    }

    private void setLogo(){
//        requestManager
//                .load(logo)
//                .into((ImageView)findViewById(R.id.login_logo));
    }
}










