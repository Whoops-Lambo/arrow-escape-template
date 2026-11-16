package com.adsurge.adn.oversea_ad;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class Bootes {
    public static volatile Bootes e;
    public DisplayManager c;
    public final HashSet a = new HashSet();
    public volatile boolean b = false;
    public final Ara d = new Ara(this);

    public static void a(Bootes bootes, Context context) {
        synchronized (bootes) {
            if (!bootes.b) {
                try {
                    DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
                    if (displayManager != null) {
                        bootes.c = displayManager;
                        HandlerThread handlerThread = new HandlerThread("TuringDisplayMonitor", 10);
                        handlerThread.start();
                        displayManager.registerDisplayListener(bootes.d, new Handler(handlerThread.getLooper()));
                        bootes.b = true;
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final synchronized String b() {
        if (this.a.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = this.a.iterator();
        boolean z = true;
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (!z) {
                sb.append(',');
            }
            sb.append(iIntValue);
            z = false;
        }
        return sb.toString();
    }

    public static Bootes a() {
        if (e == null) {
            synchronized (Bootes.class) {
                try {
                    if (e == null) {
                        e = new Bootes();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }
}
