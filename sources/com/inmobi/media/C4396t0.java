package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.wz2;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: com.inmobi.media.t0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4396t0 {
    public static final C4396t0 a = new C4396t0();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Mf mf, fy fyVar) {
        C4340r0 c4340r0;
        InMobiAdRequestStatus.StatusCode statusCode;
        if (fyVar instanceof C4340r0) {
            c4340r0 = (C4340r0) fyVar;
            int i = c4340r0.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4340r0.c = i - Integer.MIN_VALUE;
            } else {
                c4340r0 = new C4340r0(this, fyVar);
            }
        } else {
            c4340r0 = new C4340r0(this, fyVar);
        }
        Object objB = c4340r0.a;
        int i2 = c4340r0.c;
        if (i2 == 0) {
            wz2.a0(objB);
            c4340r0.c = 1;
            objB = b(mf, c4340r0);
            Object obj = dz.a;
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objB);
        }
        Of of = (Of) objB;
        if (of.c() == 204) {
            throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NO_FILL), new C4525xk((short) 2286));
        }
        int iC = of.c();
        C4565z6 c4565z6 = B6.b;
        if (iC == 176) {
            throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), new C4152k7((short) 2369));
        }
        if (of.c() == 200) {
            return of;
        }
        int iC2 = of.c();
        if (iC2 == 192) {
            statusCode = InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED;
        } else if (iC2 == 0) {
            statusCode = InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE;
        } else if (iC2 == 504 || iC2 == 176) {
            statusCode = InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT;
        } else if (400 > iC2 || iC2 >= 500) {
            statusCode = (500 > iC2 || iC2 > 599) ? InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR : InMobiAdRequestStatus.StatusCode.SERVER_ERROR;
        } else {
            statusCode = InMobiAdRequestStatus.StatusCode.REQUEST_INVALID;
        }
        throw new Z(new InMobiAdRequestStatus(statusCode), new C4180l7(of.c()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Mf mf, fy fyVar) {
        C4368s0 c4368s0;
        if (fyVar instanceof C4368s0) {
            c4368s0 = (C4368s0) fyVar;
            int i = c4368s0.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4368s0.c = i - Integer.MIN_VALUE;
            } else {
                c4368s0 = new C4368s0(this, fyVar);
            }
        } else {
            c4368s0 = new C4368s0(this, fyVar);
        }
        Object obj = c4368s0.a;
        int i2 = c4368s0.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    wz2.a0(obj);
                    return obj;
                }
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(obj);
            C4044ga c4044ga = (C4044ga) If.a.getValue();
            c4368s0.c = 1;
            Object objA = c4044ga.a.a(mf, c4368s0);
            dz dzVar = dz.a;
            return objA == dzVar ? dzVar : objA;
        } catch (CancellationException unused) {
            throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4152k7((short) 2206));
        }
    }
}
