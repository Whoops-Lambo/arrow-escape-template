package defpackage;

import android.content.Context;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.unity3d.ads.metadata.MetaData;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class x7 extends zk1 {
    public final /* synthetic */ int d;
    public final String e;
    public final a33 f;
    public final Context g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(a33 a33Var, Context context, int i) {
        super("App Lovin", a33Var, null);
        this.d = i;
        switch (i) {
            case 1:
                super("Unity Ads", a33Var, null);
                this.e = "Unity Ads";
                this.f = a33Var;
                this.g = context;
                break;
            default:
                this.e = "App Lovin";
                this.f = a33Var;
                this.g = context;
                break;
        }
    }

    @Override // defpackage.zk1
    public final boolean a(boolean z, y33 y33Var) {
        int i = this.d;
        boolean z2 = false;
        y33 y33Var2 = y33.b;
        Context context = this.g;
        y33Var.getClass();
        switch (i) {
            case 0:
                try {
                    if (y33Var == y33Var2) {
                        AppLovinPrivacySettings.setDoNotSell(!z, context);
                    } else {
                        AppLovinPrivacySettings.setHasUserConsent(z, context);
                    }
                    z2 = true;
                    return true;
                } catch (Throwable th) {
                    f(th);
                    return z2;
                }
            default:
                try {
                    MetaData metaData = new MetaData(context);
                    metaData.set(y33Var == y33Var2 ? "privacy.consent" : "gdpr.consent", Boolean.valueOf(z));
                    metaData.commit();
                    return true;
                } catch (Throwable th2) {
                    f(th2);
                    return false;
                }
        }
    }

    @Override // defpackage.zk1
    public final a33 c() {
        switch (this.d) {
            case 0:
                break;
        }
        return this.f;
    }

    @Override // defpackage.zk1
    public final String d() {
        switch (this.d) {
            case 0:
                break;
        }
        return this.e;
    }
}
