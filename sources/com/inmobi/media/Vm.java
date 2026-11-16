package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import defpackage.az2;
import defpackage.dy;
import defpackage.dz;
import defpackage.xa0;
import java.util.LinkedHashSet;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Vm {
    public static final Vm a = new Vm();
    public static final Oi b = new Oi();
    public static final LinkedHashSet c = new LinkedHashSet();
    public static xa0 d;
    public static Ym e;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (a((defpackage.dy) r0) == r4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.fy r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.inmobi.media.Rm
            if (r0 == 0) goto L13
            r0 = r6
            com.inmobi.media.Rm r0 = (com.inmobi.media.Rm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            com.inmobi.media.Rm r0 = new com.inmobi.media.Rm
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r5 = r0.a
            int r6 = r0.c
            r1 = 0
            r2 = 2
            r3 = 1
            dz r4 = defpackage.dz.a
            if (r6 == 0) goto L35
            if (r6 == r3) goto L31
            if (r6 != r2) goto L2b
            defpackage.wz2.a0(r5)
            goto L51
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r5)
            return r1
        L31:
            defpackage.wz2.a0(r5)
            goto L48
        L35:
            defpackage.wz2.a0(r5)
            com.inmobi.media.Oi r5 = com.inmobi.media.Vm.b
            com.inmobi.media.Sm r6 = new com.inmobi.media.Sm
            r6.<init>(r1)
            r0.c = r3
            java.lang.Object r5 = com.inmobi.media.AbstractC4038g4.a(r5, r6, r0)
            if (r5 != r4) goto L48
            goto L50
        L48:
            r0.c = r2
            java.lang.Object r5 = a(r0)
            if (r5 != r4) goto L51
        L50:
            return r4
        L51:
            az2 r5 = defpackage.az2.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Vm.a(fy):java.lang.Object");
    }

    public static Object a(dy dyVar) {
        Oi oi = Jk.a;
        SignalsConfig.UnifiedIdServiceConfig unifiedIdServiceConfig = ((SignalsConfig) AbstractC4563z4.a.a(SignalsConfig.class)).getUnifiedIdServiceConfig();
        unifiedIdServiceConfig.getUrl();
        Object objA = AbstractC4038g4.a(b, new Tm(unifiedIdServiceConfig, null), dyVar);
        return objA == dz.a ? objA : az2.a;
    }

    public static Object a(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, dy dyVar) {
        if (inMobiUnifiedIdInterface != null) {
            c.add(inMobiUnifiedIdInterface);
        }
        Object obj = b.b.get();
        az2 az2Var = az2.a;
        if (obj != null) {
            Objects.toString(inMobiUnifiedIdInterface);
            return az2Var;
        }
        Object objA = a(dyVar);
        return objA == dz.a ? objA : az2Var;
    }
}
