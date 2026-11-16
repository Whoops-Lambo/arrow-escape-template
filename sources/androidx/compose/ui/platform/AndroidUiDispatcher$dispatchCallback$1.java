package androidx.compose.ui.platform;

import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"androidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1", "Landroid/view/Choreographer$FrameCallback;", "Ljava/lang/Runnable;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AndroidUiDispatcher$dispatchCallback$1 implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ AndroidUiDispatcher a;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a.d.removeCallbacks(this);
        AndroidUiDispatcher.U(this.a);
        AndroidUiDispatcher androidUiDispatcher = this.a;
        synchronized (androidUiDispatcher.e) {
            if (androidUiDispatcher.j) {
                androidUiDispatcher.j = false;
                ArrayList arrayList = androidUiDispatcher.g;
                androidUiDispatcher.g = androidUiDispatcher.h;
                androidUiDispatcher.h = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        AndroidUiDispatcher.U(this.a);
        AndroidUiDispatcher androidUiDispatcher = this.a;
        synchronized (androidUiDispatcher.e) {
            if (androidUiDispatcher.g.isEmpty()) {
                androidUiDispatcher.c.removeFrameCallback(this);
                androidUiDispatcher.j = false;
            }
        }
    }

    public AndroidUiDispatcher$dispatchCallback$1(AndroidUiDispatcher androidUiDispatcher) {
        this.a = androidUiDispatcher;
    }
}
