package defpackage;

import com.google.protobuf.ByteString;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class jm extends mm {
    public final int b;
    public final int c;

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.mm, com.google.protobuf.ByteString
    public final byte byteAt(int i) {
        ByteString.checkIndex(i, this.c);
        return this.a[this.b + i];
    }

    @Override // defpackage.mm, com.google.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, this.b + i, bArr, i2, i3);
    }

    @Override // defpackage.mm
    public final int d() {
        return this.b;
    }

    @Override // defpackage.mm, com.google.protobuf.l, com.google.protobuf.ByteString
    public final byte internalByteAt(int i) {
        return this.a[this.b + i];
    }

    @Override // defpackage.mm, com.google.protobuf.ByteString
    public final int size() {
        return this.c;
    }

    public jm(byte[] bArr, int i, int i2) {
        super(bArr);
        ByteString.checkRange(i, i + i2, bArr.length);
        this.b = i;
        this.c = i2;
    }

    public Object writeReplace() {
        return ByteString.wrap(toByteArray());
    }
}
