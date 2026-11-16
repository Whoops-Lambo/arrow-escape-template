package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.az2;
import defpackage.cm2;
import defpackage.dz;
import defpackage.e32;
import defpackage.f93;
import defpackage.fy;
import defpackage.gd1;
import defpackage.wz2;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class Zg {
    public static final Zg a = new Zg();
    public static final gd1 b = new cm2(new f93(1));
    public static final gd1 c = new cm2(new f93(2));
    public static final gd1 d = new cm2(new f93(3));
    public static final AtomicBoolean e = new AtomicBoolean(false);
    public static final AtomicBoolean f = new AtomicBoolean(true);

    public static final Gh c() {
        return new Gh(T9.b());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        if (r9 == r8) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.inmobi.media.Gh r10, com.inmobi.media.core.config.models.AdConfig.PingsV2Config r11, defpackage.fy r12) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Zg.a(com.inmobi.media.Gh, com.inmobi.media.core.config.models.AdConfig$PingsV2Config, fy):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object b(fy fyVar) {
        Yg yg;
        Object objI;
        C3994eg c3994eg;
        EnumC3912bh enumC3912bh;
        Object objH;
        az2 az2Var = az2.a;
        if (fyVar instanceof Yg) {
            yg = (Yg) fyVar;
            int i = yg.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yg.c = i - Integer.MIN_VALUE;
            } else {
                yg = new Yg(this, fyVar);
            }
        } else {
            yg = new Yg(this, fyVar);
        }
        Object obj = yg.a;
        dz dzVar = dz.a;
        int i2 = yg.c;
        if (i2 != 0) {
            if (i2 == 1) {
                wz2.a0(obj);
                Q5 q5 = (Q5) d.getValue();
                yg.c = 2;
                q5.getClass();
                c3994eg = q5.d;
                c3994eg.getClass();
                enumC3912bh = EnumC3912bh.STOPPED;
                if (c3994eg.d == EnumC3912bh.STARTED) {
                    c3994eg.d = enumC3912bh;
                    objH = c3994eg.h(yg);
                    if (objH != dzVar) {
                        objH = az2Var;
                    }
                } else {
                    objH = az2Var;
                }
                if (objH != dzVar) {
                    objH = az2Var;
                }
                if (objH == dzVar) {
                    return dzVar;
                }
            } else {
                if (i2 != 2) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj);
            }
            return az2Var;
        }
        wz2.a0(obj);
        if (e.compareAndSet(true, false)) {
            C4238n9 c4238n9 = (C4238n9) c.getValue();
            yg.c = 1;
            P7 p7 = c4238n9.d;
            p7.getClass();
            EnumC3912bh enumC3912bh2 = EnumC3912bh.STOPPED;
            if (p7.d == EnumC3912bh.STARTED) {
                p7.d = enumC3912bh2;
                objI = p7.i(yg);
                if (objI != dzVar) {
                    objI = az2Var;
                }
            } else {
                objI = az2Var;
            }
            if (objI != dzVar) {
                objI = az2Var;
            }
            if (objI != dzVar) {
                Q5 q6 = (Q5) d.getValue();
                yg.c = 2;
                q6.getClass();
                c3994eg = q6.d;
                c3994eg.getClass();
                enumC3912bh = EnumC3912bh.STOPPED;
                if (c3994eg.d == EnumC3912bh.STARTED) {
                    c3994eg.d = enumC3912bh;
                    objH = c3994eg.h(yg);
                    if (objH != dzVar) {
                        objH = az2Var;
                    }
                } else {
                    objH = az2Var;
                }
                if (objH != dzVar) {
                    objH = az2Var;
                }
                if (objH == dzVar) {
                }
            }
            return dzVar;
        }
        return az2Var;
    }

    public static final C4238n9 b() {
        return new C4238n9((Gh) b.getValue());
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(fy fyVar) {
        Xg xg;
        P7 p7;
        EnumC3912bh enumC3912bh;
        Object objC;
        C3994eg c3994eg;
        EnumC3912bh enumC3912bh2;
        Object objC2;
        Object obj = az2.a;
        if (fyVar instanceof Xg) {
            xg = (Xg) fyVar;
            int i = xg.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xg.c = i - Integer.MIN_VALUE;
            } else {
                xg = new Xg(this, fyVar);
            }
        } else {
            xg = new Xg(this, fyVar);
        }
        Object obj2 = xg.a;
        Object obj3 = dz.a;
        int i2 = xg.c;
        if (i2 == 0) {
            wz2.a0(obj2);
            AdConfig.PingsV2Config pingV2 = ((AdConfig) AbstractC4563z4.a.a(AdConfig.class)).getPingV2();
            if (pingV2.getEnabled() && e.compareAndSet(false, true)) {
                Gh gh = (Gh) b.getValue();
                xg.c = 1;
                if (a(gh, pingV2, xg) != obj3) {
                    C4238n9 c4238n9 = (C4238n9) c.getValue();
                    xg.c = 2;
                    p7 = c4238n9.d;
                    p7.getClass();
                    enumC3912bh = EnumC3912bh.STARTED;
                    if (p7.d == EnumC3912bh.STOPPED) {
                        p7.d = enumC3912bh;
                        objC = p7.c(xg);
                        if (objC != obj3) {
                            objC = obj;
                        }
                    } else {
                        objC = obj;
                    }
                    if (objC != obj3) {
                        objC = obj;
                    }
                    if (objC != obj3) {
                        Q5 q5 = (Q5) d.getValue();
                        xg.c = 3;
                        c3994eg = q5.d;
                        c3994eg.getClass();
                        enumC3912bh2 = EnumC3912bh.STARTED;
                        if (c3994eg.d == EnumC3912bh.STOPPED) {
                            c3994eg.d = enumC3912bh2;
                            objC2 = c3994eg.c(xg);
                            if (objC2 != obj3) {
                                objC2 = obj;
                            }
                        } else {
                            objC2 = obj;
                        }
                        if (objC2 != obj3) {
                            objC2 = obj;
                        }
                        if (objC2 == obj3) {
                        }
                    }
                }
                return obj3;
            }
            return obj;
        }
        if (i2 == 1) {
            wz2.a0(obj2);
            C4238n9 c4238n10 = (C4238n9) c.getValue();
            xg.c = 2;
            p7 = c4238n10.d;
            p7.getClass();
            enumC3912bh = EnumC3912bh.STARTED;
            if (p7.d == EnumC3912bh.STOPPED) {
                p7.d = enumC3912bh;
                objC = p7.c(xg);
                if (objC != obj3) {
                    objC = obj;
                }
            } else {
                objC = obj;
            }
            if (objC != obj3) {
                objC = obj;
            }
            if (objC != obj3) {
                Q5 q6 = (Q5) d.getValue();
                xg.c = 3;
                c3994eg = q6.d;
                c3994eg.getClass();
                enumC3912bh2 = EnumC3912bh.STARTED;
                if (c3994eg.d == EnumC3912bh.STOPPED) {
                    c3994eg.d = enumC3912bh2;
                    objC2 = c3994eg.c(xg);
                    if (objC2 != obj3) {
                        objC2 = obj;
                    }
                } else {
                    objC2 = obj;
                }
                if (objC2 != obj3) {
                    objC2 = obj;
                }
                if (objC2 == obj3) {
                }
            }
            return obj3;
        }
        if (i2 == 2) {
            wz2.a0(obj2);
            Q5 q7 = (Q5) d.getValue();
            xg.c = 3;
            c3994eg = q7.d;
            c3994eg.getClass();
            enumC3912bh2 = EnumC3912bh.STARTED;
            if (c3994eg.d == EnumC3912bh.STOPPED) {
                c3994eg.d = enumC3912bh2;
                objC2 = c3994eg.c(xg);
                if (objC2 != obj3) {
                    objC2 = obj;
                }
            } else {
                objC2 = obj;
            }
            if (objC2 != obj3) {
                objC2 = obj;
            }
            if (objC2 == obj3) {
                return obj3;
            }
        } else {
            if (i2 != 3) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(obj2);
        }
        return obj;
    }

    public static final Q5 a() {
        return new Q5((Gh) b.getValue());
    }
}
