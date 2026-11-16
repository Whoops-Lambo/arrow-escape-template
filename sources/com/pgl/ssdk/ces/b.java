package com.pgl.ssdk.ces;

import android.content.Context;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.pgl.ssdk.ar;
import com.pgl.ssdk.aw;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
final class b {
    private final Context b;
    private boolean g;
    private boolean h;
    private boolean i;
    private final Object a = new Object();
    private final C1543b c = new C1543b(12, 300);
    private final C1543b d = new C1543b(24, 3600);
    private final C1543b e = new C1543b(12, 300);
    private final C1543b f = new C1543b(24, 3600);

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.c();
        }
    }

    /* JADX INFO: renamed from: com.pgl.ssdk.ces.b$b, reason: collision with other inner class name */
    public static final class C1543b {
        private final long[] a;
        private final long[] b;
        private final long c;

        public boolean a(long j) {
            long j2 = j / this.c;
            int i = 0;
            boolean z = false;
            while (true) {
                long[] jArr = this.a;
                if (i >= jArr.length) {
                    return z;
                }
                if ((jArr[i] != 0 || this.b[i] != 0) && !a(this.b[i], j2)) {
                    this.a[i] = 0;
                    this.b[i] = 0;
                    z = true;
                }
                i++;
            }
        }

        public boolean b(long j) {
            long j2 = j / this.c;
            long[] jArr = this.a;
            int length = (int) (j2 % ((long) jArr.length));
            long[] jArr2 = this.b;
            if (jArr2[length] != j2) {
                jArr2[length] = j2;
                jArr[length] = 0;
            }
            jArr[length] = jArr[length] + 1;
            return true;
        }

        public long c(long j) {
            long j2 = j / this.c;
            long j3 = 0;
            for (int i = 0; i < this.a.length; i++) {
                if (a(this.b[i], j2)) {
                    j3 += this.a[i];
                }
            }
            return j3;
        }

        public C1543b(int i, long j) {
            this.a = new long[i];
            this.b = new long[i];
            this.c = j;
        }

        private C1543b(long[] jArr, long[] jArr2, long j) {
            this.a = jArr;
            this.b = jArr2;
            this.c = j;
        }

        public JSONObject c() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ct", b.b(this.a));
            jSONObject.put(CmcdConfiguration.KEY_STREAM_TYPE, b.b(this.b));
            return jSONObject;
        }

        public void b() {
            Arrays.fill(this.a, 0L);
            Arrays.fill(this.b, 0L);
        }

        public void a(JSONObject jSONObject) {
            b();
            if (jSONObject == null) {
                return;
            }
            b.b(jSONObject.optJSONArray("ct"), this.a);
            b.b(jSONObject.optJSONArray(CmcdConfiguration.KEY_STREAM_TYPE), this.b);
        }

        public C1543b a() {
            long[] jArr = this.a;
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            long[] jArr2 = this.b;
            return new C1543b(jArrCopyOf, Arrays.copyOf(jArr2, jArr2.length), this.c);
        }

        private boolean a(long j, long j2) {
            return j > 0 && j2 >= j && j2 - j < ((long) this.a.length);
        }
    }

    public static final class c {
        private final C1543b a;
        private final C1543b b;
        private final C1543b c;
        private final C1543b d;

        public String a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("s1", this.a.c());
                jSONObject.put("s24", this.b.c());
                jSONObject.put("c1", this.c.c());
                jSONObject.put("c24", this.d.c());
                return jSONObject.toString();
            } catch (JSONException unused) {
                return null;
            }
        }

        public c(C1543b c1543b, C1543b c1543b2, C1543b c1543b3, C1543b c1543b4) {
            this.a = c1543b;
            this.b = c1543b2;
            this.c = c1543b3;
            this.d = c1543b4;
        }
    }

    private void d() {
        this.h = true;
        if (this.i) {
            return;
        }
        this.i = true;
        ar.b(new a());
    }

    private void b() {
        String strA = aw.a(this.b, "ss_ade_cache_v1", "");
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strA);
            this.c.a(jSONObject.optJSONObject("s1"));
            this.d.a(jSONObject.optJSONObject("s24"));
            this.e.a(jSONObject.optJSONObject("c1"));
            this.f.a(jSONObject.optJSONObject("c24"));
        } catch (JSONException unused) {
            this.c.b();
            this.d.b();
            this.e.b();
            this.f.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        while (true) {
            synchronized (this.a) {
                try {
                    if (!this.h) {
                        this.i = false;
                        return;
                    }
                    c cVar = new c(this.c.a(), this.d.a(), this.e.a(), this.f.a());
                    this.h = false;
                    String strA = cVar.a();
                    if (strA == null) {
                        synchronized (this.a) {
                            this.h = true;
                            this.i = false;
                        }
                        return;
                    }
                    aw.b(this.b, "ss_ade_cache_v1", strA);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void a(int i, long j) {
        synchronized (this.a) {
            try {
                a();
                C1543b c1543b = i == 1 ? this.c : this.e;
                C1543b c1543b2 = i == 1 ? this.d : this.f;
                a(j);
                c1543b.b(j);
                c1543b2.b(j);
                d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Map<String, Object> e() {
        HashMap map;
        synchronized (this.a) {
            try {
                a();
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                if (a(jCurrentTimeMillis)) {
                    d();
                }
                map = new HashMap();
                map.put("show_cnt_1h", Long.valueOf(this.c.c(jCurrentTimeMillis)));
                map.put("click_cnt_1h", Long.valueOf(this.e.c(jCurrentTimeMillis)));
                map.put("show_cnt_1d", Long.valueOf(this.d.c(jCurrentTimeMillis)));
                map.put("click_cnt_1d", Long.valueOf(this.f.c(jCurrentTimeMillis)));
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }

    public b(Context context) {
        this.b = context;
    }

    private void a() {
        if (this.g) {
            return;
        }
        b();
        if (a(System.currentTimeMillis() / 1000)) {
            d();
        }
        this.g = true;
    }

    public static boolean a(int i) {
        return i == 1 || i == 2;
    }

    private boolean a(long j) {
        return this.f.a(j) | this.c.a(j) | this.d.a(j) | this.e.a(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONArray b(long[] jArr) {
        JSONArray jSONArray = new JSONArray();
        for (long j : jArr) {
            jSONArray.put(j);
        }
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(JSONArray jSONArray, long[] jArr) {
        if (jSONArray == null) {
            return;
        }
        try {
            int iMin = Math.min(jArr.length, jSONArray.length());
            for (int i = 0; i < iMin; i++) {
                jArr[i] = jSONArray.optLong(i, 0L);
            }
        } catch (Throwable unused) {
            Arrays.fill(jArr, 0L);
        }
    }
}
