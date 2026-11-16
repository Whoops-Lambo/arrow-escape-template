package com.adsurge.adn.X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Process;
import android.telephony.ServiceState;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import defpackage.dr0;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class r {
    public static final boolean a = false;
    public static volatile com.adsurge.adn.E0.c b = com.adsurge.adn.E0.c.UNKNOWN;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends ConnectivityManager.NetworkCallback {
        public final /* synthetic */ ConnectivityManager a;

        public a(ConnectivityManager connectivityManager) {
            this.a = connectivityManager;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            NetworkCapabilities networkCapabilities = this.a.getNetworkCapabilities(network);
            if (networkCapabilities == null) {
                r.b = com.adsurge.adn.E0.c.UNKNOWN;
            } else if (networkCapabilities.hasTransport(1)) {
                r.b = com.adsurge.adn.E0.c.WIFI;
            } else if (networkCapabilities.hasTransport(0)) {
                r.b = r.a(this.a);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (networkCapabilities == null) {
                r.b = com.adsurge.adn.E0.c.UNKNOWN;
            } else if (networkCapabilities.hasTransport(0)) {
                r.b = r.a(this.a);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            r.b = com.adsurge.adn.E0.c.UNKNOWN;
        }
    }

    public static HttpURLConnection a(HttpURLConnection httpURLConnection, Network network) throws IOException {
        if (httpURLConnection == null) {
            return null;
        }
        int connectTimeout = httpURLConnection.getConnectTimeout();
        int readTimeout = httpURLConnection.getReadTimeout();
        Map<String, List<String>> requestProperties = httpURLConnection.getRequestProperties();
        int i = 0;
        while (i < 3) {
            httpURLConnection.connect();
            try {
                if (!a(httpURLConnection.getResponseCode())) {
                    break;
                }
                String headerField = httpURLConnection.getHeaderField("location");
                httpURLConnection.disconnect();
                httpURLConnection = network != null ? (HttpURLConnection) network.openConnection(new URL(headerField)) : (HttpURLConnection) new URL(headerField).openConnection();
                httpURLConnection.setConnectTimeout(connectTimeout);
                httpURLConnection.setReadTimeout(readTimeout);
                if (requestProperties != null) {
                    for (Map.Entry<String, List<String>> entry : requestProperties.entrySet()) {
                        String key = entry.getKey();
                        List<String> value = entry.getValue();
                        if (value != null && !value.isEmpty()) {
                            Iterator<String> it = value.iterator();
                            while (it.hasNext()) {
                                httpURLConnection.addRequestProperty(key, it.next());
                            }
                        }
                    }
                }
                i++;
            } catch (IndexOutOfBoundsException e) {
                dr0.h(e.getMessage());
                return null;
            }
        }
        if (i != 3) {
            return httpURLConnection;
        }
        io.p071bidmachine.media3.extractor.ts.y.i(httpURLConnection.getURL(), "HttpURLConnection exceed max redirect 3 ");
        return null;
    }

    public static com.adsurge.adn.E0.c b() {
        return a ? c() : b;
    }

    public static com.adsurge.adn.E0.c c() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) com.adsurge.adn.J.a.d().a().getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return com.adsurge.adn.E0.c.UNKNOWN;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    return com.adsurge.adn.E0.c.WIFI;
                }
                return com.adsurge.adn.E0.c.UNKNOWN;
            }
            return a(connectivityManager);
        } catch (Exception unused) {
        }
    }

    public static int d() {
        return SubscriptionManager.getDefaultDataSubscriptionId();
    }

    public static boolean e() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) com.adsurge.adn.J.a.d().a().getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected() || activeNetworkInfo.getState() != NetworkInfo.State.CONNECTED) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context) {
        if (a) {
            return;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            connectivityManager.registerDefaultNetworkCallback(new a(connectivityManager));
            b = c();
        } catch (Exception unused) {
            b = com.adsurge.adn.E0.c.UNKNOWN;
        }
    }

    public static String a() {
        int subtype;
        if (com.adsurge.adn.K.b.a("cell_network_type")) {
            return null;
        }
        Context contextA = com.adsurge.adn.J.a.d().a();
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) contextA.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.getType() == 0) {
                try {
                    subtype = ((TelephonyManager) contextA.getSystemService("phone")).getNetworkType();
                } catch (Exception unused) {
                    subtype = 0;
                }
                if (subtype == 0) {
                    subtype = activeNetworkInfo.getSubtype();
                }
                if (subtype == 13 && Build.VERSION.SDK_INT >= 29) {
                    return String.valueOf(a(contextA, subtype));
                }
                return "" + subtype;
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    public static HttpURLConnection a(HttpURLConnection httpURLConnection) {
        return a(httpURLConnection, (Network) null);
    }

    public static boolean a(int i) {
        return i == 302 || i == 301 || i == 303;
    }

    public static int a(Context context, int i) {
        ServiceState serviceState;
        ServiceState serviceState2;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            int iD = d();
            if (iD == -1) {
                serviceState2 = telephonyManager.getServiceState();
            } else {
                try {
                    Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getServiceStateForSubscriber", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    serviceState = (ServiceState) declaredMethod.invoke(telephonyManager, Integer.valueOf(iD));
                } catch (Throwable th) {
                    th.printStackTrace();
                    serviceState = null;
                }
                if (serviceState == null) {
                    serviceState2 = telephonyManager.getServiceState();
                }
                if (serviceState == null && a(serviceState.toString())) {
                    return 10013;
                }
            }
            serviceState = serviceState2;
            return serviceState == null ? i : i;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return i;
        }
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("nrState=NOT_RESTRICTED") || str.contains("nrState=CONNECTED");
    }

    public static com.adsurge.adn.E0.c a(ConnectivityManager connectivityManager) {
        int networkType;
        try {
            networkType = com.adsurge.adn.J.a.d().a().checkPermission("android.permission.READ_PHONE_STATE", Process.myPid(), Process.myUid()) == 0 ? ((TelephonyManager) com.adsurge.adn.J.a.d().a().getSystemService("phone")).getNetworkType() : 0;
        } catch (Exception unused) {
        }
        if (networkType == 0) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    networkType = activeNetworkInfo.getSubtype();
                }
            } catch (Throwable unused2) {
            }
        }
        switch (networkType) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return com.adsurge.adn.E0.c.NET_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return com.adsurge.adn.E0.c.NET_3G;
            case 13:
            case 18:
            case 19:
                return com.adsurge.adn.E0.c.NET_4G;
            case 20:
                return com.adsurge.adn.E0.c.NET_5G;
            default:
                return com.adsurge.adn.E0.c.UNKNOWN;
        }
    }
}
