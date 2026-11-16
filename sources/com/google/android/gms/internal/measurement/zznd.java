package com.google.android.gms.internal.measurement;

import defpackage.dz4;
import defpackage.em3;
import defpackage.hj;
import defpackage.rl3;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zznd {
    public static final zznd c = new zznd(zzmw.b, zzmq.H());
    public final zzmw a;
    public final zzmq b;

    public zznd(zzmw zzmwVar, zzmq zzmqVar) {
        zzmwVar.getClass();
        this.a = zzmwVar;
        this.b = zzmqVar;
    }

    public static zznd a(zzacv zzacvVar, boolean z) throws zzaeh {
        zzmw zzmwVarA;
        int iMin;
        int iC = zzacvVar.C();
        if (iC <= 1) {
            zzacvVar.C();
            int iA = zzacvVar.a(zzacvVar.A());
            zzadf zzadfVar = zzadf.b;
            int i = em3.a;
            zzmq zzmqVarF = zzmq.F(zzacvVar, zzadf.c);
            zzacvVar.b(iA);
            zzmu zzmuVarD = zzmu.d();
            Inflater inflater = zzmuVarD.a;
            try {
                if (z) {
                    int iA2 = zzacvVar.a(zzacvVar.A());
                    int iC2 = zzacvVar.c();
                    if (iC2 < 0) {
                        iMin = 4096;
                    } else {
                        iMin = Math.min(iC2, 4096);
                    }
                    try {
                        zzmwVarA = zzmw.a(zzacv.h(4096, new InflaterInputStream(new hj(zzmuVarD, zzacvVar), inflater, iMin)));
                        inflater.reset();
                        if (zzacvVar.c() == 0) {
                            zzacvVar.b(iA2);
                        } else {
                            throw new zzaeh("Unexpected bytes remaining after FlagsBlob parsing.");
                        }
                    } catch (Throwable th) {
                        inflater.reset();
                        throw th;
                    }
                } else {
                    inflater.setInput(zzacvVar.z());
                    try {
                        zzmwVarA = zzmw.a(zzacv.h(4096, new hj(zzmuVarD, 2)));
                        inflater.reset();
                    } catch (Throwable th2) {
                        inflater.reset();
                        throw th2;
                    }
                }
                zzmuVarD.close();
                return new zznd(zzmwVarA, zzmqVarF);
            } catch (Throwable th3) {
                try {
                    zzmuVarD.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        dz4.f(rl3.k(new StringBuilder(String.valueOf(iC).length() + 44), "Unsupported version: ", iC, ". Current version is: 1"));
        return null;
    }
}
