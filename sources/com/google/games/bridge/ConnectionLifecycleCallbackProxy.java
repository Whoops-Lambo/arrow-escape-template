package com.google.games.bridge;

import com.google.android.gms.nearby.connection.ConnectionInfo;
import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import com.google.android.gms.nearby.connection.ConnectionResolution;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class ConnectionLifecycleCallbackProxy extends ConnectionLifecycleCallback {
    private Callback callback;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface Callback {
        void onConnectionInitiated(String str, ConnectionInfo connectionInfo);

        void onConnectionResult(String str, ConnectionResolution connectionResolution);

        void onDisconnected(String str);
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionLifecycleCallback
    public void onConnectionInitiated(String str, ConnectionInfo connectionInfo) {
        this.callback.onConnectionInitiated(str, connectionInfo);
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionLifecycleCallback
    public void onConnectionResult(String str, ConnectionResolution connectionResolution) {
        this.callback.onConnectionResult(str, connectionResolution);
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionLifecycleCallback
    public void onDisconnected(String str) {
        this.callback.onDisconnected(str);
    }

    public ConnectionLifecycleCallbackProxy(Callback callback) {
        this.callback = callback;
    }
}
