package com.bozoslivehere.react;

import android.support.annotation.Nullable;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.react.uimanager.ReactProp;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.image.ImageResizeMode;

/**
 * Created by Alfons on 11/5/2015.
 */
public class BozoImageManager extends SimpleViewManager<BozoImageView> {

    public static final String REACT_CLASS = "BozoImageView";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public BozoImageView createViewInstance(ThemedReactContext context) {
        return new BozoImageView(context, Fresco.newDraweeControllerBuilder(), null);
    }

    @ReactProp(name = "src")
    public void setSrc(BozoImageView view, @Nullable String src) {
        view.setSource(src);
    }

    @ReactProp(name = "borderRadius", defaultFloat = 0f)
    public void setBorderRadius(BozoImageView view, float borderRadius) {
        view.setBorderRadius(borderRadius);
    }

    @ReactProp(name = ViewProps.RESIZE_MODE)
    public void setResizeMode(BozoImageView view, @Nullable String resizeMode) {
        view.setScaleType(ImageResizeMode.toScaleType(resizeMode));
    }

    @ReactProp(name = "scaleX", defaultFloat = 1f)
    public void setScaleX(BozoImageView view, float scaleX) {
        view.setScaleX(scaleX);
    }

    @ReactProp(name = "scaleY", defaultFloat = 1f)
    public void setScaleY(BozoImageView view, float scaleY) {
        view.setScaleX(scaleY);
    }

    @ReactProp(name = "translateX", defaultFloat = 0f)
    public void setTranslateX(BozoImageView view, float translateX) {
        view.setTranslationX(translateX);
    }

    @ReactProp(name = "translateY", defaultFloat = 0f)
    public void setTranslateY(BozoImageView view, float translateY) {
        view.setTranslationX(translateY);
    }

    @ReactProp(name = "rotation", defaultFloat = 0f)
    public void setRotation(BozoImageView view, float rotation) {
        view.setRotation(rotation);
    }

}
