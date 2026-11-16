package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.util.Clock;
import defpackage.h34;
import defpackage.hp4;
import defpackage.i34;
import defpackage.jc1;
import defpackage.pv1;
import defpackage.ta3;
import defpackage.up4;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzckk extends zzcke implements zziu {
    public static final AtomicInteger o = new AtomicInteger(0);
    public String d;
    public final zzciq e;
    public boolean f;
    public final ta3 g;
    public final zzcjn h;
    public ByteBuffer i;
    public boolean j;
    public final Object k;
    public final String l;
    public final int m;
    public boolean n;

    @Override // com.google.android.gms.internal.ads.zziu
    public final void c(zzia zziaVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final void i(zzia zziaVar, boolean z, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcke
    public final void o() {
        this.f = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean] */
    @Override // com.google.android.gms.internal.ads.zzcke
    public final boolean f(String str) {
        String str2;
        String str3;
        zzhw zzhwVar;
        String str4 = str;
        this.d = str4;
        String str5 = "error";
        String strConcat = "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzg(str4)));
        try {
            zzid zzidVar = new zzid();
            zzidVar.c = this.b;
            zzciq zzciqVar = this.e;
            zzidVar.d = zzciqVar.d;
            zzidVar.e = zzciqVar.e;
            zzidVar.f = true;
            zzidVar.b = this;
            zzih zzihVarZza = zzidVar.zza();
            zzhw zzcjlVar = zzihVarZza;
            if (zzciqVar.i) {
                zzcjlVar = new zzcjl(this.a, zzihVarZza, this.l, this.m);
            }
            zzcjlVar.e(new zzia(Uri.parse(str4), 0L, -1L));
            zzcir zzcirVar = (zzcir) this.c.get();
            if (zzcirVar != null) {
                zzcirVar.R(strConcat, this);
            }
            Clock clockZzk = com.google.android.gms.ads.internal.zzt.zzk();
            long jCurrentTimeMillis = clockZzk.currentTimeMillis();
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.s0)).longValue();
            long jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.r0)).longValue();
            this.i = ByteBuffer.allocate(zzciqVar.c);
            byte[] bArr = new byte[8192];
            long j = jCurrentTimeMillis;
            zzhw zzhwVar2 = zzcjlVar;
            while (true) {
                try {
                    int i = zzhwVar2.i(bArr, 0, Math.min(this.i.remaining(), 8192));
                    if (i == -1) {
                        this.n = true;
                        str4 = str;
                        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new i34(this, str4, strConcat, (int) this.h.a(this.i)));
                        return true;
                    }
                    str4 = str;
                    str2 = str5;
                    try {
                        synchronized (this.k) {
                            zzhwVar = zzhwVar2;
                            try {
                                if (!this.f) {
                                    this.i.put(bArr, 0, i);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (this.i.remaining() <= 0) {
                            r();
                            return true;
                        }
                        str3 = this.f;
                        try {
                            if (str3 != 0) {
                                int iLimit = this.i.limit();
                                StringBuilder sb = new StringBuilder(String.valueOf(iLimit).length() + 24);
                                sb.append("Precache abort at ");
                                sb.append(iLimit);
                                sb.append(" bytes");
                                throw new IOException(sb.toString());
                            }
                            long jCurrentTimeMillis2 = clockZzk.currentTimeMillis();
                            if (jCurrentTimeMillis2 - j >= jLongValue) {
                                r();
                                j = jCurrentTimeMillis2;
                            }
                            if (jCurrentTimeMillis2 - jCurrentTimeMillis > 1000 * jLongValue2) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(jLongValue2).length() + 29);
                                sb2.append("Timeout exceeded. Limit: ");
                                sb2.append(jLongValue2);
                                sb2.append(" sec");
                                throw new IOException(sb2.toString());
                            }
                            str5 = str2;
                            zzhwVar2 = zzhwVar;
                            clockZzk = clockZzk;
                        } catch (Exception e) {
                            e = e;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        str3 = str2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    str4 = str;
                    str2 = str5;
                }
                str3 = str2;
                String canonicalName = e.getClass().getCanonicalName();
                String message = e.getMessage();
                String strO = jc1.o(canonicalName, ":", new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length()), message);
                String strP = pv1.p(new StringBuilder(strO.length() + String.valueOf(str4).length() + 34), "Failed to preload url ", str4, " Exception: ", strO);
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi(strP);
                p(str4, strConcat, str3, strO);
                return false;
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final void l(zzho zzhoVar, zzia zziaVar, boolean z) {
        if (zzhoVar instanceof zzih) {
            ((ArrayList) this.g.b).add((zzih) zzhoVar);
        }
    }

    public final void r() {
        ta3 ta3Var = this.g;
        Iterator it = ((ArrayList) ta3Var.b).iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((zzih) it.next()).zzj().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        ta3Var.a = Math.max(ta3Var.a, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        int i = (int) ta3Var.a;
        int iA = (int) this.h.a(this.i);
        int iPosition = this.i.position();
        int iRound = Math.round((iPosition / i) * iA);
        int i2 = zzcii.a.get();
        int i3 = zzcii.b.get();
        String str = this.d;
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new h34(this, str, "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzg(str))), iPosition, i, iRound, iA, iRound > 0, i2, i3));
    }

    @Override // com.google.android.gms.internal.ads.zzcke, com.google.android.gms.common.api.Releasable
    public final void release() {
        o.decrementAndGet();
    }

    public zzckk(zzcir zzcirVar, zzciq zzciqVar) {
        zzgvx up4Var;
        super(zzcirVar);
        this.e = zzciqVar;
        this.g = new ta3();
        this.h = new zzcjn();
        this.k = new Object();
        String strZzn = zzcirVar.zzn();
        if (strZzn == null) {
            up4Var = hp4.a;
        } else {
            up4Var = new up4(strZzn);
        }
        this.l = (String) up4Var.d();
        this.m = zzcirVar.zzp();
        o.incrementAndGet();
    }
}
