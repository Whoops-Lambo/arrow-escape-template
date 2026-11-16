package com.fyber.inneractive.sdk.bidder;

import android.app.Activity;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.a1;
import com.unity3d.player.UnityPlayer;
import defpackage.h50;
import java.util.ArrayList;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class d {
    public String A;
    public Boolean B;
    public String C;
    public InneractiveUserConfig.Gender D;
    public boolean E;
    public String F;
    public String G;
    public String H;
    public String I;
    public final boolean J;
    public Boolean K;
    public String L;
    public final com.fyber.inneractive.sdk.serverapi.c a;
    public String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public Long l;
    public int m;
    public int n;
    public final q o;
    public String p;
    public String q;
    public final g0 r;
    public Boolean s;
    public Boolean t;
    public Boolean u;
    public boolean v;
    public Boolean w;
    public Boolean x;
    public Boolean y;
    public int z;

    public d(com.fyber.inneractive.sdk.serverapi.c cVar) {
        String str;
        this.a = cVar;
        if (TextUtils.isEmpty(this.b)) {
            com.fyber.inneractive.sdk.util.r.a.execute(new c(this));
        }
        StringBuilder sb = new StringBuilder("2.2.0-Android-8.4.7");
        if (!TextUtils.isEmpty(InneractiveAdManager.getDevPlatform())) {
            sb.append('-');
            sb.append(InneractiveAdManager.getDevPlatform());
        }
        this.c = sb.toString();
        this.d = com.fyber.inneractive.sdk.util.o.a.getPackageName();
        this.e = com.fyber.inneractive.sdk.util.k.g();
        this.f = com.fyber.inneractive.sdk.util.k.i();
        this.m = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.d());
        this.n = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.c());
        com.fyber.inneractive.sdk.serverapi.a aVar = com.fyber.inneractive.sdk.serverapi.b.a;
        try {
            Activity activity = UnityPlayer.currentActivity;
            str = "unity3d";
        } catch (Throwable unused) {
            str = "native";
        }
        this.o = !str.equals("native") ? !str.equals("unity3d") ? q.UNRECOGNIZED : q.UNITY3D : q.NATIVE;
        this.r = (!com.fyber.inneractive.sdk.util.s.a() || IAConfigManager.Q.r) ? g0.SECURE : g0.UNSECURE;
        IAConfigManager iAConfigManager = IAConfigManager.Q;
        boolean zIsEmpty = TextUtils.isEmpty(iAConfigManager.o);
        String str2 = iAConfigManager.m;
        if (zIsEmpty) {
            this.G = str2;
        } else {
            this.G = h50.i(str2, "_", iAConfigManager.o);
        }
        this.J = InneractiveAdManager.isCurrentUserAChild();
        a();
        this.t = com.fyber.inneractive.sdk.serverapi.b.g();
        this.B = com.fyber.inneractive.sdk.serverapi.b.i();
        this.w = com.fyber.inneractive.sdk.serverapi.b.f();
        this.x = com.fyber.inneractive.sdk.serverapi.b.l();
        this.y = com.fyber.inneractive.sdk.serverapi.b.k();
    }

    public final void a() {
        String id;
        this.a.getClass();
        IAConfigManager iAConfigManager = IAConfigManager.Q;
        this.g = iAConfigManager.p;
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            this.a.getClass();
            this.h = com.fyber.inneractive.sdk.util.k.f();
            this.i = this.a.a();
            String str = this.a.b;
            this.j = str == null ? "" : str.substring(0, Math.min(3, str.length()));
            String str2 = this.a.b;
            this.k = str2 != null ? str2.substring(Math.min(3, str2.length())) : "";
            this.a.getClass();
            a1 a1VarA = a1.a();
            IAlog.a("ExchangeRequestParamsProvider: getNetwork : type: %s value: %s", a1VarA, a1VarA.b());
            this.q = a1VarA.b();
            int i = com.fyber.inneractive.sdk.config.n.a;
            String property = System.getProperty("ia.testEnvironmentConfiguration.device");
            if (TextUtils.isEmpty(property)) {
                com.fyber.inneractive.sdk.config.y yVar = com.fyber.inneractive.sdk.config.x.a.b;
                property = yVar != null ? yVar.a : null;
            }
            this.A = property;
            this.F = iAConfigManager.k.getZipCode();
        }
        this.D = iAConfigManager.k.getGender();
        this.l = com.fyber.inneractive.sdk.serverapi.b.e();
        try {
            id = TimeZone.getDefault().getID();
        } catch (Throwable unused) {
            id = null;
        }
        this.L = id;
        this.a.getClass();
        ArrayList arrayList = iAConfigManager.q;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.p = com.fyber.inneractive.sdk.util.o.a(arrayList);
        }
        this.C = com.fyber.inneractive.sdk.serverapi.b.b();
        this.v = com.fyber.inneractive.sdk.serverapi.b.h().booleanValue();
        this.z = com.fyber.inneractive.sdk.serverapi.b.c().intValue();
        this.E = iAConfigManager.l;
        this.s = com.fyber.inneractive.sdk.serverapi.b.m();
        IAConfigManager iAConfigManager2 = IAConfigManager.Q;
        boolean zIsEmpty = TextUtils.isEmpty(iAConfigManager2.o);
        String str3 = iAConfigManager2.m;
        if (zIsEmpty) {
            this.G = str3;
        } else {
            this.G = h50.i(str3, "_", iAConfigManager2.o);
        }
        this.u = com.fyber.inneractive.sdk.serverapi.b.n();
        iAConfigManager.F.n();
        com.fyber.inneractive.sdk.ignite.l lVar = iAConfigManager.F.o;
        this.H = lVar != null ? lVar.a.i() : null;
        com.fyber.inneractive.sdk.ignite.l lVar2 = iAConfigManager.F.o;
        this.I = lVar2 != null ? lVar2.a.d() : null;
        this.a.getClass();
        this.m = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.d());
        this.a.getClass();
        this.n = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.c());
        this.K = com.fyber.inneractive.sdk.serverapi.b.j();
    }
}
