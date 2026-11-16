package androidx.compose.ui.platform;

import android.os.Handler;
import android.view.Choreographer;
import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.cm2;
import defpackage.g8;
import defpackage.sy;
import defpackage.uy;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher;", "Luy;", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AndroidUiDispatcher extends uy {
    public static final cm2 m = new cm2(AndroidUiDispatcher$Companion$Main$2.i);
    public static final AndroidUiDispatcher$Companion$currentThread$1 n = new AndroidUiDispatcher$Companion$currentThread$1();
    public final Choreographer c;
    public final Handler d;
    public boolean i;
    public boolean j;
    public final AndroidUiFrameClock l;
    public final Object e = new Object();
    public final g8 f = new g8();
    public ArrayList g = new ArrayList();
    public ArrayList h = new ArrayList();
    public final AndroidUiDispatcher$dispatchCallback$1 k = new AndroidUiDispatcher$dispatchCallback$1(this);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher$Companion;", "", "Ljava/lang/ThreadLocal;", "Lsy;", "currentThread", "Ljava/lang/ThreadLocal;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public static final void U(AndroidUiDispatcher androidUiDispatcher) {
        Runnable runnable;
        boolean z;
        do {
            synchronized (androidUiDispatcher.e) {
                g8 g8Var = androidUiDispatcher.f;
                runnable = (Runnable) (g8Var.isEmpty() ? null : g8Var.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (androidUiDispatcher.e) {
                    g8 g8Var2 = androidUiDispatcher.f;
                    runnable = (Runnable) (g8Var2.isEmpty() ? null : g8Var2.removeFirst());
                }
            }
            synchronized (androidUiDispatcher.e) {
                if (androidUiDispatcher.f.isEmpty()) {
                    z = false;
                    androidUiDispatcher.i = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    public AndroidUiDispatcher(Choreographer choreographer, Handler handler) {
        this.c = choreographer;
        this.d = handler;
        this.l = new AndroidUiFrameClock(choreographer);
    }

    @Override // defpackage.uy
    public final void L(sy syVar, Runnable runnable) {
        syVar.getClass();
        runnable.getClass();
        synchronized (this.e) {
            this.f.addLast(runnable);
            if (!this.i) {
                this.i = true;
                this.d.post(this.k);
                if (!this.j) {
                    this.j = true;
                    this.c.postFrameCallback(this.k);
                }
            }
        }
    }
}
