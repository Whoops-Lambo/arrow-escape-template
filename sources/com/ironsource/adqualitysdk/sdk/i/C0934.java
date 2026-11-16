package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᖾ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C0934 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0933 f2518;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1091 f2519;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONArray f2520;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ boolean f2521;

    public C0934(C0933 c0933, boolean z, JSONArray jSONArray, C1091 c1091) {
        this.f2518 = c0933;
        this.f2521 = z;
        this.f2520 = jSONArray;
        this.f2519 = c1091;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() throws JSONException {
        JSONObject jSONObjectMo486 = this.f2518.mo486(null, this.f2521, false, false);
        try {
            jSONObjectMo486.put(StringFog.decrypt("Nk20/BlS\n", "UzvRkm0hT30=\n"), this.f2520);
        } catch (JSONException e) {
            String strDecrypt = StringFog.decrypt("DtInkXyQUj08+TCYa5B8OyHZNJxxi0k=\n", "T7xG/QXkO14=\n");
            AbstractC0509.m497(strDecrypt, strDecrypt, StringFog.decrypt("Pq1xhU7SQFoevneDUpUDTQ26bZ5xl1dJ\n", "e98D6jzyIyg=\n"), e, null, false);
        }
        AbstractC4631n.m402(new C0935(this, jSONObjectMo486));
    }
}
