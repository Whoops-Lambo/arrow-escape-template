package defpackage;

import android.content.Context;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.GDPR;
import com.chartboost.sdk.privacy.model.LGPD;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class gr extends zk1 {
    public final String d;
    public final a33 e;
    public final Context f;

    public gr(a33 a33Var, Context context) {
        super("Chartboost", a33Var, null);
        this.d = "Chartboost";
        this.e = a33Var;
        this.f = context;
    }

    public static void g(Context context, boolean z) {
        Chartboost.addDataUseConsent(context, new CCPA(z ? CCPA.CCPA_CONSENT.OPT_IN_SALE : CCPA.CCPA_CONSENT.OPT_OUT_SALE));
    }

    public static void h(Context context, boolean z) {
        Chartboost.addDataUseConsent(context, new GDPR(z ? GDPR.GDPR_CONSENT.BEHAVIORAL : GDPR.GDPR_CONSENT.NON_BEHAVIORAL));
    }

    public static void i(Context context, boolean z) {
        Chartboost.addDataUseConsent(context, new LGPD(z));
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
            Class.forName("com.chartboost.sdk.Chartboost");
            Context context = this.f;
            context.getClass();
            if (y33Var == y33.b) {
                g(context, z);
                return true;
            }
            h(context, z);
            i(context, z);
            return true;
        } catch (Throwable th) {
            f(th);
            return false;
        }
    }
}
