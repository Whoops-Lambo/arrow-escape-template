package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.b7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4667b7 implements X6 {

    @NotNull
    private final JSONObject a;

    /* JADX INFO: renamed from: com.ironsource.b7$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public static final boolean b = false;
        public static final int d = 24;

        @NotNull
        public static final a a = new a();
        private static final int c = EnumC4685c7.SendEvent.c();

        public final int a() {
            return c;
        }

        private a() {
        }
    }

    @Override // com.ironsource.X6
    public long a() {
        return ((long) this.a.optInt("timeout", 24)) * 1000;
    }

    @Override // com.ironsource.Y5
    public boolean b() {
        return this.a.optBoolean(com.ironsource.mediationsdk.metadata.a.k, false);
    }

    @Override // com.ironsource.X6
    @NotNull
    public EnumC4685c7 c() {
        return EnumC4685c7.b.a(this.a.optInt(C4664b4.f.e, a.a.a()));
    }

    public C4667b7(@Nullable JSONObject jSONObject) {
        this.a = jSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : jSONObject;
    }
}
