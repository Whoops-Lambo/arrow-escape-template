package com.bytedance.sdk.openadsdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class TTImage {
    private final int ahm;
    private final int kgy;
    private final String rz;
    private double uq;

    public double getDuration() {
        return this.uq;
    }

    public int getHeight() {
        return this.kgy;
    }

    public String getImageUrl() {
        return this.rz;
    }

    public int getWidth() {
        return this.ahm;
    }

    public boolean isValid() {
        String str;
        return this.kgy > 0 && this.ahm > 0 && (str = this.rz) != null && str.length() > 0;
    }

    public TTImage(int i, int i2, String str, double d) {
        this.kgy = i;
        this.ahm = i2;
        this.rz = str;
        this.uq = d;
    }

    public TTImage(int i, int i2, String str) {
        this(i, i2, str, 0.0d);
    }
}
