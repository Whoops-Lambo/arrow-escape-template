package com.inmobi.media;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Wl extends ConnectivityManager.NetworkCallback {
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        network.getClass();
        ConcurrentHashMap concurrentHashMap = Xl.a;
        super.onAvailable(network);
        ((C4518xd) AbstractC4221mk.f.getValue()).b(new C4009f3(10, 4, "available"));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        ConcurrentHashMap concurrentHashMap = Xl.a;
        super.onLost(network);
        ((C4518xd) AbstractC4221mk.f.getValue()).b(new C4009f3(10, 4, "lost"));
    }
}
