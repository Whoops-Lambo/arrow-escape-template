package com.bytedance.adsdk.ugeno.yo.kgy;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class ahm extends kgy {
    @Override // com.bytedance.adsdk.ugeno.yo.kgy.kgy
    public Drawable ahm(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    public ahm(Context context) {
        super(context);
    }
}
