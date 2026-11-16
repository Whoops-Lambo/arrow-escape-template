package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import defpackage.dk2;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public interface W {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a implements W {

        @NotNull
        private final JSONObject a;

        @NotNull
        private final D7 b;

        @Override // com.ironsource.W
        @NotNull
        public String a() {
            String strA = this.b.a();
            if (dk2.Z(strA)) {
                strA = null;
            }
            if (strA != null) {
                return strA;
            }
            String strOptString = this.a.optString("controllerUrl");
            strOptString.getClass();
            String str = dk2.Z(strOptString) ? null : strOptString;
            return str == null ? "" : str;
        }

        @Override // com.ironsource.W
        @NotNull
        public JSONObject b() {
            JSONObject jSONObjectOptJSONObject = this.a.optJSONObject("controllerConfig");
            return jSONObjectOptJSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : jSONObjectOptJSONObject;
        }

        @Override // com.ironsource.W
        public int c() {
            int iOptInt = this.a.optInt("debugMode", 0);
            if (this.a.optBoolean(b.e, false)) {
                return 3;
            }
            return iOptInt;
        }

        public a(@NotNull JSONObject jSONObject, @NotNull D7 d7) {
            jSONObject.getClass();
            d7.getClass();
            this.a = jSONObject;
            this.b = d7;
        }
    }

    @NotNull
    String a();

    @NotNull
    JSONObject b();

    int c();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b {

        @NotNull
        public static final b a = new b();

        @NotNull
        public static final String b = "controllerUrl";

        @NotNull
        public static final String c = "controllerConfig";

        @NotNull
        public static final String d = "debugMode";

        @NotNull
        public static final String e = "adptDebugMode";

        private b() {
        }
    }
}
