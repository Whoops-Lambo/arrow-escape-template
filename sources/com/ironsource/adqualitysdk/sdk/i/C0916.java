package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᕪ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0916 extends AbstractC0821 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1199 f2425;

    public C0916(C1199 c1199) {
        this.f2425 = c1199;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0821, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C1199 c1199 = this.f2425;
        c1199.m884(AbstractC1219.f3677, C1199.m873(c1199, activity));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0821, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C1199 c1199 = this.f2425;
        c1199.m884(AbstractC1219.f3676, C1199.m873(c1199, activity));
    }
}
