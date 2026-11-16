package io.p071bidmachine.analytics.internal.r;

import android.content.Context;
import defpackage.az2;
import defpackage.c91;
import defpackage.cz;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.eu;
import defpackage.fy;
import defpackage.gd1;
import defpackage.j52;
import defpackage.k52;
import defpackage.kc2;
import defpackage.qb5;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.tb5;
import defpackage.ul2;
import defpackage.wz2;
import defpackage.zr0;
import io.p071bidmachine.analytics.ReaderConfig;
import io.p071bidmachine.analytics.internal.I.f;
import io.p071bidmachine.analytics.internal.I.g;
import io.p071bidmachine.analytics.internal.p078g.h;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a extends io.p071bidmachine.analytics.internal.p079h.d {
    private final gd1 d = eu.w(d.a);
    private c91 e;
    private C1603a f;

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.r.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class C1603a {
        private final long a;
        private final List b;
        private final io.p071bidmachine.analytics.internal.p079h.c c;

        public final io.p071bidmachine.analytics.internal.p079h.c a() {
            return this.c;
        }

        public final long b() {
            return this.a;
        }

        public final List c() {
            return this.b;
        }

        public C1603a(long j, List list, io.p071bidmachine.analytics.internal.p079h.c cVar) {
            this.a = j;
            this.b = list;
            this.c = cVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b extends ul2 implements zr0 {
        Object a;
        Object b;
        Object c;
        int d;
        private /* synthetic */ Object e;
        final /* synthetic */ C1603a f;
        final /* synthetic */ a g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C1603a c1603a, a aVar, dy dyVar) {
            super(2, dyVar);
            this.f = c1603a;
            this.g = aVar;
        }

        @Override // defpackage.ph
        public final dy create(Object obj, dy dyVar) {
            b bVar = new b(this.f, this.g, dyVar);
            bVar.e = obj;
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x005e  */
        /* JADX WARN: Code duplicated, block: B:19:0x0075  */
        /* JADX WARN: Code duplicated, block: B:22:0x007c  */
        /* JADX WARN: Code duplicated, block: B:25:0x0081  */
        /* JADX WARN: Code duplicated, block: B:26:0x0084  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00b0 -> B:11:0x0039). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.ph
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                int r0 = r9.d
                r1 = 2
                r2 = 1
                r3 = 0
                if (r0 == 0) goto L31
                if (r0 == r2) goto L19
                if (r0 != r1) goto L13
                java.lang.Object r0 = r9.e
                cz r0 = (defpackage.cz) r0
                defpackage.wz2.a0(r10)
                goto L39
            L13:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.e32.i(r9)
                return r3
            L19:
                java.lang.Object r0 = r9.c
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r4 = r9.b
                java.util.Collection r4 = (java.util.Collection) r4
                java.lang.Object r5 = r9.a
                io.bidmachine.analytics.internal.r.a r5 = (io.p071bidmachine.analytics.internal.r.a) r5
                java.lang.Object r6 = r9.e
                cz r6 = (defpackage.cz) r6
                defpackage.wz2.a0(r10)
                k52 r10 = (defpackage.k52) r10
                java.lang.Object r10 = r10.a
                goto L78
            L31:
                defpackage.wz2.a0(r10)
                java.lang.Object r10 = r9.e
                r0 = r10
                cz r0 = (defpackage.cz) r0
            L39:
                boolean r10 = defpackage.kc2.r(r0)
                if (r10 == 0) goto Lb2
                io.bidmachine.analytics.internal.r.a$a r10 = r9.f
                java.util.List r10 = r10.c()
                io.bidmachine.analytics.internal.r.a r4 = r9.g
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r10 = r10.iterator()
                r8 = r0
                r0 = r10
                r10 = r8
                r8 = r5
                r5 = r4
                r4 = r8
            L56:
                boolean r6 = r0.hasNext()
                dz r7 = defpackage.dz.a
                if (r6 == 0) goto L86
                java.lang.Object r6 = r0.next()
                io.bidmachine.analytics.ReaderConfig$Rule r6 = (io.bidmachine.analytics.ReaderConfig.Rule) r6
                r9.e = r10
                r9.a = r5
                r9.b = r4
                r9.c = r0
                r9.d = r2
                java.lang.Object r6 = io.p071bidmachine.analytics.internal.r.a.a(r5, r6, r9)
                if (r6 != r7) goto L75
                goto Laf
            L75:
                r8 = r6
                r6 = r10
                r10 = r8
            L78:
                boolean r7 = r10 instanceof defpackage.j52
                if (r7 == 0) goto L7d
                r10 = r3
            L7d:
                io.bidmachine.analytics.internal.h.c$a r10 = (io.bidmachine.analytics.internal.h.c.a) r10
                if (r10 == 0) goto L84
                r4.add(r10)
            L84:
                r10 = r6
                goto L56
            L86:
                java.util.List r4 = (java.util.List) r4
                io.bidmachine.analytics.internal.r.a r0 = r9.g
                boolean r0 = r0.c()
                if (r0 == 0) goto L99
                io.bidmachine.analytics.internal.r.a$a r0 = r9.f
                io.bidmachine.analytics.internal.h.c r0 = r0.a()
                r0.a(r4)
            L99:
                io.bidmachine.analytics.internal.r.a$a r0 = r9.f
                long r4 = r0.b()
                r9.e = r10
                r9.a = r3
                r9.b = r3
                r9.c = r3
                r9.d = r1
                java.lang.Object r0 = defpackage.ns1.i(r4, r9)
                if (r0 != r7) goto Lb0
            Laf:
                return r7
            Lb0:
                r0 = r10
                goto L39
            Lb2:
                az2 r9 = defpackage.az2.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.r.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.zr0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(cz czVar, dy dyVar) {
            return ((b) create(czVar, dyVar)).invokeSuspend(az2.a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class c extends fy {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int e;

        public c(dy dyVar) {
            super(dyVar);
        }

        @Override // defpackage.ph
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            Object objB = a.this.b(null, this);
            return objB == dz.a ? objB : new k52(objB);
        }
    }

    public abstract Object a(ReaderConfig.Rule rule, dy dyVar);

    public boolean c() {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class d extends rc1 implements sr0 {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // defpackage.sr0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final cz invoke() {
            return kc2.a(qb5.l(tb5.a(), f.g.a().c()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ReaderConfig.Rule rule, dy dyVar) throws Throwable {
        c cVar;
        Object j52Var;
        h.a aVar;
        String strA;
        if (dyVar instanceof c) {
            cVar = (c) dyVar;
            int i = cVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.e = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(dyVar);
            }
        } else {
            cVar = new c(dyVar);
        }
        Object objA = cVar.c;
        int i2 = cVar.e;
        try {
            if (i2 == 0) {
                wz2.a0(objA);
                cVar.a = this;
                cVar.b = rule;
                cVar.e = 1;
                objA = a(rule, cVar);
                dz dzVar = dz.a;
                if (objA == dzVar) {
                    return dzVar;
                }
            } else {
                if (i2 != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rule = (ReaderConfig.Rule) cVar.b;
                this = (a) cVar.a;
                wz2.a0(objA);
            }
            j52Var = (String) objA;
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        ReaderConfig.Rule rule2 = rule;
        String str = (String) (j52Var instanceof j52 ? null : j52Var);
        if (str != null) {
            return new io.bidmachine.analytics.internal.h.c.a(rule2, str, null, 4, null);
        }
        Throwable thB = k52.b(j52Var);
        if (thB instanceof CancellationException) {
            throw thB;
        }
        if (thB instanceof FileNotFoundException) {
            aVar = h.a.READER_NO_CONTENT;
        } else if (thB instanceof SecurityException) {
            aVar = h.a.READER_NO_ACCESS;
        } else {
            aVar = thB instanceof IllegalStateException ? h.a.READER_BAD_CONTENT : h.a.READER_INVALID;
        }
        if (thB == null || (strA = g.a(thB)) == null) {
            strA = "";
        }
        return new io.bidmachine.analytics.internal.h.c.a(rule2, null, new h(this.a(), aVar, strA), 2, null);
    }

    @Override // io.p071bidmachine.analytics.internal.p079h.d
    public void e(Context context) {
        c91 c91Var = this.e;
        if (c91Var != null) {
            c91Var.cancel(null);
        }
    }

    @Override // io.p071bidmachine.analytics.internal.p079h.d
    public void f(Context context) {
        c91 c91Var = this.e;
        if (c91Var != null) {
            c91Var.cancel(null);
        }
        C1603a c1603a = this.f;
        if (c1603a == null) {
            return;
        }
        this.e = tb5.t(b(), null, null, new b(c1603a, this, null), 3);
    }

    @Override // io.p071bidmachine.analytics.internal.p079h.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(C1603a c1603a) {
        this.f = c1603a;
    }

    public final cz b() {
        return (cz) this.d.getValue();
    }
}
