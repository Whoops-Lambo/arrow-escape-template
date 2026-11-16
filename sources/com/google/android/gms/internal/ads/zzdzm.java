package com.google.android.gms.internal.ads;

import defpackage.j84;
import io.p071bidmachine.protobuf.EventTypeExtended;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdzm implements zzdhi, zzdfq, zzdef, zzdew, com.google.android.gms.ads.internal.client.zza, zzdjt {
    public final zzbiq a;
    public boolean b = false;

    @Override // com.google.android.gms.internal.ads.zzdjt
    public final void H(boolean z) {
        this.a.c(true != z ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzdew
    public final synchronized void Q() {
        this.a.c(6);
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void R(zzcch zzcchVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        boolean z = this.b;
        zzbiq zzbiqVar = this.a;
        if (z) {
            zzbiqVar.c(8);
        } else {
            zzbiqVar.c(7);
            this.b = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjt
    public final void x(boolean z) {
        this.a.c(true != z ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzdjt
    public final void V(zzbiw.zzb zzbVar) {
        zzbiq zzbiqVar = this.a;
        synchronized (zzbiqVar) {
            if (zzbiqVar.c) {
                try {
                    zzbiqVar.b.o(zzbVar);
                } catch (NullPointerException e) {
                    com.google.android.gms.ads.internal.zzt.zzh().d("AdMobClearcutLogger.modify", e);
                }
            }
        }
        zzbiqVar.c(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzdjt
    public final void d(zzbiw.zzb zzbVar) {
        zzbiq zzbiqVar = this.a;
        synchronized (zzbiqVar) {
            if (zzbiqVar.c) {
                try {
                    zzbiqVar.b.o(zzbVar);
                } catch (NullPointerException e) {
                    com.google.android.gms.ads.internal.zzt.zzh().d("AdMobClearcutLogger.modify", e);
                }
            }
        }
        zzbiqVar.c(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzdjt
    public final void f(zzbiw.zzb zzbVar) {
        zzbiq zzbiqVar = this.a;
        synchronized (zzbiqVar) {
            if (zzbiqVar.c) {
                try {
                    zzbiqVar.b.o(zzbVar);
                } catch (NullPointerException e) {
                    com.google.android.gms.ads.internal.zzt.zzh().d("AdMobClearcutLogger.modify", e);
                }
            }
        }
        zzbiqVar.c(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void m(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i = zzeVar.zza;
        zzbiq zzbiqVar = this.a;
        switch (i) {
            case 1:
                zzbiqVar.c(101);
                break;
            case 2:
                zzbiqVar.c(102);
                break;
            case 3:
                zzbiqVar.c(5);
                break;
            case 4:
                zzbiqVar.c(103);
                break;
            case 5:
                zzbiqVar.c(104);
                break;
            case 6:
                zzbiqVar.c(105);
                break;
            case 7:
                zzbiqVar.c(106);
                break;
            default:
                zzbiqVar.c(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void z(zzfmb zzfmbVar) {
        this.a.b(new j84(zzfmbVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdfq
    public final void zzg() {
        this.a.c(3);
    }

    @Override // com.google.android.gms.internal.ads.zzdjt
    public final void zzo() {
        this.a.c(1109);
    }

    public zzdzm(zzbiq zzbiqVar, zzfjl zzfjlVar) {
        this.a = zzbiqVar;
        zzbiqVar.c(2);
        if (zzfjlVar != null) {
            zzbiqVar.c(EventTypeExtended.EVENT_TYPE_CLICK_BY_SOURCE_VALUE);
        }
    }
}
