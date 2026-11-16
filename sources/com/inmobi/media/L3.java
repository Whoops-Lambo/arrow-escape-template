package com.inmobi.media;

import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.wz2;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class L3 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(C4371s3 c4371s3, fy fyVar) {
        K3 k3;
        if (fyVar instanceof K3) {
            k3 = (K3) fyVar;
            int i = k3.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                k3.d = i - Integer.MIN_VALUE;
            } else {
                k3 = new K3(this, fyVar);
            }
        } else {
            k3 = new K3(this, fyVar);
        }
        Object objA = k3.b;
        int i2 = k3.d;
        try {
            if (i2 == 0) {
                wz2.a0(objA);
                X3 x3 = X3.a;
                int i3 = c4371s3.a;
                Kf kf = new Kf(c4371s3.b, X3.a(c4371s3), new Bm(X3.c().getPingTimeout() * 1000, X3.c().getPingTimeout() * 1000, X3.c().getPingTimeout() * 1000), c4371s3.c, null, c4371s3.d, 16);
                C4044ga c4044ga = (C4044ga) If.f.getValue();
                k3.a = c4371s3;
                k3.d = 1;
                objA = c4044ga.a.a(kf, k3);
                dz dzVar = dz.a;
                if (objA == dzVar) {
                    return dzVar;
                }
            } else {
                if (i2 != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c4371s3 = k3.a;
                wz2.a0(objA);
            }
            Of of = (Of) objA;
            X3 x4 = X3.a;
            if (AbstractC4391sn.a(of)) {
                return null;
            }
            int iC = of.c();
            if (200 <= iC && iC < 300) {
                return null;
            }
            if (!c4371s3.d) {
                C4565z6 c4565z6 = B6.b;
                if (303 == iC || 302 == iC) {
                    return null;
                }
            }
            B6.b.getClass();
            return C4565z6.a(iC);
        } catch (CancellationException unused) {
            X3 x5 = X3.a;
            return B6.n;
        } catch (Exception e) {
            X3 x6 = X3.a;
            e.getMessage();
            return B6.d;
        }
    }
}
