package org.litepal.litepalsample.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import org.litepal.litepalsample.R;

public class TestActivity extends Activity {
    public static void actionStart(Context context) {
        Intent intent = new Intent(context, TestActivity.class);
        context.startActivity(intent);
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity);

    }
}
