package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Enum;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzoa<E extends Enum<E>, O> {
    public final HashMap a;
    public final HashMap b;

    public final zznx a() {
        return new zznx(Collections.unmodifiableMap(this.a), Collections.unmodifiableMap(this.b));
    }

    public final void b(Enum r2, Object obj) {
        this.a.put(r2, obj);
        this.b.put(obj, r2);
    }

    private zzoa() {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public /* synthetic */ zzoa(int i) {
        this();
    }
}
