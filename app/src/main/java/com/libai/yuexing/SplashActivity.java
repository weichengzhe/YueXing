package com.libai.yuexing;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

/**
 * Created by B41-80 on 2016/4/15.
 */
public class SplashActivity extends  AbstractBaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        init();
    }

    private void init() {
        new timeTask().execute();
    }
    class timeTask extends AsyncTask<Void,Void,Void>{

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            startActivity(new Intent(SplashActivity.this,LoginActivity.class));
            super.onPostExecute(aVoid);
        }
    }
}
