package defpackage;

import com.usercentrics.sdk.UsercentricsDomains;
import io.p071bidmachine.ads.networks.adaptiverendering.e;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class yg1 {
    public final lq1 a;
    public final UsercentricsDomains b;

    public final String a() {
        UsercentricsDomains usercentricsDomains = this.b;
        if (usercentricsDomains.a()) {
            return usercentricsDomains.b;
        }
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0) {
            return "https://api.usercentrics.eu";
        }
        if (iOrdinal == 1) {
            return "https://config.eu.usercentrics.eu";
        }
        e.b();
        return null;
    }

    public yg1(lq1 lq1Var, UsercentricsDomains usercentricsDomains) {
        lq1Var.getClass();
        this.a = lq1Var;
        this.b = usercentricsDomains;
    }
}
