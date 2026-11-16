package com.bytedance.adsdk.ahm.kgy.ahm;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class fi {
    private final List<kgy<Integer, Integer>> ahm;
    private final List<kgy<com.bytedance.adsdk.ahm.rz.ahm.kus, Path>> kgy;
    private final List<com.bytedance.adsdk.ahm.rz.ahm.fi> rz;

    public List<kgy<com.bytedance.adsdk.ahm.rz.ahm.kus, Path>> ahm() {
        return this.kgy;
    }

    public List<com.bytedance.adsdk.ahm.rz.ahm.fi> kgy() {
        return this.rz;
    }

    public List<kgy<Integer, Integer>> rz() {
        return this.ahm;
    }

    public fi(List<com.bytedance.adsdk.ahm.rz.ahm.fi> list) {
        this.rz = list;
        this.kgy = new ArrayList(list.size());
        this.ahm = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.kgy.add(list.get(i).ahm().kgy());
            this.ahm.add(list.get(i).rz().kgy());
        }
    }
}
