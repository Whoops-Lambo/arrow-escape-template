package com.google.android.gms.internal.measurement;

import defpackage.am3;
import defpackage.lh;
import defpackage.so3;
import defpackage.to3;
import defpackage.vo3;
import defpackage.zo3;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzpr extends zzadu implements zzafd {
    private static final zzpr zzl;
    private static volatile zzafj zzm;
    private int zzb;
    private boolean zzf;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private zzaef zzg = to3.e;

    static {
        zzpr zzprVar = new zzpr();
        zzl = zzprVar;
        zzadu.u(zzpr.class, zzprVar);
    }

    public static zzpr B(InputStream inputStream, zzadf zzadfVar) throws zzaeh {
        zzpr zzprVar = zzl;
        zzacv zzacvVarH = zzacv.h(4096, inputStream);
        zzadu zzaduVarO = zzprVar.o();
        try {
            zo3 zo3VarA = so3.c.a(zzaduVarO.getClass());
            lh lhVar = zzacvVarH.c;
            if (lhVar == null) {
                lhVar = new lh(zzacvVarH);
            }
            zo3VarA.e(zzaduVarO, lhVar, zzadfVar);
            zo3VarA.a(zzaduVarO);
            zzadu.x(zzaduVarO);
            return (zzpr) zzaduVarO;
        } catch (zzaeh e) {
            if (e.f()) {
                throw new zzaeh(e);
            }
            throw e;
        } catch (zzafy e2) {
            throw e2.d();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzaeh) {
                throw ((zzaeh) e3.getCause());
            }
            throw new zzaeh(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzaeh) {
                throw ((zzaeh) e4.getCause());
            }
            throw e4;
        }
    }

    public final boolean A() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object y(int i) {
        zzafj zzadqVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vo3(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u001a\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", am3.b, "zzi", "zzk", "zzj"});
        }
        if (i2 == 3) {
            return new zzpr();
        }
        if (i2 == 4) {
            return new zzpq(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzm;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzpr.class) {
            try {
                zzadqVar = zzm;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzl);
                    zzm = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }

    public final String z() {
        return this.zze;
    }

    private zzpr() {
    }
}
