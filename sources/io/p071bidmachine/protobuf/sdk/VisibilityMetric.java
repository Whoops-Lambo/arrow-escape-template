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
/* JADX INFO: loaded from: classes4.dex */
public final class VisibilityMetric extends y4 implements VisibilityMetricOrBuilder {
    public static final int MIN_VISIBLE_PERCENTAGE_FIELD_NUMBER = 2;
    public static final int SCOPE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private double minVisiblePercentage_;
    private int scope_;
    private static final VisibilityMetric DEFAULT_INSTANCE = new VisibilityMetric();
    private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.VisibilityMetric.1
        @Override // com.explorestack.protobuf.g7
        public VisibilityMetric parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
            return new VisibilityMetric(rVar, o3Var);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder extends g4 implements VisibilityMetricOrBuilder {
        private double minVisiblePercentage_;
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
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_VisibilityMetric_descriptor;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public VisibilityMetric buildPartial() {
            VisibilityMetric visibilityMetric = new VisibilityMetric(this);
            visibilityMetric.scope_ = this.scope_;
            visibilityMetric.minVisiblePercentage_ = this.minVisiblePercentage_;
            onBuilt();
            return visibilityMetric;
        }

        public Builder clearMinVisiblePercentage() {
            this.minVisiblePercentage_ = 0.0d;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_VisibilityMetric_descriptor;
        }

        @Override // io.p071bidmachine.protobuf.sdk.VisibilityMetricOrBuilder
        public double getMinVisiblePercentage() {
            return this.minVisiblePercentage_;
        }

        @Override // io.p071bidmachine.protobuf.sdk.VisibilityMetricOrBuilder
        public VisibilityScope getScope() {
            VisibilityScope visibilityScopeValueOf = VisibilityScope.valueOf(this.scope_);
            return visibilityScopeValueOf == null ? VisibilityScope.UNRECOGNIZED : visibilityScopeValueOf;
        }

        @Override // io.p071bidmachine.protobuf.sdk.VisibilityMetricOrBuilder
        public int getScopeValue() {
            return this.scope_;
        }

        @Override // com.explorestack.protobuf.g4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_VisibilityMetric_fieldAccessorTable;
            w4Var.c(VisibilityMetric.class, Builder.class);
            return w4Var;
        }

        public Builder setMinVisiblePercentage(double d) {
            this.minVisiblePercentage_ = d;
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
        public VisibilityMetric build() {
            VisibilityMetric visibilityMetricBuildPartial = buildPartial();
            if (visibilityMetricBuildPartial.isInitialized()) {
                return visibilityMetricBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) visibilityMetricBuildPartial);
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.scope_ = 0;
            this.minVisiblePercentage_ = 0.0d;
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo247clone() {
            return (Builder) super.mo247clone();
        }

        public Builder mergeFrom(VisibilityMetric visibilityMetric) {
            if (visibilityMetric == VisibilityMetric.getDefaultInstance()) {
                return this;
            }
            if (visibilityMetric.scope_ != 0) {
                setScopeValue(visibilityMetric.getScopeValue());
            }
            if (visibilityMetric.getMinVisiblePercentage() != 0.0d) {
                setMinVisiblePercentage(visibilityMetric.getMinVisiblePercentage());
            }
            mergeUnknownFields(((y4) visibilityMetric).unknownFields);
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(s8 s8Var) {
            return (Builder) super.mergeUnknownFields(s8Var);
        }

        public Builder setScope(VisibilityScope visibilityScope) {
            visibilityScope.getClass();
            this.scope_ = visibilityScope.getNumber();
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
        public VisibilityMetric mo250getDefaultInstanceForType() {
            return VisibilityMetric.getDefaultInstance();
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
            if (message instanceof VisibilityMetric) {
                return mergeFrom((VisibilityMetric) message);
            }
            super.mergeFrom(message);
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
            VisibilityMetric visibilityMetric = null;
            try {
                try {
                    VisibilityMetric visibilityMetric2 = (VisibilityMetric) VisibilityMetric.PARSER.parsePartialFrom(rVar, o3Var);
                    if (visibilityMetric2 != null) {
                        mergeFrom(visibilityMetric2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    VisibilityMetric visibilityMetric3 = (VisibilityMetric) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        visibilityMetric = visibilityMetric3;
                        if (visibilityMetric != null) {
                            mergeFrom(visibilityMetric);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (visibilityMetric != null) {
                    mergeFrom(visibilityMetric);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum VisibilityScope implements c5 {
        PARENT_VIEW(0),
        SCREEN(1),
        SAFE_AREA(2),
        UNRECOGNIZED(-1);

        public static final int PARENT_VIEW_VALUE = 0;
        public static final int SAFE_AREA_VALUE = 2;
        public static final int SCREEN_VALUE = 1;
        private final int value;
        private static final d5 internalValueMap = new d5() { // from class: io.bidmachine.protobuf.sdk.VisibilityMetric.VisibilityScope.1
            public VisibilityScope findValueByNumber(int i) {
                return VisibilityScope.forNumber(i);
            }
        };
        private static final VisibilityScope[] VALUES = values();

        public static VisibilityScope forNumber(int i) {
            if (i == 0) {
                return PARENT_VIEW;
            }
            if (i == 1) {
                return SCREEN;
            }
            if (i != 2) {
                return null;
            }
            return SAFE_AREA;
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

        VisibilityScope(int i) {
            this.value = i;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return VisibilityMetric.getDescriptor().getEnumTypes().get(0);
        }

        public static VisibilityScope valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static VisibilityScope valueOf(int i) {
            return forNumber(i);
        }
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VisibilityMetric)) {
            return super.equals(obj);
        }
        VisibilityMetric visibilityMetric = (VisibilityMetric) obj;
        return this.scope_ == visibilityMetric.scope_ && Double.doubleToLongBits(getMinVisiblePercentage()) == Double.doubleToLongBits(visibilityMetric.getMinVisiblePercentage()) && this.unknownFields.equals(visibilityMetric.unknownFields);
    }

    public static VisibilityMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_VisibilityMetric_descriptor;
    }

    public static Builder newBuilder(VisibilityMetric visibilityMetric) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(visibilityMetric);
    }

    public static VisibilityMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VisibilityMetric) y4.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static VisibilityMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VisibilityMetric) PARSER.parseFrom(byteBuffer);
    }

    public static g7 parser() {
        return PARSER;
    }

    @Override // io.p071bidmachine.protobuf.sdk.VisibilityMetricOrBuilder
    public double getMinVisiblePercentage() {
        return this.minVisiblePercentage_;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public g7 getParserForType() {
        return PARSER;
    }

    @Override // io.p071bidmachine.protobuf.sdk.VisibilityMetricOrBuilder
    public VisibilityScope getScope() {
        VisibilityScope visibilityScopeValueOf = VisibilityScope.valueOf(this.scope_);
        return visibilityScopeValueOf == null ? VisibilityScope.UNRECOGNIZED : visibilityScopeValueOf;
    }

    @Override // io.p071bidmachine.protobuf.sdk.VisibilityMetricOrBuilder
    public int getScopeValue() {
        return this.scope_;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iG = this.scope_ != VisibilityScope.PARENT_VIEW.getNumber() ? w.g(1, this.scope_) : 0;
        if (this.minVisiblePercentage_ != 0.0d) {
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
        int iHashCode = this.unknownFields.a.hashCode() + ((l5.d(Double.doubleToLongBits(getMinVisiblePercentage())) + z.i((((getDescriptor().hashCode() + 779) * 37) + 1) * 53, this.scope_, 37, 2, 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.y4
    public w4 internalGetFieldAccessorTable() {
        w4 w4Var = SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_VisibilityMetric_fieldAccessorTable;
        w4Var.c(VisibilityMetric.class, Builder.class);
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
        return new VisibilityMetric();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(w wVar) throws IOException {
        if (this.scope_ != VisibilityScope.PARENT_VIEW.getNumber()) {
            wVar.K(1, this.scope_);
        }
        double d = this.minVisiblePercentage_;
        if (d != 0.0d) {
            wVar.E(2, d);
        }
        this.unknownFields.writeTo(wVar);
    }

    private VisibilityMetric(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                                this.minVisiblePercentage_ = rVar.n();
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
    public VisibilityMetric mo250getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static VisibilityMetric parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
        return (VisibilityMetric) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
    }

    public static VisibilityMetric parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
        return (VisibilityMetric) PARSER.parseFrom(byteBuffer, o3Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static VisibilityMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (VisibilityMetric) PARSER.parseFrom(byteString);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static VisibilityMetric parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
        return (VisibilityMetric) PARSER.parseFrom(byteString, o3Var);
    }

    public static VisibilityMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VisibilityMetric) PARSER.parseFrom(bArr);
    }

    public static VisibilityMetric parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
        return (VisibilityMetric) PARSER.parseFrom(bArr, o3Var);
    }

    public static VisibilityMetric parseFrom(InputStream inputStream) throws IOException {
        return (VisibilityMetric) y4.parseWithIOException(PARSER, inputStream);
    }

    public static VisibilityMetric parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
        return (VisibilityMetric) y4.parseWithIOException(PARSER, inputStream, o3Var);
    }

    public static VisibilityMetric parseFrom(r rVar) throws IOException {
        return (VisibilityMetric) y4.parseWithIOException(PARSER, rVar);
    }

    public static VisibilityMetric parseFrom(r rVar, o3 o3Var) throws IOException {
        return (VisibilityMetric) y4.parseWithIOException(PARSER, rVar, o3Var);
    }

    private VisibilityMetric(g4 g4Var) {
        super(g4Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    private VisibilityMetric() {
        this.memoizedIsInitialized = (byte) -1;
        this.scope_ = 0;
    }
}
