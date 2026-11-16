package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import defpackage.e80;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.f2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC4734f2 {

    /* JADX INFO: renamed from: com.ironsource.f2$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a implements InterfaceC4734f2 {

        @Nullable
        private final JSONObject a;

        public /* synthetic */ a(JSONObject jSONObject, int i, e80 e80Var) {
            this((i & 1) != 0 ? IronSourceNetworkBridge.jsonObjectInit() : jSONObject);
        }

        @Override // com.ironsource.InterfaceC4734f2
        @NotNull
        public com.ironsource.mediationsdk.demandOnly.p a(@NotNull String str) {
            JSONObject jSONObjectOptJSONObject;
            str.getClass();
            JSONObject jSONObject = this.a;
            String strOptString = null;
            if (jSONObject != null) {
                jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
            } else {
                jSONObjectOptJSONObject = null;
            }
            if (jSONObjectOptJSONObject != null) {
                strOptString = jSONObjectOptJSONObject.optString("plumbus");
            }
            if (strOptString != null) {
                return new com.ironsource.mediationsdk.demandOnly.p.a(strOptString);
            }
            return new com.ironsource.mediationsdk.demandOnly.p.b();
        }

        public a(@Nullable JSONObject jSONObject) {
            this.a = jSONObject;
        }

        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @NotNull
    com.ironsource.mediationsdk.demandOnly.p a(@NotNull String str);
}
