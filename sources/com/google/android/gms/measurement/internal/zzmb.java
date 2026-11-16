package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzdd;
import defpackage.h25;
import defpackage.mj4;
import defpackage.yi4;
import io.p071bidmachine.media3.exoplayer.source.w0;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzmb extends mj4 {
    public volatile zzlu c;
    public volatile zzlu d;
    public zzlu e;
    public final ConcurrentHashMap f;
    public zzdd g;
    public volatile boolean h;
    public volatile zzlu i;
    public zzlu j;
    public boolean k;
    public final Object l;

    @Override // defpackage.mj4
    public final boolean w() {
        return false;
    }

    public final void A(zzdd zzddVar, Bundle bundle) {
        Bundle bundle2;
        if (!((zzic) this.a).d.I() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f.put(Integer.valueOf(zzddVar.a), new zzlu(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void B(String str, zzlu zzluVar, boolean z) {
        zzlu zzluVar2;
        zzlu zzluVar3 = this.c == null ? this.d : this.c;
        if (zzluVar.b == null) {
            zzluVar2 = new zzlu(zzluVar.a, str != null ? y(str) : null, zzluVar.c, zzluVar.e, zzluVar.f, zzluVar.g);
        } else {
            zzluVar2 = zzluVar;
        }
        this.d = this.c;
        this.c = zzluVar2;
        zzic zzicVar = (zzic) this.a;
        long jElapsedRealtime = zzicVar.k.elapsedRealtime();
        zzhz zzhzVar = zzicVar.g;
        zzic.l(zzhzVar);
        zzhzVar.C(new h25(this, zzluVar2, zzluVar3, jElapsedRealtime, z));
    }

    public final void C(zzlu zzluVar, boolean z, long j) {
        zzic zzicVar = (zzic) this.a;
        zzd zzdVar = zzicVar.n;
        zzic.g(zzdVar);
        zzdVar.w(zzicVar.k.elapsedRealtime());
        boolean z2 = zzluVar != null && zzluVar.d;
        zzoc zzocVar = zzicVar.h;
        zzic.k(zzocVar);
        if (!zzocVar.f.d(j, z2, z) || zzluVar == null) {
            return;
        }
        zzluVar.d = false;
    }

    public final String y(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        zzic zzicVar = (zzic) this.a;
        int length2 = str2.length();
        zzicVar.d.getClass();
        if (length2 <= 500) {
            return str2;
        }
        zzicVar.d.getClass();
        return str2.substring(0, 500);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b2  */
    public final void z(zzlu zzluVar, zzlu zzluVar2, long j, boolean z, Bundle bundle) {
        boolean z2;
        long j2;
        Bundle bundle2;
        boolean z3 = zzluVar.e;
        zzic zzicVar = (zzic) this.a;
        t();
        boolean z4 = false;
        if (zzluVar2 != null) {
            if (zzluVar2.c == zzluVar.c && Objects.equals(zzluVar2.b, zzluVar.b) && Objects.equals(zzluVar2.a, zzluVar.a)) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = true;
        }
        if (z && this.e != null) {
            z4 = true;
        }
        if (z2) {
            Bundle bundle3 = bundle != null ? new Bundle(bundle) : new Bundle();
            zzpp.n0(zzluVar, bundle3, true);
            if (zzluVar2 != null) {
                String str = zzluVar2.a;
                if (str != null) {
                    bundle3.putString("_pn", str);
                }
                String str2 = zzluVar2.b;
                if (str2 != null) {
                    bundle3.putString("_pc", str2);
                }
                bundle3.putLong("_pi", zzluVar2.c);
            }
            if (z4) {
                zzoc zzocVar = zzicVar.h;
                zzic.k(zzocVar);
                w0 w0Var = zzocVar.f;
                long j3 = j - w0Var.b;
                w0Var.b = j;
                if (j3 > 0) {
                    zzpp zzppVar = zzicVar.i;
                    zzic.j(zzppVar);
                    zzppVar.d0(bundle3, j3);
                }
            }
            zzal zzalVar = zzicVar.d;
            Clock clock = zzicVar.k;
            if (!zzalVar.I()) {
                bundle3.putLong("_mst", 1L);
            }
            String str3 = true != z3 ? "auto" : "app";
            long jCurrentTimeMillis = clock.currentTimeMillis();
            if (z3) {
                long j4 = zzluVar.f;
                if (j4 != 0) {
                    j2 = j4;
                } else {
                    j2 = jCurrentTimeMillis;
                }
            } else {
                j2 = jCurrentTimeMillis;
            }
            long jElapsedRealtime = zzicVar.d.E(null, zzfy.e1) ? clock.elapsedRealtime() : 0L;
            if (z3) {
                bundle2 = bundle3;
                long j5 = zzluVar.g;
                if (j5 != 0) {
                    jElapsedRealtime = j5;
                }
            } else {
                bundle2 = bundle3;
            }
            zzlj zzljVar = zzicVar.m;
            zzic.k(zzljVar);
            zzljVar.B(j2, jElapsedRealtime, bundle2, str3, "_vs");
        }
        if (z4) {
            C(this.e, true, j);
        }
        this.e = zzluVar;
        if (z3) {
            this.j = zzluVar;
        }
        zznl zznlVarO = zzicVar.o();
        zznlVarO.t();
        zznlVarO.u();
        zznlVarO.H(new yi4(zznlVarO, zzluVar));
    }

    public zzmb(zzic zzicVar) {
        super(zzicVar);
        this.l = new Object();
        this.f = new ConcurrentHashMap();
    }

    public final zzlu D(zzdd zzddVar) {
        Preconditions.checkNotNull(zzddVar);
        Integer numValueOf = Integer.valueOf(zzddVar.a);
        ConcurrentHashMap concurrentHashMap = this.f;
        zzlu zzluVar = (zzlu) concurrentHashMap.get(numValueOf);
        if (zzluVar == null) {
            String strY = y(zzddVar.b);
            zzpp zzppVar = ((zzic) this.a).i;
            zzic.j(zzppVar);
            zzlu zzluVar2 = new zzlu(null, strY, zzppVar.p0());
            concurrentHashMap.put(numValueOf, zzluVar2);
            zzluVar = zzluVar2;
        }
        if (this.i != null) {
            return this.i;
        }
        return zzluVar;
    }

    public final zzlu x(boolean z) {
        u();
        t();
        zzlu zzluVar = this.e;
        if (!z || zzluVar != null) {
            return zzluVar;
        }
        return this.j;
    }
}
