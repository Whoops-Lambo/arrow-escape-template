package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzabs {
    public final int a;
    public final zznl[] b;
    public final zzabk[] c;
    public final zzbn d;
    public final Object e;

    public final boolean b(zzabs zzabsVar, int i) {
        return zzabsVar != null && Objects.equals(this.b[i], zzabsVar.b[i]) && Objects.equals(this.c[i], zzabsVar.c[i]);
    }

    public final boolean a(int i) {
        return this.b[i] != null;
    }

    public zzabs(zznl[] zznlVarArr, zzabk[] zzabkVarArr, zzbn zzbnVar, zzabn zzabnVar) {
        boolean z;
        int length = zznlVarArr.length;
        if (length == zzabkVarArr.length) {
            z = true;
        } else {
            z = false;
        }
        zzgvz.a(z);
        this.b = zznlVarArr;
        this.c = (zzabk[]) zzabkVarArr.clone();
        this.d = zzbnVar;
        this.e = zzabnVar;
        this.a = length;
    }
}
