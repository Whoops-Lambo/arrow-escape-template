package com.tiktok.iap.billing.model;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public enum TTProductType {
    IN_APP("inapp"),
    SUBS("subs");

    private String type;

    public String getType() {
        return this.type;
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.valueOf(this.type);
    }

    TTProductType(String str) {
        this.type = str;
    }
}
