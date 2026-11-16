package androidx.compose.material;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/ModalBottomSheetValue;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@ExperimentalMaterialApi
public final class ModalBottomSheetValue {
    public static final ModalBottomSheetValue a;
    public static final ModalBottomSheetValue b;
    public static final ModalBottomSheetValue c;
    public static final /* synthetic */ ModalBottomSheetValue[] d;

    static {
        ModalBottomSheetValue modalBottomSheetValue = new ModalBottomSheetValue("Hidden", 0);
        a = modalBottomSheetValue;
        ModalBottomSheetValue modalBottomSheetValue2 = new ModalBottomSheetValue("Expanded", 1);
        b = modalBottomSheetValue2;
        ModalBottomSheetValue modalBottomSheetValue3 = new ModalBottomSheetValue("HalfExpanded", 2);
        c = modalBottomSheetValue3;
        d = new ModalBottomSheetValue[]{modalBottomSheetValue, modalBottomSheetValue2, modalBottomSheetValue3};
    }

    public static ModalBottomSheetValue valueOf(String str) {
        return (ModalBottomSheetValue) Enum.valueOf(ModalBottomSheetValue.class, str);
    }

    public static ModalBottomSheetValue[] values() {
        return (ModalBottomSheetValue[]) d.clone();
    }
}
