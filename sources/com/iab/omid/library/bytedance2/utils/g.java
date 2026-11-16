package com.iab.omid.library.bytedance2.utils;

import android.text.TextUtils;
import com.iab.omid.library.bytedance2.Omid;
import com.iab.omid.library.bytedance2.adsession.CreativeType;
import com.iab.omid.library.bytedance2.adsession.ImpressionType;
import com.iab.omid.library.bytedance2.adsession.Owner;
import defpackage.e32;

/* JADX INFO: loaded from: classes9.dex */
public class g {
    public static void a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
        if (owner == Owner.NONE) {
            defpackage.d.r("Impression owner is none");
            return;
        }
        if (creativeType == CreativeType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            defpackage.d.r("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (impressionType == ImpressionType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            defpackage.d.r("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    public static void b(com.iab.omid.library.bytedance2.adsession.a aVar) {
        if (!aVar.g()) {
            return;
        }
        e32.i("AdSession is finished");
    }

    public static void c(com.iab.omid.library.bytedance2.adsession.a aVar) {
        if (!aVar.j()) {
            return;
        }
        e32.i("AdSession is started");
    }

    private static void d(com.iab.omid.library.bytedance2.adsession.a aVar) {
        if (aVar.j()) {
            return;
        }
        e32.i("AdSession is not started");
    }

    public static void e(com.iab.omid.library.bytedance2.adsession.a aVar) {
        if (aVar.h()) {
            return;
        }
        e32.i("Impression event is not expected from the Native AdSession");
    }

    public static void f(com.iab.omid.library.bytedance2.adsession.a aVar) {
        if (aVar.i()) {
            return;
        }
        e32.i("Cannot create MediaEvents for JavaScript AdSession");
    }

    public static void g(com.iab.omid.library.bytedance2.adsession.a aVar) {
        if (aVar.getAdSessionStatePublisher().c() == null) {
            return;
        }
        e32.i("AdEvents already exists for AdSession");
    }

    public static void h(com.iab.omid.library.bytedance2.adsession.a aVar) {
        if (aVar.getAdSessionStatePublisher().d() == null) {
            return;
        }
        e32.i("MediaEvents already exists for AdSession");
    }

    public static void a() {
        if (Omid.isActive()) {
            return;
        }
        e32.i("Method called before OM SDK activation");
    }

    public static void a(com.iab.omid.library.bytedance2.adsession.a aVar) {
        d(aVar);
        b(aVar);
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        defpackage.d.r(str);
    }

    public static void a(String str, int i, String str2) {
        if (str.length() <= i) {
            return;
        }
        defpackage.d.r(str2);
    }

    public static void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            defpackage.d.r(str2);
        }
    }
}
