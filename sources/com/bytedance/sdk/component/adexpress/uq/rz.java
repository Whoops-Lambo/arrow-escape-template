package com.bytedance.sdk.component.adexpress.uq;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import defpackage.q63;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class rz {
    public static Drawable kgy(Context context, com.bytedance.sdk.component.adexpress.dynamic.uq.yo yoVar) {
        if (context == null || yoVar == null) {
            return null;
        }
        return kgy(context, (int) yo.kgy(context, yoVar.xh()), yoVar.dg(), yoVar.wy());
    }

    public static Drawable kgy(Context context, int i, int i2, int i3) {
        GradientDrawable gradientDrawableB = q63.b(1);
        if (context != null) {
            gradientDrawableB.setStroke(i, i2);
        }
        gradientDrawableB.setColor(i3);
        return gradientDrawableB;
    }
}
