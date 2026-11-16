package com.adsurge.adn.p045n1;

import android.text.TextUtils;
import com.adsurge.adn.X.r;
import com.adsurge.adn.Y0.d;
import com.adsurge.adn.x1.q;
import defpackage.pv1;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class a {
    public static final Pattern g = Pattern.compile("bytes\\W+(\\d+)-(\\d+)/(\\d+)");
    public static final AtomicInteger h = new AtomicInteger(0);
    public static volatile int i = -1;
    public static volatile String[] j = null;
    public HttpURLConnection a;
    public int b;
    public String c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public int e = 0;
    public final int f = i();

    public void a() {
        HttpURLConnection httpURLConnection = this.a;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Throwable unused) {
            }
        }
    }

    public boolean b() {
        int responseCode = 0;
        if (this.d.compareAndSet(false, true)) {
            m();
            try {
                HttpURLConnection httpURLConnectionA = r.a(this.a);
                this.a = httpURLConnectionA;
                responseCode = httpURLConnectionA.getResponseCode();
            } catch (SocketTimeoutException e) {
                this.b |= 131072;
                this.c = "ExceptionWhileMakeupPartitionConnection:" + e.getMessage();
            } catch (UnknownHostException e2) {
                this.b |= 65536;
                this.c = "ExceptionWhileMakeupPartitionConnection:" + r.e() + " " + e2.getMessage();
            } catch (IOException e3) {
                this.b |= 4194304;
                this.c = "ExceptionWhileMakeupPartitionConnection:" + e3.getMessage();
            }
            if (responseCode != 0 && responseCode != 200 && responseCode != 206) {
                int i2 = this.b;
                this.b = 2097152 | i2;
                if (responseCode == 416) {
                    this.b = i2 | 3145728;
                }
                this.c = pv1.k(responseCode, "HttpStatusErrWhileMakeupPartitionConnection:");
            }
            l();
        }
        return j();
    }

    public long c() {
        HttpURLConnection httpURLConnection = this.a;
        if (httpURLConnection == null) {
            return -1L;
        }
        String headerField = httpURLConnection.getHeaderField("X-Cos-Meta-Edgepack-Offset");
        if (TextUtils.isEmpty(headerField)) {
            return -1L;
        }
        try {
            return Long.parseLong(headerField);
        } catch (Exception unused) {
            return -1L;
        }
    }

    public long d() {
        HttpURLConnection httpURLConnection = this.a;
        if (httpURLConnection != null) {
            return httpURLConnection.getContentLength();
        }
        return -1L;
    }

    public int e() {
        return this.b;
    }

    public String f() {
        return this.c;
    }

    public InputStream g() {
        HttpURLConnection httpURLConnection = this.a;
        if (httpURLConnection != null) {
            return httpURLConnection.getInputStream();
        }
        return null;
    }

    public String h() {
        HttpURLConnection httpURLConnection = this.a;
        return httpURLConnection != null ? httpURLConnection.getContentType() : "";
    }

    public final int i() {
        this.a.getURL().toString();
        return 0;
    }

    public boolean j() {
        return this.b == 0;
    }

    public boolean k() {
        HttpURLConnection httpURLConnection = this.a;
        String headerField = httpURLConnection != null ? httpURLConnection.getHeaderField("Content-Range") : "";
        return !TextUtils.isEmpty(headerField) && g.matcher(headerField).matches() && d() >= 0;
    }

    public final void l() {
        if (this.e <= 0 || this.f != 1) {
            return;
        }
        if (j()) {
            q.a(9130051, this.e, 0);
            return;
        }
        d dVar = new d();
        dVar.a("data", this.a.getURL().toString());
        q.a(9130052, this.e, 0, dVar);
    }

    public final void m() {
        int i2 = this.e;
        if (i2 > 0) {
            q.a(9130050, i2);
        }
    }

    public a(HttpURLConnection httpURLConnection, int i2, String str) {
        this.a = httpURLConnection;
        this.b = i2;
        this.c = str;
    }
}
