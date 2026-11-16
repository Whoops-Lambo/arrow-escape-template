package androidx.core.graphics.drawable;

import android.graphics.Outline;
import android.view.Gravity;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@RequiresApi
class RoundedBitmapDrawable21 extends RoundedBitmapDrawable {
    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Gravity.apply(0, 0, 0, getBounds(), null, 0);
        throw null;
    }
}
