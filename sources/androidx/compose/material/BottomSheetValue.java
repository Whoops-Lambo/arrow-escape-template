package androidx.compose.material;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/BottomSheetValue;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@ExperimentalMaterialApi
public final class BottomSheetValue {
    public static final BottomSheetValue a;
    public static final BottomSheetValue b;
    public static final /* synthetic */ BottomSheetValue[] c;

    static {
        BottomSheetValue bottomSheetValue = new BottomSheetValue("Collapsed", 0);
        a = bottomSheetValue;
        BottomSheetValue bottomSheetValue2 = new BottomSheetValue("Expanded", 1);
        b = bottomSheetValue2;
        c = new BottomSheetValue[]{bottomSheetValue, bottomSheetValue2};
    }

    public static BottomSheetValue valueOf(String str) {
        return (BottomSheetValue) Enum.valueOf(BottomSheetValue.class, str);
    }

    public static BottomSheetValue[] values() {
        return (BottomSheetValue[]) c.clone();
    }
}
