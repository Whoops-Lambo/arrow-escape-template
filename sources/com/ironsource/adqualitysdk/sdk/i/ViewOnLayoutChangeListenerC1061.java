package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import android.view.ViewGroup;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ṿ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class ViewOnLayoutChangeListenerC1061 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0992 f3081;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f3082;

    public ViewOnLayoutChangeListenerC1061(C0992 c0992, ViewGroup viewGroup) {
        this.f3081 = c0992;
        this.f3082 = viewGroup;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        C1328 c1328M948 = C1328.m948();
        synchronized (c1328M948) {
            z = c1328M948.f3963;
        }
        if (!z) {
            try {
                C0992.m745(this.f3081, this.f3082, this);
            } catch (Throwable th) {
                AbstractC1290.m905(StringFog.decrypt("m12pd/B86dapUq5Z+GPJ3LJUtEb0YsvQv1Q=\n", "3DHGFZEQvbk=\n"), StringFog.decrypt("6IhfAG+s9CSNlUMjfPXyP9m5RQ5z6/g=\n", "rfotbx2MnUo=\n"), th, false);
            }
        }
    }
}
