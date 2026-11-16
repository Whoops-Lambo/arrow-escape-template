package com.bytedance.sdk.openadsdk.fpz.ahm;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.ioy;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class rz extends ahm {
    private int uq;

    public rz(Integer num, View view, ioy ioyVar, ct.kgy kgyVar) {
        super(num, view, ioyVar, 1000, kgyVar);
        this.uq = -1;
        ahm(view);
    }

    private void ahm(View view) {
        if (view != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            this.uq = width * height >= 242500 ? 1 : 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.fpz.ahm.ahm
    public int noq() {
        ioy ioyVar = this.ahm;
        return (ioyVar != null && ioyVar.lb() && this.ahm.uju() == 1) ? 1000 : 100;
    }

    @Override // com.bytedance.sdk.openadsdk.fpz.ahm.ahm
    public boolean rz() {
        WeakReference<View> weakReference = this.kgy;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        View view = this.kgy.get();
        if (this.uq == -1) {
            ahm(view);
        }
        return noq.kgy(view, this.uq == 1, this.ahm.ezq());
    }

    @Override // com.bytedance.sdk.openadsdk.fpz.ahm.ahm
    public void uq() {
        super.uq();
    }

    @Override // com.bytedance.sdk.openadsdk.fpz.ahm.ahm
    public void ahm(int i) {
    }
}
