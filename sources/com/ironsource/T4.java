package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.dt1;
import defpackage.qh1;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public interface T4 {
    void a(@NotNull D5 d5, @Nullable He he);

    void a(@NotNull D5 d5, @NotNull String str);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {

        @NotNull
        private final Map<String, Object> a;

        public a(@NotNull String str) {
            str.getClass();
            this.a = qh1.Z(new dt1(IronSourceConstants.EVENTS_PROVIDER, str), new dt1(IronSourceConstants.EVENTS_DEMAND_ONLY, 1));
        }

        public final void a(@NotNull String str, @NotNull Object obj) {
            str.getClass();
            obj.getClass();
            this.a.put(str, obj);
        }

        @NotNull
        public final Map<String, Object> a() {
            return qh1.i0(this.a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b implements T4 {

        @NotNull
        private final F7 a;

        @NotNull
        private final a b;

        public b(@NotNull F7 f7, @NotNull a aVar) {
            f7.getClass();
            aVar.getClass();
            this.a = f7;
            this.b = aVar;
        }

        @Override // com.ironsource.T4
        public void a(@NotNull D5 d5, @Nullable He he) {
            d5.getClass();
            Map<String, Object> mapA = this.b.a();
            if (he != null) {
                mapA.put(IronSourceConstants.EVENTS_EXT1, he.toString());
            }
            this.a.a(new C5(d5, new JSONObject(qh1.h0(mapA))));
        }

        @Override // com.ironsource.T4
        public void a(@NotNull D5 d5, @NotNull String str) {
            d5.getClass();
            str.getClass();
            Map<String, Object> mapA = this.b.a();
            mapA.put("spId", str);
            this.a.a(new C5(d5, new JSONObject(qh1.h0(mapA))));
        }
    }
}
