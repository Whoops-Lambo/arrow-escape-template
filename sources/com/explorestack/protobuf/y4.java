package com.explorestack.protobuf;

import defpackage.e32;
import defpackage.vq2;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class y4 extends AbstractMessage implements Serializable {
    protected static boolean alwaysUseFieldBuilders = false;
    private static final long serialVersionUID = 1;
    protected s8 unknownFields;

    public static Object access$1100(Method method, Object obj, Object[] objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            vq2.n("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            vq2.n("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static h3 access$500(i3 i3Var) {
        throw null;
    }

    public static void enableAlwaysUseFieldBuildersForTesting() {
        setAlwaysUseFieldBuildersForTesting(true);
    }

    public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
        return Collections.unmodifiableMap(b(false));
    }

    public Map<Descriptors.FieldDescriptor, Object> getAllFieldsRaw() {
        return Collections.unmodifiableMap(b(true));
    }

    public abstract w4 internalGetFieldAccessorTable();

    public void makeExtensionsImmutable() {
    }

    public abstract Message.Builder newBuilderForType(h4 h4Var);

    public abstract Object newInstance(x4 x4Var);

    public static boolean canUseUnsafe() {
        return c9.e && c9.d;
    }

    public static int computeStringSize(int i, Object obj) {
        if (!(obj instanceof String)) {
            return w.d(i, (ByteString) obj);
        }
        return w.r((String) obj) + w.s(i);
    }

    public static int computeStringSizeNoTag(Object obj) {
        return obj instanceof String ? w.r((String) obj) : w.e((ByteString) obj);
    }

    public static a5 emptyBooleanList() {
        return j.d;
    }

    public static b5 emptyDoubleList() {
        return c3.d;
    }

    public static f5 emptyFloatList() {
        return a4.d;
    }

    public static g5 emptyIntList() {
        return z4.d;
    }

    public static j5 emptyLongList() {
        return x5.d;
    }

    public static a5 newBooleanList() {
        return new j(new boolean[10], 0);
    }

    public static b5 newDoubleList() {
        return new c3(new double[10], 0);
    }

    public static f5 newFloatList() {
        return new a4(new float[10], 0);
    }

    public static g5 newIntList() {
        return new z4(new int[10], 0);
    }

    public static j5 newLongList() {
        return new x5(new long[10], 0);
    }

    public static void setAlwaysUseFieldBuildersForTesting(boolean z) {
        alwaysUseFieldBuilders = z;
    }

    public static void writeString(w wVar, int i, Object obj) throws IOException {
        if (obj instanceof String) {
            wVar.Q(i, (String) obj);
        } else {
            wVar.C(i, (ByteString) obj);
        }
    }

    public static void writeStringNoTag(w wVar, Object obj) throws IOException {
        if (obj instanceof String) {
            wVar.R((String) obj);
        } else {
            wVar.D((ByteString) obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    public final TreeMap b(boolean z) {
        TreeMap treeMap = new TreeMap();
        List<Descriptors.FieldDescriptor> fields = internalGetFieldAccessorTable().a.getFields();
        int fieldCount = 0;
        while (fieldCount < fields.size()) {
            Descriptors.FieldDescriptor oneofFieldDescriptor = fields.get(fieldCount);
            Descriptors.OneofDescriptor containingOneof = oneofFieldDescriptor.getContainingOneof();
            if (containingOneof != null) {
                fieldCount += containingOneof.getFieldCount() - 1;
                if (hasOneof(containingOneof)) {
                    oneofFieldDescriptor = getOneofFieldDescriptor(containingOneof);
                    if (z || oneofFieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.STRING) {
                        treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                    } else {
                        treeMap.put(oneofFieldDescriptor, getFieldRaw(oneofFieldDescriptor));
                    }
                }
            } else if (oneofFieldDescriptor.isRepeated()) {
                List list = (List) getField(oneofFieldDescriptor);
                if (!list.isEmpty()) {
                    treeMap.put(oneofFieldDescriptor, list);
                }
            } else if (hasField(oneofFieldDescriptor)) {
                if (z) {
                    treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                } else {
                    treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                }
            }
            fieldCount++;
        }
        return treeMap;
    }

    public k6 internalGetMapField(int i) {
        throw new RuntimeException("No map fields found in ".concat(getClass().getName()));
    }

    public void mergeFromAndMakeImmutableInternal(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
        i7 i7Var = i7.c;
        i7Var.getClass();
        t7 t7VarA = i7Var.a(getClass());
        try {
            s sVar = rVar.b;
            if (sVar == null) {
                sVar = new s(rVar);
            }
            t7VarA.a(this, sVar, o3Var);
            t7VarA.b(this);
            throw null;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(this);
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
        }
    }

    @Override // com.explorestack.protobuf.AbstractMessage
    public Message.Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
        return newBuilderForType((h4) new e4(builderParent));
    }

    public Object writeReplace() throws ObjectStreamException {
        return new c4(this);
    }

    public y4(g4 g4Var) {
        this.unknownFields = g4Var.getUnknownFields();
    }

    public static Method access$1000(Class cls, String str, Class[] clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            io.p071bidmachine.media3.extractor.ts.y.h(cls.getName(), str, e);
            return null;
        }
    }

    public static void c(w wVar, Map map, d6 d6Var, int i) {
        for (Map.Entry entry : map.entrySet()) {
            a6 a6VarD = d6Var.newBuilderForType();
            a6VarD.b = entry.getKey();
            a6VarD.d = true;
            a6VarD.c = entry.getValue();
            a6VarD.e = true;
            wVar.M(i, a6VarD.build());
        }
    }

    public static g5 mutableCopy(g5 g5Var) {
        int i;
        int size = g5Var.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size * 2;
        }
        z4 z4Var = (z4) g5Var;
        if (i >= z4Var.c) {
            return new z4(Arrays.copyOf(z4Var.b, i), z4Var.c);
        }
        e32.a();
        return null;
    }

    public static <M extends Message> M parseDelimitedWithIOException(g7 g7Var, InputStream inputStream) throws IOException {
        try {
            return (M) g7Var.parseDelimitedFrom(inputStream);
        } catch (InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
        }
    }

    public static <M extends Message> M parseWithIOException(g7 g7Var, InputStream inputStream) throws IOException {
        try {
            return (M) g7Var.parseFrom(inputStream);
        } catch (InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
        }
    }

    public static <V> void serializeBooleanMapTo(w wVar, k6 k6Var, d6 d6Var, int i) throws IOException {
        Map mapH = k6Var.h();
        wVar.getClass();
        c(wVar, mapH, d6Var, i);
    }

    public static <V> void serializeIntegerMapTo(w wVar, k6 k6Var, d6 d6Var, int i) throws IOException {
        Map mapH = k6Var.h();
        wVar.getClass();
        c(wVar, mapH, d6Var, i);
    }

    public static <V> void serializeLongMapTo(w wVar, k6 k6Var, d6 d6Var, int i) throws IOException {
        Map mapH = k6Var.h();
        wVar.getClass();
        c(wVar, mapH, d6Var, i);
    }

    public static <V> void serializeStringMapTo(w wVar, k6 k6Var, d6 d6Var, int i) throws IOException {
        Map mapH = k6Var.h();
        wVar.getClass();
        c(wVar, mapH, d6Var, i);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return internalGetFieldAccessorTable().a;
    }

    public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        return w4.b(internalGetFieldAccessorTable(), fieldDescriptor).k(this);
    }

    public Object getFieldRaw(Descriptors.FieldDescriptor fieldDescriptor) {
        return w4.b(internalGetFieldAccessorTable(), fieldDescriptor).l(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
        m4 m4VarA = w4.a(internalGetFieldAccessorTable(), oneofDescriptor);
        Descriptors.FieldDescriptor fieldDescriptor = m4VarA.e;
        if (fieldDescriptor != null) {
            if (hasField(fieldDescriptor)) {
                return fieldDescriptor;
            }
            return null;
        }
        int number = ((c5) access$1100(m4VarA.b, this, new Object[0])).getNumber();
        if (number > 0) {
            return m4VarA.a.findFieldByNumber(number);
        }
        return null;
    }

    public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i) {
        return w4.b(internalGetFieldAccessorTable(), fieldDescriptor).d(i, this);
    }

    public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
        return w4.b(internalGetFieldAccessorTable(), fieldDescriptor).g(this);
    }

    public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        return w4.b(internalGetFieldAccessorTable(), fieldDescriptor).e(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageOrBuilder
    public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        m4 m4VarA = w4.a(internalGetFieldAccessorTable(), oneofDescriptor);
        Descriptors.FieldDescriptor fieldDescriptor = m4VarA.e;
        if (fieldDescriptor != null) {
            return hasField(fieldDescriptor);
        }
        if (((c5) access$1100(m4VarA.b, this, new Object[0])).getNumber() == 0) {
            return false;
        }
        return true;
    }

    public boolean parseUnknownField(r rVar, p8 p8Var, o3 o3Var, int i) throws IOException {
        rVar.getClass();
        return p8Var.e(i, rVar);
    }

    public boolean parseUnknownFieldProto3(r rVar, p8 p8Var, o3 o3Var, int i) throws IOException {
        return parseUnknownField(rVar, p8Var, o3Var, i);
    }

    public y4() {
        this.unknownFields = s8.c;
    }

    public static <M extends Message> M parseDelimitedWithIOException(g7 g7Var, InputStream inputStream, o3 o3Var) throws IOException {
        try {
            return (M) g7Var.parseDelimitedFrom(inputStream, o3Var);
        } catch (InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
        }
    }

    public static <M extends Message> M parseWithIOException(g7 g7Var, InputStream inputStream, o3 o3Var) throws IOException {
        try {
            return (M) g7Var.parseFrom(inputStream, o3Var);
        } catch (InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
        }
    }

    public static <M extends Message> M parseWithIOException(g7 g7Var, r rVar) throws IOException {
        try {
            return (M) g7Var.parseFrom(rVar);
        } catch (InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
        }
    }

    public static <M extends Message> M parseWithIOException(g7 g7Var, r rVar, o3 o3Var) throws IOException {
        try {
            return (M) g7Var.parseFrom(rVar, o3Var);
        } catch (InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
        }
    }

    public static j5 mutableCopy(j5 j5Var) {
        int size = j5Var.size();
        int i = size == 0 ? 10 : size * 2;
        x5 x5Var = (x5) j5Var;
        if (i >= x5Var.c) {
            return new x5(Arrays.copyOf(x5Var.b, i), x5Var.c);
        }
        e32.a();
        return null;
    }

    public static f5 mutableCopy(f5 f5Var) {
        int size = f5Var.size();
        int i = size == 0 ? 10 : size * 2;
        a4 a4Var = (a4) f5Var;
        if (i >= a4Var.c) {
            return new a4(Arrays.copyOf(a4Var.b, i), a4Var.c);
        }
        e32.a();
        return null;
    }

    public static b5 mutableCopy(b5 b5Var) {
        int size = b5Var.size();
        int i = size == 0 ? 10 : size * 2;
        c3 c3Var = (c3) b5Var;
        if (i >= c3Var.c) {
            return new c3(Arrays.copyOf(c3Var.b, i), c3Var.c);
        }
        e32.a();
        return null;
    }

    public static a5 mutableCopy(a5 a5Var) {
        int size = a5Var.size();
        int i = size == 0 ? 10 : size * 2;
        j jVar = (j) a5Var;
        if (i >= jVar.c) {
            return new j(Arrays.copyOf(jVar.b, i), jVar.c);
        }
        e32.a();
        return null;
    }
}
