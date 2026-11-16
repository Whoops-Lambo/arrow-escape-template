package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/ContentScale;", "", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface ContentScale {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/ContentScale$Companion;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static final ContentScale$Companion$Crop$1 a = new ContentScale$Companion$Crop$1();
        public static final ContentScale$Companion$Fit$1 b = new ContentScale$Companion$Fit$1();
        public static final ContentScale$Companion$Inside$1 c = new ContentScale$Companion$Inside$1();
        public static final FixedScale d = new FixedScale();
    }

    long a(long j, long j2);
}
