package io.p071bidmachine.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzaca;
import com.google.android.gms.internal.ads.zzak;
import com.google.android.gms.internal.ads.zzbf;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzbqv;
import com.google.android.gms.internal.ads.zzbrn;
import com.google.android.gms.internal.ads.zzcha;
import com.google.android.gms.internal.ads.zzcly;
import com.google.android.gms.internal.ads.zzcmn;
import com.google.android.gms.internal.ads.zzdep;
import com.google.android.gms.internal.ads.zzdoo;
import com.google.android.gms.internal.ads.zzdoz;
import com.google.android.gms.internal.ads.zzdwy;
import com.google.android.gms.internal.ads.zzdxt;
import com.google.android.gms.internal.ads.zzdxx;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.ads.zzear;
import com.google.android.gms.internal.ads.zzeaw;
import com.google.android.gms.internal.ads.zzemc;
import com.google.android.gms.internal.ads.zzflq;
import com.google.android.gms.internal.ads.zzflv;
import com.google.android.gms.internal.ads.zzfmj;
import com.google.android.gms.internal.ads.zzfq;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzheh;
import com.google.android.gms.internal.ads.zznu;
import com.google.android.gms.internal.ads.zzqn;
import com.google.android.gms.internal.ads.zzwt;
import com.google.android.gms.internal.ads.zzxo;
import com.google.android.gms.internal.ads.zzxu;
import com.google.android.gms.internal.ads.zzxv;
import com.google.android.gms.internal.ads.zzzp;
import com.unity3d.services.UnityAdsConstants;
import defpackage.b35;
import defpackage.c35;
import defpackage.e35;
import defpackage.j9;
import defpackage.lz3;
import defpackage.w35;
import io.p071bidmachine.media3.common.r0;
import io.p071bidmachine.media3.common.util.u;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.exoplayer.analytics.f;
import io.p071bidmachine.media3.exoplayer.analytics.j;
import io.p071bidmachine.media3.exoplayer.drm.d;
import io.p071bidmachine.media3.exoplayer.drm.e;
import io.p071bidmachine.media3.exoplayer.source.a;
import io.p071bidmachine.media3.exoplayer.source.b0;
import io.p071bidmachine.media3.exoplayer.source.e0;
import io.p071bidmachine.media3.exoplayer.source.e1;
import io.p071bidmachine.media3.exoplayer.source.g0;
import io.p071bidmachine.media3.exoplayer.source.v;
import io.p071bidmachine.media3.exoplayer.source.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class t0 implements zzdoz {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public Object k;
    public Object l;

    public zzbf n(int i, int i2, zzzp zzzpVar) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= ((ArrayList) this.c).size()) {
            z = true;
        }
        zzgvz.a(z);
        this.l = zzzpVar;
        q(i, i2);
        return k();
    }

    public r0 a(int i, ArrayList arrayList, e1 e1Var) {
        ArrayList arrayList2 = (ArrayList) this.c;
        if (!arrayList.isEmpty()) {
            this.k = e1Var;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                s0 s0Var = (s0) arrayList.get(i2 - i);
                if (i2 > 0) {
                    s0 s0Var2 = (s0) arrayList2.get(i2 - 1);
                    s0Var.d = s0Var2.a.o.b.o() + s0Var2.d;
                    s0Var.e = false;
                    s0Var.c.clear();
                } else {
                    s0Var.d = 0;
                    s0Var.e = false;
                    s0Var.c.clear();
                }
                int iO = s0Var.a.o.b.o();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((s0) arrayList2.get(i3)).d += iO;
                }
                arrayList2.add(i2, s0Var);
                ((HashMap) this.e).put(s0Var.b, s0Var);
                if (this.a) {
                    f(s0Var);
                    if (((IdentityHashMap) this.d).isEmpty()) {
                        ((HashSet) this.h).add(s0Var);
                    } else {
                        r0 r0Var = (r0) ((HashMap) this.f).get(s0Var);
                        if (r0Var != null) {
                            r0Var.a.c(r0Var.b);
                        }
                    }
                }
            }
        }
        return c();
    }

    @Override // com.google.android.gms.internal.ads.zzdoz
    public void b(boolean z, Context context, zzdep zzdepVar) {
        boolean z2;
        float f;
        boolean z3;
        boolean z4 = this.a;
        zzfmj zzfmjVar = (zzfmj) this.d;
        zzflq zzflqVar = (zzflq) this.f;
        zzbqv zzbqvVar = (zzbqv) this.i;
        zzdwy zzdwyVar = (zzdwy) zzheh.n((zzcha) this.g);
        try {
            zzcly zzclyVarA = (zzcly) this.h;
            if (zzclyVarA.P()) {
                if (((Boolean) zzba.zzc().a(zzbjr.G1)).booleanValue()) {
                    zzclyVarA = ((zzdxt) this.c).a(zzfmjVar.f, null, null);
                    zzclyVarA.M("/reward", new zzbrn(zzdwyVar.f()));
                    new zzdxx();
                    zzdwyVar.g().a(zzclyVarA, true, z4 ? zzbqvVar : null, (zzear) this.k);
                    zzclyVarA.zzP().g = new j9(zzclyVarA);
                    zzclyVarA.zzP().h = new lz3(zzclyVarA);
                    zzflv zzflvVar = zzflqVar.s;
                    zzclyVarA.B(zzflvVar.b, zzflvVar.a);
                }
            }
            zzcly zzclyVar = zzclyVarA;
            zzclyVar.a0(true);
            boolean z5 = false;
            boolean zA = z4 ? zzbqvVar.a(false) : false;
            zzt.zzc();
            boolean zZzL = zzs.zzL((Context) this.b);
            if (z4) {
                synchronized (zzbqvVar) {
                    z3 = zzbqvVar.b;
                }
                if (z3) {
                    z5 = true;
                    z2 = z5;
                } else {
                    z2 = false;
                    z5 = true;
                }
            } else {
                z2 = z5;
            }
            if (z5) {
                synchronized (zzbqvVar) {
                    f = zzbqvVar.c;
                }
            } else {
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            zzl zzlVar = new zzl(zA, zZzL, z2, f, -1, z, zzflqVar.O, zzflqVar.P);
            if (zzdepVar != null) {
                zzdepVar.l0();
            }
            zzt.zzb();
            zzdoo zzdooVarE = zzdwyVar.e();
            int i = zzflqVar.Q;
            VersionInfoParcel versionInfoParcel = (VersionInfoParcel) this.e;
            String str = zzflqVar.B;
            zzflv zzflvVar2 = zzflqVar.s;
            zzn.zza(context, new AdOverlayInfoParcel(null, zzdooVarE, null, zzclyVar, i, versionInfoParcel, str, zzlVar, zzflvVar2.b, zzflvVar2.a, zzfmjVar.g, zzdepVar, zzflqVar.b() ? (zzemc) this.j : null, zzclyVar.zzn()), true, (zzeaw) this.l);
        } catch (zzcmn e) {
            int i2 = zze.zza;
            zzo.zzg("", e);
        }
    }

    public r0 c() {
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList.isEmpty()) {
            return r0.a;
        }
        int iO = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            s0 s0Var = (s0) arrayList.get(i);
            s0Var.d = iO;
            iO += s0Var.a.o.b.o();
        }
        return new z0(arrayList, (e1) this.k);
    }

    public void d() {
        Iterator it = ((HashSet) this.h).iterator();
        while (it.hasNext()) {
            s0 s0Var = (s0) it.next();
            if (s0Var.c.isEmpty()) {
                r0 r0Var = (r0) ((HashMap) this.f).get(s0Var);
                if (r0Var != null) {
                    r0Var.a.c(r0Var.b);
                }
                it.remove();
            }
        }
    }

    public void e(s0 s0Var) {
        if (s0Var.e && s0Var.c.isEmpty()) {
            r0 r0Var = (r0) ((HashMap) this.f).remove(s0Var);
            r0Var.getClass();
            q0 q0Var = r0Var.c;
            a aVar = r0Var.a;
            aVar.o(r0Var.b);
            aVar.r(q0Var);
            aVar.q(q0Var);
            ((HashSet) this.h).remove(s0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [io.bidmachine.media3.exoplayer.n0, io.bidmachine.media3.exoplayer.source.e0] */
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
    public void f(s0 s0Var) {
        y yVar = s0Var.a;
        ?? r1 = new e0() { // from class: io.bidmachine.media3.exoplayer.n0
            @Override // io.p071bidmachine.media3.exoplayer.source.e0
            public final void a(a aVar, r0 r0Var) {
                u uVar = ((d0) this.a.g).h;
                uVar.d(2);
                uVar.e(22);
            }
        };
        q0 q0Var = new q0(this, s0Var);
        ((HashMap) this.f).put(s0Var, new r0(yVar, r1, q0Var));
        int i = x.a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        yVar.getClass();
        e eVar = yVar.c;
        eVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = eVar.c;
        g0 g0Var = new g0();
        g0Var.a = handler;
        g0Var.b = q0Var;
        copyOnWriteArrayList.add(g0Var);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        new Handler(looperMyLooper2, null);
        e eVar2 = yVar.d;
        eVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = eVar2.c;
        d dVar = new d();
        dVar.a = q0Var;
        copyOnWriteArrayList2.add(dVar);
        yVar.k(r1, (io.p071bidmachine.media3.exoplayer.upstream.e) this.l, (j) this.b);
    }

    public void g(b0 b0Var) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.d;
        s0 s0Var = (s0) identityHashMap.remove(b0Var);
        s0Var.getClass();
        s0Var.a.n(b0Var);
        s0Var.c.remove(((v) b0Var).a);
        if (!identityHashMap.isEmpty()) {
            d();
        }
        e(s0Var);
    }

    public void h(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.c;
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            s0 s0Var = (s0) arrayList.remove(i3);
            ((HashMap) this.e).remove(s0Var.b);
            int i4 = -s0Var.a.o.b.o();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((s0) arrayList.get(i5)).d += i4;
            }
            s0Var.e = true;
            if (this.a) {
                e(s0Var);
            }
        }
    }

    public zzbf i(int i, int i2, List list) {
        ArrayList arrayList = (ArrayList) this.c;
        zzgvz.a(i >= 0 && i <= i2 && i2 <= arrayList.size());
        zzgvz.a(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((e35) arrayList.get(i3)).a.f((zzak) list.get(i3 - i));
        }
        return k();
    }

    public void j() {
        zzgvz.f(!this.a);
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.c;
            if (i >= arrayList.size()) {
                this.a = true;
                return;
            }
            e35 e35Var = (e35) arrayList.get(i);
            r(e35Var);
            ((HashSet) this.h).add(e35Var);
            i++;
        }
    }

    public zzbf k() {
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList.isEmpty()) {
            return zzbf.a;
        }
        int iA = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            e35 e35Var = (e35) arrayList.get(i);
            e35Var.d = iA;
            iA += e35Var.a.o.b.a();
        }
        return new w35(arrayList, (zzzp) this.l);
    }

    public zzbf l(List list, zzzp zzzpVar) {
        ArrayList arrayList = (ArrayList) this.c;
        q(0, arrayList.size());
        return m(arrayList.size(), list, zzzpVar);
    }

    public zzbf m(int i, List list, zzzp zzzpVar) {
        ArrayList arrayList = (ArrayList) this.c;
        if (!list.isEmpty()) {
            this.l = zzzpVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                e35 e35Var = (e35) list.get(i2 - i);
                if (i2 > 0) {
                    e35 e35Var2 = (e35) arrayList.get(i2 - 1);
                    e35Var.d = e35Var2.a.o.b.a() + e35Var2.d;
                    e35Var.e = false;
                    e35Var.c.clear();
                } else {
                    e35Var.d = 0;
                    e35Var.e = false;
                    e35Var.c.clear();
                }
                int iA = e35Var.a.o.b.a();
                for (int i3 = i2; i3 < arrayList.size(); i3++) {
                    ((e35) arrayList.get(i3)).d += iA;
                }
                arrayList.add(i2, e35Var);
                ((HashMap) this.e).put(e35Var.b, e35Var);
                if (this.a) {
                    r(e35Var);
                    if (((IdentityHashMap) this.d).isEmpty()) {
                        ((HashSet) this.h).add(e35Var);
                    } else {
                        c35 c35Var = (c35) ((HashMap) this.f).get(e35Var);
                        if (c35Var != null) {
                            c35Var.a.c(c35Var.b);
                        }
                    }
                }
            }
        }
        return k();
    }

    public zzbf o(zzzp zzzpVar) {
        int size = ((ArrayList) this.c).size();
        if (zzzpVar.b.length != size) {
            zzzpVar = new zzzp(new Random(zzzpVar.a.nextLong())).a(size);
        }
        this.l = zzzpVar;
        return k();
    }

    public void p() {
        Iterator it = ((HashSet) this.h).iterator();
        while (it.hasNext()) {
            e35 e35Var = (e35) it.next();
            if (e35Var.c.isEmpty()) {
                c35 c35Var = (c35) ((HashMap) this.f).get(e35Var);
                if (c35Var != null) {
                    c35Var.a.c(c35Var.b);
                }
                it.remove();
            }
        }
    }

    public void q(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.c;
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            e35 e35Var = (e35) arrayList.remove(i2);
            ((HashMap) this.e).remove(e35Var.b);
            int i3 = -e35Var.a.o.b.a();
            for (int i4 = i2; i4 < arrayList.size(); i4++) {
                ((e35) arrayList.get(i4)).d += i3;
            }
            e35Var.e = true;
            if (this.a) {
                s(e35Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.zzxu, h35] */
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
    public void r(e35 e35Var) {
        zzxo zzxoVar = e35Var.a;
        ?? r1 = new zzxu() { // from class: h35
            @Override // com.google.android.gms.internal.ads.zzxu
            public final void a(zzwt zzwtVar, zzbf zzbfVar) {
                zzea zzeaVar = ((com.google.android.gms.internal.ads.e0) this.a.i).g;
                zzeaVar.b(2);
                zzeaVar.zzh(22);
            }
        };
        b35 b35Var = new b35(this, e35Var);
        ((HashMap) this.f).put(e35Var, new c35(zzxoVar, r1, b35Var));
        String str = zzfq.a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        zzxoVar.b(new Handler(looperMyLooper, null), b35Var);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        zzxoVar.h(new Handler(looperMyLooper2, null), b35Var);
        zzxoVar.j(r1, (zzqn) this.b, (zzaca) this.g);
    }

    public void s(e35 e35Var) {
        if (e35Var.e && e35Var.c.isEmpty()) {
            c35 c35Var = (c35) ((HashMap) this.f).remove(e35Var);
            c35Var.getClass();
            zzxv zzxvVar = c35Var.a;
            zzxvVar.a(c35Var.b);
            b35 b35Var = c35Var.c;
            zzxvVar.e(b35Var);
            zzxvVar.g(b35Var);
            ((HashSet) this.h).remove(e35Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdoz
    public zzflq zzb() {
        return (zzflq) this.f;
    }

    public t0(com.google.android.gms.internal.ads.e0 e0Var, zznu zznuVar, zzea zzeaVar, zzqn zzqnVar, zzaca zzacaVar) {
        this.b = zzqnVar;
        this.g = zzacaVar;
        this.i = e0Var;
        this.l = new zzzp();
        this.d = new IdentityHashMap();
        this.e = new HashMap();
        this.c = new ArrayList();
        this.j = zznuVar;
        this.k = zzeaVar;
        this.f = new HashMap();
        this.h = new HashSet();
    }

    public t0(Context context, zzdxt zzdxtVar, zzfmj zzfmjVar, VersionInfoParcel versionInfoParcel, zzflq zzflqVar, zzcha zzchaVar, zzcly zzclyVar, zzbqv zzbqvVar, boolean z, zzemc zzemcVar, zzear zzearVar, zzeaw zzeawVar) {
        this.b = context;
        this.c = zzdxtVar;
        this.d = zzfmjVar;
        this.e = versionInfoParcel;
        this.f = zzflqVar;
        this.g = zzchaVar;
        this.h = zzclyVar;
        this.i = zzbqvVar;
        this.a = z;
        this.j = zzemcVar;
        this.k = zzearVar;
        this.l = zzeawVar;
    }

    public t0(d0 d0Var, f fVar, u uVar, j jVar) {
        this.b = jVar;
        this.g = d0Var;
        this.k = new e1();
        this.d = new IdentityHashMap();
        this.e = new HashMap();
        this.c = new ArrayList();
        this.i = fVar;
        this.j = uVar;
        this.f = new HashMap();
        this.h = new HashSet();
    }
}
