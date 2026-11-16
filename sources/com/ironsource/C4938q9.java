package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import defpackage.e80;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.q9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class C4938q9 {

    @NotNull
    public static final a a = new a(null);

    /* JADX INFO: renamed from: com.ironsource.q9$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        public final boolean b(@NotNull Context context) {
            context.getClass();
            D3 d3D = d(context);
            if (d3D.d().length() > 0 && d3D.e().length() > 0) {
                return true;
            }
            return false;
        }

        @Nullable
        public final Ue c(@NotNull Context context) {
            context.getClass();
            D3 d3D = d(context);
            if (d3D.d().length() <= 0 || d3D.e().length() <= 0) {
                d3D = null;
            }
            if (d3D == null) {
                return null;
            }
            Ue ue = new Ue(context, d3D.d(), d3D.f(), d3D.e());
            ue.a(Ue.a.CACHE);
            return ue;
        }

        @NotNull
        public final D3 d(@NotNull Context context) {
            context.getClass();
            JSONObject jSONObjectA = a(context);
            String strOptString = jSONObjectA.optString("appKey");
            String strOptString2 = jSONObjectA.optString("userId");
            String strOptString3 = jSONObjectA.optString(Ue.n);
            strOptString.getClass();
            strOptString2.getClass();
            strOptString3.getClass();
            return new D3(strOptString, strOptString2, strOptString3);
        }

        private a() {
        }

        private final JSONObject a(Context context) {
            try {
                return IronSourceNetworkBridge.jsonObjectInit(IronSourceUtils.e(context));
            } catch (JSONException unused) {
                return IronSourceNetworkBridge.jsonObjectInit();
            }
        }
    }

    public static final boolean a(@NotNull Context context) {
        return a.b(context);
    }

    @Nullable
    public static final Ue b(@NotNull Context context) {
        return a.c(context);
    }

    @NotNull
    public static final D3 c(@NotNull Context context) {
        return a.d(context);
    }
}
