package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class d63 implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final HashMap d = new HashMap();
    public final WeakReference a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final AtomicBoolean c = new AtomicBoolean(false);

    public final void a() {
        if (lz.a.contains(this)) {
            return;
        }
        try {
            nj2 nj2Var = new nj2(this, 20);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                nj2Var.run();
            } else {
                this.b.post(nj2Var);
            }
        } catch (Throwable th) {
            lz.a(this, th);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (lz.a.contains(this)) {
            return;
        }
        try {
            a();
        } catch (Throwable th) {
            lz.a(this, th);
        }
    }

    public d63(Activity activity) {
        this.a = new WeakReference(activity);
    }
}
