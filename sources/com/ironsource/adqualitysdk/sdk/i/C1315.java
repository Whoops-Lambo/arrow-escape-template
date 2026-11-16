package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import defpackage.nj;
import defpackage.q63;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ｚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C1315 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1258 f3926;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1138 f3927;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ int f3928;

    public C1315(C1258 c1258, int i, C1138 c1138) {
        this.f3926 = c1258;
        this.f3928 = i;
        this.f3927 = c1138;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        HashMap map;
        ArrayList arrayList = new ArrayList();
        C1258 c1258 = this.f3926;
        C0969 c0969 = c1258.f3807;
        String strQ = nj.q(new StringBuilder(), c1258.f3808, StringFog.decrypt("ZA==\n", "TjSIeA+Eb3M=\n"));
        int i = this.f3928;
        C0571 c0571 = c0969.f2592;
        c0571.getClass();
        try {
            HashMap mapM507 = c0571.f1401.m507(strQ, i);
            map = new HashMap();
            for (String str : mapM507.keySet()) {
                String str2 = (String) mapM507.get(str);
                if (str2 != null && !TextUtils.isEmpty(str2)) {
                    try {
                        map.put(str, c0571.f1402.m524(str2));
                    } catch (C0579 unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
            map = null;
        }
        for (String str3 : map.values()) {
            try {
                JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str3);
                arrayList.add(new C1327(jSONObjectJsonObjectInit.optString(StringFog.decrypt("CRQDCw==\n", "fGFqb/WlV14=\n")), jSONObjectJsonObjectInit.getJSONObject(StringFog.decrypt("hVqcuZ2v7ec=\n", "9TXvzdnOmYY=\n"))));
            } catch (Exception unused3) {
                AbstractC0509.m497(C1258.m898(this.f3926), StringFog.decrypt("7RuYFu6w3hbcG5wb\n", "rnr7fovjqnk=\n"), q63.i("mdLHqc8SH0D63sCgyghdFLnc0a3OGBhRrNjcsYVcS0Co1NyiiwpZWK/YiOU=\n", "2r2yxat8ODQ=\n", str3), null, null, true);
            }
        }
        AbstractC4631n.m402(new C1324(this, arrayList));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo587(Throwable th) {
        super.mo587(th);
        AbstractC4631n.m402(new C1321(this));
    }
}
