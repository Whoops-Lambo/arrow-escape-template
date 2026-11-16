package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/Direction;", "", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Direction {
    public static final Direction a;
    public static final Direction b;
    public static final Direction c;
    public static final /* synthetic */ Direction[] d;

    static {
        Direction direction = new Direction("Vertical", 0);
        a = direction;
        Direction direction2 = new Direction("Horizontal", 1);
        b = direction2;
        Direction direction3 = new Direction("Both", 2);
        c = direction3;
        d = new Direction[]{direction, direction2, direction3};
    }

    public static Direction valueOf(String str) {
        return (Direction) Enum.valueOf(Direction.class, str);
    }

    public static Direction[] values() {
        return (Direction[]) d.clone();
    }
}
