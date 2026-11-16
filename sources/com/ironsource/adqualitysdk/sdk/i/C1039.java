package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.Ḭ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C1039 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0971 f3020;

    public C1039(C0971 c0971) {
        this.f3020 = c0971;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C0971 c0971 = this.f3020;
        WeakHashMap weakHashMap = (WeakHashMap) arrayList.get(0);
        c0971.getClass();
        return new C0997(c0971, weakHashMap, c0752);
    }
}
