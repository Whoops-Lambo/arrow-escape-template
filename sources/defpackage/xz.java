package defpackage;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import com.singular.sdk.Singular;
import com.unity3d.services.core.fid.Constants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class xz extends zk1 {
    public final /* synthetic */ int d;
    public final String e;
    public final a33 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz(a33 a33Var, int i) {
        super("Crashlytics", a33Var, null);
        this.d = i;
        switch (i) {
            case 1:
                super("Iron Source", a33Var, null);
                this.e = "Iron Source";
                this.f = a33Var;
                break;
            case 2:
                super(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_SINGULAR, a33Var, null);
                this.e = MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_SINGULAR;
                this.f = a33Var;
                break;
            default:
                this.e = "Crashlytics";
                this.f = a33Var;
                break;
        }
    }

    @Override // defpackage.zk1
    public final boolean a(boolean z, y33 y33Var) {
        switch (this.d) {
            case 0:
                y33Var.getClass();
                FirebaseCrashlytics firebaseCrashlytics = null;
                try {
                    Object objInvoke = FirebaseCrashlytics.class.getMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                    if (objInvoke instanceof FirebaseCrashlytics) {
                        firebaseCrashlytics = (FirebaseCrashlytics) objInvoke;
                    }
                } catch (Throwable unused) {
                }
                if (firebaseCrashlytics == null) {
                    return false;
                }
                try {
                    firebaseCrashlytics.setCrashlyticsCollectionEnabled(z);
                    return true;
                } catch (Throwable th) {
                    f(th);
                    return false;
                }
            case 1:
                return g(z, y33Var);
            default:
                y33Var.getClass();
                try {
                    Singular.limitDataSharing(!z);
                    if (z) {
                        Singular.resumeAllTracking();
                        Singular.trackingOptIn();
                    } else {
                        Singular.stopAllTracking();
                    }
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
            case 1:
                break;
        }
        return this.f;
    }

    @Override // defpackage.zk1
    public final String d() {
        switch (this.d) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.e;
    }

    private final boolean g(boolean z, y33 y33Var) {
        y33Var.getClass();
        try {
            if (y33Var == y33.b) {
                IronSource.setMetaData(a.a, String.valueOf(!z));
            } else {
                IronSource.setConsent(z);
            }
            return true;
        } catch (Throwable th) {
            f(th);
            return false;
        }
    }
}
