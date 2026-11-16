package androidx.compose.material;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/TabSlots;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class TabSlots {
    public static final TabSlots a;
    public static final TabSlots b;
    public static final /* synthetic */ TabSlots[] c;

    /* JADX INFO: Fake field, exist only in values array */
    TabSlots EF0;

    static {
        TabSlots tabSlots = new TabSlots("Tabs", 0);
        TabSlots tabSlots2 = new TabSlots("Divider", 1);
        a = tabSlots2;
        TabSlots tabSlots3 = new TabSlots("Indicator", 2);
        b = tabSlots3;
        c = new TabSlots[]{tabSlots, tabSlots2, tabSlots3};
    }

    public static TabSlots valueOf(String str) {
        return (TabSlots) Enum.valueOf(TabSlots.class, str);
    }

    public static TabSlots[] values() {
        return (TabSlots[]) c.clone();
    }
}
