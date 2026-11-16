package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhod {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public final void a(Enum r2, Object obj) {
        this.a.put(r2, obj);
        this.b.put(obj, r2);
    }

    public final zzhoe b() {
        return new zzhoe(Collections.unmodifiableMap(this.a), Collections.unmodifiableMap(this.b));
    }

    private zzhod() {
    }

    public /* synthetic */ zzhod(int i) {
    }
}
