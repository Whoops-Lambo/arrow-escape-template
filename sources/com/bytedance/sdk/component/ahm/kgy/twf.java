package com.bytedance.sdk.component.ahm.kgy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class twf {
    public byte[] ct;
    public kgy noq;
    public gf rz;
    public String uq;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum kgy {
        STRING_TYPE,
        BYTE_ARRAY_TYPE
    }

    public static twf kgy(gf gfVar, String str) {
        return new twf(gfVar, str, kgy.STRING_TYPE);
    }

    public twf(gf gfVar, String str, kgy kgyVar) {
        this.rz = gfVar;
        this.uq = str;
        this.noq = kgyVar;
    }

    public static twf kgy(gf gfVar, byte[] bArr) {
        return new twf(gfVar, bArr, kgy.BYTE_ARRAY_TYPE);
    }

    public twf() {
    }

    public twf(gf gfVar, byte[] bArr, kgy kgyVar) {
        this.rz = gfVar;
        this.ct = bArr;
        this.noq = kgyVar;
    }
}
