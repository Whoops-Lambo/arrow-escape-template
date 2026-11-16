package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᗁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C0937 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final /* synthetic */ C0933 f2525;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C1057 f2526;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ boolean f2527;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f2528;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f2529;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f2530;

    public C0937(C0933 c0933, String str, JSONObject jSONObject, JSONObject jSONObject2, boolean z, C1057 c1057) {
        this.f2525 = c0933;
        this.f2530 = str;
        this.f2529 = jSONObject;
        this.f2528 = jSONObject2;
        this.f2527 = z;
        this.f2526 = c1057;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() throws JSONException {
        if (this.f2530.equals(StringFog.decrypt("s21X7Vqgz4G0aWnsSw==\n", "xx0Inj/TvN4=\n"))) {
            this.f2525.f2515++;
        }
        C0933 c0933 = this.f2525;
        int i = c0933.f2514;
        c0933.f2514 = i + 1;
        JSONObject jSONObjectM833 = AbstractC1125.m833(this.f2529, false);
        jSONObjectM833.put(StringFog.decrypt("NuoyKg==\n", "WItfTz53dsM=\n"), this.f2530);
        jSONObjectM833.put(StringFog.decrypt("y/E=\n", "rp9W4rpMTuM=\n"), i);
        String strDecrypt = StringFog.decrypt("24UFd37waPnE\n", "r/dkFBuSCZo=\n");
        JSONObject jSONObject = this.f2528;
        if (jSONObject != null) {
            strDecrypt = jSONObject.optString(AbstractC1219.f3715);
            String str = AbstractC1219.f3669;
            jSONObjectM833.put(str, this.f2528.optString(str, null));
        }
        if (TextUtils.isEmpty(strDecrypt)) {
            strDecrypt = StringFog.decrypt("MjZ3Mw==\n", "XFkZVj9wxIM=\n");
        }
        jSONObjectM833.put(AbstractC1219.f3714, strDecrypt);
        String str2 = AbstractC1219.f3713;
        if (!jSONObjectM833.has(str2)) {
            jSONObjectM833.put(str2, strDecrypt);
        }
        AbstractC4631n.m402(new C0942(this, this.f2525.mo486(jSONObjectM833, this.f2527, true, this.f2530.equals(StringFog.decrypt("2bkTQ5vYXA==\n", "rclMKvWxKHY=\n")))));
    }
}
