package com.fyber.inneractive.sdk.activities;

import android.window.OnBackInvokedCallback;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class b implements OnBackInvokedCallback {
    public final /* synthetic */ InneractiveBaseActivity a;

    public b(InneractiveBaseActivity inneractiveBaseActivity) {
        this.a = inneractiveBaseActivity;
    }

    public final void onBackInvoked() {
        this.a.onBackPressed();
    }
}
