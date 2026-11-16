package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.Intent;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᵇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C1002 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0994 f2846;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Context f2847;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Intent f2848;

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        try {
            if (this.f2848.getAction().equals(StringFog.decrypt("swMwNMmY69e8CCBoxZ7hl/wuGwjotMytmzsdEv+uzLGTIxMD\n", "0m1URqbxj/k=\n"))) {
                String str = C0994.f2832;
                AbstractC0509.m495(str, StringFog.decrypt("q4Z3u6Tthc+GjG2irvyahpOKd7Xr/IaOi4Rm\n", "5eMDzMuf7u8=\n"));
                if (this.f2848.getBooleanExtra(StringFog.decrypt("bCjMnuiYiop2LvmY8o8=\n", "AkeP8Yb27+k=\n"), false)) {
                    AbstractC0509.m495(str, StringFog.decrypt("YZJmcRvZBQRblSNtG4oBS0eRI2ARkBhBVo5qdReKDw==\n", "NfoDA37+diQ=\n"));
                    AbstractC4631n.m401(new C1044(this));
                } else if (C0994.m751(this.f2846, this.f2847)) {
                    AbstractC4631n.m401(new C1025(this));
                } else {
                    AbstractC4631n.m401(new C1017(this));
                }
            }
        } catch (Exception e) {
            AbstractC1290.m905(C0994.f2832, StringFog.decrypt("KVifMRpfWLNMRYMMDRxUtBpP\n", "bCrtXmh/Md0=\n"), (Throwable) e, false);
        }
    }

    public C1002(C0994 c0994, Intent intent, Context context) {
        this.f2846 = c0994;
        this.f2848 = intent;
        this.f2847 = context;
    }
}
