package com.google.protobuf;

import defpackage.q72;
import defpackage.x83;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class z implements x83 {
    public final CodedOutputStream a;

    public final void a(int i, ByteString byteString) throws IOException {
        this.a.writeBytes(i, byteString);
    }

    public final void b(int i, int i2) throws IOException {
        this.a.writeFixed32(i, i2);
    }

    public final void c(int i, long j) throws IOException {
        this.a.writeFixed64(i, j);
    }

    public final void d(int i, Object obj, q72 q72Var) throws IOException {
        this.a.writeGroup(i, (MessageLite) obj, q72Var);
    }

    public final void e(int i, int i2) throws IOException {
        this.a.writeInt32(i, i2);
    }

    public final void f(int i, long j) throws IOException {
        this.a.writeInt64(i, j);
    }

    public final void g(int i, Object obj, q72 q72Var) throws IOException {
        this.a.writeMessage(i, (MessageLite) obj, q72Var);
    }

    public final void h(int i, Object obj) throws IOException {
        boolean z = obj instanceof ByteString;
        CodedOutputStream codedOutputStream = this.a;
        if (z) {
            codedOutputStream.writeRawMessageSetExtension(i, (ByteString) obj);
        } else {
            codedOutputStream.writeMessageSetExtension(i, (MessageLite) obj);
        }
    }

    public z(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) Internal.checkNotNull(codedOutputStream, "output");
        this.a = codedOutputStream2;
        codedOutputStream2.wrapper = this;
    }
}
