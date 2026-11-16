package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import defpackage.q63;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᕝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0915 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C0905 f2420;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1209 f2421;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ String f2422;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0806 f2423;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f2424;

    public C0915(C0905 c0905, String str, AbstractC0806 abstractC0806, String str2, InterfaceC1209 interfaceC1209) {
        this.f2420 = c0905;
        this.f2424 = str;
        this.f2423 = abstractC0806;
        this.f2422 = str2;
        this.f2421 = interfaceC1209;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        boolean z;
        int i;
        String str = this.f2424;
        AbstractC0806 abstractC0806 = this.f2423;
        String str2 = this.f2422;
        InterfaceC1209 interfaceC1209 = this.f2421;
        C0994 c0994 = this.f2420.f2409.f3040;
        synchronized (c0994) {
            z = c0994.f2834;
        }
        if (!z) {
            m682(abstractC0806, interfaceC1209);
            return;
        }
        try {
            C0872 c0872M796 = AbstractC1097.m796(str);
            if (c0872M796 == null || c0872M796.f2355.f2360 != 200) {
                boolean z2 = c0872M796 != null && ((i = c0872M796.f2355.f2360) == 403 || i == 404);
                if (!this.f2420.f2409.f3040.m753()) {
                    m682(abstractC0806, interfaceC1209);
                    return;
                }
                if (z2 && str.contains(StringFog.decrypt("5U2NAQ==\n", "gCP7LjITzZI=\n"))) {
                    abstractC0806.f2113 = false;
                    this.f2420.m678(abstractC0806, interfaceC1209);
                    return;
                }
                if (z2 && str.endsWith(StringFog.decrypt("wtgOy1TWtkLNxQI=\n", "qKthpXqxzGw=\n"))) {
                    abstractC0806.f2112 = false;
                    this.f2420.m678(abstractC0806, interfaceC1209);
                    return;
                }
                int i2 = c0872M796 != null ? c0872M796.f2355.f2360 : -1;
                AbstractC1290.m905(StringFog.decrypt("jDJnmBItXJs=\n", "3lcK92ZIGNk=\n"), StringFog.decrypt("RSzHhJzhhEFmOc2AkOvDBw==\n", "A02u6PmFpCc=\n") + str + StringFog.decrypt("wyOTBwKLE7zPYI8XBt8=\n", "7wPgc2P/Zs8=\n") + i2, (Throwable) null, false);
                this.f2420.getClass();
                AbstractC4631n.m403(new C0913(interfaceC1209, str2, null));
                return;
            }
            String strM681 = m681(c0872M796.f2356);
            if (!Charset.forName(StringFog.decrypt("c09wdeFDBec=\n", "JhxdNLIATK4=\n")).newEncoder().canEncode(strM681)) {
                AbstractC1290.m905(StringFog.decrypt("YTcseI0uPJI=\n", "M1JBF/lLeNA=\n"), StringFog.decrypt("gI98KHWwOzigymwufqkhOuSMbTVh4A==\n", "xOofWgzAT10=\n") + str + StringFog.decrypt("Rh6zaUo1/gIVXbVpSDX7BQJdv29fJuQ=\n", "Zn3cBz5Ul2w=\n"), (Throwable) null, false);
                this.f2420.getClass();
                AbstractC4631n.m403(new C0913(interfaceC1209, str2, null));
                return;
            }
            if (TextUtils.isEmpty(strM681)) {
                AbstractC1290.m905(StringFog.decrypt("l9Kk3oN5AX4=\n", "xbfJsfccRTw=\n"), StringFog.decrypt("1qokqw+KdpT95XS/BYd7mfzlYqwThjQ=\n", "mMUE3nzrFPg=\n") + str, (Throwable) null, false);
                this.f2420.getClass();
                AbstractC4631n.m403(new C0913(interfaceC1209, str2, null));
                return;
            }
            C0969 c0969 = this.f2420.f2410;
            c0969.m742(str2, strM681);
            String str3 = str2 + StringFog.decrypt("VNMW+pER6QgbyxI=\n", "er93ieVkmWw=\n");
            String str4 = AbstractC0388.f814;
            c0969.m742(str3, Long.toString(Calendar.getInstance().getTimeInMillis()));
            this.f2420.getClass();
            AbstractC4631n.m403(new C0913(interfaceC1209, str2, strM681));
        } catch (Exception e) {
            if (!this.f2420.f2409.f3040.m753()) {
                m682(abstractC0806, interfaceC1209);
                return;
            }
            AbstractC1290.m905(StringFog.decrypt("HmtoJFIX+ic=\n", "TA4FSyZyvmU=\n"), q63.i("M7ZsVlBcqBECsHdXRVy9ERuralwCL7sGH6p5GUQOoBlW\n", "dsQeOSJ8z3Q=\n", str), (Throwable) e, false);
            this.f2420.getClass();
            AbstractC4631n.m403(new C0913(interfaceC1209, str2, null));
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m681(String str) throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
        String strOptString = jSONObjectJsonObjectInit.optString(StringFog.decrypt("96Yp\n", "kshKw3wYe2I=\n"));
        if (TextUtils.isEmpty(strOptString)) {
            return str;
        }
        byte[] bArrM456 = AbstractC0388.m456(strOptString, C0905.f2406, jSONObjectJsonObjectInit.optString(StringFog.decrypt("4TY=\n", "iEC6w+2FBKo=\n")), jSONObjectJsonObjectInit.optString(StringFog.decrypt("rdqb9g==\n", "3rv3gr2EFwU=\n")));
        if (bArrM456 == null) {
            return "";
        }
        try {
            if (bArrM456.length >= 2 && (bArrM456[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 31 && (bArrM456[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 139) {
                bArrM456 = AbstractC0439.m473(bArrM456);
            }
            return new String(bArrM456, StringFog.decrypt("IV9mTqw=\n", "dAsgY5TRbzc=\n"));
        } catch (IOException e) {
            AbstractC1290.m905(StringFog.decrypt("xqwfrzym0PE=\n", "lMlywEjDlLM=\n"), StringFog.decrypt("3LWlvgeWqtL/q7alHNiknP69vqEF06ec6aauvRrXpw==\n", "mcfX0XW2w7w=\n"), (Throwable) e, false);
            return "";
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m682(AbstractC0806 abstractC0806, InterfaceC1209 interfaceC1209) {
        C0994 c0994 = this.f2420.f2409.f3040;
        C1013 c1013 = new C1013(this, abstractC0806, interfaceC1209);
        synchronized (c0994) {
            c0994.f2833.add(c1013);
        }
    }
}
