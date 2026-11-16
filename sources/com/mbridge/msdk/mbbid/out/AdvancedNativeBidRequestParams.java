package com.mbridge.msdk.mbbid.out;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class AdvancedNativeBidRequestParams extends CommonBidRequestParams {
    private int d;
    private int e;

    public int getHeight() {
        return this.d;
    }

    public int getWidth() {
        return this.e;
    }

    public void setHeight(int i) {
        this.d = i;
    }

    public void setWidth(int i) {
        this.e = i;
    }

    public AdvancedNativeBidRequestParams(String str, String str2, int i, int i2) {
        super(str, str2);
        this.d = i2;
        this.e = i;
    }

    public AdvancedNativeBidRequestParams(String str, String str2, String str3, int i, int i2) {
        super(str, str2, str3);
        this.d = i2;
        this.e = i;
    }
}
