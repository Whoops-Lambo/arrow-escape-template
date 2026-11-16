package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class ProtoSyntax {
    public static final ProtoSyntax a;
    public static final ProtoSyntax b;
    public static final ProtoSyntax c;
    public static final /* synthetic */ ProtoSyntax[] d;

    static {
        ProtoSyntax protoSyntax = new ProtoSyntax("PROTO2", 0);
        a = protoSyntax;
        ProtoSyntax protoSyntax2 = new ProtoSyntax("PROTO3", 1);
        b = protoSyntax2;
        ProtoSyntax protoSyntax3 = new ProtoSyntax("EDITIONS", 2);
        c = protoSyntax3;
        d = new ProtoSyntax[]{protoSyntax, protoSyntax2, protoSyntax3};
    }

    public static ProtoSyntax valueOf(String str) {
        return (ProtoSyntax) java.lang.Enum.valueOf(ProtoSyntax.class, str);
    }

    public static ProtoSyntax[] values() {
        return (ProtoSyntax[]) d.clone();
    }
}
