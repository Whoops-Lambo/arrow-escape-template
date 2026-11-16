package androidx.compose.foundation.gestures;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/Orientation;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Orientation {
    public static final Orientation a;
    public static final Orientation b;
    public static final /* synthetic */ Orientation[] c;

    static {
        Orientation orientation = new Orientation("Vertical", 0);
        a = orientation;
        Orientation orientation2 = new Orientation("Horizontal", 1);
        b = orientation2;
        c = new Orientation[]{orientation, orientation2};
    }

    public static Orientation valueOf(String str) {
        return (Orientation) Enum.valueOf(Orientation.class, str);
    }

    public static Orientation[] values() {
        return (Orientation[]) c.clone();
    }
}
