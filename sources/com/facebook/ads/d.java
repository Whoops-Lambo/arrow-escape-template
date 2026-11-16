package com.facebook.ads;

import android.window.OnBackInvokedCallback;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements OnBackInvokedCallback {
    public final /* synthetic */ AudienceNetworkActivity a;

    public final void onBackInvoked() {
        this.a.onBackPressed();
    }

    public d(AudienceNetworkActivity audienceNetworkActivity) {
        this.a = audienceNetworkActivity;
    }
}
