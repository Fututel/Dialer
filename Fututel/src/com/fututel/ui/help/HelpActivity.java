package com.fututel.ui.help;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import com.fututel.R;

/**
 * Created by root on 19/02/15.
 */
public class HelpActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.helpactivity);

        WebView webView = (WebView) findViewById(R.id.webview);
        webView.loadUrl("http://slashdot.org/");
        super.onCreate(savedInstanceState);
    }
}