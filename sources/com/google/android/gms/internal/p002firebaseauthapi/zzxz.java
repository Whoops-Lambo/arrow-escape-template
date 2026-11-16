package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ht3;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzxz extends zzalt<zzxz, zza> implements zzamx {
    private static final zzxz zzc;
    private static volatile zzani<zzxz> zzd;
    private String zze = "";

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt.zza<zzxz, zza> implements zzamx {
        private zza() {
            super(zzxz.zzc);
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    static {
        zzxz zzxzVar = new zzxz();
        zzc = zzxzVar;
        zzalt.m(zzxz.class, zzxzVar);
    }

    public static zza u() {
        return (zza) zzc.p();
    }

    public static zzxz v(zzakb zzakbVar, zzalf zzalfVar) {
        return (zzxz) zzalt.g(zzc, zzakbVar, zzalfVar);
    }

    public static zzxz y() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (g1.a[i - 1]) {
            case 1:
                return new zzxz();
            case 2:
                return new zza(0);
            case 3:
                return new ht3(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzani<zzxz> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zzxz.class) {
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

    public final String z() {
        return this.zze;
    }

    private zzxz() {
    }

    public static /* synthetic */ void w(zzxz zzxzVar, String str) {
        Objects.requireNonNull(str);
        zzxzVar.zze = str;
    }
}
