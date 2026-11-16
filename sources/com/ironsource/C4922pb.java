package com.ironsource;

import androidx.annotation.VisibleForTesting;
import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.e80;
import defpackage.kf3;
import defpackage.yf3;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.pb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4922pb {

    @NotNull
    public static final a d = new a(null);

    @NotNull
    private static C4922pb e;

    @NotNull
    private final C5083yb a;

    @NotNull
    private final com.ironsource.mediationsdk.c b;

    @NotNull
    private final Tb c;

    /* JADX INFO: renamed from: com.ironsource.pb$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        @VisibleForTesting
        public final void a(@NotNull C4922pb c4922pb) {
            c4922pb.getClass();
            C4922pb.e = c4922pb;
        }

        private a() {
        }

        @NotNull
        public final C4922pb a() {
            return C4922pb.e;
        }
    }

    static {
        C5083yb c5083yb = new C5083yb();
        com.ironsource.mediationsdk.c cVarC = com.ironsource.mediationsdk.c.c();
        cVarC.getClass();
        e = new C4922pb(c5083yb, cVarC, new Tb(null, null, null, null, null, 31, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4922pb c4922pb, boolean z) throws JSONException {
        c4922pb.a.b(z);
        if (!c4922pb.a.a()) {
            c4922pb.c.b(z);
        } else {
            c4922pb.a.b();
            IronLog.API.error("LevelPlayPrivacySettings.setCOPPA() must be called before LevelPlay.init()");
        }
    }

    public final void c(boolean z) {
        this.a.a(new yf3(this, z, 1));
    }

    public C4922pb(@NotNull C5083yb c5083yb, @NotNull com.ironsource.mediationsdk.c cVar, @NotNull Tb tb) {
        c5083yb.getClass();
        cVar.getClass();
        tb.getClass();
        this.a = c5083yb;
        this.b = cVar;
        this.c = tb;
    }

    public final void a(@NotNull Map<String, Boolean> map) {
        map.getClass();
        this.a.a(new kf3(6, this, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4922pb c4922pb, boolean z) throws JSONException {
        c4922pb.a.c(z);
        c4922pb.b.c(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4922pb c4922pb, Map map) throws JSONException {
        c4922pb.a.a((Map<String, Boolean>) map);
        c4922pb.b.a((Map<String, Boolean>) map);
    }

    public final void a(boolean z) {
        this.a.a(new yf3(this, z, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4922pb c4922pb, boolean z) throws JSONException {
        c4922pb.a.a(z);
        c4922pb.c.a(z);
    }

    public final void b(boolean z) {
        this.a.a(new yf3(this, z, 0));
    }
}
