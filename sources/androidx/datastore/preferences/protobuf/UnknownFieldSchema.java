package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@CheckReturnValue
abstract class UnknownFieldSchema<T, B> {
    public abstract void a(int i, int i2, Object obj);

    public abstract void b(int i, long j, Object obj);

    public abstract void c(int i, Object obj, Object obj2);

    public abstract void d(Object obj, int i, ByteString byteString);

    public abstract void e(int i, long j, Object obj);

    public abstract UnknownFieldSetLite f(Object obj);

    public abstract UnknownFieldSetLite g(Object obj);

    public abstract int h(Object obj);

    public abstract int i(Object obj);

    public abstract void j(Object obj);

    public abstract UnknownFieldSetLite k(Object obj, Object obj2);

    public abstract UnknownFieldSetLite m();

    public abstract void n(Object obj, Object obj2);

    public abstract void o(Object obj, Object obj2);

    public abstract UnknownFieldSetLite p(Object obj);

    public abstract void q(Object obj, Writer writer);

    public abstract void r(Object obj, Writer writer);

    public final boolean l(int i, Reader reader, Object obj) throws InvalidProtocolBufferException {
        int tag = reader.getTag();
        int i2 = tag >>> 3;
        int i3 = tag & 7;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 == 5) {
                                a(i2, reader.C(), obj);
                                return true;
                            }
                            throw InvalidProtocolBufferException.i();
                        }
                        return false;
                    }
                    UnknownFieldSetLite unknownFieldSetLiteM = m();
                    int i4 = 4 | (i2 << 3);
                    int i5 = i + 1;
                    if (i5 < 100) {
                        while (reader.m() != Integer.MAX_VALUE && l(i5, reader, unknownFieldSetLiteM)) {
                        }
                        if (i4 == reader.getTag()) {
                            c(i2, obj, p(unknownFieldSetLiteM));
                            return true;
                        }
                        throw InvalidProtocolBufferException.f();
                    }
                    throw InvalidProtocolBufferException.o();
                }
                d(obj, i2, reader.g());
                return true;
            }
            b(i2, reader.s(), obj);
            return true;
        }
        e(i2, reader.r(), obj);
        return true;
    }
}
