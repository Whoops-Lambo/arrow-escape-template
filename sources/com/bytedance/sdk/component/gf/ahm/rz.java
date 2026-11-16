package com.bytedance.sdk.component.gf.ahm;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class rz implements Comparable<rz>, Runnable {
    public static final int EIGHTH_PRIORITY = 8;
    public static final int FIFTH_PRIORITY = 5;
    public static final int FOURTH_PRIORITY = 4;
    public static final int MAX_PRIORITY = 10;
    public static final int MIN_PRIORITY = 1;
    public static final int NINTH_PRIORITY = 9;
    public static final int SECOND_PRIORITY = 2;
    public static final int SEVENTH_PRIORITY = 7;
    public static final int SIXTH_PRIORITY = 6;
    public static final int THIRD_PRIORITY = 3;
    private String ahm;
    private long ct;
    private int kgy;
    private long noq;
    private Runnable rz;
    private long uq;

    public long getAfterTimestamp() {
        return this.noq;
    }

    public long getBeforeTimestamp() {
        return this.ct;
    }

    public String getName() {
        return this.ahm;
    }

    public int getPriority() {
        return this.kgy;
    }

    public long getRunTime() {
        return this.noq - this.ct;
    }

    public long getSubmitTimestamp() {
        return this.uq;
    }

    public Runnable getTarget() {
        return this.rz;
    }

    public long getWaitTime() {
        return this.ct - this.uq;
    }

    public void setAfterTimestamp(long j) {
        this.noq = j;
    }

    public void setBeforeTimestamp(long j) {
        this.ct = j;
    }

    public void setPriority(int i) {
        this.kgy = i;
    }

    public void setSubmitTimestamp(long j) {
        this.uq = j;
    }

    public void setTarget(Runnable runnable) {
        this.rz = runnable;
    }

    public rz(String str, Runnable runnable) {
        this.kgy = 5;
        this.ahm = str;
        this.rz = runnable;
    }

    @Override // java.lang.Comparable
    public int compareTo(rz rzVar) {
        if (getPriority() < rzVar.getPriority()) {
            return 1;
        }
        if (getPriority() >= rzVar.getPriority()) {
            return -1;
        }
        return 0;
    }

    public rz(String str, int i) {
        this.kgy = i;
        this.ahm = str;
    }

    public rz(int i, String str, Runnable runnable) {
        this.kgy = i;
        this.ahm = str;
        this.rz = runnable;
    }

    public rz(String str) {
        this.kgy = 5;
        this.ahm = str;
    }
}
