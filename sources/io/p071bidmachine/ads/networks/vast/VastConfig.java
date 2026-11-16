package io.p071bidmachine.ads.networks.vast;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import io.p071bidmachine.NetworkAdapter;
import io.p071bidmachine.NetworkConfig;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/bidmachine/ads/networks/vast/VastConfig;", "Lio/bidmachine/NetworkConfig;", "<init>", "()V", "bidmachine-android-sdk_ba_3_8_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class VastConfig extends NetworkConfig {
    public VastConfig() {
        super(CreativeInfo.r, null);
    }

    @Override // io.p071bidmachine.NetworkConfig
    public final NetworkAdapter createNetworkAdapter() {
        return new VastAdapter();
    }
}
