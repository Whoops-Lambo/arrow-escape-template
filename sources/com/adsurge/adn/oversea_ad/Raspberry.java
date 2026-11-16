package com.adsurge.adn.oversea_ad;

import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class Raspberry {
    public static final WeakHashMap a = new WeakHashMap();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static WeakReference c = null;

    public static boolean a(Window window) {
        WeakHashMap weakHashMap = a;
        synchronized (weakHashMap) {
            try {
                if (!weakHashMap.containsKey(window)) {
                    return true;
                }
                try {
                    window.clearFlags(8192);
                    synchronized (weakHashMap) {
                        weakHashMap.remove(window);
                    }
                    return true;
                } catch (Throwable unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean b(Window window) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (attributes == null) {
            return false;
        }
        if ((attributes.flags & 8192) != 0) {
            return true;
        }
        try {
            window.addFlags(8192);
            WeakHashMap weakHashMap = a;
            synchronized (weakHashMap) {
                weakHashMap.put(window, null);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
