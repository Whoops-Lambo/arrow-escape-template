package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class mca {
    private long ahm;
    public long kgy;

    public static mca ahm() {
        return new mca(true);
    }

    public static mca rz() {
        return new mca(false);
    }

    public long kgy(mca mcaVar) {
        return Math.abs(mcaVar.ahm - this.ahm);
    }

    public boolean noq() {
        return this.ahm > 0;
    }

    public String toString() {
        return String.valueOf(this.kgy);
    }

    private mca(boolean z) {
        if (z) {
            ct();
        }
    }

    public void ct() {
        this.kgy = System.currentTimeMillis();
        this.ahm = SystemClock.elapsedRealtime();
    }

    public long uq() {
        return SystemClock.elapsedRealtime() - this.ahm;
    }

    public long kgy() {
        return this.ahm;
    }
}
