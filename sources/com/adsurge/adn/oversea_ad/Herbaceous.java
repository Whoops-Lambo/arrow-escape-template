package com.adsurge.adn.oversea_ad;

import android.content.Context;
import android.net.Proxy;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.ironsource.C4788i2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class Herbaceous {
    public static boolean a(Context context) {
        List<WifiConfiguration> configuredNetworks;
        Object objB;
        String str;
        Object objA;
        int iA = Pomegranate.a();
        if (iA < 14) {
            if (!TextUtils.isEmpty(Proxy.getHost(context)) && Proxy.getPort(context) != -1) {
                return true;
            }
            return false;
        }
        if (!TextUtils.isEmpty(System.getProperty("http.proxyHost")) && !TextUtils.equals(System.getProperty("http.proxyPort"), C4788i2.f)) {
            return true;
        }
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        if (Foxnut.a(context, "android.permission.ACCESS_WIFI_STATE") != 0) {
            return false;
        }
        try {
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (connectionInfo != null && connectionInfo.getNetworkId() != -1) {
                try {
                    configuredNetworks = wifiManager.getConfiguredNetworks();
                } catch (Throwable unused) {
                    configuredNetworks = null;
                }
                if (configuredNetworks == null) {
                    return false;
                }
                int networkId = connectionInfo.getNetworkId();
                for (WifiConfiguration wifiConfiguration : configuredNetworks) {
                    if (wifiConfiguration.networkId == networkId) {
                        if (iA < 21) {
                            objB = Hickory.a(WifiConfiguration.class, "proxySettings", wifiConfiguration);
                            str = "android.net.wifi.WifiConfiguration$ProxySettings";
                        } else {
                            objB = Hickory.b(WifiConfiguration.class, "getProxySettings", wifiConfiguration);
                            str = "android.net.IpConfiguration$ProxySettings";
                        }
                        Object objA2 = Hickory.a(str, "STATIC");
                        if (objA2 != null && objA2 == objB) {
                            return true;
                        }
                        if (iA < 19 || (objA = Hickory.a(str, "PAC")) == null || objA != objB) {
                            break;
                        }
                        return true;
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return false;
    }
}
