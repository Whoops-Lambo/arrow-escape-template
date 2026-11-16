package com.google.android.gms.internal.ads;

import defpackage.du4;
import defpackage.eu4;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzhef {
    public final boolean a;
    public final zzgzb b;

    public final eu4 a(Executor executor, Callable callable) {
        eu4 eu4Var = new eu4(this.b, this.a, false);
        eu4Var.p = new du4(eu4Var, callable, executor);
        eu4Var.x();
        return eu4Var;
    }

    public /* synthetic */ zzhef(zzgzb zzgzbVar, boolean z) {
        this.a = z;
        this.b = zzgzbVar;
    }
}
