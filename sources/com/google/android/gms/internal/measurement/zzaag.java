package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class zzaag extends zzzf {
    public final String a;

    @Override // com.google.android.gms.internal.measurement.zzzf
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    public void d(RuntimeException runtimeException, zzxz zzxzVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }

    public zzaag(String str) {
        this.a = str;
    }
}
