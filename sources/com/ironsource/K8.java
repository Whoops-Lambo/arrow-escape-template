package com.ironsource;

import android.view.View;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import defpackage.e80;
import defpackage.ek2;
import defpackage.jh0;
import defpackage.ol0;
import defpackage.s71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class K8 {

    @NotNull
    private G8 a;

    @Nullable
    private View b;

    @Nullable
    private View c;

    @Nullable
    private View d;

    @Nullable
    private View e;

    @Nullable
    private View f;

    @Nullable
    private View g;

    @NotNull
    private View h;

    @Nullable
    private a i;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface a {
        void a(@NotNull Dg dg);

        void a(@NotNull b bVar);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum b {
        Title("title"),
        Advertiser(C4664b4.i.F0),
        Body("body"),
        Cta(C4664b4.i.G0),
        Icon("icon"),
        Container(TtmlNode.RUBY_CONTAINER),
        PrivacyIcon(C4664b4.i.J0);

        private static final /* synthetic */ jh0 j = ek2.m(a());

        @NotNull
        private final String a;

        @NotNull
        public static jh0 b() {
            return j;
        }

        @NotNull
        public final String c() {
            return this.a;
        }

        b(String str) {
            this.a = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class c implements G8.a {
        public c() {
        }

        @Override // com.ironsource.G8.a
        public void a(Dg dg) {
            dg.getClass();
            a aVarN = K8.this.n();
            if (aVarN != null) {
                aVarN.a(dg);
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K8)) {
            return false;
        }
        K8 k8 = (K8) obj;
        return s71.b(this.a, k8.a) && s71.b(this.b, k8.b) && s71.b(this.c, k8.c) && s71.b(this.d, k8.d) && s71.b(this.e, k8.e) && s71.b(this.f, k8.f) && s71.b(this.g, k8.g) && s71.b(this.h, k8.h);
    }

    public /* synthetic */ K8(G8 g8, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i, e80 e80Var) {
        this(g8, (i & 2) != 0 ? null : view, (i & 4) != 0 ? null : view2, (i & 8) != 0 ? null : view3, (i & 16) != 0 ? null : view4, (i & 32) != 0 ? null : view5, (i & 64) != 0 ? null : view6, view7);
    }

    public static /* synthetic */ K8 a(K8 k8, G8 g8, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i, Object obj) {
        if ((i & 1) != 0) {
            g8 = k8.a;
        }
        if ((i & 2) != 0) {
            view = k8.b;
        }
        if ((i & 4) != 0) {
            view2 = k8.c;
        }
        if ((i & 8) != 0) {
            view3 = k8.d;
        }
        if ((i & 16) != 0) {
            view4 = k8.e;
        }
        if ((i & 32) != 0) {
            view5 = k8.f;
        }
        if ((i & 64) != 0) {
            view6 = k8.g;
        }
        if ((i & 128) != 0) {
            view7 = k8.h;
        }
        View view8 = view6;
        View view9 = view7;
        View view10 = view4;
        View view11 = view5;
        return k8.a(g8, view, view2, view3, view10, view11, view8, view9);
    }

    private final void r() {
        a(this, this.b, b.Title);
        a(this, this.c, b.Advertiser);
        a(this, this.e, b.Body);
        a(this, this.g, b.Cta);
        a(this, this.d, b.Icon);
        a(this, this.a, b.Container);
        a(this, this.h, b.PrivacyIcon);
    }

    private final void s() {
        this.a.setListener$mediationsdk_release(new c());
    }

    @Nullable
    public final View c() {
        return this.c;
    }

    @Nullable
    public final View d() {
        return this.d;
    }

    @Nullable
    public final View e() {
        return this.e;
    }

    @Nullable
    public final View g() {
        return this.g;
    }

    @NotNull
    public final View h() {
        return this.h;
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        View view = this.b;
        int iHashCode2 = (iHashCode + (view == null ? 0 : view.hashCode())) * 31;
        View view2 = this.c;
        int iHashCode3 = (iHashCode2 + (view2 == null ? 0 : view2.hashCode())) * 31;
        View view3 = this.d;
        int iHashCode4 = (iHashCode3 + (view3 == null ? 0 : view3.hashCode())) * 31;
        View view4 = this.e;
        int iHashCode5 = (iHashCode4 + (view4 == null ? 0 : view4.hashCode())) * 31;
        View view5 = this.f;
        int iHashCode6 = (iHashCode5 + (view5 == null ? 0 : view5.hashCode())) * 31;
        View view6 = this.g;
        return this.h.hashCode() + ((iHashCode6 + (view6 != null ? view6.hashCode() : 0)) * 31);
    }

    @Nullable
    public final View i() {
        return this.c;
    }

    @Nullable
    public final View j() {
        return this.e;
    }

    @NotNull
    public final G8 k() {
        return this.a;
    }

    @Nullable
    public final View l() {
        return this.g;
    }

    @Nullable
    public final View m() {
        return this.d;
    }

    @Nullable
    public final a n() {
        return this.i;
    }

    @Nullable
    public final View o() {
        return this.f;
    }

    @NotNull
    public final View p() {
        return this.h;
    }

    @Nullable
    public final View q() {
        return this.b;
    }

    @NotNull
    public String toString() {
        return "ISNNativeAdViewHolder(containerView=" + this.a + ", titleView=" + this.b + ", advertiserView=" + this.c + ", iconView=" + this.d + ", bodyView=" + this.e + ", mediaView=" + this.f + ", ctaView=" + this.g + ", privacyIconView=" + this.h + ")";
    }

    public final void f(@NotNull View view) {
        view.getClass();
        this.h = view;
    }

    public final void c(@Nullable View view) {
        this.g = view;
    }

    public final void d(@Nullable View view) {
        this.d = view;
    }

    public final void e(@Nullable View view) {
        this.f = view;
    }

    public final void g(@Nullable View view) {
        this.b = view;
    }

    @Nullable
    public final View b() {
        return this.b;
    }

    @NotNull
    public final JSONObject t() throws JSONException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        boolean z6 = false;
        if (this.b != null) {
            z = true;
        } else {
            z = false;
        }
        JSONObject jSONObjectPut = jSONObjectJsonObjectInit.put("title", z);
        if (this.c != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        JSONObject jSONObjectPut2 = jSONObjectPut.put(C4664b4.i.F0, z2);
        if (this.e != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        JSONObject jSONObjectPut3 = jSONObjectPut2.put("body", z3);
        if (this.g != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        JSONObject jSONObjectPut4 = jSONObjectPut3.put(C4664b4.i.G0, z4);
        if (this.f != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        JSONObject jSONObjectPut5 = jSONObjectPut4.put(C4664b4.i.I0, z5);
        if (this.d != null) {
            z6 = true;
        }
        JSONObject jSONObjectPut6 = jSONObjectPut5.put("icon", z6);
        jSONObjectPut6.getClass();
        return jSONObjectPut6;
    }

    public final void b(@Nullable View view) {
        this.e = view;
    }

    @Nullable
    public final View f() {
        return this.f;
    }

    public K8(@NotNull G8 g8, @Nullable View view, @Nullable View view2, @Nullable View view3, @Nullable View view4, @Nullable View view5, @Nullable View view6, @NotNull View view7) {
        g8.getClass();
        view7.getClass();
        this.a = g8;
        this.b = view;
        this.c = view2;
        this.d = view3;
        this.e = view4;
        this.f = view5;
        this.g = view6;
        this.h = view7;
        r();
        s();
    }

    @NotNull
    public final K8 a(@NotNull G8 g8, @Nullable View view, @Nullable View view2, @Nullable View view3, @Nullable View view4, @Nullable View view5, @Nullable View view6, @NotNull View view7) {
        g8.getClass();
        view7.getClass();
        return new K8(g8, view, view2, view3, view4, view5, view6, view7);
    }

    @NotNull
    public final G8 a() {
        return this.a;
    }

    public final void a(@NotNull G8 g8) {
        g8.getClass();
        this.a = g8;
    }

    public final void a(@Nullable View view) {
        this.c = view;
    }

    public final void a(@Nullable a aVar) {
        this.i = aVar;
    }

    private static final void a(K8 k8, View view, b bVar) {
        if (view != null) {
            view.setOnClickListener(new ol0(1, k8, bVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(K8 k8, b bVar, View view) {
        a aVar = k8.i;
        if (aVar != null) {
            aVar.a(bVar);
        }
    }
}
