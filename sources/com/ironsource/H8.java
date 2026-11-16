package com.ironsource;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.webkit.WebView;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import defpackage.j52;
import defpackage.k52;
import defpackage.pv1;
import defpackage.q63;
import defpackage.s71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class H8 {

    @Nullable
    private final String a;

    @Nullable
    private final String b;

    @Nullable
    private final String c;

    @Nullable
    private final String d;

    @Nullable
    private final Drawable e;

    @Nullable
    private final WebView f;

    @NotNull
    private final View g;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {

        @NotNull
        private final InterfaceC4595a9 a;

        @NotNull
        private final InterfaceC4661b1 b;

        private final k52 b(String str) {
            if (str == null) {
                return null;
            }
            return new k52(this.a.a(str));
        }

        public a(@NotNull InterfaceC4595a9 interfaceC4595a9, @NotNull InterfaceC4661b1 interfaceC4661b1) {
            interfaceC4595a9.getClass();
            interfaceC4661b1.getClass();
            this.a = interfaceC4595a9;
            this.b = interfaceC4661b1;
        }

        @NotNull
        public final b a(@NotNull Context context, @NotNull JSONObject jSONObject) {
            String strB;
            String strB2;
            String strB3;
            String strB4;
            String strB5;
            String strB6;
            context.getClass();
            jSONObject.getClass();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("title");
            String strB7 = null;
            if (jSONObjectOptJSONObject != null) {
                strB = I8.b(jSONObjectOptJSONObject, "text");
            } else {
                strB = null;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(C4664b4.i.F0);
            if (jSONObjectOptJSONObject2 != null) {
                strB2 = I8.b(jSONObjectOptJSONObject2, "text");
            } else {
                strB2 = null;
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("body");
            if (jSONObjectOptJSONObject3 != null) {
                strB3 = I8.b(jSONObjectOptJSONObject3, "text");
            } else {
                strB3 = null;
            }
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject(C4664b4.i.G0);
            if (jSONObjectOptJSONObject4 != null) {
                strB4 = I8.b(jSONObjectOptJSONObject4, "text");
            } else {
                strB4 = null;
            }
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("icon");
            if (jSONObjectOptJSONObject5 != null) {
                strB5 = I8.b(jSONObjectOptJSONObject5, "url");
            } else {
                strB5 = null;
            }
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject(C4664b4.i.I0);
            if (jSONObjectOptJSONObject6 != null) {
                strB6 = I8.b(jSONObjectOptJSONObject6, "adViewId");
            } else {
                strB6 = null;
            }
            JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject(C4664b4.i.J0);
            if (jSONObjectOptJSONObject7 != null) {
                strB7 = I8.b(jSONObjectOptJSONObject7, "url");
            }
            return new b(new b.a(strB, strB2, strB3, strB4, b(strB5), a(strB6), Gd.a.a(context, strB7, this.a)));
        }

        private final k52 a(String str) {
            if (str == null) {
                return null;
            }
            L8 l8A = this.b.a(str);
            WebView presentingView = l8A != null ? l8A.getPresentingView() : null;
            if (presentingView == null) {
                return new k52(new j52(new Exception(pv1.n("missing adview for id: '", str, "'"))));
            }
            return new k52(presentingView);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H8)) {
            return false;
        }
        H8 h8 = (H8) obj;
        return s71.b(this.a, h8.a) && s71.b(this.b, h8.b) && s71.b(this.c, h8.c) && s71.b(this.d, h8.d) && s71.b(this.e, h8.e) && s71.b(this.f, h8.f) && s71.b(this.g, h8.g);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b {

        @NotNull
        private final a a;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class a {

            @Nullable
            private final String a;

            @Nullable
            private final String b;

            @Nullable
            private final String c;

            @Nullable
            private final String d;

            @Nullable
            private final k52 e;

            @Nullable
            private final k52 f;

            @NotNull
            private final View g;

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return s71.b(this.a, aVar.a) && s71.b(this.b, aVar.b) && s71.b(this.c, aVar.c) && s71.b(this.d, aVar.d) && s71.b(this.e, aVar.e) && s71.b(this.f, aVar.f) && s71.b(this.g, aVar.g);
            }

            public static /* synthetic */ a a(a aVar, String str, String str2, String str3, String str4, k52 k52Var, k52 k52Var2, View view, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.a;
                }
                if ((i & 2) != 0) {
                    str2 = aVar.b;
                }
                if ((i & 4) != 0) {
                    str3 = aVar.c;
                }
                if ((i & 8) != 0) {
                    str4 = aVar.d;
                }
                if ((i & 16) != 0) {
                    k52Var = aVar.e;
                }
                if ((i & 32) != 0) {
                    k52Var2 = aVar.f;
                }
                if ((i & 64) != 0) {
                    view = aVar.g;
                }
                k52 k52Var3 = k52Var2;
                View view2 = view;
                k52 k52Var4 = k52Var;
                String str5 = str3;
                return aVar.a(str, str2, str5, str4, k52Var4, k52Var3, view2);
            }

            @Nullable
            public final String b() {
                return this.b;
            }

            @Nullable
            public final String c() {
                return this.c;
            }

            @Nullable
            public final String d() {
                return this.d;
            }

            @Nullable
            public final k52 e() {
                return this.e;
            }

            @Nullable
            public final k52 f() {
                return this.f;
            }

            @NotNull
            public final View g() {
                return this.g;
            }

            @NotNull
            public final H8 h() {
                Drawable drawable;
                String str = this.a;
                String str2 = this.b;
                String str3 = this.c;
                String str4 = this.d;
                k52 k52Var = this.e;
                WebView webView = null;
                if (k52Var != null) {
                    Object obj = k52Var.a;
                    if (obj instanceof j52) {
                        obj = null;
                    }
                    drawable = (Drawable) obj;
                } else {
                    drawable = null;
                }
                k52 k52Var2 = this.f;
                if (k52Var2 != null) {
                    Object obj2 = k52Var2.a;
                    webView = (WebView) (obj2 instanceof j52 ? null : obj2);
                }
                return new H8(str, str2, str3, str4, drawable, webView, this.g);
            }

            public int hashCode() {
                Object obj;
                Object obj2;
                String str = this.a;
                int iHashCode = 0;
                int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.c;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.d;
                int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                k52 k52Var = this.e;
                int iHashCode6 = (iHashCode5 + ((k52Var == null || (obj = k52Var.a) == null) ? 0 : obj.hashCode())) * 31;
                k52 k52Var2 = this.f;
                if (k52Var2 != null && (obj2 = k52Var2.a) != null) {
                    iHashCode = obj2.hashCode();
                }
                return this.g.hashCode() + ((iHashCode6 + iHashCode) * 31);
            }

            @Nullable
            public final String i() {
                return this.b;
            }

            @Nullable
            public final String j() {
                return this.c;
            }

            @Nullable
            public final String k() {
                return this.d;
            }

            @Nullable
            public final k52 l() {
                return this.e;
            }

            @Nullable
            public final k52 m() {
                return this.f;
            }

            @NotNull
            public final View n() {
                return this.g;
            }

            @Nullable
            public final String o() {
                return this.a;
            }

            @NotNull
            public String toString() {
                String str = this.a;
                String str2 = this.b;
                String str3 = this.c;
                String str4 = this.d;
                k52 k52Var = this.e;
                k52 k52Var2 = this.f;
                View view = this.g;
                StringBuilder sbR = pv1.r("Data(title=", str, ", advertiser=", str2, ", body=");
                q63.y(sbR, str3, ", cta=", str4, ", icon=");
                sbR.append(k52Var);
                sbR.append(", media=");
                sbR.append(k52Var2);
                sbR.append(", privacyIcon=");
                sbR.append(view);
                sbR.append(")");
                return sbR.toString();
            }

            public a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable k52 k52Var, @Nullable k52 k52Var2, @NotNull View view) {
                view.getClass();
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = str4;
                this.e = k52Var;
                this.f = k52Var2;
                this.g = view;
            }

            @NotNull
            public final a a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable k52 k52Var, @Nullable k52 k52Var2, @NotNull View view) {
                view.getClass();
                return new a(str, str2, str3, str4, k52Var, k52Var2, view);
            }

            @Nullable
            public final String a() {
                return this.a;
            }
        }

        public b(@NotNull a aVar) {
            aVar.getClass();
            this.a = aVar;
        }

        private static final <T> void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            jSONObjectJsonObjectInit.put("success", !(obj instanceof j52));
            Throwable thB = k52.b(obj);
            if (thB != null) {
                String message = thB.getMessage();
                if (message == null) {
                    message = "unknown reason";
                }
                jSONObjectJsonObjectInit.put("reason", message);
            }
            jSONObject.put(str, jSONObjectJsonObjectInit);
        }

        @NotNull
        public final JSONObject b() throws JSONException {
            JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            if (this.a.o() != null) {
                a(jSONObjectJsonObjectInit, "title");
            }
            if (this.a.i() != null) {
                a(jSONObjectJsonObjectInit, C4664b4.i.F0);
            }
            if (this.a.j() != null) {
                a(jSONObjectJsonObjectInit, "body");
            }
            if (this.a.k() != null) {
                a(jSONObjectJsonObjectInit, C4664b4.i.G0);
            }
            k52 k52VarL = this.a.l();
            if (k52VarL != null) {
                a(jSONObjectJsonObjectInit, "icon", k52VarL.a);
            }
            k52 k52VarM = this.a.m();
            if (k52VarM != null) {
                a(jSONObjectJsonObjectInit, C4664b4.i.I0, k52VarM.a);
            }
            return jSONObjectJsonObjectInit;
        }

        private static final void a(JSONObject jSONObject, String str) throws JSONException {
            jSONObject.put(str, IronSourceNetworkBridge.jsonObjectInit().put("success", true));
        }

        @NotNull
        public final a a() {
            return this.a;
        }
    }

    public static /* synthetic */ H8 a(H8 h8, String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View view, int i, Object obj) {
        if ((i & 1) != 0) {
            str = h8.a;
        }
        if ((i & 2) != 0) {
            str2 = h8.b;
        }
        if ((i & 4) != 0) {
            str3 = h8.c;
        }
        if ((i & 8) != 0) {
            str4 = h8.d;
        }
        if ((i & 16) != 0) {
            drawable = h8.e;
        }
        if ((i & 32) != 0) {
            webView = h8.f;
        }
        if ((i & 64) != 0) {
            view = h8.g;
        }
        WebView webView2 = webView;
        View view2 = view;
        Drawable drawable2 = drawable;
        String str5 = str3;
        return h8.a(str, str2, str5, str4, drawable2, webView2, view2);
    }

    @Nullable
    public final String b() {
        return this.b;
    }

    @Nullable
    public final String c() {
        return this.c;
    }

    @Nullable
    public final String d() {
        return this.d;
    }

    @Nullable
    public final Drawable e() {
        return this.e;
    }

    @Nullable
    public final WebView f() {
        return this.f;
    }

    @NotNull
    public final View g() {
        return this.g;
    }

    @Nullable
    public final String h() {
        return this.b;
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Drawable drawable = this.e;
        int iHashCode5 = (iHashCode4 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        WebView webView = this.f;
        return this.g.hashCode() + ((iHashCode5 + (webView != null ? webView.hashCode() : 0)) * 31);
    }

    @Nullable
    public final String i() {
        return this.c;
    }

    @Nullable
    public final String j() {
        return this.d;
    }

    @Nullable
    public final Drawable k() {
        return this.e;
    }

    @Nullable
    public final WebView l() {
        return this.f;
    }

    @NotNull
    public final View m() {
        return this.g;
    }

    @Nullable
    public final String n() {
        return this.a;
    }

    @NotNull
    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        Drawable drawable = this.e;
        WebView webView = this.f;
        View view = this.g;
        StringBuilder sbR = pv1.r("ISNNativeAdData(title=", str, ", advertiser=", str2, ", body=");
        q63.y(sbR, str3, ", cta=", str4, ", icon=");
        sbR.append(drawable);
        sbR.append(", mediaView=");
        sbR.append(webView);
        sbR.append(", privacyIcon=");
        sbR.append(view);
        sbR.append(")");
        return sbR.toString();
    }

    public H8(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Drawable drawable, @Nullable WebView webView, @NotNull View view) {
        view.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = drawable;
        this.f = webView;
        this.g = view;
    }

    @NotNull
    public final H8 a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Drawable drawable, @Nullable WebView webView, @NotNull View view) {
        view.getClass();
        return new H8(str, str2, str3, str4, drawable, webView, view);
    }

    @Nullable
    public final String a() {
        return this.a;
    }
}
