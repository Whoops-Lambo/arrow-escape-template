package androidx.compose.material;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/BottomSheetScaffoldLayoutSlot;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class BottomSheetScaffoldLayoutSlot {
    public static final BottomSheetScaffoldLayoutSlot a;
    public static final /* synthetic */ BottomSheetScaffoldLayoutSlot[] b;

    /* JADX INFO: Fake field, exist only in values array */
    BottomSheetScaffoldLayoutSlot EF0;

    static {
        BottomSheetScaffoldLayoutSlot bottomSheetScaffoldLayoutSlot = new BottomSheetScaffoldLayoutSlot("TopBar", 0);
        BottomSheetScaffoldLayoutSlot bottomSheetScaffoldLayoutSlot2 = new BottomSheetScaffoldLayoutSlot("Body", 1);
        BottomSheetScaffoldLayoutSlot bottomSheetScaffoldLayoutSlot3 = new BottomSheetScaffoldLayoutSlot("Sheet", 2);
        a = bottomSheetScaffoldLayoutSlot3;
        b = new BottomSheetScaffoldLayoutSlot[]{bottomSheetScaffoldLayoutSlot, bottomSheetScaffoldLayoutSlot2, bottomSheetScaffoldLayoutSlot3, new BottomSheetScaffoldLayoutSlot("Fab", 3), new BottomSheetScaffoldLayoutSlot("Snackbar", 4)};
    }

    public static BottomSheetScaffoldLayoutSlot valueOf(String str) {
        return (BottomSheetScaffoldLayoutSlot) Enum.valueOf(BottomSheetScaffoldLayoutSlot.class, str);
    }

    public static BottomSheetScaffoldLayoutSlot[] values() {
        return (BottomSheetScaffoldLayoutSlot[]) b.clone();
    }
}
