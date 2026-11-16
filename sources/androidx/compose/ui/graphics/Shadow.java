package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import com.unity3d.services.UnityAdsConstants;
import defpackage.h50;
import defpackage.pv1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/Shadow;", "", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Shadow {
    public static final Shadow d = new Shadow();
    public final long a;
    public final long b;
    public final float c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/Shadow$Companion;", "", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) obj;
        return Color.c(this.a, shadow.a) && Offset.a(this.b, shadow.b) && this.c == shadow.c;
    }

    public final int hashCode() {
        int i = Color.j;
        int iHashCode = Long.hashCode(this.a) * 31;
        int i2 = Offset.e;
        return Float.hashCode(this.c) + pv1.d(iHashCode, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        sb.append((Object) Color.i(this.a));
        sb.append(", offset=");
        sb.append((Object) Offset.h(this.b));
        sb.append(", blurRadius=");
        return h50.k(sb, this.c, ')');
    }

    public Shadow() {
        this(ColorKt.c(4278190080L), Offset.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public Shadow(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }
}
