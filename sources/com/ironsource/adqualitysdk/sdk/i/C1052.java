package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ṛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class C1052 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1051 f3041;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1094 f3042;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0594 f3043;

    public C1052(C1051 c1051, InterfaceC0594 interfaceC0594, C1094 c1094) {
        this.f3041 = c1051;
        this.f3043 = interfaceC0594;
        this.f3042 = c1094;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        boolean z;
        InterfaceC0594 interfaceC0594 = this.f3043;
        C1094 c1094 = this.f3042;
        C0994 c0994 = this.f3041.f3040;
        synchronized (c0994) {
            z = c0994.f2834;
        }
        if (!z) {
            m757(interfaceC0594, c1094);
            return;
        }
        try {
            C0872 c0872M797 = AbstractC1097.m797(c1094.f3177, c1094.f3176, c1094.f3175, c1094.f3174, c1094.f3173);
            if (c0872M797 == null) {
                AbstractC4631n.m401(new C1077(c0872M797, interfaceC0594));
                return;
            }
            String str = c0872M797.f2356;
            AbstractC0509.m489(StringFog.decrypt("1YghCIa9emH6gzQYjL0=\n", "m+1Vf+nPESw=\n"), StringFog.decrypt("iwF1YChlocWvDWQzOmWg1b8ebi46IPLWvgFsYDogoMapHCE3IDG6kKgPdSFzZQ==\n", "zG4BQElF0rA=\n") + str);
            AbstractC4631n.m401(new C1078(c0872M797, interfaceC0594));
        } catch (Exception e) {
            interfaceC0594.mo532(null, StringFog.decrypt("6Slpc4P0cmbTZ3t0gfVycck0fH6CsSB3zTJtYpux\n", "vEcIEe+RUhI=\n") + e.getLocalizedMessage());
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m757(InterfaceC0594 interfaceC0594, C1094 c1094) {
        C0994 c0994 = this.f3041.f3040;
        C1070 c1070 = new C1070(this, interfaceC0594, c1094);
        synchronized (c0994) {
            c0994.f2833.add(c1070);
        }
    }
}
