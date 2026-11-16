package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3110jn {
    public static InterfaceC2737df A00(Context context, InterfaceC3194lC interfaceC3194lC) {
        return A01(context, interfaceC3194lC, null);
    }

    public static InterfaceC2737df A01(Context context, InterfaceC3194lC interfaceC3194lC, String str) {
        C2054Hh sdkContext = A09(context);
        InterfaceC2741dj interfaceC2741djA8n = interfaceC3194lC.A8n(sdkContext);
        if (interfaceC2741djA8n != null) {
            return str != null ? interfaceC2741djA8n.ADD(str) : interfaceC2741djA8n.ADC();
        }
        return new C2194Mx();
    }

    public static C2055Hi A02(Activity activity) {
        return new C2055Hi(activity, (InterfaceC3194lC) A0A(), A00(activity, A0A()));
    }

    public static C2055Hi A03(Context context) {
        return new C2055Hi(context, A0A(), new C2194Mx());
    }

    public static C2055Hi A04(Context context) {
        if (C3300mv.A0v(context)) {
            return new C2055Hi(context, A0A(), A00(context, A0A()));
        }
        return A03(context);
    }

    public static C2055Hi A05(Context context, String str) {
        InterfaceC2737df interfaceC2737dfA01 = A01(context, A0A(), str);
        interfaceC2737dfA01.AKl(1000);
        return new C2055Hi(context, A0A(), interfaceC2737dfA01);
    }

    public static C2055Hi A06(Context context, String str) {
        return new C2055Hi(context, A0A(), A01(context, A0A(), str));
    }

    public static C2055Hi A07(Context context, String str) {
        return new C2055Hi(context, A0A(), A01(context, A0A(), str));
    }

    public static C7D A08(Context context) {
        return new C7D(context, A0A(), A0A().A8n(A09(context)));
    }

    public static C2054Hh A09(Context context) {
        return new C2054Hh(context, A0A());
    }

    public static synchronized HG A0A() {
        return HG.A02();
    }
}
