package com.bytedance.adsdk.ahm.rz.kgy;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
abstract class kus<V, O> implements twf<V, O> {
    final List<com.bytedance.adsdk.ahm.yo.kgy<V>> kgy;

    @Override // com.bytedance.adsdk.ahm.rz.kgy.twf
    public boolean ahm() {
        return this.kgy.isEmpty() || (this.kgy.size() == 1 && this.kgy.get(0).ct());
    }

    @Override // com.bytedance.adsdk.ahm.rz.kgy.twf
    public List<com.bytedance.adsdk.ahm.yo.kgy<V>> rz() {
        return this.kgy;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.kgy.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.kgy.toArray()));
        }
        return sb.toString();
    }

    public kus(List<com.bytedance.adsdk.ahm.yo.kgy<V>> list) {
        this.kgy = list;
    }
}
