package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite;
import defpackage.d;
import defpackage.e32;
import defpackage.wb0;
import io.p071bidmachine.media3.extractor.ts.y;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
final class FieldSet<T extends FieldDescriptorLite<T>> {
    public static final FieldSet d = new FieldSet(0);
    public final SmallSortedMap.AnonymousClass1 a = SmallSortedMap.g();
    public boolean b;
    public boolean c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder<T extends FieldDescriptorLite<T>> {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();

        GeneratedMessageLite.Builder o(MessageLite.Builder builder, MessageLite messageLite);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.FieldSet$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            b = iArr;
            try {
                iArr[WireFormat.FieldType.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[WireFormat.FieldType.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[WireFormat.FieldType.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[WireFormat.FieldType.f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[WireFormat.FieldType.g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[WireFormat.FieldType.h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[WireFormat.FieldType.i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[WireFormat.FieldType.j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[WireFormat.FieldType.l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[WireFormat.FieldType.m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[WireFormat.FieldType.k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[WireFormat.FieldType.n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[WireFormat.FieldType.o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[WireFormat.FieldType.q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[WireFormat.FieldType.r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[WireFormat.FieldType.s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[WireFormat.FieldType.t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[WireFormat.FieldType.p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            a = iArr2;
            try {
                WireFormat.JavaType javaType = WireFormat.JavaType.INT;
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                int[] iArr3 = a;
                WireFormat.JavaType javaType2 = WireFormat.JavaType.INT;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                int[] iArr4 = a;
                WireFormat.JavaType javaType3 = WireFormat.JavaType.INT;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                int[] iArr5 = a;
                WireFormat.JavaType javaType4 = WireFormat.JavaType.INT;
                iArr5[3] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                int[] iArr6 = a;
                WireFormat.JavaType javaType5 = WireFormat.JavaType.INT;
                iArr6[4] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                int[] iArr7 = a;
                WireFormat.JavaType javaType6 = WireFormat.JavaType.INT;
                iArr7[5] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public static void n(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) {
        if (fieldType == WireFormat.FieldType.l) {
            codedOutputStream.p0(i, 3);
            ((MessageLite) obj).b(codedOutputStream);
            codedOutputStream.p0(i, 4);
        }
        codedOutputStream.p0(i, fieldType.b);
        switch (fieldType.ordinal()) {
            case 0:
                codedOutputStream.h0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                codedOutputStream.g0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                codedOutputStream.r0(((Long) obj).longValue());
                break;
            case 3:
                codedOutputStream.r0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.i0(((Integer) obj).intValue());
                break;
            case 5:
                codedOutputStream.h0(((Long) obj).longValue());
                break;
            case 6:
                codedOutputStream.g0(((Integer) obj).intValue());
                break;
            case 7:
                codedOutputStream.d0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.o0((String) obj);
                } else {
                    codedOutputStream.f0((ByteString) obj);
                }
                break;
            case 9:
                ((MessageLite) obj).b(codedOutputStream);
                break;
            case 10:
                codedOutputStream.l0((MessageLite) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    byte[] bArr = (byte[]) obj;
                    codedOutputStream.e0(bArr.length, bArr);
                } else {
                    codedOutputStream.f0((ByteString) obj);
                }
                break;
            case 12:
                codedOutputStream.q0(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof Internal.EnumLite)) {
                    codedOutputStream.i0(((Integer) obj).intValue());
                } else {
                    codedOutputStream.i0(((Internal.EnumLite) obj).getNumber());
                }
                break;
            case 14:
                codedOutputStream.g0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.h0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.q0(CodedOutputStream.a0(((Integer) obj).intValue()));
                break;
            case 17:
                codedOutputStream.r0(CodedOutputStream.b0(((Long) obj).longValue()));
                break;
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final FieldSet clone() {
        FieldSet fieldSet = new FieldSet();
        SmallSortedMap.AnonymousClass1 anonymousClass1 = this.a;
        int size = anonymousClass1.a.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entryC = anonymousClass1.c(i);
            fieldSet.l((FieldDescriptorLite) entryC.getKey(), entryC.getValue());
        }
        for (Map.Entry entry : anonymousClass1.d()) {
            fieldSet.l((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        fieldSet.c = this.c;
        return fieldSet;
    }

    public final Object e(FieldDescriptorLite fieldDescriptorLite) {
        Object obj = this.a.get(fieldDescriptorLite);
        return obj instanceof LazyField ? ((LazyField) obj).a(null) : obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FieldSet) {
            return this.a.equals(((FieldSet) obj).a);
        }
        return false;
    }

    public final boolean g() {
        SmallSortedMap.AnonymousClass1 anonymousClass1 = this.a;
        int size = anonymousClass1.a.size();
        for (int i = 0; i < size; i++) {
            if (!h(anonymousClass1.c(i))) {
                return false;
            }
        }
        Iterator it = anonymousClass1.d().iterator();
        while (it.hasNext()) {
            if (!h((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Iterator i() {
        SmallSortedMap.AnonymousClass1 anonymousClass1 = this.a;
        if (anonymousClass1.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.c ? new LazyField.LazyIterator(((SmallSortedMap.EntrySet) anonymousClass1.entrySet()).iterator()) : ((SmallSortedMap.EntrySet) anonymousClass1.entrySet()).iterator();
    }

    public final void j() {
        if (this.b) {
            return;
        }
        SmallSortedMap.AnonymousClass1 anonymousClass1 = this.a;
        int size = anonymousClass1.a.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entryC = anonymousClass1.c(i);
            if (entryC.getValue() instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) entryC.getValue();
                generatedMessageLite.getClass();
                Protobuf protobuf = Protobuf.c;
                protobuf.getClass();
                protobuf.a(generatedMessageLite.getClass()).b(generatedMessageLite);
                generatedMessageLite.n();
            }
        }
        anonymousClass1.f();
        this.b = true;
    }

    public FieldSet(int i) {
        j();
        j();
    }

    public static int b(WireFormat.FieldType fieldType, int i, Object obj) {
        int iX = CodedOutputStream.X(i);
        if (fieldType == WireFormat.FieldType.l) {
            iX *= 2;
        }
        return iX + c(fieldType, obj);
    }

    public static int c(WireFormat.FieldType fieldType, Object obj) {
        int size;
        int iY;
        switch (fieldType.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = CodedOutputStream.b;
                return 8;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = CodedOutputStream.b;
                return 4;
            case 2:
                return CodedOutputStream.Z(((Long) obj).longValue());
            case 3:
                return CodedOutputStream.Z(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.Z(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = CodedOutputStream.b;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = CodedOutputStream.b;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = CodedOutputStream.b;
                return 1;
            case 8:
                if (obj instanceof ByteString) {
                    Logger logger6 = CodedOutputStream.b;
                    size = ((ByteString) obj).size();
                    iY = CodedOutputStream.Y(size);
                } else {
                    return CodedOutputStream.W((String) obj);
                }
                break;
            case 9:
                Logger logger7 = CodedOutputStream.b;
                return ((MessageLite) obj).getSerializedSize();
            case 10:
                if (obj instanceof LazyField) {
                    return CodedOutputStream.T((LazyField) obj);
                }
                Logger logger8 = CodedOutputStream.b;
                size = ((MessageLite) obj).getSerializedSize();
                iY = CodedOutputStream.Y(size);
                break;
                break;
            case 11:
                if (obj instanceof ByteString) {
                    Logger logger9 = CodedOutputStream.b;
                    size = ((ByteString) obj).size();
                    iY = CodedOutputStream.Y(size);
                } else {
                    Logger logger10 = CodedOutputStream.b;
                    size = ((byte[]) obj).length;
                    iY = CodedOutputStream.Y(size);
                }
                break;
            case 12:
                return CodedOutputStream.Y(((Integer) obj).intValue());
            case 13:
                if (obj instanceof Internal.EnumLite) {
                    return CodedOutputStream.Z(((Internal.EnumLite) obj).getNumber());
                }
                return CodedOutputStream.Z(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger11 = CodedOutputStream.b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger12 = CodedOutputStream.b;
                return 8;
            case 16:
                return CodedOutputStream.U(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.V(((Long) obj).longValue());
            default:
                y.j("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return iY + size;
    }

    public static int d(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            List list = (List) obj;
            int size = list.size();
            int i = 0;
            if (fieldDescriptorLite.isPacked()) {
                if (list.isEmpty()) {
                    return 0;
                }
                int iC = 0;
                while (i < size) {
                    iC += c(liteType, list.get(i));
                    i++;
                }
                return CodedOutputStream.Y(iC) + CodedOutputStream.X(number) + iC;
            }
            int iB = 0;
            while (i < size) {
                iB += b(liteType, number, list.get(i));
                i++;
            }
            return iB;
        }
        return b(liteType, number, obj);
    }

    public static int f(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (fieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !fieldDescriptorLite.isRepeated() && !fieldDescriptorLite.isPacked()) {
            if (value instanceof LazyField) {
                int number = ((FieldDescriptorLite) entry.getKey()).getNumber();
                return CodedOutputStream.T((LazyField) value) + CodedOutputStream.X(3) + CodedOutputStream.Y(number) + CodedOutputStream.X(2) + (CodedOutputStream.X(1) * 2);
            }
            int number2 = ((FieldDescriptorLite) entry.getKey()).getNumber();
            int iY = CodedOutputStream.Y(number2) + CodedOutputStream.X(2) + (CodedOutputStream.X(1) * 2);
            int iX = CodedOutputStream.X(3);
            int serializedSize = ((MessageLite) value).getSerializedSize();
            return CodedOutputStream.Y(serializedSize) + serializedSize + iX + iY;
        }
        return d(fieldDescriptorLite, value);
    }

    public static boolean h(Map.Entry entry) {
        boolean zIsInitialized;
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        if (fieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            if (fieldDescriptorLite.isRepeated()) {
                List list = (List) entry.getValue();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj = list.get(i);
                    if (obj instanceof MessageLiteOrBuilder) {
                        zIsInitialized = ((MessageLiteOrBuilder) obj).isInitialized();
                    } else if (obj instanceof LazyField) {
                        zIsInitialized = true;
                    } else {
                        d.r("Wrong object type used with protocol message reflection.");
                        return false;
                    }
                    if (!zIsInitialized) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof MessageLiteOrBuilder) {
                    return ((MessageLiteOrBuilder) value).isInitialized();
                }
                if (value instanceof LazyField) {
                    return true;
                }
                d.r("Wrong object type used with protocol message reflection.");
                return false;
            }
        }
        return true;
    }

    public static void m(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        fieldDescriptorLite.getLiteType();
        Charset charset = Internal.a;
        obj.getClass();
        boolean z = true;
        switch (r0.a) {
            case INT:
                z = obj instanceof Integer;
                break;
            case LONG:
                z = obj instanceof Long;
                break;
            case FLOAT:
                z = obj instanceof Float;
                break;
            case DOUBLE:
                z = obj instanceof Double;
                break;
            case BOOLEAN:
                z = obj instanceof Boolean;
                break;
            case STRING:
                z = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof ByteString) && !(obj instanceof byte[])) {
                    z = false;
                }
                break;
            case ENUM:
                if (!(obj instanceof Integer) && !(obj instanceof Internal.EnumLite)) {
                    z = false;
                }
                break;
            case MESSAGE:
                if (!(obj instanceof MessageLite) && !(obj instanceof LazyField)) {
                    z = false;
                }
                break;
            default:
                z = false;
                break;
        }
        if (z) {
            return;
        }
        wb0.g("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(fieldDescriptorLite.getNumber()), fieldDescriptorLite.getLiteType().a, obj.getClass().getName()});
    }

    public final void k(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof LazyField;
        boolean zIsRepeated = fieldDescriptorLite.isRepeated();
        SmallSortedMap.AnonymousClass1 anonymousClass1 = this.a;
        if (zIsRepeated) {
            if (!z) {
                Object objE = e(fieldDescriptorLite);
                if (objE == null) {
                    objE = new ArrayList();
                }
                for (Object obj : (List) value) {
                    List list = (List) objE;
                    if (obj instanceof byte[]) {
                        byte[] bArr = (byte[]) obj;
                        byte[] bArr2 = new byte[bArr.length];
                        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                        obj = bArr2;
                    }
                    list.add(obj);
                }
                anonymousClass1.put(fieldDescriptorLite, objE);
                return;
            }
            e32.i("Lazy fields can not be repeated");
            return;
        }
        if (fieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            Object objE2 = e(fieldDescriptorLite);
            if (objE2 == null) {
                if (value instanceof byte[]) {
                    byte[] bArr3 = (byte[]) value;
                    byte[] bArr4 = new byte[bArr3.length];
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                    value = bArr4;
                }
                anonymousClass1.put(fieldDescriptorLite, value);
                if (z) {
                    this.c = true;
                    return;
                }
                return;
            }
            if (z) {
                value = ((LazyField) value).a(null);
            }
            anonymousClass1.put(fieldDescriptorLite, fieldDescriptorLite.o(((MessageLite) objE2).toBuilder(), (MessageLite) value).e());
            return;
        }
        if (!z) {
            if (value instanceof byte[]) {
                byte[] bArr5 = (byte[]) value;
                byte[] bArr6 = new byte[bArr5.length];
                System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
                value = bArr6;
            }
            anonymousClass1.put(fieldDescriptorLite, value);
            return;
        }
        e32.i("Lazy fields must be message-valued");
    }

    public final void l(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        if (fieldDescriptorLite.isRepeated()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    m(fieldDescriptorLite, obj2);
                }
                obj = arrayList;
            } else {
                d.r("Wrong object type used with protocol message reflection.");
                return;
            }
        } else {
            m(fieldDescriptorLite, obj);
        }
        if (obj instanceof LazyField) {
            this.c = true;
        }
        this.a.put(fieldDescriptorLite, obj);
    }

    public FieldSet() {
    }
}
