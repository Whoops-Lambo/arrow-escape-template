package com.ironsource.environment;

import android.app.Activity;
import android.content.Context;
import com.ironsource.Cf;
import com.ironsource.InterfaceC4736f4;
import com.ironsource.Pb;
import com.ironsource.ah;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class ContextProvider {
    private static volatile ContextProvider b;
    private InterfaceC4736f4 a = new Cf();

    public static ContextProvider getInstance() {
        if (b == null) {
            synchronized (ContextProvider.class) {
                try {
                    if (b == null) {
                        b = new ContextProvider();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public Context getActiveContext() {
        Activity activityA = this.a.a();
        return activityA != null ? activityA : this.a.b();
    }

    public Context getApplicationContext() {
        Context contextB = this.a.b();
        Activity activityA = this.a.a();
        return (contextB != null || activityA == null) ? contextB : activityA.getApplicationContext();
    }

    public Activity getCurrentActiveActivity() {
        return this.a.a();
    }

    public void updateActivity(Activity activity) {
        if (activity != null) {
            this.a.a(activity);
        }
    }

    public void updateAppContext(Context context) {
        if (context != null) {
            this.a.a(context);
        }
    }

    private ContextProvider() {
    }

    public void updateStrategyIfNeeded() {
        if (!Pb.k0().h().w()) {
            return;
        }
        this.a = new ah(this.a.a(), this.a.b());
    }
}
