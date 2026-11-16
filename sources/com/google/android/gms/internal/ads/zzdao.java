package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import defpackage.i24;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdao implements zzdfq, com.google.android.gms.ads.internal.client.zza, zzdhi, zzdew, zzdec, zzdjt {
    public final Clock a;
    public final zzcgb b;

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void A(zzccq zzccqVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjt
    public final void H(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void L() {
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void N() {
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void R(zzcch zzcchVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjt
    public final void d(zzbiw.zzb zzbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjt
    public final void x(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjt
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void O() {
        zzcgb zzcgbVar = this.b;
        synchronized (zzcgbVar.d) {
            try {
                if (zzcgbVar.k != -1) {
                    LinkedList linkedList = zzcgbVar.c;
                    if (!linkedList.isEmpty()) {
                        i24 i24Var = (i24) linkedList.getLast();
                        if (i24Var.b == -1) {
                            i24Var.b = i24Var.c.a.elapsedRealtime();
                            zzcgbVar.b.a(zzcgbVar);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdew
    public final void Q() {
        zzcgb zzcgbVar = this.b;
        synchronized (zzcgbVar.d) {
            try {
                if (zzcgbVar.k != -1 && zzcgbVar.g == -1) {
                    zzcgbVar.g = zzcgbVar.a.elapsedRealtime();
                    zzcgbVar.b.a(zzcgbVar);
                }
                zzcgm zzcgmVar = zzcgbVar.b;
                synchronized (zzcgmVar.a) {
                    zzcgj zzcgjVar = zzcgmVar.d;
                    synchronized (zzcgjVar.f) {
                        zzcgjVar.k++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjt
    public final void V(zzbiw.zzb zzbVar) {
        zzcgb zzcgbVar = this.b;
        synchronized (zzcgbVar.d) {
            zzcgm zzcgmVar = zzcgbVar.b;
            synchronized (zzcgmVar.a) {
                zzcgmVar.d.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjt
    public final void f(zzbiw.zzb zzbVar) {
        zzcgb zzcgbVar = this.b;
        synchronized (zzcgbVar.d) {
            zzcgm zzcgmVar = zzcgbVar.b;
            synchronized (zzcgmVar.a) {
                zzcgmVar.d.b();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcgb zzcgbVar = this.b;
        synchronized (zzcgbVar.d) {
            if (zzcgbVar.k != -1) {
                i24 i24Var = new i24(zzcgbVar);
                i24Var.a = i24Var.c.a.elapsedRealtime();
                zzcgbVar.c.add(i24Var);
                zzcgbVar.i++;
                zzcgm zzcgmVar = zzcgbVar.b;
                synchronized (zzcgmVar.a) {
                    zzcgj zzcgjVar = zzcgmVar.d;
                    synchronized (zzcgjVar.f) {
                        zzcgjVar.j++;
                    }
                }
                zzcgmVar.a(zzcgbVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void z(zzfmb zzfmbVar) {
        Clock clock = this.a;
        zzcgb zzcgbVar = this.b;
        long jElapsedRealtime = clock.elapsedRealtime();
        synchronized (zzcgbVar.d) {
            try {
                zzcgbVar.k = jElapsedRealtime;
                if (jElapsedRealtime != -1) {
                    zzcgbVar.b.a(zzcgbVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfq
    public final void zzg() {
        zzcgb zzcgbVar = this.b;
        synchronized (zzcgbVar.d) {
            try {
                if (zzcgbVar.k != -1) {
                    zzcgbVar.h = zzcgbVar.a.elapsedRealtime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzdao(Clock clock, zzcgb zzcgbVar) {
        this.a = clock;
        this.b = zzcgbVar;
    }
}
