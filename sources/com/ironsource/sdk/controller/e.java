package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import com.ironsource.A4;
import com.ironsource.A8;
import com.ironsource.B4;
import com.ironsource.B8;
import com.ironsource.C4664b4;
import com.ironsource.C4666b6;
import com.ironsource.C4718e4;
import com.ironsource.C4808j5;
import com.ironsource.C4853le;
import com.ironsource.C4950r4;
import com.ironsource.C4983t1;
import com.ironsource.C4990t8;
import com.ironsource.C5008u8;
import com.ironsource.C5012uc;
import com.ironsource.C5026v8;
import com.ironsource.EnumC4685c7;
import com.ironsource.G5;
import com.ironsource.HandlerC4592a6;
import com.ironsource.InterfaceC4593a7;
import com.ironsource.InterfaceC5040w4;
import com.ironsource.InterfaceC5058x4;
import com.ironsource.InterfaceC5076y4;
import com.ironsource.M;
import com.ironsource.Pb;
import com.ironsource.Q3;
import com.ironsource.Sb;
import com.ironsource.Ub;
import com.ironsource.V7;
import com.ironsource.X4;
import com.ironsource.Y4;
import com.ironsource.ch;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.singular.sdk.internal.Constants;
import defpackage.i93;
import defpackage.j93;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class e implements com.ironsource.sdk.controller.c, com.ironsource.sdk.controller.l {
    private com.ironsource.sdk.controller.l b;
    private CountDownTimer d;
    private final V7 g;
    private final ch h;
    private final C5012uc k;
    private final String a = Constants.RequestBody.EXTRA_ATTRIBUTES_KEY;
    private C4990t8.b c = C4990t8.b.None;
    private final Q3 e = new Q3("NativeCommandExecutor");
    private final Q3 f = new Q3("ControllerCommandsExecutor");
    private final Map<String, com.ironsource.sdk.controller.l.a> i = new HashMap();
    private final Map<String, com.ironsource.sdk.controller.l.b> j = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        final /* synthetic */ JSONObject a;
        final /* synthetic */ InterfaceC5058x4 b;

        public a(JSONObject jSONObject, InterfaceC5058x4 interfaceC5058x4) {
            this.a = jSONObject;
            this.b = interfaceC5058x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements Runnable {
        final /* synthetic */ X4 a;
        final /* synthetic */ Map b;
        final /* synthetic */ InterfaceC5058x4 c;

        public b(X4 x4, Map map, InterfaceC5058x4 interfaceC5058x4) {
            this.a = x4;
            this.b = map;
            this.c = interfaceC5058x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ X4 c;
        final /* synthetic */ InterfaceC5040w4 d;

        public c(String str, String str2, X4 x4, InterfaceC5040w4 interfaceC5040w4) {
            this.a = str;
            this.b = str2;
            this.c = x4;
            this.d = interfaceC5040w4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c, this.d);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class d implements Runnable {
        final /* synthetic */ JSONObject a;
        final /* synthetic */ InterfaceC5040w4 b;

        public d(JSONObject jSONObject, InterfaceC5040w4 interfaceC5040w4) {
            this.a = jSONObject;
            this.b = interfaceC5040w4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class RunnableC1381e implements Runnable {
        final /* synthetic */ X4 a;

        public RunnableC1381e(X4 x4) {
            this.a = x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class f implements Runnable {
        final /* synthetic */ X4 a;

        public f(X4 x4) {
            this.a = x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.b(this.a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class g implements Runnable {
        final /* synthetic */ X4 a;
        final /* synthetic */ Map b;
        final /* synthetic */ InterfaceC5040w4 c;

        public g(X4 x4, Map map, InterfaceC5040w4 interfaceC5040w4) {
            this.a = x4;
            this.b = map;
            this.c = interfaceC5040w4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class h implements Runnable {
        final /* synthetic */ com.ironsource.sdk.controller.l.a a;
        final /* synthetic */ com.ironsource.sdk.controller.f.c b;

        public h(com.ironsource.sdk.controller.l.a aVar, com.ironsource.sdk.controller.f.c cVar) {
            this.a = aVar;
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            if (eVar.b != null) {
                if (this.a != null) {
                    eVar.i.put(this.b.f(), this.a);
                }
                e.this.b.a(this.b, this.a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class i implements Runnable {
        final /* synthetic */ JSONObject a;

        public i(JSONObject jSONObject) {
            this.a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.b(this.a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a();
                e.this.b = null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class k extends CountDownTimer {
        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }

        public k(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(e.this.a, "Global Controller Timer Finish");
            e.this.d(C4664b4.c.k);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.d();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class m implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        public m(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e eVar = e.this;
                eVar.b = eVar.b(eVar.h.b(), e.this.h.d(), e.this.h.f(), e.this.h.e(), e.this.h.g(), e.this.h.c(), this.a, this.b);
                e.this.b.b();
            } catch (Throwable th) {
                C4950r4.d().a(th);
                e.this.d(Log.getStackTraceString(th));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class n extends CountDownTimer {
        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }

        public n(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(e.this.a, "Recovered Controller | Global Controller Timer Finish");
            e.this.d(C4664b4.c.k);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class o implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ X4 c;
        final /* synthetic */ InterfaceC5076y4 d;

        public o(String str, String str2, X4 x4, InterfaceC5076y4 interfaceC5076y4) {
            this.a = str;
            this.b = str2;
            this.c = x4;
            this.d = interfaceC5076y4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c, this.d);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class p implements Runnable {
        final /* synthetic */ JSONObject a;
        final /* synthetic */ InterfaceC5076y4 b;

        public p(JSONObject jSONObject, InterfaceC5076y4 interfaceC5076y4) {
            this.a = jSONObject;
            this.b = interfaceC5076y4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class q implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ X4 c;
        final /* synthetic */ InterfaceC5058x4 d;

        public q(String str, String str2, X4 x4, InterfaceC5058x4 interfaceC5058x4) {
            this.a = str;
            this.b = str2;
            this.c = x4;
            this.d = interfaceC5058x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c, this.d);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class r implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ InterfaceC5058x4 b;

        public r(String str, InterfaceC5058x4 interfaceC5058x4) {
            this.a = str;
            this.b = interfaceC5058x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class s implements Runnable {
        final /* synthetic */ X4 a;
        final /* synthetic */ Map b;
        final /* synthetic */ InterfaceC5058x4 c;

        public s(X4 x4, Map map, InterfaceC5058x4 interfaceC5058x4) {
            this.a = x4;
            this.b = map;
            this.c = interfaceC5058x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            A8.a(C4853le.j, new C5026v8().a(G5.v, this.a.f()).a("producttype", B8.a(this.a, C4990t8.e.Interstitial)).a(G5.x, Boolean.valueOf(B8.a(this.a))).a(G5.I, Long.valueOf(M.a.b(this.a.h()))).a());
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.b(this.a, this.b, this.c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public v b(Context context, C4718e4 c4718e4, Y4 y4, int i2, C4808j5 c4808j5, String str, String str2, String str3) throws Throwable {
        A8.a(C4853le.c, new C5026v8().a(G5.y, "thread-" + Thread.currentThread().getName()).a());
        v vVar = new v(context, y4, c4718e4, this, this.g, i2, c4808j5, str, i(), j(), str2, str3);
        C4666b6 c4666b6 = new C4666b6(context, c4808j5, new HandlerC4592a6(this.g.b()), new Ub(c4808j5.a()));
        vVar.a(new u(context));
        vVar.a(new com.ironsource.sdk.controller.o(context));
        vVar.a(new com.ironsource.sdk.controller.q(context));
        vVar.a(new com.ironsource.sdk.controller.i(context));
        vVar.a(new com.ironsource.sdk.controller.a(context));
        vVar.a(new com.ironsource.sdk.controller.j(c4808j5.a(), c4666b6));
        vVar.a(new C4983t1());
        vVar.a(new B4(context, new A4()));
        return vVar;
    }

    private com.ironsource.sdk.controller.l.a i() {
        return new j93(this, 2);
    }

    private com.ironsource.sdk.controller.l.b j() {
        return new i93(this, 1);
    }

    private void l() {
        Logger.i(this.a, "handleReadyState");
        this.c = C4990t8.b.Ready;
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        n();
        this.f.c();
        this.f.a();
        com.ironsource.sdk.controller.l lVar = this.b;
        if (lVar != null) {
            lVar.f();
        }
    }

    private boolean m() {
        return C4990t8.b.Ready.equals(this.c);
    }

    private void n() {
        this.h.a(true);
        com.ironsource.sdk.controller.l lVar = this.b;
        if (lVar != null) {
            lVar.a(this.h.i());
        }
    }

    @Override // com.ironsource.sdk.controller.c
    public void c(String str) {
        Logger.i(this.a, "handleControllerFailed ");
        C5026v8 c5026v8 = new C5026v8();
        c5026v8.a(G5.A, str);
        c5026v8.a(G5.y, String.valueOf(this.h.l()));
        A8.a(C4853le.o, c5026v8.a());
        this.h.a(false);
        e(str);
        if (this.d != null) {
            Logger.i(this.a, "cancel timer mControllerReadyTimer");
            this.d.cancel();
        }
        d(str);
    }

    @Override // com.ironsource.sdk.controller.c
    public void d() {
        Logger.i(this.a, "handleControllerReady ");
        this.k.a(h());
        if (C4990t8.c.Web.equals(h())) {
            A8.a(C4853le.e, new C5026v8().a(G5.y, String.valueOf(this.h.l())).a());
            IronSourceNetwork.updateInitSucceeded();
        }
        l();
    }

    @Override // com.ironsource.sdk.controller.l
    public C4990t8.c h() {
        com.ironsource.sdk.controller.l lVar = this.b;
        return lVar != null ? lVar.h() : C4990t8.c.None;
    }

    public com.ironsource.sdk.controller.l k() {
        return this.b;
    }

    public e(Context context, C4718e4 c4718e4, Y4 y4, V7 v7, int i2, JSONObject jSONObject, String str, String str2, C5012uc c5012uc) {
        this.k = c5012uc;
        this.g = v7;
        String networkStorageDir = IronSourceStorageUtils.getNetworkStorageDir(context);
        C4808j5 c4808j5A = C4808j5.a(networkStorageDir, v7, jSONObject);
        this.h = new ch(context, c4718e4, y4, i2, c4808j5A, networkStorageDir);
        a(context, c4718e4, y4, i2, c4808j5A, networkStorageDir, str, str2);
    }

    @Override // com.ironsource.InterfaceC4721e7
    public void a(@NotNull InterfaceC4593a7 interfaceC4593a7) {
        EnumC4685c7 enumC4685c7B = interfaceC4593a7.b();
        if (enumC4685c7B == EnumC4685c7.SendEvent) {
            A8.a(C4853le.A, new C5026v8().a(G5.y, interfaceC4593a7.a() + " : strategy: " + enumC4685c7B).a());
            return;
        }
        if (enumC4685c7B == EnumC4685c7.NativeController) {
            com.ironsource.sdk.controller.n nVar = new com.ironsource.sdk.controller.n(interfaceC4593a7.a(), this.g);
            this.b = nVar;
            this.k.a(nVar.h());
            A8.a(C4853le.d, new C5026v8().a(G5.A, interfaceC4593a7.a() + " : strategy: " + enumC4685c7B).a());
            A8.a(C4853le.A, new C5026v8().a(G5.y, interfaceC4593a7.a() + " : strategy: " + enumC4685c7B).a());
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
        com.ironsource.sdk.controller.l lVar;
        if (m() && (lVar = this.b) != null) {
            lVar.e();
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
        com.ironsource.sdk.controller.l lVar;
        if (m() && (lVar = this.b) != null) {
            lVar.g();
        }
    }

    @Override // com.ironsource.sdk.controller.l
    @Deprecated
    public void f() {
    }

    private void e(String str) {
        IronSourceNetwork.updateInitFailed(new C5008u8(1001, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        A8.a(C4853le.d, new C5026v8().a(G5.A, str).a());
        this.c = C4990t8.b.Loading;
        this.b = new com.ironsource.sdk.controller.n(str, this.g);
        this.e.c();
        this.e.a();
        V7 v7 = this.g;
        if (v7 != null) {
            v7.c(new l());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Context context, C4718e4 c4718e4, Y4 y4, int i2, C4808j5 c4808j5, String str, String str2, String str3) {
        try {
            try {
                this.d = new k(200000L, 1000L).start();
                v vVarB = b(context, c4718e4, y4, i2, c4808j5, str, str2, str3);
                this.b = vVarB;
                vVarB.b();
            } catch (Throwable th) {
                th = th;
                this = this;
                Throwable th2 = th;
                C4950r4.d().a(th2);
                this.d(Log.getStackTraceString(th2));
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.ironsource.sdk.controller.c
    public void c() {
        Logger.i(this.a, "handleControllerLoaded");
        this.c = C4990t8.b.Loaded;
        this.e.c();
        this.e.a();
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.ironsource.sdk.controller.f.a aVar) {
        com.ironsource.sdk.controller.l.a aVarRemove = this.i.remove(aVar.c());
        if (aVarRemove != null) {
            aVarRemove.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Sb sb) {
        com.ironsource.sdk.controller.l.b bVar = this.j.get(sb.d());
        if (bVar != null) {
            bVar.a(sb);
        }
    }

    private void a(Runnable runnable, long j2) {
        V7 v7 = this.g;
        if (v7 != null) {
            v7.d(runnable, j2);
        } else {
            Logger.e(this.a, "mThreadManager = null");
        }
    }

    private void a(final Context context, final C4718e4 c4718e4, final Y4 y4, final int i2, final C4808j5 c4808j5, final String str, final String str2, final String str3) {
        int iE = Pb.k0().h().E();
        if (iE > 0) {
            A8.a(C4853le.B, new C5026v8().a(G5.y, String.valueOf(iE)).a());
        }
        Runnable runnable = new Runnable() { // from class: uc3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.c(context, c4718e4, y4, i2, c4808j5, str, str2, str3);
            }
        };
        if (Pb.k0().h().v()) {
            this.g.b(runnable, iE);
        } else {
            a(runnable, iE);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
    }

    private void b(Runnable runnable) {
        a(runnable, 0L);
    }

    @Override // com.ironsource.sdk.controller.c
    public void b(String str) {
        A8.a(C4853le.y, new C5026v8().a(G5.y, str).a());
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        d(str);
    }

    public void a(Runnable runnable) {
        this.e.a(runnable);
    }

    private void a(C4990t8.e eVar, X4 x4, String str, String str2) {
        Logger.i(this.a, "recoverWebController for product: " + eVar.toString());
        C5026v8 c5026v8 = new C5026v8();
        c5026v8.a("producttype", eVar.toString());
        c5026v8.a(G5.v, x4.f());
        A8.a(C4853le.b, c5026v8.a());
        this.h.n();
        a();
        m mVar = new m(str, str2);
        if (Pb.k0().h().v()) {
            this.g.b(mVar);
        } else {
            b(mVar);
        }
        this.d = new n(200000L, 1000L).start();
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(X4 x4, Map<String, String> map, InterfaceC5058x4 interfaceC5058x4) {
        this.f.a(new s(x4, map, interfaceC5058x4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(X4 x4) {
        this.f.a(new f(x4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
        this.f.a(new i(jSONObject));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.b) == null) {
            return;
        }
        lVar.b(context);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, X4 x4, InterfaceC5076y4 interfaceC5076y4) {
        if (this.h.a(h(), this.c)) {
            a(C4990t8.e.RewardedVideo, x4, str, str2);
        }
        this.f.a(new o(str, str2, x4, interfaceC5076y4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC5076y4 interfaceC5076y4) {
        this.f.a(new p(jSONObject, interfaceC5076y4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, X4 x4, InterfaceC5058x4 interfaceC5058x4) {
        if (this.h.a(h(), this.c)) {
            a(C4990t8.e.Interstitial, x4, str, str2);
        }
        this.f.a(new q(str, str2, x4, interfaceC5058x4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC5058x4 interfaceC5058x4) {
        Logger.i(this.a, "load interstitial");
        this.f.a(new r(str, interfaceC5058x4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC5058x4 interfaceC5058x4) {
        this.f.a(new a(jSONObject, interfaceC5058x4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(X4 x4, Map<String, String> map, InterfaceC5058x4 interfaceC5058x4) {
        this.f.a(new b(x4, map, interfaceC5058x4));
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        if (this.b == null || !m()) {
            return false;
        }
        return this.b.a(str);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, X4 x4, InterfaceC5040w4 interfaceC5040w4) {
        if (this.h.a(h(), this.c)) {
            a(C4990t8.e.Banner, x4, str, str2);
        }
        this.f.a(new c(str, str2, x4, interfaceC5040w4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC5040w4 interfaceC5040w4) {
        this.f.a(new d(jSONObject, interfaceC5040w4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(X4 x4) {
        this.f.a(new RunnableC1381e(x4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(X4 x4, Map<String, String> map, InterfaceC5040w4 interfaceC5040w4) {
        this.f.a(new g(x4, map, interfaceC5040w4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(com.ironsource.sdk.controller.f.c cVar, @Nullable com.ironsource.sdk.controller.l.a aVar) {
        this.f.a(new h(aVar, cVar));
    }

    public void a(String str, com.ironsource.sdk.controller.l.b bVar) {
        this.j.put(str, bVar);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.b) == null) {
            return;
        }
        lVar.a(context);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
        Logger.i(this.a, "destroy controller");
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        Q3 q3 = this.f;
        if (q3 != null) {
            q3.b();
        }
        this.d = null;
        b(new j());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
        this.b.a(activity);
    }
}
