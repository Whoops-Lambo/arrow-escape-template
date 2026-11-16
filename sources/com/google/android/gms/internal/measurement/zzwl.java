package com.google.android.gms.internal.measurement;

import androidx.collection.SimpleArrayMap;
import com.ironsource.C4664b4;
import defpackage.e32;
import defpackage.fs1;
import defpackage.q31;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class zzwl {
    public static final zzwj d = zzwj.a();
    public final zzwl a;
    public final SimpleArrayMap b;
    public boolean c = false;

    public final zzwl b() {
        if (this.c) {
            e32.i("Already frozen");
            return null;
        }
        this.c = true;
        zzwl zzwlVar = this.a;
        return (zzwlVar == null || !this.b.isEmpty()) ? this : zzwlVar;
    }

    public final boolean c(zzwj zzwjVar) {
        if (this.b.containsKey(zzwjVar)) {
            return true;
        }
        zzwl zzwlVar = this.a;
        return zzwlVar != null && zzwlVar.c(zzwjVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (zzwl zzwlVar = this; zzwlVar != null; zzwlVar = zzwlVar.a) {
            for (int i = 0; i < zzwlVar.b.c; i++) {
                sb.append(C4664b4.j.d);
                sb.append(this.b.j(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }

    public /* synthetic */ zzwl(zzwl zzwlVar, SimpleArrayMap simpleArrayMap) {
        if (zzwlVar != null) {
            fs1.g(zzwlVar.c);
        }
        this.a = zzwlVar;
        this.b = simpleArrayMap;
    }

    public static zzwl a(zzwl zzwlVar, zzwl zzwlVar2) {
        boolean z;
        zzwlVar.getClass();
        zzwl zzwlVar3 = j.e;
        if (zzwlVar == zzwlVar3) {
            return zzwlVar2;
        }
        zzwlVar2.getClass();
        if (zzwlVar2 == zzwlVar3) {
            return zzwlVar;
        }
        q31<zzwl> q31VarB = q31.B(zzwlVar, zzwlVar2);
        if (q31VarB.isEmpty()) {
            return zzwlVar3;
        }
        if (q31VarB.size() == 1) {
            return (zzwl) q31VarB.iterator().next();
        }
        int i = 0;
        for (zzwl zzwlVar4 : q31VarB) {
            do {
                i += zzwlVar4.b.c;
                zzwlVar4 = zzwlVar4.a;
            } while (zzwlVar4 != null);
        }
        if (i == 0) {
            return j.e;
        }
        SimpleArrayMap simpleArrayMap = new SimpleArrayMap(i);
        for (zzwl zzwlVar5 : q31VarB) {
            do {
                int i2 = 0;
                while (true) {
                    SimpleArrayMap simpleArrayMap2 = zzwlVar5.b;
                    if (i2 >= simpleArrayMap2.c) {
                        break;
                    }
                    if (simpleArrayMap.put((zzwj) simpleArrayMap2.f(i2), simpleArrayMap2.j(i2)) == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    fs1.h(z, "Duplicate bindings: %s", simpleArrayMap2.f(i2));
                    i2++;
                }
                zzwlVar5 = zzwlVar5.a;
            } while (zzwlVar5 != null);
        }
        return new j(null, simpleArrayMap).b();
    }
}
