package com.inmobi.media;

import defpackage.ar1;
import defpackage.az2;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.wz2;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Q5 extends AbstractC4385sh {
    public static final /* synthetic */ int e = 0;
    public final C3994eg d;

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object b(Vg vg, fy fyVar) {
        P5 p5;
        Vg vg2;
        Vg vg3;
        Vg vg4 = vg;
        if (fyVar instanceof P5) {
            p5 = (P5) fyVar;
            int i = p5.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                p5.d = i - Integer.MIN_VALUE;
            } else {
                p5 = new P5(this, fyVar);
            }
        } else {
            p5 = new P5(this, fyVar);
        }
        Object objA = p5.b;
        int i2 = p5.d;
        az2 az2Var = az2.a;
        Object obj = dz.a;
        try {
            try {
                try {
                    if (i2 == 0) {
                        wz2.a0(objA);
                        String str = vg4.b;
                        p5.a = vg4;
                        p5.d = 1;
                        objA = a(vg4, p5);
                        if (objA != obj) {
                        }
                    }
                    if (i2 == 1) {
                        vg4 = p5.a;
                        wz2.a0(objA);
                    } else {
                        if (i2 != 2) {
                            e32.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Vg vg5 = p5.a;
                        wz2.a0(objA);
                    }
                    int iOrdinal = ((EnumC4302ph) objA).ordinal();
                    if (iOrdinal == 0) {
                        C3994eg c3994eg = this.d;
                        p5.a = vg3;
                        p5.d = 2;
                        return c3994eg.a(p5) == obj ? obj : az2Var;
                    }
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return az2Var;
                        }
                        throw new ar1();
                    }
                    WeakReference weakReference = (WeakReference) this.b.get(vg3.h);
                    AbstractC4385sh.a(0, "Database capacity exceeded for pings", (short) 2248, vg3, System.currentTimeMillis(), weakReference != null ? (InterfaceC4274oh) weakReference.get() : null);
                    return az2Var;
                } catch (Exception e2) {
                    e = e2;
                    vg2 = vg3;
                    e.getMessage();
                    WeakReference weakReference2 = (WeakReference) this.b.get(vg2.h);
                    InterfaceC4274oh interfaceC4274oh = weakReference2 != null ? (InterfaceC4274oh) weakReference2.get() : null;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "Unknown error";
                    }
                    AbstractC4385sh.a(0, message, (short) 2244, vg2, System.currentTimeMillis(), interfaceC4274oh);
                }
                vg3 = vg4;
            } catch (Exception e3) {
                e = e3;
                vg2 = vg4;
            }
        } catch (Error e4) {
            e4.getMessage();
            throw e4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q5(Gh gh) {
        super(gh);
        gh.getClass();
        this.d = new C3994eg(gh, new O5(this), this.c);
    }
}
