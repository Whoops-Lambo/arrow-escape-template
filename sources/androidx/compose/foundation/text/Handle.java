package androidx.compose.foundation.text;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/Handle;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Handle {
    public static final Handle a;
    public static final Handle b;
    public static final Handle c;
    public static final /* synthetic */ Handle[] d;

    static {
        Handle handle = new Handle("Cursor", 0);
        a = handle;
        Handle handle2 = new Handle("SelectionStart", 1);
        b = handle2;
        Handle handle3 = new Handle("SelectionEnd", 2);
        c = handle3;
        d = new Handle[]{handle, handle2, handle3};
    }

    public static Handle valueOf(String str) {
        return (Handle) Enum.valueOf(Handle.class, str);
    }

    public static Handle[] values() {
        return (Handle[]) d.clone();
    }
}
