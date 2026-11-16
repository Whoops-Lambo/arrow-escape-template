package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzzx;
import defpackage.hd5;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzzr<T_WRAPPER extends zzzx<JcePrimitiveT>, JcePrimitiveT> {
    public static final zzzr b = new zzzr(new zzaaa());
    public static final zzzr c = new zzzr(new zzaae());
    public static final zzzr d;
    public static final zzzr e;
    public static final zzzr f;
    public final hd5 a;

    static {
        new zzzr(new zzaag());
        new zzzr(new zzaad());
        d = new zzzr(new zzzz());
        e = new zzzr(new zzaab());
        f = new zzzr(new zzaac());
    }

    public zzzr(zzzx zzzxVar) {
        if (zzjd.a()) {
            this.a = new hd5(zzzxVar, 2);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.a = new hd5(zzzxVar, 1);
        } else {
            this.a = new hd5(zzzxVar, 0);
        }
    }
}
