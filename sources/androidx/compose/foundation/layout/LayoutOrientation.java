package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/LayoutOrientation;", "", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LayoutOrientation {
    public static final LayoutOrientation a;
    public static final LayoutOrientation b;
    public static final /* synthetic */ LayoutOrientation[] c;

    static {
        LayoutOrientation layoutOrientation = new LayoutOrientation("Horizontal", 0);
        a = layoutOrientation;
        LayoutOrientation layoutOrientation2 = new LayoutOrientation("Vertical", 1);
        b = layoutOrientation2;
        c = new LayoutOrientation[]{layoutOrientation, layoutOrientation2};
    }

    public static LayoutOrientation valueOf(String str) {
        return (LayoutOrientation) Enum.valueOf(LayoutOrientation.class, str);
    }

    public static LayoutOrientation[] values() {
        return (LayoutOrientation[]) c.clone();
    }
}
