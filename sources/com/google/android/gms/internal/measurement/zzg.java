package com.google.android.gms.internal.measurement;

import defpackage.n30;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzg {
    public final zzg a;
    public final zzaw b;
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();

    public final zzao a(zzao zzaoVar) {
        return this.b.b(this, zzaoVar);
    }

    public final zzao b(zzae zzaeVar) {
        zzao zzaoVarB = zzao.e9;
        Iterator itH = zzaeVar.h();
        while (itH.hasNext()) {
            zzaoVarB = this.b.b(this, zzaeVar.k(((Integer) itH.next()).intValue()));
            if (zzaoVarB instanceof zzag) {
                break;
            }
        }
        return zzaoVarB;
    }

    public final zzg c() {
        return new zzg(this, this.b);
    }

    public final boolean d(String str) {
        if (this.c.containsKey(str)) {
            return true;
        }
        zzg zzgVar = this.a;
        if (zzgVar != null) {
            return zzgVar.d(str);
        }
        return false;
    }

    public final void e(String str, zzao zzaoVar) {
        zzg zzgVar;
        HashMap map = this.c;
        if (!map.containsKey(str) && (zzgVar = this.a) != null && zzgVar.d(str)) {
            zzgVar.e(str, zzaoVar);
        } else {
            if (this.d.containsKey(str)) {
                return;
            }
            if (zzaoVar == null) {
                map.remove(str);
            } else {
                map.put(str, zzaoVar);
            }
        }
    }

    public final void f(String str, zzao zzaoVar) {
        if (this.d.containsKey(str)) {
            return;
        }
        HashMap map = this.c;
        if (zzaoVar == null) {
            map.remove(str);
        } else {
            map.put(str, zzaoVar);
        }
    }

    public final zzao g(String str) {
        HashMap map = this.c;
        if (map.containsKey(str)) {
            return (zzao) map.get(str);
        }
        zzg zzgVar = this.a;
        if (zzgVar != null) {
            return zzgVar.g(str);
        }
        defpackage.d.r(n30.m(str, " is not defined"));
        return null;
    }

    public zzg(zzg zzgVar, zzaw zzawVar) {
        this.a = zzgVar;
        this.b = zzawVar;
    }
}
