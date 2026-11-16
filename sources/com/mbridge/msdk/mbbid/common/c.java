package com.mbridge.msdk.mbbid.common;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    private String a;
    private String b;
    private String c;

    public String getmFloorPrice() {
        return this.c;
    }

    public String getmPlacementId() {
        return this.a;
    }

    public String getmUnitId() {
        return this.b;
    }

    public void setmFloorPrice(String str) {
        this.c = str;
    }

    public void setmPlacementId(String str) {
        this.a = str;
    }

    public void setmUnitId(String str) {
        this.b = str;
    }

    public c(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public c(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
