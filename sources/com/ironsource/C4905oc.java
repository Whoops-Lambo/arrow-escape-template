package com.ironsource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.oc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4905oc implements InterfaceC5025v7 {
    private String a = "oc";
    private int b = 23;
    private final InterfaceC5043w7 c;
    private ConnectivityManager.NetworkCallback d;

    /* JADX INFO: renamed from: com.ironsource.oc$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends ConnectivityManager.NetworkCallback {
        final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            C4905oc c4905oc = C4905oc.this;
            if (network != null) {
                c4905oc.c.a(Y3.a(network, this.a), Y3.a(this.a, network));
                return;
            }
            InterfaceC5043w7 interfaceC5043w7 = c4905oc.c;
            String strB = Y3.b(this.a);
            Context context = this.a;
            interfaceC5043w7.a(strB, Y3.a(context, Y3.a(context)));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network != null) {
                C4905oc.this.c.b(Y3.a(network, this.a), Y3.a(this.a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (network != null) {
                C4905oc.this.c.b(Y3.a(network, this.a), Y3.a(this.a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (Y3.b(this.a).equals("none")) {
                C4905oc.this.c.a();
            }
        }
    }

    @Override // com.ironsource.InterfaceC5025v7
    @SuppressLint({"NewApi"})
    public void a(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < this.b || this.d == null || context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this.d);
        } catch (Exception e) {
            C4950r4.d().a(e);
            Log.e(this.a, "NetworkCallback for was not registered or already unregistered");
        }
    }

    @Override // com.ironsource.InterfaceC5025v7
    @SuppressLint({"NewApi", "MissingPermission"})
    public void b(Context context) {
        if (Build.VERSION.SDK_INT >= this.b) {
            a(context);
            if (Y3.b(context).equals("none")) {
                this.c.a();
            }
            if (this.d == null) {
                this.d = new a(context);
            }
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).build();
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(networkRequestBuild, this.d);
                }
            } catch (Exception e) {
                C4950r4.d().a(e);
                Log.e(this.a, "NetworkCallback was not able to register");
            }
        }
    }

    public C4905oc(InterfaceC5043w7 interfaceC5043w7) {
        this.c = interfaceC5043w7;
    }

    @Override // com.ironsource.InterfaceC5025v7
    public JSONObject c(Context context) {
        return Y3.a(context, Y3.a(context));
    }

    @Override // com.ironsource.InterfaceC5025v7
    public void a() {
        this.d = null;
    }
}
