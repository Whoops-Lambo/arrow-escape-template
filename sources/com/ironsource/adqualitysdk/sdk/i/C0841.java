package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᒹ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0841 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final InterfaceC0675 f2228;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public boolean f2229 = false;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Handler f2227 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public C0897 f2226 = new C0897(this);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m627() {
        this.f2227.removeCallbacksAndMessages(null);
        if (this.f2226 != null) {
            AbstractC1227 abstractC1227M885 = AbstractC1227.m885();
            C0897 c0897 = this.f2226;
            synchronized (abstractC1227M885) {
                abstractC1227M885.f3730.remove(c0897);
            }
            this.f2226 = null;
        }
    }

    public C0841(InterfaceC0675 interfaceC0675) {
        this.f2228 = interfaceC0675;
        AbstractC1227 abstractC1227M885 = AbstractC1227.m885();
        C0897 c0897 = this.f2226;
        synchronized (abstractC1227M885) {
            abstractC1227M885.f3730.add(c0897);
        }
    }
}
