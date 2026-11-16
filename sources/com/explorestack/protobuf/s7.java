package com.explorestack.protobuf;

import defpackage.m81;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class s7 extends ByteString {
    public static final int[] f = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public final int a;
    public final ByteString b;
    public final ByteString c;
    public final int d;
    public final int e;

    public static int c(int i) {
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return f[i];
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.explorestack.protobuf.ByteString
    public final List asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.e);
        arrayDeque.push(this);
        ByteString byteString = this.b;
        while (byteString instanceof s7) {
            s7 s7Var = (s7) byteString;
            arrayDeque.push(s7Var);
            byteString = s7Var.b;
        }
        ByteString.LeafByteString leafByteString = (ByteString.LeafByteString) byteString;
        while (true) {
            if (!(leafByteString != null)) {
                return arrayList;
            }
            ByteString.LeafByteString leafByteString2 = null;
            if (leafByteString == null) {
                defpackage.d.v();
                return null;
            }
            while (!arrayDeque.isEmpty()) {
                ByteString byteString2 = ((s7) arrayDeque.pop()).c;
                while (byteString2 instanceof s7) {
                    s7 s7Var2 = (s7) byteString2;
                    arrayDeque.push(s7Var2);
                    byteString2 = s7Var2.b;
                }
                ByteString.LeafByteString leafByteString3 = (ByteString.LeafByteString) byteString2;
                if (!leafByteString3.isEmpty()) {
                    leafByteString2 = leafByteString3;
                    break;
                }
            }
            arrayList.add(leafByteString.asReadOnlyByteBuffer());
            leafByteString = leafByteString2;
        }
    }

    @Override // com.explorestack.protobuf.ByteString
    public final byte byteAt(int i) {
        ByteString.checkIndex(i, this.a);
        return internalByteAt(i);
    }

    @Override // com.explorestack.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer) {
        this.b.copyTo(byteBuffer);
        this.c.copyTo(byteBuffer);
    }

    @Override // com.explorestack.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        ByteString byteString = this.b;
        int i5 = this.d;
        if (i4 <= i5) {
            byteString.copyToInternal(bArr, i, i2, i3);
            return;
        }
        ByteString byteString2 = this.c;
        if (i >= i5) {
            byteString2.copyToInternal(bArr, i - i5, i2, i3);
            return;
        }
        int i6 = i5 - i;
        byteString.copyToInternal(bArr, i, i2, i6);
        byteString2.copyToInternal(bArr, 0, i2 + i6, i3 - i6);
    }

    @Override // com.explorestack.protobuf.ByteString
    public final boolean equals(Object obj) {
        ByteString.LeafByteString leafByteStringA;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int size = byteString.size();
            int i = this.a;
            if (i == size) {
                if (i == 0) {
                    return true;
                }
                int iPeekCachedHashCode = peekCachedHashCode();
                int iPeekCachedHashCode2 = byteString.peekCachedHashCode();
                if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
                    q7 q7Var = new q7(this);
                    ByteString.LeafByteString leafByteStringA2 = q7Var.next();
                    q7 q7Var2 = new q7(byteString);
                    ByteString.LeafByteString leafByteStringA3 = q7Var2.next();
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int size2 = leafByteStringA2.size() - i2;
                        int size3 = leafByteStringA3.size() - i3;
                        int iMin = Math.min(size2, size3);
                        if (!(i2 == 0 ? leafByteStringA2.equalsRange(leafByteStringA3, i3, iMin) : leafByteStringA3.equalsRange(leafByteStringA2, i2, iMin))) {
                            break;
                        }
                        i4 += iMin;
                        if (i4 >= i) {
                            if (i4 == i) {
                                return true;
                            }
                            io.p071bidmachine.media3.extractor.ts.y.b();
                            return false;
                        }
                        if (iMin == size2) {
                            leafByteStringA = q7Var.next();
                            i2 = 0;
                        } else {
                            i2 += iMin;
                        }
                        if (iMin == size3) {
                            leafByteStringA2 = leafByteStringA2;
                            leafByteStringA2 = leafByteStringA;
                            leafByteStringA3 = q7Var2.next();
                            i3 = 0;
                        } else {
                            leafByteStringA2 = leafByteStringA2;
                            leafByteStringA2 = leafByteStringA;
                            i3 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.explorestack.protobuf.ByteString
    public final int getTreeDepth() {
        return this.e;
    }

    @Override // com.explorestack.protobuf.ByteString
    public final byte internalByteAt(int i) {
        int i2 = this.d;
        return i < i2 ? this.b.internalByteAt(i) : this.c.internalByteAt(i - i2);
    }

    @Override // com.explorestack.protobuf.ByteString
    public final boolean isBalanced() {
        return this.a >= c(this.e);
    }

    @Override // com.explorestack.protobuf.ByteString
    public final boolean isValidUtf8() {
        int iPartialIsValidUtf8 = this.b.partialIsValidUtf8(0, 0, this.d);
        ByteString byteString = this.c;
        return byteString.partialIsValidUtf8(iPartialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // com.explorestack.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: iterator */
    public final Iterator<Byte> iterator2() {
        return new p7(this);
    }

    @Override // com.explorestack.protobuf.ByteString
    public final InputStream newInput() {
        return new r7(this);
    }

    @Override // com.explorestack.protobuf.ByteString
    public final int partialHash(int i, int i2, int i3) {
        int i4 = i2 + i3;
        ByteString byteString = this.b;
        int i5 = this.d;
        if (i4 <= i5) {
            return byteString.partialHash(i, i2, i3);
        }
        ByteString byteString2 = this.c;
        if (i2 >= i5) {
            return byteString2.partialHash(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return byteString2.partialHash(byteString.partialHash(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.explorestack.protobuf.ByteString
    public final int partialIsValidUtf8(int i, int i2, int i3) {
        int i4 = i2 + i3;
        ByteString byteString = this.b;
        int i5 = this.d;
        if (i4 <= i5) {
            return byteString.partialIsValidUtf8(i, i2, i3);
        }
        ByteString byteString2 = this.c;
        if (i2 >= i5) {
            return byteString2.partialIsValidUtf8(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return byteString2.partialIsValidUtf8(byteString.partialIsValidUtf8(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.explorestack.protobuf.ByteString
    public final int size() {
        return this.a;
    }

    @Override // com.explorestack.protobuf.ByteString
    public final ByteString substring(int i, int i2) {
        int i3 = this.a;
        int iCheckRange = ByteString.checkRange(i, i2, i3);
        if (iCheckRange == 0) {
            return ByteString.EMPTY;
        }
        if (iCheckRange == i3) {
            return this;
        }
        ByteString byteString = this.b;
        int i4 = this.d;
        if (i2 <= i4) {
            return byteString.substring(i, i2);
        }
        ByteString byteString2 = this.c;
        return i >= i4 ? byteString2.substring(i - i4, i2 - i4) : new s7(byteString.substring(i), byteString2.substring(0, i2 - i4));
    }

    @Override // com.explorestack.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    @Override // com.explorestack.protobuf.ByteString
    public final void writeTo(OutputStream outputStream) throws IOException {
        this.b.writeTo(outputStream);
        this.c.writeTo(outputStream);
    }

    @Override // com.explorestack.protobuf.ByteString
    public final void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        ByteString byteString = this.b;
        int i4 = this.d;
        if (i3 <= i4) {
            byteString.writeToInternal(outputStream, i, i2);
            return;
        }
        ByteString byteString2 = this.c;
        if (i >= i4) {
            byteString2.writeToInternal(outputStream, i - i4, i2);
            return;
        }
        int i5 = i4 - i;
        byteString.writeToInternal(outputStream, i, i5);
        byteString2.writeToInternal(outputStream, 0, i2 - i5);
    }

    @Override // com.explorestack.protobuf.ByteString
    public final void writeToReverse(l lVar) throws IOException {
        this.c.writeToReverse(lVar);
        this.b.writeToReverse(lVar);
    }

    public s7(ByteString byteString, ByteString byteString2) {
        this.b = byteString;
        this.c = byteString2;
        int size = byteString.size();
        this.d = size;
        this.a = byteString2.size() + size;
        this.e = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    @Override // com.explorestack.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.explorestack.protobuf.ByteString
    public final r newCodedInput() {
        ArrayList arrayList = (ArrayList) asReadOnlyByteBufferList();
        int size = arrayList.size();
        int i = 0;
        int iRemaining = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            iRemaining += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i |= 1;
            } else if (byteBuffer.isDirect()) {
                i |= 2;
            } else {
                i |= 4;
            }
        }
        if (i == 2) {
            o oVar = new o();
            oVar.g = Integer.MAX_VALUE;
            oVar.e = iRemaining;
            oVar.c = arrayList.iterator();
            oVar.i = 0;
            if (iRemaining == 0) {
                oVar.d = l5.d;
                oVar.j = 0L;
                oVar.k = 0L;
                oVar.l = 0L;
                return oVar;
            }
            oVar.S();
            return oVar;
        }
        m81 m81Var = new m81();
        m81Var.b = arrayList.iterator();
        m81Var.d = 0;
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            m81Var.d++;
        }
        m81Var.e = -1;
        if (!m81Var.d()) {
            m81Var.c = l5.d;
            m81Var.e = 0;
            m81Var.f = 0;
            m81Var.j = 0L;
        }
        return r.h(m81Var);
    }

    public Object writeReplace() {
        return ByteString.wrap(toByteArray());
    }

    @Override // com.explorestack.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
    public final Iterator<Byte> iterator2() {
        return new p7(this);
    }

    @Override // com.explorestack.protobuf.ByteString
    public final void writeTo(l lVar) throws IOException {
        this.b.writeTo(lVar);
        this.c.writeTo(lVar);
    }
}
