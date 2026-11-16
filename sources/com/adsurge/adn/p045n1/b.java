package com.adsurge.adn.p045n1;

import android.text.TextUtils;
import com.adsurge.adn.R.e;
import com.ironsource.C4887nc;
import com.mbridge.msdk.foundation.download.Command;
import defpackage.h50;
import defpackage.pv1;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class b {
    public final int a;
    public final int b;
    public final boolean c;
    public String d;

    public final HttpURLConnection a(String str, long j, long j2) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        String str2 = this.d;
        if (str2 == null || str2.startsWith("null")) {
            httpURLConnection.setRequestProperty(e.b(), e.a());
        } else {
            httpURLConnection.setRequestProperty(e.b(), e.a(this.d));
        }
        httpURLConnection.setConnectTimeout(this.a);
        httpURLConnection.setReadTimeout(this.b);
        if (this.c) {
            String strA = a(j, j2);
            if (!TextUtils.isEmpty(strA)) {
                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, strA);
            }
        }
        return httpURLConnection;
    }

    public b(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public a a(String str, long j, long j2, boolean z) throws ProtocolException {
        HttpURLConnection httpURLConnectionA = a(str, j, j2);
        if (z) {
            httpURLConnectionA.setRequestMethod("HEAD");
        } else {
            httpURLConnectionA.setRequestMethod(C4887nc.a);
        }
        return new a(httpURLConnectionA, 0, null);
    }

    public final String a(long j, long j2) {
        if (j < 0) {
            return null;
        }
        if (j2 > 0) {
            StringBuilder sbO = h50.o(j, "bytes=", "-");
            sbO.append((j + j2) - 1);
            return sbO.toString();
        }
        return pv1.m(j, "bytes=", "-");
    }

    public void a(String str) {
        this.d = str;
    }
}
