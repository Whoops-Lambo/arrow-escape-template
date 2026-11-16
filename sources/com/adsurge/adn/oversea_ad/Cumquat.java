package com.adsurge.adn.oversea_ad;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Proxy;
import java.net.InetAddress;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Cumquat {
    public static String a(Network network) {
        Context context;
        if (network == null) {
            return null;
        }
        try {
            synchronized (Cconst.class) {
                context = Cconst.a;
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            long j = 0;
            long j2 = 0;
            for (int i = 0; i < 64; i++) {
                if (networkCapabilities.hasTransport(i)) {
                    j2 |= 1 << i;
                }
            }
            sb.append(Long.valueOf(j2));
            sb.append(",");
            for (int i2 = 0; i2 < 64; i2++) {
                if (networkCapabilities.hasCapability(i2)) {
                    j |= 1 << i2;
                }
            }
            sb.append(Long.valueOf(j));
            LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
            if (linkProperties == null) {
                return sb.toString();
            }
            String interfaceName = linkProperties.getInterfaceName();
            b bVar = c.a;
            if (interfaceName == null) {
                interfaceName = "";
            }
            String strReplace = interfaceName.replace(",", "").replace(";", "");
            sb.append(",");
            sb.append(strReplace);
            sb.append(",");
            List<LinkAddress> linkAddresses = linkProperties.getLinkAddresses();
            if (linkAddresses != null && !linkAddresses.isEmpty()) {
                for (int i3 = 0; i3 < linkAddresses.size(); i3++) {
                    sb.append(linkAddresses.get(i3).getAddress().getHostAddress());
                    if (i3 != linkAddresses.size() - 1) {
                        sb.append(";");
                    }
                }
            }
            sb.append(",");
            List<InetAddress> dnsServers = linkProperties.getDnsServers();
            if (dnsServers != null && !dnsServers.isEmpty()) {
                for (int i4 = 0; i4 < dnsServers.size(); i4++) {
                    sb.append(dnsServers.get(i4).getHostAddress());
                    if (i4 != dnsServers.size() - 1) {
                        sb.append(";");
                    }
                }
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean b(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
        } catch (Throwable th) {
            String message = th.getMessage();
            return message != null && message.contains("ACCESS_NETWORK_STATE");
        }
    }

    public static String a() {
        Context context;
        synchronized (Cconst.class) {
            context = Cconst.a;
        }
        return a(((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetwork());
    }

    public static byte a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return (byte) -1;
            }
            if (activeNetworkInfo.getState() != NetworkInfo.State.CONNECTING && activeNetworkInfo.getState() != NetworkInfo.State.CONNECTED) {
                return (byte) -1;
            }
            if (activeNetworkInfo.getType() == 1) {
                return (byte) 0;
            }
            if (activeNetworkInfo.getType() == 0) {
                return (Proxy.getDefaultHost() == null && Proxy.getHost(context) == null) ? (byte) 1 : (byte) 2;
            }
            return (byte) 3;
        } catch (Throwable th) {
            String message = th.getMessage();
            return (message == null || !message.contains("ACCESS_NETWORK_STATE")) ? (byte) -3 : (byte) -2;
        }
    }
}
