package com.adsurge.adn.oversea_ad;

import android.util.Base64;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class Warden {
    public static final String e = CanisMinor.a(CanisMinor.L0);
    public static final String f = CanisMinor.a(CanisMinor.M0);
    public static final String g = CanisMinor.a(CanisMinor.N0);
    public static final String h = CanisMinor.a(CanisMinor.O0);
    public static final String i = CanisMinor.a(CanisMinor.P0);
    public long a;
    public int b;
    public String c;
    public final ArrayList d;

    public Warden(String str) {
        this.a = -1L;
        this.b = -1;
        this.c = "";
        this.d = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String str2 = i;
            if (jSONObject.has(str2)) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str2);
                jSONArrayOptJSONArray.length();
                this.d = new ArrayList();
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    this.d.add(jSONArrayOptJSONArray.getString(i2));
                }
                try {
                    Cfinally.a((X509Certificate) CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(((String) this.d.get(0)).getBytes())), this);
                } catch (Exception unused) {
                }
                jSONObject.put(g, this.c);
                jSONObject.put(h, this.b);
                jSONObject.put(f, this.a);
                jSONObject.toString();
                return;
            }
            this.a = jSONObject.optLong(f);
            this.b = jSONObject.optInt(h);
            this.c = jSONObject.optString(g);
            jSONObject.optString(e);
        } catch (Exception unused2) {
        }
    }

    public Warden(Certificate[] certificateArr) {
        this.a = -1L;
        this.b = -1;
        this.c = "";
        this.d = null;
        if (certificateArr != null) {
            try {
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = new JSONArray();
                for (int i2 = 0; i2 < certificateArr.length; i2++) {
                    Certificate certificate = certificateArr[i2];
                    Base64.encodeToString(certificate.getEncoded(), 2);
                    String strA = Cfinally.a(certificate);
                    if (i2 == 0) {
                        try {
                            Cfinally.a((X509Certificate) certificate, this);
                        } catch (Exception unused) {
                        }
                    }
                    jSONArray.put(strA);
                    arrayList.add(strA);
                }
                this.d = arrayList;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(i, jSONArray);
                jSONObject.put(g, this.c);
                jSONObject.put(h, this.b);
                jSONObject.put(f, this.a);
                jSONObject.toString();
            } catch (Exception unused2) {
            }
        }
    }
}
