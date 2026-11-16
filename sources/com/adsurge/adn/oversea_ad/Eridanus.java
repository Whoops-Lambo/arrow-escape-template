package com.adsurge.adn.oversea_ad;

import android.view.accessibility.AccessibilityEvent;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class Eridanus {
    public static final AtomicInteger a = new AtomicInteger(0);
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final AtomicBoolean d = new AtomicBoolean(false);

    public static void a() {
        AtomicInteger atomicInteger = a;
        synchronized (atomicInteger) {
            atomicInteger.get();
            atomicInteger.set(0);
        }
    }

    public static void b(AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent.obtain(accessibilityEvent);
    }

    public static void a(AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent.obtain(accessibilityEvent);
    }
}
