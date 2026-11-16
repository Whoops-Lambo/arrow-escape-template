package com.google.games.bridge;

import com.google.android.gms.nearby.connection.DiscoveredEndpointInfo;
import com.google.android.gms.nearby.connection.EndpointDiscoveryCallback;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class EndpointDiscoveryCallbackProxy extends EndpointDiscoveryCallback {
    private Callback callback;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface Callback {
        void onEndpointFound(String str, DiscoveredEndpointInfo discoveredEndpointInfo);

        void onEndpointLost(String str);
    }

    @Override // com.google.android.gms.nearby.connection.EndpointDiscoveryCallback
    public void onEndpointFound(String str, DiscoveredEndpointInfo discoveredEndpointInfo) {
        this.callback.onEndpointFound(str, discoveredEndpointInfo);
    }

    @Override // com.google.android.gms.nearby.connection.EndpointDiscoveryCallback
    public void onEndpointLost(String str) {
        this.callback.onEndpointLost(str);
    }

    public EndpointDiscoveryCallbackProxy(Callback callback) {
        this.callback = callback;
    }
}
