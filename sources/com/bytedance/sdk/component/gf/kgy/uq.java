package com.bytedance.sdk.component.gf.kgy;

import com.bytedance.sdk.component.gf.kgy.rz;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class uq<T extends rz> {
    private BlockingQueue<T> ahm = new LinkedBlockingQueue();
    private int kgy;

    public boolean kgy(T t) {
        if (t == null) {
            return false;
        }
        t.kgy();
        if (this.ahm.size() >= this.kgy) {
            return false;
        }
        return this.ahm.offer(t);
    }

    private uq(int i) {
        this.kgy = i;
    }

    public T kgy() {
        return this.ahm.poll();
    }

    public static uq kgy(int i) {
        return new uq(i);
    }
}
