package com.fyber.inneractive.sdk.util;

import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class s {
    public static String a(String str, int i, int i2) throws Exception {
        String string;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.connect();
            FilterInputStream filterInputStreamA = a(httpURLConnection);
            String strB = b(httpURLConnection);
            if (!TextUtils.isEmpty(strB)) {
                DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                return a(strB, i2, i);
            }
            int iHttpUrlConnectionGetResponseCode = DTExchangeNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
            if (iHttpUrlConnectionGetResponseCode != 200) {
                IAlog.a("isResponseValid: found invalid response status: %s", Integer.toString(iHttpUrlConnectionGetResponseCode));
                string = null;
            } else {
                string = v.b((InputStream) filterInputStreamA).toString();
            }
            DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            return string;
        } catch (Exception e) {
            IAlog.a("getBodyFromUrl failed with exception", e, new Object[0]);
            throw e;
        } catch (Throwable th) {
            IAlog.a("getBodyFromUrl failed with error", th, new Object[0]);
            return null;
        }
    }

    public static String b(HttpURLConnection httpURLConnection) throws Exception {
        int iHttpUrlConnectionGetResponseCode = DTExchangeNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
        if ((iHttpUrlConnectionGetResponseCode <= 300 || iHttpUrlConnectionGetResponseCode >= 304) && iHttpUrlConnectionGetResponseCode != 307 && iHttpUrlConnectionGetResponseCode != 308) {
            return null;
        }
        IAlog.a("getRedirectUrl: received redirect code %s", Integer.toString(iHttpUrlConnectionGetResponseCode));
        String headerField = httpURLConnection.getHeaderField(com.fyber.inneractive.sdk.network.n.LOCATION.a());
        if (!TextUtils.isEmpty(headerField)) {
            IAlog.a("getRedirectUrl: redirecting target url: %s", headerField);
            return headerField;
        }
        throw new Exception("Server returned HTTP " + Integer.toString(iHttpUrlConnectionGetResponseCode) + " with empty location header!");
    }

    public static boolean a() {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    public static FilterInputStream a(HttpURLConnection httpURLConnection) {
        try {
            InputStream inputStreamUrlConnectionGetInputStream = DTExchangeNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
            if (TextUtils.equals("gzip", httpURLConnection.getContentEncoding())) {
                return new GZIPInputStream(inputStreamUrlConnectionGetInputStream);
            }
            return new BufferedInputStream(inputStreamUrlConnectionGetInputStream);
        } catch (Exception unused) {
            return null;
        }
    }

    public static HashMap a(Map map) {
        List list;
        HashMap map2 = new HashMap();
        if (map != null) {
            for (String str : map.keySet()) {
                if (str != null && (list = (List) map.get(str)) != null && !list.isEmpty()) {
                    map2.put(str.toLowerCase(Locale.US), (String) list.get(0));
                }
            }
        }
        return map2;
    }
}
