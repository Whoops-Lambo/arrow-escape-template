package com.bytedance.adsdk.ugeno.yoga.ahm;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.yoga.nu;
import com.bytedance.adsdk.ugeno.yoga.ra;
import com.bytedance.adsdk.ugeno.yoga.yo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class ahm extends ViewGroup {
    public ra getYogaNode() {
        throw null;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof ahm) {
            throw null;
        }
        ra raVarKgy = nu.kgy();
        rz.kgy(new rz.kgy(layoutParams), raVarKgy, view);
        raVarKgy.kgy(view);
        raVarKgy.kgy((yo) new rz.ahm());
        throw null;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof rz.kgy;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new rz.kgy(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new rz.kgy(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw new RuntimeException("Attempting to layout a VirtualYogaLayout");
    }
}
