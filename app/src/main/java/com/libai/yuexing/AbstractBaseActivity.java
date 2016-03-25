package com.libai.yuexing;

import android.app.Activity;

import com.umeng.analytics.MobclickAgent;

/**
 * Created by B41-80 on 2016/3/25.
 */
public class AbstractBaseActivity extends Activity {
    @Override
    protected void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
    }

}
