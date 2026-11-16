package com.bytedance.sdk.openadsdk.ra;

import com.bytedance.sdk.component.noq.fpp;
import com.bytedance.sdk.component.noq.gf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ct implements fpp {
    private static int kgy;
    private long ahm = 0;
    private final String ct;
    private long rz;
    private boolean uq;

    private String rz(String str, gf gfVar) {
        return str;
    }

    @Override // com.bytedance.sdk.component.noq.fpp
    public void kgy(String str, gf gfVar) {
        if (!this.uq) {
            gfVar.kgy();
            gfVar.ahm();
            gfVar.rz();
            this.uq = true;
        }
        this.ahm = System.currentTimeMillis();
        rz(str, gfVar);
    }

    public ct() {
        kgy++;
        this.ct = "image_request_" + kgy;
    }

    @Override // com.bytedance.sdk.component.noq.fpp
    public void ahm(String str, gf gfVar) {
        this.rz += System.currentTimeMillis() - this.ahm;
        rz(str, gfVar);
    }
}
