package com.tiktok.appevents;

import com.tiktok.TikTokBusinessSdk;
import com.tiktok.util.TTUtil;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
class TTEdpAppEventsQueue {
    private static final String TAG = "TTEdpAppEventsQueue";
    private static List<TTAppEvent> memory = new CopyOnWriteArrayList();

    public static synchronized void addEvent(TTAppEvent tTAppEvent) {
        TTUtil.checkThread(TAG);
        memory.add(tTAppEvent);
        notifyChange();
    }

    public static synchronized void clearAll() {
        try {
            TTUtil.checkThread(TAG);
            memory = new CopyOnWriteArrayList();
            notifyChange();
        } catch (Throwable unused) {
        }
    }

    public static synchronized List<TTAppEvent> exportAllEvents() {
        List<TTAppEvent> list;
        list = memory;
        memory = new CopyOnWriteArrayList();
        notifyChange();
        return list;
    }

    private static void notifyChange() {
        TikTokBusinessSdk.MemoryListener memoryListener = TikTokBusinessSdk.memoryListener;
        if (memoryListener != null) {
            memoryListener.onMemoryChange(memory.size());
        }
        if (TikTokBusinessSdk.nextTimeFlushListener != null) {
            TikTokBusinessSdk.nextTimeFlushListener.thresholdLeft(100, Math.max(100 - size(), 0));
        }
    }

    public static synchronized int size() {
        return memory.size();
    }

    private TTEdpAppEventsQueue() {
    }
}
