package com.ironsource;

import com.ironsource.C4969s5;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import defpackage.cm2;
import defpackage.gd1;
import defpackage.kk2;
import defpackage.sr0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.s5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4969s5 implements D7, D7.a {

    @NotNull
    private JSONObject a = IronSourceNetworkBridge.jsonObjectInit();

    @NotNull
    private final gd1 b;

    @NotNull
    private final gd1 c;

    @NotNull
    private final gd1 d;

    @NotNull
    private final gd1 e;

    @NotNull
    private final gd1 f;

    @NotNull
    private final gd1 g;

    @NotNull
    private final gd1 h;

    @NotNull
    private final gd1 i;

    @NotNull
    private final gd1 j;

    @NotNull
    private final gd1 k;

    @NotNull
    private final gd1 l;

    @NotNull
    private final gd1 m;

    private final boolean N() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    private final boolean O() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    private final boolean P() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    private final boolean Q() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    private final boolean R() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    private final boolean S() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }

    private final boolean T() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    private final boolean U() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    private final boolean V() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    private final boolean W() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    private final boolean X() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    private final boolean Y() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    private final JSONObject Z() {
        JSONObject jSONObjectOptJSONObject = this.a.optJSONObject(C4987t5.a);
        return jSONObjectOptJSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : jSONObjectOptJSONObject;
    }

    @Override // com.ironsource.D7.a
    public void a(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = this.a;
        }
        this.a = jSONObject;
        IronLog.INTERNAL.verbose("setEpConfig: " + jSONObject);
    }

    @Override // com.ironsource.D7
    @NotNull
    public JSONObject config() {
        return this.a;
    }

    public C4969s5() {
        final int i = 0;
        this.b = new cm2(new sr0(this) { // from class: ch3
            public final /* synthetic */ C4969s5 b;

            {
                this.b = this;
            }

            @Override // defpackage.sr0
            public final Object invoke() {
                boolean zI;
                int i2 = i;
                C4969s5 c4969s5 = this.b;
                switch (i2) {
                    case 0:
                        zI = C4969s5.i(c4969s5);
                        break;
                    case 1:
                        zI = C4969s5.d(c4969s5);
                        break;
                    case 2:
                        zI = C4969s5.c(c4969s5);
                        break;
                    case 3:
                        zI = C4969s5.b(c4969s5);
                        break;
                    case 4:
                        zI = C4969s5.a(c4969s5);
                        break;
                    case 5:
                        zI = C4969s5.l(c4969s5);
                        break;
                    case 6:
                        zI = C4969s5.g(c4969s5);
                        break;
                    case 7:
                        zI = C4969s5.f(c4969s5);
                        break;
                    case 8:
                        zI = C4969s5.e(c4969s5);
                        break;
                    case 9:
                        zI = C4969s5.k(c4969s5);
                        break;
                    case 10:
                        zI = C4969s5.h(c4969s5);
                        break;
                    default:
                        zI = C4969s5.j(c4969s5);
                        break;
                }
                return Boolean.valueOf(zI);
            }
        });
        final int i2 = 5;
        this.c = new cm2(new sr0(this) { // from class: ch3
            public final /* synthetic */ C4969s5 b;

            {
                this.b = this;
            }

            @Override // defpackage.sr0
            public final Object invoke() {
                boolean zI;
                int i3 = i2;
                C4969s5 c4969s5 = this.b;
                switch (i3) {
                    case 0:
                        zI = C4969s5.i(c4969s5);
                        break;
                    case 1:
                        zI = C4969s5.d(c4969s5);
                        break;
                    case 2:
                        zI = C4969s5.c(c4969s5);
                        break;
                    case 3:
                        zI = C4969s5.b(c4969s5);
                        break;
                    case 4:
                        zI = C4969s5.a(c4969s5);
                        break;
                    case 5:
                        zI = C4969s5.l(c4969s5);
                        break;
                    case 6:
                        zI = C4969s5.g(c4969s5);
                        break;
                    case 7:
                        zI = C4969s5.f(c4969s5);
                        break;
                    case 8:
                        zI = C4969s5.e(c4969s5);
                        break;
                    case 9:
                        zI = C4969s5.k(c4969s5);
                        break;
                    case 10:
                        zI = C4969s5.h(c4969s5);
                        break;
                    default:
                        zI = C4969s5.j(c4969s5);
                        break;
                }
                return Boolean.valueOf(zI);
            }
        });
        final int i3 = 6;
        this.d = new cm2(new sr0(this) { // from class: ch3
            public final /* synthetic */ C4969s5 b;

            {
                this.b = this;
            }

            @Override // defpackage.sr0
            public final Object invoke() {
                boolean zI;
                int i4 = i3;
                C4969s5 c4969s5 = this.b;
                switch (i4) {
                    case 0:
                        zI = C4969s5.i(c4969s5);
                        break;
                    case 1:
                        zI = C4969s5.d(c4969s5);
                        break;
                    case 2:
                        zI = C4969s5.c(c4969s5);
                        break;
                    case 3:
                        zI = C4969s5.b(c4969s5);
                        break;
                    case 4:
                        zI = C4969s5.a(c4969s5);
                        break;
                    case 5:
                        zI = C4969s5.l(c4969s5);
                        break;
                    case 6:
                        zI = C4969s5.g(c4969s5);
                        break;
                    case 7:
                        zI = C4969s5.f(c4969s5);
                        break;
                    case 8:
                        zI = C4969s5.e(c4969s5);
                        break;
                    case 9:
                        zI = C4969s5.k(c4969s5);
                        break;
                    case 10:
                        zI = C4969s5.h(c4969s5);
                        break;
                    default:
                        zI = C4969s5.j(c4969s5);
                        break;
                }
                return Boolean.valueOf(zI);
            }
        });
        final int i4 = 7;
        this.e = new cm2(new sr0(this) { // from class: ch3
            public final /* synthetic */ C4969s5 b;

            {
                this.b = this;
            }

            @Override // defpackage.sr0
            public final Object invoke() {
                boolean zI;
                int i5 = i4;
                C4969s5 c4969s5 = this.b;
                switch (i5) {
                    case 0:
                        zI = C4969s5.i(c4969s5);
                        break;
                    case 1:
                        zI = C4969s5.d(c4969s5);
                        break;
                    case 2:
                        zI = C4969s5.c(c4969s5);
                        break;
                    case 3:
                        zI = C4969s5.b(c4969s5);
                        break;
                    case 4:
                        zI = C4969s5.a(c4969s5);
                        break;
                    case 5:
                        zI = C4969s5.l(c4969s5);
                        break;
                    case 6:
                        zI = C4969s5.g(c4969s5);
                        break;
                    case 7:
                        zI = C4969s5.f(c4969s5);
                        break;
                    case 8:
                        zI = C4969s5.e(c4969s5);
                        break;
                    case 9:
                        zI = C4969s5.k(c4969s5);
                        break;
                    case 10:
                        zI = C4969s5.h(c4969s5);
                        break;
                    default:
                        zI = C4969s5.j(c4969s5);
                        break;
                }
                return Boolean.valueOf(zI);
            }
        });
        final int i5 = 8;
        this.f = new cm2(new sr0(this) { // from class: ch3
            public final /* synthetic */ C4969s5 b;

            {
                this.b = this;
            }

            @Override // defpackage.sr0
            public final Object invoke() {
                boolean zI;
                int i6 = i5;
                C4969s5 c4969s5 = this.b;
                switch (i6) {
                    case 0:
                        zI = C4969s5.i(c4969s5);
                        break;
                    case 1:
                        zI = C4969s5.d(c4969s5);
                        break;
                    case 2:
                        zI = C4969s5.c(c4969s5);
                        break;
                    case 3:
                        zI = C4969s5.b(c4969s5);
                        break;
                    case 4:
                        zI = C4969s5.a(c4969s5);
                        break;
                    case 5:
                        zI = C4969s5.l(c4969s5);
                        break;
                    case 6:
                        zI = C4969s5.g(c4969s5);
                        break;
                    case 7:
                        zI = C4969s5.f(c4969s5);
                        break;
                    case 8:
                        zI = C4969s5.e(c4969s5);
                        break;
                    case 9:
                        zI = C4969s5.k(c4969s5);
                        break;
                    case 10:
                        zI = C4969s5.h(c4969s5);
                        break;
                    default:
                        zI = C4969s5.j(c4969s5);
                        break;
                }
                return Boolean.valueOf(zI);
            }
        });
        final int i6 = 9;
        this.g = new cm2(new sr0(this) { // from class: ch3
            public final /* synthetic */ C4969s5 b;

            {
                this.b = this;
            }

            @Override // defpackage.sr0
            public final Object invoke() {
                boolean zI;
                int i7 = i6;
                C4969s5 c4969s5 = this.b;
                switch (i7) {
                    case 0:
                        zI = C4969s5.i(c4969s5);
                        break;
                    case 1:
                        zI = C4969s5.d(c4969s5);
                        break;
                    case 2:
                        zI = C4969s5.c(c4969s5);
                        break;
                    case 3:
                        zI = C4969s5.b(c4969s5);
                        break;
                    case 4:
                        zI = C4969s5.a(c4969s5);
                        break;
                    case 5:
                        zI = C4969s5.l(c4969s5);
                        break;
                    case 6:
                        zI = C4969s5.g(c4969s5);
                        break;
                    case 7:
                        zI = C4969s5.f(c4969s5);
                        break;
                    case 8:
                        zI = C4969s5.e(c4969s5);
                        break;
                    case 9:
                        zI = C4969s5.k(c4969s5);
                        break;
                    case 10:
                        zI = C4969s5.h(c4969s5);
                        break;
                    default:
                        zI = C4969s5.j(c4969s5);
                        break;
                }
                return Boolean.valueOf(zI);
            }
        });
        final int i7 = 10;
        this.h = new cm2(new sr0(this) { // from class: ch3
            public final /* synthetic */ C4969s5 b;

            {
                this.b = this;
            }

            @Override // defpackage.sr0
            public final Object invoke() {
                boolean zI;
                int i8 = i7;
                C4969s5 c4969s5 = this.b;
                switch (i8) {
                    case 0:
                        zI = C4969s5.i(c4969s5);
                        break;
                    case 1:
                        zI = C4969s5.d(c4969s5);
                        break;
                    case 2:
                        zI = C4969s5.c(c4969s5);
                        break;
                    case 3:
                        zI = C4969s5.b(c4969s5);
                        break;
                    case 4:
                        zI = C4969s5.a(c4969s5);
                        break;
                    case 5:
                        zI = C4969s5.l(c4969s5);
                        break;
                    case 6:
                        zI = C4969s5.g(c4969s5);
                        break;
                    case 7:
                        zI = C4969s5.f(c4969s5);
                        break;
                    case 8:
                        zI = C4969s5.e(c4969s5);
                        break;
                    case 9:
                        zI = C4969s5.k(c4969s5);
                        break;
                    case 10:
                        zI = C4969s5.h(c4969s5);
                        break;
                    default:
                        zI = C4969s5.j(c4969s5);
                        break;
                }
                return Boolean.valueOf(zI);
            }
        });
        final int i8 = 11;
        this.i = new cm2(new sr0(this) { // from class: ch3
            public final /* synthetic */ C4969s5 b;

            {
                this.b = this;
            }

            @Override // defpackage.sr0
            public final Object invoke() {
                boolean zI;
                int i9 = i8;
                C4969s5 c4969s5 = this.b;
                switch (i9) {
                    case 0:
                        zI = C4969s5.i(c4969s5);
                        break;
                    case 1:
                        zI = C4969s5.d(c4969s5);
                        break;
                    case 2:
                        zI = C4969s5.c(c4969s5);
                        break;
                    case 3:
                        zI = C4969s5.b(c4969s5);
                        break;
                    case 4:
                        zI = C4969s5.a(c4969s5);
                        break;
                    case 5:
                        zI = C4969s5.l(c4969s5);
                        break;
                    case 6:
                        zI = C4969s5.g(c4969s5);
                        break;
                    case 7:
                        zI = C4969s5.f(c4969s5);
                        break;
                    case 8:
                        zI = C4969s5.e(c4969s5);
                        break;
                    case 9:
                        zI = C4969s5.k(c4969s5);
                        break;
                    case 10:
                        zI = C4969s5.h(c4969s5);
                        break;
                    default:
                        zI = C4969s5.j(c4969s5);
                        break;
                }
                return Boolean.valueOf(zI);
            }
        });
        final int i9 = 1;
        this.j = new cm2(new sr0(this) { // from class: ch3
            public final /* synthetic */ C4969s5 b;

            {
                this.b = this;
            }

            @Override // defpackage.sr0
            public final Object invoke() {
                boolean zI;
                int i10 = i9;
                C4969s5 c4969s5 = this.b;
                switch (i10) {
                    case 0:
                        zI = C4969s5.i(c4969s5);
                        break;
                    case 1:
                        zI = C4969s5.d(c4969s5);
                        break;
                    case 2:
                        zI = C4969s5.c(c4969s5);
                        break;
                    case 3:
                        zI = C4969s5.b(c4969s5);
                        break;
                    case 4:
                        zI = C4969s5.a(c4969s5);
                        break;
                    case 5:
                        zI = C4969s5.l(c4969s5);
                        break;
                    case 6:
                        zI = C4969s5.g(c4969s5);
                        break;
                    case 7:
                        zI = C4969s5.f(c4969s5);
                        break;
                    case 8:
                        zI = C4969s5.e(c4969s5);
                        break;
                    case 9:
                        zI = C4969s5.k(c4969s5);
                        break;
                    case 10:
                        zI = C4969s5.h(c4969s5);
                        break;
                    default:
                        zI = C4969s5.j(c4969s5);
                        break;
                }
                return Boolean.valueOf(zI);
            }
        });
        final int i10 = 2;
        this.k = new cm2(new sr0(this) { // from class: ch3
            public final /* synthetic */ C4969s5 b;

            {
                this.b = this;
            }

            @Override // defpackage.sr0
            public final Object invoke() {
                boolean zI;
                int i11 = i10;
                C4969s5 c4969s5 = this.b;
                switch (i11) {
                    case 0:
                        zI = C4969s5.i(c4969s5);
                        break;
                    case 1:
                        zI = C4969s5.d(c4969s5);
                        break;
                    case 2:
                        zI = C4969s5.c(c4969s5);
                        break;
                    case 3:
                        zI = C4969s5.b(c4969s5);
                        break;
                    case 4:
                        zI = C4969s5.a(c4969s5);
                        break;
                    case 5:
                        zI = C4969s5.l(c4969s5);
                        break;
                    case 6:
                        zI = C4969s5.g(c4969s5);
                        break;
                    case 7:
                        zI = C4969s5.f(c4969s5);
                        break;
                    case 8:
                        zI = C4969s5.e(c4969s5);
                        break;
                    case 9:
                        zI = C4969s5.k(c4969s5);
                        break;
                    case 10:
                        zI = C4969s5.h(c4969s5);
                        break;
                    default:
                        zI = C4969s5.j(c4969s5);
                        break;
                }
                return Boolean.valueOf(zI);
            }
        });
        final int i11 = 3;
        this.l = new cm2(new sr0(this) { // from class: ch3
            public final /* synthetic */ C4969s5 b;

            {
                this.b = this;
            }

            @Override // defpackage.sr0
            public final Object invoke() {
                boolean zI;
                int i12 = i11;
                C4969s5 c4969s5 = this.b;
                switch (i12) {
                    case 0:
                        zI = C4969s5.i(c4969s5);
                        break;
                    case 1:
                        zI = C4969s5.d(c4969s5);
                        break;
                    case 2:
                        zI = C4969s5.c(c4969s5);
                        break;
                    case 3:
                        zI = C4969s5.b(c4969s5);
                        break;
                    case 4:
                        zI = C4969s5.a(c4969s5);
                        break;
                    case 5:
                        zI = C4969s5.l(c4969s5);
                        break;
                    case 6:
                        zI = C4969s5.g(c4969s5);
                        break;
                    case 7:
                        zI = C4969s5.f(c4969s5);
                        break;
                    case 8:
                        zI = C4969s5.e(c4969s5);
                        break;
                    case 9:
                        zI = C4969s5.k(c4969s5);
                        break;
                    case 10:
                        zI = C4969s5.h(c4969s5);
                        break;
                    default:
                        zI = C4969s5.j(c4969s5);
                        break;
                }
                return Boolean.valueOf(zI);
            }
        });
        final int i12 = 4;
        this.m = new cm2(new sr0(this) { // from class: ch3
            public final /* synthetic */ C4969s5 b;

            {
                this.b = this;
            }

            @Override // defpackage.sr0
            public final Object invoke() {
                boolean zI;
                int i13 = i12;
                C4969s5 c4969s5 = this.b;
                switch (i13) {
                    case 0:
                        zI = C4969s5.i(c4969s5);
                        break;
                    case 1:
                        zI = C4969s5.d(c4969s5);
                        break;
                    case 2:
                        zI = C4969s5.c(c4969s5);
                        break;
                    case 3:
                        zI = C4969s5.b(c4969s5);
                        break;
                    case 4:
                        zI = C4969s5.a(c4969s5);
                        break;
                    case 5:
                        zI = C4969s5.l(c4969s5);
                        break;
                    case 6:
                        zI = C4969s5.g(c4969s5);
                        break;
                    case 7:
                        zI = C4969s5.f(c4969s5);
                        break;
                    case 8:
                        zI = C4969s5.e(c4969s5);
                        break;
                    case 9:
                        zI = C4969s5.k(c4969s5);
                        break;
                    case 10:
                        zI = C4969s5.h(c4969s5);
                        break;
                    default:
                        zI = C4969s5.j(c4969s5);
                        break;
                }
                return Boolean.valueOf(zI);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(C4969s5 c4969s5) {
        return c4969s5.Z().optBoolean(C5023v5.J, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(C4969s5 c4969s5) {
        return c4969s5.Z().optBoolean(C5023v5.v, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(C4969s5 c4969s5) {
        return c4969s5.Z().optBoolean(C5023v5.q, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(C4969s5 c4969s5) {
        return c4969s5.Z().optBoolean(C5023v5.w, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(C4969s5 c4969s5) {
        return c4969s5.Z().optBoolean(C5023v5.x, false);
    }

    @Override // com.ironsource.InterfaceC5005u5
    public int A() {
        String strOptString = Z().optString(C5023v5.h);
        strOptString.getClass();
        Integer numM = kk2.M(strOptString);
        if (numM != null) {
            return numM.intValue();
        }
        return 2;
    }

    @Override // com.ironsource.InterfaceC5005u5
    public boolean B() {
        return Z().optBoolean(C5023v5.H, true);
    }

    @Override // com.ironsource.InterfaceC5005u5
    public int C() {
        String strOptString = Z().optString(C5023v5.s);
        strOptString.getClass();
        Integer numM = kk2.M(strOptString);
        if (numM != null) {
            return numM.intValue();
        }
        return 2;
    }

    @Override // com.ironsource.InterfaceC5005u5
    public boolean D() {
        return O();
    }

    @Override // com.ironsource.InterfaceC5005u5
    public int E() {
        String strOptString = Z().optString(C5023v5.a);
        strOptString.getClass();
        Integer numM = kk2.M(strOptString);
        if (numM != null) {
            return numM.intValue();
        }
        return 0;
    }

    @Override // com.ironsource.InterfaceC5005u5
    public boolean F() {
        return Z().optBoolean(C5023v5.C, false);
    }

    @Override // com.ironsource.InterfaceC5005u5
    public boolean G() {
        return Z().optBoolean(C5023v5.n, false);
    }

    @Override // com.ironsource.InterfaceC5005u5
    public boolean H() {
        return Z().optBoolean(C5023v5.L, false);
    }

    @Override // com.ironsource.InterfaceC5005u5
    public boolean I() {
        return U();
    }

    @Override // com.ironsource.InterfaceC5005u5
    public boolean J() {
        return X();
    }

    @Override // com.ironsource.InterfaceC5005u5
    public long K() {
        String strOptString = Z().optString(C5023v5.c);
        strOptString.getClass();
        Long lN = kk2.N(strOptString);
        if (lN != null) {
            return lN.longValue();
        }
        return 50L;
    }

    @Override // com.ironsource.InterfaceC5005u5
    public boolean L() {
        return Q();
    }

    @Override // com.ironsource.InterfaceC5005u5
    public int M() {
        String strOptString = Z().optString(C5023v5.t);
        strOptString.getClass();
        Integer numM = kk2.M(strOptString);
        if (numM != null) {
            return numM.intValue();
        }
        return 2;
    }

    @Override // com.ironsource.InterfaceC5005u5
    public int c() {
        String strOptString = Z().optString(C5023v5.b);
        strOptString.getClass();
        Integer numM = kk2.M(strOptString);
        if (numM != null) {
            return numM.intValue();
        }
        return 3;
    }

    @Override // com.ironsource.InterfaceC5005u5
    public boolean d() {
        return Z().optBoolean(C5023v5.i, true);
    }

    @Override // com.ironsource.InterfaceC5005u5
    public long f() {
        String strOptString = Z().optString(C5023v5.d);
        strOptString.getClass();
        Long lN = kk2.N(strOptString);
        if (lN != null) {
            return lN.longValue();
        }
        return 0L;
    }

    @Override // com.ironsource.InterfaceC5005u5
    public int g() {
        String strOptString = Z().optString(C5023v5.N);
        strOptString.getClass();
        Integer numM = kk2.M(strOptString);
        if (numM != null) {
            return numM.intValue();
        }
        return 48;
    }

    @Override // com.ironsource.InterfaceC5005u5
    public int j() {
        String strOptString = Z().optString(C5023v5.g);
        strOptString.getClass();
        Integer numM = kk2.M(strOptString);
        if (numM != null) {
            return numM.intValue();
        }
        return 2;
    }

    @Override // com.ironsource.InterfaceC5005u5
    public boolean k() {
        return Z().optBoolean(C5023v5.k, true);
    }

    @Override // com.ironsource.InterfaceC5005u5
    public boolean m() {
        return Z().optBoolean(C5023v5.D, true);
    }

    @Override // com.ironsource.InterfaceC5005u5
    public boolean n() {
        return Z().optBoolean(C5023v5.f, false);
    }

    @Override // com.ironsource.InterfaceC5005u5
    public long p() {
        String strOptString = Z().optString(C5023v5.e);
        strOptString.getClass();
        Long lN = kk2.N(strOptString);
        if (lN != null) {
            return lN.longValue();
        }
        return 2000L;
    }

    @Override // com.ironsource.InterfaceC5005u5
    public int q() {
        String strOptString = Z().optString(C5023v5.M);
        strOptString.getClass();
        Integer numM = kk2.M(strOptString);
        if (numM != null) {
            return numM.intValue();
        }
        return 5;
    }

    @Override // com.ironsource.InterfaceC5005u5
    public boolean v() {
        return Z().optBoolean(C5023v5.m, true);
    }

    @Override // com.ironsource.InterfaceC5005u5
    public boolean w() {
        return Z().optBoolean(C5023v5.G, false);
    }

    @Override // com.ironsource.InterfaceC5005u5
    public boolean x() {
        return Z().optBoolean(C5023v5.A, false);
    }

    @Override // com.ironsource.InterfaceC5005u5
    public boolean y() {
        return Z().optBoolean(C5023v5.l, false);
    }

    @Override // com.ironsource.InterfaceC5005u5
    public boolean z() {
        return Z().optBoolean(C5023v5.j, false);
    }

    @Override // com.ironsource.InterfaceC5005u5
    public boolean o() {
        return P();
    }

    @Override // com.ironsource.InterfaceC5005u5
    public boolean r() {
        return V();
    }

    @Override // com.ironsource.InterfaceC5005u5
    public boolean s() {
        return S();
    }

    @Override // com.ironsource.InterfaceC5005u5
    public boolean t() {
        return Y();
    }

    @Override // com.ironsource.InterfaceC5005u5
    public boolean u() {
        return W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(C4969s5 c4969s5) {
        return c4969s5.Z().optBoolean(C5023v5.o, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(C4969s5 c4969s5) {
        return c4969s5.Z().optBoolean(C5023v5.r, false);
    }

    @Override // com.ironsource.InterfaceC5005u5
    public boolean b() {
        return R();
    }

    @Override // com.ironsource.InterfaceC5005u5
    public boolean e() {
        return N();
    }

    @Override // com.ironsource.InterfaceC5005u5
    public boolean h() {
        return Z().optBoolean(C5023v5.I, false);
    }

    @Override // com.ironsource.InterfaceC5005u5
    public boolean i() {
        return Z().optBoolean(C5023v5.F, false);
    }

    @Override // com.ironsource.InterfaceC5005u5
    public boolean l() {
        return T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(C4969s5 c4969s5) {
        return c4969s5.Z().optBoolean(C5023v5.u, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(C4969s5 c4969s5) {
        return c4969s5.Z().optBoolean(C5023v5.p, false);
    }

    @Override // com.ironsource.InterfaceC5005u5
    @NotNull
    public String a() {
        String strOptString = Z().optString("controllerUrl", "");
        strOptString.getClass();
        return strOptString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(C4969s5 c4969s5) {
        return c4969s5.Z().optBoolean(C5023v5.K, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(C4969s5 c4969s5) {
        return c4969s5.Z().optBoolean(C5023v5.z, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(C4969s5 c4969s5) {
        return c4969s5.Z().optBoolean(C5023v5.y, false);
    }
}
