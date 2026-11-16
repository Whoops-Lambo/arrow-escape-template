package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzabj {
    public final zzbg a;
    public final int[] b;

    public zzabj(zzbg zzbgVar, int[] iArr) {
        if (iArr.length == 0) {
            zzeh.f("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = zzbgVar;
        this.b = iArr;
    }
}
