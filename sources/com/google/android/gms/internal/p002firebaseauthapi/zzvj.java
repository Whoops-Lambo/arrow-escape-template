package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ht3;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzvj extends zzalt<zzvj, zza> implements zzamx {
    private static final zzvj zzc;
    private static volatile zzani<zzvj> zzd;
    private int zze;
    private zzxk zzf;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt.zza<zzvj, zza> implements zzamx {
        private zza() {
            super(zzvj.zzc);
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    static {
        zzvj zzvjVar = new zzvj();
        zzc = zzvjVar;
        zzalt.m(zzvj.class, zzvjVar);
    }

    public static zza u() {
        return (zza) zzc.p();
    }

    public static zzvj x() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (m0.a[i - 1]) {
            case 1:
                return new zzvj();
            case 2:
                return new zza(0);
            case 3:
                return new ht3(zzc, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzani<zzvj> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zzvj.class) {
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

    public final zzxk y() {
        zzxk zzxkVar = this.zzf;
        return zzxkVar == null ? zzxk.B() : zzxkVar;
    }

    private zzvj() {
    }

    public static /* synthetic */ void v(zzvj zzvjVar, zzxk zzxkVar) {
        Objects.requireNonNull(zzxkVar);
        zzvjVar.zzf = zzxkVar;
        zzvjVar.zze |= 1;
    }
}
