package io.p071bidmachine.rendering.internal.meanbackground;

import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.wr0;
import defpackage.wz2;
import io.p071bidmachine.rendering.internal.event.j;
import io.p071bidmachine.util.log.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class y {
    public final b a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, wr0 wr0Var, fy fyVar) {
        x xVar;
        long jCurrentTimeMillis;
        if (fyVar instanceof x) {
            xVar = (x) fyVar;
            int i = xVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                xVar.w = i - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, fyVar);
            }
        } else {
            xVar = new x(this, fyVar);
        }
        Object objInvoke = xVar.u;
        int i2 = xVar.w;
        int i3 = 1;
        if (i2 == 0) {
            wz2.a0(objInvoke);
            jCurrentTimeMillis = System.currentTimeMillis();
            xVar.r = this;
            xVar.s = str;
            xVar.t = jCurrentTimeMillis;
            xVar.w = 1;
            objInvoke = wr0Var.invoke(xVar);
            Object obj = dz.a;
            if (objInvoke == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j = xVar.t;
            String str2 = xVar.s;
            y yVar = xVar.r;
            wz2.a0(objInvoke);
            jCurrentTimeMillis = j;
            str = str2;
            this = yVar;
        }
        this.a.c("MeanPerformanceMeasurer", new j(str, jCurrentTimeMillis, i3));
        return objInvoke;
    }

    public y(b bVar) {
        bVar.getClass();
        this.a = bVar;
    }
}
