package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzky;
import com.google.android.gms.internal.measurement.zzlk;
import com.google.android.gms.internal.measurement.zzmb;
import com.google.android.gms.internal.measurement.zzmc;
import com.google.android.gms.internal.measurement.zzmd;
import com.google.android.gms.internal.measurement.zzme;
import com.google.android.gms.internal.measurement.zzmj;
import com.google.android.gms.internal.measurement.zzmk;
import com.google.android.gms.internal.measurement.zznu;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzpu;
import com.google.android.gms.internal.measurement.zzqe;
import com.google.android.gms.internal.measurement.zzqm;
import com.google.android.gms.internal.measurement.zzqn;
import com.google.android.gms.internal.measurement.zzru;
import com.google.android.gms.internal.measurement.zzrz;
import com.google.android.gms.internal.measurement.zzsa;
import com.google.android.gms.internal.measurement.zzto;
import com.google.android.gms.internal.measurement.zztp;
import com.google.android.gms.internal.measurement.zztr;
import com.google.android.gms.internal.measurement.zztt;
import com.google.android.gms.internal.measurement.zztu;
import com.google.android.gms.internal.measurement.zztw;
import com.google.android.gms.internal.measurement.zzui;
import com.google.android.gms.internal.measurement.zzuj;
import com.google.android.gms.internal.measurement.zzuw;
import com.google.android.gms.internal.measurement.zzvb;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.b55;
import defpackage.dp4;
import defpackage.e42;
import defpackage.e55;
import defpackage.m12;
import defpackage.p2;
import defpackage.q31;
import defpackage.rs0;
import defpackage.vp3;
import defpackage.xw1;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzpg {
    public static final zzpe i = new zzpe(0);
    public static final b55 j;
    public volatile xw1 a;
    public final zzlk b;
    public final String c;
    public final String d;
    public final boolean e;
    public final q31 f;
    public final zzps g;
    public final zzqt h;

    static {
        vp3 vp3Var = vp3.c;
        int i2 = q31.c;
        j = new b55(vp3Var, false, e42.j);
    }

    public final xw1 a() {
        xw1 xw1Var;
        xw1 xw1Var2 = this.a;
        if (xw1Var2 != null) {
            return xw1Var2;
        }
        synchronized (this) {
            try {
                xw1Var = this.a;
                if (xw1Var == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                    try {
                        xw1 xw1VarA = this.h.a();
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        int i2 = ((m12) xw1VarA.b).c - 2;
                        if (i2 == 15 || i2 == 16) {
                            xw1Var = xw1VarA;
                        } else {
                            zzlk zzlkVar = this.b;
                            zzlkVar.g.a();
                            if (this.e || this.h.b() || !((String) xw1VarA.c).isEmpty()) {
                                final int i3 = 3;
                                zzlkVar.a().execute(new Runnable(this) { // from class: d55
                                    public final /* synthetic */ zzpg b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Uri uri;
                                        zznu zznuVar;
                                        zzuj zzujVar;
                                        ListenableFuture listenableFutureA;
                                        e0 e0VarZzb;
                                        int i4 = i3;
                                        boolean z = true;
                                        boolean z2 = true;
                                        int i5 = 0;
                                        zzpg zzpgVar = this.b;
                                        switch (i4) {
                                            case 0:
                                                zzpgVar.b();
                                                return;
                                            case 1:
                                                zzlk zzlkVar2 = zzpgVar.b;
                                                String str = zzpgVar.c;
                                                zzvb zzvbVar = zzpu.a;
                                                u85 u85Var = new u85();
                                                u85Var.d = zztw.a;
                                                byte b = (byte) (u85Var.f | 2);
                                                u85Var.e = true;
                                                u85Var.f = (byte) (b | 1);
                                                Context context = zzlkVar2.b;
                                                Pattern pattern = zzsa.a;
                                                zzrz zzrzVar = new zzrz(context);
                                                zzrzVar.a("phenotype");
                                                zzrzVar.b("all_accounts.pb");
                                                Uri uriC = zzrzVar.c();
                                                if (uriC == null) {
                                                    d.w("Null uri");
                                                    return;
                                                }
                                                u85Var.a = uriC;
                                                zznu zznuVarA = zznu.A();
                                                if (zznuVarA == null) {
                                                    d.w("Null schema");
                                                    return;
                                                }
                                                u85Var.b = zznuVarA;
                                                zzvb zzvbVar2 = zzpu.a;
                                                zzvbVar2.getClass();
                                                py1 py1Var = new py1(zzvbVar2);
                                                byte b2 = (byte) (u85Var.f | 2);
                                                u85Var.f = b2;
                                                if (u85Var.c == null) {
                                                    z21 z21Var = d31.b;
                                                    u85Var.c = y32.e;
                                                }
                                                if (b2 != 3 || (uri = u85Var.a) == null || (zznuVar = u85Var.b) == null || (zzujVar = u85Var.d) == null) {
                                                    StringBuilder sb = new StringBuilder();
                                                    if (u85Var.a == null) {
                                                        sb.append(" uri");
                                                    }
                                                    if (u85Var.b == null) {
                                                        sb.append(" schema");
                                                    }
                                                    if (u85Var.d == null) {
                                                        sb.append(" variantConfig");
                                                    }
                                                    if ((u85Var.f & 1) == 0) {
                                                        sb.append(" useGeneratedExtensionRegistry");
                                                    }
                                                    if ((u85Var.f & 2) == 0) {
                                                        sb.append(" enableTracing");
                                                    }
                                                    e32.i("Missing required properties:".concat(sb.toString()));
                                                    return;
                                                }
                                                x85 x85Var = new x85(uri, zznuVar, py1Var, u85Var.c, zzujVar, u85Var.e);
                                                zztt zzttVar = zzpu.c;
                                                if (zzttVar == null) {
                                                    synchronized (zzpu.b) {
                                                        try {
                                                            zzttVar = zzpu.c;
                                                            if (zzttVar == null) {
                                                                zztu zztuVar = new zztu();
                                                                zztuVar.a = zzlkVar2.a();
                                                                zztuVar.b = (zzru) zzlkVar2.f.get();
                                                                j95 j95Var = j95.a;
                                                                HashMap map = zztuVar.c;
                                                                fs1.h(!map.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                map.put("singleproc", j95Var);
                                                                zztt zzttVar2 = new zztt(zztuVar.a, zztuVar.b, zztuVar.d, zztuVar.c);
                                                                zzpu.c = zzttVar2;
                                                                zzttVar = zzttVar2;
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                        break;
                                                    }
                                                }
                                                ConcurrentHashMap concurrentHashMap = zzttVar.a;
                                                Uri uri2 = x85Var.a;
                                                Pair pairCreate = (Pair) concurrentHashMap.get(uri2);
                                                if (pairCreate == null) {
                                                    Uri uri3 = x85Var.a;
                                                    fs1.h(uri3.isHierarchical(), "Uri must be hierarchical: %s", uri3);
                                                    String lastPathSegment = uri3.getLastPathSegment();
                                                    if (lastPathSegment == null) {
                                                        lastPathSegment = "";
                                                    }
                                                    int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                                                    fs1.h((iLastIndexOf == -1 ? "" : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uri3);
                                                    fs1.f("Handler cannot be null", x85Var.c != null);
                                                    zzuw zzuwVar = (zzuw) zzttVar.e.get("singleproc");
                                                    fs1.h(zzuwVar != null, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                    String lastPathSegment2 = x85Var.a.getLastPathSegment();
                                                    String strSubstring = lastPathSegment2 != null ? lastPathSegment2 : "";
                                                    int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                                                    if (iLastIndexOf2 != -1) {
                                                        strSubstring = strSubstring.substring(0, iLastIndexOf2);
                                                    }
                                                    o2 o2VarG = rs0.g(rs0.d(x85Var.a), zzttVar.d, gc0.a);
                                                    Executor executor = zzttVar.b;
                                                    zzui zzuiVarB = zzuwVar.b(x85Var, strSubstring, executor, zzttVar.c);
                                                    zzuwVar.a();
                                                    zztp zztpVar = new zztp(zzuiVarB, o2VarG);
                                                    d31 d31Var = x85Var.d;
                                                    if (!d31Var.isEmpty()) {
                                                        zzto zztoVar = new zzto(d31Var, executor);
                                                        synchronized (zztpVar.g) {
                                                            zztpVar.i.add(zztoVar);
                                                        }
                                                    }
                                                    pairCreate = Pair.create(zztpVar, x85Var);
                                                    Pair pair = (Pair) concurrentHashMap.putIfAbsent(uri2, pairCreate);
                                                    if (pair != null) {
                                                        pairCreate = pair;
                                                    }
                                                    break;
                                                }
                                                zztp zztpVar2 = (zztp) pairCreate.first;
                                                zztr zztrVar = (zztr) pairCreate.second;
                                                if (x85Var.equals(zztrVar)) {
                                                    p2 p2VarA = zztpVar2.a(new h55(str, z ? 1 : 0), zzlkVar2.a());
                                                    p2VarA.addListener(new fj4(11, zzpgVar, p2VarA), zzlkVar2.a());
                                                    return;
                                                }
                                                String strX = eu.x("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", x85Var.b.getClass().getSimpleName(), x85Var.a);
                                                fs1.h(x85Var.a.equals(zztrVar.a()), strX, "uri");
                                                fs1.h(x85Var.b.equals(zztrVar.b()), strX, "schema");
                                                fs1.h(x85Var.c.equals(zztrVar.c()), strX, "handler");
                                                fs1.h(x85Var.d.equals(zztrVar.d()), strX, "migrations");
                                                fs1.h(x85Var.e.equals(zztrVar.e()), strX, "variantConfig");
                                                fs1.h(x85Var.f == zztrVar.f(), strX, "useGeneratedExtensionRegistry");
                                                d.r(eu.x(strX, "unknown"));
                                                return;
                                            case 2:
                                                zzqe zzqeVar = zzpgVar.b.i;
                                                boolean z3 = zzpgVar.e;
                                                g55 g55Var = g55.a;
                                                zzqm zzqmVar = (zzqm) zzqeVar.c.get();
                                                if (zzqmVar == null && !z3) {
                                                    s21 s21Var = s21.b;
                                                    return;
                                                }
                                                if ((zzqeVar.e & 64) == 0) {
                                                    CopyOnWriteArrayList copyOnWriteArrayList = zzqeVar.f;
                                                    synchronized (copyOnWriteArrayList) {
                                                        try {
                                                            int i6 = zzqeVar.e;
                                                            if ((i6 & 64) == 0) {
                                                                copyOnWriteArrayList.add(g55Var);
                                                                zzqeVar.e = i6 | 64;
                                                            }
                                                        } catch (Throwable th2) {
                                                            throw th2;
                                                        }
                                                        break;
                                                    }
                                                }
                                                if (zzqeVar.h == null) {
                                                    synchronized (zzqeVar.g) {
                                                        try {
                                                            if (zzqeVar.h == null) {
                                                                if (zzqmVar == null) {
                                                                    zzqmVar = k65.a;
                                                                }
                                                                Context context2 = zzqeVar.a;
                                                                if (zzky.b(context2)) {
                                                                    listenableFutureA = ((zzmj) zzqeVar.d.get()).a(new n65(zzqeVar, zzqmVar));
                                                                    zzqeVar.h = listenableFutureA;
                                                                } else {
                                                                    w wVar = w.c;
                                                                    ol2 ol2Var = zzqeVar.b;
                                                                    listenableFutureA = rs0.g(zzky.a(context2, Executors.callable(wVar, null), (Executor) ol2Var.get()), new i65(i5, zzqeVar, zzqmVar), (Executor) ol2Var.get());
                                                                    zzqeVar.h = listenableFutureA;
                                                                }
                                                                listenableFutureA.addListener(new c65(z2 ? 1 : 0, listenableFutureA), (Executor) zzqeVar.b.get());
                                                            }
                                                        } catch (Throwable th3) {
                                                            throw th3;
                                                        }
                                                        break;
                                                    }
                                                    return;
                                                }
                                                return;
                                            default:
                                                xw1 xw1VarA2 = zzpgVar.a();
                                                String str2 = (String) xw1VarA2.c;
                                                zzlk zzlkVar3 = zzpgVar.b;
                                                ol2 ol2Var2 = zzlkVar3.d;
                                                zzqn zzqnVarB = zzlkVar3.g.b();
                                                boolean z4 = zzqnVarB.i;
                                                if (zzqnVarB.j) {
                                                    if (h00.s(str2) && !z4) {
                                                        s21 s21Var2 = s21.b;
                                                        return;
                                                    }
                                                    zzmb zzmbVarA = zzme.A();
                                                    m12 m12Var = (m12) xw1VarA2.b;
                                                    int i7 = m12Var.b;
                                                    zzmc zzmcVarZ = zzmd.z();
                                                    zzmcVarZ.l();
                                                    ((zzmd) zzmcVarZ.b).A(i7);
                                                    int i8 = m12Var.c;
                                                    zzmcVarZ.l();
                                                    ((zzmd) zzmcVarZ.b).B(i8);
                                                    zzmd zzmdVar = (zzmd) zzmcVarZ.n();
                                                    zzmbVarA.l();
                                                    ((zzme) zzmbVarA.b).C(zzmdVar);
                                                    if (!h00.s(str2)) {
                                                        zzmbVarA.l();
                                                        ((zzme) zzmbVarA.b).B(str2);
                                                    }
                                                    if (z4) {
                                                        String str3 = zzpgVar.c;
                                                        zzmbVarA.l();
                                                        ((zzme) zzmbVarA.b).D(str3);
                                                    }
                                                    e0VarZzb = ((zzmj) ol2Var2.get()).b((zzme) zzmbVarA.n());
                                                } else {
                                                    if (h00.s(str2)) {
                                                        s21 s21Var3 = s21.b;
                                                        return;
                                                    }
                                                    e0VarZzb = ((zzmj) ol2Var2.get()).zzb(str2);
                                                }
                                                rs0.a(e0VarZzb, zzmk.class, new e55(zzpgVar, i5), zzlkVar3.a());
                                                return;
                                        }
                                    }
                                });
                                zzlkVar.a.a((zzacr) xw1VarA.d, this.f, this.c);
                                if (!this.d.equals("")) {
                                    final int i4 = 1;
                                    zzlkVar.a().execute(new Runnable(this) { // from class: d55
                                        public final /* synthetic */ zzpg b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Uri uri;
                                            zznu zznuVar;
                                            zzuj zzujVar;
                                            ListenableFuture listenableFutureA;
                                            e0 e0VarZzb;
                                            int i5 = i4;
                                            boolean z = true;
                                            boolean z2 = true;
                                            int i6 = 0;
                                            zzpg zzpgVar = this.b;
                                            switch (i5) {
                                                case 0:
                                                    zzpgVar.b();
                                                    return;
                                                case 1:
                                                    zzlk zzlkVar2 = zzpgVar.b;
                                                    String str = zzpgVar.c;
                                                    zzvb zzvbVar = zzpu.a;
                                                    u85 u85Var = new u85();
                                                    u85Var.d = zztw.a;
                                                    byte b = (byte) (u85Var.f | 2);
                                                    u85Var.e = true;
                                                    u85Var.f = (byte) (b | 1);
                                                    Context context = zzlkVar2.b;
                                                    Pattern pattern = zzsa.a;
                                                    zzrz zzrzVar = new zzrz(context);
                                                    zzrzVar.a("phenotype");
                                                    zzrzVar.b("all_accounts.pb");
                                                    Uri uriC = zzrzVar.c();
                                                    if (uriC == null) {
                                                        d.w("Null uri");
                                                        return;
                                                    }
                                                    u85Var.a = uriC;
                                                    zznu zznuVarA = zznu.A();
                                                    if (zznuVarA == null) {
                                                        d.w("Null schema");
                                                        return;
                                                    }
                                                    u85Var.b = zznuVarA;
                                                    zzvb zzvbVar2 = zzpu.a;
                                                    zzvbVar2.getClass();
                                                    py1 py1Var = new py1(zzvbVar2);
                                                    byte b2 = (byte) (u85Var.f | 2);
                                                    u85Var.f = b2;
                                                    if (u85Var.c == null) {
                                                        z21 z21Var = d31.b;
                                                        u85Var.c = y32.e;
                                                    }
                                                    if (b2 != 3 || (uri = u85Var.a) == null || (zznuVar = u85Var.b) == null || (zzujVar = u85Var.d) == null) {
                                                        StringBuilder sb = new StringBuilder();
                                                        if (u85Var.a == null) {
                                                            sb.append(" uri");
                                                        }
                                                        if (u85Var.b == null) {
                                                            sb.append(" schema");
                                                        }
                                                        if (u85Var.d == null) {
                                                            sb.append(" variantConfig");
                                                        }
                                                        if ((u85Var.f & 1) == 0) {
                                                            sb.append(" useGeneratedExtensionRegistry");
                                                        }
                                                        if ((u85Var.f & 2) == 0) {
                                                            sb.append(" enableTracing");
                                                        }
                                                        e32.i("Missing required properties:".concat(sb.toString()));
                                                        return;
                                                    }
                                                    x85 x85Var = new x85(uri, zznuVar, py1Var, u85Var.c, zzujVar, u85Var.e);
                                                    zztt zzttVar = zzpu.c;
                                                    if (zzttVar == null) {
                                                        synchronized (zzpu.b) {
                                                            try {
                                                                zzttVar = zzpu.c;
                                                                if (zzttVar == null) {
                                                                    zztu zztuVar = new zztu();
                                                                    zztuVar.a = zzlkVar2.a();
                                                                    zztuVar.b = (zzru) zzlkVar2.f.get();
                                                                    j95 j95Var = j95.a;
                                                                    HashMap map = zztuVar.c;
                                                                    fs1.h(!map.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                    map.put("singleproc", j95Var);
                                                                    zztt zzttVar2 = new zztt(zztuVar.a, zztuVar.b, zztuVar.d, zztuVar.c);
                                                                    zzpu.c = zzttVar2;
                                                                    zzttVar = zzttVar2;
                                                                }
                                                            } catch (Throwable th) {
                                                                throw th;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    ConcurrentHashMap concurrentHashMap = zzttVar.a;
                                                    Uri uri2 = x85Var.a;
                                                    Pair pairCreate = (Pair) concurrentHashMap.get(uri2);
                                                    if (pairCreate == null) {
                                                        Uri uri3 = x85Var.a;
                                                        fs1.h(uri3.isHierarchical(), "Uri must be hierarchical: %s", uri3);
                                                        String lastPathSegment = uri3.getLastPathSegment();
                                                        if (lastPathSegment == null) {
                                                            lastPathSegment = "";
                                                        }
                                                        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                                                        fs1.h((iLastIndexOf == -1 ? "" : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uri3);
                                                        fs1.f("Handler cannot be null", x85Var.c != null);
                                                        zzuw zzuwVar = (zzuw) zzttVar.e.get("singleproc");
                                                        fs1.h(zzuwVar != null, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                        String lastPathSegment2 = x85Var.a.getLastPathSegment();
                                                        String strSubstring = lastPathSegment2 != null ? lastPathSegment2 : "";
                                                        int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                                                        if (iLastIndexOf2 != -1) {
                                                            strSubstring = strSubstring.substring(0, iLastIndexOf2);
                                                        }
                                                        o2 o2VarG = rs0.g(rs0.d(x85Var.a), zzttVar.d, gc0.a);
                                                        Executor executor = zzttVar.b;
                                                        zzui zzuiVarB = zzuwVar.b(x85Var, strSubstring, executor, zzttVar.c);
                                                        zzuwVar.a();
                                                        zztp zztpVar = new zztp(zzuiVarB, o2VarG);
                                                        d31 d31Var = x85Var.d;
                                                        if (!d31Var.isEmpty()) {
                                                            zzto zztoVar = new zzto(d31Var, executor);
                                                            synchronized (zztpVar.g) {
                                                                zztpVar.i.add(zztoVar);
                                                            }
                                                        }
                                                        pairCreate = Pair.create(zztpVar, x85Var);
                                                        Pair pair = (Pair) concurrentHashMap.putIfAbsent(uri2, pairCreate);
                                                        if (pair != null) {
                                                            pairCreate = pair;
                                                        }
                                                        break;
                                                    }
                                                    zztp zztpVar2 = (zztp) pairCreate.first;
                                                    zztr zztrVar = (zztr) pairCreate.second;
                                                    if (x85Var.equals(zztrVar)) {
                                                        p2 p2VarA = zztpVar2.a(new h55(str, z ? 1 : 0), zzlkVar2.a());
                                                        p2VarA.addListener(new fj4(11, zzpgVar, p2VarA), zzlkVar2.a());
                                                        return;
                                                    }
                                                    String strX = eu.x("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", x85Var.b.getClass().getSimpleName(), x85Var.a);
                                                    fs1.h(x85Var.a.equals(zztrVar.a()), strX, "uri");
                                                    fs1.h(x85Var.b.equals(zztrVar.b()), strX, "schema");
                                                    fs1.h(x85Var.c.equals(zztrVar.c()), strX, "handler");
                                                    fs1.h(x85Var.d.equals(zztrVar.d()), strX, "migrations");
                                                    fs1.h(x85Var.e.equals(zztrVar.e()), strX, "variantConfig");
                                                    fs1.h(x85Var.f == zztrVar.f(), strX, "useGeneratedExtensionRegistry");
                                                    d.r(eu.x(strX, "unknown"));
                                                    return;
                                                case 2:
                                                    zzqe zzqeVar = zzpgVar.b.i;
                                                    boolean z3 = zzpgVar.e;
                                                    g55 g55Var = g55.a;
                                                    zzqm zzqmVar = (zzqm) zzqeVar.c.get();
                                                    if (zzqmVar == null && !z3) {
                                                        s21 s21Var = s21.b;
                                                        return;
                                                    }
                                                    if ((zzqeVar.e & 64) == 0) {
                                                        CopyOnWriteArrayList copyOnWriteArrayList = zzqeVar.f;
                                                        synchronized (copyOnWriteArrayList) {
                                                            try {
                                                                int i7 = zzqeVar.e;
                                                                if ((i7 & 64) == 0) {
                                                                    copyOnWriteArrayList.add(g55Var);
                                                                    zzqeVar.e = i7 | 64;
                                                                }
                                                            } catch (Throwable th2) {
                                                                throw th2;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    if (zzqeVar.h == null) {
                                                        synchronized (zzqeVar.g) {
                                                            try {
                                                                if (zzqeVar.h == null) {
                                                                    if (zzqmVar == null) {
                                                                        zzqmVar = k65.a;
                                                                    }
                                                                    Context context2 = zzqeVar.a;
                                                                    if (zzky.b(context2)) {
                                                                        listenableFutureA = ((zzmj) zzqeVar.d.get()).a(new n65(zzqeVar, zzqmVar));
                                                                        zzqeVar.h = listenableFutureA;
                                                                    } else {
                                                                        w wVar = w.c;
                                                                        ol2 ol2Var = zzqeVar.b;
                                                                        listenableFutureA = rs0.g(zzky.a(context2, Executors.callable(wVar, null), (Executor) ol2Var.get()), new i65(i6, zzqeVar, zzqmVar), (Executor) ol2Var.get());
                                                                        zzqeVar.h = listenableFutureA;
                                                                    }
                                                                    listenableFutureA.addListener(new c65(z2 ? 1 : 0, listenableFutureA), (Executor) zzqeVar.b.get());
                                                                }
                                                            } catch (Throwable th3) {
                                                                throw th3;
                                                            }
                                                            break;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    xw1 xw1VarA2 = zzpgVar.a();
                                                    String str2 = (String) xw1VarA2.c;
                                                    zzlk zzlkVar3 = zzpgVar.b;
                                                    ol2 ol2Var2 = zzlkVar3.d;
                                                    zzqn zzqnVarB = zzlkVar3.g.b();
                                                    boolean z4 = zzqnVarB.i;
                                                    if (zzqnVarB.j) {
                                                        if (h00.s(str2) && !z4) {
                                                            s21 s21Var2 = s21.b;
                                                            return;
                                                        }
                                                        zzmb zzmbVarA = zzme.A();
                                                        m12 m12Var = (m12) xw1VarA2.b;
                                                        int i8 = m12Var.b;
                                                        zzmc zzmcVarZ = zzmd.z();
                                                        zzmcVarZ.l();
                                                        ((zzmd) zzmcVarZ.b).A(i8);
                                                        int i9 = m12Var.c;
                                                        zzmcVarZ.l();
                                                        ((zzmd) zzmcVarZ.b).B(i9);
                                                        zzmd zzmdVar = (zzmd) zzmcVarZ.n();
                                                        zzmbVarA.l();
                                                        ((zzme) zzmbVarA.b).C(zzmdVar);
                                                        if (!h00.s(str2)) {
                                                            zzmbVarA.l();
                                                            ((zzme) zzmbVarA.b).B(str2);
                                                        }
                                                        if (z4) {
                                                            String str3 = zzpgVar.c;
                                                            zzmbVarA.l();
                                                            ((zzme) zzmbVarA.b).D(str3);
                                                        }
                                                        e0VarZzb = ((zzmj) ol2Var2.get()).b((zzme) zzmbVarA.n());
                                                    } else {
                                                        if (h00.s(str2)) {
                                                            s21 s21Var3 = s21.b;
                                                            return;
                                                        }
                                                        e0VarZzb = ((zzmj) ol2Var2.get()).zzb(str2);
                                                    }
                                                    rs0.a(e0VarZzb, zzmk.class, new e55(zzpgVar, i6), zzlkVar3.a());
                                                    return;
                                            }
                                        }
                                    });
                                }
                                if (this.h.b()) {
                                    final int i5 = 2;
                                    zzlkVar.a().execute(new Runnable(this) { // from class: d55
                                        public final /* synthetic */ zzpg b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Uri uri;
                                            zznu zznuVar;
                                            zzuj zzujVar;
                                            ListenableFuture listenableFutureA;
                                            e0 e0VarZzb;
                                            int i6 = i5;
                                            boolean z = true;
                                            boolean z2 = true;
                                            int i7 = 0;
                                            zzpg zzpgVar = this.b;
                                            switch (i6) {
                                                case 0:
                                                    zzpgVar.b();
                                                    return;
                                                case 1:
                                                    zzlk zzlkVar2 = zzpgVar.b;
                                                    String str = zzpgVar.c;
                                                    zzvb zzvbVar = zzpu.a;
                                                    u85 u85Var = new u85();
                                                    u85Var.d = zztw.a;
                                                    byte b = (byte) (u85Var.f | 2);
                                                    u85Var.e = true;
                                                    u85Var.f = (byte) (b | 1);
                                                    Context context = zzlkVar2.b;
                                                    Pattern pattern = zzsa.a;
                                                    zzrz zzrzVar = new zzrz(context);
                                                    zzrzVar.a("phenotype");
                                                    zzrzVar.b("all_accounts.pb");
                                                    Uri uriC = zzrzVar.c();
                                                    if (uriC == null) {
                                                        d.w("Null uri");
                                                        return;
                                                    }
                                                    u85Var.a = uriC;
                                                    zznu zznuVarA = zznu.A();
                                                    if (zznuVarA == null) {
                                                        d.w("Null schema");
                                                        return;
                                                    }
                                                    u85Var.b = zznuVarA;
                                                    zzvb zzvbVar2 = zzpu.a;
                                                    zzvbVar2.getClass();
                                                    py1 py1Var = new py1(zzvbVar2);
                                                    byte b2 = (byte) (u85Var.f | 2);
                                                    u85Var.f = b2;
                                                    if (u85Var.c == null) {
                                                        z21 z21Var = d31.b;
                                                        u85Var.c = y32.e;
                                                    }
                                                    if (b2 != 3 || (uri = u85Var.a) == null || (zznuVar = u85Var.b) == null || (zzujVar = u85Var.d) == null) {
                                                        StringBuilder sb = new StringBuilder();
                                                        if (u85Var.a == null) {
                                                            sb.append(" uri");
                                                        }
                                                        if (u85Var.b == null) {
                                                            sb.append(" schema");
                                                        }
                                                        if (u85Var.d == null) {
                                                            sb.append(" variantConfig");
                                                        }
                                                        if ((u85Var.f & 1) == 0) {
                                                            sb.append(" useGeneratedExtensionRegistry");
                                                        }
                                                        if ((u85Var.f & 2) == 0) {
                                                            sb.append(" enableTracing");
                                                        }
                                                        e32.i("Missing required properties:".concat(sb.toString()));
                                                        return;
                                                    }
                                                    x85 x85Var = new x85(uri, zznuVar, py1Var, u85Var.c, zzujVar, u85Var.e);
                                                    zztt zzttVar = zzpu.c;
                                                    if (zzttVar == null) {
                                                        synchronized (zzpu.b) {
                                                            try {
                                                                zzttVar = zzpu.c;
                                                                if (zzttVar == null) {
                                                                    zztu zztuVar = new zztu();
                                                                    zztuVar.a = zzlkVar2.a();
                                                                    zztuVar.b = (zzru) zzlkVar2.f.get();
                                                                    j95 j95Var = j95.a;
                                                                    HashMap map = zztuVar.c;
                                                                    fs1.h(!map.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                    map.put("singleproc", j95Var);
                                                                    zztt zzttVar2 = new zztt(zztuVar.a, zztuVar.b, zztuVar.d, zztuVar.c);
                                                                    zzpu.c = zzttVar2;
                                                                    zzttVar = zzttVar2;
                                                                }
                                                            } catch (Throwable th) {
                                                                throw th;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    ConcurrentHashMap concurrentHashMap = zzttVar.a;
                                                    Uri uri2 = x85Var.a;
                                                    Pair pairCreate = (Pair) concurrentHashMap.get(uri2);
                                                    if (pairCreate == null) {
                                                        Uri uri3 = x85Var.a;
                                                        fs1.h(uri3.isHierarchical(), "Uri must be hierarchical: %s", uri3);
                                                        String lastPathSegment = uri3.getLastPathSegment();
                                                        if (lastPathSegment == null) {
                                                            lastPathSegment = "";
                                                        }
                                                        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                                                        fs1.h((iLastIndexOf == -1 ? "" : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uri3);
                                                        fs1.f("Handler cannot be null", x85Var.c != null);
                                                        zzuw zzuwVar = (zzuw) zzttVar.e.get("singleproc");
                                                        fs1.h(zzuwVar != null, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                        String lastPathSegment2 = x85Var.a.getLastPathSegment();
                                                        String strSubstring = lastPathSegment2 != null ? lastPathSegment2 : "";
                                                        int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                                                        if (iLastIndexOf2 != -1) {
                                                            strSubstring = strSubstring.substring(0, iLastIndexOf2);
                                                        }
                                                        o2 o2VarG = rs0.g(rs0.d(x85Var.a), zzttVar.d, gc0.a);
                                                        Executor executor = zzttVar.b;
                                                        zzui zzuiVarB = zzuwVar.b(x85Var, strSubstring, executor, zzttVar.c);
                                                        zzuwVar.a();
                                                        zztp zztpVar = new zztp(zzuiVarB, o2VarG);
                                                        d31 d31Var = x85Var.d;
                                                        if (!d31Var.isEmpty()) {
                                                            zzto zztoVar = new zzto(d31Var, executor);
                                                            synchronized (zztpVar.g) {
                                                                zztpVar.i.add(zztoVar);
                                                            }
                                                        }
                                                        pairCreate = Pair.create(zztpVar, x85Var);
                                                        Pair pair = (Pair) concurrentHashMap.putIfAbsent(uri2, pairCreate);
                                                        if (pair != null) {
                                                            pairCreate = pair;
                                                        }
                                                        break;
                                                    }
                                                    zztp zztpVar2 = (zztp) pairCreate.first;
                                                    zztr zztrVar = (zztr) pairCreate.second;
                                                    if (x85Var.equals(zztrVar)) {
                                                        p2 p2VarA = zztpVar2.a(new h55(str, z ? 1 : 0), zzlkVar2.a());
                                                        p2VarA.addListener(new fj4(11, zzpgVar, p2VarA), zzlkVar2.a());
                                                        return;
                                                    }
                                                    String strX = eu.x("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", x85Var.b.getClass().getSimpleName(), x85Var.a);
                                                    fs1.h(x85Var.a.equals(zztrVar.a()), strX, "uri");
                                                    fs1.h(x85Var.b.equals(zztrVar.b()), strX, "schema");
                                                    fs1.h(x85Var.c.equals(zztrVar.c()), strX, "handler");
                                                    fs1.h(x85Var.d.equals(zztrVar.d()), strX, "migrations");
                                                    fs1.h(x85Var.e.equals(zztrVar.e()), strX, "variantConfig");
                                                    fs1.h(x85Var.f == zztrVar.f(), strX, "useGeneratedExtensionRegistry");
                                                    d.r(eu.x(strX, "unknown"));
                                                    return;
                                                case 2:
                                                    zzqe zzqeVar = zzpgVar.b.i;
                                                    boolean z3 = zzpgVar.e;
                                                    g55 g55Var = g55.a;
                                                    zzqm zzqmVar = (zzqm) zzqeVar.c.get();
                                                    if (zzqmVar == null && !z3) {
                                                        s21 s21Var = s21.b;
                                                        return;
                                                    }
                                                    if ((zzqeVar.e & 64) == 0) {
                                                        CopyOnWriteArrayList copyOnWriteArrayList = zzqeVar.f;
                                                        synchronized (copyOnWriteArrayList) {
                                                            try {
                                                                int i8 = zzqeVar.e;
                                                                if ((i8 & 64) == 0) {
                                                                    copyOnWriteArrayList.add(g55Var);
                                                                    zzqeVar.e = i8 | 64;
                                                                }
                                                            } catch (Throwable th2) {
                                                                throw th2;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    if (zzqeVar.h == null) {
                                                        synchronized (zzqeVar.g) {
                                                            try {
                                                                if (zzqeVar.h == null) {
                                                                    if (zzqmVar == null) {
                                                                        zzqmVar = k65.a;
                                                                    }
                                                                    Context context2 = zzqeVar.a;
                                                                    if (zzky.b(context2)) {
                                                                        listenableFutureA = ((zzmj) zzqeVar.d.get()).a(new n65(zzqeVar, zzqmVar));
                                                                        zzqeVar.h = listenableFutureA;
                                                                    } else {
                                                                        w wVar = w.c;
                                                                        ol2 ol2Var = zzqeVar.b;
                                                                        listenableFutureA = rs0.g(zzky.a(context2, Executors.callable(wVar, null), (Executor) ol2Var.get()), new i65(i7, zzqeVar, zzqmVar), (Executor) ol2Var.get());
                                                                        zzqeVar.h = listenableFutureA;
                                                                    }
                                                                    listenableFutureA.addListener(new c65(z2 ? 1 : 0, listenableFutureA), (Executor) zzqeVar.b.get());
                                                                }
                                                            } catch (Throwable th3) {
                                                                throw th3;
                                                            }
                                                            break;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    xw1 xw1VarA2 = zzpgVar.a();
                                                    String str2 = (String) xw1VarA2.c;
                                                    zzlk zzlkVar3 = zzpgVar.b;
                                                    ol2 ol2Var2 = zzlkVar3.d;
                                                    zzqn zzqnVarB = zzlkVar3.g.b();
                                                    boolean z4 = zzqnVarB.i;
                                                    if (zzqnVarB.j) {
                                                        if (h00.s(str2) && !z4) {
                                                            s21 s21Var2 = s21.b;
                                                            return;
                                                        }
                                                        zzmb zzmbVarA = zzme.A();
                                                        m12 m12Var = (m12) xw1VarA2.b;
                                                        int i9 = m12Var.b;
                                                        zzmc zzmcVarZ = zzmd.z();
                                                        zzmcVarZ.l();
                                                        ((zzmd) zzmcVarZ.b).A(i9);
                                                        int i10 = m12Var.c;
                                                        zzmcVarZ.l();
                                                        ((zzmd) zzmcVarZ.b).B(i10);
                                                        zzmd zzmdVar = (zzmd) zzmcVarZ.n();
                                                        zzmbVarA.l();
                                                        ((zzme) zzmbVarA.b).C(zzmdVar);
                                                        if (!h00.s(str2)) {
                                                            zzmbVarA.l();
                                                            ((zzme) zzmbVarA.b).B(str2);
                                                        }
                                                        if (z4) {
                                                            String str3 = zzpgVar.c;
                                                            zzmbVarA.l();
                                                            ((zzme) zzmbVarA.b).D(str3);
                                                        }
                                                        e0VarZzb = ((zzmj) ol2Var2.get()).b((zzme) zzmbVarA.n());
                                                    } else {
                                                        if (h00.s(str2)) {
                                                            s21 s21Var3 = s21.b;
                                                            return;
                                                        }
                                                        e0VarZzb = ((zzmj) ol2Var2.get()).zzb(str2);
                                                    }
                                                    rs0.a(e0VarZzb, zzmk.class, new e55(zzpgVar, i7), zzlkVar3.a());
                                                    return;
                                            }
                                        }
                                    });
                                }
                                xw1Var = xw1VarA;
                            } else {
                                final int i6 = 0;
                                zzlkVar.a().execute(new Runnable(this) { // from class: d55
                                    public final /* synthetic */ zzpg b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Uri uri;
                                        zznu zznuVar;
                                        zzuj zzujVar;
                                        ListenableFuture listenableFutureA;
                                        e0 e0VarZzb;
                                        int i7 = i6;
                                        boolean z = true;
                                        boolean z2 = true;
                                        int i8 = 0;
                                        zzpg zzpgVar = this.b;
                                        switch (i7) {
                                            case 0:
                                                zzpgVar.b();
                                                return;
                                            case 1:
                                                zzlk zzlkVar2 = zzpgVar.b;
                                                String str = zzpgVar.c;
                                                zzvb zzvbVar = zzpu.a;
                                                u85 u85Var = new u85();
                                                u85Var.d = zztw.a;
                                                byte b = (byte) (u85Var.f | 2);
                                                u85Var.e = true;
                                                u85Var.f = (byte) (b | 1);
                                                Context context = zzlkVar2.b;
                                                Pattern pattern = zzsa.a;
                                                zzrz zzrzVar = new zzrz(context);
                                                zzrzVar.a("phenotype");
                                                zzrzVar.b("all_accounts.pb");
                                                Uri uriC = zzrzVar.c();
                                                if (uriC == null) {
                                                    d.w("Null uri");
                                                    return;
                                                }
                                                u85Var.a = uriC;
                                                zznu zznuVarA = zznu.A();
                                                if (zznuVarA == null) {
                                                    d.w("Null schema");
                                                    return;
                                                }
                                                u85Var.b = zznuVarA;
                                                zzvb zzvbVar2 = zzpu.a;
                                                zzvbVar2.getClass();
                                                py1 py1Var = new py1(zzvbVar2);
                                                byte b2 = (byte) (u85Var.f | 2);
                                                u85Var.f = b2;
                                                if (u85Var.c == null) {
                                                    z21 z21Var = d31.b;
                                                    u85Var.c = y32.e;
                                                }
                                                if (b2 != 3 || (uri = u85Var.a) == null || (zznuVar = u85Var.b) == null || (zzujVar = u85Var.d) == null) {
                                                    StringBuilder sb = new StringBuilder();
                                                    if (u85Var.a == null) {
                                                        sb.append(" uri");
                                                    }
                                                    if (u85Var.b == null) {
                                                        sb.append(" schema");
                                                    }
                                                    if (u85Var.d == null) {
                                                        sb.append(" variantConfig");
                                                    }
                                                    if ((u85Var.f & 1) == 0) {
                                                        sb.append(" useGeneratedExtensionRegistry");
                                                    }
                                                    if ((u85Var.f & 2) == 0) {
                                                        sb.append(" enableTracing");
                                                    }
                                                    e32.i("Missing required properties:".concat(sb.toString()));
                                                    return;
                                                }
                                                x85 x85Var = new x85(uri, zznuVar, py1Var, u85Var.c, zzujVar, u85Var.e);
                                                zztt zzttVar = zzpu.c;
                                                if (zzttVar == null) {
                                                    synchronized (zzpu.b) {
                                                        try {
                                                            zzttVar = zzpu.c;
                                                            if (zzttVar == null) {
                                                                zztu zztuVar = new zztu();
                                                                zztuVar.a = zzlkVar2.a();
                                                                zztuVar.b = (zzru) zzlkVar2.f.get();
                                                                j95 j95Var = j95.a;
                                                                HashMap map = zztuVar.c;
                                                                fs1.h(!map.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                map.put("singleproc", j95Var);
                                                                zztt zzttVar2 = new zztt(zztuVar.a, zztuVar.b, zztuVar.d, zztuVar.c);
                                                                zzpu.c = zzttVar2;
                                                                zzttVar = zzttVar2;
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                        break;
                                                    }
                                                }
                                                ConcurrentHashMap concurrentHashMap = zzttVar.a;
                                                Uri uri2 = x85Var.a;
                                                Pair pairCreate = (Pair) concurrentHashMap.get(uri2);
                                                if (pairCreate == null) {
                                                    Uri uri3 = x85Var.a;
                                                    fs1.h(uri3.isHierarchical(), "Uri must be hierarchical: %s", uri3);
                                                    String lastPathSegment = uri3.getLastPathSegment();
                                                    if (lastPathSegment == null) {
                                                        lastPathSegment = "";
                                                    }
                                                    int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                                                    fs1.h((iLastIndexOf == -1 ? "" : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uri3);
                                                    fs1.f("Handler cannot be null", x85Var.c != null);
                                                    zzuw zzuwVar = (zzuw) zzttVar.e.get("singleproc");
                                                    fs1.h(zzuwVar != null, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                    String lastPathSegment2 = x85Var.a.getLastPathSegment();
                                                    String strSubstring = lastPathSegment2 != null ? lastPathSegment2 : "";
                                                    int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                                                    if (iLastIndexOf2 != -1) {
                                                        strSubstring = strSubstring.substring(0, iLastIndexOf2);
                                                    }
                                                    o2 o2VarG = rs0.g(rs0.d(x85Var.a), zzttVar.d, gc0.a);
                                                    Executor executor = zzttVar.b;
                                                    zzui zzuiVarB = zzuwVar.b(x85Var, strSubstring, executor, zzttVar.c);
                                                    zzuwVar.a();
                                                    zztp zztpVar = new zztp(zzuiVarB, o2VarG);
                                                    d31 d31Var = x85Var.d;
                                                    if (!d31Var.isEmpty()) {
                                                        zzto zztoVar = new zzto(d31Var, executor);
                                                        synchronized (zztpVar.g) {
                                                            zztpVar.i.add(zztoVar);
                                                        }
                                                    }
                                                    pairCreate = Pair.create(zztpVar, x85Var);
                                                    Pair pair = (Pair) concurrentHashMap.putIfAbsent(uri2, pairCreate);
                                                    if (pair != null) {
                                                        pairCreate = pair;
                                                    }
                                                    break;
                                                }
                                                zztp zztpVar2 = (zztp) pairCreate.first;
                                                zztr zztrVar = (zztr) pairCreate.second;
                                                if (x85Var.equals(zztrVar)) {
                                                    p2 p2VarA = zztpVar2.a(new h55(str, z ? 1 : 0), zzlkVar2.a());
                                                    p2VarA.addListener(new fj4(11, zzpgVar, p2VarA), zzlkVar2.a());
                                                    return;
                                                }
                                                String strX = eu.x("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", x85Var.b.getClass().getSimpleName(), x85Var.a);
                                                fs1.h(x85Var.a.equals(zztrVar.a()), strX, "uri");
                                                fs1.h(x85Var.b.equals(zztrVar.b()), strX, "schema");
                                                fs1.h(x85Var.c.equals(zztrVar.c()), strX, "handler");
                                                fs1.h(x85Var.d.equals(zztrVar.d()), strX, "migrations");
                                                fs1.h(x85Var.e.equals(zztrVar.e()), strX, "variantConfig");
                                                fs1.h(x85Var.f == zztrVar.f(), strX, "useGeneratedExtensionRegistry");
                                                d.r(eu.x(strX, "unknown"));
                                                return;
                                            case 2:
                                                zzqe zzqeVar = zzpgVar.b.i;
                                                boolean z3 = zzpgVar.e;
                                                g55 g55Var = g55.a;
                                                zzqm zzqmVar = (zzqm) zzqeVar.c.get();
                                                if (zzqmVar == null && !z3) {
                                                    s21 s21Var = s21.b;
                                                    return;
                                                }
                                                if ((zzqeVar.e & 64) == 0) {
                                                    CopyOnWriteArrayList copyOnWriteArrayList = zzqeVar.f;
                                                    synchronized (copyOnWriteArrayList) {
                                                        try {
                                                            int i9 = zzqeVar.e;
                                                            if ((i9 & 64) == 0) {
                                                                copyOnWriteArrayList.add(g55Var);
                                                                zzqeVar.e = i9 | 64;
                                                            }
                                                        } catch (Throwable th2) {
                                                            throw th2;
                                                        }
                                                        break;
                                                    }
                                                }
                                                if (zzqeVar.h == null) {
                                                    synchronized (zzqeVar.g) {
                                                        try {
                                                            if (zzqeVar.h == null) {
                                                                if (zzqmVar == null) {
                                                                    zzqmVar = k65.a;
                                                                }
                                                                Context context2 = zzqeVar.a;
                                                                if (zzky.b(context2)) {
                                                                    listenableFutureA = ((zzmj) zzqeVar.d.get()).a(new n65(zzqeVar, zzqmVar));
                                                                    zzqeVar.h = listenableFutureA;
                                                                } else {
                                                                    w wVar = w.c;
                                                                    ol2 ol2Var = zzqeVar.b;
                                                                    listenableFutureA = rs0.g(zzky.a(context2, Executors.callable(wVar, null), (Executor) ol2Var.get()), new i65(i8, zzqeVar, zzqmVar), (Executor) ol2Var.get());
                                                                    zzqeVar.h = listenableFutureA;
                                                                }
                                                                listenableFutureA.addListener(new c65(z2 ? 1 : 0, listenableFutureA), (Executor) zzqeVar.b.get());
                                                            }
                                                        } catch (Throwable th3) {
                                                            throw th3;
                                                        }
                                                        break;
                                                    }
                                                    return;
                                                }
                                                return;
                                            default:
                                                xw1 xw1VarA2 = zzpgVar.a();
                                                String str2 = (String) xw1VarA2.c;
                                                zzlk zzlkVar3 = zzpgVar.b;
                                                ol2 ol2Var2 = zzlkVar3.d;
                                                zzqn zzqnVarB = zzlkVar3.g.b();
                                                boolean z4 = zzqnVarB.i;
                                                if (zzqnVarB.j) {
                                                    if (h00.s(str2) && !z4) {
                                                        s21 s21Var2 = s21.b;
                                                        return;
                                                    }
                                                    zzmb zzmbVarA = zzme.A();
                                                    m12 m12Var = (m12) xw1VarA2.b;
                                                    int i10 = m12Var.b;
                                                    zzmc zzmcVarZ = zzmd.z();
                                                    zzmcVarZ.l();
                                                    ((zzmd) zzmcVarZ.b).A(i10);
                                                    int i11 = m12Var.c;
                                                    zzmcVarZ.l();
                                                    ((zzmd) zzmcVarZ.b).B(i11);
                                                    zzmd zzmdVar = (zzmd) zzmcVarZ.n();
                                                    zzmbVarA.l();
                                                    ((zzme) zzmbVarA.b).C(zzmdVar);
                                                    if (!h00.s(str2)) {
                                                        zzmbVarA.l();
                                                        ((zzme) zzmbVarA.b).B(str2);
                                                    }
                                                    if (z4) {
                                                        String str3 = zzpgVar.c;
                                                        zzmbVarA.l();
                                                        ((zzme) zzmbVarA.b).D(str3);
                                                    }
                                                    e0VarZzb = ((zzmj) ol2Var2.get()).b((zzme) zzmbVarA.n());
                                                } else {
                                                    if (h00.s(str2)) {
                                                        s21 s21Var3 = s21.b;
                                                        return;
                                                    }
                                                    e0VarZzb = ((zzmj) ol2Var2.get()).zzb(str2);
                                                }
                                                rs0.a(e0VarZzb, zzmk.class, new e55(zzpgVar, i8), zzlkVar3.a());
                                                return;
                                        }
                                    }
                                });
                                xw1Var = new xw1(zzqv.H(), (m12) xw1VarA.b);
                            }
                        }
                        if (!this.e || ((m12) xw1Var.b).c != 17) {
                            this.a = xw1Var;
                        }
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xw1Var;
    }

    public final void b() {
        zzqt zzqtVar = this.h;
        zzlk zzlkVar = zzqtVar.a;
        p2 p2VarF = rs0.f(((zzmj) zzlkVar.d.get()).zza(zzqtVar.c), vp3.d, zzlkVar.a());
        e55 e55Var = new e55(zzqtVar, 1);
        zzlk zzlkVar2 = this.b;
        rs0.g(p2VarF, e55Var, zzlkVar2.a()).addListener(new dp4(7, this, p2VarF), zzlkVar2.a());
    }

    public zzpg(zzlk zzlkVar, b55 b55Var) {
        this.b = zzlkVar;
        Context context = zzlkVar.b;
        String str = b55Var.d;
        if (str == null) {
            str = (String) b55Var.a.apply(context);
            b55Var.d = str;
        }
        this.c = str;
        this.d = "";
        this.e = b55Var.b;
        this.f = b55Var.c;
        this.a = null;
        this.g = new zzps();
        this.h = new zzqt(zzlkVar, str);
    }
}
