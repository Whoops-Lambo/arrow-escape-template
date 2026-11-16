package com.bytedance.sdk.component.gf.ahm;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class ahm<V> extends FutureTask<V> implements Comparable<ahm<V>> {
    private int ahm;
    private int kgy;

    public ahm(Callable<V> callable, int i, int i2) {
        super(callable);
        this.kgy = i == -1 ? 5 : i;
        this.ahm = i2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
    public int compareTo(ahm ahmVar) {
        if (kgy() < ahmVar.kgy()) {
            return 1;
        }
        if (kgy() > ahmVar.kgy()) {
            return -1;
        }
        return 0;
    }

    public int kgy() {
        return this.kgy;
    }
}
