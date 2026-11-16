package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import defpackage.d;
import defpackage.jc1;
import defpackage.nj;
import defpackage.vq2;
import io.p071bidmachine.media3.extractor.ts.y;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ListImplementation;", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ListImplementation {
    public static final void a(int i, int i2) {
        if (i < 0 || i >= i2) {
            y.p(nj.i(i, i2, "index: ", ", size: "));
        }
    }

    public static final void b(int i, int i2) {
        if (i < 0 || i > i2) {
            y.p(nj.i(i, i2, "index: ", ", size: "));
        }
    }

    public static final void c(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            vq2.q(i3, jc1.t("fromIndex: ", i, ", toIndex: ", i2, ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            d.r(nj.i(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }
}
