package com.google.android.gms.internal.measurement;

import defpackage.in3;
import defpackage.wx2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzaev {
    public final wx2 a;

    public static void a(zzada zzadaVar, wx2 wx2Var, Object obj, Object obj2) {
        in3.e(zzadaVar, (zzagm) wx2Var.b, 1, obj);
        in3.e(zzadaVar, (zzagm) wx2Var.c, 2, obj2);
    }

    public static int b(wx2 wx2Var, Object obj, Object obj2) {
        zzagm zzagmVar = (zzagm) wx2Var.b;
        zzagm zzagmVar2 = (zzagm) wx2Var.c;
        return in3.f(zzagmVar2, 2, obj2) + in3.f(zzagmVar, 1, obj);
    }

    public final wx2 c() {
        return this.a;
    }

    public zzaev(zzagm zzagmVar, zzagm zzagmVar2, Object obj) {
        this.a = new wx2(9, zzagmVar, zzagmVar2, obj);
    }
}
