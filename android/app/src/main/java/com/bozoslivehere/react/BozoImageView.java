package com.bozoslivehere.react;

import android.content.Context;
import android.support.annotation.Nullable;

import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.react.views.image.ReactImageView;

/**
 * Created by Alfons on 11/5/2015.
 */
public class BozoImageView extends ReactImageView {

    public BozoImageView(Context context, AbstractDraweeControllerBuilder draweeControllerBuilder, @Nullable Object callerContext) {
        super(context, draweeControllerBuilder, callerContext);
    }
}
