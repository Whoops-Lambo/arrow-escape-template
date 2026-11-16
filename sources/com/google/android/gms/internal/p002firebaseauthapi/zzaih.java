package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Strings;
import defpackage.d;
import java.text.ParseException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaih {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final zzaje e;

    public static zzaih a(JSONObject jSONObject) {
        long jX;
        String strEmptyToNull = Strings.emptyToNull(jSONObject.optString("phoneInfo"));
        String strEmptyToNull2 = Strings.emptyToNull(jSONObject.optString("mfaEnrollmentId"));
        String strEmptyToNull3 = Strings.emptyToNull(jSONObject.optString("displayName"));
        String strOptString = jSONObject.optString("enrolledAt", "");
        try {
            zzanv zzanvVarA = zzaos.a(strOptString);
            zzaos.b(zzanvVarA);
            jX = zzanvVarA.x();
        } catch (ParseException e) {
            Log.w("MfaInfo", "Could not parse timestamp as ISOString. Invalid ISOString \"" + strOptString + "\"", e);
            jX = 0;
        }
        zzaih zzaihVar = new zzaih(strEmptyToNull, strEmptyToNull2, strEmptyToNull3, jX, jSONObject.opt("totpInfo") != null ? new zzaje() : null);
        jSONObject.optString("unobfuscatedPhoneInfo");
        return zzaihVar;
    }

    public static ArrayList b(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(a(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }

    public zzaih(String str, String str2, String str3, long j, zzaje zzajeVar) {
        if (!TextUtils.isEmpty(str) && zzajeVar != null) {
            Log.e("MfaInfo", "Cannot have both MFA phone_info and totp_info");
            d.r("Cannot have both MFA phone_info and totp_info");
            throw null;
        }
        this.a = str;
        this.b = Preconditions.checkNotEmpty(str2);
        this.c = str3;
        this.d = j;
        this.e = zzajeVar;
    }
}
