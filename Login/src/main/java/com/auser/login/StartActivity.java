package com.auser.login;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.auser.login.R;

/**
 * Created by Auser on 2015/12/18.
 */
public class StartActivity extends Activity{

  private ProgressBar progressBar;
 private Button backButton;
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.start);

    }


}
