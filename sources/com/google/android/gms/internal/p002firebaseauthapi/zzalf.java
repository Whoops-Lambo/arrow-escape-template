package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.zr3;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzalf {
    public static final zzalf b = new zzalf(0);
    public final Map a;

    public final zzalt.zzd a(int i, zzamv zzamvVar) {
        return (zzalt.zzd) this.a.get(new zr3(i, zzamvVar));
    }

    public zzalf() {
        this.a = new HashMap();
    }

    public zzalf(int i) {
        this.a = Collections.EMPTY_MAP;
    }
}
