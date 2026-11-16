package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.core.os.HandlerCompat;
import defpackage.e32;
import defpackage.sy;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/compose/ui/platform/AndroidUiDispatcher$Companion$currentThread$1", "Ljava/lang/ThreadLocal;", "Lsy;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AndroidUiDispatcher$Companion$currentThread$1 extends ThreadLocal<sy> {
    @Override // java.lang.ThreadLocal
    public final sy initialValue() {
        Choreographer choreographer = Choreographer.getInstance();
        choreographer.getClass();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            e32.i("no Looper on this thread");
            return null;
        }
        Handler handlerA = HandlerCompat.a(looperMyLooper);
        handlerA.getClass();
        AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, handlerA);
        return androidUiDispatcher.plus(androidUiDispatcher.l);
    }
}
