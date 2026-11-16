package defpackage;

import com.google.protobuf.Internal;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ProtoSyntax;
import com.google.protobuf.n0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class mk2 implements ml1 {
    public final ProtoSyntax a;
    public final boolean b;
    public final int[] c;
    public final n0[] d;
    public final MessageLite e;

    @Override // defpackage.ml1
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.ml1
    public final MessageLite b() {
        return this.e;
    }

    @Override // defpackage.ml1
    public final ProtoSyntax getSyntax() {
        return this.a;
    }

    public mk2(ProtoSyntax protoSyntax, boolean z, int[] iArr, n0[] n0VarArr, Object obj) {
        this.a = protoSyntax;
        this.b = z;
        this.c = iArr;
        this.d = n0VarArr;
        this.e = (MessageLite) Internal.checkNotNull(obj, "defaultInstance");
    }
}
