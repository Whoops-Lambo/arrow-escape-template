package com.explorestack.protobuf;

import defpackage.e32;
import defpackage.pv1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Struct extends y4 implements c8 {
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private k6 fields_;
    private byte memoizedIsInitialized;
    private static final Struct DEFAULT_INSTANCE = new Struct();
    private static final g7 PARSER = new d() { // from class: com.explorestack.protobuf.Struct.1
        @Override // com.explorestack.protobuf.g7
        public Struct parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
            return new Struct(rVar, o3Var);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder extends g4 implements c8 {
        private int bitField0_;
        private k6 fields_;

        private Builder() {
            super(null);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
        }

        @Override // com.explorestack.protobuf.g4
        public k6 internalGetMapField(int i) {
            if (i == 1) {
                return internalGetFields();
            }
            io.p071bidmachine.media3.extractor.ts.y.j(pv1.k(i, "Invalid map field number: "));
            return null;
        }

        @Override // com.explorestack.protobuf.g4
        public k6 internalGetMutableMapField(int i) {
            if (i == 1) {
                return internalGetMutableFields();
            }
            io.p071bidmachine.media3.extractor.ts.y.j(pv1.k(i, "Invalid map field number: "));
            return null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
            Struct struct = null;
            try {
                try {
                    Struct struct2 = (Struct) Struct.PARSER.parsePartialFrom(rVar, o3Var);
                    if (struct2 != null) {
                        mergeFrom(struct2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    Struct struct3 = (Struct) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        struct = struct3;
                        if (struct != null) {
                            mergeFrom(struct);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (struct != null) {
                    mergeFrom(struct);
                }
                throw th;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return d8.a;
        }

        private k6 internalGetFields() {
            k6 k6Var = this.fields_;
            return k6Var == null ? k6.e(FieldsDefaultEntryHolder.defaultEntry) : k6Var;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Struct buildPartial() {
            Struct struct = new Struct(this);
            struct.fields_ = internalGetFields();
            struct.fields_.a = false;
            onBuilt();
            return struct;
        }

        @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return d8.a;
        }

        @Override // com.explorestack.protobuf.g4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = d8.b;
            w4Var.c(Struct.class, Builder.class);
            return w4Var;
        }

        private k6 internalGetMutableFields() {
            onChanged();
            if (this.fields_ == null) {
                this.fields_ = k6.l(FieldsDefaultEntryHolder.defaultEntry);
            }
            if (!this.fields_.a) {
                this.fields_ = this.fields_.d();
            }
            return this.fields_;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Struct build() {
            Struct structBuildPartial = buildPartial();
            if (structBuildPartial.isInitialized()) {
                return structBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) structBuildPartial);
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            internalGetMutableFields().a();
            return this;
        }

        public Builder clearFields() {
            internalGetMutableFields().j().clear();
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo247clone() {
            return (Builder) super.mo247clone();
        }

        public boolean containsFields(String str) {
            str.getClass();
            return internalGetFields().h().containsKey(str);
        }

        @Deprecated
        public Map<String, Value> getFields() {
            return getFieldsMap();
        }

        public int getFieldsCount() {
            return internalGetFields().h().size();
        }

        public Map<String, Value> getFieldsMap() {
            return internalGetFields().h();
        }

        public Value getFieldsOrDefault(String str, Value value) {
            str.getClass();
            Map mapH = internalGetFields().h();
            if (mapH.containsKey(str)) {
                return (Value) mapH.get(str);
            }
            return value;
        }

        public Value getFieldsOrThrow(String str) {
            str.getClass();
            Map mapH = internalGetFields().h();
            if (mapH.containsKey(str)) {
                return (Value) mapH.get(str);
            }
            e32.a();
            return null;
        }

        @Deprecated
        public Map<String, Value> getMutableFields() {
            return internalGetMutableFields().j();
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(s8 s8Var) {
            return (Builder) super.mergeUnknownFields(s8Var);
        }

        public Builder putAllFields(Map<String, Value> map) {
            internalGetMutableFields().j().putAll(map);
            return this;
        }

        public Builder putFields(String str, Value value) {
            str.getClass();
            value.getClass();
            internalGetMutableFields().j().put(str, value);
            return this;
        }

        public Builder removeFields(String str) {
            str.getClass();
            internalGetMutableFields().j().remove(str);
            return this;
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            super.addRepeatedField(fieldDescriptor, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            super.clearField(fieldDescriptor);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Struct mo250getDefaultInstanceForType() {
            return Struct.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            super.setField(fieldDescriptor, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            super.setRepeatedField(fieldDescriptor, i, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.Message.Builder
        public final Builder setUnknownFields(s8 s8Var) {
            super.setUnknownFields(s8Var);
            return this;
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            super.clearOneof(oneofDescriptor);
            return this;
        }

        private Builder(h4 h4Var) {
            super(h4Var);
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Struct) {
                return mergeFrom((Struct) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Struct struct) {
            if (struct == Struct.getDefaultInstance()) {
                return this;
            }
            internalGetMutableFields().k(struct.internalGetFields());
            mergeUnknownFields(struct.unknownFields);
            onChanged();
            return this;
        }
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Struct)) {
            return super.equals(obj);
        }
        Struct struct = (Struct) obj;
        return internalGetFields().equals(struct.internalGetFields()) && this.unknownFields.equals(struct.unknownFields);
    }

    @Override // com.explorestack.protobuf.y4
    public k6 internalGetMapField(int i) {
        if (i == 1) {
            return internalGetFields();
        }
        io.p071bidmachine.media3.extractor.ts.y.j(pv1.k(i, "Invalid map field number: "));
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class FieldsDefaultEntryHolder {
        static final d6 defaultEntry = new d6(d8.c, l9.c, l9.e, Value.getDefaultInstance());

        private FieldsDefaultEntryHolder() {
        }
    }

    public static Struct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return d8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k6 internalGetFields() {
        k6 k6Var = this.fields_;
        return k6Var == null ? k6.e(FieldsDefaultEntryHolder.defaultEntry) : k6Var;
    }

    public static Builder newBuilder(Struct struct) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(struct);
    }

    public static Struct parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Struct) y4.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Struct) PARSER.parseFrom(byteBuffer);
    }

    public static g7 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public g7 getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iP = 0;
        for (Map.Entry entry : internalGetFields().h().entrySet()) {
            a6 a6VarNewBuilderForType = FieldsDefaultEntryHolder.defaultEntry.newBuilderForType();
            a6VarNewBuilderForType.b = entry.getKey();
            a6VarNewBuilderForType.d = true;
            a6VarNewBuilderForType.c = entry.getValue();
            a6VarNewBuilderForType.e = true;
            d6 d6VarBuild = a6VarNewBuilderForType.build();
            iP += w.p(d6VarBuild) + w.s(1);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iP;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final s8 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (!internalGetFields().h().isEmpty()) {
            iHashCode = pv1.c(iHashCode, 37, 1, 53) + internalGetFields().hashCode();
        }
        int iHashCode2 = this.unknownFields.a.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.y4
    public w4 internalGetFieldAccessorTable() {
        w4 w4Var = d8.b;
        w4Var.c(Struct.class, Builder.class);
        return w4Var;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.y4
    public Builder newBuilderForType(h4 h4Var) {
        return new Builder(h4Var);
    }

    @Override // com.explorestack.protobuf.y4
    public Object newInstance(x4 x4Var) {
        return new Struct();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    private Struct(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
        this();
        o3Var.getClass();
        p8 p8VarB = s8.b();
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int iF = rVar.F();
                        if (iF != 0) {
                            if (iF != 10) {
                                if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                }
                            } else {
                                if (!z2) {
                                    this.fields_ = k6.l(FieldsDefaultEntryHolder.defaultEntry);
                                    z2 = true;
                                }
                                d6 d6Var = (d6) rVar.v(FieldsDefaultEntryHolder.defaultEntry.c.f, o3Var);
                                this.fields_.j().put(d6Var.a, d6Var.b);
                            }
                        }
                        z = true;
                    } catch (IOException e) {
                        throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
                    }
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                this.unknownFields = p8VarB.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        this.unknownFields = p8VarB.build();
        makeExtensionsImmutable();
    }

    public boolean containsFields(String str) {
        str.getClass();
        return internalGetFields().h().containsKey(str);
    }

    @Deprecated
    public Map<String, Value> getFields() {
        return getFieldsMap();
    }

    public int getFieldsCount() {
        return internalGetFields().h().size();
    }

    public Map<String, Value> getFieldsMap() {
        return internalGetFields().h();
    }

    public Value getFieldsOrDefault(String str, Value value) {
        str.getClass();
        Map mapH = internalGetFields().h();
        if (mapH.containsKey(str)) {
            return (Value) mapH.get(str);
        }
        return value;
    }

    public Value getFieldsOrThrow(String str) {
        str.getClass();
        Map mapH = internalGetFields().h();
        if (mapH.containsKey(str)) {
            return (Value) mapH.get(str);
        }
        e32.a();
        return null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(w wVar) throws IOException {
        y4.serializeStringMapTo(wVar, internalGetFields(), FieldsDefaultEntryHolder.defaultEntry, 1);
        this.unknownFields.writeTo(wVar);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public Struct mo250getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Struct parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
        return (Struct) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
        return (Struct) PARSER.parseFrom(byteBuffer, o3Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Struct parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Struct) PARSER.parseFrom(byteString);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Struct parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
        return (Struct) PARSER.parseFrom(byteString, o3Var);
    }

    public static Struct parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Struct) PARSER.parseFrom(bArr);
    }

    public static Struct parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
        return (Struct) PARSER.parseFrom(bArr, o3Var);
    }

    public static Struct parseFrom(InputStream inputStream) throws IOException {
        return (Struct) y4.parseWithIOException(PARSER, inputStream);
    }

    public static Struct parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
        return (Struct) y4.parseWithIOException(PARSER, inputStream, o3Var);
    }

    public static Struct parseFrom(r rVar) throws IOException {
        return (Struct) y4.parseWithIOException(PARSER, rVar);
    }

    public static Struct parseFrom(r rVar, o3 o3Var) throws IOException {
        return (Struct) y4.parseWithIOException(PARSER, rVar, o3Var);
    }

    private Struct(g4 g4Var) {
        super(g4Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    private Struct() {
        this.memoizedIsInitialized = (byte) -1;
    }
}
