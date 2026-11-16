package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.n30;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Ck {
    public static SharedPreferences a() {
        Context context = AbstractC4221mk.a;
        String strM = n30.m(context != null ? context.getPackageName() : null, "_preferences");
        if (context != null) {
            return context.getSharedPreferences(strM, 0);
        }
        return null;
    }
}
