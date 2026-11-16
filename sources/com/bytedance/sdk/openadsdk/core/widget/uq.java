package com.bytedance.sdk.openadsdk.core.widget;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.sdk.openadsdk.utils.gbb;
import defpackage.q63;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class uq {
    public static Drawable ahm() {
        GradientDrawable gradientDrawableB = q63.b(0);
        gradientDrawableB.setCornerRadius(gbb.ahm(com.bytedance.sdk.openadsdk.core.xh.kgy(), 44.0f));
        gradientDrawableB.setStroke(gbb.ahm(com.bytedance.sdk.openadsdk.core.xh.kgy(), 1.0f), Color.parseColor("#33FFFFFF"));
        gradientDrawableB.setColor(Color.parseColor("#99333333"));
        return gradientDrawableB;
    }

    public static Drawable kgy() {
        GradientDrawable gradientDrawableB = q63.b(1);
        gradientDrawableB.setStroke(gbb.ahm(com.bytedance.sdk.openadsdk.core.xh.kgy(), 1.0f), Color.parseColor("#33FFFFFF"));
        gradientDrawableB.setColor(Color.parseColor("#99333333"));
        return gradientDrawableB;
    }
}
