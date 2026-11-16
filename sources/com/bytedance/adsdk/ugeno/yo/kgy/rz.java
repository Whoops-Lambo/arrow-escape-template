package com.bytedance.adsdk.ugeno.yo.kgy;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class rz extends kgy {
    @Override // com.bytedance.adsdk.ugeno.yo.kgy.kgy
    public Drawable ahm(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    public rz(Context context) {
        super(context);
    }
}
