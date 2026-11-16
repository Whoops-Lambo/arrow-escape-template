package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.IronSourceNetwork;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.sc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4976sc implements InterfaceC4958rc {
    @Override // com.ironsource.InterfaceC4958rc
    public void a(@NotNull R9 r9) {
        r9.getClass();
        try {
            IronSourceNetwork.destroyAd(r9);
        } catch (Exception e) {
            C4950r4.d().a(e);
            IronLog.ADAPTER_API.verbose("destroy ad with identifier: " + r9.e() + " failed. error: " + e.getMessage());
        }
    }
}
