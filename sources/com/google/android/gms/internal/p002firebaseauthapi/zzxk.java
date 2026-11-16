package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ht3;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzxk extends zzalt<zzxk, zza> implements zzamx {
    private static final zzxk zzc;
    private static volatile zzani<zzxk> zzd;
    private String zze = "";
    private zzakb zzf = zzakb.b;
    private int zzg;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt.zza<zzxk, zza> implements zzamx {
        private zza() {
            super(zzxk.zzc);
        }

        public final void k(zzyi zzyiVar) {
            i();
            zzxk.y((zzxk) this.b, zzyiVar);
        }

        public final void l(zzakb zzakbVar) {
            i();
            zzxk.x((zzxk) this.b, zzakbVar);
        }

        public final void m(String str) {
            i();
            zzxk.z((zzxk) this.b, str);
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    static {
        zzxk zzxkVar = new zzxk();
        zzc = zzxkVar;
        zzalt.m(zzxk.class, zzxkVar);
    }

    public static zzxk B() {
        return zzc;
    }

    public static zza u() {
        return (zza) zzc.p();
    }

    public static zza v(zzxk zzxkVar) {
        zzalt.zza zzaVarP = zzc.p();
        zzaVarP.d(zzxkVar);
        return (zza) zzaVarP;
    }

    public static zzxk w(byte[] bArr, zzalf zzalfVar) {
        return (zzxk) zzalt.i(zzc, bArr, zzalfVar);
    }

    public final zzyi C() {
        zzyi zzyiVarA = zzyi.a(this.zzg);
        return zzyiVarA == null ? zzyi.UNRECOGNIZED : zzyiVarA;
    }

    public final zzakb D() {
        return this.zzf;
    }

    public final String E() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (b1.a[i - 1]) {
            case 1:
                return new zzxk();
            case 2:
                return new zza(0);
            case 3:
                return new ht3(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzani<zzxk> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zzxk.class) {
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

    private zzxk() {
    }

    public static /* synthetic */ void x(zzxk zzxkVar, zzakb zzakbVar) {
        Objects.requireNonNull(zzakbVar);
        zzxkVar.zzf = zzakbVar;
    }

    public static /* synthetic */ void y(zzxk zzxkVar, zzyi zzyiVar) {
        zzxkVar.zzg = zzyiVar.zza();
    }

    public static /* synthetic */ void z(zzxk zzxkVar, String str) {
        Objects.requireNonNull(str);
        zzxkVar.zze = str;
    }
}
