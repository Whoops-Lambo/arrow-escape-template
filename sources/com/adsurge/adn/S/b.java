package com.adsurge.adn.S;

import android.text.TextUtils;
import com.adsurge.adn.N.d;
import com.adsurge.adn.R.e;
import com.adsurge.adn.X.r;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class b implements com.adsurge.adn.S.a {
    public static final Pattern a = Pattern.compile("dur=(-?[0-9.]+)");

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.adsurge.adn.H0.a.EnumC0076a.values().length];
            a = iArr;
            try {
                iArr[com.adsurge.adn.H0.a.EnumC0076a.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.adsurge.adn.H0.a.EnumC0076a.GET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final HttpURLConnection a(com.adsurge.adn.H0.a aVar, HttpURLConnection httpURLConnection, long j) {
        for (Map.Entry entry : aVar.j().entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnection.setRequestProperty(e.b(), e.a());
        if (a(aVar.d())) {
            httpURLConnection.setRequestProperty("X-ODC-Timestamp", String.valueOf(j));
        }
        if (aVar.e() > 0) {
            httpURLConnection.setConnectTimeout(aVar.e());
        } else {
            httpURLConnection.setConnectTimeout(30000);
        }
        if (aVar.a() > 0) {
            httpURLConnection.setReadTimeout(aVar.a());
            return httpURLConnection;
        }
        httpURLConnection.setReadTimeout(30000);
        return httpURLConnection;
    }

    public final HttpURLConnection a(com.adsurge.adn.H0.a aVar, URL url, HttpURLConnection httpURLConnection) throws IOException {
        int i = a.a[aVar.i().ordinal()];
        if (i == 1) {
            httpURLConnection.setDoOutput(true);
            if (aVar.c()) {
                httpURLConnection.setChunkedStreamingMode(0);
            }
            byte[] bArrB = aVar.b();
            if (bArrB != null && bArrB.length > 0) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                bufferedOutputStream.write(bArrB);
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
            }
        } else if (i == 2) {
            url.toString();
            boolean zG = aVar.g();
            httpURLConnection.setInstanceFollowRedirects(zG);
            if (zG) {
                return r.a(httpURLConnection);
            }
        }
        return httpURLConnection;
    }

    @Override // com.adsurge.adn.S.a
    public com.adsurge.adn.H0.b a(com.adsurge.adn.S.a.InterfaceC0091a interfaceC0091a) throws IOException {
        com.adsurge.adn.H0.a aVarA = interfaceC0091a.a();
        URL url = new URL(aVarA.f());
        long jA = d.b().a();
        HttpURLConnection httpURLConnectionA = a(aVarA, url, a(aVarA, (HttpURLConnection) url.openConnection(), jA));
        if (!a(aVarA.d())) {
            return aVarA.a(httpURLConnectionA);
        }
        com.adsurge.adn.H0.b bVarA = aVarA.a(httpURLConnectionA);
        a(aVarA, bVarA, d.b().a() - jA, a(bVarA));
        return bVarA;
    }

    public static void a(com.adsurge.adn.H0.a aVar, com.adsurge.adn.H0.b bVar, double d, double d2) {
        if (d2 <= 0.0d) {
            return;
        }
        double d3 = d - d2;
        if (d3 <= 0.0d) {
            return;
        }
        boolean z = bVar instanceof com.adsurge.adn.T.d;
        if (z) {
            ((com.adsurge.adn.T.d) bVar).a("rtt_durations_ms", Double.valueOf(d3));
        }
        aVar.d();
        if (z) {
            ((com.adsurge.adn.T.d) bVar).e();
        }
    }

    public final double a(com.adsurge.adn.H0.b bVar) {
        String strA = bVar.a("Server-Timing");
        double dMax = 0.0d;
        if (strA != null && !strA.isEmpty()) {
            for (String str : strA.split(",")) {
                Matcher matcher = a.matcher(str.trim());
                if (matcher.find()) {
                    try {
                        String strGroup = matcher.group(1);
                        if (strGroup != null) {
                            dMax = Math.max(Double.parseDouble(strGroup), dMax);
                        }
                    } catch (NumberFormatException e) {
                        e.getMessage();
                    }
                }
            }
        }
        return dMax;
    }

    public static boolean a(String str) {
        return TextUtils.equals(str, com.adsurge.adn.p069z.a.a());
    }
}
