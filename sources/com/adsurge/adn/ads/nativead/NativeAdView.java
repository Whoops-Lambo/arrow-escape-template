package com.adsurge.adn.ads.nativead;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.adsurge.adn.p053r.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class NativeAdView extends a {
    public View d;
    public View e;
    public View f;
    public View g;
    public MediaView h;

    public View getBodyView() {
        return this.e;
    }

    public View getCallToActionView() {
        return this.g;
    }

    public View getHeadLineView() {
        return this.d;
    }

    public View getIconView() {
        return this.f;
    }

    public MediaView getMediaView() {
        return this.h;
    }

    public void setBodyView(View view) {
        this.e = view;
    }

    public void setCallToActionView(View view) {
        this.g = view;
    }

    public void setHeadLineView(View view) {
        this.d = view;
    }

    public void setIconView(View view) {
        this.f = view;
    }

    public void setMediaView(MediaView mediaView) {
        this.h = mediaView;
    }

    public NativeAdView(@NonNull Context context) {
        super(context);
    }

    public NativeAdView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NativeAdView(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public NativeAdView(@NonNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
