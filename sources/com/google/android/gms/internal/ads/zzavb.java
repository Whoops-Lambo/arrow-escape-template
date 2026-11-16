package com.google.android.gms.internal.ads;

import com.ironsource.C4887nc;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import defpackage.hw3;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzavb extends zzauo {
    public zzavb() {
        throw null;
    }

    public static ArrayList b(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new zzats((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzauo
    public final zzauy a(zzaua zzauaVar, Map map) throws Throwable {
        String strZzh = zzauaVar.zzh();
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(zzauaVar.zzm());
        URL url = new URL(strZzh);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int iZzo = zzauaVar.zzo();
        httpURLConnection.setConnectTimeout(iZzo);
        httpURLConnection.setReadTimeout(iZzo);
        boolean z = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        url.getProtocol();
        try {
            for (String str : map2.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) map2.get(str));
            }
            if (zzauaVar.zza() != 0) {
                httpURLConnection.setRequestMethod("POST");
                byte[] bArrZzn = zzauaVar.zzn();
                if (bArrZzn != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(AdMobNetworkBridge.urlConnectionGetOutputStream(httpURLConnection));
                    dataOutputStream.write(bArrZzn);
                    dataOutputStream.close();
                }
            } else {
                httpURLConnection.setRequestMethod(C4887nc.a);
            }
            int iHttpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
            if (iHttpUrlConnectionGetResponseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            zzauaVar.zza();
            if ((iHttpUrlConnectionGetResponseCode >= 100 && iHttpUrlConnectionGetResponseCode < 200) || iHttpUrlConnectionGetResponseCode == 204 || iHttpUrlConnectionGetResponseCode == 304) {
                zzauy zzauyVar = new zzauy(iHttpUrlConnectionGetResponseCode, b(httpURLConnection.getHeaderFields()), -1, null);
                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                return zzauyVar;
            }
            try {
                return new zzauy(iHttpUrlConnectionGetResponseCode, b(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new hw3(httpURLConnection));
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
