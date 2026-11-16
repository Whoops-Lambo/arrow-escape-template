package com.adsurge.adn.F1;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.adsurge.adn.E1.p;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a implements g {
    public static final Pattern d = Pattern.compile("/*(\\w+)/*(\\w+)/*(\\w+)/*");
    public final p a;
    public final e b = new e();
    public final d c = new d();

    /* JADX INFO: renamed from: com.adsurge.adn.F1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class RunnableC0073a implements Runnable {
        public final /* synthetic */ com.adsurge.adn.F1.c a;

        public RunnableC0073a(com.adsurge.adn.F1.c cVar) {
            this.a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a.this.a.a(this.a.a());
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements Runnable {
        public final /* synthetic */ com.adsurge.adn.F1.e a;

        public b(com.adsurge.adn.F1.e eVar) {
            this.a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a.this.a.a(this.a.a());
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c implements Runnable {
        public final /* synthetic */ com.adsurge.adn.F1.b a;

        public c(com.adsurge.adn.F1.b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a.this.a.a(this.a.a());
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class d {
        public Map a = new HashMap();

        public com.adsurge.adn.J1.a a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            com.adsurge.adn.F.c.a(this.a.get(str));
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class e {
        public Map a = new HashMap();

        public com.adsurge.adn.J1.b a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            com.adsurge.adn.F.c.a(this.a.get(str));
            return null;
        }
    }

    public com.adsurge.adn.F1.d a(Uri uri) {
        if (uri == null) {
            return null;
        }
        Matcher matcher = d.matcher(uri.getPath());
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        String strGroup2 = matcher.group(2);
        String strGroup3 = matcher.group(3);
        String queryParameter = uri.getQueryParameter(CampaignEx.JSON_KEY_AD_Q);
        String queryParameter2 = uri.getQueryParameter("t1");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!TextUtils.isEmpty(queryParameter2)) {
            try {
                jCurrentTimeMillis = Long.parseLong(queryParameter2);
            } catch (NumberFormatException unused) {
            }
        }
        long j = jCurrentTimeMillis;
        if ("multiAction".equals(strGroup)) {
            return new com.adsurge.adn.F1.d(strGroup2, strGroup, strGroup3, null, queryParameter, j);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(queryParameter)) {
                jSONObject = new JSONObject(queryParameter);
            }
            return new com.adsurge.adn.F1.d(strGroup2, strGroup, strGroup3, jSONObject, j);
        } catch (JSONException unused2) {
            return null;
        }
    }

    public a(p pVar) {
        this.a = pVar;
    }

    public void a(com.adsurge.adn.F1.c cVar) {
        if (cVar != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0073a(cVar));
        }
    }

    public void a(com.adsurge.adn.F1.e eVar) {
        if (eVar != null) {
            new Handler(Looper.getMainLooper()).post(new b(eVar));
        }
    }

    @Override // com.adsurge.adn.F1.g
    public void a(com.adsurge.adn.F1.b bVar) {
        if (bVar != null) {
            new Handler(Looper.getMainLooper()).post(new c(bVar));
        }
    }

    public void a(String... strArr) {
        a(new com.adsurge.adn.F1.c("bridge.onReceived", strArr));
    }
}
