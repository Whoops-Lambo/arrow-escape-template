package com.fyber.inneractive.sdk.config.cellular;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.a1;
import com.fyber.inneractive.sdk.util.k;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class f extends ConnectivityManager.NetworkCallback {
    public h a;
    public final ConnectivityManager b;

    public final void a() {
        this.a = null;
        ConnectivityManager connectivityManager = this.b;
        if (connectivityManager != null) {
            try {
                connectivityManager.unregisterNetworkCallback(this);
            } catch (Throwable th) {
                IAlog.a("failed to unregister network callback", th, new Object[0]);
            }
        }
    }

    public final void b() {
        ConnectivityManager connectivityManager = this.b;
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(this);
            } catch (Throwable th) {
                IAlog.a("failed to register network callback", th, new Object[0]);
            }
        }
    }

    public final void c() {
        ConnectivityManager connectivityManager = this.b;
        if (connectivityManager != null) {
            try {
                connectivityManager.unregisterNetworkCallback(this);
            } catch (Throwable th) {
                IAlog.a("failed to unregister network callback", th, new Object[0]);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003b  */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        a1 a1Var = a1.UNKNOWN;
        if (networkCapabilities.hasTransport(3)) {
            a1Var = a1.ETHERNET;
        } else if (networkCapabilities.hasTransport(0)) {
            int iH = k.h();
            if (iH != 0) {
                if (iH == 3) {
                    a1Var = a1.MOBILE_3G;
                } else if (iH == 18) {
                    a1Var = a1.WIFI;
                } else if (iH == 20) {
                    a1Var = a1.MOBILE_5G;
                } else if (iH != 5 && iH != 6) {
                    switch (iH) {
                        default:
                            switch (iH) {
                                case 12:
                                case 14:
                                case 15:
                                    break;
                                case 13:
                                    a1Var = a1.MOBILE_4G;
                                    break;
                                default:
                                    a1Var = a1.CELLULAR;
                                    break;
                            }
                        case 8:
                        case 9:
                        case 10:
                            a1Var = a1.MOBILE_3G;
                            break;
                    }
                } else {
                    a1Var = a1.MOBILE_3G;
                }
            }
        } else if (networkCapabilities.hasTransport(1)) {
            a1Var = a1.WIFI;
        }
        h hVar = this.a;
        if (hVar != null) {
            hVar.a(a1Var);
        }
    }

    public f(ConnectivityManager connectivityManager, h hVar) {
        this.a = hVar;
        this.b = connectivityManager;
    }
}
