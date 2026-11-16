package androidx.compose.material;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/DismissDirection;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DismissDirection {
    public static final DismissDirection a;
    public static final DismissDirection b;
    public static final /* synthetic */ DismissDirection[] c;

    static {
        DismissDirection dismissDirection = new DismissDirection("StartToEnd", 0);
        a = dismissDirection;
        DismissDirection dismissDirection2 = new DismissDirection("EndToStart", 1);
        b = dismissDirection2;
        c = new DismissDirection[]{dismissDirection, dismissDirection2};
    }

    public static DismissDirection valueOf(String str) {
        return (DismissDirection) Enum.valueOf(DismissDirection.class, str);
    }

    public static DismissDirection[] values() {
        return (DismissDirection[]) c.clone();
    }
}
