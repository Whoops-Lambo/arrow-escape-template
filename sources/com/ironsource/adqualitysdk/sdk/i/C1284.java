package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﻛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C1284 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1192 f3842;

    public C1284(C1192 c1192) {
        this.f3842 = c1192;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        try {
            C1192 c1192 = this.f3842;
            c1192.f3594 = Class.forName(c1192.f3589.f3635);
            AbstractC4631n.m401(new C1351(this));
        } catch (ClassNotFoundException e) {
            AbstractC0509.m488(StringFog.decrypt("oBOvg8RQQaygFJOL3F1ZsJM=\n", "4XDb6rI5NdU=\n"), StringFog.decrypt("Pwx3r4Wo70AJCmCunubkCQ4RJaWB7e1dCV5qptc=\n", "en4FwPeIgyk=\n") + this.f3842.f3589.f3635 + StringFog.decrypt("QyA=\n", "eQAXsqyJN4g=\n") + e.getLocalizedMessage());
        }
    }
}
