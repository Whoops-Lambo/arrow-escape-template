package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ト, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC1149 implements InterfaceC0696 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static final String f3330 = StringFog.decrypt("/ieYmebQVHrNE6KX8M0=\n", "v0PQ+Ii0OB8=\n");

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final C1151 f3331 = new C1151();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public InterfaceC0696 f3332;

    /* JADX INFO: renamed from: ﾒ */
    public abstract String mo354(Object obj);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m843(JSONObject jSONObject, Object obj) {
        try {
            String str = AbstractC1219.f3711;
            if (!jSONObject.has(str)) {
                jSONObject.put(str, mo354(obj));
            }
            String str2 = AbstractC1219.f3710;
            if (!jSONObject.has(str2)) {
                String str3 = AbstractC0388.f814;
                jSONObject.put(str2, Calendar.getInstance().getTimeInMillis());
            }
            return jSONObject;
        } catch (JSONException e) {
            String str4 = f3330;
            AbstractC0509.m497(str4, str4, StringFog.decrypt("Ibh0GtS/QB4Bq3IcyPgDCRKvaAGG9VADCg==\n", "ZMoGdaafI2w=\n"), e, null, false);
            return jSONObject;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0696
    /* JADX INFO: renamed from: ﻐ */
    public final void mo368(JSONObject jSONObject, View view, Object obj) {
        JSONObject jSONObjectM843 = m843(jSONObject, obj);
        m844(StringFog.decrypt("GPMqQXk8LeYt4zdBLA==\n", "W4ZZNRZRDYM=\n"), jSONObjectM843);
        InterfaceC0696 interfaceC0696 = this.f3332;
        if (interfaceC0696 == null) {
            interfaceC0696 = this.f3331;
        }
        interfaceC0696.mo368(jSONObjectM843, view, obj);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0696
    /* JADX INFO: renamed from: ﻛ */
    public void mo350(JSONObject jSONObject, View view, Object obj) {
        JSONObject jSONObjectM843 = m843(jSONObject, obj);
        m844(StringFog.decrypt("klF7JfYb12myTD4lvw3fcaFUYQ==\n", "0zVbQZ9opwU=\n"), jSONObjectM843);
        InterfaceC0696 interfaceC0696 = this.f3332;
        if (interfaceC0696 == null) {
            interfaceC0696 = this.f3331;
        }
        interfaceC0696.mo350(jSONObjectM843, view, obj);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0696
    /* JADX INFO: renamed from: ｋ */
    public void mo352(JSONObject jSONObject, View view, Object obj) {
        JSONObject jSONObjectM843 = m843(jSONObject, obj);
        m844(StringFog.decrypt("C1/8oLbfzu4rQrmg5Q==\n", "SjvcxN+svoI=\n"), jSONObjectM843);
        InterfaceC0696 interfaceC0696 = this.f3332;
        if (interfaceC0696 == null) {
            interfaceC0696 = this.f3331;
        }
        interfaceC0696.mo352(jSONObjectM843, view, obj);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0696
    /* JADX INFO: renamed from: ﾇ */
    public final void mo373(JSONObject jSONObject, View view, Q0 q0, Object obj) {
        JSONObject jSONObjectM843 = m843(jSONObject, obj);
        m844(StringFog.decrypt("FASdpAsyxOwwBIc=\n", "VWC9x2dbp4c=\n"), jSONObjectM843);
        InterfaceC0696 interfaceC0696 = this.f3332;
        if (interfaceC0696 == null) {
            interfaceC0696 = this.f3331;
        }
        interfaceC0696.mo373(jSONObjectM843, view, q0, obj);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0696
    /* JADX INFO: renamed from: ﾇ */
    public final void mo374(JSONObject jSONObject, View view, Object obj) {
        JSONObject jSONObjectM843 = m843(jSONObject, obj);
        m844(StringFog.decrypt("Y82TZ2dHP6VG\n", "IqmzBAsoTMA=\n"), jSONObjectM843);
        InterfaceC0696 interfaceC0696 = this.f3332;
        if (interfaceC0696 == null) {
            interfaceC0696 = this.f3331;
        }
        interfaceC0696.mo374(jSONObjectM843, view, obj);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0696
    /* JADX INFO: renamed from: ﾒ */
    public final void mo379(JSONObject jSONObject, View view, Q0 q0, Object obj) {
        JSONObject jSONObjectM843 = m843(jSONObject, obj);
        m844(StringFog.decrypt("Yv8x1OL7BDdG/zHR/P0KfEnoKw==\n", "I5sRt46SZ1w=\n"), jSONObjectM843);
        InterfaceC0696 interfaceC0696 = this.f3332;
        if (interfaceC0696 == null) {
            interfaceC0696 = this.f3331;
        }
        interfaceC0696.mo379(jSONObjectM843, view, q0, obj);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0696
    /* JADX INFO: renamed from: ﾒ */
    public final void mo380(JSONObject jSONObject, View view, Object obj) {
        JSONObject jSONObjectM843 = m843(jSONObject, obj);
        m844(StringFog.decrypt("yhJXAzrQcJLdGFoRfos=\n", "vHsydBqxBOY=\n"), jSONObjectM843);
        InterfaceC0696 interfaceC0696 = this.f3332;
        if (interfaceC0696 == null) {
            interfaceC0696 = this.f3331;
        }
        interfaceC0696.mo380(jSONObjectM843, view, obj);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0696
    /* JADX INFO: renamed from: ﾒ */
    public final void mo377(JSONObject jSONObject, View view, L0 l0, Object obj) {
        JSONObject jSONObjectM843 = m843(jSONObject, obj);
        m844(StringFog.decrypt("qLqP9/26H8yL4w==\n", "/9ns15jMeqI=\n"), jSONObjectM843);
        InterfaceC0696 interfaceC0696 = this.f3332;
        if (interfaceC0696 == null) {
            interfaceC0696 = this.f3331;
        }
        interfaceC0696.mo377(jSONObjectM843, view, l0, obj);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m844(String str, JSONObject jSONObject) {
        String str2 = f3330;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        AbstractC0509.m496(str2, str2, AbstractC0529.m515("K2Dg\n", "C03AcmefK4c=\n", sb, str), jSONObject, false);
    }
}
