package com.bytedance.adsdk.ahm.rz;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class noq {
    public final float ahm;
    public final float kgy;
    private final String rz;

    public boolean kgy(String str) {
        if (this.rz.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.rz.endsWith("\r")) {
            String str2 = this.rz;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public noq(String str, float f, float f2) {
        this.rz = str;
        this.ahm = f2;
        this.kgy = f;
    }
}
