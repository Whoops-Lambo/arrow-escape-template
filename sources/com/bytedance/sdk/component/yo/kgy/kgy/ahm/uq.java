package com.bytedance.sdk.component.yo.kgy.kgy.ahm;

import com.bytedance.sdk.component.yo.kgy.uq.kgy;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class uq<T extends com.bytedance.sdk.component.yo.kgy.uq.kgy> {
    private Queue<T> ahm = new ConcurrentLinkedQueue();
    private com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy kgy;
    private Queue<String> rz;
    private String uq;

    public synchronized boolean ahm(int i, int i2) {
        int size = this.ahm.size();
        int iKgy = this.kgy.kgy();
        if (i != 2 && i != 1) {
            return size >= iKgy;
        }
        if (com.bytedance.sdk.component.yo.kgy.rz.kgy.rz()) {
            return size > 0;
        }
        return size >= iKgy;
    }

    public synchronized void kgy(int i, List<T> list) {
        try {
            if (i == -1 || i == 200 || i == 509) {
                this.ahm.size();
                return;
            }
            if (list != null) {
                for (T t : list) {
                    if (t != null) {
                        t.kgy(t.ra() + 1);
                    }
                }
            }
            this.ahm.addAll(list);
        } catch (Throwable th) {
            throw th;
        }
    }

    public uq(com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy kgyVar, Queue<String> queue, String str) {
        this.kgy = kgyVar;
        this.rz = queue;
        this.uq = str;
    }

    public synchronized List<com.bytedance.sdk.component.yo.kgy.uq.kgy> kgy(int i, int i2) {
        if (!ahm(i, i2)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.kgy.kgy());
        do {
            T tPoll = this.ahm.poll();
            if (tPoll == null) {
                break;
            }
            arrayList.add(tPoll);
        } while (arrayList.size() != this.kgy.ahm());
        return arrayList;
    }

    public void kgy(T t) {
        Queue<T> queue = this.ahm;
        if (queue == null || t == null) {
            return;
        }
        queue.offer(t);
    }
}
