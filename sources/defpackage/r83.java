package defpackage;

import com.google.protobuf.CodedInputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final enum r83 extends t83 {
    public r83() {
        super("STRICT", 1);
    }

    @Override // defpackage.t83
    public final Object a(CodedInputStream codedInputStream) {
        return codedInputStream.readStringRequireUtf8();
    }
}
