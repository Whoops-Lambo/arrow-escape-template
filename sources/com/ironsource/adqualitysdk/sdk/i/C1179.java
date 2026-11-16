package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.בּ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1179 implements InterfaceC0594 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1082 f3484;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C4610d0 f3485;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ Context f3486;

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0594
    /* JADX INFO: renamed from: ﾒ */
    public final void mo531(C0872 c0872) {
        JSONObject jSONObject;
        try {
            C0875 c0875 = c0872.f2355;
            int i = c0875.f2360;
            String str = c0875.f2359;
            if (i >= 200 && i <= 299) {
                JSONObject jSONObjectJsonObjectInit = !TextUtils.isEmpty(c0872.f2356) ? IronSourceNetworkBridge.jsonObjectInit(c0872.f2356) : IronSourceNetworkBridge.jsonObjectInit();
                if (jSONObjectJsonObjectInit.optBoolean(StringFog.decrypt("Ocdc\n", "SqMwi6LzZHU=\n"))) {
                    C1328.m948().m955();
                }
                String strDecrypt = StringFog.decrypt("gQE+oVKP62S9Ajqp\n", "02RTzibqqAs=\n");
                AbstractC0509.m496(strDecrypt, strDecrypt, StringFog.decrypt("7Ej8ilHQ6KzKUfOQFNH+qdpU6YxQg/il0Vv2jg4=\n", "vz2f6TSjm8o=\n"), jSONObjectJsonObjectInit, true);
                JSONObject jSONObjectM833 = AbstractC1125.m833(jSONObjectJsonObjectInit, false);
                C1082 c1082 = this.f3484;
                long jOptLong = jSONObjectM833.optLong(StringFog.decrypt("FnpOgA==\n", "ehk68xvmdpQ=\n"), 0L);
                if (!c1082.f3117) {
                    C0969 c0969 = c1082.f3133;
                    c0969.getClass();
                    C0969.m739().post(new C0990(c0969, C1082.f3110, "" + jOptLong));
                    c1082.f3117 = true;
                }
                jSONObjectM833.remove(StringFog.decrypt("r2n+\n", "3B2NAu2zwu4=\n"));
                C0969 c09610 = this.f3484.f3133;
                String strDecrypt2 = StringFog.decrypt("3rn+bdQoRPvPu/Jr1w==\n", "rNqRA7JBI9U=\n");
                String string = jSONObjectM833.toString();
                c09610.getClass();
                C0969.m739().post(new C0979(c09610, strDecrypt2, string));
                String strDecrypt3 = StringFog.decrypt("7vM=\n", "moBHZYV7l1A=\n");
                String str2 = AbstractC0388.f814;
                jSONObjectJsonObjectInit.put(strDecrypt3, Calendar.getInstance().getTimeInMillis());
                jSONObjectJsonObjectInit.put(StringFog.decrypt("rO0=\n", "2ZmTYh5GGPE=\n"), SystemClock.elapsedRealtime());
                jSONObjectJsonObjectInit.put(StringFog.decrypt("LgJrFw==\n", "Q28KYSAI6vU=\n"), AbstractC1334.m969(this.f3486));
                C1082 c1083 = this.f3484;
                long j = c0872.f2354;
                c1083.getClass();
                if (jSONObjectJsonObjectInit.has(StringFog.decrypt("GzPM\n", "aEe/31NtZHI=\n"))) {
                    try {
                        jSONObjectJsonObjectInit.put(StringFog.decrypt("1ErA\n", "pz6z/NDNdhE=\n"), jSONObjectJsonObjectInit.optLong(StringFog.decrypt("Jmxo\n", "VRgbE4YFxpY=\n")) + (j / 2));
                    } catch (JSONException unused) {
                    }
                }
                this.f3484.mo706(jSONObjectJsonObjectInit);
                this.f3484.m793();
                this.f3484.m789();
                C1082 c1084 = this.f3484;
                synchronized (c1084) {
                    jSONObject = c1084.f2544;
                }
                m869(jSONObject.optInt(StringFog.decrypt("50DD\n", "hCG3jF3h2n4=\n"), c1084.f3138));
                if (this.f3484.m790()) {
                    C1082 c1085 = this.f3484;
                    if (c1085.f3121 == c1085.m792()) {
                        AbstractC1290.m905(StringFog.decrypt("NUY3Z3UhvkoJRTNv\n", "ZyNaCAFE/SU=\n"), StringFog.decrypt("BGyDSo69gGo2YJ1Zj+/UY3dsn1+ZttB4eG2UX5m20Hh7KZhSgrvJbTtgi1mP79dlI2HRTIeuyWJ3\nYJ9Vn+/SaSZ8lE+f\n", "VwnxPOvPoAw=\n"), (Throwable) null, true);
                        return;
                    }
                    return;
                }
                return;
            }
            mo532(c0872, str);
        } catch (Exception e) {
            try {
                AbstractC1290.m906(StringFog.decrypt("f2BvFNUBRX5DY2sc\n", "LQUCe6FkBhE=\n"), StringFog.decrypt("N7Fo/gdyL+kAsHP/EnIt7R+sbvRVMTDmFKp9sR8hMOY=\n", "csMakXVSX4g=\n"), e, false, true, false);
            } catch (Throwable unused2) {
            }
        }
    }

    public C1179(C1082 c1082, Context context, C4610d0 c4610d0) {
        this.f3484 = c1082;
        this.f3486 = context;
        this.f3485 = c4610d0;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0594
    /* JADX INFO: renamed from: ﾒ */
    public final void mo532(C0872 c0872, String str) {
        JSONObject jSONObject;
        int i = c0872 != null ? c0872.f2355.f2360 : -1;
        AbstractC0509.m490(StringFog.decrypt("tATTHz7Hz/2IB9cX\n", "5mG+cEqijJI=\n"), StringFog.decrypt("W1o2t272xNZqXC22e/bA3HBOLb88sNHccwg3vW6gxsEkCA==\n", "HihE2BzWo7M=\n") + i);
        if (i != 403) {
            C1082 c1082 = this.f3484;
            int i2 = c1082.f3121;
            c1082.f3121 = i2 + 1;
            if (i2 < c1082.m792()) {
                C1082 c1083 = this.f3484;
                synchronized (c1083) {
                    jSONObject = c1083.f2544;
                }
                m869(jSONObject.optInt(StringFog.decrypt("TxbV\n", "LGSh2K0oHBA=\n"), c1083.f3139));
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m869(int i) {
        synchronized (this.f3484) {
            try {
                if (this.f3484.f3131 != null) {
                    AbstractC4631n.m406(new C1212(this), i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
