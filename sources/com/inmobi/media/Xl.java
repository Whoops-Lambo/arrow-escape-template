package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class Xl {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static Wl b;
    public static boolean c;

    public static void b(String str) {
        Context context = AbstractC4221mk.a;
        if (context != null) {
            Y5.a.getClass();
            if (!Y5.r() || !"SYSTEM_CONNECTIVITY_CHANGE".equals(str) || b == null) {
                ConcurrentHashMap concurrentHashMap = a;
                if (concurrentHashMap.get(str) != null) {
                    context.unregisterReceiver((BroadcastReceiver) concurrentHashMap.get(str));
                    concurrentHashMap.remove(str);
                    return;
                }
                return;
            }
            Object systemService = context.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager != null) {
                Wl wl = b;
                wl.getClass();
                connectivityManager.unregisterNetworkCallback(wl);
                b = null;
            }
        }
    }

    public static void a(Context context, Intent intent) {
        String str;
        if (intent.getAction() != null) {
            try {
                intent.getAction();
                boolean zIsDeviceIdleMode = false;
                PowerManager powerManager = null;
                ConnectivityManager connectivityManager = null;
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    Object systemService = context.getSystemService("connectivity");
                    if (systemService instanceof ConnectivityManager) {
                        connectivityManager = (ConnectivityManager) systemService;
                    }
                    if (connectivityManager != null) {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || activeNetworkInfo.isConnected() != c) {
                            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                                zIsDeviceIdleMode = true;
                            }
                            c = zIsDeviceIdleMode;
                            C4518xd c4518xd = (C4518xd) AbstractC4221mk.f.getValue();
                            if (c) {
                                str = "available";
                            } else {
                                str = "lost";
                            }
                            c4518xd.b(new C4009f3(10, 4, str));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if ("android.os.action.DEVICE_IDLE_MODE_CHANGED".equalsIgnoreCase(intent.getAction())) {
                    Object systemService2 = context.getSystemService("power");
                    if (systemService2 instanceof PowerManager) {
                        powerManager = (PowerManager) systemService2;
                    }
                    if (powerManager != null) {
                        Y5.a.getClass();
                        if (Y5.y()) {
                            zIsDeviceIdleMode = powerManager.isDeviceIdleMode();
                        }
                    }
                    if (zIsDeviceIdleMode != c) {
                        Y5.a.getClass();
                        if (Y5.y()) {
                            ((C4518xd) AbstractC4221mk.f.getValue()).b(new C4009f3(11, 4, String.valueOf(zIsDeviceIdleMode)));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                    ((C4518xd) AbstractC4221mk.f.getValue()).b(new C4009f3(100, 6, (String) null));
                    return;
                }
                if ("android.intent.action.ACTION_SHUTDOWN".equals(intent.getAction())) {
                    ((C4518xd) AbstractC4221mk.f.getValue()).b(new C4009f3(1, 6, (String) null));
                    Iterator it = a.entrySet().iterator();
                    while (it.hasNext()) {
                        b((String) ((Map.Entry) it.next()).getKey());
                    }
                    a.clear();
                    b = null;
                    return;
                }
                if ("android.intent.action.REBOOT".equals(intent.getAction())) {
                    ((C4518xd) AbstractC4221mk.f.getValue()).b(new C4009f3(2, 6, (String) null));
                    Iterator it2 = a.entrySet().iterator();
                    while (it2.hasNext()) {
                        b((String) ((Map.Entry) it2.next()).getKey());
                    }
                    a.clear();
                    b = null;
                    return;
                }
                ((C4518xd) AbstractC4221mk.f.getValue()).b(new C4009f3(99, 4, intent.getAction()));
            } catch (Exception unused) {
            }
        }
    }

    public static void b() {
        a("android.intent.action.ACTION_SHUTDOWN");
        a("android.intent.action.REBOOT");
        Y5.a.getClass();
        if (Y5.y()) {
            a("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        a("android.intent.action.USER_PRESENT");
        if (Y5.r()) {
            a("SYSTEM_CONNECTIVITY_CHANGE");
        } else {
            a("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    public static void a(String str) {
        Context context = AbstractC4221mk.a;
        if (context != null) {
            Y5.a.getClass();
            if (Y5.r() && "SYSTEM_CONNECTIVITY_CHANGE".equals(str)) {
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null) {
                    Wl wl = new Wl();
                    b = wl;
                    connectivityManager.registerDefaultNetworkCallback(wl);
                    return;
                }
                return;
            }
            ConcurrentHashMap concurrentHashMap = a;
            if (concurrentHashMap.get(str) == null) {
                Vl vl = new Vl();
                concurrentHashMap.put(str, vl);
                AbstractC4038g4.a(context, vl, new IntentFilter(str));
            }
        }
    }

    public static void a() {
        b("android.intent.action.ACTION_SHUTDOWN");
        b("android.intent.action.REBOOT");
        Y5.a.getClass();
        if (Y5.y()) {
            b("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        b("android.intent.action.USER_PRESENT");
        if (Y5.r()) {
            b("SYSTEM_CONNECTIVITY_CHANGE");
        } else {
            b("android.net.conn.CONNECTIVITY_CHANGE");
        }
        a.clear();
    }
}
