package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import defpackage.do4;
import defpackage.ga4;
import defpackage.l05;
import defpackage.o34;
import defpackage.y40;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzka {
    public static final /* synthetic */ int A = 0;
    public final Context a;
    public final zzfj b;
    public final do4 c;
    public final y40 d;
    public zzgwr e;
    public zzgwr f;
    public final y40 g;
    public final Looper h;
    public final int i;
    public final zzd j;
    public final int k;
    public final boolean l;
    public final zznq m;
    public final zznp n;
    public final long o;
    public final long p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final boolean u;
    public boolean v;
    public final String w;
    public final boolean x;
    public final boolean y;
    public final zzjk z;

    static {
        String str = zzfq.a;
        String strA = zzgvh.a(Build.DEVICE);
        if (strA.contains("emulator") || strA.contains("emu64a") || strA.contains("emu64x") || strA.contains("generic")) {
            return;
        }
        strA.contains("vsoc");
    }

    public zzka(Context context, o34 o34Var) {
        do4 do4Var = new do4(o34Var, 12);
        y40 y40Var = new y40(context, 9);
        y40 y40Var2 = new y40(context, 10);
        ga4 ga4Var = ga4.y;
        y40 y40Var3 = new y40(context, 11);
        context.getClass();
        this.a = context;
        this.c = do4Var;
        this.d = y40Var;
        this.e = y40Var2;
        this.f = ga4Var;
        this.g = y40Var3;
        String str = zzfq.a;
        Looper looperMyLooper = Looper.myLooper();
        this.h = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.j = zzd.b;
        this.k = 1;
        this.l = true;
        this.m = zznq.c;
        this.n = zznp.b;
        this.z = new zzjk(zzfq.u(20L), zzfq.u(500L));
        this.b = zzdp.a;
        this.o = 500L;
        this.p = 2000L;
        this.q = 600000;
        this.r = Integer.MAX_VALUE;
        this.s = Integer.MAX_VALUE;
        this.t = 600000;
        this.u = true;
        this.w = "";
        this.i = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
            int i = l05.a;
        }
        this.x = true;
        this.y = true;
    }
}
