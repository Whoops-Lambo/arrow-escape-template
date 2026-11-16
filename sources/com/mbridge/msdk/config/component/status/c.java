package com.mbridge.msdk.config.component.status;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class c {
    ConnectivityManager b;
    b c;
    boolean d;
    private final List<com.mbridge.msdk.config.component.status.a> a = new CopyOnWriteArrayList();

    @RequiresApi
    private final ConnectivityManager.NetworkCallback e = new a();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            int iC;
            super.onCapabilitiesChanged(network, networkCapabilities);
            boolean zHasTransport = networkCapabilities.hasTransport(1);
            boolean zHasTransport2 = networkCapabilities.hasTransport(0);
            if (zHasTransport) {
                iC = 9;
            } else {
                iC = -1;
            }
            if (zHasTransport2) {
                iC = c.this.c();
            }
            com.mbridge.msdk.config.component.base.d dVar = new com.mbridge.msdk.config.component.base.d();
            dVar.b("916002");
            HashMap map = new HashMap();
            map.put(com.mbridge.msdk.config.component.common.util.c.c("networkType"), String.valueOf(iC));
            dVar.a(map);
            c.this.a(dVar);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NonNull Network network) {
            super.onLost(network);
            com.mbridge.msdk.config.component.base.d dVar = new com.mbridge.msdk.config.component.base.d();
            dVar.b("916002");
            HashMap map = new HashMap();
            map.put(com.mbridge.msdk.config.component.common.util.c.c("networkType"), String.valueOf(c.this.c()));
            dVar.a(map);
            c.this.a(dVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public final class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                int iC = c.this.c();
                com.mbridge.msdk.config.component.base.d dVar = new com.mbridge.msdk.config.component.base.d();
                dVar.b("916002");
                HashMap map = new HashMap();
                map.put(com.mbridge.msdk.config.component.common.util.c.c("networkType"), String.valueOf(iC));
                dVar.a(map);
                c.this.a(dVar);
            } catch (Throwable th) {
                q0.b("MBNetworkEventPublisher", th.getMessage());
            }
        }

        public /* synthetic */ b(c cVar, a aVar) {
            this();
        }
    }

    @SuppressLint({"MissingPermission"})
    public int c() {
        NetworkInfo activeNetworkInfo;
        if (this.d) {
            TelephonyManager telephonyManager = (TelephonyManager) com.mbridge.msdk.foundation.controller.c.n().d().getSystemService("phone");
            return m0.c(telephonyManager != null ? telephonyManager.getDataNetworkType() : 0);
        }
        ConnectivityManager connectivityManager = this.b;
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return 0;
        }
        return m0.c(activeNetworkInfo.getSubtype());
    }

    public boolean d() {
        if (!this.a.isEmpty()) {
            return false;
        }
        b();
        return true;
    }

    public c() {
        a(com.mbridge.msdk.foundation.controller.c.n().d());
        a();
    }

    private void a() {
        int iA = ContextCompat.a(com.mbridge.msdk.foundation.controller.c.n().d(), "android.permission.READ_PHONE_STATE");
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 33) {
            int iA2 = ContextCompat.a(com.mbridge.msdk.foundation.controller.c.n().d(), "android.permission.READ_BASIC_PHONE_STATE");
            if (iA != 0 && iA2 != 0) {
                z = false;
            }
            this.d = z;
            return;
        }
        if (iA != 0) {
            z = false;
        }
        this.d = z;
    }

    public void b() {
        try {
            if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                if (this.b == null) {
                    this.b = (ConnectivityManager) com.mbridge.msdk.foundation.controller.c.n().d().getSystemService("connectivity");
                }
                this.b.unregisterNetworkCallback(this.e);
                this.b = null;
            }
        } catch (Throwable th) {
            q0.b("MBNetworkEventPublisher", th.getMessage(), th);
        }
    }

    public void a(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar == null || this.a.contains(aVar)) {
            return;
        }
        this.a.add(aVar);
    }

    public void b(com.mbridge.msdk.config.component.status.a aVar) {
        this.a.remove(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.config.component.base.d dVar) {
        try {
            Iterator<com.mbridge.msdk.config.component.status.a> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().a(dVar);
            }
        } catch (Throwable th) {
            q0.b("MBNetworkEventPublisher", th.getMessage());
        }
    }

    private void a(Context context) {
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.b.registerNetworkCallback(new NetworkRequest.Builder().addCapability(11).addCapability(12).build(), this.e);
    }
}
