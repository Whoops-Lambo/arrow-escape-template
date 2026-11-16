package com.bytedance.sdk.openadsdk.core.yo.kgy;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.adexpress.ahm.nu;
import com.bytedance.sdk.openadsdk.core.ahm.rz;
import com.bytedance.sdk.openadsdk.core.model.dg;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class kgy extends rz implements com.bytedance.sdk.component.adexpress.dynamic.noq.kgy {
    private nu ahm;
    protected WeakReference<View> kgy;

    private void kgy(View view, int i, float f, float f2, float f3, float f4, SparseArray<rz.kgy> sparseArray) {
        if (this.ahm != null) {
            String strValueOf = "";
            try {
                int i2 = com.bytedance.sdk.component.adexpress.dynamic.kgy.gm;
                if (view.getTag(i2) != null) {
                    strValueOf = String.valueOf(view.getTag(i2));
                }
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V6jSbArFgxM5axVKYHqMnVw==", "f/cjlA61auSMQ9RWoBizPF7gKIc=", "c+8jkQ+5Td6OS9pUjzKsIVjlCIMGsn0=", 74);
            }
            this.ahm.kgy(view, i, new dg.kgy().uq(f).rz(f2).ahm(f3).kgy(f4).ahm(this.lqi).kgy(this.fpz).kgy(sparseArray).kgy(this.vg).kgy(strValueOf).kgy());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.noq.kgy
    public void kgy(nu nuVar) {
        this.ahm = nuVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.noq.kgy
    public void kgy(View view) {
        this.kgy = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ahm.rz
    public void kgy(View view, float f, float f2, float f3, float f4, SparseArray<rz.kgy> sparseArray, boolean z) {
        kgy(view, ((Integer) view.getTag()).intValue(), f, f2, f3, f4, sparseArray);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ahm.rz
    public void kgy(View view, boolean z) {
    }
}
