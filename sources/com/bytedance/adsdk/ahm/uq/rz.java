package com.bytedance.adsdk.ahm.uq;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public enum rz {
    JSON(".json"),
    ZIP(".zip");

    public final String rz;

    public String kgy() {
        return ".temp" + this.rz;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.rz;
    }

    rz(String str) {
        this.rz = str;
    }
}
