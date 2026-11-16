package com.inmobi.media;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class Og {
    public static final boolean a(Context context, String str) {
        str.getClass();
        if (context == null) {
            return false;
        }
        try {
            if (context.checkCallingOrSelfPermission(str) != 0) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }
}
