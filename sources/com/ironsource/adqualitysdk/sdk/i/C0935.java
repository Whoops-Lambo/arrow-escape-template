package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.rl3;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᖿ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C0935 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0934 f2522;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f2523;

    public C0935(C0934 c0934, JSONObject jSONObject) {
        this.f2522 = c0934;
        this.f2523 = jSONObject;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        String strM694;
        JSONObject jSONObject;
        C1091 c1091 = this.f2522.f2519;
        JSONObject jSONObject2 = this.f2523;
        c1091.f3167.f2557.m428(jSONObject2);
        C0949 c0949 = c1091.f3167;
        C1051 c1051 = c0949.f2567;
        C4603b c4603b = c0949.f2569;
        if (((C1082) AbstractC1081.m765()).f3120) {
            strM694 = c0949.m725().m694();
        } else {
            C0928 c0928M725 = c0949.m725();
            synchronized (c0928M725) {
                jSONObject = c0928M725.f2544;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(StringFog.decrypt("VPE4\n", "IYNU7+YQOGQ=\n"));
            strM694 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString(StringFog.decrypt("dw==\n", "B+GU7PFvXS8=\n"), c0928M725.f2506) : c0928M725.f2506;
        }
        String str = c4603b.f303;
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        rl3.p(str, "/A==\n", sb, "0+e3kZUAXUw=\n");
        if (strM694 == null) {
            strM694 = "";
        }
        sb.append(strM694);
        String string = sb.toString();
        C0949 c09410 = c1091.f3167;
        C4610d0 c4610d0 = c09410.f2565.f1140;
        Context context = c09410.f2559;
        C1082 c1082 = (C1082) AbstractC1081.m765();
        boolean z = true;
        if (!c1082.m790() || c1082.f3121 == c1082.m792()) {
            z = false;
        }
        C1092 c1092 = new C1092(c1091);
        c1051.getClass();
        if (TextUtils.isEmpty(string)) {
            String str2 = C1051.f3038;
            AbstractC0509.m491(str2, str2, StringFog.decrypt("4nnDpvRnOEvYN9Kr63Y4XMJk1qv1ImpaxmLHt+wifVbDf8e2uFdKc5d40OTqZ2tP2HnRodBjdlvb\nctDk72dqWpd5zbC4cmpQwX7Gofw=\n", "txeixJgCGD8=\n"), true);
            return;
        }
        C1094 c1094 = new C1094(jSONObject2, string, c4610d0, context, z);
        if (c1051.f3039) {
            AbstractC0509.m488(C1051.f3038, StringFog.decrypt("yBPd6N4ILDPvDtno1UY9fLsV3vveDSxB/g3F6MISaWTzGd6t/wM9ZPQO28DQCCh0/g6Q+tAVaWDz\nCcTp3hEn\n", "m3ywjbFmSRM=\n"));
            return;
        }
        C1052 c1052 = new C1052(c1051, c1092, c1094);
        String str3 = AbstractC0388.f814;
        try {
            Executors.newSingleThreadExecutor().execute(c1052);
        } catch (Throwable th) {
            AbstractC1290.m905(AbstractC0388.f814, StringFog.decrypt("33dALPYTxOj/Zkc37V3GsPt2Sy3nE9Xx6W4=\n", "mgUyQ4QzoZA=\n"), th, false);
        }
    }
}
