package com.bytedance.sdk.openadsdk.component.fi;

import com.ironsource.C4664b4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class kgy {
    private long ahm;
    private long ct;
    private float kgy;
    private long rz;
    private boolean uq;

    public float ahm() {
        return this.kgy;
    }

    public void kgy(float f) {
        StringBuilder sb = new StringBuilder("setTotalTime() called with: time = [");
        sb.append(f);
        sb.append(C4664b4.j.e);
        this.kgy = f;
    }

    public long rz() {
        return this.ahm;
    }

    public long uq() {
        return this.rz;
    }

    public void ahm(long j) {
        this.ahm = j;
    }

    public void rz(long j) {
        this.rz = j;
    }

    public long kgy() {
        return this.ct;
    }

    public void kgy(long j) {
        this.ct = j;
    }

    public void kgy(boolean z) {
        this.uq = z;
    }
}
