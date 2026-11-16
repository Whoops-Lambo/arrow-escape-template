package com.google.android.gms.internal.ads;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzios extends zziox {
    public final String a;

    @Override // com.google.android.gms.internal.ads.zziox
    public final void a(String str) {
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(str.length() + String.valueOf(str2).length() + 1);
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }

    public zzios(String str) {
        this.a = str;
    }
}
