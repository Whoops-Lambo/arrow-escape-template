package androidx.work.impl.constraints.trackers;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.NetworkApi21;
import androidx.work.impl.utils.NetworkApi23;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class NetworkStateTrackerKt {
    public static final String a = Logger.g("NetworkStateTracker");

    public static final NetworkState a(ConnectivityManager connectivityManager) {
        boolean z;
        boolean zB;
        connectivityManager.getClass();
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z2 = true;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z = true;
        } else {
            z = false;
        }
        try {
            NetworkCapabilities networkCapabilitiesA = NetworkApi21.a(connectivityManager, NetworkApi23.a(connectivityManager));
            if (networkCapabilitiesA != null) {
                zB = NetworkApi21.b(networkCapabilitiesA, 16);
            } else {
                zB = false;
            }
        } catch (SecurityException e) {
            Logger.e().d(a, "Unable to validate active network", e);
        }
        boolean zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z2 = false;
        }
        return new NetworkState(z, zB, zIsActiveNetworkMetered, z2);
    }
}
