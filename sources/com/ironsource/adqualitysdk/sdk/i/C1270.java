package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﺣ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C1270 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1258 f3823;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1059 f3824;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1327 f3825;

    public C1270(C1258 c1258, C1327 c1327, C1059 c1059) {
        this.f3823 = c1258;
        this.f3825 = c1327;
        this.f3824 = c1059;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        C1059 c1059;
        int iM505;
        try {
            C1258 c1258 = this.f3823;
            C0969 c0969 = c1258.f3807;
            String str = c1258.f3808 + StringFog.decrypt("jw==\n", "paaHGq0WwDo=\n");
            C0571 c0571 = c0969.f2592;
            c0571.getClass();
            try {
                iM505 = c0571.f1401.m505(str);
            } catch (Throwable unused) {
                iM505 = 0;
            }
            this.f3823.getClass();
            if (iM505 <= 10000) {
                C1258 c1259 = this.f3823;
                C1327 c1327 = this.f3825;
                c1259.getClass();
                String str2 = c1259.f3808 + c1327.f3944;
                if (TextUtils.isEmpty(str2)) {
                    AbstractC0509.m497(C1258.m898(this.f3823), StringFog.decrypt("agBS2lrf99tbAFbX\n", "KWExsj+Mg7Q=\n"), StringFog.decrypt("EWlfIarqcs8nYFJzqsBggWJ1FjXv9yGcMW5EM+3mIYQgeBY05fEhgCdrUzH+\n", "RQE2UoqDAe8=\n"), null, null, true);
                    if (c1059 != null) {
                        return;
                    } else {
                        return;
                    }
                } else {
                    try {
                        String string = this.f3825.m945().toString();
                        AbstractC0509.m496(C1258.m898(this.f3823), StringFog.decrypt("QYJSCilgva9wglYH\n", "AuMxYkwzycA=\n"), StringFog.decrypt("oNYTn/qGMCqM1RqS8Jxt\n", "47dw95PoVwo=\n"), string, true);
                        this.f3823.f3807.m742(str2, string);
                    } catch (JSONException unused2) {
                        if (c1059 != null) {
                            return;
                        } else {
                            return;
                        }
                    }
                }
            }
        } finally {
            c1059 = this.f3824;
            if (c1059 != null) {
                AbstractC4631n.m402(c1059);
            }
        }
    }
}
