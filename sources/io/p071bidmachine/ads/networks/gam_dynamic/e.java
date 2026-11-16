package io.p071bidmachine.ads.networks.gam_dynamic;

import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.h50;
import defpackage.pv1;
import io.p071bidmachine.media3.common.util.q;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class e {
    public final String a;

    public static e a(q qVar) {
        String str;
        qVar.G(2);
        int iT = qVar.t();
        int i = iT >> 1;
        int iT2 = ((qVar.t() >> 3) & 31) | ((iT & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbP = h50.p(str);
        String str2 = UserDetailsUtils.UserDetailsLiterals.DOT;
        sbP.append(i < 10 ? ".0" : UserDetailsUtils.UserDetailsLiterals.DOT);
        sbP.append(i);
        if (iT2 < 10) {
            str2 = ".0";
        }
        return new e(pv1.l(iT2, str2, sbP));
    }

    public /* synthetic */ e(String str) {
        this.a = str;
    }
}
