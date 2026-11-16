package com.google.android.gms.internal.ads;

import com.ironsource.C4664b4;
import defpackage.pv1;
import defpackage.q63;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzahp {
    public final zzahs a;
    public final zzahs b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzahp.class != obj.getClass()) {
            return false;
        }
        zzahp zzahpVar = (zzahp) obj;
        return this.a.equals(zzahpVar.a) && this.b.equals(zzahpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        zzahs zzahsVar = this.a;
        String string = zzahsVar.toString();
        zzahs zzahsVar2 = this.b;
        String strConcat = zzahsVar.equals(zzahsVar2) ? "" : ", ".concat(zzahsVar2.toString());
        return pv1.p(new StringBuilder(q63.a(string.length() + 1, 1, strConcat)), C4664b4.j.d, string, strConcat, C4664b4.j.e);
    }

    public zzahp(zzahs zzahsVar, zzahs zzahsVar2) {
        this.a = zzahsVar;
        this.b = zzahsVar2;
    }
}
