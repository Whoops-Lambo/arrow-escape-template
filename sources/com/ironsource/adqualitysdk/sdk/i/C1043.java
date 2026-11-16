package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.Ḷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C1043 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0992 f3026;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ ViewOnLayoutChangeListenerC1061 f3027;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1046 f3028;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f3029;

    public C1043(C0992 c0992, ViewGroup viewGroup, C1046 c1046, ViewOnLayoutChangeListenerC1061 viewOnLayoutChangeListenerC1061) {
        this.f3026 = c0992;
        this.f3029 = viewGroup;
        this.f3028 = c1046;
        this.f3027 = viewOnLayoutChangeListenerC1061;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        C0992 c0992 = this.f3026;
        ViewGroup viewGroup = this.f3029;
        C1046 c1046 = this.f3028;
        c0992.getClass();
        View.OnTouchListener onTouchListenerM685 = AbstractC0924.m685(viewGroup);
        if (!(onTouchListenerM685 instanceof ViewOnTouchListenerC1231)) {
            viewGroup.setOnTouchListener(new ViewOnTouchListenerC1231(onTouchListenerM685, c1046));
        }
        int i = 0;
        while (true) {
            int childCount = this.f3029.getChildCount();
            ViewGroup viewGroup2 = this.f3029;
            if (i >= childCount) {
                viewGroup2.removeOnLayoutChangeListener(this.f3027);
                this.f3029.addOnLayoutChangeListener(this.f3027);
                return;
            }
            View childAt = viewGroup2.getChildAt(i);
            boolean z = childAt instanceof ViewGroup;
            C0992 c0993 = this.f3026;
            if (z) {
                ViewOnLayoutChangeListenerC1061 viewOnLayoutChangeListenerC1061 = this.f3027;
                c0993.getClass();
                new Handler(Looper.getMainLooper()).post(new C1043(c0993, (ViewGroup) childAt, new C1046(c0993), viewOnLayoutChangeListenerC1061));
            } else {
                C1046 c1047 = this.f3028;
                c0993.getClass();
                View.OnTouchListener onTouchListenerM686 = AbstractC0924.m685(childAt);
                if (!(onTouchListenerM686 instanceof ViewOnTouchListenerC1231)) {
                    childAt.setOnTouchListener(new ViewOnTouchListenerC1231(onTouchListenerM686, c1047));
                }
            }
            i++;
        }
    }
}
