package com.bytedance.sdk.openadsdk.core.gf.kgy;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.xh;
import com.bytedance.sdk.openadsdk.utils.gbb;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class rz implements com.bytedance.sdk.openadsdk.twf.kgy {
    private final View kgy;

    @Override // com.bytedance.sdk.openadsdk.twf.kgy
    public int ahm() {
        View view = this.kgy;
        int measuredWidth = view != null ? view.getMeasuredWidth() : -1;
        return measuredWidth <= 0 ? gbb.uq(xh.kgy()) : measuredWidth;
    }

    @Override // com.bytedance.sdk.openadsdk.twf.kgy
    public int kgy() {
        View view = this.kgy;
        int measuredHeight = view != null ? view.getMeasuredHeight() : -1;
        return measuredHeight <= 0 ? gbb.noq(xh.kgy()) : measuredHeight;
    }

    public rz(View view) {
        this.kgy = view;
    }
}
