package com.bytedance.sdk.openadsdk.core.twf;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.protos.Sdk;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class ra {
    private final URL ahm;
    private final String kgy;
    private final String rz;
    private final String uq;

    public static ra kgy(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("apiFramework");
            String strOptString2 = jSONObject.optString("javascriptResourceUrl");
            if (CampaignEx.KEY_OMID.equalsIgnoreCase(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                return new ra(strOptString2, jSONObject.optString("vendorKey"), jSONObject.optString("verificationParameters"), jSONObject.optString("verificationNotExecuted"));
            }
            return null;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+CyGFw==", "becoggK+YMuJXs5riR+kJ0k=", "WPwolBe5X8KOTthPqgOvJXH9Ips=", 135);
            return null;
        }
    }

    public String ahm() {
        return this.rz;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (kgy(this.kgy, raVar.kgy) && kgy(this.ahm, raVar.ahm) && kgy(this.rz, raVar.rz)) {
            return kgy(this.uq, raVar.uq);
        }
        return false;
    }

    public int hashCode() {
        String str = this.kgy;
        int iHashCode = (this.ahm.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.rz;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.uq;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public URL rz() {
        return this.ahm;
    }

    private ra(String str, String str2, String str3, String str4) throws MalformedURLException {
        this.kgy = str2;
        this.ahm = new URL(str);
        this.rz = str3;
        this.uq = str4;
    }

    private boolean kgy(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static ra kgy(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new ra(str, str2, str3, str4);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+CyGFw==", "becoggK+YMuJXs5riR+kJ0k=", "WPwolBe5X8KOTthP", Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
            return null;
        }
    }

    public String kgy() {
        return this.kgy;
    }

    public static HashSet<ra> kgy(JSONArray jSONArray) {
        HashSet<ra> hashSet = new HashSet<>();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    hashSet.add(kgy(jSONArray.getJSONObject(i)));
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+CyGFw==", "becoggK+YMuJXs5riR+kJ0k=", "WPwolBe5X8KOTthPvxS0DknhIL8Qs2c=", 149);
                    return hashSet;
                }
            }
        }
        return hashSet;
    }
}
