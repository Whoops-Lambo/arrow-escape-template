package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class ec2 {
    public final gd2 a;
    public final gd2 b;

    public final double a() {
        Double dB = this.a.b();
        if (dB != null) {
            double dDoubleValue = dB.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        Double dB2 = this.b.b();
        if (dB2 != null) {
            double dDoubleValue2 = dB2.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r5.b.a(r0) == r4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.fy r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.dc2
            if (r0 == 0) goto L13
            r0 = r6
            dc2 r0 = (defpackage.dc2) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            dc2 r0 = new dc2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.r
            int r1 = r0.t
            r2 = 2
            r3 = 1
            dz r4 = defpackage.dz.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.wz2.a0(r6)
            goto L4e
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r5)
            r5 = 0
            return r5
        L31:
            defpackage.wz2.a0(r6)
            goto L43
        L35:
            defpackage.wz2.a0(r6)
            r0.t = r3
            gd2 r6 = r5.a
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r4) goto L43
            goto L4d
        L43:
            r0.t = r2
            gd2 r5 = r5.b
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r4) goto L4e
        L4d:
            return r4
        L4e:
            az2 r5 = defpackage.az2.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ec2.b(fy):java.lang.Object");
    }

    public ec2(gd2 gd2Var, gd2 gd2Var2) {
        gd2Var.getClass();
        gd2Var2.getClass();
        this.a = gd2Var;
        this.b = gd2Var2;
    }
}
