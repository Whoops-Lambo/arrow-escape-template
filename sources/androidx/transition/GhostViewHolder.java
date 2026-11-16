package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SuppressLint({"ViewConstructor"})
class GhostViewHolder extends FrameLayout {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        public static float a(View view) {
            return view.getZ();
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() != 1 || getChildAt(0) != view) && getChildCount() != 0) {
        } else {
            throw null;
        }
    }
}
