package com.bytedance.adsdk.ahm.kgy.ahm;

import android.graphics.Path;
import com.bytedance.adsdk.ahm.kgy.kgy.fpp;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class twf extends kgy<com.bytedance.adsdk.ahm.rz.ahm.kus, Path> {
    private final Path ct;
    private List<fpp> noq;
    private final com.bytedance.adsdk.ahm.rz.ahm.kus uq;

    @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy
    /* JADX INFO: renamed from: ahm, reason: merged with bridge method [inline-methods] */
    public Path kgy(com.bytedance.adsdk.ahm.yo.kgy<com.bytedance.adsdk.ahm.rz.ahm.kus> kgyVar, float f) {
        this.uq.kgy(kgyVar.kgy, kgyVar.ahm, f);
        com.bytedance.adsdk.ahm.rz.ahm.kus kusVarKgy = this.uq;
        List<fpp> list = this.noq;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                kusVarKgy = this.noq.get(size).kgy(kusVarKgy);
            }
        }
        com.bytedance.adsdk.ahm.noq.ct.kgy(kusVarKgy, this.ct);
        return this.ct;
    }

    public twf(List<com.bytedance.adsdk.ahm.yo.kgy<com.bytedance.adsdk.ahm.rz.ahm.kus>> list) {
        super(list);
        this.uq = new com.bytedance.adsdk.ahm.rz.ahm.kus();
        this.ct = new Path();
    }

    public void kgy(List<fpp> list) {
        this.noq = list;
    }
}
