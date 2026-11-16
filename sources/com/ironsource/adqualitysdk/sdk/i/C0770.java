package com.ironsource.adqualitysdk.sdk.i;

import com.hyprmx.android.sdk.core.DependencyHolder;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.Ꭲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C0770 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0745 f2033;

    public C0770(C0745 c0745) {
        this.f2033 = c0745;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C0745 c0745 = this.f2033;
        DependencyHolder dependencyHolder = (DependencyHolder) arrayList.get(0);
        c0745.getClass();
        return dependencyHolder.getPreloadedData();
    }
}
