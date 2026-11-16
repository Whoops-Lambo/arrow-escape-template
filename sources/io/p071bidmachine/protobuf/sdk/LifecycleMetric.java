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
import com.explorestack.protobuf.h5;
import com.explorestack.protobuf.i5;
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
import defpackage.pv1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class LifecycleMetric extends y4 implements LifecycleMetricOrBuilder {
    public static final int REQUIRED_STATES_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int requiredStatesMemoizedSerializedSize;
    private List<Integer> requiredStates_;
    private static final h5 requiredStates_converter_ = new h5() { // from class: io.bidmachine.protobuf.sdk.LifecycleMetric.1
        @Override // com.explorestack.protobuf.h5
        public LifecycleState convert(Integer num) {
            LifecycleState lifecycleStateValueOf = LifecycleState.valueOf(num.intValue());
            if (lifecycleStateValueOf == null) {
                return LifecycleState.UNRECOGNIZED;
            }
            return lifecycleStateValueOf;
        }
    };
    private static final LifecycleMetric DEFAULT_INSTANCE = new LifecycleMetric();
    private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.LifecycleMetric.2
        @Override // com.explorestack.protobuf.g7
        public LifecycleMetric parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
            return new LifecycleMetric(rVar, o3Var);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder extends g4 implements LifecycleMetricOrBuilder {
        private int bitField0_;
        private List<Integer> requiredStates_;

        private Builder() {
            super(null);
            this.requiredStates_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        private void ensureRequiredStatesIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.requiredStates_ = new ArrayList(this.requiredStates_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_LifecycleMetric_descriptor;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public LifecycleMetric buildPartial() {
            LifecycleMetric lifecycleMetric = new LifecycleMetric(this);
            if ((this.bitField0_ & 1) != 0) {
                this.requiredStates_ = Collections.unmodifiableList(this.requiredStates_);
                this.bitField0_ &= -2;
            }
            lifecycleMetric.requiredStates_ = this.requiredStates_;
            onBuilt();
            return lifecycleMetric;
        }

        public Builder clearRequiredStates() {
            this.requiredStates_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_LifecycleMetric_descriptor;
        }

        @Override // io.p071bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
        public int getRequiredStatesCount() {
            return this.requiredStates_.size();
        }

        @Override // io.p071bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
        public List<LifecycleState> getRequiredStatesList() {
            return new i5(this.requiredStates_, LifecycleMetric.requiredStates_converter_);
        }

        @Override // io.p071bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
        public int getRequiredStatesValue(int i) {
            return this.requiredStates_.get(i).intValue();
        }

        @Override // io.p071bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
        public List<Integer> getRequiredStatesValueList() {
            return Collections.unmodifiableList(this.requiredStates_);
        }

        @Override // com.explorestack.protobuf.g4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_LifecycleMetric_fieldAccessorTable;
            w4Var.c(LifecycleMetric.class, Builder.class);
            return w4Var;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = y4.alwaysUseFieldBuilders;
        }

        public Builder addAllRequiredStates(Iterable<? extends LifecycleState> iterable) {
            ensureRequiredStatesIsMutable();
            Iterator<? extends LifecycleState> it = iterable.iterator();
            while (it.hasNext()) {
                this.requiredStates_.add(Integer.valueOf(it.next().getNumber()));
            }
            onChanged();
            return this;
        }

        public Builder addAllRequiredStatesValue(Iterable<Integer> iterable) {
            ensureRequiredStatesIsMutable();
            for (Integer num : iterable) {
                num.intValue();
                this.requiredStates_.add(num);
            }
            onChanged();
            return this;
        }

        public Builder addRequiredStates(LifecycleState lifecycleState) {
            lifecycleState.getClass();
            ensureRequiredStatesIsMutable();
            this.requiredStates_.add(Integer.valueOf(lifecycleState.getNumber()));
            onChanged();
            return this;
        }

        public Builder addRequiredStatesValue(int i) {
            ensureRequiredStatesIsMutable();
            this.requiredStates_.add(Integer.valueOf(i));
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public LifecycleMetric build() {
            LifecycleMetric lifecycleMetricBuildPartial = buildPartial();
            if (lifecycleMetricBuildPartial.isInitialized()) {
                return lifecycleMetricBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) lifecycleMetricBuildPartial);
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.requiredStates_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo247clone() {
            return (Builder) super.mo247clone();
        }

        @Override // io.p071bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
        public LifecycleState getRequiredStates(int i) {
            return (LifecycleState) LifecycleMetric.requiredStates_converter_.convert(this.requiredStates_.get(i));
        }

        public Builder mergeFrom(LifecycleMetric lifecycleMetric) {
            if (lifecycleMetric == LifecycleMetric.getDefaultInstance()) {
                return this;
            }
            if (!lifecycleMetric.requiredStates_.isEmpty()) {
                if (this.requiredStates_.isEmpty()) {
                    this.requiredStates_ = lifecycleMetric.requiredStates_;
                    this.bitField0_ &= -2;
                } else {
                    ensureRequiredStatesIsMutable();
                    this.requiredStates_.addAll(lifecycleMetric.requiredStates_);
                }
                onChanged();
            }
            mergeUnknownFields(((y4) lifecycleMetric).unknownFields);
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(s8 s8Var) {
            return (Builder) super.mergeUnknownFields(s8Var);
        }

        public Builder setRequiredStates(int i, LifecycleState lifecycleState) {
            lifecycleState.getClass();
            ensureRequiredStatesIsMutable();
            this.requiredStates_.set(i, Integer.valueOf(lifecycleState.getNumber()));
            onChanged();
            return this;
        }

        public Builder setRequiredStatesValue(int i, int i2) {
            ensureRequiredStatesIsMutable();
            this.requiredStates_.set(i, Integer.valueOf(i2));
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
        public LifecycleMetric mo250getDefaultInstanceForType() {
            return LifecycleMetric.getDefaultInstance();
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
            this.requiredStates_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof LifecycleMetric) {
                return mergeFrom((LifecycleMetric) message);
            }
            super.mergeFrom(message);
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
            LifecycleMetric lifecycleMetric = null;
            try {
                try {
                    LifecycleMetric lifecycleMetric2 = (LifecycleMetric) LifecycleMetric.PARSER.parsePartialFrom(rVar, o3Var);
                    if (lifecycleMetric2 != null) {
                        mergeFrom(lifecycleMetric2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    LifecycleMetric lifecycleMetric3 = (LifecycleMetric) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        lifecycleMetric = lifecycleMetric3;
                        if (lifecycleMetric != null) {
                            mergeFrom(lifecycleMetric);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (lifecycleMetric != null) {
                    mergeFrom(lifecycleMetric);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum LifecycleState implements c5 {
        FOREGROUND(0),
        HAS_WINDOW_FOCUS(1),
        VIEW_APPEARED(2),
        UNRECOGNIZED(-1);

        public static final int FOREGROUND_VALUE = 0;
        public static final int HAS_WINDOW_FOCUS_VALUE = 1;
        public static final int VIEW_APPEARED_VALUE = 2;
        private final int value;
        private static final d5 internalValueMap = new d5() { // from class: io.bidmachine.protobuf.sdk.LifecycleMetric.LifecycleState.1
            public LifecycleState findValueByNumber(int i) {
                return LifecycleState.forNumber(i);
            }
        };
        private static final LifecycleState[] VALUES = values();

        public static LifecycleState forNumber(int i) {
            if (i == 0) {
                return FOREGROUND;
            }
            if (i == 1) {
                return HAS_WINDOW_FOCUS;
            }
            if (i != 2) {
                return null;
            }
            return VIEW_APPEARED;
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

        LifecycleState(int i) {
            this.value = i;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return LifecycleMetric.getDescriptor().getEnumTypes().get(0);
        }

        public static LifecycleState valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static LifecycleState valueOf(int i) {
            return forNumber(i);
        }
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LifecycleMetric)) {
            return super.equals(obj);
        }
        LifecycleMetric lifecycleMetric = (LifecycleMetric) obj;
        return this.requiredStates_.equals(lifecycleMetric.requiredStates_) && this.unknownFields.equals(lifecycleMetric.unknownFields);
    }

    public static LifecycleMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_LifecycleMetric_descriptor;
    }

    public static Builder newBuilder(LifecycleMetric lifecycleMetric) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(lifecycleMetric);
    }

    public static LifecycleMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LifecycleMetric) y4.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static LifecycleMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LifecycleMetric) PARSER.parseFrom(byteBuffer);
    }

    public static g7 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public g7 getParserForType() {
        return PARSER;
    }

    @Override // io.p071bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
    public LifecycleState getRequiredStates(int i) {
        return (LifecycleState) requiredStates_converter_.convert(this.requiredStates_.get(i));
    }

    @Override // io.p071bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
    public int getRequiredStatesCount() {
        return this.requiredStates_.size();
    }

    @Override // io.p071bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
    public List<LifecycleState> getRequiredStatesList() {
        return new i5(this.requiredStates_, requiredStates_converter_);
    }

    @Override // io.p071bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
    public int getRequiredStatesValue(int i) {
        return this.requiredStates_.get(i).intValue();
    }

    @Override // io.p071bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
    public List<Integer> getRequiredStatesValueList() {
        return this.requiredStates_;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iJ = 0;
        for (int i2 = 0; i2 < this.requiredStates_.size(); i2++) {
            iJ = z.j(iJ, this.requiredStates_.get(i2));
        }
        int iU = getRequiredStatesList().isEmpty() ? iJ : w.u(iJ) + iJ + 1;
        this.requiredStatesMemoizedSerializedSize = iJ;
        int serializedSize = this.unknownFields.getSerializedSize() + iU;
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
        if (getRequiredStatesCount() > 0) {
            iHashCode = pv1.c(iHashCode, 37, 1, 53) + this.requiredStates_.hashCode();
        }
        int iHashCode2 = this.unknownFields.a.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.y4
    public w4 internalGetFieldAccessorTable() {
        w4 w4Var = SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_LifecycleMetric_fieldAccessorTable;
        w4Var.c(LifecycleMetric.class, Builder.class);
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
        return new LifecycleMetric();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    private LifecycleMetric(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
        this();
        o3Var.getClass();
        p8 p8VarB = s8.b();
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iF = rVar.F();
                    if (iF != 0) {
                        if (iF != 8) {
                            if (iF != 10) {
                                if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                }
                            } else {
                                int iK = rVar.k(rVar.x());
                                while (rVar.d() > 0) {
                                    int iO = rVar.o();
                                    if (!z2) {
                                        this.requiredStates_ = new ArrayList();
                                        z2 = true;
                                    }
                                    this.requiredStates_.add(Integer.valueOf(iO));
                                }
                                rVar.j(iK);
                            }
                        } else {
                            int iO2 = rVar.o();
                            if (!z2) {
                                this.requiredStates_ = new ArrayList();
                                z2 = true;
                            }
                            this.requiredStates_.add(Integer.valueOf(iO2));
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if (z2) {
                    this.requiredStates_ = Collections.unmodifiableList(this.requiredStates_);
                }
                this.unknownFields = p8VarB.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (z2) {
            this.requiredStates_ = Collections.unmodifiableList(this.requiredStates_);
        }
        this.unknownFields = p8VarB.build();
        makeExtensionsImmutable();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(w wVar) throws IOException {
        getSerializedSize();
        if (getRequiredStatesList().size() > 0) {
            wVar.U(10);
            wVar.U(this.requiredStatesMemoizedSerializedSize);
        }
        for (int i = 0; i < this.requiredStates_.size(); i++) {
            wVar.L(this.requiredStates_.get(i).intValue());
        }
        this.unknownFields.writeTo(wVar);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public LifecycleMetric mo250getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static LifecycleMetric parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
        return (LifecycleMetric) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
    }

    public static LifecycleMetric parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
        return (LifecycleMetric) PARSER.parseFrom(byteBuffer, o3Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static LifecycleMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LifecycleMetric) PARSER.parseFrom(byteString);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static LifecycleMetric parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
        return (LifecycleMetric) PARSER.parseFrom(byteString, o3Var);
    }

    public static LifecycleMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LifecycleMetric) PARSER.parseFrom(bArr);
    }

    public static LifecycleMetric parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
        return (LifecycleMetric) PARSER.parseFrom(bArr, o3Var);
    }

    public static LifecycleMetric parseFrom(InputStream inputStream) throws IOException {
        return (LifecycleMetric) y4.parseWithIOException(PARSER, inputStream);
    }

    public static LifecycleMetric parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
        return (LifecycleMetric) y4.parseWithIOException(PARSER, inputStream, o3Var);
    }

    public static LifecycleMetric parseFrom(r rVar) throws IOException {
        return (LifecycleMetric) y4.parseWithIOException(PARSER, rVar);
    }

    public static LifecycleMetric parseFrom(r rVar, o3 o3Var) throws IOException {
        return (LifecycleMetric) y4.parseWithIOException(PARSER, rVar, o3Var);
    }

    private LifecycleMetric(g4 g4Var) {
        super(g4Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    private LifecycleMetric() {
        this.memoizedIsInitialized = (byte) -1;
        this.requiredStates_ = Collections.EMPTY_LIST;
    }
}
