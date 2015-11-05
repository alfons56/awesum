package com.bozoslivehere.react;

import android.support.annotation.Nullable;
import android.util.Log;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.react.uimanager.ReactProp;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

/**
 * Created by Alfons on 11/5/2015.
 */
public class BozoWebViewManager extends SimpleViewManager<BozoWebView> {

    public static final String REACT_CLASS = "BozoWebView";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public BozoWebView createViewInstance(ThemedReactContext context) {
        BozoWebView view = new BozoWebView(context);
        Log.d("FONSOOOOOOOOOO", view.getClass().getName());
        return view;
    }

    @ReactProp(name = "src")
    public void setSrc(BozoWebView view, @Nullable String src) {
        view.loadUrl(src);
    }
}
