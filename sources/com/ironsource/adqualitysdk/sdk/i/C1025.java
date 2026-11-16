package com.ironsource.adqualitysdk.sdk.i;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᵟ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C1025 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1002 f2999;

    public C1025(C1002 c1002) {
        this.f2999 = c1002;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        HashSet hashSet;
        C0994.m750(this.f2999.f2846, true);
        C0994 c0994 = this.f2999.f2846;
        synchronized (c0994) {
            hashSet = new HashSet(c0994.f2833);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((InterfaceC0610) it.next()).mo556();
        }
    }
}
