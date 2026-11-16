package com.google.android.gms.internal.ads;

import android.net.Uri;
import defpackage.ar4;
import defpackage.pv1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzag {
    public final Uri a;
    public final List b;
    public final zzgzb c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzag)) {
            return false;
        }
        zzag zzagVar = (zzag) obj;
        return this.a.equals(zzagVar.a) && this.b.equals(zzagVar.b) && this.c.equals(zzagVar.c);
    }

    static {
        String str = zzfq.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public final int hashCode() {
        return (int) ((((long) ((this.c.hashCode() + pv1.e(this.a.hashCode() * 923521, 961, this.b)) * 31)) * 31) - Long.MAX_VALUE);
    }

    public /* synthetic */ zzag(Uri uri, List list, zzgzb zzgzbVar) {
        this.a = uri;
        ArrayList arrayList = zzas.a;
        this.b = list;
        this.c = zzgzbVar;
        ar4 ar4Var = zzgzb.b;
        zzgyy zzgyyVar = new zzgyy();
        if (zzgzbVar.size() <= 0) {
            zzgyyVar.f();
        } else {
            throw null;
        }
    }
}
