package com.google.unity.mediation.liftoffmonetize;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.vungle.mediation.VungleAdapter;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class VungleUnityRewardedVideoExtrasBuilder extends VungleUnityExtrasBuilder {
    @Override // com.google.unity.ads.AdNetworkExtras
    @NonNull
    public Class<? extends MediationExtrasReceiver> getAdapterClass() {
        return VungleAdapter.class;
    }

    @Override // com.google.unity.mediation.liftoffmonetize.VungleUnityExtrasBuilder, com.google.unity.ads.AdNetworkExtras
    public /* bridge */ /* synthetic */ Bundle buildExtras(HashMap map) {
        return super.buildExtras(map);
    }
}
