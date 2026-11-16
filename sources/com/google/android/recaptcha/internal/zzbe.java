package com.google.android.recaptcha.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import defpackage.dt1;
import defpackage.kg0;
import defpackage.qh1;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbe {
    private static final Map zzb() {
        LinkedHashMap linkedHashMapZ = qh1.Z(new dt1(0, zzqi.NET_CAPABILITY_MMS), new dt1(1, zzqi.NET_CAPABILITY_SUPL), new dt1(2, zzqi.NET_CAPABILITY_DUN), new dt1(3, zzqi.NET_CAPABILITY_FOTA), new dt1(4, zzqi.NET_CAPABILITY_IMS), new dt1(5, zzqi.NET_CAPABILITY_CBS), new dt1(6, zzqi.NET_CAPABILITY_WIFI_P2P), new dt1(7, zzqi.NET_CAPABILITY_IA), new dt1(8, zzqi.NET_CAPABILITY_RCS), new dt1(9, zzqi.NET_CAPABILITY_XCAP), new dt1(10, zzqi.NET_CAPABILITY_EIMS), new dt1(11, zzqi.NET_CAPABILITY_NOT_METERED), new dt1(12, zzqi.NET_CAPABILITY_INTERNET), new dt1(13, zzqi.NET_CAPABILITY_NOT_RESTRICTED), new dt1(14, zzqi.NET_CAPABILITY_TRUSTED), new dt1(15, zzqi.NET_CAPABILITY_NOT_VPN));
        linkedHashMapZ.put(17, zzqi.NET_CAPABILITY_CAPTIVE_PORTAL);
        linkedHashMapZ.put(16, zzqi.NET_CAPABILITY_VALIDATED);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            linkedHashMapZ.put(18, zzqi.NET_CAPABILITY_NOT_ROAMING);
            linkedHashMapZ.put(19, zzqi.NET_CAPABILITY_FOREGROUND);
            linkedHashMapZ.put(20, zzqi.NET_CAPABILITY_NOT_CONGESTED);
            linkedHashMapZ.put(21, zzqi.NET_CAPABILITY_NOT_SUSPENDED);
        }
        if (i >= 29) {
            linkedHashMapZ.put(23, zzqi.NET_CAPABILITY_MCX);
        }
        if (i >= 30) {
            linkedHashMapZ.put(25, zzqi.NET_CAPABILITY_TEMPORARILY_NOT_METERED);
        }
        if (i >= 31) {
            linkedHashMapZ.put(32, zzqi.NET_CAPABILITY_HEAD_UNIT);
            linkedHashMapZ.put(29, zzqi.NET_CAPABILITY_ENTERPRISE);
        }
        if (i >= 33) {
            linkedHashMapZ.put(35, zzqi.NET_CAPABILITY_PRIORITIZE_BANDWIDTH);
            linkedHashMapZ.put(34, zzqi.NET_CAPABILITY_PRIORITIZE_LATENCY);
            linkedHashMapZ.put(33, zzqi.NET_CAPABILITY_MMTEL);
        }
        return linkedHashMapZ;
    }

    @NotNull
    public static final Set zza(@NotNull Context context) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                linkedHashSet.add(zzqi.TRANSPORT_WIFI);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                linkedHashSet.add(zzqi.TRANSPORT_CELLULAR);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                linkedHashSet.add(zzqi.TRANSPORT_VPN);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(3)) {
                linkedHashSet.add(zzqi.TRANSPORT_ETHERNET);
            }
            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                linkedHashSet.add(zzqi.NET_CAPABILITY_VALIDATED);
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return kg0.a;
        }
    }

    public zzbe() {
        new ConcurrentHashMap();
        zzb();
    }
}
