package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Md, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2174Md extends BroadcastReceiver {
    public final /* synthetic */ C2175Me A00;

    public C2174Md(C2175Me c2175Me) {
        this.A00 = c2175Me;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int iA00 = C2175Me.A00(context);
        if (N1.A02 >= 31 && iA00 == 5) {
            C2172Mb.A02(context, this.A00);
        } else {
            this.A00.A07(iA00);
        }
    }
}
