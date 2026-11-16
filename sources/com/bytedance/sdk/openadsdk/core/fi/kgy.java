package com.bytedance.sdk.openadsdk.core.fi;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.core.settings.nu;
import com.bytedance.sdk.openadsdk.core.xh;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class kgy {
    private static volatile boolean ahm;
    private static volatile kgy kgy;
    private static volatile long rz;
    private Handler ct;
    private final Queue<C0247kgy> uq = new LinkedList();
    private final nu noq = xh.uq();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.fi.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0247kgy {
        private final String ahm;
        private final long kgy;

        private C0247kgy(long j, String str) {
            this.kgy = j;
            this.ahm = str;
        }
    }

    private synchronized boolean ahm(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iBmz = this.noq.bmz();
        long jVg = this.noq.vg();
        if (this.uq.size() <= 0 || this.uq.size() < iBmz) {
            this.uq.offer(new C0247kgy(jCurrentTimeMillis, str));
        } else {
            long jAbs = Math.abs(jCurrentTimeMillis - this.uq.peek().kgy);
            if (jAbs <= jVg) {
                ahm(jVg - jAbs);
                return true;
            }
            this.uq.poll();
            this.uq.offer(new C0247kgy(jCurrentTimeMillis, str));
        }
        return false;
    }

    private synchronized void kgy(long j) {
        try {
            if (this.ct == null) {
                this.ct = new Handler(Looper.getMainLooper());
            }
            this.ct.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fi.kgy.1
                @Override // java.lang.Runnable
                public void run() {
                    kgy.this.kgy(false);
                }
            }, j);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized String rz() {
        String str;
        try {
            HashMap map = new HashMap();
            for (C0247kgy c0247kgy : this.uq) {
                if (map.containsKey(c0247kgy.ahm)) {
                    map.put(c0247kgy.ahm, Integer.valueOf(((Integer) map.get(c0247kgy.ahm)).intValue() + 1));
                } else {
                    map.put(c0247kgy.ahm, 1);
                }
            }
            str = "";
            int i = Integer.MIN_VALUE;
            for (String str2 : map.keySet()) {
                int iIntValue = ((Integer) map.get(str2)).intValue();
                if (i < iIntValue) {
                    str = str2;
                    i = iIntValue;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return str;
    }

    private kgy() {
    }

    public static kgy kgy() {
        if (kgy == null) {
            synchronized (kgy.class) {
                try {
                    if (kgy == null) {
                        kgy = new kgy();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kgy;
    }

    public synchronized boolean kgy(String str) {
        try {
            if (ahm(str)) {
                kgy(true);
                kgy(rz);
            } else {
                kgy(false);
            }
        } catch (Throwable th) {
            throw th;
        }
        return ahm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void kgy(boolean z) {
        ahm = z;
    }

    public synchronized boolean ahm() {
        return ahm;
    }

    private synchronized void ahm(long j) {
        rz = j;
    }
}
