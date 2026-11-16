package defpackage;

import android.view.ViewTreeObserver;
import com.unity3d.player.F;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class e11 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ F a;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.reportSoftInputArea();
    }

    public e11(F f) {
        this.a = f;
    }
}
