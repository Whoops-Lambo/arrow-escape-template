package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl;", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "PlatformMagnifierImpl", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PlatformMagnifierFactoryApi28Impl implements PlatformMagnifierFactory {
    public static final PlatformMagnifierFactoryApi28Impl a = new PlatformMagnifierFactoryApi28Impl();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl;", "Landroidx/compose/foundation/PlatformMagnifier;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @RequiresApi
    public static class PlatformMagnifierImpl implements PlatformMagnifier {
        public final Magnifier a;

        @Override // androidx.compose.foundation.PlatformMagnifier
        public final long d() {
            return IntSizeKt.a(this.a.getWidth(), this.a.getHeight());
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        public final void dismiss() {
            this.a.dismiss();
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        public final void e() {
            this.a.update();
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        public void f(long j, float f, long j2) {
            this.a.show(Offset.c(j), Offset.d(j));
        }

        public PlatformMagnifierImpl(Magnifier magnifier) {
            this.a = magnifier;
        }
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public final boolean a() {
        return false;
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public final PlatformMagnifier b(MagnifierStyle magnifierStyle, View view, Density density) {
        view.getClass();
        density.getClass();
        return new PlatformMagnifierImpl(new Magnifier(view));
    }
}
