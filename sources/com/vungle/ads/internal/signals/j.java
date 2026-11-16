package com.vungle.ads.internal.signals;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.s3;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import defpackage.ep0;
import defpackage.eu;
import defpackage.gd1;
import defpackage.l93;
import defpackage.p32;
import defpackage.pd1;
import defpackage.r91;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class j {
    public final Context a;
    public final r91 b;
    public long c;
    public long d;
    public long e;
    public int f;
    public long g;
    public c h;
    public ConcurrentHashMap i;
    public final gd1 j;
    public com.vungle.ads.internal.session.b k;

    public final void b(String str) {
        if (str == null || str.length() == 0 || this.h.d.isEmpty()) {
            return;
        }
        ((m) this.h.d.get(0)).c = str;
    }

    public final FilePreferences c() {
        return (FilePreferences) this.j.getValue();
    }

    public final String d() {
        return this.h.b;
    }

    public final void e() {
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f;
        com.vungle.ads.internal.util.a.a(new f(this));
    }

    public final void f() {
        if (this.f == -1) {
            this.f = c().a("vungle_signal_session_count", 0);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.g;
        long j2 = jCurrentTimeMillis - j;
        if (j < 0 || j2 >= 86400000) {
            this.f = 1;
            c().b("vungle_signal_session_creation_time", jCurrentTimeMillis);
            this.g = jCurrentTimeMillis;
        } else {
            this.f++;
        }
        c().b("vungle_signal_session_count", this.f);
        c().b();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public j(Context context) {
        context.getClass();
        this.a = context;
        this.b = l93.b(e.a);
        this.d = System.currentTimeMillis();
        this.f = -1;
        this.i = new ConcurrentHashMap();
        g gVar = new g(context);
        pd1 pd1Var = pd1.a;
        this.j = eu.v(pd1Var, gVar);
        e();
        this.g = c().a("vungle_signal_session_creation_time", -1L);
        f();
        this.h = new c(this.f);
        com.vungle.ads.internal.session.b bVar = new com.vungle.ads.internal.session.b(context, this.h.a(), a(eu.v(pd1Var, new h(context))), b(eu.v(pd1Var, new i(context))));
        this.k = bVar;
        this.h.a(bVar.b());
        boolean z = u.a;
        t.a("SignalManager", new d(this));
        try {
            this.h.a(!com.vungle.ads.internal.platform.e.a() ? 1 : 0);
            this.h.e(com.vungle.ads.internal.platform.e.f(context) ? 1 : 0);
            this.h.c(com.vungle.ads.internal.platform.e.d(context) ? 1 : 0);
            this.h.d(com.vungle.ads.internal.platform.e.c(context));
            this.h.b(com.vungle.ads.internal.platform.e.e(context) ? 1 : 0);
        } catch (Exception e) {
            boolean z2 = u.a;
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Failed to collect device signals: ");
            sbA.append(e.getLocalizedMessage());
            t.b("SignalManager", sbA.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[PHI: r1
  0x0044: PHI (r1v1 int) = (r1v0 int), (r1v2 int) binds: [B:19:0x004e, B:14:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0046 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    public final void a(Context context, m mVar) {
        Integer numValueOf;
        int i;
        Configuration configuration;
        mVar.getClass();
        this.h.b().clear();
        this.h.b().add(mVar);
        int i2 = 0;
        m mVar2 = (m) this.h.b().get(0);
        if (context == null) {
            context = this.a;
        }
        Resources resources = context.getResources();
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            numValueOf = Integer.valueOf(configuration.orientation);
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            i = 2;
            if (numValueOf.intValue() == 2) {
                i2 = i;
            } else {
                if (numValueOf != null) {
                    i = 1;
                    if (numValueOf.intValue() == 1) {
                        i2 = i;
                    }
                }
                if (numValueOf != null) {
                    i2 = -1;
                } else {
                    i2 = -1;
                }
            }
        } else {
            if (numValueOf != null) {
                i = 1;
                if (numValueOf.intValue() == 1) {
                    i2 = i;
                }
            }
            if (numValueOf != null || numValueOf.intValue() != 0) {
                i2 = -1;
            }
        }
        mVar2.a(i2);
    }

    public static final PathProvider b(gd1 gd1Var) {
        return (PathProvider) gd1Var.getValue();
    }

    public final void b(s3 s3Var) {
        s3Var.getClass();
        ConfigManager.INSTANCE.getClass();
        if (ConfigManager.t()) {
            return;
        }
        this.k.b(s3Var);
    }

    public final c b() {
        return this.h;
    }

    public static final com.vungle.ads.internal.executor.a a(gd1 gd1Var) {
        return (com.vungle.ads.internal.executor.a) gd1Var.getValue();
    }

    public final synchronized m a(String str) {
        long jCurrentTimeMillis;
        Long l;
        try {
            str.getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
            l = this.i.containsKey(str) ? (Long) this.i.get(str) : null;
            this.i.put(str, Long.valueOf(jCurrentTimeMillis));
        } catch (Throwable th) {
            throw th;
        }
        return new m(l, jCurrentTimeMillis);
    }

    public final void a(s3 s3Var) {
        s3Var.getClass();
        ConfigManager.INSTANCE.getClass();
        if (ConfigManager.t()) {
            return;
        }
        this.k.a(s3Var);
    }

    public final String a() {
        this.h.e = (System.currentTimeMillis() + this.e) - this.d;
        try {
            r91 r91Var = this.b;
            return "2:".concat(r91Var.b(ep0.A(r91Var.b, p32.d(c.class)), this.h));
        } catch (Throwable unused) {
            return null;
        }
    }
}
