package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import defpackage.e80;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Cc {

    @Nullable
    private final C5002u2 a;
    private final boolean b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {

        @NotNull
        public static final a a = new a();

        @NotNull
        public static final String b = "adm";

        @NotNull
        public static final String c = "isOneFlow";

        @NotNull
        public static final String d = "isMultipleAdObjects";

        @NotNull
        public static final String e = "adsInternalInfo";

        @NotNull
        public static final String f = "success";

        @NotNull
        public static final String g = "error";

        @NotNull
        public static final String h = "data";

        private a() {
        }
    }

    public /* synthetic */ Cc(C5002u2 c5002u2, boolean z, int i, e80 e80Var) {
        this((i & 1) != 0 ? null : c5002u2, (i & 2) != 0 ? false : z);
    }

    @NotNull
    public final HashMap<String, String> a() {
        C5092z2 c5092z2G;
        HashMap<String, String> map = new HashMap<>();
        map.put("isOneFlow", String.valueOf(this.b));
        map.put("isMultipleAdObjects", "true");
        List<O> listA = Pb.w.d().K().a();
        String string = listA != null ? IronSourceNetworkBridge.jsonObjectInit().put("success", true).put("data", listA).toString() : IronSourceNetworkBridge.jsonObjectInit().put("success", false).put("error", "Failed to get ad internal info").toString();
        string.getClass();
        map.put(a.e, string);
        C5002u2 c5002u2 = this.a;
        if (c5002u2 != null && (c5092z2G = c5002u2.g()) != null) {
            map.put("adm", c5092z2G.a());
            map.putAll(c5092z2G.b());
        }
        return map;
    }

    public Cc(@Nullable C5002u2 c5002u2, boolean z) {
        this.a = c5002u2;
        this.b = z;
    }

    public Cc() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }
}
