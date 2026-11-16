package com.explorestack.protobuf;

import defpackage.vq2;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c implements MessageLite {
    protected int memoizedHashCode;

    public abstract int getMemoizedSerializedSize();

    public abstract n8 newUninitializedMessageException();

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        b.addAll((Iterable) iterable, (List) collection);
    }

    public final String a(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public static void checkByteStringIsUtf8(ByteString byteString) throws IllegalArgumentException {
        if (byteString.isValidUtf8()) {
            return;
        }
        defpackage.d.r("Byte string is not UTF-8.");
    }

    public int getSerializedSize(t7 t7Var) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        t7Var.d(this);
        throw null;
    }

    @Override // com.explorestack.protobuf.MessageLite
    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = w.a;
            t tVar = new t(bArr, serializedSize);
            writeTo(tVar);
            if (tVar.y() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            vq2.n(a("byte array"), e);
            return null;
        }
    }

    @Override // com.explorestack.protobuf.MessageLite
    public ByteString toByteString() {
        try {
            ByteString.CodedBuilder codedBuilderNewCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            writeTo(codedBuilderNewCodedBuilder.getCodedOutput());
            return codedBuilderNewCodedBuilder.build();
        } catch (IOException e) {
            vq2.n(a("ByteString"), e);
            return null;
        }
    }

    @Override // com.explorestack.protobuf.MessageLite
    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        int iU = w.u(serializedSize) + serializedSize;
        if (iU > 4096) {
            iU = 4096;
        }
        v vVar = new v(outputStream, iU);
        vVar.U(serializedSize);
        writeTo(vVar);
        if (vVar.e > 0) {
            vVar.c0();
        }
    }

    @Override // com.explorestack.protobuf.MessageLite
    public void writeTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        Logger logger = w.a;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        v vVar = new v(outputStream, serializedSize);
        writeTo(vVar);
        if (vVar.e > 0) {
            vVar.c0();
        }
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        b.addAll((Iterable) iterable, (List) list);
    }
}
