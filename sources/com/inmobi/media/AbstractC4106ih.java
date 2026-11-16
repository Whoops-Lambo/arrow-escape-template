package com.inmobi.media;

import androidx.media3.common.PlaybackException;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.az2;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.gd1;
import defpackage.wr0;
import defpackage.wz2;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.inmobi.media.ih, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4106ih {
    public final Gh a;
    public final InterfaceC3884ah b;
    public final C4161kg c;
    public volatile EnumC3912bh d;

    public abstract Object b(fy fyVar);

    public abstract Object c(fy fyVar);

    /* JADX WARN: Code duplicated, block: B:22:0x0084  */
    /* JADX WARN: Code duplicated, block: B:25:0x0097  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ec, code lost:
    
        if (r7 == r4) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x003f, code lost:
    
        if (r1 != r4) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.cz r22, int r23, defpackage.wr0 r24, defpackage.fy r25) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC4106ih.a(cz, int, wr0, fy):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Vg vg, fy fyVar) {
        C3995eh c3995eh;
        if (fyVar instanceof C3995eh) {
            c3995eh = (C3995eh) fyVar;
            int i = c3995eh.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3995eh.d = i - Integer.MIN_VALUE;
            } else {
                c3995eh = new C3995eh(this, fyVar);
            }
        } else {
            c3995eh = new C3995eh(this, fyVar);
        }
        Object objA = c3995eh.b;
        int i2 = c3995eh.d;
        if (i2 == 0) {
            wz2.a0(objA);
            if (!b()) {
                A6[] a6Arr = A6.a;
                return new C3940ch(vg, -100, "Ping V2 is disabled from SDK config");
            }
            C4161kg c4161kg = this.c;
            c3995eh.a = vg;
            c3995eh.d = 1;
            objA = c4161kg.a(vg, c3995eh);
            dz dzVar = dz.a;
            if (objA == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vg = c3995eh.a;
            wz2.a0(objA);
        }
        return a(vg, (Of) objA);
    }

    public AbstractC4106ih(Gh gh, InterfaceC3884ah interfaceC3884ah, C4161kg c4161kg) {
        gh.getClass();
        c4161kg.getClass();
        this.a = gh;
        this.b = interfaceC3884ah;
        this.c = c4161kg;
        this.d = EnumC3912bh.STOPPED;
    }

    public final boolean b() {
        return this.d == EnumC3912bh.STARTED;
    }

    public static AdConfig.PingsV2Config a() {
        return ((AdConfig) AbstractC4563z4.a.a(AdConfig.class)).getPingV2();
    }

    public static C3940ch a(Vg vg, Of of) {
        String str = vg.a;
        of.c();
        of.e();
        return new C3940ch(vg, of.c(), of.e());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(defpackage.g8 g8Var, wr0 wr0Var, fy fyVar) {
        C4079hh c4079hh;
        if (fyVar instanceof C4079hh) {
            c4079hh = (C4079hh) fyVar;
            int i = c4079hh.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4079hh.c = i - Integer.MIN_VALUE;
            } else {
                c4079hh = new C4079hh(fyVar);
            }
        } else {
            c4079hh = new C4079hh(fyVar);
        }
        Object objInvoke = c4079hh.b;
        int i2 = c4079hh.c;
        if (i2 == 0) {
            wz2.a0(objInvoke);
            if (!g8Var.isEmpty()) {
                return g8Var.removeFirst();
            }
            c4079hh.a = g8Var;
            c4079hh.c = 1;
            objInvoke = wr0Var.invoke(c4079hh);
            Object obj = dz.a;
            if (objInvoke == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g8Var = c4079hh.a;
            wz2.a0(objInvoke);
        }
        List list = (List) objInvoke;
        if (list.isEmpty()) {
            return null;
        }
        g8Var.addAll(list);
        return g8Var.removeFirst();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Vg vg, fy fyVar) {
        C3968dh c3968dh;
        if (fyVar instanceof C3968dh) {
            c3968dh = (C3968dh) fyVar;
            int i = c3968dh.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3968dh.d = i - Integer.MIN_VALUE;
            } else {
                c3968dh = new C3968dh(this, fyVar);
            }
        } else {
            c3968dh = new C3968dh(this, fyVar);
        }
        Object objB = c3968dh.b;
        int i2 = c3968dh.d;
        try {
            if (i2 == 0) {
                wz2.a0(objB);
                c3968dh.a = vg;
                c3968dh.d = 1;
                objB = b(vg, c3968dh);
                Object obj = dz.a;
                if (objB == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vg = c3968dh.a;
                wz2.a0(objB);
            }
            return (C3940ch) objB;
        } catch (Throwable th) {
            String str = vg.b;
            th.getMessage();
            gd1 gd1Var = Ba.a;
            Ba.a(new C4120j3(th));
            A6[] a6Arr = A6.a;
            String message = th.getMessage();
            if (message == null) {
                message = "Ping exception occurred";
            }
            return new C3940ch(vg, PlaybackException.ERROR_CODE_SKIP_LIMIT_REACHED, message);
        }
    }

    public final Object a(fy fyVar) {
        az2 az2Var = az2.a;
        EnumC3912bh enumC3912bh = this.d;
        b();
        EnumC3912bh enumC3912bh2 = EnumC3912bh.STOPPED;
        Objects.toString(enumC3912bh);
        if (!a().getEnabled()) {
            return az2Var;
        }
        if (this.d == enumC3912bh2) {
            this.d = EnumC3912bh.STARTED;
            Object objC = c(fyVar);
            return objC == dz.a ? objC : az2Var;
        }
        Object objB = b(fyVar);
        return objB == dz.a ? objB : az2Var;
    }
}
