package com.adsurge.adn.oversea_ad;

import com.ironsource.C4887nc;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.download.Command;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class Lyra {
    /* JADX WARN: Code duplicated, block: B:51:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:? A[SYNTHETIC] */
    public static void a(Longan longan) throws Throwable {
        HttpURLConnection httpURLConnection;
        Throwable th;
        URL url = longan.a;
        HashMap map = longan.b;
        BufferedInputStream bufferedInputStream = null;
        try {
            httpURLConnection = (HttpURLConnection) url.openConnection();
            try {
                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, "Turing");
                httpURLConnection.setRequestProperty("Accept-Charset", G5.O);
                if (!map.isEmpty()) {
                    for (Map.Entry entry : map.entrySet()) {
                        httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                httpURLConnection.setRequestMethod(C4887nc.a);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setConnectTimeout(longan.c);
                httpURLConnection.setReadTimeout(longan.d);
                httpURLConnection.setInstanceFollowRedirects(longan.e);
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                if (headerFields != null) {
                    HashMap map2 = new HashMap();
                    for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                        map2.put(entry2.getKey(), entry2.getValue().get(0));
                    }
                }
                int responseCode = httpURLConnection.getResponseCode();
                try {
                    if (responseCode != 200) {
                        if (responseCode != 305) {
                            switch (responseCode) {
                                case 300:
                                case MRAID_ERROR_VALUE:
                                case INVALID_IFA_STATUS_VALUE:
                                case 303:
                                    break;
                                default:
                                    httpURLConnection.disconnect();
                                    return;
                            }
                        }
                        httpURLConnection.getHeaderField("Location");
                    } else {
                        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(httpURLConnection.getInputStream());
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = bufferedInputStream2.read(bArr);
                                if (-1 == i) {
                                    break;
                                } else {
                                    byteArrayOutputStream.write(bArr, 0, i);
                                }
                            }
                            URL url2 = httpURLConnection.getURL();
                            if (!url.getHost().equals(url2.getHost())) {
                                url2.toString();
                            }
                            byteArrayOutputStream.toByteArray();
                            Octans.a(bufferedInputStream2);
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedInputStream = bufferedInputStream2;
                            Octans.a(bufferedInputStream);
                            if (httpURLConnection != null) {
                                throw th;
                            }
                            try {
                                httpURLConnection.disconnect();
                                throw th;
                            } catch (Throwable unused) {
                                throw th;
                            }
                        }
                    }
                    httpURLConnection.disconnect();
                } catch (Throwable unused2) {
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                Octans.a(bufferedInputStream);
                if (httpURLConnection != null) {
                    throw th;
                }
                httpURLConnection.disconnect();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
        }
    }
}
