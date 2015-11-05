package com.bozoslivehere.react;

/**
 * Created by Alfons on 11/4/2015.
 */

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.awesomeproject.R;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.HashMap;
import java.util.Map;

public class ToastModule extends ReactContextBaseJavaModule {
    private static final String DURATION_SHORT_KEY = "SHORT";
    private static final String DURATION_LONG_KEY = "LONG";

    public ToastModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    //ReactContextBaseJavaModule requires that a method called getName is implemented. The purpose of this method is to return the string name of the NativeModule which represents this class in JavaScript. So here we will call this ToastAndroid so that we can access it through React.NativeModules.ToastAndroid in JavaScript.
    @Override
    public String getName() {
        return "ToastAndroid2";
    }

    //An optional method called getConstants returns the constant values exposed to JavaScript. Its implementation is not required but is very useful to key pre-defined values that need to be communicated from JavaScript to Java in sync.
    @Override
    public Map<String, Object> getConstants() {
        final Map<String, Object> constants = new HashMap<>();
        constants.put(DURATION_SHORT_KEY, Toast.LENGTH_SHORT);
        constants.put(DURATION_LONG_KEY, Toast.LENGTH_LONG);
        return constants;
    }

    //To expose a method to JavaScript a Java method must be annotated using @ReactMethod. The return type of bridge methods is always void. React Native bridge is asynchronous, so the only way to pass a result to JavaScript is by using callbacks or emitting events (see below).
    @ReactMethod
    public void show(String message, int duration) {
        LayoutInflater inflater = (LayoutInflater) getReactApplicationContext().getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View layout = inflater.inflate(R.layout.toast_layout, null);

        TextView text = (TextView) layout.findViewById(R.id.text);
        text.setText(message);

        Resources r = getReactApplicationContext().getResources();
        float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 8, r.getDisplayMetrics());

        Toast toast = new Toast(getReactApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 0, Math.round(px));
        toast.setDuration(duration);
        toast.setView(layout);
        toast.show();
    }


}
