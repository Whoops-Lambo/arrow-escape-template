package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.RequiresApi;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.NetworkApi21;
import androidx.work.impl.utils.NetworkApi24;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/work/impl/constraints/trackers/NetworkStateTracker24;", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "Landroidx/work/impl/constraints/NetworkState;", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NetworkStateTracker24 extends ConstraintTracker<NetworkState> {
    public final ConnectivityManager f;
    public final NetworkStateTracker24$networkCallback$1 g;

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public final Object a() {
        return NetworkStateTrackerKt.a(this.f);
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public final void d() {
        try {
            Logger.e().a(NetworkStateTrackerKt.a, "Registering network callback");
            NetworkApi24.a(this.f, this.g);
        } catch (IllegalArgumentException e) {
            Logger.e().d(NetworkStateTrackerKt.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            Logger.e().d(NetworkStateTrackerKt.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public final void e() {
        try {
            Logger.e().a(NetworkStateTrackerKt.a, "Unregistering network callback");
            NetworkApi21.c(this.f, this.g);
        } catch (IllegalArgumentException e) {
            Logger.e().d(NetworkStateTrackerKt.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            Logger.e().d(NetworkStateTrackerKt.a, "Received exception while unregistering network callback", e2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.work.impl.constraints.trackers.NetworkStateTracker24$networkCallback$1] */
    public NetworkStateTracker24(Context context, WorkManagerTaskExecutor workManagerTaskExecutor) {
        super(context, workManagerTaskExecutor);
        Object systemService = this.b.getSystemService("connectivity");
        systemService.getClass();
        this.f = (ConnectivityManager) systemService;
        this.g = new ConnectivityManager.NetworkCallback() { // from class: androidx.work.impl.constraints.trackers.NetworkStateTracker24$networkCallback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                network.getClass();
                networkCapabilities.getClass();
                Logger.e().a(NetworkStateTrackerKt.a, "Network capabilities changed: " + networkCapabilities);
                NetworkStateTracker24 networkStateTracker24 = this.a;
                networkStateTracker24.c(NetworkStateTrackerKt.a(networkStateTracker24.f));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                network.getClass();
                Logger.e().a(NetworkStateTrackerKt.a, "Network connection lost");
                NetworkStateTracker24 networkStateTracker24 = this.a;
                networkStateTracker24.c(NetworkStateTrackerKt.a(networkStateTracker24.f));
            }
        };
    }
}
