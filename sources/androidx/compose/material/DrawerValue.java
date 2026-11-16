package androidx.compose.material;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/DrawerValue;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DrawerValue {
    public static final DrawerValue a;
    public static final DrawerValue b;
    public static final /* synthetic */ DrawerValue[] c;

    static {
        DrawerValue drawerValue = new DrawerValue("Closed", 0);
        a = drawerValue;
        DrawerValue drawerValue2 = new DrawerValue("Open", 1);
        b = drawerValue2;
        c = new DrawerValue[]{drawerValue, drawerValue2};
    }

    public static DrawerValue valueOf(String str) {
        return (DrawerValue) Enum.valueOf(DrawerValue.class, str);
    }

    public static DrawerValue[] values() {
        return (DrawerValue[]) c.clone();
    }
}
