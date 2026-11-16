package com.fyber.inneractive.sdk.web;

import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class b1 {
    public static final byte[] b = new byte[0];
    public static final b1 c = new b1();
    public final z0 a = new z0();

    public static c1 a(HttpURLConnection httpURLConnection, ByteBuffer byteBuffer) throws IOException {
        InputStream inputStreamUrlConnectionGetInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        String str;
        String str2;
        byte[] byteArray;
        String strTrim;
        httpURLConnection.connect();
        for (int i = 0; i < 20; i++) {
            int iHttpUrlConnectionGetResponseCode = DTExchangeNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
            if (iHttpUrlConnectionGetResponseCode >= 300 && iHttpUrlConnectionGetResponseCode < 400) {
                String headerField = httpURLConnection.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    break;
                }
                DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                httpURLConnection = (HttpURLConnection) new URL(headerField).openConnection();
                httpURLConnection.connect();
            } else {
                try {
                    inputStreamUrlConnectionGetInputStream = DTExchangeNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
                    try {
                        byte[] bArrArray = byteBuffer.array();
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            try {
                                int i2 = inputStreamUrlConnectionGetInputStream.read(bArrArray);
                                if (i2 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArrArray, 0, i2);
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                        byteArrayOutputStream = null;
                    }
                } catch (Throwable unused3) {
                    inputStreamUrlConnectionGetInputStream = null;
                }
                com.fyber.inneractive.sdk.util.v.b((Closeable) inputStreamUrlConnectionGetInputStream);
                DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                String contentType = httpURLConnection.getContentType();
                String strTrim2 = "";
                if (TextUtils.isEmpty(contentType)) {
                    str = "";
                    str2 = str;
                } else {
                    String[] strArrSplit = contentType.split(";");
                    if (strArrSplit.length <= 0) {
                        strTrim = "";
                    } else {
                        strTrim = strArrSplit[0].trim();
                    }
                    if (strArrSplit.length > 1) {
                        strTrim2 = strArrSplit[1].trim();
                    }
                    str = strTrim;
                    str2 = strTrim2;
                }
                HashMap map = new HashMap();
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                if (headerFields != null) {
                    for (String str3 : headerFields.keySet()) {
                        List<String> list = headerFields.get(str3);
                        if (list != null && list.size() > 0) {
                            map.put(str3, list.get(0));
                        }
                    }
                }
                String responseMessage = httpURLConnection.getResponseMessage();
                if (TextUtils.isEmpty(responseMessage)) {
                    break;
                }
                if (byteArrayOutputStream == null) {
                    byteArray = b;
                } else {
                    byteArray = byteArrayOutputStream.toByteArray();
                }
                return new c1(byteArray, map, str, str2, iHttpUrlConnectionGetResponseCode, responseMessage);
            }
        }
        return null;
    }

    public static void a(WebResourceRequest webResourceRequest, HttpURLConnection httpURLConnection) {
        if (webResourceRequest.getRequestHeaders() == null || webResourceRequest.getRequestHeaders().size() <= 0) {
            return;
        }
        for (String str : webResourceRequest.getRequestHeaders().keySet()) {
            if (str != null && webResourceRequest.getRequestHeaders().get(str) != null) {
                httpURLConnection.setRequestProperty(str, webResourceRequest.getRequestHeaders().get(str));
            }
        }
    }
}
