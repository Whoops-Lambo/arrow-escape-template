package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class O3 implements Y5 {

    @NotNull
    private final JSONObject a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {

        @NotNull
        public static final a a = new a();
        public static final boolean b = false;

        @NotNull
        public static final String c = "curlError";

        private a() {
        }
    }

    @Override // com.ironsource.Y5
    public boolean b() {
        return this.a.optBoolean("enabled", false);
    }

    public final boolean d() {
        return this.a.optBoolean("closeActivity", true);
    }

    public final boolean e() {
        return this.a.optBoolean("reportController", true);
    }

    public O3(@Nullable JSONObject jSONObject) {
        this.a = jSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : jSONObject;
    }
}
