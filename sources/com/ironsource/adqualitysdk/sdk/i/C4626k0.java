package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4626k0 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C4632n0 f378;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ View f379;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f380;

    public C4626k0(C4632n0 c4632n0, Activity activity, View view) {
        this.f378 = c4632n0;
        this.f380 = activity;
        this.f379 = view;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        this.f378.f412.clear();
        C4632n0 c4632n0 = this.f378;
        Activity activity = this.f380;
        View view = this.f379;
        Class cls = c4632n0.f414;
        C4630m0 c4630m0 = c4632n0.f413;
        boolean z = c4630m0.f396;
        List list = c4630m0.f392;
        List list2 = c4630m0.f390;
        ArrayList arrayList = c4632n0.f412;
        if (view != null) {
            AbstractC4634o0.m419(view, cls, null, false, z, list, list2, arrayList);
        } else {
            AbstractC4634o0.m422(activity, cls, -1, null, false, z, list, list2, arrayList);
        }
        View view2 = this.f379;
        C4632n0 c4632n1 = this.f378;
        Class cls2 = c4632n1.f414;
        C4630m0 c4630m1 = c4632n1.f413;
        if (AbstractC4634o0.m424(view2, cls2, null, c4630m1.f392, c4630m1.f390)) {
            this.f378.f412.add(this.f379);
        }
        ArrayList arrayList2 = new ArrayList(this.f378.f412);
        C4632n0 c4632n2 = this.f378;
        if (c4632n2.f413.f393) {
            AbstractC4631n.m403(new C4624j0(this, arrayList2));
        } else {
            C4632n0.m407(c4632n2, arrayList2);
        }
    }
}
