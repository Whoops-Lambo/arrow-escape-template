package com.bytedance.sdk.component.yo.kgy.ct;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class ct implements Comparable<ct>, Runnable {
    private String rz;
    private int kgy = 5;
    private String ahm = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());

    public ct(String str) {
        this.rz = str;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
    public int compareTo(ct ctVar) {
        if (kgy() < ctVar.kgy()) {
            return 1;
        }
        if (kgy() >= ctVar.kgy()) {
            return -1;
        }
        return 0;
    }

    public int kgy() {
        return this.kgy;
    }

    public void kgy(int i) {
        this.kgy = i;
    }
}
