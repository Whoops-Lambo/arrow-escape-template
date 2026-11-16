package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ht3;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzyf extends zzalt<zzyf, zza> implements zzamx {
    private static final zzyf zzc;
    private static volatile zzani<zzyf> zzd;
    private int zze;
    private String zzf = "";
    private zzxk zzg;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt.zza<zzyf, zza> implements zzamx {
        private zza() {
            super(zzyf.zzc);
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    static {
        zzyf zzyfVar = new zzyf();
        zzc = zzyfVar;
        zzalt.m(zzyf.class, zzyfVar);
    }

    public static zzyf A() {
        return zzc;
    }

    public static zzyf v(zzakb zzakbVar, zzalf zzalfVar) {
        return (zzyf) zzalt.g(zzc, zzakbVar, zzalfVar);
    }

    public static zza y() {
        return (zza) zzc.p();
    }

    public final String B() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (i1.a[i - 1]) {
            case 1:
                return new zzyf();
            case 2:
                return new zza(0);
            case 3:
                return new ht3(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzani<zzyf> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zzyf.class) {
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

    public final zzxk u() {
        zzxk zzxkVar = this.zzg;
        return zzxkVar == null ? zzxk.B() : zzxkVar;
    }

    private zzyf() {
    }

    public static /* synthetic */ void w(zzyf zzyfVar, zzxk zzxkVar) {
        Objects.requireNonNull(zzxkVar);
        zzyfVar.zzg = zzxkVar;
        zzyfVar.zze |= 1;
    }

    public static /* synthetic */ void x(zzyf zzyfVar, String str) {
        Objects.requireNonNull(str);
        zzyfVar.zzf = str;
    }
}
