package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import defpackage.cm2;
import defpackage.dt1;
import defpackage.gd1;
import defpackage.ks0;
import defpackage.qh1;
import defpackage.sr0;
import defpackage.ya2;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class V7 implements InterfaceC4784hg {
    private static boolean c = false;

    @NotNull
    public static final String d = "deviceStatus";

    @NotNull
    public static final String e = "iabTokenAPI";

    @NotNull
    public static final String f = "dsSharedSignalsAPI";

    @NotNull
    public static final String g = "deleteFolder";

    @NotNull
    public static final String h = "deleteFile";

    @NotNull
    public static final String i = "getCachedFilesMap";

    @NotNull
    public static final String j = "permissionsAPI";

    @NotNull
    public static final String k = "deviceDataAPI";

    @NotNull
    public static final String l = "adViewAPI";

    @NotNull
    private static final Z9 o;

    @NotNull
    private static final Z9 p;

    @NotNull
    private static final Z9 q;

    @NotNull
    public static final V7 a = new V7();

    @NotNull
    private static final Handler b = new Handler(Looper.getMainLooper());

    @NotNull
    private static final gd1 m = new cm2(new ya2(19));

    @NotNull
    private static final gd1 n = new cm2(new ya2(20));

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public /* synthetic */ class a extends ks0 implements sr0 {
        public a(Object obj) {
            super(0, obj, D7.class, "shouldRunOnBackgroundThreadDeviceStatus", "shouldRunOnBackgroundThreadDeviceStatus()Z", 0);
        }

        @Override // defpackage.sr0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(((D7) this.receiver).r());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public /* synthetic */ class b extends ks0 implements sr0 {
        public b(Object obj) {
            super(0, obj, D7.class, "shouldRunOnBackgroundThreadIabToken", "shouldRunOnBackgroundThreadIabToken()Z", 0);
        }

        @Override // defpackage.sr0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(((D7) this.receiver).u());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public /* synthetic */ class c extends ks0 implements sr0 {
        public c(Object obj) {
            super(0, obj, D7.class, "shouldRunOnBackgroundThreadSharedSignals", "shouldRunOnBackgroundThreadSharedSignals()Z", 0);
        }

        @Override // defpackage.sr0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(((D7) this.receiver).t());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public /* synthetic */ class d extends ks0 implements sr0 {
        public d(Object obj) {
            super(0, obj, D7.class, "shouldRunOnBackgroundThreadDeleteFolder", "shouldRunOnBackgroundThreadDeleteFolder()Z", 0);
        }

        @Override // defpackage.sr0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(((D7) this.receiver).l());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public /* synthetic */ class e extends ks0 implements sr0 {
        public e(Object obj) {
            super(0, obj, D7.class, "shouldRunOnBackgroundThreadDeleteFile", "shouldRunOnBackgroundThreadDeleteFile()Z", 0);
        }

        @Override // defpackage.sr0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(((D7) this.receiver).s());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public /* synthetic */ class f extends ks0 implements sr0 {
        public f(Object obj) {
            super(0, obj, D7.class, "shouldRunOnBackgroundThreadCachedFiles", "shouldRunOnBackgroundThreadCachedFiles()Z", 0);
        }

        @Override // defpackage.sr0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(((D7) this.receiver).b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public /* synthetic */ class g extends ks0 implements sr0 {
        public g(Object obj) {
            super(0, obj, D7.class, "shouldRunOnBackgroundThreadPermissions", "shouldRunOnBackgroundThreadPermissions()Z", 0);
        }

        @Override // defpackage.sr0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(((D7) this.receiver).J());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public /* synthetic */ class h extends ks0 implements sr0 {
        public h(Object obj) {
            super(0, obj, D7.class, "shouldRunOnBackgroundThreadDeviceData", "shouldRunOnBackgroundThreadDeviceData()Z", 0);
        }

        @Override // defpackage.sr0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(((D7) this.receiver).I());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public /* synthetic */ class i extends ks0 implements sr0 {
        public i(Object obj) {
            super(0, obj, D7.class, "shouldRunOnBackgroundThreadAdView", "shouldRunOnBackgroundThreadAdView()Z", 0);
        }

        @Override // defpackage.sr0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(((D7) this.receiver).L());
        }
    }

    static {
        Z9 z9 = new Z9("isadplayer-background");
        z9.start();
        z9.a();
        o = z9;
        Z9 z10 = new Z9("isadplayer-publisher-callbacks");
        z10.start();
        z10.a();
        p = z10;
        Z9 z11 = new Z9("isadplayer-release");
        z11.start();
        z11.a();
        q = z11;
    }

    private final boolean f(Runnable runnable) {
        return c && c().getQueue().contains(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map g() {
        D7 d7H = Pb.w.d().h();
        return qh1.Y(new dt1(d, new a(d7H)), new dt1(e, new b(d7H)), new dt1(f, new c(d7H)), new dt1("deleteFolder", new d(d7H)), new dt1("deleteFile", new e(d7H)), new dt1(i, new f(d7H)), new dt1(j, new g(d7H)), new dt1(k, new h(d7H)), new dt1(l, new i(d7H)));
    }

    private V7() {
    }

    public final void a(@NotNull Runnable runnable, @NotNull String str) {
        boolean zBooleanValue;
        runnable.getClass();
        str.getClass();
        sr0 sr0Var = d().get(str);
        if (sr0Var != null) {
            zBooleanValue = ((Boolean) sr0Var.invoke()).booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (zBooleanValue) {
            a(this, runnable, 0L, 2, (Object) null);
        } else {
            runnable.run();
        }
    }

    public final void b(@NotNull Runnable runnable) {
        runnable.getClass();
        a(this, runnable, 0L, 2, (Object) null);
    }

    public final void c(@NotNull Runnable runnable) {
        runnable.getClass();
        b(this, runnable, 0L, 2, null);
    }

    public final void d(@NotNull Runnable runnable) {
        runnable.getClass();
        c(this, runnable, 0L, 2, null);
    }

    public final void e(@NotNull Runnable runnable) {
        runnable.getClass();
        if (f(runnable)) {
            c().remove(runnable);
        } else {
            q.b(runnable);
        }
    }

    private final C4907oe c() {
        return (C4907oe) m.getValue();
    }

    private final Map<String, sr0> d() {
        return (Map) n.getValue();
    }

    public final void b(@NotNull Runnable runnable, long j2) {
        runnable.getClass();
        o.a(runnable, j2);
    }

    public static /* synthetic */ void b(V7 v7, Runnable runnable, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        v7.c(runnable, j2);
    }

    public static /* synthetic */ void c(V7 v7, Runnable runnable, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        v7.d(runnable, j2);
    }

    public final void d(@NotNull Runnable runnable, long j2) {
        runnable.getClass();
        b.postDelayed(runnable, j2);
    }

    @Nullable
    public final Looper b() {
        return o.getLooper();
    }

    public final void c(@NotNull Runnable runnable, long j2) {
        runnable.getClass();
        p.a(runnable, j2);
    }

    public final boolean f() {
        return c;
    }

    @NotNull
    public final ThreadPoolExecutor e() {
        return c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4907oe a() {
        return new C4907oe(0, null, 3, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.InterfaceC4784hg
    public void a(@NotNull Runnable runnable) {
        runnable.getClass();
        c(this, runnable, 0L, 2, null);
    }

    public static /* synthetic */ void a(V7 v7, Runnable runnable, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        v7.b(runnable, j2);
    }

    @Override // com.ironsource.InterfaceC4784hg
    public void a(@NotNull Runnable runnable, long j2) {
        runnable.getClass();
        if (c) {
            c().schedule(runnable, j2, TimeUnit.MILLISECONDS);
        } else {
            q.a(runnable, j2);
        }
    }

    public final void a(boolean z) {
        c = z;
    }
}
