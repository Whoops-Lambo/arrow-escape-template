package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class do0 {
    public static final do0 a = new do0();
    public static final Map b = Collections.synchronizedMap(new LinkedHashMap());

    public static bo0 a(ac2 ac2Var) {
        Map map = b;
        map.getClass();
        Object obj = map.get(ac2Var);
        if (obj != null) {
            return (bo0) obj;
        }
        m93.h(ac2Var, ". Dependencies should be added at class load time.", "Cannot get dependency ");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    /* JADX WARN: Code duplicated, block: B:19:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x009c  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009c -> B:21:0x009d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(defpackage.fy r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.co0
            if (r0 == 0) goto L13
            r0 = r9
            co0 r0 = (defpackage.co0) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.y = r1
            goto L18
        L13:
            co0 r0 = new co0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r8 = r0.w
            int r9 = r0.y
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L3a
            if (r9 != r2) goto L34
            java.lang.Object r9 = r0.v
            java.util.Map r3 = r0.u
            java.util.Map r3 = (java.util.Map) r3
            ac2 r4 = r0.t
            java.util.Iterator r5 = r0.s
            java.util.Map r6 = r0.r
            java.util.Map r6 = (java.util.Map) r6
            defpackage.wz2.a0(r8)
            goto L9d
        L34:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r8)
            return r1
        L3a:
            defpackage.wz2.a0(r8)
            java.util.Map r8 = defpackage.do0.b
            r8.getClass()
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            int r3 = r8.size()
            int r3 = defpackage.rh1.U(r3)
            r9.<init>(r3)
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
            r5 = r8
            r3 = r9
        L59:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto Lb5
            java.lang.Object r8 = r5.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            java.lang.Object r4 = r8.getKey()
            ac2 r4 = (defpackage.ac2) r4
            java.lang.Object r8 = r8.getValue()
            bo0 r8 = (defpackage.bo0) r8
            s5 r6 = new s5
            r7 = 22
            r6.<init>(r8, r7)
            r8 = r3
            java.util.Map r8 = (java.util.Map) r8
            r0.r = r8
            r0.s = r5
            r0.t = r4
            r0.u = r8
            r0.v = r9
            r0.y = r2
            hh r8 = new hh
            r7 = 3
            r8.<init>(r6, r1, r7)
            cg0 r6 = defpackage.cg0.a
            java.lang.Object r8 = defpackage.tb5.E(r6, r8, r0)
            dz r6 = defpackage.dz.a
            if (r8 != r6) goto L9c
            return r6
        L9c:
            r6 = r3
        L9d:
            r4.getClass()
            bo0 r8 = a(r4)
            com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber r8 = r8.b
            if (r8 == 0) goto Lad
            r3.put(r9, r8)
            r3 = r6
            goto L59
        Lad:
            java.lang.String r8 = "Subscriber "
            java.lang.String r9 = " has not been registered."
            defpackage.m93.h(r4, r9, r8)
            return r1
        Lb5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.do0.b(fy):java.lang.Object");
    }
}
