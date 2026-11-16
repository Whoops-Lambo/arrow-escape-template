package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class ee0 implements Drawable.Callback {
    public final /* synthetic */ fe0 a;

    public ee0(fe0 fe0Var) {
        this.a = fe0Var;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        long jA;
        drawable.getClass();
        fe0 fe0Var = this.a;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = fe0Var.g;
        parcelableSnapshotMutableState.setValue(Integer.valueOf(((Number) parcelableSnapshotMutableState.getA()).intValue() + 1));
        Drawable drawable2 = fe0Var.f;
        gd1 gd1Var = ge0.a;
        if (drawable2.getIntrinsicWidth() >= 0 && drawable2.getIntrinsicHeight() >= 0) {
            jA = SizeKt.a(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        } else {
            jA = Size.c;
        }
        fe0Var.h.setValue(new Size(jA));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        drawable.getClass();
        runnable.getClass();
        ((Handler) ge0.a.getValue()).postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        drawable.getClass();
        runnable.getClass();
        ((Handler) ge0.a.getValue()).removeCallbacks(runnable);
    }
}
