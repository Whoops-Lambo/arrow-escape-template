package com.ironsource;

import android.text.TextUtils;
import com.ironsource.P0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.h50;
import defpackage.nj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.p3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4914p3<Listener extends P0> implements NetworkInitializationListener, Af.a, D0, AdapterAdListener, P8.b {
    protected C4875n0 a;
    protected Listener b;
    protected BaseAdAdapter<?, AdapterAdListener> c;
    protected E0 d;
    protected h e;
    protected C4870md g;
    protected C4679c1 h;
    protected JSONObject i;
    protected String j;
    protected AdData k;
    protected Long l;
    protected C4844l5 m;
    private final C5074y2 o;
    private final InterfaceC5067xd p;
    private AtomicBoolean f = new AtomicBoolean(false);
    private Af n = new Af(TimeUnit.SECONDS.toMillis(s()));
    protected final Object q = new Object();

    /* JADX INFO: renamed from: com.ironsource.p3$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends com.ironsource.environment.thread.a {
        public a() {
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            AbstractC4914p3.this.L();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p3$b */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b extends com.ironsource.environment.thread.a {
        public b() {
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            AbstractC4914p3.this.K();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p3$c */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c extends com.ironsource.environment.thread.a {
        final /* synthetic */ int b;
        final /* synthetic */ String c;

        public c(int i, String str) {
            this.b = i;
            this.c = str;
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            AbstractC4914p3.this.a(this.b, this.c);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p3$d */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class d extends com.ironsource.environment.thread.a {
        public d() {
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            AbstractC4914p3.this.I();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p3$e */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class e extends com.ironsource.environment.thread.a {
        final /* synthetic */ AdapterErrorType b;
        final /* synthetic */ int c;
        final /* synthetic */ String d;

        public e(AdapterErrorType adapterErrorType, int i, String str) {
            this.b = adapterErrorType;
            this.c = i;
            this.d = str;
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            AbstractC4914p3.this.a(this.b, this.c, this.d);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p3$f */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class f extends com.ironsource.environment.thread.a {
        public f() {
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            AbstractC4914p3.this.J();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p3$g */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class g extends com.ironsource.environment.thread.a {
        public g() {
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            AbstractC4914p3.this.H();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p3$h */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum h {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        SHOWING,
        FAILED
    }

    private int o() {
        return 1;
    }

    public boolean O() {
        return true;
    }

    public String d() {
        return a((String) null);
    }

    public boolean v() {
        return false;
    }

    private boolean D() {
        return this.e == h.INIT_IN_PROGRESS;
    }

    private void F() {
        IronLog.INTERNAL.verbose(d());
        a(h.LOADING);
        a(false);
        try {
            this.n.a((Af.a) this);
            G();
        } catch (Throwable th) {
            C4950r4.d().a(th);
            String str = "unexpected error while calling adapter.loadAd() - " + th.getMessage() + " - state = " + this.e;
            IronLog.INTERNAL.error(a(str));
            E0 e0 = this.d;
            if (e0 != null) {
                e0.j.g(str);
            }
            onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        IronLog.INTERNAL.verbose(d());
        E0 e0 = this.d;
        if (e0 != null) {
            e0.i.a(j());
        }
        this.b.e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        boolean zO;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        Af af = this.n;
        if (af != null) {
            af.e();
        }
        synchronized (this.q) {
            try {
                h hVar = this.e;
                zO = false;
                if (hVar == h.LOADING) {
                    long jA = C4844l5.a(this.m);
                    ironLog.verbose(a("Load duration = " + jA));
                    if (this.d != null) {
                        boolean zV = v();
                        E0 e0 = this.d;
                        if (zV) {
                            e0.f.a(jA);
                        } else {
                            e0.f.a(jA, false);
                        }
                    }
                    a(h.LOADED);
                    zO = O();
                } else if (hVar != h.FAILED) {
                    ironLog.error(a("unexpected load success for " + k() + ", state - " + this.e));
                    h hVar2 = this.e;
                    StringBuilder sb = new StringBuilder("unexpected load success, state - ");
                    sb.append(hVar2);
                    String string = sb.toString();
                    if (this.d != null) {
                        boolean zV2 = v();
                        E0 e1 = this.d;
                        if (zV2) {
                            e1.j.s(string);
                        } else {
                            e1.j.p(string);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zO) {
            this.b.d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        IronLog.INTERNAL.verbose(d());
        a(h.SHOWING);
        E0 e0 = this.d;
        if (e0 != null) {
            e0.i.g(j());
        }
        this.b.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        if (D()) {
            Af af = this.n;
            if (af != null) {
                af.e();
            }
            a(h.READY_TO_LOAD);
            F();
            return;
        }
        if (this.e == h.FAILED) {
            return;
        }
        ironLog.error(a("unexpected init success for " + k() + ", state - " + this.e));
        if (this.d != null) {
            this.d.j.n("unexpected init success, state - " + this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        long jA = C4844l5.a(this.m);
        IronLog ironLog = IronLog.INTERNAL;
        StringBuilder sbO = h50.o(jA, "Load duration = ", ", state = ");
        sbO.append(this.e);
        sbO.append(", isBidder = ");
        sbO.append(w());
        ironLog.verbose(a(sbO.toString()));
        synchronized (this.q) {
            try {
                if (z()) {
                    a(h.FAILED);
                    E0 e0 = this.d;
                    if (e0 != null) {
                        e0.f.a(jA, 1025, false);
                        this.d.f.a(jA, 1025, "time out", false);
                    }
                    this.b.a(ErrorBuilder.buildLoadFailedError("time out"), this);
                    return;
                }
                ironLog.error(a("unexpected timeout for " + k() + ", state - " + this.e + ", error - 1025"));
                if (this.d != null) {
                    this.d.j.u("unexpected timeout, state - " + this.e + ", error - 1025");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NotNull AdapterErrorType adapterErrorType, int i, String str) {
        long jA = C4844l5.a(this.m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + jA + ", error = " + i + ", " + str));
        Af af = this.n;
        if (af != null) {
            af.e();
        }
        synchronized (this.q) {
            h hVar = this.e;
            if (hVar == h.LOADING) {
                a(adapterErrorType, i, str, jA);
                a(h.FAILED);
                this.b.a(new IronSourceError(i, str), this);
                return;
            }
            if (hVar == h.FAILED) {
                a(adapterErrorType, i, str, jA);
                return;
            }
            if (hVar == h.LOADED && adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
                this.l = Long.valueOf(System.currentTimeMillis());
                ironLog.error(a("ad expired for " + this.h.f() + ", state = " + this.e));
                E0 e0 = this.d;
                if (e0 != null) {
                    e0.j.a("ad expired, state = " + this.e);
                }
                return;
            }
            ironLog.error(a("unexpected load failed for " + k() + ", state - " + this.e + ", error - " + i + ", " + str));
            h hVar2 = this.e;
            StringBuilder sb = new StringBuilder("unexpected load failed, state - ");
            sb.append(hVar2);
            sb.append(", error - ");
            sb.append(i);
            sb.append(", ");
            sb.append(str);
            String string = sb.toString();
            if (this.d != null) {
                if (v()) {
                    this.d.j.r(string);
                } else if (this.a.a() != IronSource.a.REWARDED_VIDEO || this.e != h.SHOWING) {
                    this.d.j.o(string);
                }
            }
        }
    }

    private boolean b(B0 b0) {
        return new ArrayList(Arrays.asList(B0.LOAD_AD, B0.LOAD_AD_SUCCESS, B0.LOAD_AD_FAILED, B0.LOAD_AD_FAILED_WITH_REASON, B0.LOAD_AD_NO_FILL, B0.RELOAD_AD, B0.RELOAD_AD_SUCCESS, B0.RELOAD_AD_FAILED_WITH_REASON, B0.RELOAD_AD_NO_FILL, B0.DESTROY_AD, B0.AD_PRESENT_SCREEN, B0.AD_DISMISS_SCREEN, B0.AD_LEFT_APPLICATION, B0.AD_OPENED, B0.AD_CLOSED, B0.SHOW_AD, B0.SHOW_AD_FAILED, B0.AD_CLICKED, B0.AD_REWARDED)).contains(b0);
    }

    private int s() {
        C5074y2 c5074y2 = this.o;
        if (c5074y2 == null) {
            return this.a.f();
        }
        Integer numF = c5074y2.f();
        int iF = (numF == null || numF.intValue() <= 0) ? this.a.f() : numF.intValue();
        IronLog.INTERNAL.verbose(a("Load timeout for " + this.o.c() + " - " + iF + " seconds"));
        return iF;
    }

    public AtomicBoolean A() {
        return this.f;
    }

    public boolean C() {
        return this.e == h.SHOWING;
    }

    public void E() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        C5074y2 c5074y2I = i();
        String strK = c5074y2I.k();
        Map<String, Object> mapA = C4921pa.a(c5074y2I.a());
        mapA.put("adUnit", this.a.a());
        b(strK);
        try {
            boolean zV = v();
            E0 e0 = this.d;
            boolean z = false;
            if (zV) {
                e0.f.d();
            } else {
                e0.f.a(false);
            }
            this.l = null;
            this.m = new C4844l5();
            this.k = a(strK, mapA);
            synchronized (this.q) {
                if (this.e != h.NONE) {
                    z = true;
                } else {
                    a(h.INIT_IN_PROGRESS);
                }
            }
            if (z) {
                String str = "loadAd - incorrect state while loading, state = " + this.e;
                ironLog.error(a(str));
                this.d.j.g(str);
                onInitFailed(A0.c(this.a.a()), str);
                return;
            }
            this.n.a((Af.a) this);
            AdapterBaseInterface networkAdapter = this.c.getNetworkAdapter();
            if (networkAdapter != null) {
                networkAdapter.init(this.k, ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str2 = "loadAd - network adapter not available " + k();
            ironLog.error(a(str2));
            onInitFailed(A0.c(this.a.a()), str2);
        } catch (Throwable th) {
            C4950r4.d().a(th);
            String str3 = "loadAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str3));
            E0 e1 = this.d;
            if (e1 != null) {
                e1.j.g(str3);
            }
            onInitFailed(A0.c(this.a.a()), str3);
        }
    }

    public void G() {
        Object obj = this.c;
        if (obj instanceof AdapterAdFullScreenInterface) {
            ((AdapterAdFullScreenInterface) obj).loadAd(this.k, ContextProvider.getInstance().getCurrentActiveActivity(), this);
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0055 A[Catch: all -> 0x000b, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x0008, B:15:0x0051, B:17:0x0055, B:18:0x005a, B:20:0x005e, B:21:0x0063, B:12:0x000e, B:14:0x004a), top: B:27:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x005e A[Catch: all -> 0x000b, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x0008, B:15:0x0051, B:17:0x0055, B:18:0x005a, B:20:0x005e, B:21:0x0063, B:12:0x000e, B:14:0x004a), top: B:27:0x0003, inners: #0 }] */
    public void M() {
        E0 e0;
        Af af;
        synchronized (this) {
            if (this.c != null) {
                try {
                    this.c = null;
                } catch (Exception e2) {
                    C4950r4.d().a(e2);
                    String str = "Exception while calling adapter.releaseMemory() from " + this.h.f() + " - " + e2.getMessage() + " - state = " + this.e;
                    IronLog.INTERNAL.error(a(str));
                    if (this.d != null) {
                        this.d.j.g(str);
                    }
                }
                e0 = this.d;
                if (e0 != null) {
                    e0.f();
                    this.d = null;
                }
                af = this.n;
                if (af != null) {
                    af.d();
                    this.n = null;
                }
            } else {
                e0 = this.d;
                if (e0 != null) {
                    e0.f();
                    this.d = null;
                }
                af = this.n;
                if (af != null) {
                    af.d();
                    this.n = null;
                }
            }
            throw th;
        }
    }

    public void N() {
        IronLog.INTERNAL.verbose(d());
        E0 e0 = this.d;
        if (e0 != null) {
            e0.i.a();
        }
    }

    @Override // com.ironsource.P8.b
    public String c() {
        return this.h.f();
    }

    public AdInfo f() {
        return new AdInfo(this.o.a(j()), this.o.d());
    }

    public IronSource.a g() {
        return this.a.a();
    }

    public String h() {
        return this.a.c();
    }

    public C5074y2 i() {
        return this.o;
    }

    public String j() {
        C4870md c4870md = this.g;
        return c4870md == null ? "" : c4870md.c();
    }

    public int l() {
        return this.h.d();
    }

    public String m() {
        boolean zIsMultipleInstances = this.h.h().isMultipleInstances();
        C4679c1 c4679c1 = this.h;
        return zIsMultipleInstances ? c4679c1.h().getProviderTypeForReflection() : c4679c1.f();
    }

    public String n() {
        return this.h.g();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        if (this.p.c()) {
            this.p.a(new g());
        } else {
            H();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(@NotNull AdapterErrorType adapterErrorType, int i, String str) {
        if (this.p.c()) {
            this.p.a(new e(adapterErrorType, i, str));
        } else {
            a(adapterErrorType, i, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        if (this.p.c()) {
            this.p.a(new d());
        } else {
            I();
        }
    }

    public void onAdOpened() {
        if (this.p.c()) {
            this.p.a(new f());
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(int i, String str) {
        if (this.p.c()) {
            this.p.a(new c(i, str));
        } else {
            a(i, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        if (this.p.c()) {
            this.p.a(new b());
        } else {
            K();
        }
    }

    public NetworkSettings p() {
        return this.a.g();
    }

    public Map<String, Object> q() {
        HashMap map = new HashMap();
        map.putAll(C4921pa.a(this.i));
        return map;
    }

    public Integer r() {
        C4875n0 c4875n0 = this.a;
        if (c4875n0 != null) {
            return Integer.valueOf(c4875n0.h());
        }
        return null;
    }

    public h t() {
        return this.e;
    }

    public InterfaceC5067xd u() {
        return this.p;
    }

    public boolean w() {
        return this.h.j();
    }

    public boolean x() {
        return this.e == h.FAILED;
    }

    public boolean y() {
        return this.e == h.LOADED;
    }

    public boolean z() {
        h hVar = this.e;
        return hVar == h.INIT_IN_PROGRESS || hVar == h.LOADING;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC4914p3(InterfaceC5067xd interfaceC5067xd, C4875n0 c4875n0, BaseAdAdapter<?, ?> baseAdAdapter, C4679c1 c4679c1, C5074y2 c5074y2, Listener listener) {
        this.a = c4875n0;
        this.b = listener;
        this.d = new E0(c4875n0.a(), E0.b.PROVIDER, this);
        this.h = c4679c1;
        this.i = c4679c1.c();
        this.c = baseAdAdapter;
        this.o = c5074y2;
        this.p = interfaceC5067xd;
        a(h.NONE);
    }

    public boolean B() {
        return y();
    }

    public String k() {
        return nj.k(hashCode(), c(), " ");
    }

    public Long e() {
        return this.l;
    }

    public void b(String str) {
        this.j = com.ironsource.mediationsdk.d.b().c(str);
    }

    @Override // com.ironsource.P8.b
    public int b() {
        return this.h.e();
    }

    public Map<String, Object> a(B0 b0) {
        HashMap map = new HashMap();
        try {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.c;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, baseAdAdapter != null ? baseAdAdapter.getNetworkAdapter().getAdapterVersion() : "");
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter2 = this.c;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, baseAdAdapter2 != null ? baseAdAdapter2.getNetworkAdapter().getNetworkSDKVersion() : "");
        } catch (Exception e2) {
            C4950r4.d().a(e2);
            IronLog.INTERNAL.error(a("could not get adapter version for event data" + k()));
        }
        map.put("spId", this.h.i());
        map.put(IronSourceConstants.EVENTS_PROVIDER, this.h.a());
        map.put("instanceType", Integer.valueOf(l()));
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(o()));
        if (!TextUtils.isEmpty(this.j)) {
            map.put("dynamicDemandSource", this.j);
        }
        map.put("sessionDepth", r());
        if (this.a.e() != null && this.a.e().length() > 0) {
            map.put("genericParams", this.a.e());
        }
        if (!TextUtils.isEmpty(this.a.c())) {
            map.put("auctionId", this.a.c());
        }
        if (b(b0)) {
            map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.a.d()));
            if (!TextUtils.isEmpty(this.a.b())) {
                map.put(IronSourceConstants.AUCTION_FALLBACK, this.a.b());
            }
        }
        if (!TextUtils.isEmpty(this.a.g().getCustomNetwork())) {
            map.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.a.g().getCustomNetwork());
        }
        return map;
    }

    public void a(h hVar) {
        IronLog.INTERNAL.verbose(d());
        this.e = hVar;
    }

    public void a(boolean z) {
        this.f.set(z);
    }

    public Map<String, Object> a(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("userId", this.a.i());
        return map;
    }

    public AdData a(String str, Map<String, Object> map) {
        return new AdData(str, q(), a(map));
    }

    public String a(String str) {
        String str2 = this.a.a().name() + " - " + k() + " - state = " + this.e;
        return TextUtils.isEmpty(str) ? str2 : h50.i(str2, " - ", str);
    }

    @Override // com.ironsource.Af.a
    public void a() {
        if (!this.p.c()) {
            L();
        } else {
            this.p.a(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i + ", " + str));
        if (D()) {
            Af af = this.n;
            if (af != null) {
                af.e();
            }
            a(h.FAILED);
            a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i, str, C4844l5.a(this.m));
            this.b.a(new IronSourceError(i, str), this);
            return;
        }
        if (this.e == h.FAILED) {
            return;
        }
        ironLog.error(a("unexpected init failed for " + k() + ", state - " + this.e + ", error - " + i + ", " + str));
        if (this.d != null) {
            this.d.j.m("unexpected init failed, state - " + this.e + ", error - " + i + ", " + str);
        }
    }

    private void a(AdapterErrorType adapterErrorType, int i, String str, long j) {
        if (this.d != null) {
            if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
                boolean zV = v();
                E0 e0 = this.d;
                if (zV) {
                    e0.f.a(j, i);
                    return;
                } else {
                    e0.f.b(j, i, false);
                    return;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                boolean zV2 = v();
                E0 e1 = this.d;
                if (zV2) {
                    e1.f.a(j, i, str);
                    return;
                } else {
                    e1.f.a(j, i, str, false);
                    return;
                }
            }
            this.d.f.a(j, i, false);
        }
    }
}
