package io.p071bidmachine.iab.mraid;

import android.app.Activity;
import android.view.ViewGroup;
import com.facebook.ads.a;
import defpackage.r6;
import io.p071bidmachine.iab.b;
import io.p071bidmachine.iab.utils.y;
import io.p071bidmachine.util.n;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class p {
    public static final AtomicInteger l = new AtomicInteger(0);
    public a0 e;
    public q f;
    public final int a = l.getAndIncrement();
    public final AtomicBoolean c = new AtomicBoolean(false);
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = true;
    public boolean k = false;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final a d = new a(this, 28);

    public final void d() {
        u.b("MraidInterstitial", "destroy", new Object[0]);
        this.g = false;
        this.f = null;
        a0 a0Var = this.e;
        if (a0Var != null) {
            a0Var.l();
            this.e = null;
        }
    }

    public static void b(p pVar) {
        a0 a0Var;
        Activity activityQ;
        if (!pVar.k || (a0Var = pVar.e) == null || (activityQ = a0Var.q()) == null) {
            return;
        }
        io.p071bidmachine.util.taskmanager.handler.a aVar = n.a;
        io.p071bidmachine.util.p.q(activityQ);
    }

    public final void a(MraidActivity mraidActivity, ViewGroup viewGroup, boolean z) {
        a0 a0Var;
        if (this.g && (a0Var = this.e) != null) {
            this.j = false;
            this.k = z;
            y.f(a0Var);
            viewGroup.addView(this.e, new ViewGroup.LayoutParams(-1, -1));
            this.e.r(mraidActivity);
            return;
        }
        if (mraidActivity != null && z) {
            io.p071bidmachine.util.taskmanager.handler.a aVar = n.a;
            io.p071bidmachine.util.p.q(mraidActivity);
        }
        c(new b(4, "Interstitial is not ready"));
        u.i("MraidInterstitial", new r6(new Object[0], 22));
    }

    public final void c(b bVar) {
        q qVar = this.f;
        if (qVar != null) {
            qVar.r(this, bVar);
        }
    }
}
