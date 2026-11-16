package com.adsurge.adn.p009b1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import com.adsurge.adn.X.l;
import com.adsurge.adn.X.q;
import com.safedk.android.utils.Logger;
import defpackage.ok2;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class a {
    public volatile ScheduledFuture b;
    public long c;
    public final AtomicBoolean a = new AtomicBoolean(true);
    public int d = 0;

    /* JADX INFO: renamed from: com.adsurge.adn.b1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class C0100a implements l.g {
        public final /* synthetic */ c a;

        @Override // com.adsurge.adn.X.l.g
        public boolean b() {
            return false;
        }

        public C0100a(c cVar) {
            this.a = cVar;
        }

        @Override // com.adsurge.adn.X.l.g
        public boolean a() {
            a.this.a(this.a, com.adsurge.adn.p012c1.c.b());
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b {
        public static final a a = new a();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface c {
        void a(boolean z);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public final /* synthetic */ void b(c cVar) {
        a(cVar, false);
    }

    public void a(com.adsurge.adn.Y0.c cVar, c cVar2) {
        if (cVar2 == null) {
            return;
        }
        Context contextA = com.adsurge.adn.J.a.d().a();
        if (contextA == null) {
            cVar2.a(false);
            return;
        }
        int iA = com.adsurge.adn.N.b.a("sksmj", 1000);
        boolean zC = com.adsurge.adn.p012c1.c.c();
        boolean zC2 = l.b().c();
        if (this.d >= iA || !this.a.get() || !zC2 || zC) {
            cVar2.a(zC);
            return;
        }
        this.a.set(false);
        try {
            com.adsurge.adn.w1.b.a(6001805, cVar);
            a(contextA);
            this.d++;
            this.c = SystemClock.elapsedRealtime();
            c(cVar2);
            a(cVar2);
        } catch (Throwable unused) {
            this.d = iA;
            a(cVar2, false);
        }
    }

    public final void c(c cVar) {
        this.b = q.f.schedule(new ok2(28, this, cVar), 60000L, TimeUnit.MILLISECONDS);
    }

    public static a a() {
        return b.a;
    }

    public final void a(Context context) {
        Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName()));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        intent.addFlags(8388608);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
    }

    public final void a(c cVar) {
        l.b().a(new C0100a(cVar));
    }

    public final void a(c cVar, boolean z) {
        if (this.b != null) {
            this.b.cancel(true);
            this.b = null;
        }
        if (this.a.compareAndSet(false, true)) {
            cVar.a(z);
        }
    }
}
