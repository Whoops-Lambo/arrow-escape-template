package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public class HashAccumulator {
    public int a = 1;

    public final void a(Object obj) {
        this.a = (this.a * 31) + (obj == null ? 0 : obj.hashCode());
    }
}
