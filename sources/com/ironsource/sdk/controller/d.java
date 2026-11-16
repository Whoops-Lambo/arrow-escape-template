package com.ironsource.sdk.controller;

import com.ironsource.A8;
import com.ironsource.C4664b4;
import com.ironsource.C4808j5;
import com.ironsource.C4853le;
import com.ironsource.C4950r4;
import com.ironsource.C5026v8;
import com.ironsource.D8;
import com.ironsource.G5;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
class d {
    static final String h = "controllerSourceData";
    private static final String i = "next_";
    private static final String j = "fallback_";
    private static final String k = "controllerSourceCode";
    private long a;
    private int b;
    private c c;
    private EnumC1380d d = EnumC1380d.NONE;
    private String e;
    private String f;
    private C4808j5 g;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends JSONObject {
        public a() throws JSONException {
            putOpt(C4664b4.a.j, Integer.valueOf(d.this.b));
            putOpt(d.k, Integer.valueOf(d.this.d.b()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum c {
        FETCH_FROM_SERVER_NO_FALLBACK,
        FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK,
        FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum EnumC1380d {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);

        private int a;

        public int b() {
            return this.a;
        }

        EnumC1380d(int i) {
            this.a = i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.FETCH_FROM_SERVER_NO_FALLBACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void a(EnumC1380d enumC1380d) {
        C5026v8 c5026v8A = new C5026v8().a(G5.y, Integer.valueOf(this.b)).a(G5.z, Integer.valueOf(enumC1380d.b()));
        if (this.a > 0) {
            c5026v8A.a(G5.B, Long.valueOf(System.currentTimeMillis() - this.a));
        }
        A8.a(C4853le.w, c5026v8A.a());
    }

    private D8 h() {
        return new D8(this.e, "fallback_mobileController.html");
    }

    private D8 i() {
        return new D8(this.e, "next_mobileController.html");
    }

    private void l() {
        C5026v8 c5026v8A = new C5026v8().a(G5.y, Integer.valueOf(this.b));
        if (this.a > 0) {
            c5026v8A.a(G5.B, Long.valueOf(System.currentTimeMillis() - this.a));
        }
        A8.a(C4853le.x, c5026v8A.a());
    }

    public D8 g() {
        return new D8(this.e, C4664b4.f);
    }

    public boolean k() {
        int i2 = b.a[this.c.ordinal()];
        if (i2 == 1) {
            e();
            a(new D8(this.e, SDKUtils.getFileName(this.f)));
            return false;
        }
        if (i2 == 2) {
            c();
            a(new D8(this.e, SDKUtils.getFileName(this.f)));
            return false;
        }
        if (i2 == 3) {
            try {
                D8 d8G = g();
                D8 d8I = i();
                if (!d8I.exists() && !d8G.exists()) {
                    a(new D8(this.e, SDKUtils.getFileName(this.f)));
                    return false;
                }
                if (!d8I.exists() && d8G.exists()) {
                    EnumC1380d enumC1380d = EnumC1380d.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                    this.d = enumC1380d;
                    a(enumC1380d);
                    a(new D8(this.e, d8I.getName()));
                    return true;
                }
                c();
                if (b()) {
                    EnumC1380d enumC1380d2 = EnumC1380d.PREPARED_CONTROLLER_LOADED;
                    this.d = enumC1380d2;
                    a(enumC1380d2);
                    d();
                    a(new D8(this.e, d8I.getName()));
                    return true;
                }
                if (!a()) {
                    a(new D8(this.e, SDKUtils.getFileName(this.f)));
                    return false;
                }
                EnumC1380d enumC1380d3 = EnumC1380d.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                this.d = enumC1380d3;
                a(enumC1380d3);
                a(new D8(this.e, d8I.getName()));
                return true;
            } catch (Exception e) {
                C4950r4.d().a(e);
            }
        }
        return false;
    }

    public boolean m() {
        return this.d != EnumC1380d.NONE;
    }

    public d(JSONObject jSONObject, String str, String str2, C4808j5 c4808j5) {
        int iOptInt = jSONObject.optInt(C4664b4.a.j, -1);
        this.b = iOptInt;
        this.c = a(iOptInt);
        this.e = str;
        this.f = str2;
        this.g = c4808j5;
    }

    private boolean b() throws Exception {
        return IronSourceStorageUtils.renameFile(i().getPath(), g().getPath());
    }

    private void c() {
        try {
            D8 d8G = g();
            if (!d8G.exists()) {
                return;
            }
            D8 d8H = h();
            if (d8H.exists()) {
                d8H.delete();
            }
            IronSourceStorageUtils.renameFile(d8G.getPath(), d8H.getPath());
        } catch (Exception e) {
            C4950r4.d().a(e);
        }
    }

    private void d() {
        IronSourceStorageUtils.deleteFile(h());
    }

    private void e() {
        IronSourceStorageUtils.deleteFile(g());
    }

    private boolean j() {
        return h().exists();
    }

    public JSONObject f() throws JSONException {
        return SafeIronSourceControllerBridge.com_ironsource_sdk_controller_d$a_jsonObjectInit(this);
    }

    private c a(int i2) {
        if (i2 == 1) {
            return c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK;
        }
        if (i2 != 2) {
            return c.FETCH_FROM_SERVER_NO_FALLBACK;
        }
        return c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL;
    }

    public void a(Runnable runnable) {
        if (m()) {
            return;
        }
        if (this.c == c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK) {
            d();
        }
        EnumC1380d enumC1380d = EnumC1380d.CONTROLLER_FROM_SERVER;
        this.d = enumC1380d;
        a(enumC1380d);
        runnable.run();
    }

    public void a(Runnable runnable, Runnable runnable2) {
        if (m()) {
            return;
        }
        if (this.c == c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK && a()) {
            EnumC1380d enumC1380d = EnumC1380d.FALLBACK_CONTROLLER_RECOVERY;
            this.d = enumC1380d;
            a(enumC1380d);
            runnable.run();
            return;
        }
        l();
        runnable2.run();
    }

    private void a(D8 d8) {
        if (this.g.c()) {
            return;
        }
        this.g.a(d8, this.f);
    }

    public void a(C5026v8 c5026v8) {
        c5026v8.a(G5.y, Integer.valueOf(this.b));
        A8.a(C4853le.v, c5026v8.a());
        this.a = System.currentTimeMillis();
    }

    private boolean a() {
        try {
            if (j()) {
                return IronSourceStorageUtils.renameFile(h().getPath(), g().getPath());
            }
            return false;
        } catch (Exception e) {
            C4950r4.d().a(e);
            return false;
        }
    }
}
