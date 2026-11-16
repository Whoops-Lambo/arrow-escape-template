package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import defpackage.pv1;
import defpackage.s71;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public final i a;
    public final b b;
    public final List c;
    public final List d;
    public final t0 e;

    public static a a(a aVar, t0 t0Var) {
        i iVar = aVar.a;
        b bVar = aVar.b;
        List list = aVar.c;
        List list2 = aVar.d;
        aVar.getClass();
        list2.getClass();
        return new a(iVar, bVar, list, list2, t0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && s71.b(this.b, aVar.b) && this.c.equals(aVar.c) && s71.b(this.d, aVar.d) && s71.b(this.e, aVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        b bVar = this.b;
        int iE = pv1.e(pv1.e((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.c), 31, this.d);
        t0 t0Var = this.e;
        return iE + (t0Var != null ? t0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Ad(linear=" + this.a + ", companion=" + this.b + ", impressionTracking=" + this.c + ", errorTracking=" + this.d + ", dec=" + this.e + ')';
    }

    public a(i iVar, b bVar, List list, List list2, t0 t0Var) {
        list2.getClass();
        this.a = iVar;
        this.b = bVar;
        this.c = list;
        this.d = list2;
        this.e = t0Var;
    }
}
