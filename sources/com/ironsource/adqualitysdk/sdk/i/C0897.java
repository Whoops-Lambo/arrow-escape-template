package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᔬ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0897 extends AbstractC0821 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0841 f2397;

    public C0897(C0841 c0841) {
        this.f2397 = c0841;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0821, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f2397.f2227.removeCallbacksAndMessages(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0821, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f2397.f2227.removeCallbacksAndMessages(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0821, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C0841 c0841 = this.f2397;
        c0841.f2227.postDelayed(new C0855(c0841, activity), 500L);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0821, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C0841 c0841 = this.f2397;
        if (c0841.f2229) {
            c0841.f2229 = false;
            c0841.f2228.mo566(activity);
        }
        c0841.f2227.removeCallbacksAndMessages(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0821, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f2397.f2227.removeCallbacksAndMessages(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0821, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f2397.f2227.removeCallbacksAndMessages(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0821, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f2397.f2227.removeCallbacksAndMessages(null);
    }
}
