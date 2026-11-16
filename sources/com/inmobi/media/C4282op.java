package com.inmobi.media;

import android.widget.ProgressBar;
import defpackage.az2;
import defpackage.cz;
import defpackage.dy;
import defpackage.ul2;
import defpackage.zr0;

/* JADX INFO: renamed from: com.inmobi.media.op, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4282op extends ul2 implements zr0 {
    public int a;
    public int b;
    public int c;
    public long d;
    public float e;
    public ProgressBar f;
    public int g;
    public final /* synthetic */ ProgressBar h;
    public final /* synthetic */ C4310pp i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4282op(ProgressBar progressBar, C4310pp c4310pp, int i, dy dyVar) {
        super(2, dyVar);
        this.h = progressBar;
        this.i = c4310pp;
        this.j = i;
    }

    @Override // defpackage.ph
    public final dy create(Object obj, dy dyVar) {
        return new C4282op(this.h, this.i, this.j, dyVar);
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        return ((C4282op) create((cz) obj, (dy) obj2)).invokeSuspend(az2.a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0046  */
    /* JADX WARN: Code duplicated, block: B:12:0x0066 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0064 -> B:13:0x0067). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ph
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.g
            r1 = 1
            if (r0 == 0) goto L1e
            if (r0 != r1) goto L17
            int r0 = r12.c
            int r2 = r12.b
            float r3 = r12.e
            long r4 = r12.d
            int r6 = r12.a
            android.widget.ProgressBar r7 = r12.f
            defpackage.wz2.a0(r13)
            goto L67
        L17:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r12)
            r12 = 0
            return r12
        L1e:
            defpackage.wz2.a0(r13)
            android.widget.ProgressBar r13 = r12.h
            int r13 = r13.getProgress()
            com.inmobi.media.pp r0 = r12.i
            com.inmobi.media.Xh r0 = r0.c
            long r2 = r0.f
            r4 = 10
            long r2 = r2 / r4
            int r0 = r12.j
            int r0 = r0 - r13
            float r0 = (float) r0
            r4 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 / r4
            android.widget.ProgressBar r4 = r12.h
            r5 = 10
            r6 = 0
            r7 = r4
            r9 = r6
            r6 = r13
            r10 = r2
            r3 = r0
            r2 = r5
            r0 = r9
            r4 = r10
        L44:
            if (r0 >= r2) goto L69
            float r13 = (float) r6
            int r8 = r0 + 1
            float r8 = (float) r8
            float r8 = r8 * r3
            float r8 = r8 + r13
            int r13 = (int) r8
            com.inmobi.media.Jp.a(r7, r13)
            r12.f = r7
            r12.a = r6
            r12.d = r4
            r12.e = r3
            r12.b = r2
            r12.c = r0
            r12.g = r1
            java.lang.Object r13 = defpackage.ns1.i(r4, r12)
            dz r8 = defpackage.dz.a
            if (r13 != r8) goto L67
            return r8
        L67:
            int r0 = r0 + r1
            goto L44
        L69:
            az2 r12 = defpackage.az2.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4282op.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
