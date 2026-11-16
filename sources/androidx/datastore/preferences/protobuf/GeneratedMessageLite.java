package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder;
import defpackage.d;
import defpackage.dr0;
import defpackage.e32;
import defpackage.h50;
import defpackage.pv1;
import defpackage.vq2;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected UnknownFieldSetLite unknownFields;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class Builder<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite.Builder<MessageType, BuilderType> {
        public final GeneratedMessageLite a;
        public GeneratedMessageLite b;

        public static void k(Object obj, Object obj2) {
            Protobuf protobuf = Protobuf.c;
            protobuf.getClass();
            protobuf.a(obj.getClass()).a(obj, obj2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: c */
        public final Builder clone() {
            Builder builder = (Builder) this.a.h(MethodToInvoke.e, null);
            builder.b = buildPartial();
            return builder;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder
        public final Object clone() {
            Builder builder = (Builder) this.a.h(MethodToInvoke.e, null);
            builder.b = buildPartial();
            return builder;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public GeneratedMessageLite buildPartial() {
            boolean zM = this.b.m();
            GeneratedMessageLite generatedMessageLite = this.b;
            if (!zM) {
                return generatedMessageLite;
            }
            generatedMessageLite.getClass();
            Protobuf protobuf = Protobuf.c;
            protobuf.getClass();
            protobuf.a(generatedMessageLite.getClass()).b(generatedMessageLite);
            generatedMessageLite.n();
            return this.b;
        }

        public final void g() {
            if (this.b.m()) {
                return;
            }
            i();
        }

        public void i() {
            GeneratedMessageLite generatedMessageLiteP = this.a.p();
            k(generatedMessageLiteP, this.b);
            this.b = generatedMessageLiteP;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return GeneratedMessageLite.l(this.b, false);
        }

        public final void j(GeneratedMessageLite generatedMessageLite) {
            if (this.a.equals(generatedMessageLite)) {
                return;
            }
            g();
            k(this.b, generatedMessageLite);
        }

        public Builder(GeneratedMessageLite generatedMessageLite) {
            this.a = generatedMessageLite;
            if (!generatedMessageLite.m()) {
                this.b = generatedMessageLite.p();
            } else {
                d.r("Default instance must be immutable.");
                throw null;
            }
        }

        public final GeneratedMessageLite e() {
            GeneratedMessageLite generatedMessageLiteBuildPartial = buildPartial();
            generatedMessageLiteBuildPartial.getClass();
            if (GeneratedMessageLite.l(generatedMessageLiteBuildPartial, true)) {
                return generatedMessageLiteBuildPartial;
            }
            throw new UninitializedMessageException(generatedMessageLiteBuildPartial);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class DefaultInstanceBasedParser<T extends GeneratedMessageLite<T, ?>> extends AbstractParser<T> {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        public final MessageLite buildPartial() {
            boolean zM = ((ExtendableMessage) this.b).m();
            GeneratedMessageLite generatedMessageLite = this.b;
            if (!zM) {
                return (ExtendableMessage) generatedMessageLite;
            }
            ((ExtendableMessage) generatedMessageLite).extensions.j();
            return (ExtendableMessage) super.buildPartial();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder
        /* JADX INFO: renamed from: f */
        public final GeneratedMessageLite buildPartial() {
            boolean zM = ((ExtendableMessage) this.b).m();
            GeneratedMessageLite generatedMessageLite = this.b;
            if (!zM) {
                return (ExtendableMessage) generatedMessageLite;
            }
            ((ExtendableMessage) generatedMessageLite).extensions.j();
            return (ExtendableMessage) super.buildPartial();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder
        public final void i() {
            super.i();
            GeneratedMessageLite generatedMessageLite = this.b;
            if (((ExtendableMessage) generatedMessageLite).extensions != FieldSet.d) {
                ((ExtendableMessage) generatedMessageLite).extensions = ((ExtendableMessage) generatedMessageLite).extensions.clone();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected FieldSet<ExtensionDescriptor> extensions = FieldSet.d;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class ExtensionWriter {
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
        public final GeneratedMessageLite a() {
            return (GeneratedMessageLite) h(MethodToInvoke.f, null);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.MessageLite
        public final Builder newBuilderForType() {
            return (Builder) h(MethodToInvoke.e, null);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.MessageLite
        public final Builder toBuilder() {
            Builder builder = (Builder) h(MethodToInvoke.e, null);
            builder.j(this);
            return builder;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends MessageLiteOrBuilder {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class ExtensionDescriptor implements FieldSet.FieldDescriptorLite<ExtensionDescriptor> {
        public final WireFormat.FieldType a;

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final boolean isPacked() {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final boolean isRepeated() {
            return false;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((ExtensionDescriptor) obj).getClass();
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final WireFormat.JavaType getLiteJavaType() {
            return this.a.a;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final WireFormat.FieldType getLiteType() {
            return this.a;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final int getNumber() {
            return 1001;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final Builder o(MessageLite.Builder builder, MessageLite messageLite) {
            Builder builder2 = (Builder) builder;
            builder2.j((GeneratedMessageLite) messageLite);
            return builder2;
        }

        public ExtensionDescriptor(WireFormat.FieldType fieldType) {
            this.a = fieldType;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class MethodToInvoke {
        public static final MethodToInvoke a;
        public static final MethodToInvoke b;
        public static final MethodToInvoke c;
        public static final MethodToInvoke d;
        public static final MethodToInvoke e;
        public static final MethodToInvoke f;
        public static final /* synthetic */ MethodToInvoke[] g;

        static {
            MethodToInvoke methodToInvoke = new MethodToInvoke("GET_MEMOIZED_IS_INITIALIZED", 0);
            a = methodToInvoke;
            MethodToInvoke methodToInvoke2 = new MethodToInvoke("SET_MEMOIZED_IS_INITIALIZED", 1);
            b = methodToInvoke2;
            MethodToInvoke methodToInvoke3 = new MethodToInvoke("BUILD_MESSAGE_INFO", 2);
            c = methodToInvoke3;
            MethodToInvoke methodToInvoke4 = new MethodToInvoke("NEW_MUTABLE_INSTANCE", 3);
            d = methodToInvoke4;
            MethodToInvoke methodToInvoke5 = new MethodToInvoke("NEW_BUILDER", 4);
            e = methodToInvoke5;
            MethodToInvoke methodToInvoke6 = new MethodToInvoke("GET_DEFAULT_INSTANCE", 5);
            f = methodToInvoke6;
            g = new MethodToInvoke[]{methodToInvoke, methodToInvoke2, methodToInvoke3, methodToInvoke4, methodToInvoke5, methodToInvoke6, new MethodToInvoke("GET_PARSER", 6)};
        }

        public static MethodToInvoke valueOf(String str) {
            return (MethodToInvoke) java.lang.Enum.valueOf(MethodToInvoke.class, str);
        }

        public static MethodToInvoke[] values() {
            return (MethodToInvoke[]) g.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class SerializedForm implements Serializable {
        public Object readResolve() throws ObjectStreamException {
            try {
                java.lang.reflect.Field declaredField = Class.forName(null).getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                ((MessageLite) declaredField.get(null)).newBuilderForType().getClass();
                throw null;
            } catch (InvalidProtocolBufferException e) {
                throw new RuntimeException("Unable to understand proto buffer", e);
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("Unable to find proto buffer class: null", e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Unable to call parsePartialFrom", e3);
            } catch (NoSuchFieldException e4) {
                throw new RuntimeException("Unable to find DEFAULT_INSTANCE in null", e4);
            } catch (SecurityException e5) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in null", e5);
            }
        }
    }

    public static Object k(java.lang.reflect.Method method, GeneratedMessageLite generatedMessageLite, Object... objArr) {
        try {
            return method.invoke(generatedMessageLite, objArr);
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

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final int getSerializedSize() {
        return e(null);
    }

    public abstract Object h(MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite);

    @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return l(this, true);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            a = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class GeneratedExtension<ContainingType extends MessageLite, Type> extends ExtensionLite<ContainingType, Type> {
        public final MessageLite a;
        public final ExtensionDescriptor b;

        public GeneratedExtension(DescriptorProtos.FeatureSet featureSet, JavaFeaturesProto.JavaFeatures javaFeatures, JavaFeaturesProto.JavaFeatures javaFeatures2, ExtensionDescriptor extensionDescriptor) {
            if (featureSet != null) {
                if (extensionDescriptor.a == WireFormat.FieldType.m && javaFeatures2 == null) {
                    d.r("Null messageDefaultInstance");
                    throw null;
                }
                this.a = javaFeatures2;
                this.b = extensionDescriptor;
                return;
            }
            d.r("Null containingTypeDefaultInstance");
            throw null;
        }
    }

    public static Internal.ProtobufList i() {
        return ProtobufArrayList.d;
    }

    public static GeneratedMessageLite j(Class cls) {
        GeneratedMessageLite<?, ?> generatedMessageLite = defaultInstanceMap.get(cls);
        if (generatedMessageLite == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                dr0.l("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (generatedMessageLite != null) {
            return generatedMessageLite;
        }
        GeneratedMessageLite<?, ?> generatedMessageLite2 = (GeneratedMessageLite) ((GeneratedMessageLite) UnsafeUtil.c(cls)).h(MethodToInvoke.f, null);
        if (generatedMessageLite2 != null) {
            defaultInstanceMap.put(cls, generatedMessageLite2);
            return generatedMessageLite2;
        }
        y.b();
        return null;
    }

    public static final boolean l(GeneratedMessageLite generatedMessageLite, boolean z) {
        byte bByteValue = ((Byte) generatedMessageLite.h(MethodToInvoke.a, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        Protobuf protobuf = Protobuf.c;
        protobuf.getClass();
        boolean zD = protobuf.a(generatedMessageLite.getClass()).d(generatedMessageLite);
        if (z) {
            generatedMessageLite.h(MethodToInvoke.b, zD ? generatedMessageLite : null);
        }
        return zD;
    }

    public static Object o(GeneratedMessageLite generatedMessageLite, String str, Object[] objArr) {
        return new RawMessageInfo(generatedMessageLite, str, objArr);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
    public GeneratedMessageLite a() {
        return (GeneratedMessageLite) h(MethodToInvoke.f, null);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final void b(CodedOutputStream codedOutputStream) {
        Protobuf protobuf = Protobuf.c;
        protobuf.getClass();
        Schema schemaA = protobuf.a(getClass());
        CodedOutputStreamWriter codedOutputStreamWriter = codedOutputStream.a;
        if (codedOutputStreamWriter == null) {
            codedOutputStreamWriter = new CodedOutputStreamWriter(codedOutputStream);
        }
        schemaA.f(this, codedOutputStreamWriter);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite
    public final int d() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Protobuf protobuf = Protobuf.c;
        protobuf.getClass();
        return protobuf.a(getClass()).g(this, (GeneratedMessageLite) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite
    public final void f(int i) {
        if (i < 0) {
            e32.i(pv1.k(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        }
    }

    public final boolean m() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void n() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public Builder newBuilderForType() {
        return (Builder) h(MethodToInvoke.e, null);
    }

    public final GeneratedMessageLite p() {
        return (GeneratedMessageLite) h(MethodToInvoke.d, null);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public Builder toBuilder() {
        Builder builder = (Builder) h(MethodToInvoke.e, null);
        builder.j(this);
        return builder;
    }

    public GeneratedMessageLite() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = UnknownFieldSetLite.f;
    }

    public static GeneratedMessageLite q(GeneratedMessageLite generatedMessageLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        GeneratedMessageLite generatedMessageLiteP = generatedMessageLite.p();
        try {
            Protobuf protobuf = Protobuf.c;
            protobuf.getClass();
            Schema schemaA = protobuf.a(generatedMessageLiteP.getClass());
            CodedInputStreamReader codedInputStreamReader = codedInputStream.b;
            if (codedInputStreamReader == null) {
                codedInputStreamReader = new CodedInputStreamReader(codedInputStream);
            }
            schemaA.h(generatedMessageLiteP, codedInputStreamReader, extensionRegistryLite);
            schemaA.b(generatedMessageLiteP);
            return generatedMessageLiteP;
        } catch (InvalidProtocolBufferException e) {
            e = e;
            if (e.d()) {
                e = new InvalidProtocolBufferException(e);
            }
            throw e.r(generatedMessageLiteP);
        } catch (UninitializedMessageException e2) {
            throw e2.d().r(generatedMessageLiteP);
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3).r(generatedMessageLiteP);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    public static void r(Class cls, GeneratedMessageLite generatedMessageLite) {
        generatedMessageLite.n();
        defaultInstanceMap.put(cls, generatedMessageLite);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite
    public final int e(Schema schema) {
        int iE;
        int iE2;
        if (m()) {
            if (schema == null) {
                Protobuf protobuf = Protobuf.c;
                protobuf.getClass();
                iE2 = protobuf.a(getClass()).e(this);
            } else {
                iE2 = schema.e(this);
            }
            if (iE2 >= 0) {
                return iE2;
            }
            e32.i(pv1.k(iE2, "serialized size must be non-negative, was "));
            return 0;
        }
        if (d() != Integer.MAX_VALUE) {
            return d();
        }
        if (schema == null) {
            Protobuf protobuf2 = Protobuf.c;
            protobuf2.getClass();
            iE = protobuf2.a(getClass()).e(this);
        } else {
            iE = schema.e(this);
        }
        f(iE);
        return iE;
    }

    public final int hashCode() {
        if (m()) {
            Protobuf protobuf = Protobuf.c;
            protobuf.getClass();
            return protobuf.a(getClass()).i(this);
        }
        if (this.memoizedHashCode == 0) {
            Protobuf protobuf2 = Protobuf.c;
            protobuf2.getClass();
            this.memoizedHashCode = protobuf2.a(getClass()).i(this);
        }
        return this.memoizedHashCode;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = MessageLiteToString.a;
        StringBuilder sbQ = h50.q("# ", string);
        MessageLiteToString.c(this, sbQ, 0);
        return sbQ.toString();
    }
}
