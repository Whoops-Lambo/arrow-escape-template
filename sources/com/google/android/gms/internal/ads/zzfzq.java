package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C4664b4;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfzq {
    public static boolean a(String str) {
        if (str == null || !str.startsWith("omid-native")) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if (!"omid-native".equals(uri.getScheme())) {
                return false;
            }
            try {
                String queryParameter = uri.getQueryParameter("method");
                if (TextUtils.isEmpty(queryParameter)) {
                    uri.toString();
                    return true;
                }
                if (queryParameter.hashCode() != -1407254715 || !queryParameter.equals("attest")) {
                    return true;
                }
                HashMap map = new HashMap();
                for (String str2 : uri.getQueryParameterNames()) {
                    map.put(str2, uri.getQueryParameter(str2));
                }
                try {
                    zzfxd.a(zzfxw.b.a.getApplicationContext(), (String) map.get("mechanism"), new zzfwz(map));
                    return true;
                } catch (Exception e) {
                    zzfyu.a("Error processing attestation request in OmidNativeUrlHandler", e);
                    return true;
                }
            } catch (Exception e2) {
                String string = uri.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 44);
                sb.append("OmidNativeUrlHandler failed to handle url [");
                sb.append(string);
                sb.append(C4664b4.j.e);
                zzfyu.a(sb.toString(), e2);
                return true;
            }
        } catch (Exception unused) {
            return false;
        }
    }
}
