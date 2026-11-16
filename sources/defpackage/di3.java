package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class di3 {
    public final ConnectivityManager a;
    public int b;
    public final lh3 c;

    public di3(Context context) {
        NetworkCapabilities networkCapabilities;
        int i = 0;
        this.b = 0;
        lh3 lh3Var = new lh3(this);
        this.c = lh3Var;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.a = connectivityManager;
        if (connectivityManager == null) {
            uj2.a(6, "NetworkConnectivity: ConnectivityManager not found");
            return;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
            i = networkCapabilities.hasTransport(0) ? 1 : 2;
        }
        this.b = i;
        connectivityManager.registerDefaultNetworkCallback(lh3Var);
    }
}
