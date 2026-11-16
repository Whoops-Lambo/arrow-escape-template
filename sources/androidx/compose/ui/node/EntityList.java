package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import com.google.android.gms.ads.RequestConfiguration;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import defpackage.s71;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\b\u0081@\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0088\u0001\u0004\u0092\u0001\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/EntityList;", "", "Companion", "EntityType", "entities", "", "Landroidx/compose/ui/node/LayoutNodeEntity;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class EntityList {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/EntityList$Companion;", "", "", "TypeCount", "I", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005\u0088\u0001\u0006\u0092\u0001\u00020\u0007ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Landroidx/compose/ui/node/EntityList$EntityType;", "Landroidx/compose/ui/node/LayoutNodeEntity;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/Modifier;", "M", "", TTEDPEventConstants.EDP_EVENT_PROPERTY_INDEX, "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class EntityType<T extends LayoutNodeEntity<T, M>, M extends Modifier> {
        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final boolean equals(Object obj) {
            return obj instanceof EntityType;
        }

        public final String toString() {
            return "EntityType(index=0)";
        }
    }

    public final int hashCode() {
        return Arrays.hashCode((Object[]) null);
    }

    public static final void a(LayoutNodeEntity[] layoutNodeEntityArr, LayoutNodeEntity layoutNodeEntity, int i) {
        layoutNodeEntity.c = layoutNodeEntityArr[i];
        layoutNodeEntityArr[i] = layoutNodeEntity;
    }

    public static final boolean b(LayoutNodeEntity[] layoutNodeEntityArr, int i) {
        return layoutNodeEntityArr[i] != null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof EntityList) && s71.b(null, null);
    }

    public final String toString() {
        return "EntityList(entities=" + Arrays.toString((Object[]) null) + ')';
    }
}
