package androidx.compose.material;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/TextFieldType;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TextFieldType {
    public static final TextFieldType a;
    public static final TextFieldType b;
    public static final /* synthetic */ TextFieldType[] c;

    static {
        TextFieldType textFieldType = new TextFieldType("Filled", 0);
        a = textFieldType;
        TextFieldType textFieldType2 = new TextFieldType("Outlined", 1);
        b = textFieldType2;
        c = new TextFieldType[]{textFieldType, textFieldType2};
    }

    public static TextFieldType valueOf(String str) {
        return (TextFieldType) Enum.valueOf(TextFieldType.class, str);
    }

    public static TextFieldType[] values() {
        return (TextFieldType[]) c.clone();
    }
}
