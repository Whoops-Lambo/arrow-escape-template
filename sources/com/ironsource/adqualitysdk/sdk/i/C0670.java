package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ږ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C0670 implements InterfaceC1265 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0510 f1729;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ String f1730;

    public C0670(C0510 c0510, String str) {
        this.f1729 = c0510;
        this.f1730 = str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1265
    /* JADX INFO: renamed from: ﾒ */
    public final void mo418() {
        C0839 c0839;
        AbstractC1081 abstractC1081M765 = AbstractC1081.m765();
        String strDecrypt = StringFog.decrypt("pd+smEnx\n", "1rDD9SWQdrs=\n");
        String str = this.f1730;
        C1082 c1082 = (C1082) abstractC1081M765;
        if (strDecrypt != null) {
            c0839 = (C0839) c1082.mo781().get(strDecrypt);
        } else {
            c1082.getClass();
            c0839 = null;
        }
        if (c0839 != null && c0839.m626(str)) {
            C1328 c1328 = this.f1729.f1142;
            String str2 = C1328.f3948;
            c1328.m964(true);
        }
    }
}
