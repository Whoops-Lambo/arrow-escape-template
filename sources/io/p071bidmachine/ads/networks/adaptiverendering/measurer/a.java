package io.p071bidmachine.ads.networks.adaptiverendering.measurer;

import android.content.Context;
import com.iab.omid.library.appodeal.adsession.VerificationScriptResource;
import io.p071bidmachine.internal.w0;
import io.p071bidmachine.rendering.measurer.d;
import io.p071bidmachine.rendering.measurer.e;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements e {
    public final String a;
    public final Map b;

    public a(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    @Override // io.p071bidmachine.rendering.measurer.e
    public final d a(Context context) {
        context.getClass();
        if (this.a.equalsIgnoreCase("om") && w0.b.get()) {
            return new c();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    public final i b(Context context) {
        Map map;
        ArrayList arrayList;
        VerificationScriptResource verificationScriptResourceCreateVerificationScriptResourceWithoutParameters;
        context.getClass();
        Float fValueOf = null;
        if (this.a.equalsIgnoreCase("om") && w0.b.get() && (map = this.b) != null && !map.isEmpty()) {
            String str = (String) map.get("verifications");
            if (str != null && str.length() != 0) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    if (jSONArray.length() == 0) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                            if (jSONObjectOptJSONObject != null) {
                                String strOptString = jSONObjectOptJSONObject.optString("java_script_resource_url");
                                strOptString.getClass();
                                String strOptString2 = jSONObjectOptJSONObject.optString("vendor");
                                String strOptString3 = jSONObjectOptJSONObject.optString("verification_parameters");
                                try {
                                    URL url = new URL(strOptString);
                                    if (strOptString2 != null && strOptString2.length() != 0 && strOptString3 != null && strOptString3.length() != 0) {
                                        verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(strOptString2, url, strOptString3);
                                        verificationScriptResourceCreateVerificationScriptResourceWithoutParameters.getClass();
                                    } else {
                                        verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url);
                                        verificationScriptResourceCreateVerificationScriptResourceWithoutParameters.getClass();
                                    }
                                    arrayList.add(verificationScriptResourceCreateVerificationScriptResourceWithoutParameters);
                                } catch (Throwable th) {
                                    io.p071bidmachine.core.a.i(th);
                                }
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                String str2 = (String) map.get("skip_offset");
                if (str2 != null && str2.length() != 0) {
                    try {
                        fValueOf = Float.valueOf(Long.parseLong(str2) / 1000.0f);
                    } catch (Throwable unused2) {
                    }
                }
                return new i(arrayList, fValueOf);
            }
        }
        return null;
    }
}
