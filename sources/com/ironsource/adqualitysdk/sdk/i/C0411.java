package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ƭ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0411 extends AbstractC0821 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0396 f844;

    public C0411(C0396 c0396) {
        this.f844 = c0396;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0821, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        AbstractC4631n.m405(new C0430(this));
    }
}
