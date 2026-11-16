package defpackage;

import com.google.protobuf.CodedInputStream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class t83 {
    public static final q83 a;
    public static final r83 b;
    public static final /* synthetic */ t83[] c;

    public abstract Object a(CodedInputStream codedInputStream);

    static {
        q83 q83Var = new q83();
        a = q83Var;
        r83 r83Var = new r83();
        b = r83Var;
        c = new t83[]{q83Var, r83Var, new t83() { // from class: s83
            @Override // defpackage.t83
            public final Object a(CodedInputStream codedInputStream) {
                return codedInputStream.readBytes();
            }
        }};
    }

    public static t83 valueOf(String str) {
        return (t83) Enum.valueOf(t83.class, str);
    }

    public static t83[] values() {
        return (t83[]) c.clone();
    }
}
