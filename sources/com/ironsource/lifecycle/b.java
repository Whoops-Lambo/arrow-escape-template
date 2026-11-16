package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.ironsource.EnumC4956ra;
import com.ironsource.Ff;
import com.ironsource.InterfaceC4939qa;
import com.ironsource.environment.thread.IronSourceThreadManager;
import defpackage.lb3;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class b implements Application.ActivityLifecycleCallbacks {
    private static final b m = new b();
    private static AtomicBoolean n = new AtomicBoolean(false);
    static final long o = 700;
    private int a = 0;
    private int b = 0;
    private boolean c = true;
    private boolean d = true;
    private EnumC4956ra e = EnumC4956ra.NONE;
    private final List<InterfaceC4939qa> f = new CopyOnWriteArrayList();
    private final AtomicReference<Ff.a> g = new AtomicReference<>();
    private final Runnable h = new lb3(this, 1);
    private final Runnable i = new lb3(this, 2);
    private final Runnable j = new lb3(this, 3);
    private final Runnable k = new lb3(this, 4);
    private final com.ironsource.lifecycle.a.InterfaceC1371a l = new a();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements com.ironsource.lifecycle.a.InterfaceC1371a {
        @Override // com.ironsource.lifecycle.a.InterfaceC1371a
        public void c(Activity activity) {
        }

        public a() {
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC1371a
        public void a(Activity activity) {
            b.this.b(activity);
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC1371a
        public void b(Activity activity) {
            b.this.c(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        Iterator<InterfaceC4939qa> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        Iterator<InterfaceC4939qa> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        Iterator<InterfaceC4939qa> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        Iterator<InterfaceC4939qa> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void a(Activity activity) {
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            this.g.set(IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new lb3(this, 0), o));
        }
    }

    public void b(Activity activity) {
        int i = this.b + 1;
        this.b = i;
        if (i == 1) {
            if (this.c) {
                IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.j);
                this.c = false;
                this.e = EnumC4956ra.RESUMED;
            } else {
                Ff.a aVar = this.g.get();
                if (aVar != null) {
                    aVar.a();
                }
            }
        }
    }

    public void c(Activity activity) {
        int i = this.a + 1;
        this.a = i;
        if (i == 1 && this.d) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.k);
            this.d = false;
            this.e = EnumC4956ra.STARTED;
        }
    }

    public void d(Activity activity) {
        this.a--;
        b();
    }

    public boolean e() {
        return this.e == EnumC4956ra.STOPPED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        a();
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        com.ironsource.lifecycle.a.b(activity);
        com.ironsource.lifecycle.a aVarA = com.ironsource.lifecycle.a.a(activity);
        if (aVarA != null) {
            aVarA.d(this.l);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        d(activity);
    }

    public static b d() {
        return m;
    }

    public EnumC4956ra c() {
        return this.e;
    }

    public void a(InterfaceC4939qa interfaceC4939qa) {
        if (!IronsourceLifecycleProvider.a() || interfaceC4939qa == null || this.f.contains(interfaceC4939qa)) {
            return;
        }
        this.f.add(interfaceC4939qa);
    }

    public void a(Context context) {
        Application application;
        if (!n.compareAndSet(false, true) || (application = (Application) context.getApplicationContext()) == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
    }

    private void a() {
        if (this.b == 0) {
            this.c = true;
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.h);
            this.e = EnumC4956ra.PAUSED;
        }
    }

    public void b(InterfaceC4939qa interfaceC4939qa) {
        if (this.f.contains(interfaceC4939qa)) {
            this.f.remove(interfaceC4939qa);
        }
    }

    private void b() {
        if (this.a == 0 && this.c) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.i);
            this.d = true;
            this.e = EnumC4956ra.STOPPED;
        }
    }
}
