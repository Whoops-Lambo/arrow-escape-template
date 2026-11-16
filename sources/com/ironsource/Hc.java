package com.ironsource;

import android.app.Activity;
import com.ironsource.sdk.IronSourceNetwork;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Hc implements Gc {
    @Override // com.ironsource.Gc
    public void a(@NotNull Activity activity, @NotNull R9 r9, @NotNull Map<String, String> map) throws Exception {
        activity.getClass();
        r9.getClass();
        map.getClass();
        IronSourceNetwork.showAd(activity, r9, map);
    }

    @Override // com.ironsource.Gc
    public boolean a(@NotNull R9 r9) {
        r9.getClass();
        return IronSourceNetwork.isAdAvailableForInstance(r9);
    }
}
