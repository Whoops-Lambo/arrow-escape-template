package com.mbridge.msdk.tracker.network;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.inmobi.media.core.config.models.CrashConfig;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.tools.v0;
import defpackage.n30;
import defpackage.vq2;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class t<T> implements Comparable<t<T>> {
    private c a;
    private String b;
    private volatile p c;
    private long d;
    private Map<String, String> e;
    private int f;
    private final String g;
    private final int h;
    private final String i;
    private final int j;
    private final Object k;
    private v.a l;
    private Integer m;
    private u n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private x t;
    private b.a u;
    private long v;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum a {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public abstract v<T> a(q qVar);

    public abstract void a(T t);

    public Map<String, String> i() {
        return null;
    }

    public boolean y() {
        return true;
    }

    private byte[] a(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                i++;
                if (entry.getKey() != null) {
                    sb.append(URLEncoder.encode(entry.getKey(), str));
                    sb.append(G5.U);
                    sb.append(URLEncoder.encode(entry.getValue() == null ? "" : entry.getValue(), str));
                    if (i <= map.size() - 1) {
                        sb.append('&');
                    }
                }
            }
            if (!map.containsKey("rk") || !map.containsKey("erk") || !"1".equals(map.get("erk"))) {
                return sb.toString().getBytes(str);
            }
            return ("p=" + URLEncoder.encode(v0.b(sb.toString(), "ebmclXzZOhtU2sRlZxGL8A"), str)).getBytes(str);
        } catch (UnsupportedEncodingException e) {
            vq2.n(n30.y("Encoding not supported: ", str), e);
            return null;
        }
    }

    public final boolean A() {
        return this.s;
    }

    public final boolean B() {
        return this.r;
    }

    public String c() {
        return "application/x-www-form-urlencoded; charset=" + j();
    }

    public String d(String str) {
        if (this.e != null && !TextUtils.isEmpty(str)) {
            try {
                return this.e.get(str);
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public String e() {
        if (!TextUtils.isEmpty(this.b)) {
            return this.b;
        }
        if (this.a == null) {
            this.a = new com.mbridge.msdk.tracker.network.toolbox.e();
        }
        String strA = this.a.a(this);
        this.b = strA;
        return strA;
    }

    public Map<String, String> f() {
        return Collections.EMPTY_MAP;
    }

    public int g() {
        return this.f;
    }

    public p h() {
        return this.c;
    }

    public String j() {
        return "UTF-8";
    }

    public int k() {
        return this.h;
    }

    public a l() {
        return a.NORMAL;
    }

    public long m() {
        return this.v;
    }

    public x o() {
        return this.t;
    }

    public String p() {
        return this.i;
    }

    public int s() {
        return this.j;
    }

    public String t() {
        return this.g;
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(s());
        StringBuilder sb = new StringBuilder();
        sb.append(v() ? "[X] " : "[ ] ");
        sb.append(t());
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(l());
        sb.append(" ");
        sb.append(this.m);
        return sb.toString();
    }

    public boolean u() {
        boolean z;
        synchronized (this.k) {
            z = this.q;
        }
        return z;
    }

    public boolean v() {
        boolean z;
        synchronized (this.k) {
            z = this.p;
        }
        return z;
    }

    public void w() {
        synchronized (this.k) {
            this.q = true;
        }
    }

    public void x() {
        synchronized (this.k) {
        }
    }

    public final boolean z() {
        return this.o;
    }

    public t(int i, String str, int i2, String str2) {
        this.k = new Object();
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.u = null;
        this.v = 0L;
        this.f = i;
        this.g = str;
        this.h = i2;
        this.i = str2;
        a((x) new e());
        this.j = b(str);
        this.d = SystemClock.elapsedRealtime();
    }

    public byte[] b() {
        Map<String, String> mapI = i();
        if (mapI != null && mapI.size() > 0) {
            byte[] bArrA = a(mapI, j());
            this.v = bArrA.length;
            return bArrA;
        }
        this.v = 0L;
        return null;
    }

    public long n() {
        return SystemClock.elapsedRealtime() - this.d;
    }

    public final int q() {
        x xVarO = o();
        if (xVarO == null) {
            return 30000;
        }
        return xVarO.b();
    }

    public final long r() {
        x xVarO = o();
        if (xVarO == null) {
            return CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        }
        long jA = xVarO.a();
        if (jA < 0) {
            return CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        }
        return jA;
    }

    public void c(String str) {
        u uVar = this.n;
        if (uVar != null) {
            uVar.c(this);
        }
    }

    public b0 c(b0 b0Var) {
        return b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> c(boolean z) {
        this.r = z;
        return this;
    }

    public b.a d() {
        return this.u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> b(int i) {
        this.m = Integer.valueOf(i);
        return this;
    }

    private static int b(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> b(boolean z) {
        this.s = z;
        return this;
    }

    public void b(b0 b0Var) {
        v.a aVar;
        synchronized (this.k) {
            aVar = this.l;
        }
        if (aVar != null) {
            aVar.a(b0Var);
        }
    }

    public t(int i, String str, int i2) {
        this(i, str, i2, "un_known");
    }

    public t(int i, String str) {
        this(i, str, 0);
    }

    public void a(String str) {
    }

    public boolean a() {
        return false;
    }

    public void a(v.a aVar) {
        this.l = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t<?> a(x xVar) {
        this.t = xVar;
        return this;
    }

    public void a(int i) {
        u uVar = this.n;
        if (uVar != null) {
            uVar.a(this, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t<?> a(u uVar) {
        this.n = uVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> a(boolean z) {
        this.o = z;
        return this;
    }

    public void a(v<?> vVar) {
        synchronized (this.k) {
        }
    }

    public void a(p pVar) {
        this.c = pVar;
    }

    public void a(String str, String str2) {
        if (this.e == null) {
            this.e = new HashMap();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            this.e.put(str, str2);
        } catch (Exception unused) {
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(t<T> tVar) {
        int iOrdinal;
        int iOrdinal2;
        a aVarL = l();
        a aVarL2 = tVar.l();
        if (aVarL == aVarL2) {
            iOrdinal = this.m.intValue();
            iOrdinal2 = tVar.m.intValue();
        } else {
            iOrdinal = aVarL2.ordinal();
            iOrdinal2 = aVarL.ordinal();
        }
        return iOrdinal - iOrdinal2;
    }
}
