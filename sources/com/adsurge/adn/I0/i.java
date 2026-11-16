package com.adsurge.adn.I0;

import android.content.Context;
import android.util.TypedValue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static int a(Context context, int i) {
        return (int) TypedValue.applyDimension(1, i, context.getApplicationContext().getResources().getDisplayMetrics());
    }

    public static int b(Context context, int i) {
        return (int) ((i / context.getApplicationContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int a(Context context) {
        return context.getApplicationContext().getResources().getDisplayMetrics().heightPixels;
    }

    public static int b(Context context) {
        return context.getApplicationContext().getResources().getDisplayMetrics().widthPixels;
    }
}
