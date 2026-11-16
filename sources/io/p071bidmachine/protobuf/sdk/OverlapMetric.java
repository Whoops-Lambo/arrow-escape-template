package io.p071bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.c5;
import com.explorestack.protobuf.d;
import com.explorestack.protobuf.d5;
import com.explorestack.protobuf.g4;
import com.explorestack.protobuf.g7;
import com.explorestack.protobuf.h4;
import com.explorestack.protobuf.l5;
import com.explorestack.protobuf.o3;
import com.explorestack.protobuf.p8;
import com.explorestack.protobuf.r;
import com.explorestack.protobuf.s8;
import com.explorestack.protobuf.w;
import com.explorestack.protobuf.w4;
import com.explorestack.protobuf.x4;
import com.explorestack.protobuf.y4;
import com.explorestack.protobuf.z;
import defpackage.e32;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class OverlapMetric extends y4 implements OverlapMetricOrBuilder {
    public static final int MAX_OVERLAP_PERCENTAGE_FIELD_NUMBER = 2;
    public static final int SCOPE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private double maxOverlapPercentage_;
    private byte memoizedIsInitialized;
    private int scope_;
    private static final OverlapMetric DEFAULT_INSTANCE = new OverlapMetric();
    private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.OverlapMetric.1
        @Override // com.explorestack.protobuf.g7
        public OverlapMetric parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
            return new OverlapMetric(rVar, o3Var);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder extends g4 implements OverlapMetricOrBuilder {
        private double maxOverlapPercentage_;
        private int scope_;

        private Builder() {
            super(null);
            this.scope_ = 0;
            maybeForceBuilderInitialization();
        }

        public Builder clearScope() {
            this.scope_ = 0;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_OverlapMetric_descriptor;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public OverlapMetric buildPartial() {
            OverlapMetric overlapMetric = new OverlapMetric(this);
            overlapMetric.scope_ = this.scope_;
            overlapMetric.maxOverlapPercentage_ = this.maxOverlapPercentage_;
            onBuilt();
            return overlapMetric;
        }

        public Builder clearMaxOverlapPercentage() {
            this.maxOverlapPercentage_ = 0.0d;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_OverlapMetric_descriptor;
        }

        @Override // io.p071bidmachine.protobuf.sdk.OverlapMetricOrBuilder
        public double getMaxOverlapPercentage() {
            return this.maxOverlapPercentage_;
        }

        @Override // io.p071bidmachine.protobuf.sdk.OverlapMetricOrBuilder
        public OverlapScope getScope() {
            OverlapScope overlapScopeValueOf = OverlapScope.valueOf(this.scope_);
            return overlapScopeValueOf == null ? OverlapScope.UNRECOGNIZED : overlapScopeValueOf;
        }

        @Override // io.p071bidmachine.protobuf.sdk.OverlapMetricOrBuilder
        public int getScopeValue() {
            return this.scope_;
        }

        @Override // com.explorestack.protobuf.g4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_OverlapMetric_fieldAccessorTable;
            w4Var.c(OverlapMetric.class, Builder.class);
            return w4Var;
        }

        public Builder setMaxOverlapPercentage(double d) {
            this.maxOverlapPercentage_ = d;
            onChanged();
            return this;
        }

        public Builder setScopeValue(int i) {
            this.scope_ = i;
            onChanged();
            return this;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = y4.alwaysUseFieldBuilders;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public OverlapMetric build() {
            OverlapMetric overlapMetricBuildPartial = buildPartial();
            if (overlapMetricBuildPartial.isInitialized()) {
                return overlapMetricBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) overlapMetricBuildPartial);
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.scope_ = 0;
            this.maxOverlapPercentage_ = 0.0d;
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo247clone() {
            return (Builder) super.mo247clone();
        }

        public Builder mergeFrom(OverlapMetric overlapMetric) {
            if (overlapMetric == OverlapMetric.getDefaultInstance()) {
                return this;
            }
            if (overlapMetric.scope_ != 0) {
                setScopeValue(overlapMetric.getScopeValue());
            }
            if (overlapMetric.getMaxOverlapPercentage() != 0.0d) {
                setMaxOverlapPercentage(overlapMetric.getMaxOverlapPercentage());
            }
            mergeUnknownFields(((y4) overlapMetric).unknownFields);
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(s8 s8Var) {
            return (Builder) super.mergeUnknownFields(s8Var);
        }

        public Builder setScope(OverlapScope overlapScope) {
            overlapScope.getClass();
            this.scope_ = overlapScope.getNumber();
            onChanged();
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
        public OverlapMetric mo250getDefaultInstanceForType() {
            return OverlapMetric.getDefaultInstance();
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
            this.scope_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof OverlapMetric) {
                return mergeFrom((OverlapMetric) message);
            }
            super.mergeFrom(message);
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
            OverlapMetric overlapMetric = null;
            try {
                try {
                    OverlapMetric overlapMetric2 = (OverlapMetric) OverlapMetric.PARSER.parsePartialFrom(rVar, o3Var);
                    if (overlapMetric2 != null) {
                        mergeFrom(overlapMetric2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    OverlapMetric overlapMetric3 = (OverlapMetric) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        overlapMetric = overlapMetric3;
                        if (overlapMetric != null) {
                            mergeFrom(overlapMetric);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (overlapMetric != null) {
                    mergeFrom(overlapMetric);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum OverlapScope implements c5 {
        VIEW_SIBLINGS(0),
        ALL_VIEWS(1),
        WINDOWS(2),
        UNRECOGNIZED(-1);

        public static final int ALL_VIEWS_VALUE = 1;
        public static final int VIEW_SIBLINGS_VALUE = 0;
        public static final int WINDOWS_VALUE = 2;
        private final int value;
        private static final d5 internalValueMap = new d5() { // from class: io.bidmachine.protobuf.sdk.OverlapMetric.OverlapScope.1
            public OverlapScope findValueByNumber(int i) {
                return OverlapScope.forNumber(i);
            }
        };
        private static final OverlapScope[] VALUES = values();

        public static OverlapScope forNumber(int i) {
            if (i == 0) {
                return VIEW_SIBLINGS;
            }
            if (i == 1) {
                return ALL_VIEWS;
            }
            if (i != 2) {
                return null;
            }
            return WINDOWS;
        }

        public static d5 internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.explorestack.protobuf.c5
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            defpackage.d.r("Can't get the number of an unknown enum value.");
            return 0;
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return getDescriptor().getValues().get(ordinal());
            }
            e32.i("Can't get the descriptor of an unrecognized enum value.");
            return null;
        }

        OverlapScope(int i) {
            this.value = i;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return OverlapMetric.getDescriptor().getEnumTypes().get(0);
        }

        public static OverlapScope valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }
            defpackage.d.r("EnumValueDescriptor is not for this type.");
            return null;
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        @Deprecated
        public static OverlapScope valueOf(int i) {
            return forNumber(i);
        }
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OverlapMetric)) {
            return super.equals(obj);
        }
        OverlapMetric overlapMetric = (OverlapMetric) obj;
        return this.scope_ == overlapMetric.scope_ && Double.doubleToLongBits(getMaxOverlapPercentage()) == Double.doubleToLongBits(overlapMetric.getMaxOverlapPercentage()) && this.unknownFields.equals(overlapMetric.unknownFields);
    }

    public static OverlapMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_OverlapMetric_descriptor;
    }

    public static Builder newBuilder(OverlapMetric overlapMetric) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(overlapMetric);
    }

    public static OverlapMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OverlapMetric) y4.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static OverlapMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OverlapMetric) PARSER.parseFrom(byteBuffer);
    }

    public static g7 parser() {
        return PARSER;
    }

    @Override // io.p071bidmachine.protobuf.sdk.OverlapMetricOrBuilder
    public double getMaxOverlapPercentage() {
        return this.maxOverlapPercentage_;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public g7 getParserForType() {
        return PARSER;
    }

    @Override // io.p071bidmachine.protobuf.sdk.OverlapMetricOrBuilder
    public OverlapScope getScope() {
        OverlapScope overlapScopeValueOf = OverlapScope.valueOf(this.scope_);
        return overlapScopeValueOf == null ? OverlapScope.UNRECOGNIZED : overlapScopeValueOf;
    }

    @Override // io.p071bidmachine.protobuf.sdk.OverlapMetricOrBuilder
    public int getScopeValue() {
        return this.scope_;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iG = this.scope_ != OverlapScope.VIEW_SIBLINGS.getNumber() ? w.g(1, this.scope_) : 0;
        if (this.maxOverlapPercentage_ != 0.0d) {
            iG += w.f(2);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iG;
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
        int iHashCode = this.unknownFields.a.hashCode() + ((l5.d(Double.doubleToLongBits(getMaxOverlapPercentage())) + z.i((((getDescriptor().hashCode() + 779) * 37) + 1) * 53, this.scope_, 37, 2, 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.y4
    public w4 internalGetFieldAccessorTable() {
        w4 w4Var = SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_OverlapMetric_fieldAccessorTable;
        w4Var.c(OverlapMetric.class, Builder.class);
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
        return new OverlapMetric();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(w wVar) throws IOException {
        if (this.scope_ != OverlapScope.VIEW_SIBLINGS.getNumber()) {
            wVar.K(1, this.scope_);
        }
        double d = this.maxOverlapPercentage_;
        if (d != 0.0d) {
            wVar.E(2, d);
        }
        this.unknownFields.writeTo(wVar);
    }

    private OverlapMetric(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
        this();
        o3Var.getClass();
        p8 p8VarB = s8.b();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iF = rVar.F();
                    if (iF != 0) {
                        if (iF != 8) {
                            if (iF != 17) {
                                if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                }
                            } else {
                                this.maxOverlapPercentage_ = rVar.n();
                            }
                        } else {
                            this.scope_ = rVar.o();
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
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

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public OverlapMetric mo250getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static OverlapMetric parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
        return (OverlapMetric) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
    }

    public static OverlapMetric parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
        return (OverlapMetric) PARSER.parseFrom(byteBuffer, o3Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static OverlapMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OverlapMetric) PARSER.parseFrom(byteString);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static OverlapMetric parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
        return (OverlapMetric) PARSER.parseFrom(byteString, o3Var);
    }

    public static OverlapMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OverlapMetric) PARSER.parseFrom(bArr);
    }

    public static OverlapMetric parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
        return (OverlapMetric) PARSER.parseFrom(bArr, o3Var);
    }

    public static OverlapMetric parseFrom(InputStream inputStream) throws IOException {
        return (OverlapMetric) y4.parseWithIOException(PARSER, inputStream);
    }

    public static OverlapMetric parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
        return (OverlapMetric) y4.parseWithIOException(PARSER, inputStream, o3Var);
    }

    public static OverlapMetric parseFrom(r rVar) throws IOException {
        return (OverlapMetric) y4.parseWithIOException(PARSER, rVar);
    }

    public static OverlapMetric parseFrom(r rVar, o3 o3Var) throws IOException {
        return (OverlapMetric) y4.parseWithIOException(PARSER, rVar, o3Var);
    }

    private OverlapMetric(g4 g4Var) {
        super(g4Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    private OverlapMetric() {
        this.memoizedIsInitialized = (byte) -1;
        this.scope_ = 0;
    }
}
