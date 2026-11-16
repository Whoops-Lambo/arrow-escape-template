package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import defpackage.nj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.r3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4949r3 implements F7 {
    static boolean O;
    private int[] A;
    private int[] B;
    private int[] C;
    int G;
    String H;
    String I;
    Set<Integer> J;
    private F5 K;
    private C4796ia L;
    private Ve M;
    private boolean l;
    private G4 p;
    private AbstractC4713e q;
    private ArrayList<C5> r;
    private int t;
    private N8 u;
    private Context v;
    private int[] z;
    final int a = 1;
    final int b = 100;
    final int c = 5000;
    final int d = 90000;
    final int e = 1024;
    final int f = 5;
    final String g = "supersonic_sdk.db";
    final String h = IronSourceConstants.EVENTS_PROVIDER;
    final String i = "placement";
    private final String j = "abt";
    private final String k = R6.b1;
    private boolean m = false;
    private boolean n = false;
    private int o = -1;
    private boolean s = true;
    private int w = 100;
    private int x = 5000;
    private int y = 1;
    private Map<String, String> D = new HashMap();
    private Map<String, String> E = new HashMap();
    private String F = "";
    private final Object N = new Object();

    /* JADX INFO: renamed from: com.ironsource.r3$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4949r3.this.a();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.r3$b */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements Runnable {
        final /* synthetic */ C5 a;
        final /* synthetic */ IronSource.a b;

        public b(C5 c5, IronSource.a aVar) {
            this.a = c5;
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a("eventSessionId", AbstractC4949r3.this.u.b());
            this.a.a("essn", Integer.valueOf(AbstractC4949r3.this.u.c()));
            String strA = IronSourceUtils.a(AbstractC4949r3.this.v);
            if (AbstractC4949r3.this.g(this.a)) {
                this.a.a("connectionType", strA);
            }
            if (AbstractC4949r3.p(this.a, AbstractC4949r3.this, strA)) {
                C5 c5 = this.a;
                c5.a(AbstractC4949r3.this.b(c5));
            }
            String strD = Y3.d(AbstractC4949r3.this.v);
            if (strD != null) {
                this.a.a("rawConnectionType", strD);
            }
            int iA = AbstractC4949r3.this.a(this.a.c(), this.b);
            if (iA != e.NOT_SUPPORTED.b()) {
                this.a.a("adUnit", Integer.valueOf(iA));
            }
            AbstractC4949r3.this.a(this.a, "reason");
            AbstractC4949r3.this.a(this.a, IronSourceConstants.EVENTS_EXT1);
            if (!AbstractC4949r3.this.E.isEmpty()) {
                for (Map.Entry entry : AbstractC4949r3.this.E.entrySet()) {
                    if (!this.a.b().has((String) entry.getKey()) && entry.getKey() != "eventId" && entry.getKey() != "timestamp") {
                        this.a.a((String) entry.getKey(), entry.getValue());
                    }
                }
            }
            if (AbstractC4949r3.this.i(this.a)) {
                if (AbstractC4949r3.this.h(this.a) && !AbstractC4949r3.this.e(this.a)) {
                    this.a.a("sessionDepth", Integer.valueOf(AbstractC4949r3.this.c(this.a)));
                }
                if (AbstractC4949r3.this.j(this.a)) {
                    AbstractC4949r3.this.f(this.a);
                }
                long jA = AbstractC4949r3.this.u.a();
                if (jA > 0) {
                    this.a.a("firstSessionTimestamp", Long.valueOf(jA));
                }
                IronLog.EVENT.verbose(this.a.toString());
                AbstractC4949r3.this.r.add(this.a);
                AbstractC4949r3.this.t++;
            }
            AbstractC4949r3 abstractC4949r3 = AbstractC4949r3.this;
            boolean zA = abstractC4949r3.a(abstractC4949r3.B);
            AbstractC4949r3 abstractC4949r4 = AbstractC4949r3.this;
            C5 c6 = this.a;
            boolean zA2 = zA ? abstractC4949r4.a(c6.c(), AbstractC4949r3.this.B) : abstractC4949r4.d(c6);
            AbstractC4949r3 abstractC4949r5 = AbstractC4949r3.this;
            if (!abstractC4949r5.m && zA2) {
                abstractC4949r5.m = true;
            }
            if (abstractC4949r5.p != null) {
                boolean zG = abstractC4949r5.g();
                AbstractC4949r3 abstractC4949r6 = AbstractC4949r3.this;
                if (zG) {
                    abstractC4949r6.f();
                } else if (abstractC4949r6.b((ArrayList<C5>) abstractC4949r6.r) || zA2) {
                    AbstractC4949r3.this.a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.r3$c */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c implements G7 {
        public c() {
        }

        public void a(ArrayList<C5> arrayList) {
            if (arrayList != null) {
                try {
                    arrayList.clear();
                } catch (Exception e) {
                    C4950r4.d().a(e);
                    IronLog.INTERNAL.error("clearData exception: " + e.getMessage());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(G7.a aVar) {
            try {
                if (aVar.c()) {
                    AbstractC4949r3 abstractC4949r3 = AbstractC4949r3.this;
                    ArrayList<C5> arrayListA = abstractC4949r3.p.a(abstractC4949r3.I);
                    AbstractC4949r3.this.t = arrayListA.size() + AbstractC4949r3.this.r.size();
                } else {
                    IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                    AbstractC4949r3.this.a(AbstractC4949r3.this.a(aVar.b(), aVar.a()));
                }
            } catch (Exception e) {
                C4950r4.d().a(e);
            }
            a(aVar.b());
        }

        @Override // com.ironsource.G7
        public synchronized void a(G7.a aVar) {
            AbstractC4949r3.this.K.a(new fh(0, this, aVar));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.r3$d */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4949r3.this.f();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.r3$e */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum e {
        NOT_SUPPORTED(-1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        NATIVE_AD(4),
        BANNER(8);

        private int a;

        public int b() {
            return this.a;
        }

        e(int i) {
            this.a = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void f() {
        ArrayList<C5> arrayListA;
        try {
            this.m = false;
            ArrayList<C5> arrayList = new ArrayList<>();
            try {
                synchronized (this.N) {
                    arrayListA = this.p.a(this.I);
                    this.p.b(this.I);
                }
                H5.c cVar = new H5.c(new H5.a(arrayListA, this.r), this.x);
                this.p.a(cVar.a(), this.I);
                arrayList.addAll(cVar.b());
            } catch (Throwable th) {
                C4950r4.d().a(th);
                IronLog.INTERNAL.error("CombinedEventList exception: " + th.getMessage());
                arrayList.clear();
                arrayList.addAll(this.r);
            }
            if (arrayList.size() > 0) {
                this.r.clear();
                this.t = 0;
                JSONObject jSONObjectB = O6.a().b();
                try {
                    a(jSONObjectB);
                    String strB = b();
                    if (!TextUtils.isEmpty(strB)) {
                        jSONObjectB.put("abt", strB);
                    }
                    String strJ = com.ironsource.mediationsdk.p.g().j();
                    if (!TextUtils.isEmpty(strJ)) {
                        jSONObjectB.put(R6.b1, strJ);
                    }
                    Map<String, String> mapC = c();
                    if (!mapC.isEmpty()) {
                        for (Map.Entry<String, String> entry : mapC.entrySet()) {
                            if (!jSONObjectB.has(entry.getKey())) {
                                jSONObjectB.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    JSONObject jSONObjectA = new M5().a();
                    Iterator<String> itKeys = jSONObjectA.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObjectB.put(next, jSONObjectA.get(next));
                    }
                } catch (Throwable th2) {
                    C4950r4.d().a(th2);
                    IronLog.INTERNAL.error("Exception while building the event general properties: " + th2.getMessage());
                }
                String strA = this.q.a(arrayList, jSONObjectB);
                if (TextUtils.isEmpty(strA)) {
                    IronLog.INTERNAL.error("Failed to parse events.");
                    return;
                }
                if (!O && this.l && a(arrayList, D5.FIRST_INSTANCE.c())) {
                    IronLog.INTERNAL.verbose("events data: " + strA);
                    O = true;
                }
                if (this.n) {
                    try {
                        strA = Base64.encodeToString(Y9.a(strA, this.o), 0);
                    } catch (Exception e2) {
                        C4950r4.d().a(e2);
                    }
                }
                Jf.a.b(new N5(new c(), strA, this.q.b(), arrayList));
            }
        } catch (Throwable th3) {
            C4950r4.d().a(th3);
            IronLog.INTERNAL.error("Send event exception: " + th3.getMessage());
        }
    }

    public abstract int c(C5 c5);

    public abstract void d();

    public abstract boolean d(C5 c5);

    public abstract String e(int i);

    public abstract void f(C5 c5);

    public abstract boolean j(C5 c5);

    private void a(JSONObject jSONObject) {
        try {
            C4796ia c4796ia = this.L;
            if (c4796ia != null) {
                if (c4796ia.a() > 0) {
                    jSONObject.put("age", this.L.a());
                }
                if (!TextUtils.isEmpty(this.L.b())) {
                    jSONObject.put(C4796ia.n, this.L.b());
                }
                if (this.L.e() > 0) {
                    jSONObject.put("lvl", this.L.e());
                }
                if (this.L.d() != null) {
                    jSONObject.put("pay", this.L.d().get());
                }
                if (this.L.c() > 0.0d) {
                    jSONObject.put("iapt", this.L.c());
                }
                if (this.L.h() > 0) {
                    jSONObject.put("ucd", this.L.h());
                }
            }
            Ve ve = this.M;
            if (ve != null) {
                String strB = ve.b();
                if (!TextUtils.isEmpty(strB)) {
                    jSONObject.put("segmentId", strB);
                }
                JSONObject jSONObjectA = this.M.a();
                Iterator<String> itKeys = jSONObjectA.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectA.get(next));
                }
            }
        } catch (JSONException e2) {
            C4950r4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    private void b(String str) {
        AbstractC4713e abstractC4713e = this.q;
        if (abstractC4713e == null || !abstractC4713e.c().equals(str)) {
            this.q = K5.a(str, this.G);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(C5 c5) {
        if (c5 == null) {
            return false;
        }
        if (a(this.z)) {
            return !a(c5.c(), this.z);
        }
        if (a(this.A)) {
            return a(c5.c(), this.A);
        }
        return true;
    }

    @Override // com.ironsource.F7
    public void c(int[] iArr, Context context) {
        this.A = iArr;
        IronSourceUtils.b(context, this.I, iArr);
    }

    @Override // com.ironsource.F7
    public void d(int[] iArr, Context context) {
        this.C = iArr;
        IronSourceUtils.a(context, this.I, iArr);
    }

    public void e() {
        this.r = new ArrayList<>();
        this.t = 0;
        this.q = K5.a(this.H, this.G);
        F5 f5 = new F5(nj.q(new StringBuilder(), this.I, "EventThread"));
        this.K = f5;
        f5.start();
        this.K.a();
        this.u = Pb.k0().m();
        this.J = new HashSet();
        d();
    }

    public static /* bridge */ /* synthetic */ boolean p(C5 c5, AbstractC4949r3 abstractC4949r3, String str) {
        return abstractC4949r3.a(str, c5);
    }

    public boolean g(C5 c5) {
        if (c5.c() != D5.CONSENT_TRUE_CODE.c() && c5.c() != D5.CONSENT_FALSE_CODE.c() && c5.c() != D5.SET_META_DATA.c() && c5.c() != D5.SET_META_DATA_AFTER_INIT.c() && c5.c() != D5.SET_USER_ID.c()) {
            return true;
        }
        return false;
    }

    public boolean h(C5 c5) {
        if (c5.c() != D5.FIRST_INSTANCE.c() && c5.c() != D5.FIRST_INSTANCE_RESULT.c() && c5.c() != D5.INIT_COMPLETE.c() && c5.c() != D5.SDK_INIT_FAILED.c() && c5.c() != D5.SDK_INIT_SUCCESS.c() && c5.c() != D5.USING_CACHE_FOR_INIT_EVENT.c() && c5.c() != D5.CONSENT_TRUE_CODE.c() && c5.c() != D5.CONSENT_FALSE_CODE.c() && c5.c() != D5.SET_META_DATA.c() && c5.c() != D5.SET_META_DATA_AFTER_INIT.c() && c5.c() != D5.SET_USER_ID.c()) {
            return true;
        }
        return false;
    }

    @Override // com.ironsource.F7
    public void d(int i) {
        if (i > 0) {
            this.x = i;
        }
    }

    @Override // com.ironsource.F7
    public void c(int i) {
        this.o = i;
    }

    public void c(boolean z) {
        this.l = z;
    }

    public Map<String, String> c() {
        return this.D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int b(C5 c5) {
        return c5.c() + 90000;
    }

    @Override // com.ironsource.F7
    public void b(int i) {
        if (i > 0) {
            this.y = i;
        }
    }

    @Override // com.ironsource.F7
    public void b(int[] iArr, Context context) {
        this.z = iArr;
        IronSourceUtils.c(context, this.I, iArr);
    }

    @Override // com.ironsource.F7
    public void b(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC4713e abstractC4713e = this.q;
        if (abstractC4713e != null) {
            abstractC4713e.a(str);
        }
        IronSourceUtils.e(context, this.I, str);
    }

    @Override // com.ironsource.F7
    public void b(boolean z) {
        this.n = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(ArrayList<C5> arrayList) {
        return arrayList != null && arrayList.size() >= this.y;
    }

    public String b() {
        return this.F;
    }

    public void b(Map<String, String> map) {
        this.E.putAll(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return (this.t >= this.w || this.m) && this.l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(C5 c5) {
        JSONObject jSONObjectB = c5.b();
        if (jSONObjectB == null) {
            return false;
        }
        return jSONObjectB.has("sessionDepth");
    }

    public void h() {
        this.K.a(new d());
    }

    public synchronized void a(Context context, C4796ia c4796ia) {
        String strA = IronSourceUtils.a(context, this.I, this.H);
        this.H = strA;
        b(strA);
        this.q.a(IronSourceUtils.b(context, this.I, (String) null));
        this.p = G4.a(context, "supersonic_sdk.db", 5);
        this.K.a(new a());
        this.z = IronSourceUtils.c(context, this.I);
        this.A = IronSourceUtils.b(context, this.I);
        this.B = IronSourceUtils.d(context, this.I);
        this.C = IronSourceUtils.a(context, this.I);
        this.L = c4796ia;
        this.v = context;
    }

    public synchronized void a(Ve ve) {
        this.M = ve;
    }

    private synchronized boolean a(String str, C5 c5) {
        boolean zContains;
        try {
            if (!str.equalsIgnoreCase("none")) {
                return false;
            }
            if (a(this.C)) {
                zContains = a(c5.c(), this.C);
            } else {
                zContains = this.J.contains(Integer.valueOf(c5.c()));
            }
            return zContains;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.ironsource.F7
    public synchronized void a(C5 c5) {
        a(c5, (IronSource.a) null);
    }

    public synchronized void a(C5 c5, @Nullable IronSource.a aVar) {
        if (c5 != null) {
            if (this.s) {
                this.K.a(new b(c5, aVar));
            }
        }
    }

    private boolean a(ArrayList<C5> arrayList, int i) {
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            C5 c5 = arrayList.get(i2);
            i2++;
            if (c5.c() == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<C5> a(ArrayList<C5> arrayList, String str) {
        String strA = a(str, 1024);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C5 c5 = arrayList.get(i);
            i++;
            c5.a(strA);
        }
        return arrayList;
    }

    public void a(ArrayList<C5> arrayList) {
        if (arrayList != null) {
            synchronized (this.N) {
                this.p.a(arrayList, this.I);
                this.t = this.p.a(this.I).size() + this.r.size();
            }
        }
    }

    @Override // com.ironsource.F7
    public void a(int i) {
        if (i > 0) {
            this.w = i;
        }
    }

    @Override // com.ironsource.F7
    public void a(int[] iArr, Context context) {
        this.B = iArr;
        IronSourceUtils.d(context, this.I, iArr);
    }

    @Override // com.ironsource.F7
    public void a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.H = str;
        IronSourceUtils.d(context, this.I, str);
        b(str);
    }

    @Override // com.ironsource.F7
    public void a(boolean z) {
        this.s = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        synchronized (this.N) {
            this.p.a(this.r, this.I);
            this.r.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i, int[] iArr) {
        if (a(iArr)) {
            for (int i2 : iArr) {
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public void a(String str) {
        this.F = str;
    }

    public void a(Map<String, String> map) {
        this.D.putAll(map);
    }

    public void a(Map<String, Object> map, int i, String str) {
        map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(i));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        map.put(IronSourceConstants.AUCTION_FALLBACK, str);
    }

    private void a(C5 c5, String str, int i) {
        JSONObject jSONObjectB = c5.b();
        if (jSONObjectB == null || !jSONObjectB.has(str)) {
            return;
        }
        try {
            c5.a(str, a(jSONObjectB.optString(str, null), i));
        } catch (Exception e2) {
            C4950r4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public String a(String str, int i) {
        return (TextUtils.isEmpty(str) || str.length() <= i) ? str : str.substring(0, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C5 c5, String str) {
        a(c5, str, 1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i, @Nullable IronSource.a aVar) {
        int iB = e.NOT_SUPPORTED.b();
        if (aVar != IronSource.a.REWARDED_VIDEO && ((i < 1000 || i >= 2000) && (i < 91000 || i >= 92000))) {
            if (aVar != IronSource.a.INTERSTITIAL && ((i < 2000 || i >= 3000) && (i < 92000 || i >= 93000))) {
                if (aVar == IronSource.a.BANNER || ((i >= 3000 && i < 4000) || (i >= 93000 && i < 94000))) {
                    return e.BANNER.b();
                }
                return (aVar == IronSource.a.NATIVE_AD || (i >= 4000 && i < 5000) || (i >= 94000 && i < 95000)) ? e.NATIVE_AD.b() : iB;
            }
            return e.INTERSTITIAL.b();
        }
        return e.REWARDED_VIDEO.b();
    }

    public void a(C4796ia c4796ia) {
        this.L = c4796ia;
    }

    public void a(Runnable runnable) {
        this.K.a(runnable);
    }

    public int f(int i) {
        return a(i, (IronSource.a) null);
    }
}
