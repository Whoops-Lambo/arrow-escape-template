package com.facebook.appevents;

import android.preference.PreferenceManager;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class d {
    public static final ReentrantReadWriteLock a = new ReentrantReadWriteLock();
    public static String b;
    public static volatile boolean c;

    public static void a() {
        if (c) {
            return;
        }
        a.writeLock().lock();
        try {
            if (!c) {
                b = PreferenceManager.getDefaultSharedPreferences(com.facebook.a0.a()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                c = true;
            }
        } finally {
            a.writeLock().unlock();
        }
    }
}
