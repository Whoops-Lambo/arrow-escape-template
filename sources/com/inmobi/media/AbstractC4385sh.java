package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.singular.sdk.internal.Constants;
import defpackage.az2;
import defpackage.dt1;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.qh1;
import defpackage.s71;
import defpackage.wz2;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.sh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4385sh {
    public final Gh a;
    public final ConcurrentHashMap b;
    public final C4161kg c;

    public static void b(C3940ch c3940ch, InterfaceC4274oh interfaceC4274oh) {
        String str = c3940ch.a.a;
        Objects.toString(interfaceC4274oh);
        Vg vg = c3940ch.a;
        if (interfaceC4274oh == null) {
            a(vg);
        } else {
            ((C4246nh) interfaceC4274oh).a(vg, c3940ch.b, c3940ch.d);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object a(C3940ch c3940ch, InterfaceC4274oh interfaceC4274oh, fy fyVar) {
        C4330qh c4330qh;
        dt1 dt1Var;
        InterfaceC4274oh interfaceC4274oh2;
        Vg vg;
        InterfaceC4274oh interfaceC4274oh3;
        Vg vg2;
        InterfaceC4274oh interfaceC4274oh4;
        C3940ch c3940ch2 = c3940ch;
        if (fyVar instanceof C4330qh) {
            c4330qh = (C4330qh) fyVar;
            int i = c4330qh.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4330qh.f = i - Integer.MIN_VALUE;
            } else {
                c4330qh = new C4330qh(this, fyVar);
            }
        } else {
            c4330qh = new C4330qh(this, fyVar);
        }
        C4330qh c4330qh2 = c4330qh;
        Object obj = c4330qh2.d;
        int i2 = c4330qh2.f;
        az2 az2Var = az2.a;
        if (i2 != 0) {
            if (i2 == 1) {
                InterfaceC4274oh interfaceC4274oh5 = c4330qh2.b;
                c3940ch2 = c4330qh2.a;
                wz2.a0(obj);
                interfaceC4274oh4 = interfaceC4274oh5;
                a(c3940ch2.b, "Redirect URL is malformed", (short) 2258, c3940ch2.a, c3940ch2.d, interfaceC4274oh4);
                return az2Var;
            }
            if (i2 == 2) {
                Vg vg3 = c4330qh2.c;
                InterfaceC4274oh interfaceC4274oh6 = c4330qh2.b;
                C3940ch c3940ch3 = c4330qh2.a;
                wz2.a0(obj);
                vg2 = vg3;
                interfaceC4274oh3 = interfaceC4274oh6;
                c3940ch2 = c3940ch3;
                int i3 = c3940ch2.b;
                a(i3, c3940ch2.c, (short) i3, vg2, c3940ch2.d, interfaceC4274oh3);
                return az2Var;
            }
            if (i2 != 3) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Vg vg4 = c4330qh2.c;
            InterfaceC4274oh interfaceC4274oh7 = c4330qh2.b;
            C3940ch c3940ch4 = c4330qh2.a;
            wz2.a0(obj);
            vg = vg4;
            interfaceC4274oh2 = interfaceC4274oh7;
            c3940ch2 = c3940ch4;
            int i4 = c3940ch2.b;
            a(i4, c3940ch2.c, (short) i4, vg, c3940ch2.d, interfaceC4274oh2);
            return az2Var;
        }
        wz2.a0(obj);
        Vg vg5 = c3940ch2.a;
        String str = vg5.a;
        int i5 = c3940ch2.b;
        C4565z6 c4565z6 = B6.b;
        dz dzVar = dz.a;
        if (i5 == 178) {
            Gh gh = this.a;
            c4330qh2.a = c3940ch2;
            c4330qh2.b = interfaceC4274oh;
            c4330qh2.f = 1;
            Object objA = gh.a.a("pings", "id=?", new String[]{vg5.b}, c4330qh2);
            if (objA != dzVar) {
                objA = az2Var;
            }
            if (objA != dzVar) {
                interfaceC4274oh4 = interfaceC4274oh;
                a(c3940ch2.b, "Redirect URL is malformed", (short) 2258, c3940ch2.a, c3940ch2.d, interfaceC4274oh4);
                return az2Var;
            }
        } else {
            int i6 = vg5.g + 1;
            if (i6 > (s71.b(vg5.e, Constants.HIGH) ? a().getRetryConfig().getHigh().getMaxRetries() : a().getRetryConfig().getNormal().getMaxRetries())) {
                Gh gh2 = this.a;
                c4330qh2.a = c3940ch2;
                c4330qh2.b = interfaceC4274oh;
                c4330qh2.c = vg5;
                c4330qh2.f = 2;
                Object objA2 = gh2.a.a("pings", "id=?", new String[]{vg5.b}, c4330qh2);
                if (objA2 != dzVar) {
                    objA2 = az2Var;
                }
                if (objA2 != dzVar) {
                    interfaceC4274oh3 = interfaceC4274oh;
                    vg2 = vg5;
                    int i7 = c3940ch2.b;
                    a(i7, c3940ch2.c, (short) i7, vg2, c3940ch2.d, interfaceC4274oh3);
                    return az2Var;
                }
            } else {
                if (s71.b(vg5.e, Constants.HIGH)) {
                    dt1Var = new dt1(new Long(a().getRetryConfig().getHigh().getRetryInterval()), new Double(a().getRetryConfig().getHigh().getFactor()));
                } else {
                    dt1Var = new dt1(new Long(a().getRetryConfig().getNormal().getRetryInterval()), new Double(a().getRetryConfig().getNormal().getFactor()));
                }
                Long l = new Long(System.currentTimeMillis() + ((long) (Math.pow(((Number) dt1Var.b).doubleValue(), i6) * ((Number) dt1Var.a).longValue() * 1000.0d)));
                String str2 = vg5.a;
                String str3 = vg5.b;
                Map map = vg5.c;
                boolean z = vg5.d;
                String str4 = vg5.e;
                boolean z2 = vg5.f;
                String str5 = vg5.h;
                long j = vg5.i;
                Ij ij = vg5.k;
                String str6 = vg5.l;
                str2.getClass();
                str3.getClass();
                map.getClass();
                str4.getClass();
                str5.getClass();
                str6.getClass();
                Vg vg6 = new Vg(str2, str3, map, z, str4, z2, i6, str5, j, l, ij, str6);
                vg6.l = "failed";
                Gh gh3 = this.a;
                c4330qh2.a = c3940ch2;
                c4330qh2.b = interfaceC4274oh;
                c4330qh2.c = vg5;
                c4330qh2.f = 3;
                Object objA3 = S9.a(gh3.a, "pings", Hh.a(vg6), "id=?", new String[]{str3}, c4330qh2, 16);
                if (objA3 != dzVar) {
                    objA3 = az2Var;
                }
                if (objA3 != dzVar) {
                    interfaceC4274oh2 = interfaceC4274oh;
                    vg = vg5;
                    int i8 = c3940ch2.b;
                    a(i8, c3940ch2.c, (short) i8, vg, c3940ch2.d, interfaceC4274oh2);
                    return az2Var;
                }
            }
        }
        return dzVar;
    }

    public AbstractC4385sh(Gh gh) {
        gh.getClass();
        this.a = gh;
        this.b = new ConcurrentHashMap();
        this.c = new C4161kg(a());
    }

    public static void a(Vg vg) {
        Ij ij = vg.k;
        if (ij != null) {
            new Oj(ij).a(vg.g, System.currentTimeMillis() - vg.i, vg.e);
            return;
        }
        C4137jk c4137jk = AbstractC4413th.a;
        AbstractC4413th.a("PingSuccess", qh1.Z(new dt1("trigger", defpackage.nj.k(vg.g, vg.e, "_")), new dt1("retryCount", Integer.valueOf(vg.g))));
    }

    public static AdConfig.PingsV2Config a() {
        return ((AdConfig) AbstractC4563z4.a.a(AdConfig.class)).getPingV2();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Vg vg, fy fyVar) {
        C4357rh c4357rh;
        if (fyVar instanceof C4357rh) {
            c4357rh = (C4357rh) fyVar;
            int i = c4357rh.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4357rh.c = i - Integer.MIN_VALUE;
            } else {
                c4357rh = new C4357rh(this, fyVar);
            }
        } else {
            c4357rh = new C4357rh(this, fyVar);
        }
        Object objB = c4357rh.a;
        int i2 = c4357rh.c;
        if (i2 == 0) {
            wz2.a0(objB);
            Gh gh = this.a;
            int maxEntries = a().getMaxEntries();
            c4357rh.c = 1;
            objB = gh.b(vg, maxEntries, c4357rh);
            dz dzVar = dz.a;
            if (objB == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objB);
        }
        AbstractC3878ab abstractC3878ab = (AbstractC3878ab) objB;
        if (abstractC3878ab instanceof Xa) {
            return EnumC4302ph.RESERVED;
        }
        if (abstractC3878ab instanceof Ya) {
            Ya ya = (Ya) abstractC3878ab;
            a(ya.b, (short) (s71.b(ya.a.e, Constants.HIGH) ? 2259 : 2260));
            return EnumC4302ph.RESERVED;
        }
        if (abstractC3878ab instanceof Wa) {
            a(((Wa) abstractC3878ab).a, (short) 2371);
            return EnumC4302ph.DUPLICATE;
        }
        if (abstractC3878ab instanceof Za) {
            C4137jk c4137jk = AbstractC4413th.a;
            AbstractC4413th.a("PingDBMaxLimitReached", new LinkedHashMap());
            return EnumC4302ph.REJECTED;
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.b();
        return null;
    }

    public static void a(int i, String str, short s, Vg vg, long j, InterfaceC4274oh interfaceC4274oh) {
        vg.getClass();
        Objects.toString(interfaceC4274oh);
        if (interfaceC4274oh != null) {
            ((C4246nh) interfaceC4274oh).a(vg, i, str, vg.g, j, s);
        } else {
            a(vg, s);
        }
    }

    public static void a(C3940ch c3940ch, InterfaceC4274oh interfaceC4274oh) {
        c3940ch.getClass();
        if (AbstractC4134jh.a(c3940ch)) {
            b(c3940ch, interfaceC4274oh);
            return;
        }
        Vg vg = c3940ch.a;
        String str = vg.a;
        int i = c3940ch.b;
        String str2 = c3940ch.c;
        C4565z6 c4565z6 = B6.b;
        if (i == 178) {
            str2 = "Redirect URL is malformed";
        }
        a(i, str2, i == 178 ? (short) 2258 : (short) i, vg, c3940ch.d, interfaceC4274oh);
    }

    public static void a(Vg vg, short s) {
        Ij ij = vg.k;
        if (ij != null) {
            new Oj(ij).a(vg.g, vg.e, s);
        } else {
            C4137jk c4137jk = AbstractC4413th.a;
            AbstractC4413th.a("PingFailed", qh1.Z(new dt1("trigger", defpackage.nj.k(vg.g, vg.e, "_")), new dt1(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s))));
        }
    }
}
