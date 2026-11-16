package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.exoplayer2.scheduler.RequirementsWatcher;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class v42 extends ConnectivityManager.NetworkCallback {
    public boolean a;
    public boolean b;
    public final /* synthetic */ RequirementsWatcher c;

    public v42(RequirementsWatcher requirementsWatcher) {
        this.c = requirementsWatcher;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.c.handler.post(new u42(this, 0));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        if (z) {
            return;
        }
        this.c.handler.post(new u42(this, 1));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean zHasCapability = networkCapabilities.hasCapability(16);
        boolean z = this.a;
        RequirementsWatcher requirementsWatcher = this.c;
        if (z && this.b == zHasCapability) {
            if (zHasCapability) {
                requirementsWatcher.handler.post(new u42(this, 1));
            }
        } else {
            this.a = true;
            this.b = zHasCapability;
            requirementsWatcher.handler.post(new u42(this, 0));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.c.handler.post(new u42(this, 0));
    }
}
