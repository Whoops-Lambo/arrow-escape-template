package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.utils.mca;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class bmz {
    public long ahm;
    private long at;
    private long ct;
    private long fi;
    private long gf;
    public boolean kgy;
    private long noq;
    private int nu;
    private long ra;
    private int twf;
    private long yo;
    private mca rz = mca.rz();
    private mca uq = mca.rz();

    public synchronized int ra() {
        return this.twf;
    }

    public void ahm(mca mcaVar) {
        this.uq = mcaVar;
        this.gf = mcaVar.kgy(this.rz);
    }

    public long ct() {
        return this.fi;
    }

    public int fi() {
        return this.nu;
    }

    public long gf() {
        return this.at;
    }

    public void kgy(mca mcaVar, mca mcaVar2, int i, mca mcaVar3) {
        this.ct = mcaVar.kgy(this.rz);
        this.noq = mcaVar2.kgy(mcaVar);
        this.yo = i;
        this.fi = mcaVar3.kgy(mcaVar2);
    }

    public long noq() {
        return this.gf;
    }

    public long rz() {
        return this.noq;
    }

    public long uq() {
        return this.yo;
    }

    public long yo() {
        return this.ra;
    }

    public long ahm() {
        return this.ct;
    }

    public void ahm(long j) {
        this.at = j;
    }

    public synchronized void ahm(int i) {
        this.twf = i;
    }

    public void kgy(mca mcaVar) {
        this.rz = mcaVar;
    }

    public mca kgy() {
        return this.rz;
    }

    public void kgy(long j) {
        this.ra = j;
    }

    public void kgy(int i) {
        this.nu = i;
    }
}
