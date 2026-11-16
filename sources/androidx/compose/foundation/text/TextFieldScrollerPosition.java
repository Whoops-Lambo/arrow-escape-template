package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextRange;
import com.unity3d.services.UnityAdsConstants;
import defpackage.tb5;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "", "Companion", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TextFieldScrollerPosition {
    public static final SaverKt$Saver$1 f = ListSaverKt.a(TextFieldScrollerPosition$Companion$Saver$1.i, TextFieldScrollerPosition$Companion$Saver$2.i);
    public final ParcelableSnapshotMutableState a;
    public final ParcelableSnapshotMutableState b = SnapshotStateKt.c(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), StructuralEqualityPolicy.a);
    public Rect c = Rect.e;
    public long d = TextRange.b;
    public final ParcelableSnapshotMutableState e;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition$Companion;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public final float a() {
        return ((Number) this.a.getA()).floatValue();
    }

    public final void b(Orientation orientation, Rect rect, int i, int i2) {
        float f2;
        float f3 = rect.b;
        float f4 = i2 - i;
        this.b.setValue(Float.valueOf(f4));
        float f5 = rect.a;
        Rect rect2 = this.c;
        float f6 = rect2.a;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.a;
        if (f5 != f6 || f3 != rect2.b) {
            boolean z = orientation == Orientation.a;
            if (!z) {
                f3 = f5;
            }
            float f7 = z ? rect.d : rect.c;
            float fA = a();
            float f8 = i;
            float f9 = fA + f8;
            if (f7 <= f9 && (f3 >= fA || f7 - f3 <= f8)) {
                f2 = (f3 >= fA || f7 - f3 > f8) ? 0.0f : f3 - fA;
            } else {
                f2 = f7 - f9;
            }
            parcelableSnapshotMutableState.setValue(Float.valueOf(a() + f2));
            this.c = rect;
        }
        parcelableSnapshotMutableState.setValue(Float.valueOf(tb5.f(a(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4)));
    }

    public TextFieldScrollerPosition(Orientation orientation, float f2) {
        this.a = SnapshotStateKt.c(Float.valueOf(f2), StructuralEqualityPolicy.a);
        this.e = SnapshotStateKt.c(orientation, SnapshotStateKt.k());
    }
}
