package com.bytedance.adsdk.kgy.ahm.kgy;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class kgy {
    private Object[] ahm;
    private String kgy;

    public Object[] ahm() {
        return this.ahm;
    }

    public String kgy() {
        return this.kgy;
    }

    public String toString() {
        return "MethodResult{methodName='" + this.kgy + "', args=" + Arrays.toString(this.ahm) + '}';
    }

    public void kgy(String str) {
        this.kgy = str;
    }

    public void kgy(Object[] objArr) {
        this.ahm = objArr;
    }
}
