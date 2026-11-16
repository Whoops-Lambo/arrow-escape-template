package com.google.android.gms.internal.ads;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public enum zzfwj {
    HTML(CreativeInfo.al),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE("native"),
    JAVASCRIPT("javascript");

    public final String a;

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    zzfwj(String str) {
        this.a = str;
    }
}
