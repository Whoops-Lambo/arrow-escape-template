package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.dt3;
import defpackage.ht3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class zzyh extends zzalt<zzyh, zza> implements zzamx {
    public static final /* synthetic */ int a = 0;
    private static final zzyh zzc;
    private static volatile zzani<zzyh> zzd;
    private String zze = "";
    private zzalx<zzxn> zzf = dt3.e;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt.zza<zzyh, zza> implements zzamx {
        private zza() {
            super(zzyh.zzc);
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    static {
        zzyh zzyhVar = new zzyh();
        zzc = zzyhVar;
        zzalt.m(zzyh.class, zzyhVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (j1.a[i - 1]) {
            case 1:
                return new zzyh();
            case 2:
                return new zza(0);
            case 3:
                return new ht3(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", zzxn.class});
            case 4:
                return zzc;
            case 5:
                zzani<zzyh> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zzyh.class) {
                    try {
                        zzcVar = zzd;
                        if (zzcVar == null) {
                            zzcVar = new zzalt.zzc();
                            zzd = zzcVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return zzcVar;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    private zzyh() {
    }
}
