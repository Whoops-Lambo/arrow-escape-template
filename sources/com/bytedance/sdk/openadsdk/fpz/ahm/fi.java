package com.bytedance.sdk.openadsdk.fpz.ahm;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.ioy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class fi extends ahm {
    private int uq;

    public fi(Integer num, View view, ioy ioyVar, ct.kgy kgyVar) {
        super(num, view, ioyVar, 2000, kgyVar);
        this.uq = 0;
    }

    @Override // com.bytedance.sdk.openadsdk.fpz.ahm.ahm
    public boolean at() {
        int i = this.uq;
        boolean z = i == 2 || i == 0;
        if (z) {
            this.rz.set(false);
        }
        return !z || super.at();
    }

    @Override // com.bytedance.sdk.openadsdk.fpz.ahm.ahm
    public void kgy() {
        if (this.uq != 1) {
            return;
        }
        super.kgy();
    }

    @Override // com.bytedance.sdk.openadsdk.fpz.ahm.ahm
    public int noq() {
        return 200;
    }

    @Override // com.bytedance.sdk.openadsdk.fpz.ahm.ahm
    public boolean rz() {
        return noq.kgy(this.kgy.get(), this.ahm.ezq()) && this.uq == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.fpz.ahm.ahm
    public void ahm(int i) {
        if (!gf()) {
            if (i == 6 || i == 5) {
                this.uq = 0;
                fi();
            }
            if (i == 3 || i == 2) {
                this.uq = 2;
                fi();
            }
            if (this.uq != 1 && i == 0) {
                this.uq = 1;
                kgy();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.fpz.ahm.ahm
    public void uq() {
        super.uq();
    }
}
