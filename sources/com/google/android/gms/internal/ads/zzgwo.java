package com.google.android.gms.internal.ads;

import defpackage.do4;
import defpackage.jp4;
import defpackage.lp4;
import defpackage.xp4;
import defpackage.yp4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgwo {
    public final zzgvn a;
    public final boolean b;
    public final yp4 c;

    public static zzgwo a(jp4 jp4Var) {
        return new zzgwo(new do4(jp4Var, 4));
    }

    public zzgwo(yp4 yp4Var, boolean z, zzgvn zzgvnVar) {
        this.c = yp4Var;
        this.b = z;
        this.a = zzgvnVar;
    }

    public final zzgwo b(zzgvn zzgvnVar) {
        zzgvnVar.getClass();
        return new zzgwo(this.c, this.b, zzgvnVar);
    }

    public final List c(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itG = this.c.g(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            xp4 xp4Var = (xp4) itG;
            if (xp4Var.hasNext()) {
                arrayList.add((String) xp4Var.next());
            } else {
                return Collections.unmodifiableList(arrayList);
            }
        }
    }

    public zzgwo(yp4 yp4Var) {
        this(yp4Var, false, lp4.b);
    }
}
