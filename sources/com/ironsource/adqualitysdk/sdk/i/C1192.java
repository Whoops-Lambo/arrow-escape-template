package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ףּ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1192 extends AbstractC0511 implements InterfaceC0649 {

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public C1201 f3589;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public boolean f3590;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public boolean f3591;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public boolean f3592;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public boolean f3593;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public Class f3594;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public C0916 f3595;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static final String f3588 = StringFog.decrypt("/zTcEtDVjO7/M+AayNiU8sw=\n", "vleoe6a8+Jc=\n");

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    public static final String f3587 = StringFog.decrypt("5utXolC5YFL260/+Wq4hXeH1T+1VontF9uBRokqvZBLE4GnkVrxh\n", "hYQ6jDnLDzw=\n");

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0511
    /* JADX INFO: renamed from: ﾇ */
    public final void mo398(Object obj, ArrayList arrayList) {
        C1201 c1201 = this.f3589;
        AbstractC4634o0.m422((Activity) obj, WebView.class, c1201.f3633, c1201.f3634, false, false, null, c1201.f1258, arrayList);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C1266 c1266 = new C1266(this, activity, bundle);
        if (this.f3589.f3631) {
            AbstractC4631n.m401(c1266);
        } else {
            AbstractC4631n.m403(c1266);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C1307 c1307 = new C1307(this, activity);
        if (this.f3589.f3631) {
            AbstractC4631n.m401(c1307);
        } else {
            AbstractC4631n.m403(c1307);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        AbstractC4631n.m405(new C1222(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C1226 c1226 = new C1226(this, activity);
        if (this.f3589.f3631) {
            AbstractC4631n.m401(c1226);
        } else {
            AbstractC4631n.m403(c1226);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C1225 c1225 = new C1225(this, activity, bundle);
        if (this.f3589.f3631) {
            AbstractC4631n.m401(c1225);
        } else {
            AbstractC4631n.m403(c1225);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        AbstractC4631n.m405(new C1238(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        C1213 c1213 = new C1213(this, activity);
        if (this.f3589.f3631) {
            AbstractC4631n.m401(c1213);
        } else {
            AbstractC4631n.m403(c1213);
        }
    }

    public C1192(JSONObject jSONObject, C0620 c0620) {
        super(c0620);
        this.f3593 = false;
        this.f3592 = false;
        this.f3591 = false;
        this.f3590 = false;
        C1201 c1201 = new C1201(jSONObject);
        this.f1148 = c1201;
        this.f3589 = c1201;
        AbstractC4631n.m402(new C1284(this));
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m872(C1192 c1192, Activity activity) {
        c1192.getClass();
        Class<?> cls = activity.getClass();
        Class cls2 = c1192.f3594;
        if (cls2 != null) {
            if (c1192.f3589.f3632) {
                return cls2.equals(cls);
            }
            return cls2.isAssignableFrom(cls);
        }
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0511
    /* JADX INFO: renamed from: ﾇ */
    public final View mo396(Object obj) {
        return ((Activity) obj).findViewById(R.id.content);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0649
    /* JADX INFO: renamed from: ﾇ */
    public final void mo471(Activity activity) {
        AbstractC4631n.m405(new C1282(this, activity));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0511
    /* JADX INFO: renamed from: ﾇ */
    public final M0 mo397() {
        return new N0();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0511
    /* JADX INFO: renamed from: ﾒ */
    public final InterfaceC0696 mo399() {
        return this;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0649
    /* JADX INFO: renamed from: ﾒ */
    public final void mo472(Activity activity) {
        AbstractC4631n.m405(new C1283(this, activity));
    }
}
