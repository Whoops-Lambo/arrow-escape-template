package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ỉ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C1070 implements InterfaceC0610 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1052 f3090;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1094 f3091;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0594 f3092;

    public C1070(C1052 c1052, InterfaceC0594 interfaceC0594, C1094 c1094) {
        this.f3090 = c1052;
        this.f3092 = interfaceC0594;
        this.f3091 = c1094;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0610
    /* JADX INFO: renamed from: ﾒ */
    public final void mo556() {
        C0994 c0994 = this.f3090.f3041.f3040;
        synchronized (c0994) {
            c0994.f2833.remove(this);
        }
        C1051 c1051 = this.f3090.f3041;
        InterfaceC0594 interfaceC0594 = this.f3092;
        C1094 c1094 = this.f3091;
        if (c1051.f3039) {
            AbstractC0509.m488(C1051.f3038, StringFog.decrypt("yBPd6N4ILDPvDtno1UY9fLsV3vveDSxB/g3F6MISaWTzGd6t/wM9ZPQO28DQCCh0/g6Q+tAVaWDz\nCcTp3hEn\n", "m3ywjbFmSRM=\n"));
            return;
        }
        C1052 c1052 = new C1052(c1051, interfaceC0594, c1094);
        String str = AbstractC0388.f814;
        try {
            Executors.newSingleThreadExecutor().execute(c1052);
        } catch (Throwable th) {
            AbstractC1290.m905(AbstractC0388.f814, StringFog.decrypt("33dALPYTxOj/Zkc37V3GsPt2Sy3nE9Xx6W4=\n", "mgUyQ4QzoZA=\n"), th, false);
        }
    }
}
