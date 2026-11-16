package defpackage;

import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerLib;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class a8 extends zk1 {
    public final String d;
    public final a33 e;

    public a8(a33 a33Var) {
        super(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APPSFLYER, a33Var, null);
        this.d = MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APPSFLYER;
        this.e = a33Var;
    }

    @Override // defpackage.zk1
    public final a33 c() {
        return this.e;
    }

    @Override // defpackage.zk1
    public final String d() {
        return this.d;
    }

    @Override // defpackage.zk1
    public final boolean a(boolean z, y33 y33Var) {
        y33Var.getClass();
        try {
            Class.forName("com.appsflyer.AppsFlyerLib");
            int iOrdinal = y33Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        AppsFlyerLib.getInstance().enableTCFDataCollection(true);
                    }
                } else {
                    AppsFlyerLib.getInstance().setConsentData(new AppsFlyerConsent(Boolean.FALSE, Boolean.valueOf(z), Boolean.valueOf(z), Boolean.valueOf(z)));
                }
            } else {
                AppsFlyerLib.getInstance().setConsentData(new AppsFlyerConsent(Boolean.TRUE, Boolean.valueOf(z), Boolean.valueOf(z), Boolean.valueOf(z)));
            }
            return true;
        } catch (Throwable th) {
            f(th);
            return false;
        }
    }
}
