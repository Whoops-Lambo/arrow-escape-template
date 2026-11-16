package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;
import defpackage.ma;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeos extends zzbwl implements zzdfm {
    public zzbwm a;
    public ma b;

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void B3(zzbnx zzbnxVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void H(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzbwm zzbwmVar = this.a;
        if (zzbwmVar != null) {
            zzbwmVar.H(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void M3(int i, String str) {
        ma maVar = this.b;
        if (maVar != null) {
            synchronized (maVar) {
                try {
                    if (!maVar.a) {
                        maVar.a = true;
                        if (str == null) {
                            str = zzesf.c(i, ((zzeng) maVar.b).a);
                        }
                        maVar.e(new com.google.android.gms.ads.internal.client.zze(i, str, AdError.UNDEFINED_DOMAIN, null, null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final synchronized void P3(zzesh zzeshVar) {
        this.a = zzeshVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void o0(zzcdf zzcdfVar) {
        zzbwm zzbwmVar = this.a;
        if (zzbwmVar != null) {
            zzbwmVar.o0(zzcdfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void p(zzcdj zzcdjVar) {
        zzbwm zzbwmVar = this.a;
        if (zzbwmVar != null) {
            zzbwmVar.p(zzcdjVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void p0(String str, String str2) {
        zzbwm zzbwmVar = this.a;
        if (zzbwmVar != null) {
            zzbwmVar.p0(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void s(com.google.android.gms.ads.internal.client.zze zzeVar) {
        ma maVar = this.b;
        if (maVar != null) {
            synchronized (maVar) {
                if (!maVar.a) {
                    maVar.a = true;
                    maVar.e(zzeVar);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfm
    public final synchronized void w3(ma maVar) {
        this.b = maVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zze() {
        zzbwm zzbwmVar = this.a;
        if (zzbwmVar != null) {
            zzbwmVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzf() {
        zzbwm zzbwmVar = this.a;
        if (zzbwmVar != null) {
            zzbwmVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzg(int i) {
        ma maVar = this.b;
        if (maVar != null) {
            maVar.d(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzh() {
        zzbwm zzbwmVar = this.a;
        if (zzbwmVar != null) {
            zzbwmVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzi() {
        zzbwm zzbwmVar = this.a;
        if (zzbwmVar != null) {
            zzbwmVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzj() {
        try {
            zzbwm zzbwmVar = this.a;
            if (zzbwmVar != null) {
                zzbwmVar.zzj();
            }
            ma maVar = this.b;
            if (maVar != null) {
                maVar.c();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzk() {
        zzbwm zzbwmVar = this.a;
        if (zzbwmVar != null) {
            zzbwmVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzn() {
        zzbwm zzbwmVar = this.a;
        if (zzbwmVar != null) {
            zzbwmVar.zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzo() {
        zzbwm zzbwmVar = this.a;
        if (zzbwmVar != null) {
            zzbwmVar.zzo();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzq() {
        zzbwm zzbwmVar = this.a;
        if (zzbwmVar != null) {
            zzbwmVar.zzq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzs(int i) {
        zzbwm zzbwmVar = this.a;
        if (zzbwmVar != null) {
            zzbwmVar.zzs(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzt() {
        zzbwm zzbwmVar = this.a;
        if (zzbwmVar != null) {
            zzbwmVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzu() {
        zzbwm zzbwmVar = this.a;
        if (zzbwmVar != null) {
            zzbwmVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzv(String str) {
        zzbwm zzbwmVar = this.a;
        if (zzbwmVar != null) {
            zzbwmVar.zzv(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzz() {
        zzbwm zzbwmVar = this.a;
        if (zzbwmVar != null) {
            zzbwmVar.zzz();
        }
    }
}
