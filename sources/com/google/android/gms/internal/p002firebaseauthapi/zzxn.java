package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ht3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public final class zzxn extends zzalt<zzxn, zza> implements zzamx {
    private static final zzxn zzc;
    private static volatile zzani<zzxn> zzd;
    private int zzg;
    private boolean zzh;
    private String zze = "";
    private String zzf = "";
    private String zzi = "";

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt.zza<zzxn, zza> implements zzamx {
        private zza() {
            super(zzxn.zzc);
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    static {
        zzxn zzxnVar = new zzxn();
        zzc = zzxnVar;
        zzalt.m(zzxn.class, zzxnVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (c1.a[i - 1]) {
            case 1:
                return new zzxn();
            case 2:
                return new zza(0);
            case 3:
                return new ht3(zzc, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                zzani<zzxn> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zzxn.class) {
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

    private zzxn() {
    }
}
