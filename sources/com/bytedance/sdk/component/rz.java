package com.bytedance.sdk.component;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class rz {

    @GuardedBy
    private static volatile Handler ahm;
    private static final Object kgy = new Object();

    @GuardedBy
    private static final LinkedList<Runnable> rz = new LinkedList<>();
    private static Object uq = new Object();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy extends Handler {
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                try {
                    rz.rz();
                } catch (OutOfMemoryError e) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTD", "b9ocgAapbMO3RcVWyCC1LU7rKaIMrmLvgUTTUYkD", "U+8jkQ+5RMKTWdZaiQ==", 150);
                }
            }
        }

        public kgy(Looper looper) {
            super(looper);
        }
    }

    private static Handler ahm() {
        Handler handler;
        if (ahm != null) {
            return ahm;
        }
        synchronized (kgy) {
            try {
                if (ahm == null) {
                    ahm.kgy kgyVar = ahm.kgy;
                    HandlerThread handlerThreadKgy = kgyVar != null ? kgyVar.kgy("queued-work-looper", -2) : null;
                    if (handlerThreadKgy == null) {
                        handlerThreadKgy = new HandlerThread("queued-work-looper", -2);
                        handlerThreadKgy.start();
                    }
                    ahm = new kgy(handlerThreadKgy.getLooper());
                }
                handler = ahm;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void rz() {
        LinkedList linkedList;
        synchronized (uq) {
            try {
                synchronized (kgy) {
                    LinkedList<Runnable> linkedList2 = rz;
                    linkedList = (LinkedList) linkedList2.clone();
                    linkedList2.clear();
                    ahm().removeMessages(1);
                }
                if (linkedList.size() > 0) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void kgy(Runnable runnable, boolean z) {
        try {
            Handler handlerAhm = ahm();
            synchronized (kgy) {
                try {
                    rz.add(runnable);
                    if (z) {
                        handlerAhm.sendEmptyMessageDelayed(1, 100L);
                    } else {
                        handlerAhm.sendEmptyMessage(1);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (OutOfMemoryError e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTD", "b9ocgAapbMO3RcVW", "SvsogAY=", 74);
        }
    }
}
