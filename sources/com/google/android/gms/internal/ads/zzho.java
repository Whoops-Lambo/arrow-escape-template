package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzho implements zzhw {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public zzia d;

    public final void k(zzia zziaVar) {
        for (int i = 0; i < this.c; i++) {
            ((zziu) this.b.get(i)).getClass();
        }
    }

    public final void l(zzia zziaVar) {
        this.d = zziaVar;
        for (int i = 0; i < this.c; i++) {
            ((zziu) this.b.get(i)).l(this, zziaVar, this.a);
        }
    }

    public final void m(int i) {
        zzia zziaVar = this.d;
        String str = zzfq.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            ((zziu) this.b.get(i2)).i(zziaVar, this.a, i);
        }
    }

    public final void n() {
        zzia zziaVar = this.d;
        String str = zzfq.a;
        for (int i = 0; i < this.c; i++) {
            ((zziu) this.b.get(i)).c(zziaVar, this.a);
        }
        this.d = null;
    }

    public zzho(boolean z) {
        this.a = z;
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void a(zziu zziuVar) {
        zziuVar.getClass();
        ArrayList arrayList = this.b;
        if (!arrayList.contains(zziuVar)) {
            arrayList.add(zziuVar);
            this.c++;
        }
    }
}
