package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ი, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C0766 {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final String f2017;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String f2018;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final List f2019;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final JSONObject f2020;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final ISAdQualityAdType f2021;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String f2022;

    static {
        StringFog.decrypt("K4hHkg==\n", "X/E394o1yEQ=\n");
        StringFog.decrypt("gOcnNbkt\n", "4YNzTMlIK7o=\n");
        StringFog.decrypt("5VKaUBn5\n", "lTPoMXSKOjw=\n");
        StringFog.decrypt("JIPnXyUg1LUgkw==\n", "ReCTNlNJoNw=\n");
        StringFog.decrypt("D4pYMtvtfZ0ckQ==\n", "eeM9RZ2EEek=\n");
        StringFog.decrypt("G26tfbMXwqArbrtfvwA=\n", "bAvPK9pytdM=\n");
    }

    public C0766(JSONObject jSONObject) {
        this.f2021 = ISAdQualityAdType.UNKNOWN;
        this.f2022 = AbstractC0475.m485(jSONObject.optString(StringFog.decrypt("HpxBow==\n", "auUxxodnRMs=\n")));
        String strM485 = AbstractC0475.m485(jSONObject.optString(StringFog.decrypt("8n9P8X4R\n", "kxsbiA500Rk=\n")));
        if (!TextUtils.isEmpty(strM485)) {
            this.f2021 = ISAdQualityAdType.fromInt(Integer.parseInt(strM485));
        }
        this.f2020 = jSONObject.optJSONObject(StringFog.decrypt("pqHNNrJN\n", "1sC/V98+N18=\n"));
        String strDecrypt = StringFog.decrypt("Xn2SNsSBZ7pabQ==\n", "Px7mX7LoE9M=\n");
        List arrayList = new ArrayList();
        String str = AbstractC1125.f3265;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(strDecrypt);
        this.f2019 = jSONArrayOptJSONArray != null ? AbstractC1125.m831(jSONArrayOptJSONArray) : arrayList;
        this.f2018 = AbstractC0475.m485(jSONObject.optString(StringFog.decrypt("HLShJSI3HV4Prw==\n", "at3EUmRecSo=\n")));
        this.f2017 = AbstractC0475.m485(jSONObject.optString(StringFog.decrypt("I1ANuooHT94TUBuYhhA=\n", "VDVv7ONiOK0=\n")));
    }
}
