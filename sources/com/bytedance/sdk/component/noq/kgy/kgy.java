package com.bytedance.sdk.component.noq.kgy;

import android.util.Log;
import com.bytedance.sdk.component.noq.ct;
import com.bytedance.sdk.component.utils.ra;
import com.ironsource.C4887nc;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class kgy implements com.bytedance.sdk.component.noq.uq<rz> {
    private Map<String, String> kgy(HttpURLConnection httpURLConnection) {
        HashMap map = new HashMap();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        for (String str : headerFields.keySet()) {
            List<String> list = headerFields.get(str);
            if (list != null && list.size() > 0) {
                map.put(str, list.get(0));
            }
        }
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.io.ByteArrayOutputStream, java.io.Closeable] */
    @Override // com.bytedance.sdk.component.noq.uq
    /* JADX INFO: renamed from: ahm, reason: merged with bridge method [inline-methods] */
    public rz<byte[]> kgy(ct ctVar) throws Throwable {
        InputStream inputStreamUrlConnectionGetInputStream;
        byte[] byteArray;
        ?? byteArrayOutputStream;
        String message;
        ?? r9;
        InputStream inputStream = null;
        Map<String, String> mapKgy = null;
        int i = 0;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(ctVar.kgy()).openConnection();
                httpURLConnection.setRequestMethod(C4887nc.a);
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.connect();
                inputStreamUrlConnectionGetInputStream = PangleNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
                try {
                    byte[] bArr = new byte[1024];
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        while (true) {
                            try {
                                int i2 = inputStreamUrlConnectionGetInputStream.read(bArr);
                                if (i2 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i2);
                            } catch (MalformedURLException e) {
                                e = e;
                                byteArray = null;
                            } catch (IOException e2) {
                                e = e2;
                                byteArray = null;
                            }
                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoCWBF6w=", "f+srlBawfe+UXsd+gBilJk8=", "WO8hmQ==", 69);
                            Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                            message = e.getMessage();
                            r9 = byteArrayOutputStream;
                            ra.kgy(inputStreamUrlConnectionGetInputStream);
                            ra.kgy(r9);
                            return new rz<>(i, byteArray, message, mapKgy);
                        }
                        mapKgy = ctVar.ahm() ? kgy(httpURLConnection) : null;
                        ra.kgy(inputStreamUrlConnectionGetInputStream);
                        ra.kgy(byteArrayOutputStream);
                        message = "success";
                    } catch (MalformedURLException e3) {
                        e = e3;
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoCWBF6w=", "f+srlBawfe+UXsd+gBilJk8=", "WO8hmQ==", 69);
                        Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                        message = e.getMessage();
                        r9 = byteArrayOutputStream;
                        ra.kgy(inputStreamUrlConnectionGetInputStream);
                        ra.kgy(r9);
                    } catch (IOException e4) {
                        e = e4;
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoCWBF6w=", "f+srlBawfe+UXsd+gBilJk8=", "WO8hmQ==", 74);
                        Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                        message = e.getMessage();
                        r9 = byteArrayOutputStream;
                        ra.kgy(inputStreamUrlConnectionGetInputStream);
                        ra.kgy(r9);
                    }
                    i = 200;
                    byteArray = byteArrayOutputStream.toByteArray();
                } catch (MalformedURLException e5) {
                    e = e5;
                    byteArray = null;
                    byteArrayOutputStream = byteArray;
                } catch (IOException e6) {
                    e = e6;
                    byteArray = null;
                    byteArrayOutputStream = byteArray;
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoCWBF6w=", "f+srlBawfe+UXsd+gBilJk8=", "WO8hmQ==", 74);
                    Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                    message = e.getMessage();
                    r9 = byteArrayOutputStream;
                    ra.kgy(inputStreamUrlConnectionGetInputStream);
                    ra.kgy(r9);
                    return new rz<>(i, byteArray, message, mapKgy);
                } catch (Throwable th) {
                    th = th;
                    inputStream = inputStreamUrlConnectionGetInputStream;
                    ra.kgy(inputStream);
                    ra.kgy(0);
                    throw th;
                }
            } catch (MalformedURLException e7) {
                e = e7;
                inputStreamUrlConnectionGetInputStream = null;
                byteArray = null;
            } catch (IOException e8) {
                e = e8;
                inputStreamUrlConnectionGetInputStream = null;
                byteArray = null;
            } catch (Throwable th2) {
                th = th2;
                ra.kgy(inputStream);
                ra.kgy(0);
                throw th;
            }
            return new rz<>(i, byteArray, message, mapKgy);
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
