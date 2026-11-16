package com.google.android.gms.internal.measurement;

import defpackage.em3;
import defpackage.lh;
import defpackage.so3;
import defpackage.zo3;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzacd implements zzafj {
    static {
        zzadf zzadfVar = zzadf.b;
        int i = em3.a;
    }

    @Override // com.google.android.gms.internal.measurement.zzafj
    public final zzadu a(InputStream inputStream, zzadf zzadfVar) throws zzaeh {
        zzacv zzacvVarH = zzacv.h(4096, inputStream);
        int i = zzadu.zzd;
        zzadu zzaduVarO = ((zzadq) this).a.o();
        try {
            zo3 zo3VarA = so3.c.a(zzaduVarO.getClass());
            lh lhVar = zzacvVarH.c;
            if (lhVar == null) {
                lhVar = new lh(zzacvVarH);
            }
            zo3VarA.e(zzaduVarO, lhVar, zzadfVar);
            zo3VarA.a(zzaduVarO);
            zzacvVarH.m(0);
            if (zzadu.w(zzaduVarO, true)) {
                return zzaduVarO;
            }
            throw new zzafy(zzaduVarO).d();
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
}
