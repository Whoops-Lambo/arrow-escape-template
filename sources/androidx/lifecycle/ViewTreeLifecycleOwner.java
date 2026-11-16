package androidx.lifecycle;

import android.view.View;
import defpackage.ar2;
import defpackage.p92;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lifecycle-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewTreeLifecycleOwner {
    public static final LifecycleOwner a(View view) {
        view.getClass();
        return (LifecycleOwner) p92.I(p92.H(new ar2(p92.J(view, ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1.i), ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2.i)));
    }
}
