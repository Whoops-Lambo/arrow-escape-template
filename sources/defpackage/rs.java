package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class rs implements om {
    public final kl b;
    public final f4 c;

    @Override // defpackage.om
    public final void a(Throwable th) {
        this.b.a(th);
    }

    @Override // defpackage.om
    public final Throwable b() {
        return this.b.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r5.c.invoke(r0) == r4) goto L21;
     */
    @Override // defpackage.om
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.dy r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.qs
            if (r0 == 0) goto L13
            r0 = r6
            qs r0 = (defpackage.qs) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            qs r0 = new qs
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
            kl r6 = r5.b
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r4) goto L43
            goto L4d
        L43:
            r0.t = r2
            f4 r5 = r5.c
            java.lang.Object r5 = r5.invoke(r0)
            if (r5 != r4) goto L4e
        L4d:
            return r4
        L4e:
            az2 r5 = defpackage.az2.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rs.c(dy):java.lang.Object");
    }

    @Override // defpackage.om
    public final Object d(fy fyVar) {
        return this.b.d(fyVar);
    }

    @Override // defpackage.om
    public final bk e() {
        return this.b.e();
    }

    public rs(kl klVar, f4 f4Var) {
        this.b = klVar;
        this.c = f4Var;
    }
}
