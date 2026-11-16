package com.iab.omid.library.vungle.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C4664b4;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class j {
    private static void a(Map<String, String> map) {
        try {
            com.iab.omid.library.vungle.attestation.e.a(g.b().a().getApplicationContext(), map.get("mechanism"), new com.iab.omid.library.vungle.attestation.a(map));
        } catch (Exception e) {
            com.iab.omid.library.vungle.utils.d.a("Error processing attestation request in OmidNativeUrlHandler", e);
        }
    }

    public static void b(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter("method");
            if (TextUtils.isEmpty(queryParameter)) {
                com.iab.omid.library.vungle.utils.d.b("OmidNativeUrlHandler failed to handle url [" + uri.toString() + "] as 'method' not available");
                return;
            }
            if (queryParameter.hashCode() == -1407254715 && queryParameter.equals("attest")) {
                a(a(uri));
                return;
            }
            com.iab.omid.library.vungle.utils.d.b("Unknown method in OmidNativeUrlHandler.handle :".concat(queryParameter));
        } catch (Exception e) {
            StringBuilder sbA = l.a("OmidNativeUrlHandler failed to handle url [");
            sbA.append(uri.toString());
            sbA.append(C4664b4.j.e);
            com.iab.omid.library.vungle.utils.d.a(sbA.toString(), e);
        }
    }

    private static Map<String, String> a(Uri uri) {
        HashMap map = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            map.put(str, uri.getQueryParameter(str));
        }
        return map;
    }
}
