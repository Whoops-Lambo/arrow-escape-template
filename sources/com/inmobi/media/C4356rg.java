package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.az2;
import defpackage.ba0;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.tb5;
import defpackage.wz2;
import defpackage.xc0;
import defpackage.y80;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.inmobi.media.rg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4356rg {
    public static final C4356rg a = new C4356rg();
    public static final AtomicInteger b = new AtomicInteger(0);
    public static C4440ug c;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(fy fyVar) throws Throwable {
        C4245ng c4245ng;
        AdConfig.OmidConfig omidConfig;
        Context context;
        if (fyVar instanceof C4245ng) {
            c4245ng = (C4245ng) fyVar;
            int i = c4245ng.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4245ng.e = i - Integer.MIN_VALUE;
            } else {
                c4245ng = new C4245ng(this, fyVar);
            }
        } else {
            c4245ng = new C4245ng(this, fyVar);
        }
        Object obj = c4245ng.c;
        int i2 = c4245ng.e;
        az2 az2Var = az2.a;
        if (i2 == 0) {
            wz2.a0(obj);
            AdConfig.OmidConfig omidConfig2 = ((AdConfig) AbstractC4563z4.a.a(AdConfig.class)).getViewability().getOmidConfig();
            Context context2 = AbstractC4221mk.a;
            if (context2 != null) {
                c4245ng.a = omidConfig2;
                c4245ng.b = context2;
                c4245ng.e = 1;
                Object objA = a(context2, omidConfig2, c4245ng);
                Object obj2 = dz.a;
                if (objA == obj2) {
                    return obj2;
                }
                omidConfig = omidConfig2;
                obj = objA;
                context = context2;
            }
            return az2Var;
        }
        if (i2 != 1) {
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        context = c4245ng.b;
        omidConfig = c4245ng.a;
        wz2.a0(obj);
        if (!((Boolean) obj).booleanValue()) {
            b.set(2);
            tb5.t(AbstractC4211ma.d, null, null, new C4273og(omidConfig, context, null), 3);
            return az2Var;
        }
        return az2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Context context, AdConfig.OmidConfig omidConfig, fy fyVar) throws Throwable {
        C4329qg c4329qg;
        if (fyVar instanceof C4329qg) {
            c4329qg = (C4329qg) fyVar;
            int i = c4329qg.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4329qg.c = i - Integer.MIN_VALUE;
            } else {
                c4329qg = new C4329qg(this, fyVar);
            }
        } else {
            c4329qg = new C4329qg(this, fyVar);
        }
        Object objE = c4329qg.a;
        int i2 = c4329qg.c;
        boolean z = true;
        if (i2 == 0) {
            wz2.a0(objE);
            AtomicInteger atomicInteger = b;
            if (atomicInteger.get() != 1 && atomicInteger.get() != 2) {
                C4440ug c4440ug = c;
                if (c4440ug == null) {
                    c4440ug = new C4440ug(context);
                    c = c4440ug;
                }
                c4329qg.c = 1;
                ba0 ba0Var = xc0.a;
                objE = tb5.E(y80.c, new C4384sg(c4440ug, omidConfig, null), c4329qg);
                dz dzVar = dz.a;
                if (objE == dzVar) {
                    return dzVar;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        wz2.a0(objE);
        if (((Boolean) objE).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
