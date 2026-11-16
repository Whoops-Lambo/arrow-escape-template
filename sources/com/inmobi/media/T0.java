package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import defpackage.az2;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.wr0;
import defpackage.wz2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class T0 {
    public final Z9 a;

    public abstract az2 a(AdResponse adResponse, wr0 wr0Var);

    public abstract Object a(dy dyVar);

    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x0121  */
    /* JADX WARN: Code duplicated, block: B:76:0x0151  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        if (r2 == r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f9, code lost:
    
        if (a(r0, r14) == r11) goto L52;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00bf -> B:32:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00c1 -> B:32:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00d3 -> B:32:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00d5 -> B:32:0x0095). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r17, defpackage.wr0 r18, defpackage.fy r19) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.T0.a(java.lang.String, wr0, fy):java.lang.Object");
    }

    public T0(Z9 z9) {
        this.a = z9;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(wr0 wr0Var, fy fyVar) {
        R0 r0;
        if (fyVar instanceof R0) {
            r0 = (R0) fyVar;
            int i = r0.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                r0.d = i - Integer.MIN_VALUE;
            } else {
                r0 = new R0(this, fyVar);
            }
        } else {
            r0 = new R0(this, fyVar);
        }
        Object objA = r0.b;
        int i2 = r0.d;
        Object obj = dz.a;
        if (i2 == 0) {
            wz2.a0(objA);
            wr0Var.invoke(C4046gc.a);
            r0.a = wr0Var;
            r0.d = 1;
            objA = a(r0);
            if (objA != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                wz2.a0(objA);
                return objA;
            }
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        wr0Var = r0.a;
        wz2.a0(objA);
        r0.a = null;
        r0.d = 2;
        Object objA2 = a((String) objA, wr0Var, r0);
        return objA2 == obj ? obj : objA2;
    }
}
