package io.p071bidmachine.ads.networks.gam;

import io.p071bidmachine.NetworkAdapter;
import io.p071bidmachine.NetworkConfig;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class GAMConfig extends NetworkConfig {
    @Override // io.p071bidmachine.NetworkConfig
    public final NetworkAdapter createNetworkAdapter() {
        return new GAMAdapter();
    }
}
