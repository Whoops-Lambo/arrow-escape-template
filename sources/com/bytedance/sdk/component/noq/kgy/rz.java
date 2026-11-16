package com.bytedance.sdk.component.noq.kgy;

import com.bytedance.sdk.component.noq.noq;
import com.bytedance.sdk.component.noq.yo;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class rz<T> implements noq {
    private int ahm;
    private yo ct;
    Map<String, String> kgy;
    private T rz;
    private String uq;

    @Override // com.bytedance.sdk.component.noq.noq
    public T ahm() {
        return this.rz;
    }

    public void kgy(yo yoVar) {
        this.ct = yoVar;
    }

    @Override // com.bytedance.sdk.component.noq.noq
    public String rz() {
        return this.uq;
    }

    public rz(int i, T t, String str) {
        this.ahm = i;
        this.rz = t;
        this.uq = str;
    }

    @Override // com.bytedance.sdk.component.noq.noq
    public int kgy() {
        return this.ahm;
    }

    public rz(int i, T t, String str, Map<String, String> map) {
        this(i, t, str);
        this.kgy = map;
    }
}
