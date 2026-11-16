package com.safedk.android.analytics.brandsafety;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SimpleConcurrentHashSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class l {
    public static final String b = "text:";
    private static final String z = "ImpressionInfo";
    private CreativeInfo A;
    private String B;
    private List<String> C;
    String a;
    k c;
    String d;
    RedirectData e;
    int f;
    public HashSet<String> g;
    final m h;
    public String i;
    public BrandSafetyUtils.AdType j;
    boolean k;
    public boolean l;
    public Boolean m;
    public SimpleConcurrentHashSet<String> n;
    public SimpleConcurrentHashSet<String> o;
    public SimpleConcurrentHashSet<String> p;
    public SimpleConcurrentHashSet<String> q;
    public SimpleConcurrentHashSet<String> r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public Boolean x;
    boolean y;

    public boolean a() {
        return this.y;
    }

    public void a(boolean z2) {
        this.y = z2;
        Logger.d(z, "setIsClicked invoked, clicked : ", Boolean.valueOf(this.y));
    }

    public String b() {
        return this.B;
    }

    public boolean c() {
        return this.A != null && this.A.v();
    }

    public boolean d() {
        return this.A != null && this.A.w();
    }

    public void a(String str) {
        this.B = str;
        if (str != null && !this.C.contains(str)) {
            this.C.add(str);
        }
    }

    public List<String> e() {
        return this.C;
    }

    public l(String str, String str2) {
        this(str, null, null, null);
        this.B = str2;
    }

    public l(String str, k kVar, String str2, BrandSafetyUtils.AdType adType) {
        this.d = null;
        this.f = 0;
        this.g = new HashSet<>();
        this.h = new m();
        this.i = null;
        this.j = null;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = new SimpleConcurrentHashSet<>();
        this.o = new SimpleConcurrentHashSet<>();
        this.p = new SimpleConcurrentHashSet<>();
        this.q = new SimpleConcurrentHashSet<>();
        this.r = new SimpleConcurrentHashSet<>();
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = 0;
        this.x = null;
        this.y = false;
        this.C = new ArrayList();
        this.a = str == null ? UUID.randomUUID().toString() : str;
        this.c = kVar;
        this.A = null;
        this.i = str2;
        this.j = adType;
    }

    public l(RedirectData redirectData) {
        this(null, null, null, null);
        this.e = redirectData;
    }

    public boolean f() {
        return this.e != null && this.e.i;
    }

    public boolean g() {
        return this.e != null && this.e.j;
    }

    public boolean h() {
        return this.e != null && this.e.k;
    }

    public void a(RedirectData redirectData) {
        this.e = redirectData;
        this.f++;
        if ((redirectData.j || redirectData.k) && this.A != null) {
            m();
        }
    }

    public void i() {
        if (this.A == null) {
            return;
        }
        boolean zA = CreativeInfoManager.a(this.A.Q(), AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
        if (this.A.an() && this.c != null && !zA) {
            Logger.d(z, "removing image taken for multi-ad ", this.c.b);
            BrandSafetyUtils.d(this.c.b);
            this.c = null;
        }
    }

    public void a(CreativeInfo creativeInfo) {
        if (this.A == null && creativeInfo != null) {
            a(m.m, new m.a[0]);
        }
        this.A = creativeInfo;
        if (creativeInfo != null) {
            creativeInfo.q().addAll(this.g);
            this.g = new HashSet<>();
            i();
            if (creativeInfo.aq() && this.c != null) {
                Logger.d(z, "set creative info, removing image taken for website endcard: ", this.c.b);
                BrandSafetyUtils.d(this.c.b);
                this.c = null;
            }
        }
    }

    public CreativeInfo j() {
        return this.A;
    }

    public String k() {
        return this.a;
    }

    public void l() {
        this.c = null;
    }

    public void a(String str, m.a... aVarArr) {
        this.h.a(str, aVarArr);
    }

    public void b(String str, m.a... aVarArr) {
        this.h.b(str, aVarArr);
    }

    public void m() {
        Logger.d(z, Logger.FeatureTag.NW_RESOURCES, "start collecting expand resources...");
        this.v = true;
    }

    public void b(String str) {
        String strD;
        if (!str.startsWith("text:")) {
            strD = d(str);
        } else {
            strD = str;
        }
        if (!TextUtils.isEmpty(strD)) {
            if (this.A != null && this.A.c(strD)) {
                Logger.d(z, Logger.FeatureTag.NW_RESOURCES, "add resource url: avoid adding a recommendation resource: ", strD);
                this.A.d();
                return;
            }
            if (this.A != null && this.A.d(strD)) {
                Logger.d(z, Logger.FeatureTag.NW_RESOURCES, "add resource url: Url is in the WebView urls exclusion list, will not be added : ", strD);
                return;
            }
            if (this.v) {
                if (!str.startsWith("text:")) {
                    synchronized (this.q) {
                        this.q.a(strD);
                    }
                    Logger.d(z, Logger.FeatureTag.NW_RESOURCES, "Resource was added successfully to impression expanded list, resource: ", strD);
                    return;
                }
                return;
            }
            synchronized (this.o) {
                this.o.a(strD);
            }
        }
    }

    public void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.g.add(str);
        }
    }

    public static String d(String str) {
        return TextUtils.isEmpty(str) ? str : com.safedk.android.utils.k.g(com.safedk.android.utils.n.z(str));
    }

    public String toString() {
        return "Impression: id=" + this.a + ", image is: " + this.c + ", CI is: " + this.A;
    }
}
