package com.bytedance.adsdk.ahm.kgy.kgy;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class ahm {
    private final List<gm> kgy = new ArrayList();

    public void kgy(Path path) {
        for (int size = this.kgy.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.ahm.noq.noq.kgy(path, this.kgy.get(size));
        }
    }

    public void kgy(gm gmVar) {
        this.kgy.add(gmVar);
    }
}
