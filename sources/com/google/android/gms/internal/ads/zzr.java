package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzr {
    public final SparseBooleanArray a = new SparseBooleanArray();
    public boolean b;

    public final void a(int i) {
        zzgvz.f(!this.b);
        this.a.append(i, true);
    }

    public final zzs b() {
        zzgvz.f(!this.b);
        this.b = true;
        return new zzs(this.a);
    }
}
