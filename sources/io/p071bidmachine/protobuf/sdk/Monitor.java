package io.p071bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.BoolValue;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.UInt32Value;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.b8;
import com.explorestack.protobuf.c;
import com.explorestack.protobuf.c5;
import com.explorestack.protobuf.c8;
import com.explorestack.protobuf.d;
import com.explorestack.protobuf.d5;
import com.explorestack.protobuf.g4;
import com.explorestack.protobuf.g7;
import com.explorestack.protobuf.g8;
import com.explorestack.protobuf.h4;
import com.explorestack.protobuf.i;
import com.explorestack.protobuf.j7;
import com.explorestack.protobuf.l5;
import com.explorestack.protobuf.l8;
import com.explorestack.protobuf.o3;
import com.explorestack.protobuf.o7;
import com.explorestack.protobuf.p8;
import com.explorestack.protobuf.r;
import com.explorestack.protobuf.r5;
import com.explorestack.protobuf.s5;
import com.explorestack.protobuf.s8;
import com.explorestack.protobuf.v7;
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
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Monitor extends y4 implements MonitorOrBuilder {
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int RECORDS_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private List<Record> records_;
    private static final Monitor DEFAULT_INSTANCE = new Monitor();
    private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Monitor.1
        @Override // com.explorestack.protobuf.g7
        public Monitor parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
            return new Monitor(rVar, o3Var);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class All extends y4 implements AllOrBuilder {
        public static final int ITEMS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<FilterExpression> items_;
        private byte memoizedIsInitialized;
        private static final All DEFAULT_INSTANCE = new All();
        private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Monitor.All.1
            @Override // com.explorestack.protobuf.g7
            public All parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                return new All(rVar, o3Var);
            }
        };

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends g4 implements AllOrBuilder {
            private int bitField0_;
            private o7 itemsBuilder_;
            private List<FilterExpression> items_;

            private Builder() {
                super(null);
                this.items_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            private void ensureItemsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.items_ = new ArrayList(this.items_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_All_descriptor;
            }

            private o7 getItemsFieldBuilder() {
                if (this.itemsBuilder_ == null) {
                    this.itemsBuilder_ = new o7(this.items_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.items_ = null;
                }
                return this.itemsBuilder_;
            }

            public Builder addAllItems(Iterable<? extends FilterExpression> iterable) {
                o7 o7Var = this.itemsBuilder_;
                if (o7Var != null) {
                    o7Var.a(iterable);
                    return this;
                }
                ensureItemsIsMutable();
                b.addAll((Iterable) iterable, (List) this.items_);
                onChanged();
                return this;
            }

            public Builder addItems(FilterExpression.Builder builder) {
                o7 o7Var = this.itemsBuilder_;
                if (o7Var != null) {
                    o7Var.e(builder.build());
                    return this;
                }
                ensureItemsIsMutable();
                this.items_.add(builder.build());
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public All buildPartial() {
                All all = new All(this);
                int i = this.bitField0_;
                o7 o7Var = this.itemsBuilder_;
                if (o7Var == null) {
                    if ((i & 1) != 0) {
                        this.items_ = Collections.unmodifiableList(this.items_);
                        this.bitField0_ &= -2;
                    }
                    all.items_ = this.items_;
                } else {
                    all.items_ = o7Var.f();
                }
                onBuilt();
                return all;
            }

            public Builder clearItems() {
                o7 o7Var = this.itemsBuilder_;
                if (o7Var != null) {
                    o7Var.g();
                    return this;
                }
                this.items_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_All_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.AllOrBuilder
            public FilterExpression getItems(int i) {
                o7 o7Var = this.itemsBuilder_;
                return o7Var == null ? this.items_.get(i) : (FilterExpression) o7Var.l(i, false);
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.AllOrBuilder
            public int getItemsCount() {
                o7 o7Var = this.itemsBuilder_;
                return o7Var == null ? this.items_.size() : o7Var.b.size();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.AllOrBuilder
            public List<FilterExpression> getItemsList() {
                o7 o7Var = this.itemsBuilder_;
                return o7Var == null ? Collections.unmodifiableList(this.items_) : o7Var.m();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.AllOrBuilder
            public FilterExpressionOrBuilder getItemsOrBuilder(int i) {
                o7 o7Var = this.itemsBuilder_;
                return o7Var == null ? this.items_.get(i) : (FilterExpressionOrBuilder) o7Var.n(i);
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.AllOrBuilder
            public List<? extends FilterExpressionOrBuilder> getItemsOrBuilderList() {
                o7 o7Var = this.itemsBuilder_;
                return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.items_);
            }

            @Override // com.explorestack.protobuf.g4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_All_fieldAccessorTable;
                w4Var.c(All.class, Builder.class);
                return w4Var;
            }

            public Builder removeItems(int i) {
                o7 o7Var = this.itemsBuilder_;
                if (o7Var != null) {
                    o7Var.r(i);
                    return this;
                }
                ensureItemsIsMutable();
                this.items_.remove(i);
                onChanged();
                return this;
            }

            public Builder setItems(int i, FilterExpression.Builder builder) {
                o7 o7Var = this.itemsBuilder_;
                if (o7Var != null) {
                    o7Var.s(i, builder.build());
                    return this;
                }
                ensureItemsIsMutable();
                this.items_.set(i, builder.build());
                onChanged();
                return this;
            }

            private void maybeForceBuilderInitialization() {
                if (y4.alwaysUseFieldBuilders) {
                    getItemsFieldBuilder();
                }
            }

            public FilterExpression.Builder addItemsBuilder() {
                return (FilterExpression.Builder) getItemsFieldBuilder().c(FilterExpression.getDefaultInstance());
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public All build() {
                All allBuildPartial = buildPartial();
                if (allBuildPartial.isInitialized()) {
                    return allBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) allBuildPartial);
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                o7 o7Var = this.itemsBuilder_;
                if (o7Var == null) {
                    this.items_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    return this;
                }
                o7Var.g();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo247clone() {
                return (Builder) super.mo247clone();
            }

            public FilterExpression.Builder getItemsBuilder(int i) {
                return (FilterExpression.Builder) getItemsFieldBuilder().j(i);
            }

            public List<FilterExpression.Builder> getItemsBuilderList() {
                return getItemsFieldBuilder().k();
            }

            public Builder mergeFrom(All all) {
                if (all == All.getDefaultInstance()) {
                    return this;
                }
                if (this.itemsBuilder_ == null) {
                    if (!all.items_.isEmpty()) {
                        if (this.items_.isEmpty()) {
                            this.items_ = all.items_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureItemsIsMutable();
                            this.items_.addAll(all.items_);
                        }
                        onChanged();
                    }
                } else if (!all.items_.isEmpty()) {
                    boolean zIsEmpty = this.itemsBuilder_.b.isEmpty();
                    o7 o7Var = this.itemsBuilder_;
                    if (zIsEmpty) {
                        o7 itemsFieldBuilder = null;
                        o7Var.a = null;
                        this.itemsBuilder_ = null;
                        this.items_ = all.items_;
                        this.bitField0_ &= -2;
                        if (y4.alwaysUseFieldBuilders) {
                            itemsFieldBuilder = getItemsFieldBuilder();
                        }
                        this.itemsBuilder_ = itemsFieldBuilder;
                    } else {
                        o7Var.a(all.items_);
                    }
                }
                mergeUnknownFields(((y4) all).unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(s8 s8Var) {
                return (Builder) super.mergeUnknownFields(s8Var);
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
            public All mo250getDefaultInstanceForType() {
                return All.getDefaultInstance();
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
                this.items_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public FilterExpression.Builder addItemsBuilder(int i) {
                return (FilterExpression.Builder) getItemsFieldBuilder().b(i, FilterExpression.getDefaultInstance());
            }

            public Builder addItems(int i, FilterExpression filterExpression) {
                o7 o7Var = this.itemsBuilder_;
                if (o7Var == null) {
                    filterExpression.getClass();
                    ensureItemsIsMutable();
                    this.items_.add(i, filterExpression);
                    onChanged();
                    return this;
                }
                o7Var.d(i, filterExpression);
                return this;
            }

            public Builder setItems(int i, FilterExpression filterExpression) {
                o7 o7Var = this.itemsBuilder_;
                if (o7Var == null) {
                    filterExpression.getClass();
                    ensureItemsIsMutable();
                    this.items_.set(i, filterExpression);
                    onChanged();
                    return this;
                }
                o7Var.s(i, filterExpression);
                return this;
            }

            public Builder addItems(FilterExpression filterExpression) {
                o7 o7Var = this.itemsBuilder_;
                if (o7Var == null) {
                    filterExpression.getClass();
                    ensureItemsIsMutable();
                    this.items_.add(filterExpression);
                    onChanged();
                    return this;
                }
                o7Var.e(filterExpression);
                return this;
            }

            public Builder addItems(int i, FilterExpression.Builder builder) {
                o7 o7Var = this.itemsBuilder_;
                if (o7Var == null) {
                    ensureItemsIsMutable();
                    this.items_.add(i, builder.build());
                    onChanged();
                    return this;
                }
                o7Var.d(i, builder.build());
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof All) {
                    return mergeFrom((All) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                All all = null;
                try {
                    try {
                        All all2 = (All) All.PARSER.parsePartialFrom(rVar, o3Var);
                        if (all2 != null) {
                            mergeFrom(all2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        All all3 = (All) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            all = all3;
                            if (all != null) {
                                mergeFrom(all);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (all != null) {
                        mergeFrom(all);
                    }
                    throw th;
                }
            }
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof All)) {
                return super.equals(obj);
            }
            All all = (All) obj;
            return getItemsList().equals(all.getItemsList()) && this.unknownFields.equals(all.unknownFields);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(w wVar) throws IOException {
            for (int i = 0; i < this.items_.size(); i++) {
                wVar.M(1, this.items_.get(i));
            }
            this.unknownFields.writeTo(wVar);
        }

        public static All getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_All_descriptor;
        }

        public static Builder newBuilder(All all) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(all);
        }

        public static All parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (All) y4.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static All parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (All) PARSER.parseFrom(byteBuffer);
        }

        public static g7 parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.AllOrBuilder
        public FilterExpression getItems(int i) {
            return this.items_.get(i);
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.AllOrBuilder
        public int getItemsCount() {
            return this.items_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.AllOrBuilder
        public List<FilterExpression> getItemsList() {
            return this.items_;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.AllOrBuilder
        public FilterExpressionOrBuilder getItemsOrBuilder(int i) {
            return this.items_.get(i);
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.AllOrBuilder
        public List<? extends FilterExpressionOrBuilder> getItemsOrBuilderList() {
            return this.items_;
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
            int iO = 0;
            for (int i2 = 0; i2 < this.items_.size(); i2++) {
                iO += w.o(1, this.items_.get(i2));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iO;
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
            if (getItemsCount() > 0) {
                iHashCode = pv1.c(iHashCode, 37, 1, 53) + getItemsList().hashCode();
            }
            int iHashCode2 = this.unknownFields.a.hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.y4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_All_fieldAccessorTable;
            w4Var.c(All.class, Builder.class);
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
            return new All();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private All(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                                        this.items_ = new ArrayList();
                                        z2 = true;
                                    }
                                    this.items_.add((FilterExpression) rVar.v(FilterExpression.parser(), o3Var));
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
                    if (z2) {
                        this.items_ = Collections.unmodifiableList(this.items_);
                    }
                    this.unknownFields = p8VarB.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2) {
                this.items_ = Collections.unmodifiableList(this.items_);
            }
            this.unknownFields = p8VarB.build();
            makeExtensionsImmutable();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public All mo250getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static All parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (All) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
        }

        public static All parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
            return (All) PARSER.parseFrom(byteBuffer, o3Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static All parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (All) PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static All parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
            return (All) PARSER.parseFrom(byteString, o3Var);
        }

        public static All parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (All) PARSER.parseFrom(bArr);
        }

        public static All parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
            return (All) PARSER.parseFrom(bArr, o3Var);
        }

        public static All parseFrom(InputStream inputStream) throws IOException {
            return (All) y4.parseWithIOException(PARSER, inputStream);
        }

        public static All parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (All) y4.parseWithIOException(PARSER, inputStream, o3Var);
        }

        public static All parseFrom(r rVar) throws IOException {
            return (All) y4.parseWithIOException(PARSER, rVar);
        }

        public static All parseFrom(r rVar, o3 o3Var) throws IOException {
            return (All) y4.parseWithIOException(PARSER, rVar, o3Var);
        }

        private All(g4 g4Var) {
            super(g4Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        private All() {
            this.memoizedIsInitialized = (byte) -1;
            this.items_ = Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface AllOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo250getDefaultInstanceForType();

        FilterExpression getItems(int i);

        int getItemsCount();

        List<FilterExpression> getItemsList();

        FilterExpressionOrBuilder getItemsOrBuilder(int i);

        List<? extends FilterExpressionOrBuilder> getItemsOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Any extends y4 implements AnyOrBuilder {
        public static final int ITEMS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<FilterExpression> items_;
        private byte memoizedIsInitialized;
        private static final Any DEFAULT_INSTANCE = new Any();
        private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Monitor.Any.1
            @Override // com.explorestack.protobuf.g7
            public Any parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                return new Any(rVar, o3Var);
            }
        };

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends g4 implements AnyOrBuilder {
            private int bitField0_;
            private o7 itemsBuilder_;
            private List<FilterExpression> items_;

            private Builder() {
                super(null);
                this.items_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            private void ensureItemsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.items_ = new ArrayList(this.items_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Any_descriptor;
            }

            private o7 getItemsFieldBuilder() {
                if (this.itemsBuilder_ == null) {
                    this.itemsBuilder_ = new o7(this.items_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.items_ = null;
                }
                return this.itemsBuilder_;
            }

            public Builder addAllItems(Iterable<? extends FilterExpression> iterable) {
                o7 o7Var = this.itemsBuilder_;
                if (o7Var != null) {
                    o7Var.a(iterable);
                    return this;
                }
                ensureItemsIsMutable();
                b.addAll((Iterable) iterable, (List) this.items_);
                onChanged();
                return this;
            }

            public Builder addItems(FilterExpression.Builder builder) {
                o7 o7Var = this.itemsBuilder_;
                if (o7Var != null) {
                    o7Var.e(builder.build());
                    return this;
                }
                ensureItemsIsMutable();
                this.items_.add(builder.build());
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Any buildPartial() {
                Any any = new Any(this);
                int i = this.bitField0_;
                o7 o7Var = this.itemsBuilder_;
                if (o7Var == null) {
                    if ((i & 1) != 0) {
                        this.items_ = Collections.unmodifiableList(this.items_);
                        this.bitField0_ &= -2;
                    }
                    any.items_ = this.items_;
                } else {
                    any.items_ = o7Var.f();
                }
                onBuilt();
                return any;
            }

            public Builder clearItems() {
                o7 o7Var = this.itemsBuilder_;
                if (o7Var != null) {
                    o7Var.g();
                    return this;
                }
                this.items_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Any_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.AnyOrBuilder
            public FilterExpression getItems(int i) {
                o7 o7Var = this.itemsBuilder_;
                return o7Var == null ? this.items_.get(i) : (FilterExpression) o7Var.l(i, false);
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.AnyOrBuilder
            public int getItemsCount() {
                o7 o7Var = this.itemsBuilder_;
                return o7Var == null ? this.items_.size() : o7Var.b.size();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.AnyOrBuilder
            public List<FilterExpression> getItemsList() {
                o7 o7Var = this.itemsBuilder_;
                return o7Var == null ? Collections.unmodifiableList(this.items_) : o7Var.m();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.AnyOrBuilder
            public FilterExpressionOrBuilder getItemsOrBuilder(int i) {
                o7 o7Var = this.itemsBuilder_;
                return o7Var == null ? this.items_.get(i) : (FilterExpressionOrBuilder) o7Var.n(i);
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.AnyOrBuilder
            public List<? extends FilterExpressionOrBuilder> getItemsOrBuilderList() {
                o7 o7Var = this.itemsBuilder_;
                return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.items_);
            }

            @Override // com.explorestack.protobuf.g4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Any_fieldAccessorTable;
                w4Var.c(Any.class, Builder.class);
                return w4Var;
            }

            public Builder removeItems(int i) {
                o7 o7Var = this.itemsBuilder_;
                if (o7Var != null) {
                    o7Var.r(i);
                    return this;
                }
                ensureItemsIsMutable();
                this.items_.remove(i);
                onChanged();
                return this;
            }

            public Builder setItems(int i, FilterExpression.Builder builder) {
                o7 o7Var = this.itemsBuilder_;
                if (o7Var != null) {
                    o7Var.s(i, builder.build());
                    return this;
                }
                ensureItemsIsMutable();
                this.items_.set(i, builder.build());
                onChanged();
                return this;
            }

            private void maybeForceBuilderInitialization() {
                if (y4.alwaysUseFieldBuilders) {
                    getItemsFieldBuilder();
                }
            }

            public FilterExpression.Builder addItemsBuilder() {
                return (FilterExpression.Builder) getItemsFieldBuilder().c(FilterExpression.getDefaultInstance());
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Any build() {
                Any anyBuildPartial = buildPartial();
                if (anyBuildPartial.isInitialized()) {
                    return anyBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) anyBuildPartial);
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                o7 o7Var = this.itemsBuilder_;
                if (o7Var == null) {
                    this.items_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    return this;
                }
                o7Var.g();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo247clone() {
                return (Builder) super.mo247clone();
            }

            public FilterExpression.Builder getItemsBuilder(int i) {
                return (FilterExpression.Builder) getItemsFieldBuilder().j(i);
            }

            public List<FilterExpression.Builder> getItemsBuilderList() {
                return getItemsFieldBuilder().k();
            }

            public Builder mergeFrom(Any any) {
                if (any == Any.getDefaultInstance()) {
                    return this;
                }
                if (this.itemsBuilder_ == null) {
                    if (!any.items_.isEmpty()) {
                        if (this.items_.isEmpty()) {
                            this.items_ = any.items_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureItemsIsMutable();
                            this.items_.addAll(any.items_);
                        }
                        onChanged();
                    }
                } else if (!any.items_.isEmpty()) {
                    boolean zIsEmpty = this.itemsBuilder_.b.isEmpty();
                    o7 o7Var = this.itemsBuilder_;
                    if (zIsEmpty) {
                        o7 itemsFieldBuilder = null;
                        o7Var.a = null;
                        this.itemsBuilder_ = null;
                        this.items_ = any.items_;
                        this.bitField0_ &= -2;
                        if (y4.alwaysUseFieldBuilders) {
                            itemsFieldBuilder = getItemsFieldBuilder();
                        }
                        this.itemsBuilder_ = itemsFieldBuilder;
                    } else {
                        o7Var.a(any.items_);
                    }
                }
                mergeUnknownFields(((y4) any).unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(s8 s8Var) {
                return (Builder) super.mergeUnknownFields(s8Var);
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
            public Any mo250getDefaultInstanceForType() {
                return Any.getDefaultInstance();
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
                this.items_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public FilterExpression.Builder addItemsBuilder(int i) {
                return (FilterExpression.Builder) getItemsFieldBuilder().b(i, FilterExpression.getDefaultInstance());
            }

            public Builder addItems(int i, FilterExpression filterExpression) {
                o7 o7Var = this.itemsBuilder_;
                if (o7Var == null) {
                    filterExpression.getClass();
                    ensureItemsIsMutable();
                    this.items_.add(i, filterExpression);
                    onChanged();
                    return this;
                }
                o7Var.d(i, filterExpression);
                return this;
            }

            public Builder setItems(int i, FilterExpression filterExpression) {
                o7 o7Var = this.itemsBuilder_;
                if (o7Var == null) {
                    filterExpression.getClass();
                    ensureItemsIsMutable();
                    this.items_.set(i, filterExpression);
                    onChanged();
                    return this;
                }
                o7Var.s(i, filterExpression);
                return this;
            }

            public Builder addItems(FilterExpression filterExpression) {
                o7 o7Var = this.itemsBuilder_;
                if (o7Var == null) {
                    filterExpression.getClass();
                    ensureItemsIsMutable();
                    this.items_.add(filterExpression);
                    onChanged();
                    return this;
                }
                o7Var.e(filterExpression);
                return this;
            }

            public Builder addItems(int i, FilterExpression.Builder builder) {
                o7 o7Var = this.itemsBuilder_;
                if (o7Var == null) {
                    ensureItemsIsMutable();
                    this.items_.add(i, builder.build());
                    onChanged();
                    return this;
                }
                o7Var.d(i, builder.build());
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Any) {
                    return mergeFrom((Any) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                Any any = null;
                try {
                    try {
                        Any any2 = (Any) Any.PARSER.parsePartialFrom(rVar, o3Var);
                        if (any2 != null) {
                            mergeFrom(any2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Any any3 = (Any) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            any = any3;
                            if (any != null) {
                                mergeFrom(any);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (any != null) {
                        mergeFrom(any);
                    }
                    throw th;
                }
            }
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Any)) {
                return super.equals(obj);
            }
            Any any = (Any) obj;
            return getItemsList().equals(any.getItemsList()) && this.unknownFields.equals(any.unknownFields);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(w wVar) throws IOException {
            for (int i = 0; i < this.items_.size(); i++) {
                wVar.M(1, this.items_.get(i));
            }
            this.unknownFields.writeTo(wVar);
        }

        public static Any getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Any_descriptor;
        }

        public static Builder newBuilder(Any any) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(any);
        }

        public static Any parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Any) y4.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Any parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Any) PARSER.parseFrom(byteBuffer);
        }

        public static g7 parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.AnyOrBuilder
        public FilterExpression getItems(int i) {
            return this.items_.get(i);
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.AnyOrBuilder
        public int getItemsCount() {
            return this.items_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.AnyOrBuilder
        public List<FilterExpression> getItemsList() {
            return this.items_;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.AnyOrBuilder
        public FilterExpressionOrBuilder getItemsOrBuilder(int i) {
            return this.items_.get(i);
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.AnyOrBuilder
        public List<? extends FilterExpressionOrBuilder> getItemsOrBuilderList() {
            return this.items_;
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
            int iO = 0;
            for (int i2 = 0; i2 < this.items_.size(); i2++) {
                iO += w.o(1, this.items_.get(i2));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iO;
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
            if (getItemsCount() > 0) {
                iHashCode = pv1.c(iHashCode, 37, 1, 53) + getItemsList().hashCode();
            }
            int iHashCode2 = this.unknownFields.a.hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.y4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Any_fieldAccessorTable;
            w4Var.c(Any.class, Builder.class);
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
            return new Any();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private Any(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                                        this.items_ = new ArrayList();
                                        z2 = true;
                                    }
                                    this.items_.add((FilterExpression) rVar.v(FilterExpression.parser(), o3Var));
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
                    if (z2) {
                        this.items_ = Collections.unmodifiableList(this.items_);
                    }
                    this.unknownFields = p8VarB.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2) {
                this.items_ = Collections.unmodifiableList(this.items_);
            }
            this.unknownFields = p8VarB.build();
            makeExtensionsImmutable();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Any mo250getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Any parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Any) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
        }

        public static Any parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
            return (Any) PARSER.parseFrom(byteBuffer, o3Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Any parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Any) PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Any parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
            return (Any) PARSER.parseFrom(byteString, o3Var);
        }

        public static Any parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Any) PARSER.parseFrom(bArr);
        }

        public static Any parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
            return (Any) PARSER.parseFrom(bArr, o3Var);
        }

        public static Any parseFrom(InputStream inputStream) throws IOException {
            return (Any) y4.parseWithIOException(PARSER, inputStream);
        }

        public static Any parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Any) y4.parseWithIOException(PARSER, inputStream, o3Var);
        }

        public static Any parseFrom(r rVar) throws IOException {
            return (Any) y4.parseWithIOException(PARSER, rVar);
        }

        public static Any parseFrom(r rVar, o3 o3Var) throws IOException {
            return (Any) y4.parseWithIOException(PARSER, rVar, o3Var);
        }

        private Any(g4 g4Var) {
            super(g4Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        private Any() {
            this.memoizedIsInitialized = (byte) -1;
            this.items_ = Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface AnyOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo250getDefaultInstanceForType();

        FilterExpression getItems(int i);

        int getItemsCount();

        List<FilterExpression> getItemsList();

        FilterExpressionOrBuilder getItemsOrBuilder(int i);

        List<? extends FilterExpressionOrBuilder> getItemsOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder extends g4 implements MonitorOrBuilder {
        private int bitField0_;
        private Object name_;
        private o7 recordsBuilder_;
        private List<Record> records_;

        private Builder() {
            super(null);
            this.name_ = "";
            this.records_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        private void ensureRecordsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.records_ = new ArrayList(this.records_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_descriptor;
        }

        private o7 getRecordsFieldBuilder() {
            if (this.recordsBuilder_ == null) {
                this.recordsBuilder_ = new o7(this.records_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.records_ = null;
            }
            return this.recordsBuilder_;
        }

        public Builder addAllRecords(Iterable<? extends Record> iterable) {
            o7 o7Var = this.recordsBuilder_;
            if (o7Var != null) {
                o7Var.a(iterable);
                return this;
            }
            ensureRecordsIsMutable();
            b.addAll((Iterable) iterable, (List) this.records_);
            onChanged();
            return this;
        }

        public Builder addRecords(Record.Builder builder) {
            o7 o7Var = this.recordsBuilder_;
            if (o7Var != null) {
                o7Var.e(builder.build());
                return this;
            }
            ensureRecordsIsMutable();
            this.records_.add(builder.build());
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Monitor buildPartial() {
            Monitor monitor = new Monitor(this);
            monitor.name_ = this.name_;
            o7 o7Var = this.recordsBuilder_;
            if (o7Var == null) {
                if ((this.bitField0_ & 1) != 0) {
                    this.records_ = Collections.unmodifiableList(this.records_);
                    this.bitField0_ &= -2;
                }
                monitor.records_ = this.records_;
            } else {
                monitor.records_ = o7Var.f();
            }
            onBuilt();
            return monitor;
        }

        public Builder clearRecords() {
            o7 o7Var = this.recordsBuilder_;
            if (o7Var != null) {
                o7Var.g();
                return this;
            }
            this.records_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_descriptor;
        }

        @Override // io.p071bidmachine.protobuf.sdk.MonitorOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.p071bidmachine.protobuf.sdk.MonitorOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.p071bidmachine.protobuf.sdk.MonitorOrBuilder
        public Record getRecords(int i) {
            o7 o7Var = this.recordsBuilder_;
            return o7Var == null ? this.records_.get(i) : (Record) o7Var.l(i, false);
        }

        @Override // io.p071bidmachine.protobuf.sdk.MonitorOrBuilder
        public int getRecordsCount() {
            o7 o7Var = this.recordsBuilder_;
            return o7Var == null ? this.records_.size() : o7Var.b.size();
        }

        @Override // io.p071bidmachine.protobuf.sdk.MonitorOrBuilder
        public List<Record> getRecordsList() {
            o7 o7Var = this.recordsBuilder_;
            return o7Var == null ? Collections.unmodifiableList(this.records_) : o7Var.m();
        }

        @Override // io.p071bidmachine.protobuf.sdk.MonitorOrBuilder
        public RecordOrBuilder getRecordsOrBuilder(int i) {
            o7 o7Var = this.recordsBuilder_;
            return o7Var == null ? this.records_.get(i) : (RecordOrBuilder) o7Var.n(i);
        }

        @Override // io.p071bidmachine.protobuf.sdk.MonitorOrBuilder
        public List<? extends RecordOrBuilder> getRecordsOrBuilderList() {
            o7 o7Var = this.recordsBuilder_;
            return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.records_);
        }

        @Override // com.explorestack.protobuf.g4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_fieldAccessorTable;
            w4Var.c(Monitor.class, Builder.class);
            return w4Var;
        }

        public Builder removeRecords(int i) {
            o7 o7Var = this.recordsBuilder_;
            if (o7Var != null) {
                o7Var.r(i);
                return this;
            }
            ensureRecordsIsMutable();
            this.records_.remove(i);
            onChanged();
            return this;
        }

        public Builder setRecords(int i, Record.Builder builder) {
            o7 o7Var = this.recordsBuilder_;
            if (o7Var != null) {
                o7Var.s(i, builder.build());
                return this;
            }
            ensureRecordsIsMutable();
            this.records_.set(i, builder.build());
            onChanged();
            return this;
        }

        private void maybeForceBuilderInitialization() {
            if (y4.alwaysUseFieldBuilders) {
                getRecordsFieldBuilder();
            }
        }

        public Record.Builder addRecordsBuilder() {
            return (Record.Builder) getRecordsFieldBuilder().c(Record.getDefaultInstance());
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Monitor build() {
            Monitor monitorBuildPartial = buildPartial();
            if (monitorBuildPartial.isInitialized()) {
                return monitorBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) monitorBuildPartial);
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.name_ = "";
            o7 o7Var = this.recordsBuilder_;
            if (o7Var == null) {
                this.records_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                return this;
            }
            o7Var.g();
            return this;
        }

        public Builder clearName() {
            this.name_ = Monitor.getDefaultInstance().getName();
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo247clone() {
            return (Builder) super.mo247clone();
        }

        public Record.Builder getRecordsBuilder(int i) {
            return (Record.Builder) getRecordsFieldBuilder().j(i);
        }

        public List<Record.Builder> getRecordsBuilderList() {
            return getRecordsFieldBuilder().k();
        }

        public Builder mergeFrom(Monitor monitor) {
            if (monitor == Monitor.getDefaultInstance()) {
                return this;
            }
            if (!monitor.getName().isEmpty()) {
                this.name_ = monitor.name_;
                onChanged();
            }
            if (this.recordsBuilder_ == null) {
                if (!monitor.records_.isEmpty()) {
                    if (this.records_.isEmpty()) {
                        this.records_ = monitor.records_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureRecordsIsMutable();
                        this.records_.addAll(monitor.records_);
                    }
                    onChanged();
                }
            } else if (!monitor.records_.isEmpty()) {
                boolean zIsEmpty = this.recordsBuilder_.b.isEmpty();
                o7 o7Var = this.recordsBuilder_;
                if (zIsEmpty) {
                    o7 recordsFieldBuilder = null;
                    o7Var.a = null;
                    this.recordsBuilder_ = null;
                    this.records_ = monitor.records_;
                    this.bitField0_ &= -2;
                    if (y4.alwaysUseFieldBuilders) {
                        recordsFieldBuilder = getRecordsFieldBuilder();
                    }
                    this.recordsBuilder_ = recordsFieldBuilder;
                } else {
                    o7Var.a(monitor.records_);
                }
            }
            mergeUnknownFields(((y4) monitor).unknownFields);
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(s8 s8Var) {
            return (Builder) super.mergeUnknownFields(s8Var);
        }

        public Builder setName(String str) {
            str.getClass();
            this.name_ = str;
            onChanged();
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            byteString.getClass();
            c.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
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
        public Monitor mo250getDefaultInstanceForType() {
            return Monitor.getDefaultInstance();
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

        public Record.Builder addRecordsBuilder(int i) {
            return (Record.Builder) getRecordsFieldBuilder().b(i, Record.getDefaultInstance());
        }

        private Builder(h4 h4Var) {
            super(h4Var);
            this.name_ = "";
            this.records_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public Builder addRecords(int i, Record record) {
            o7 o7Var = this.recordsBuilder_;
            if (o7Var == null) {
                record.getClass();
                ensureRecordsIsMutable();
                this.records_.add(i, record);
                onChanged();
                return this;
            }
            o7Var.d(i, record);
            return this;
        }

        public Builder setRecords(int i, Record record) {
            o7 o7Var = this.recordsBuilder_;
            if (o7Var == null) {
                record.getClass();
                ensureRecordsIsMutable();
                this.records_.set(i, record);
                onChanged();
                return this;
            }
            o7Var.s(i, record);
            return this;
        }

        public Builder addRecords(Record record) {
            o7 o7Var = this.recordsBuilder_;
            if (o7Var == null) {
                record.getClass();
                ensureRecordsIsMutable();
                this.records_.add(record);
                onChanged();
                return this;
            }
            o7Var.e(record);
            return this;
        }

        public Builder addRecords(int i, Record.Builder builder) {
            o7 o7Var = this.recordsBuilder_;
            if (o7Var == null) {
                ensureRecordsIsMutable();
                this.records_.add(i, builder.build());
                onChanged();
                return this;
            }
            o7Var.d(i, builder.build());
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Monitor) {
                return mergeFrom((Monitor) message);
            }
            super.mergeFrom(message);
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
            Monitor monitor = null;
            try {
                try {
                    Monitor monitor2 = (Monitor) Monitor.PARSER.parsePartialFrom(rVar, o3Var);
                    if (monitor2 != null) {
                        mergeFrom(monitor2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    Monitor monitor3 = (Monitor) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        monitor = monitor3;
                        if (monitor != null) {
                            mergeFrom(monitor);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (monitor != null) {
                    mergeFrom(monitor);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Configuration extends y4 implements ConfigurationOrBuilder {
        public static final int BATCH_SIZE_FIELD_NUMBER = 3;
        public static final int FILTER_FIELD_NUMBER = 7;
        public static final int GEN_EXTENSION_FIELD_NUMBER = 8;
        public static final int IMP_EXTENSION_FIELD_NUMBER = 6;
        public static final int INTERVAL_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int SHOULD_REPORT_FIELD_NUMBER = 5;
        public static final int URL_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private UInt32Value batchSize_;
        private int configExtensionCase_;
        private Object configExtension_;
        private EventFilter filter_;
        private UInt32Value interval_;
        private byte memoizedIsInitialized;
        private StringValue name_;
        private BoolValue shouldReport_;
        private StringValue url_;
        private static final Configuration DEFAULT_INSTANCE = new Configuration();
        private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Monitor.Configuration.1
            @Override // com.explorestack.protobuf.g7
            public Configuration parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                return new Configuration(rVar, o3Var);
            }
        };

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends g4 implements ConfigurationOrBuilder {
            private v7 batchSizeBuilder_;
            private UInt32Value batchSize_;
            private int configExtensionCase_;
            private Object configExtension_;
            private v7 filterBuilder_;
            private EventFilter filter_;
            private v7 genExtensionBuilder_;
            private v7 impExtensionBuilder_;
            private v7 intervalBuilder_;
            private UInt32Value interval_;
            private v7 nameBuilder_;
            private StringValue name_;
            private v7 shouldReportBuilder_;
            private BoolValue shouldReport_;
            private v7 urlBuilder_;
            private StringValue url_;

            private Builder() {
                super(null);
                this.configExtensionCase_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder clearConfigExtension() {
                this.configExtensionCase_ = 0;
                this.configExtension_ = null;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            private v7 getBatchSizeFieldBuilder() {
                if (this.batchSizeBuilder_ == null) {
                    this.batchSizeBuilder_ = new v7(getBatchSize(), getParentForChildren(), isClean());
                    this.batchSize_ = null;
                }
                return this.batchSizeBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_descriptor;
            }

            private v7 getFilterFieldBuilder() {
                if (this.filterBuilder_ == null) {
                    this.filterBuilder_ = new v7(getFilter(), getParentForChildren(), isClean());
                    this.filter_ = null;
                }
                return this.filterBuilder_;
            }

            private v7 getGenExtensionFieldBuilder() {
                if (this.genExtensionBuilder_ == null) {
                    if (this.configExtensionCase_ != 8) {
                        this.configExtension_ = GenericExtension.getDefaultInstance();
                    }
                    this.genExtensionBuilder_ = new v7((GenericExtension) this.configExtension_, getParentForChildren(), isClean());
                    this.configExtension_ = null;
                }
                this.configExtensionCase_ = 8;
                onChanged();
                return this.genExtensionBuilder_;
            }

            private v7 getImpExtensionFieldBuilder() {
                if (this.impExtensionBuilder_ == null) {
                    if (this.configExtensionCase_ != 6) {
                        this.configExtension_ = ImpExtension.getDefaultInstance();
                    }
                    this.impExtensionBuilder_ = new v7((ImpExtension) this.configExtension_, getParentForChildren(), isClean());
                    this.configExtension_ = null;
                }
                this.configExtensionCase_ = 6;
                onChanged();
                return this.impExtensionBuilder_;
            }

            private v7 getIntervalFieldBuilder() {
                if (this.intervalBuilder_ == null) {
                    this.intervalBuilder_ = new v7(getInterval(), getParentForChildren(), isClean());
                    this.interval_ = null;
                }
                return this.intervalBuilder_;
            }

            private v7 getNameFieldBuilder() {
                if (this.nameBuilder_ == null) {
                    this.nameBuilder_ = new v7(getName(), getParentForChildren(), isClean());
                    this.name_ = null;
                }
                return this.nameBuilder_;
            }

            private v7 getShouldReportFieldBuilder() {
                if (this.shouldReportBuilder_ == null) {
                    this.shouldReportBuilder_ = new v7(getShouldReport(), getParentForChildren(), isClean());
                    this.shouldReport_ = null;
                }
                return this.shouldReportBuilder_;
            }

            private v7 getUrlFieldBuilder() {
                if (this.urlBuilder_ == null) {
                    this.urlBuilder_ = new v7(getUrl(), getParentForChildren(), isClean());
                    this.url_ = null;
                }
                return this.urlBuilder_;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Configuration buildPartial() {
                Configuration configuration = new Configuration(this);
                v7 v7Var = this.nameBuilder_;
                if (v7Var == null) {
                    configuration.name_ = this.name_;
                } else {
                    configuration.name_ = (StringValue) v7Var.a();
                }
                v7 v7Var2 = this.urlBuilder_;
                if (v7Var2 == null) {
                    configuration.url_ = this.url_;
                } else {
                    configuration.url_ = (StringValue) v7Var2.a();
                }
                v7 v7Var3 = this.batchSizeBuilder_;
                if (v7Var3 == null) {
                    configuration.batchSize_ = this.batchSize_;
                } else {
                    configuration.batchSize_ = (UInt32Value) v7Var3.a();
                }
                v7 v7Var4 = this.intervalBuilder_;
                if (v7Var4 == null) {
                    configuration.interval_ = this.interval_;
                } else {
                    configuration.interval_ = (UInt32Value) v7Var4.a();
                }
                v7 v7Var5 = this.shouldReportBuilder_;
                if (v7Var5 == null) {
                    configuration.shouldReport_ = this.shouldReport_;
                } else {
                    configuration.shouldReport_ = (BoolValue) v7Var5.a();
                }
                if (this.configExtensionCase_ == 6) {
                    v7 v7Var6 = this.impExtensionBuilder_;
                    if (v7Var6 == null) {
                        configuration.configExtension_ = this.configExtension_;
                    } else {
                        configuration.configExtension_ = v7Var6.a();
                    }
                }
                if (this.configExtensionCase_ == 8) {
                    v7 v7Var7 = this.genExtensionBuilder_;
                    if (v7Var7 == null) {
                        configuration.configExtension_ = this.configExtension_;
                    } else {
                        configuration.configExtension_ = v7Var7.a();
                    }
                }
                v7 v7Var8 = this.filterBuilder_;
                if (v7Var8 == null) {
                    configuration.filter_ = this.filter_;
                } else {
                    configuration.filter_ = (EventFilter) v7Var8.a();
                }
                configuration.configExtensionCase_ = this.configExtensionCase_;
                onBuilt();
                return configuration;
            }

            public Builder clearBatchSize() {
                if (this.batchSizeBuilder_ == null) {
                    this.batchSize_ = null;
                    onChanged();
                    return this;
                }
                this.batchSize_ = null;
                this.batchSizeBuilder_ = null;
                return this;
            }

            public Builder clearFilter() {
                if (this.filterBuilder_ == null) {
                    this.filter_ = null;
                    onChanged();
                    return this;
                }
                this.filter_ = null;
                this.filterBuilder_ = null;
                return this;
            }

            public Builder clearGenExtension() {
                v7 v7Var = this.genExtensionBuilder_;
                int i = this.configExtensionCase_;
                if (v7Var == null) {
                    if (i == 8) {
                        this.configExtensionCase_ = 0;
                        this.configExtension_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (i == 8) {
                    this.configExtensionCase_ = 0;
                    this.configExtension_ = null;
                }
                v7Var.b();
                return this;
            }

            public Builder clearImpExtension() {
                v7 v7Var = this.impExtensionBuilder_;
                int i = this.configExtensionCase_;
                if (v7Var == null) {
                    if (i == 6) {
                        this.configExtensionCase_ = 0;
                        this.configExtension_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (i == 6) {
                    this.configExtensionCase_ = 0;
                    this.configExtension_ = null;
                }
                v7Var.b();
                return this;
            }

            public Builder clearInterval() {
                if (this.intervalBuilder_ == null) {
                    this.interval_ = null;
                    onChanged();
                    return this;
                }
                this.interval_ = null;
                this.intervalBuilder_ = null;
                return this;
            }

            public Builder clearName() {
                if (this.nameBuilder_ == null) {
                    this.name_ = null;
                    onChanged();
                    return this;
                }
                this.name_ = null;
                this.nameBuilder_ = null;
                return this;
            }

            public Builder clearShouldReport() {
                if (this.shouldReportBuilder_ == null) {
                    this.shouldReport_ = null;
                    onChanged();
                    return this;
                }
                this.shouldReport_ = null;
                this.shouldReportBuilder_ = null;
                return this;
            }

            public Builder clearUrl() {
                if (this.urlBuilder_ == null) {
                    this.url_ = null;
                    onChanged();
                    return this;
                }
                this.url_ = null;
                this.urlBuilder_ = null;
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public UInt32Value getBatchSize() {
                v7 v7Var = this.batchSizeBuilder_;
                if (v7Var != null) {
                    return (UInt32Value) v7Var.d();
                }
                UInt32Value uInt32Value = this.batchSize_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public l8 getBatchSizeOrBuilder() {
                v7 v7Var = this.batchSizeBuilder_;
                if (v7Var != null) {
                    return (l8) v7Var.e();
                }
                UInt32Value uInt32Value = this.batchSize_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public ConfigExtensionCase getConfigExtensionCase() {
                return ConfigExtensionCase.forNumber(this.configExtensionCase_);
            }

            @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public EventFilter getFilter() {
                v7 v7Var = this.filterBuilder_;
                if (v7Var != null) {
                    return (EventFilter) v7Var.d();
                }
                EventFilter eventFilter = this.filter_;
                return eventFilter == null ? EventFilter.getDefaultInstance() : eventFilter;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public EventFilterOrBuilder getFilterOrBuilder() {
                v7 v7Var = this.filterBuilder_;
                if (v7Var != null) {
                    return (EventFilterOrBuilder) v7Var.e();
                }
                EventFilter eventFilter = this.filter_;
                return eventFilter == null ? EventFilter.getDefaultInstance() : eventFilter;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public GenericExtension getGenExtension() {
                v7 v7Var = this.genExtensionBuilder_;
                int i = this.configExtensionCase_;
                if (v7Var == null) {
                    return i == 8 ? (GenericExtension) this.configExtension_ : GenericExtension.getDefaultInstance();
                }
                return i == 8 ? (GenericExtension) v7Var.d() : GenericExtension.getDefaultInstance();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public GenericExtensionOrBuilder getGenExtensionOrBuilder() {
                v7 v7Var;
                int i = this.configExtensionCase_;
                if (i != 8 || (v7Var = this.genExtensionBuilder_) == null) {
                    return i == 8 ? (GenericExtension) this.configExtension_ : GenericExtension.getDefaultInstance();
                }
                return (GenericExtensionOrBuilder) v7Var.e();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public ImpExtension getImpExtension() {
                v7 v7Var = this.impExtensionBuilder_;
                int i = this.configExtensionCase_;
                if (v7Var == null) {
                    return i == 6 ? (ImpExtension) this.configExtension_ : ImpExtension.getDefaultInstance();
                }
                return i == 6 ? (ImpExtension) v7Var.d() : ImpExtension.getDefaultInstance();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public ImpExtensionOrBuilder getImpExtensionOrBuilder() {
                v7 v7Var;
                int i = this.configExtensionCase_;
                if (i != 6 || (v7Var = this.impExtensionBuilder_) == null) {
                    return i == 6 ? (ImpExtension) this.configExtension_ : ImpExtension.getDefaultInstance();
                }
                return (ImpExtensionOrBuilder) v7Var.e();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public UInt32Value getInterval() {
                v7 v7Var = this.intervalBuilder_;
                if (v7Var != null) {
                    return (UInt32Value) v7Var.d();
                }
                UInt32Value uInt32Value = this.interval_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public l8 getIntervalOrBuilder() {
                v7 v7Var = this.intervalBuilder_;
                if (v7Var != null) {
                    return (l8) v7Var.e();
                }
                UInt32Value uInt32Value = this.interval_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public StringValue getName() {
                v7 v7Var = this.nameBuilder_;
                if (v7Var != null) {
                    return (StringValue) v7Var.d();
                }
                StringValue stringValue = this.name_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public b8 getNameOrBuilder() {
                v7 v7Var = this.nameBuilder_;
                if (v7Var != null) {
                    return (b8) v7Var.e();
                }
                StringValue stringValue = this.name_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public BoolValue getShouldReport() {
                v7 v7Var = this.shouldReportBuilder_;
                if (v7Var != null) {
                    return (BoolValue) v7Var.d();
                }
                BoolValue boolValue = this.shouldReport_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public i getShouldReportOrBuilder() {
                v7 v7Var = this.shouldReportBuilder_;
                if (v7Var != null) {
                    return (i) v7Var.e();
                }
                BoolValue boolValue = this.shouldReport_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public StringValue getUrl() {
                v7 v7Var = this.urlBuilder_;
                if (v7Var != null) {
                    return (StringValue) v7Var.d();
                }
                StringValue stringValue = this.url_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public b8 getUrlOrBuilder() {
                v7 v7Var = this.urlBuilder_;
                if (v7Var != null) {
                    return (b8) v7Var.e();
                }
                StringValue stringValue = this.url_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public boolean hasBatchSize() {
                return (this.batchSizeBuilder_ == null && this.batchSize_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public boolean hasFilter() {
                return (this.filterBuilder_ == null && this.filter_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public boolean hasGenExtension() {
                return this.configExtensionCase_ == 8;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public boolean hasImpExtension() {
                return this.configExtensionCase_ == 6;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public boolean hasInterval() {
                return (this.intervalBuilder_ == null && this.interval_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public boolean hasName() {
                return (this.nameBuilder_ == null && this.name_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public boolean hasShouldReport() {
                return (this.shouldReportBuilder_ == null && this.shouldReport_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public boolean hasUrl() {
                return (this.urlBuilder_ == null && this.url_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.g4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_fieldAccessorTable;
                w4Var.c(Configuration.class, Builder.class);
                return w4Var;
            }

            public Builder mergeBatchSize(UInt32Value uInt32Value) {
                v7 v7Var = this.batchSizeBuilder_;
                if (v7Var != null) {
                    v7Var.f(uInt32Value);
                    return this;
                }
                UInt32Value uInt32Value2 = this.batchSize_;
                if (uInt32Value2 != null) {
                    this.batchSize_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                } else {
                    this.batchSize_ = uInt32Value;
                }
                onChanged();
                return this;
            }

            public Builder mergeFilter(EventFilter eventFilter) {
                v7 v7Var = this.filterBuilder_;
                if (v7Var != null) {
                    v7Var.f(eventFilter);
                    return this;
                }
                EventFilter eventFilter2 = this.filter_;
                if (eventFilter2 != null) {
                    this.filter_ = EventFilter.newBuilder(eventFilter2).mergeFrom(eventFilter).buildPartial();
                } else {
                    this.filter_ = eventFilter;
                }
                onChanged();
                return this;
            }

            public Builder mergeGenExtension(GenericExtension genericExtension) {
                v7 v7Var = this.genExtensionBuilder_;
                int i = this.configExtensionCase_;
                if (v7Var == null) {
                    if (i != 8 || this.configExtension_ == GenericExtension.getDefaultInstance()) {
                        this.configExtension_ = genericExtension;
                    } else {
                        this.configExtension_ = GenericExtension.newBuilder((GenericExtension) this.configExtension_).mergeFrom(genericExtension).buildPartial();
                    }
                    onChanged();
                } else {
                    if (i == 8) {
                        v7Var.f(genericExtension);
                    }
                    this.genExtensionBuilder_.h(genericExtension);
                }
                this.configExtensionCase_ = 8;
                return this;
            }

            public Builder mergeImpExtension(ImpExtension impExtension) {
                v7 v7Var = this.impExtensionBuilder_;
                int i = this.configExtensionCase_;
                if (v7Var == null) {
                    if (i != 6 || this.configExtension_ == ImpExtension.getDefaultInstance()) {
                        this.configExtension_ = impExtension;
                    } else {
                        this.configExtension_ = ImpExtension.newBuilder((ImpExtension) this.configExtension_).mergeFrom(impExtension).buildPartial();
                    }
                    onChanged();
                } else {
                    if (i == 6) {
                        v7Var.f(impExtension);
                    }
                    this.impExtensionBuilder_.h(impExtension);
                }
                this.configExtensionCase_ = 6;
                return this;
            }

            public Builder mergeInterval(UInt32Value uInt32Value) {
                v7 v7Var = this.intervalBuilder_;
                if (v7Var != null) {
                    v7Var.f(uInt32Value);
                    return this;
                }
                UInt32Value uInt32Value2 = this.interval_;
                if (uInt32Value2 != null) {
                    this.interval_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                } else {
                    this.interval_ = uInt32Value;
                }
                onChanged();
                return this;
            }

            public Builder mergeName(StringValue stringValue) {
                v7 v7Var = this.nameBuilder_;
                if (v7Var != null) {
                    v7Var.f(stringValue);
                    return this;
                }
                StringValue stringValue2 = this.name_;
                if (stringValue2 != null) {
                    this.name_ = io.p071bidmachine.media3.common.util.b.b(stringValue2, stringValue);
                } else {
                    this.name_ = stringValue;
                }
                onChanged();
                return this;
            }

            public Builder mergeShouldReport(BoolValue boolValue) {
                v7 v7Var = this.shouldReportBuilder_;
                if (v7Var != null) {
                    v7Var.f(boolValue);
                    return this;
                }
                BoolValue boolValue2 = this.shouldReport_;
                if (boolValue2 != null) {
                    this.shouldReport_ = BoolValue.newBuilder(boolValue2).mergeFrom(boolValue).buildPartial();
                } else {
                    this.shouldReport_ = boolValue;
                }
                onChanged();
                return this;
            }

            public Builder mergeUrl(StringValue stringValue) {
                v7 v7Var = this.urlBuilder_;
                if (v7Var != null) {
                    v7Var.f(stringValue);
                    return this;
                }
                StringValue stringValue2 = this.url_;
                if (stringValue2 != null) {
                    this.url_ = io.p071bidmachine.media3.common.util.b.b(stringValue2, stringValue);
                } else {
                    this.url_ = stringValue;
                }
                onChanged();
                return this;
            }

            public Builder setBatchSize(UInt32Value.Builder builder) {
                v7 v7Var = this.batchSizeBuilder_;
                if (v7Var != null) {
                    v7Var.h(builder.build());
                    return this;
                }
                this.batchSize_ = builder.build();
                onChanged();
                return this;
            }

            public Builder setFilter(EventFilter.Builder builder) {
                v7 v7Var = this.filterBuilder_;
                if (v7Var != null) {
                    v7Var.h(builder.build());
                    return this;
                }
                this.filter_ = builder.build();
                onChanged();
                return this;
            }

            public Builder setGenExtension(GenericExtension.Builder builder) {
                v7 v7Var = this.genExtensionBuilder_;
                if (v7Var == null) {
                    this.configExtension_ = builder.build();
                    onChanged();
                } else {
                    v7Var.h(builder.build());
                }
                this.configExtensionCase_ = 8;
                return this;
            }

            public Builder setImpExtension(ImpExtension.Builder builder) {
                v7 v7Var = this.impExtensionBuilder_;
                if (v7Var == null) {
                    this.configExtension_ = builder.build();
                    onChanged();
                } else {
                    v7Var.h(builder.build());
                }
                this.configExtensionCase_ = 6;
                return this;
            }

            public Builder setInterval(UInt32Value.Builder builder) {
                v7 v7Var = this.intervalBuilder_;
                if (v7Var != null) {
                    v7Var.h(builder.build());
                    return this;
                }
                this.interval_ = builder.build();
                onChanged();
                return this;
            }

            public Builder setName(StringValue.Builder builder) {
                v7 v7Var = this.nameBuilder_;
                if (v7Var != null) {
                    v7Var.h(builder.build());
                    return this;
                }
                this.name_ = builder.build();
                onChanged();
                return this;
            }

            public Builder setShouldReport(BoolValue.Builder builder) {
                v7 v7Var = this.shouldReportBuilder_;
                if (v7Var != null) {
                    v7Var.h(builder.build());
                    return this;
                }
                this.shouldReport_ = builder.build();
                onChanged();
                return this;
            }

            public Builder setUrl(StringValue.Builder builder) {
                v7 v7Var = this.urlBuilder_;
                if (v7Var != null) {
                    v7Var.h(builder.build());
                    return this;
                }
                this.url_ = builder.build();
                onChanged();
                return this;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = y4.alwaysUseFieldBuilders;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Configuration build() {
                Configuration configurationBuildPartial = buildPartial();
                if (configurationBuildPartial.isInitialized()) {
                    return configurationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configurationBuildPartial);
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                if (this.nameBuilder_ == null) {
                    this.name_ = null;
                } else {
                    this.name_ = null;
                    this.nameBuilder_ = null;
                }
                if (this.urlBuilder_ == null) {
                    this.url_ = null;
                } else {
                    this.url_ = null;
                    this.urlBuilder_ = null;
                }
                if (this.batchSizeBuilder_ == null) {
                    this.batchSize_ = null;
                } else {
                    this.batchSize_ = null;
                    this.batchSizeBuilder_ = null;
                }
                if (this.intervalBuilder_ == null) {
                    this.interval_ = null;
                } else {
                    this.interval_ = null;
                    this.intervalBuilder_ = null;
                }
                if (this.shouldReportBuilder_ == null) {
                    this.shouldReport_ = null;
                } else {
                    this.shouldReport_ = null;
                    this.shouldReportBuilder_ = null;
                }
                if (this.filterBuilder_ == null) {
                    this.filter_ = null;
                } else {
                    this.filter_ = null;
                    this.filterBuilder_ = null;
                }
                this.configExtensionCase_ = 0;
                this.configExtension_ = null;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo247clone() {
                return (Builder) super.mo247clone();
            }

            public UInt32Value.Builder getBatchSizeBuilder() {
                onChanged();
                return (UInt32Value.Builder) getBatchSizeFieldBuilder().c();
            }

            public EventFilter.Builder getFilterBuilder() {
                onChanged();
                return (EventFilter.Builder) getFilterFieldBuilder().c();
            }

            public GenericExtension.Builder getGenExtensionBuilder() {
                return (GenericExtension.Builder) getGenExtensionFieldBuilder().c();
            }

            public ImpExtension.Builder getImpExtensionBuilder() {
                return (ImpExtension.Builder) getImpExtensionFieldBuilder().c();
            }

            public UInt32Value.Builder getIntervalBuilder() {
                onChanged();
                return (UInt32Value.Builder) getIntervalFieldBuilder().c();
            }

            public StringValue.Builder getNameBuilder() {
                onChanged();
                return (StringValue.Builder) getNameFieldBuilder().c();
            }

            public BoolValue.Builder getShouldReportBuilder() {
                onChanged();
                return (BoolValue.Builder) getShouldReportFieldBuilder().c();
            }

            public StringValue.Builder getUrlBuilder() {
                onChanged();
                return (StringValue.Builder) getUrlFieldBuilder().c();
            }

            public Builder mergeFrom(Configuration configuration) {
                if (configuration == Configuration.getDefaultInstance()) {
                    return this;
                }
                if (configuration.hasName()) {
                    mergeName(configuration.getName());
                }
                if (configuration.hasUrl()) {
                    mergeUrl(configuration.getUrl());
                }
                if (configuration.hasBatchSize()) {
                    mergeBatchSize(configuration.getBatchSize());
                }
                if (configuration.hasInterval()) {
                    mergeInterval(configuration.getInterval());
                }
                if (configuration.hasShouldReport()) {
                    mergeShouldReport(configuration.getShouldReport());
                }
                if (configuration.hasFilter()) {
                    mergeFilter(configuration.getFilter());
                }
                int i = AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$sdk$Monitor$Configuration$ConfigExtensionCase[configuration.getConfigExtensionCase().ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        mergeGenExtension(configuration.getGenExtension());
                    }
                } else {
                    mergeImpExtension(configuration.getImpExtension());
                }
                mergeUnknownFields(((y4) configuration).unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(s8 s8Var) {
                return (Builder) super.mergeUnknownFields(s8Var);
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
            public Configuration mo250getDefaultInstanceForType() {
                return Configuration.getDefaultInstance();
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
                this.configExtensionCase_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setBatchSize(UInt32Value uInt32Value) {
                v7 v7Var = this.batchSizeBuilder_;
                if (v7Var == null) {
                    uInt32Value.getClass();
                    this.batchSize_ = uInt32Value;
                    onChanged();
                    return this;
                }
                v7Var.h(uInt32Value);
                return this;
            }

            public Builder setFilter(EventFilter eventFilter) {
                v7 v7Var = this.filterBuilder_;
                if (v7Var == null) {
                    eventFilter.getClass();
                    this.filter_ = eventFilter;
                    onChanged();
                    return this;
                }
                v7Var.h(eventFilter);
                return this;
            }

            public Builder setInterval(UInt32Value uInt32Value) {
                v7 v7Var = this.intervalBuilder_;
                if (v7Var == null) {
                    uInt32Value.getClass();
                    this.interval_ = uInt32Value;
                    onChanged();
                    return this;
                }
                v7Var.h(uInt32Value);
                return this;
            }

            public Builder setName(StringValue stringValue) {
                v7 v7Var = this.nameBuilder_;
                if (v7Var == null) {
                    stringValue.getClass();
                    this.name_ = stringValue;
                    onChanged();
                    return this;
                }
                v7Var.h(stringValue);
                return this;
            }

            public Builder setShouldReport(BoolValue boolValue) {
                v7 v7Var = this.shouldReportBuilder_;
                if (v7Var == null) {
                    boolValue.getClass();
                    this.shouldReport_ = boolValue;
                    onChanged();
                    return this;
                }
                v7Var.h(boolValue);
                return this;
            }

            public Builder setUrl(StringValue stringValue) {
                v7 v7Var = this.urlBuilder_;
                if (v7Var == null) {
                    stringValue.getClass();
                    this.url_ = stringValue;
                    onChanged();
                    return this;
                }
                v7Var.h(stringValue);
                return this;
            }

            public Builder setImpExtension(ImpExtension impExtension) {
                v7 v7Var = this.impExtensionBuilder_;
                if (v7Var == null) {
                    impExtension.getClass();
                    this.configExtension_ = impExtension;
                    onChanged();
                } else {
                    v7Var.h(impExtension);
                }
                this.configExtensionCase_ = 6;
                return this;
            }

            public Builder setGenExtension(GenericExtension genericExtension) {
                v7 v7Var = this.genExtensionBuilder_;
                if (v7Var == null) {
                    genericExtension.getClass();
                    this.configExtension_ = genericExtension;
                    onChanged();
                } else {
                    v7Var.h(genericExtension);
                }
                this.configExtensionCase_ = 8;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Configuration) {
                    return mergeFrom((Configuration) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                Configuration configuration = null;
                try {
                    try {
                        Configuration configuration2 = (Configuration) Configuration.PARSER.parsePartialFrom(rVar, o3Var);
                        if (configuration2 != null) {
                            mergeFrom(configuration2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Configuration configuration3 = (Configuration) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            configuration = configuration3;
                            if (configuration != null) {
                                mergeFrom(configuration);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (configuration != null) {
                        mergeFrom(configuration);
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public enum ConfigExtensionCase implements c5 {
            IMP_EXTENSION(6),
            GEN_EXTENSION(8),
            CONFIGEXTENSION_NOT_SET(0);

            private final int value;

            public static ConfigExtensionCase forNumber(int i) {
                if (i == 0) {
                    return CONFIGEXTENSION_NOT_SET;
                }
                if (i == 6) {
                    return IMP_EXTENSION;
                }
                if (i != 8) {
                    return null;
                }
                return GEN_EXTENSION;
            }

            @Override // com.explorestack.protobuf.c5
            public int getNumber() {
                return this.value;
            }

            ConfigExtensionCase(int i) {
                this.value = i;
            }

            @Deprecated
            public static ConfigExtensionCase valueOf(int i) {
                return forNumber(i);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class GenericExtension extends y4 implements GenericExtensionOrBuilder {
            public static final int CONFIG_FIELD_NUMBER = 1;
            private static final GenericExtension DEFAULT_INSTANCE = new GenericExtension();
            private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Monitor.Configuration.GenericExtension.1
                @Override // com.explorestack.protobuf.g7
                public GenericExtension parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                    return new GenericExtension(rVar, o3Var);
                }
            };
            private static final long serialVersionUID = 0;
            private StringValue config_;
            private byte memoizedIsInitialized;

            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            public static final class Builder extends g4 implements GenericExtensionOrBuilder {
                private v7 configBuilder_;
                private StringValue config_;

                private Builder() {
                    super(null);
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                    GenericExtension genericExtension = null;
                    try {
                        try {
                            GenericExtension genericExtension2 = (GenericExtension) GenericExtension.PARSER.parsePartialFrom(rVar, o3Var);
                            if (genericExtension2 != null) {
                                mergeFrom(genericExtension2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            GenericExtension genericExtension3 = (GenericExtension) e.getUnfinishedMessage();
                            try {
                                throw e.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                genericExtension = genericExtension3;
                                if (genericExtension != null) {
                                    mergeFrom(genericExtension);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (genericExtension != null) {
                            mergeFrom(genericExtension);
                        }
                        throw th;
                    }
                }

                private v7 getConfigFieldBuilder() {
                    if (this.configBuilder_ == null) {
                        this.configBuilder_ = new v7(getConfig(), getParentForChildren(), isClean());
                        this.config_ = null;
                    }
                    return this.configBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_GenericExtension_descriptor;
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public GenericExtension buildPartial() {
                    GenericExtension genericExtension = new GenericExtension(this);
                    v7 v7Var = this.configBuilder_;
                    if (v7Var == null) {
                        genericExtension.config_ = this.config_;
                    } else {
                        genericExtension.config_ = (StringValue) v7Var.a();
                    }
                    onBuilt();
                    return genericExtension;
                }

                public Builder clearConfig() {
                    if (this.configBuilder_ == null) {
                        this.config_ = null;
                        onChanged();
                        return this;
                    }
                    this.config_ = null;
                    this.configBuilder_ = null;
                    return this;
                }

                @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.GenericExtensionOrBuilder
                public StringValue getConfig() {
                    v7 v7Var = this.configBuilder_;
                    if (v7Var != null) {
                        return (StringValue) v7Var.d();
                    }
                    StringValue stringValue = this.config_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.GenericExtensionOrBuilder
                public b8 getConfigOrBuilder() {
                    v7 v7Var = this.configBuilder_;
                    if (v7Var != null) {
                        return (b8) v7Var.e();
                    }
                    StringValue stringValue = this.config_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_GenericExtension_descriptor;
                }

                @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.GenericExtensionOrBuilder
                public boolean hasConfig() {
                    return (this.configBuilder_ == null && this.config_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.g4
                public w4 internalGetFieldAccessorTable() {
                    w4 w4Var = SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_GenericExtension_fieldAccessorTable;
                    w4Var.c(GenericExtension.class, Builder.class);
                    return w4Var;
                }

                public Builder mergeConfig(StringValue stringValue) {
                    v7 v7Var = this.configBuilder_;
                    if (v7Var != null) {
                        v7Var.f(stringValue);
                        return this;
                    }
                    StringValue stringValue2 = this.config_;
                    if (stringValue2 != null) {
                        this.config_ = io.p071bidmachine.media3.common.util.b.b(stringValue2, stringValue);
                    } else {
                        this.config_ = stringValue;
                    }
                    onChanged();
                    return this;
                }

                public Builder setConfig(StringValue.Builder builder) {
                    v7 v7Var = this.configBuilder_;
                    if (v7Var != null) {
                        v7Var.h(builder.build());
                        return this;
                    }
                    this.config_ = builder.build();
                    onChanged();
                    return this;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = y4.alwaysUseFieldBuilders;
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public GenericExtension build() {
                    GenericExtension genericExtensionBuildPartial = buildPartial();
                    if (genericExtensionBuildPartial.isInitialized()) {
                        return genericExtensionBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) genericExtensionBuildPartial);
                }

                @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    if (this.configBuilder_ == null) {
                        this.config_ = null;
                        return this;
                    }
                    this.config_ = null;
                    this.configBuilder_ = null;
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo247clone() {
                    return (Builder) super.mo247clone();
                }

                public StringValue.Builder getConfigBuilder() {
                    onChanged();
                    return (StringValue.Builder) getConfigFieldBuilder().c();
                }

                @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public final Builder mergeUnknownFields(s8 s8Var) {
                    return (Builder) super.mergeUnknownFields(s8Var);
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
                public GenericExtension mo250getDefaultInstanceForType() {
                    return GenericExtension.getDefaultInstance();
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

                public Builder setConfig(StringValue stringValue) {
                    v7 v7Var = this.configBuilder_;
                    if (v7Var == null) {
                        stringValue.getClass();
                        this.config_ = stringValue;
                        onChanged();
                        return this;
                    }
                    v7Var.h(stringValue);
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof GenericExtension) {
                        return mergeFrom((GenericExtension) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(GenericExtension genericExtension) {
                    if (genericExtension == GenericExtension.getDefaultInstance()) {
                        return this;
                    }
                    if (genericExtension.hasConfig()) {
                        mergeConfig(genericExtension.getConfig());
                    }
                    mergeUnknownFields(((y4) genericExtension).unknownFields);
                    onChanged();
                    return this;
                }
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof GenericExtension)) {
                    return super.equals(obj);
                }
                GenericExtension genericExtension = (GenericExtension) obj;
                if (hasConfig() != genericExtension.hasConfig()) {
                    return false;
                }
                return (!hasConfig() || getConfig().equals(genericExtension.getConfig())) && this.unknownFields.equals(genericExtension.unknownFields);
            }

            public static GenericExtension getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_GenericExtension_descriptor;
            }

            public static Builder newBuilder(GenericExtension genericExtension) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(genericExtension);
            }

            public static GenericExtension parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (GenericExtension) y4.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static GenericExtension parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (GenericExtension) PARSER.parseFrom(byteBuffer);
            }

            public static g7 parser() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.GenericExtensionOrBuilder
            public StringValue getConfig() {
                StringValue stringValue = this.config_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
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
                int serializedSize = this.unknownFields.getSerializedSize() + (this.config_ != null ? w.o(1, getConfig()) : 0);
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final s8 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.GenericExtensionOrBuilder
            public boolean hasConfig() {
                return this.config_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = getDescriptor().hashCode() + 779;
                if (hasConfig()) {
                    iHashCode = pv1.c(iHashCode, 37, 1, 53) + getConfig().hashCode();
                }
                int iHashCode2 = this.unknownFields.a.hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.y4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_GenericExtension_fieldAccessorTable;
                w4Var.c(GenericExtension.class, Builder.class);
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
                return new GenericExtension();
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(w wVar) throws IOException {
                if (this.config_ != null) {
                    wVar.M(1, getConfig());
                }
                this.unknownFields.writeTo(wVar);
            }

            private GenericExtension(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                StringValue.Builder builder;
                this();
                o3Var.getClass();
                p8 p8VarB = s8.b();
                boolean z = false;
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
                                        StringValue stringValue = this.config_;
                                        if (stringValue != null) {
                                            builder = stringValue.toBuilder();
                                        } else {
                                            builder = null;
                                        }
                                        StringValue stringValue2 = (StringValue) rVar.v(StringValue.parser(), o3Var);
                                        this.config_ = stringValue2;
                                        if (builder != null) {
                                            builder.mergeFrom(stringValue2);
                                            this.config_ = builder.buildPartial();
                                        }
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e) {
                                throw e.setUnfinishedMessage(this);
                            }
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

            @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.GenericExtensionOrBuilder
            public b8 getConfigOrBuilder() {
                return getConfig();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public GenericExtension mo250getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static GenericExtension parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
                return (GenericExtension) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
            }

            public static GenericExtension parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
                return (GenericExtension) PARSER.parseFrom(byteBuffer, o3Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static GenericExtension parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (GenericExtension) PARSER.parseFrom(byteString);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static GenericExtension parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
                return (GenericExtension) PARSER.parseFrom(byteString, o3Var);
            }

            public static GenericExtension parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (GenericExtension) PARSER.parseFrom(bArr);
            }

            public static GenericExtension parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
                return (GenericExtension) PARSER.parseFrom(bArr, o3Var);
            }

            public static GenericExtension parseFrom(InputStream inputStream) throws IOException {
                return (GenericExtension) y4.parseWithIOException(PARSER, inputStream);
            }

            public static GenericExtension parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
                return (GenericExtension) y4.parseWithIOException(PARSER, inputStream, o3Var);
            }

            public static GenericExtension parseFrom(r rVar) throws IOException {
                return (GenericExtension) y4.parseWithIOException(PARSER, rVar);
            }

            public static GenericExtension parseFrom(r rVar, o3 o3Var) throws IOException {
                return (GenericExtension) y4.parseWithIOException(PARSER, rVar, o3Var);
            }

            private GenericExtension(g4 g4Var) {
                super(g4Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            private GenericExtension() {
                this.memoizedIsInitialized = (byte) -1;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public interface GenericExtensionOrBuilder extends MessageOrBuilder {
            StringValue getConfig();

            b8 getConfigOrBuilder();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo250getDefaultInstanceForType();

            boolean hasConfig();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class ImpExtension extends y4 implements ImpExtensionOrBuilder {
            public static final int IAA_QUERY_FIELD_NUMBER = 1;
            public static final int TTL_SECONDS_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private StringValue iaaQuery_;
            private byte memoizedIsInitialized;
            private UInt32Value ttlSeconds_;
            private static final ImpExtension DEFAULT_INSTANCE = new ImpExtension();
            private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Monitor.Configuration.ImpExtension.1
                @Override // com.explorestack.protobuf.g7
                public ImpExtension parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                    return new ImpExtension(rVar, o3Var);
                }
            };

            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            public static final class Builder extends g4 implements ImpExtensionOrBuilder {
                private v7 iaaQueryBuilder_;
                private StringValue iaaQuery_;
                private v7 ttlSecondsBuilder_;
                private UInt32Value ttlSeconds_;

                private Builder() {
                    super(null);
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_ImpExtension_descriptor;
                }

                private v7 getIaaQueryFieldBuilder() {
                    if (this.iaaQueryBuilder_ == null) {
                        this.iaaQueryBuilder_ = new v7(getIaaQuery(), getParentForChildren(), isClean());
                        this.iaaQuery_ = null;
                    }
                    return this.iaaQueryBuilder_;
                }

                private v7 getTtlSecondsFieldBuilder() {
                    if (this.ttlSecondsBuilder_ == null) {
                        this.ttlSecondsBuilder_ = new v7(getTtlSeconds(), getParentForChildren(), isClean());
                        this.ttlSeconds_ = null;
                    }
                    return this.ttlSecondsBuilder_;
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public ImpExtension buildPartial() {
                    ImpExtension impExtension = new ImpExtension(this);
                    v7 v7Var = this.iaaQueryBuilder_;
                    if (v7Var == null) {
                        impExtension.iaaQuery_ = this.iaaQuery_;
                    } else {
                        impExtension.iaaQuery_ = (StringValue) v7Var.a();
                    }
                    v7 v7Var2 = this.ttlSecondsBuilder_;
                    if (v7Var2 == null) {
                        impExtension.ttlSeconds_ = this.ttlSeconds_;
                    } else {
                        impExtension.ttlSeconds_ = (UInt32Value) v7Var2.a();
                    }
                    onBuilt();
                    return impExtension;
                }

                public Builder clearIaaQuery() {
                    if (this.iaaQueryBuilder_ == null) {
                        this.iaaQuery_ = null;
                        onChanged();
                        return this;
                    }
                    this.iaaQuery_ = null;
                    this.iaaQueryBuilder_ = null;
                    return this;
                }

                public Builder clearTtlSeconds() {
                    if (this.ttlSecondsBuilder_ == null) {
                        this.ttlSeconds_ = null;
                        onChanged();
                        return this;
                    }
                    this.ttlSeconds_ = null;
                    this.ttlSecondsBuilder_ = null;
                    return this;
                }

                @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_ImpExtension_descriptor;
                }

                @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.ImpExtensionOrBuilder
                public StringValue getIaaQuery() {
                    v7 v7Var = this.iaaQueryBuilder_;
                    if (v7Var != null) {
                        return (StringValue) v7Var.d();
                    }
                    StringValue stringValue = this.iaaQuery_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.ImpExtensionOrBuilder
                public b8 getIaaQueryOrBuilder() {
                    v7 v7Var = this.iaaQueryBuilder_;
                    if (v7Var != null) {
                        return (b8) v7Var.e();
                    }
                    StringValue stringValue = this.iaaQuery_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.ImpExtensionOrBuilder
                public UInt32Value getTtlSeconds() {
                    v7 v7Var = this.ttlSecondsBuilder_;
                    if (v7Var != null) {
                        return (UInt32Value) v7Var.d();
                    }
                    UInt32Value uInt32Value = this.ttlSeconds_;
                    return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
                }

                @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.ImpExtensionOrBuilder
                public l8 getTtlSecondsOrBuilder() {
                    v7 v7Var = this.ttlSecondsBuilder_;
                    if (v7Var != null) {
                        return (l8) v7Var.e();
                    }
                    UInt32Value uInt32Value = this.ttlSeconds_;
                    return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
                }

                @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.ImpExtensionOrBuilder
                public boolean hasIaaQuery() {
                    return (this.iaaQueryBuilder_ == null && this.iaaQuery_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.ImpExtensionOrBuilder
                public boolean hasTtlSeconds() {
                    return (this.ttlSecondsBuilder_ == null && this.ttlSeconds_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.g4
                public w4 internalGetFieldAccessorTable() {
                    w4 w4Var = SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_ImpExtension_fieldAccessorTable;
                    w4Var.c(ImpExtension.class, Builder.class);
                    return w4Var;
                }

                public Builder mergeIaaQuery(StringValue stringValue) {
                    v7 v7Var = this.iaaQueryBuilder_;
                    if (v7Var != null) {
                        v7Var.f(stringValue);
                        return this;
                    }
                    StringValue stringValue2 = this.iaaQuery_;
                    if (stringValue2 != null) {
                        this.iaaQuery_ = io.p071bidmachine.media3.common.util.b.b(stringValue2, stringValue);
                    } else {
                        this.iaaQuery_ = stringValue;
                    }
                    onChanged();
                    return this;
                }

                public Builder mergeTtlSeconds(UInt32Value uInt32Value) {
                    v7 v7Var = this.ttlSecondsBuilder_;
                    if (v7Var != null) {
                        v7Var.f(uInt32Value);
                        return this;
                    }
                    UInt32Value uInt32Value2 = this.ttlSeconds_;
                    if (uInt32Value2 != null) {
                        this.ttlSeconds_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                    } else {
                        this.ttlSeconds_ = uInt32Value;
                    }
                    onChanged();
                    return this;
                }

                public Builder setIaaQuery(StringValue.Builder builder) {
                    v7 v7Var = this.iaaQueryBuilder_;
                    if (v7Var != null) {
                        v7Var.h(builder.build());
                        return this;
                    }
                    this.iaaQuery_ = builder.build();
                    onChanged();
                    return this;
                }

                public Builder setTtlSeconds(UInt32Value.Builder builder) {
                    v7 v7Var = this.ttlSecondsBuilder_;
                    if (v7Var != null) {
                        v7Var.h(builder.build());
                        return this;
                    }
                    this.ttlSeconds_ = builder.build();
                    onChanged();
                    return this;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = y4.alwaysUseFieldBuilders;
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public ImpExtension build() {
                    ImpExtension impExtensionBuildPartial = buildPartial();
                    if (impExtensionBuildPartial.isInitialized()) {
                        return impExtensionBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) impExtensionBuildPartial);
                }

                @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    if (this.iaaQueryBuilder_ == null) {
                        this.iaaQuery_ = null;
                    } else {
                        this.iaaQuery_ = null;
                        this.iaaQueryBuilder_ = null;
                    }
                    if (this.ttlSecondsBuilder_ == null) {
                        this.ttlSeconds_ = null;
                        return this;
                    }
                    this.ttlSeconds_ = null;
                    this.ttlSecondsBuilder_ = null;
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo247clone() {
                    return (Builder) super.mo247clone();
                }

                public StringValue.Builder getIaaQueryBuilder() {
                    onChanged();
                    return (StringValue.Builder) getIaaQueryFieldBuilder().c();
                }

                public UInt32Value.Builder getTtlSecondsBuilder() {
                    onChanged();
                    return (UInt32Value.Builder) getTtlSecondsFieldBuilder().c();
                }

                public Builder mergeFrom(ImpExtension impExtension) {
                    if (impExtension == ImpExtension.getDefaultInstance()) {
                        return this;
                    }
                    if (impExtension.hasIaaQuery()) {
                        mergeIaaQuery(impExtension.getIaaQuery());
                    }
                    if (impExtension.hasTtlSeconds()) {
                        mergeTtlSeconds(impExtension.getTtlSeconds());
                    }
                    mergeUnknownFields(((y4) impExtension).unknownFields);
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public final Builder mergeUnknownFields(s8 s8Var) {
                    return (Builder) super.mergeUnknownFields(s8Var);
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
                public ImpExtension mo250getDefaultInstanceForType() {
                    return ImpExtension.getDefaultInstance();
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

                public Builder setIaaQuery(StringValue stringValue) {
                    v7 v7Var = this.iaaQueryBuilder_;
                    if (v7Var == null) {
                        stringValue.getClass();
                        this.iaaQuery_ = stringValue;
                        onChanged();
                        return this;
                    }
                    v7Var.h(stringValue);
                    return this;
                }

                public Builder setTtlSeconds(UInt32Value uInt32Value) {
                    v7 v7Var = this.ttlSecondsBuilder_;
                    if (v7Var == null) {
                        uInt32Value.getClass();
                        this.ttlSeconds_ = uInt32Value;
                        onChanged();
                        return this;
                    }
                    v7Var.h(uInt32Value);
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof ImpExtension) {
                        return mergeFrom((ImpExtension) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                    ImpExtension impExtension = null;
                    try {
                        try {
                            ImpExtension impExtension2 = (ImpExtension) ImpExtension.PARSER.parsePartialFrom(rVar, o3Var);
                            if (impExtension2 != null) {
                                mergeFrom(impExtension2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            ImpExtension impExtension3 = (ImpExtension) e.getUnfinishedMessage();
                            try {
                                throw e.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                impExtension = impExtension3;
                                if (impExtension != null) {
                                    mergeFrom(impExtension);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (impExtension != null) {
                            mergeFrom(impExtension);
                        }
                        throw th;
                    }
                }
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ImpExtension)) {
                    return super.equals(obj);
                }
                ImpExtension impExtension = (ImpExtension) obj;
                if (hasIaaQuery() != impExtension.hasIaaQuery()) {
                    return false;
                }
                if ((!hasIaaQuery() || getIaaQuery().equals(impExtension.getIaaQuery())) && hasTtlSeconds() == impExtension.hasTtlSeconds()) {
                    return (!hasTtlSeconds() || getTtlSeconds().equals(impExtension.getTtlSeconds())) && this.unknownFields.equals(impExtension.unknownFields);
                }
                return false;
            }

            public static ImpExtension getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_ImpExtension_descriptor;
            }

            public static Builder newBuilder(ImpExtension impExtension) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(impExtension);
            }

            public static ImpExtension parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (ImpExtension) y4.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static ImpExtension parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (ImpExtension) PARSER.parseFrom(byteBuffer);
            }

            public static g7 parser() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.ImpExtensionOrBuilder
            public StringValue getIaaQuery() {
                StringValue stringValue = this.iaaQuery_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
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
                int iO = this.iaaQuery_ != null ? w.o(1, getIaaQuery()) : 0;
                if (this.ttlSeconds_ != null) {
                    iO += w.o(2, getTtlSeconds());
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iO;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.ImpExtensionOrBuilder
            public UInt32Value getTtlSeconds() {
                UInt32Value uInt32Value = this.ttlSeconds_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final s8 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.ImpExtensionOrBuilder
            public boolean hasIaaQuery() {
                return this.iaaQuery_ != null;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.ImpExtensionOrBuilder
            public boolean hasTtlSeconds() {
                return this.ttlSeconds_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = getDescriptor().hashCode() + 779;
                if (hasIaaQuery()) {
                    iHashCode = pv1.c(iHashCode, 37, 1, 53) + getIaaQuery().hashCode();
                }
                if (hasTtlSeconds()) {
                    iHashCode = pv1.c(iHashCode, 37, 2, 53) + getTtlSeconds().hashCode();
                }
                int iHashCode2 = this.unknownFields.a.hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.y4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_ImpExtension_fieldAccessorTable;
                w4Var.c(ImpExtension.class, Builder.class);
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
                return new ImpExtension();
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(w wVar) throws IOException {
                if (this.iaaQuery_ != null) {
                    wVar.M(1, getIaaQuery());
                }
                if (this.ttlSeconds_ != null) {
                    wVar.M(2, getTtlSeconds());
                }
                this.unknownFields.writeTo(wVar);
            }

            private ImpExtension(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                this();
                o3Var.getClass();
                p8 p8VarB = s8.b();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iF = rVar.F();
                            if (iF != 0) {
                                if (iF != 10) {
                                    if (iF != 18) {
                                        if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                        }
                                    } else {
                                        UInt32Value uInt32Value = this.ttlSeconds_;
                                        UInt32Value.Builder builder = uInt32Value != null ? uInt32Value.toBuilder() : null;
                                        UInt32Value uInt32Value2 = (UInt32Value) rVar.v(UInt32Value.parser(), o3Var);
                                        this.ttlSeconds_ = uInt32Value2;
                                        if (builder != null) {
                                            builder.mergeFrom(uInt32Value2);
                                            this.ttlSeconds_ = builder.buildPartial();
                                        }
                                    }
                                } else {
                                    StringValue stringValue = this.iaaQuery_;
                                    StringValue.Builder builder2 = stringValue != null ? stringValue.toBuilder() : null;
                                    StringValue stringValue2 = (StringValue) rVar.v(StringValue.parser(), o3Var);
                                    this.iaaQuery_ = stringValue2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(stringValue2);
                                        this.iaaQuery_ = builder2.buildPartial();
                                    }
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

            @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.ImpExtensionOrBuilder
            public b8 getIaaQueryOrBuilder() {
                return getIaaQuery();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.ImpExtensionOrBuilder
            public l8 getTtlSecondsOrBuilder() {
                return getTtlSeconds();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public ImpExtension mo250getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static ImpExtension parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
                return (ImpExtension) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
            }

            public static ImpExtension parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
                return (ImpExtension) PARSER.parseFrom(byteBuffer, o3Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static ImpExtension parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (ImpExtension) PARSER.parseFrom(byteString);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static ImpExtension parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
                return (ImpExtension) PARSER.parseFrom(byteString, o3Var);
            }

            public static ImpExtension parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (ImpExtension) PARSER.parseFrom(bArr);
            }

            public static ImpExtension parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
                return (ImpExtension) PARSER.parseFrom(bArr, o3Var);
            }

            public static ImpExtension parseFrom(InputStream inputStream) throws IOException {
                return (ImpExtension) y4.parseWithIOException(PARSER, inputStream);
            }

            public static ImpExtension parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
                return (ImpExtension) y4.parseWithIOException(PARSER, inputStream, o3Var);
            }

            public static ImpExtension parseFrom(r rVar) throws IOException {
                return (ImpExtension) y4.parseWithIOException(PARSER, rVar);
            }

            public static ImpExtension parseFrom(r rVar, o3 o3Var) throws IOException {
                return (ImpExtension) y4.parseWithIOException(PARSER, rVar, o3Var);
            }

            private ImpExtension(g4 g4Var) {
                super(g4Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            private ImpExtension() {
                this.memoizedIsInitialized = (byte) -1;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public interface ImpExtensionOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo250getDefaultInstanceForType();

            StringValue getIaaQuery();

            b8 getIaaQueryOrBuilder();

            UInt32Value getTtlSeconds();

            l8 getTtlSecondsOrBuilder();

            boolean hasIaaQuery();

            boolean hasTtlSeconds();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Configuration)) {
                return super.equals(obj);
            }
            Configuration configuration = (Configuration) obj;
            if (hasName() != configuration.hasName()) {
                return false;
            }
            if ((hasName() && !getName().equals(configuration.getName())) || hasUrl() != configuration.hasUrl()) {
                return false;
            }
            if ((hasUrl() && !getUrl().equals(configuration.getUrl())) || hasBatchSize() != configuration.hasBatchSize()) {
                return false;
            }
            if ((hasBatchSize() && !getBatchSize().equals(configuration.getBatchSize())) || hasInterval() != configuration.hasInterval()) {
                return false;
            }
            if ((hasInterval() && !getInterval().equals(configuration.getInterval())) || hasShouldReport() != configuration.hasShouldReport()) {
                return false;
            }
            if ((hasShouldReport() && !getShouldReport().equals(configuration.getShouldReport())) || hasFilter() != configuration.hasFilter()) {
                return false;
            }
            if ((hasFilter() && !getFilter().equals(configuration.getFilter())) || !getConfigExtensionCase().equals(configuration.getConfigExtensionCase())) {
                return false;
            }
            int i = this.configExtensionCase_;
            if (i != 6) {
                if (i == 8 && !getGenExtension().equals(configuration.getGenExtension())) {
                    return false;
                }
            } else if (!getImpExtension().equals(configuration.getImpExtension())) {
                return false;
            }
            return this.unknownFields.equals(configuration.unknownFields);
        }

        public static Configuration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_descriptor;
        }

        public static Builder newBuilder(Configuration configuration) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configuration);
        }

        public static Configuration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Configuration) y4.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Configuration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(byteBuffer);
        }

        public static g7 parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public UInt32Value getBatchSize() {
            UInt32Value uInt32Value = this.batchSize_;
            return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public ConfigExtensionCase getConfigExtensionCase() {
            return ConfigExtensionCase.forNumber(this.configExtensionCase_);
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public EventFilter getFilter() {
            EventFilter eventFilter = this.filter_;
            return eventFilter == null ? EventFilter.getDefaultInstance() : eventFilter;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public GenericExtension getGenExtension() {
            return this.configExtensionCase_ == 8 ? (GenericExtension) this.configExtension_ : GenericExtension.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public GenericExtensionOrBuilder getGenExtensionOrBuilder() {
            return this.configExtensionCase_ == 8 ? (GenericExtension) this.configExtension_ : GenericExtension.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public ImpExtension getImpExtension() {
            return this.configExtensionCase_ == 6 ? (ImpExtension) this.configExtension_ : ImpExtension.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public ImpExtensionOrBuilder getImpExtensionOrBuilder() {
            return this.configExtensionCase_ == 6 ? (ImpExtension) this.configExtension_ : ImpExtension.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public UInt32Value getInterval() {
            UInt32Value uInt32Value = this.interval_;
            return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public StringValue getName() {
            StringValue stringValue = this.name_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
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
            int iO = this.name_ != null ? w.o(1, getName()) : 0;
            if (this.url_ != null) {
                iO += w.o(2, getUrl());
            }
            if (this.batchSize_ != null) {
                iO += w.o(3, getBatchSize());
            }
            if (this.interval_ != null) {
                iO += w.o(4, getInterval());
            }
            if (this.shouldReport_ != null) {
                iO += w.o(5, getShouldReport());
            }
            if (this.configExtensionCase_ == 6) {
                iO += w.o(6, (ImpExtension) this.configExtension_);
            }
            if (this.filter_ != null) {
                iO += w.o(7, getFilter());
            }
            if (this.configExtensionCase_ == 8) {
                iO += w.o(8, (GenericExtension) this.configExtension_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iO;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public BoolValue getShouldReport() {
            BoolValue boolValue = this.shouldReport_;
            return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final s8 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public StringValue getUrl() {
            StringValue stringValue = this.url_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public boolean hasBatchSize() {
            return this.batchSize_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public boolean hasFilter() {
            return this.filter_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public boolean hasGenExtension() {
            return this.configExtensionCase_ == 8;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public boolean hasImpExtension() {
            return this.configExtensionCase_ == 6;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public boolean hasInterval() {
            return this.interval_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public boolean hasName() {
            return this.name_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public boolean hasShouldReport() {
            return this.shouldReport_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public boolean hasUrl() {
            return this.url_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int iC;
            int iHashCode;
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode2 = getDescriptor().hashCode() + 779;
            if (hasName()) {
                iHashCode2 = pv1.c(iHashCode2, 37, 1, 53) + getName().hashCode();
            }
            if (hasUrl()) {
                iHashCode2 = pv1.c(iHashCode2, 37, 2, 53) + getUrl().hashCode();
            }
            if (hasBatchSize()) {
                iHashCode2 = pv1.c(iHashCode2, 37, 3, 53) + getBatchSize().hashCode();
            }
            if (hasInterval()) {
                iHashCode2 = pv1.c(iHashCode2, 37, 4, 53) + getInterval().hashCode();
            }
            if (hasShouldReport()) {
                iHashCode2 = pv1.c(iHashCode2, 37, 5, 53) + getShouldReport().hashCode();
            }
            if (hasFilter()) {
                iHashCode2 = pv1.c(iHashCode2, 37, 7, 53) + getFilter().hashCode();
            }
            int i2 = this.configExtensionCase_;
            if (i2 != 6) {
                if (i2 == 8) {
                    iC = pv1.c(iHashCode2, 37, 8, 53);
                    iHashCode = getGenExtension().hashCode();
                }
                int iHashCode3 = this.unknownFields.a.hashCode() + (iHashCode2 * 29);
                this.memoizedHashCode = iHashCode3;
                return iHashCode3;
            }
            iC = pv1.c(iHashCode2, 37, 6, 53);
            iHashCode = getImpExtension().hashCode();
            iHashCode2 = iC + iHashCode;
            int iHashCode4 = this.unknownFields.a.hashCode() + (iHashCode2 * 29);
            this.memoizedHashCode = iHashCode4;
            return iHashCode4;
        }

        @Override // com.explorestack.protobuf.y4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_fieldAccessorTable;
            w4Var.c(Configuration.class, Builder.class);
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
            return new Configuration();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(w wVar) throws IOException {
            if (this.name_ != null) {
                wVar.M(1, getName());
            }
            if (this.url_ != null) {
                wVar.M(2, getUrl());
            }
            if (this.batchSize_ != null) {
                wVar.M(3, getBatchSize());
            }
            if (this.interval_ != null) {
                wVar.M(4, getInterval());
            }
            if (this.shouldReport_ != null) {
                wVar.M(5, getShouldReport());
            }
            if (this.configExtensionCase_ == 6) {
                wVar.M(6, (ImpExtension) this.configExtension_);
            }
            if (this.filter_ != null) {
                wVar.M(7, getFilter());
            }
            if (this.configExtensionCase_ == 8) {
                wVar.M(8, (GenericExtension) this.configExtension_);
            }
            this.unknownFields.writeTo(wVar);
        }

        private Configuration(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
            this();
            o3Var.getClass();
            p8 p8VarB = s8.b();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iF = rVar.F();
                        if (iF != 0) {
                            if (iF != 10) {
                                if (iF != 18) {
                                    if (iF != 26) {
                                        if (iF != 34) {
                                            if (iF != 42) {
                                                if (iF != 50) {
                                                    if (iF != 58) {
                                                        if (iF != 66) {
                                                            if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                                            }
                                                        } else {
                                                            GenericExtension.Builder builder = this.configExtensionCase_ == 8 ? ((GenericExtension) this.configExtension_).toBuilder() : null;
                                                            MessageLite messageLiteV = rVar.v(GenericExtension.parser(), o3Var);
                                                            this.configExtension_ = messageLiteV;
                                                            if (builder != null) {
                                                                builder.mergeFrom((GenericExtension) messageLiteV);
                                                                this.configExtension_ = builder.buildPartial();
                                                            }
                                                            this.configExtensionCase_ = 8;
                                                        }
                                                    } else {
                                                        EventFilter eventFilter = this.filter_;
                                                        EventFilter.Builder builder2 = eventFilter != null ? eventFilter.toBuilder() : null;
                                                        EventFilter eventFilter2 = (EventFilter) rVar.v(EventFilter.parser(), o3Var);
                                                        this.filter_ = eventFilter2;
                                                        if (builder2 != null) {
                                                            builder2.mergeFrom(eventFilter2);
                                                            this.filter_ = builder2.buildPartial();
                                                        }
                                                    }
                                                } else {
                                                    ImpExtension.Builder builder3 = this.configExtensionCase_ == 6 ? ((ImpExtension) this.configExtension_).toBuilder() : null;
                                                    MessageLite messageLiteV2 = rVar.v(ImpExtension.parser(), o3Var);
                                                    this.configExtension_ = messageLiteV2;
                                                    if (builder3 != null) {
                                                        builder3.mergeFrom((ImpExtension) messageLiteV2);
                                                        this.configExtension_ = builder3.buildPartial();
                                                    }
                                                    this.configExtensionCase_ = 6;
                                                }
                                            } else {
                                                BoolValue boolValue = this.shouldReport_;
                                                BoolValue.Builder builder4 = boolValue != null ? boolValue.toBuilder() : null;
                                                BoolValue boolValue2 = (BoolValue) rVar.v(BoolValue.parser(), o3Var);
                                                this.shouldReport_ = boolValue2;
                                                if (builder4 != null) {
                                                    builder4.mergeFrom(boolValue2);
                                                    this.shouldReport_ = builder4.buildPartial();
                                                }
                                            }
                                        } else {
                                            UInt32Value uInt32Value = this.interval_;
                                            UInt32Value.Builder builder5 = uInt32Value != null ? uInt32Value.toBuilder() : null;
                                            UInt32Value uInt32Value2 = (UInt32Value) rVar.v(UInt32Value.parser(), o3Var);
                                            this.interval_ = uInt32Value2;
                                            if (builder5 != null) {
                                                builder5.mergeFrom(uInt32Value2);
                                                this.interval_ = builder5.buildPartial();
                                            }
                                        }
                                    } else {
                                        UInt32Value uInt32Value3 = this.batchSize_;
                                        UInt32Value.Builder builder6 = uInt32Value3 != null ? uInt32Value3.toBuilder() : null;
                                        UInt32Value uInt32Value4 = (UInt32Value) rVar.v(UInt32Value.parser(), o3Var);
                                        this.batchSize_ = uInt32Value4;
                                        if (builder6 != null) {
                                            builder6.mergeFrom(uInt32Value4);
                                            this.batchSize_ = builder6.buildPartial();
                                        }
                                    }
                                } else {
                                    StringValue stringValue = this.url_;
                                    StringValue.Builder builder7 = stringValue != null ? stringValue.toBuilder() : null;
                                    StringValue stringValue2 = (StringValue) rVar.v(StringValue.parser(), o3Var);
                                    this.url_ = stringValue2;
                                    if (builder7 != null) {
                                        builder7.mergeFrom(stringValue2);
                                        this.url_ = builder7.buildPartial();
                                    }
                                }
                            } else {
                                StringValue stringValue3 = this.name_;
                                StringValue.Builder builder8 = stringValue3 != null ? stringValue3.toBuilder() : null;
                                StringValue stringValue4 = (StringValue) rVar.v(StringValue.parser(), o3Var);
                                this.name_ = stringValue4;
                                if (builder8 != null) {
                                    builder8.mergeFrom(stringValue4);
                                    this.name_ = builder8.buildPartial();
                                }
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

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public l8 getBatchSizeOrBuilder() {
            return getBatchSize();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public EventFilterOrBuilder getFilterOrBuilder() {
            return getFilter();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public l8 getIntervalOrBuilder() {
            return getInterval();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public b8 getNameOrBuilder() {
            return getName();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public i getShouldReportOrBuilder() {
            return getShouldReport();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public b8 getUrlOrBuilder() {
            return getUrl();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Configuration mo250getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Configuration parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Configuration) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
        }

        public static Configuration parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(byteBuffer, o3Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Configuration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Configuration parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(byteString, o3Var);
        }

        public static Configuration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(bArr);
        }

        public static Configuration parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(bArr, o3Var);
        }

        public static Configuration parseFrom(InputStream inputStream) throws IOException {
            return (Configuration) y4.parseWithIOException(PARSER, inputStream);
        }

        public static Configuration parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Configuration) y4.parseWithIOException(PARSER, inputStream, o3Var);
        }

        public static Configuration parseFrom(r rVar) throws IOException {
            return (Configuration) y4.parseWithIOException(PARSER, rVar);
        }

        public static Configuration parseFrom(r rVar, o3 o3Var) throws IOException {
            return (Configuration) y4.parseWithIOException(PARSER, rVar, o3Var);
        }

        private Configuration(g4 g4Var) {
            super(g4Var);
            this.configExtensionCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        private Configuration() {
            this.configExtensionCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ConfigurationOrBuilder extends MessageOrBuilder {
        UInt32Value getBatchSize();

        l8 getBatchSizeOrBuilder();

        Configuration.ConfigExtensionCase getConfigExtensionCase();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo250getDefaultInstanceForType();

        EventFilter getFilter();

        EventFilterOrBuilder getFilterOrBuilder();

        Configuration.GenericExtension getGenExtension();

        Configuration.GenericExtensionOrBuilder getGenExtensionOrBuilder();

        Configuration.ImpExtension getImpExtension();

        Configuration.ImpExtensionOrBuilder getImpExtensionOrBuilder();

        UInt32Value getInterval();

        l8 getIntervalOrBuilder();

        StringValue getName();

        b8 getNameOrBuilder();

        BoolValue getShouldReport();

        i getShouldReportOrBuilder();

        StringValue getUrl();

        b8 getUrlOrBuilder();

        boolean hasBatchSize();

        boolean hasFilter();

        boolean hasGenExtension();

        boolean hasImpExtension();

        boolean hasInterval();

        boolean hasName();

        boolean hasShouldReport();

        boolean hasUrl();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class EventFilter extends y4 implements EventFilterOrBuilder {
        public static final int EXPR_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private FilterExpression expr_;
        private byte memoizedIsInitialized;
        private static final EventFilter DEFAULT_INSTANCE = new EventFilter();
        private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Monitor.EventFilter.1
            @Override // com.explorestack.protobuf.g7
            public EventFilter parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                return new EventFilter(rVar, o3Var);
            }
        };

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends g4 implements EventFilterOrBuilder {
            private v7 exprBuilder_;
            private FilterExpression expr_;

            private Builder() {
                super(null);
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                EventFilter eventFilter = null;
                try {
                    try {
                        EventFilter eventFilter2 = (EventFilter) EventFilter.PARSER.parsePartialFrom(rVar, o3Var);
                        if (eventFilter2 != null) {
                            mergeFrom(eventFilter2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        EventFilter eventFilter3 = (EventFilter) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            eventFilter = eventFilter3;
                            if (eventFilter != null) {
                                mergeFrom(eventFilter);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (eventFilter != null) {
                        mergeFrom(eventFilter);
                    }
                    throw th;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_EventFilter_descriptor;
            }

            private v7 getExprFieldBuilder() {
                if (this.exprBuilder_ == null) {
                    this.exprBuilder_ = new v7(getExpr(), getParentForChildren(), isClean());
                    this.expr_ = null;
                }
                return this.exprBuilder_;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public EventFilter buildPartial() {
                EventFilter eventFilter = new EventFilter(this);
                v7 v7Var = this.exprBuilder_;
                if (v7Var == null) {
                    eventFilter.expr_ = this.expr_;
                } else {
                    eventFilter.expr_ = (FilterExpression) v7Var.a();
                }
                onBuilt();
                return eventFilter;
            }

            public Builder clearExpr() {
                if (this.exprBuilder_ == null) {
                    this.expr_ = null;
                    onChanged();
                    return this;
                }
                this.expr_ = null;
                this.exprBuilder_ = null;
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_EventFilter_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.EventFilterOrBuilder
            public FilterExpression getExpr() {
                v7 v7Var = this.exprBuilder_;
                if (v7Var != null) {
                    return (FilterExpression) v7Var.d();
                }
                FilterExpression filterExpression = this.expr_;
                return filterExpression == null ? FilterExpression.getDefaultInstance() : filterExpression;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.EventFilterOrBuilder
            public FilterExpressionOrBuilder getExprOrBuilder() {
                v7 v7Var = this.exprBuilder_;
                if (v7Var != null) {
                    return (FilterExpressionOrBuilder) v7Var.e();
                }
                FilterExpression filterExpression = this.expr_;
                return filterExpression == null ? FilterExpression.getDefaultInstance() : filterExpression;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.EventFilterOrBuilder
            public boolean hasExpr() {
                return (this.exprBuilder_ == null && this.expr_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.g4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_EventFilter_fieldAccessorTable;
                w4Var.c(EventFilter.class, Builder.class);
                return w4Var;
            }

            public Builder mergeExpr(FilterExpression filterExpression) {
                v7 v7Var = this.exprBuilder_;
                if (v7Var != null) {
                    v7Var.f(filterExpression);
                    return this;
                }
                FilterExpression filterExpression2 = this.expr_;
                if (filterExpression2 != null) {
                    this.expr_ = FilterExpression.newBuilder(filterExpression2).mergeFrom(filterExpression).buildPartial();
                } else {
                    this.expr_ = filterExpression;
                }
                onChanged();
                return this;
            }

            public Builder setExpr(FilterExpression.Builder builder) {
                v7 v7Var = this.exprBuilder_;
                if (v7Var != null) {
                    v7Var.h(builder.build());
                    return this;
                }
                this.expr_ = builder.build();
                onChanged();
                return this;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = y4.alwaysUseFieldBuilders;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public EventFilter build() {
                EventFilter eventFilterBuildPartial = buildPartial();
                if (eventFilterBuildPartial.isInitialized()) {
                    return eventFilterBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) eventFilterBuildPartial);
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                if (this.exprBuilder_ == null) {
                    this.expr_ = null;
                    return this;
                }
                this.expr_ = null;
                this.exprBuilder_ = null;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo247clone() {
                return (Builder) super.mo247clone();
            }

            public FilterExpression.Builder getExprBuilder() {
                onChanged();
                return (FilterExpression.Builder) getExprFieldBuilder().c();
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(s8 s8Var) {
                return (Builder) super.mergeUnknownFields(s8Var);
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
            public EventFilter mo250getDefaultInstanceForType() {
                return EventFilter.getDefaultInstance();
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

            public Builder setExpr(FilterExpression filterExpression) {
                v7 v7Var = this.exprBuilder_;
                if (v7Var == null) {
                    filterExpression.getClass();
                    this.expr_ = filterExpression;
                    onChanged();
                    return this;
                }
                v7Var.h(filterExpression);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EventFilter) {
                    return mergeFrom((EventFilter) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EventFilter eventFilter) {
                if (eventFilter == EventFilter.getDefaultInstance()) {
                    return this;
                }
                if (eventFilter.hasExpr()) {
                    mergeExpr(eventFilter.getExpr());
                }
                mergeUnknownFields(((y4) eventFilter).unknownFields);
                onChanged();
                return this;
            }
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EventFilter)) {
                return super.equals(obj);
            }
            EventFilter eventFilter = (EventFilter) obj;
            if (hasExpr() != eventFilter.hasExpr()) {
                return false;
            }
            return (!hasExpr() || getExpr().equals(eventFilter.getExpr())) && this.unknownFields.equals(eventFilter.unknownFields);
        }

        public static EventFilter getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_EventFilter_descriptor;
        }

        public static Builder newBuilder(EventFilter eventFilter) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(eventFilter);
        }

        public static EventFilter parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EventFilter) y4.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EventFilter parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EventFilter) PARSER.parseFrom(byteBuffer);
        }

        public static g7 parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.EventFilterOrBuilder
        public FilterExpression getExpr() {
            FilterExpression filterExpression = this.expr_;
            return filterExpression == null ? FilterExpression.getDefaultInstance() : filterExpression;
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
            int serializedSize = this.unknownFields.getSerializedSize() + (this.expr_ != null ? w.o(1, getExpr()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final s8 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.EventFilterOrBuilder
        public boolean hasExpr() {
            return this.expr_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasExpr()) {
                iHashCode = pv1.c(iHashCode, 37, 1, 53) + getExpr().hashCode();
            }
            int iHashCode2 = this.unknownFields.a.hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.y4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_EventFilter_fieldAccessorTable;
            w4Var.c(EventFilter.class, Builder.class);
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
            return new EventFilter();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(w wVar) throws IOException {
            if (this.expr_ != null) {
                wVar.M(1, getExpr());
            }
            this.unknownFields.writeTo(wVar);
        }

        private EventFilter(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
            FilterExpression.Builder builder;
            this();
            o3Var.getClass();
            p8 p8VarB = s8.b();
            boolean z = false;
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
                                    FilterExpression filterExpression = this.expr_;
                                    if (filterExpression != null) {
                                        builder = filterExpression.toBuilder();
                                    } else {
                                        builder = null;
                                    }
                                    FilterExpression filterExpression2 = (FilterExpression) rVar.v(FilterExpression.parser(), o3Var);
                                    this.expr_ = filterExpression2;
                                    if (builder != null) {
                                        builder.mergeFrom(filterExpression2);
                                        this.expr_ = builder.buildPartial();
                                    }
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
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

        @Override // io.bidmachine.protobuf.sdk.Monitor.EventFilterOrBuilder
        public FilterExpressionOrBuilder getExprOrBuilder() {
            return getExpr();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public EventFilter mo250getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static EventFilter parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (EventFilter) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
        }

        public static EventFilter parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
            return (EventFilter) PARSER.parseFrom(byteBuffer, o3Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EventFilter parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (EventFilter) PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EventFilter parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
            return (EventFilter) PARSER.parseFrom(byteString, o3Var);
        }

        public static EventFilter parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EventFilter) PARSER.parseFrom(bArr);
        }

        public static EventFilter parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
            return (EventFilter) PARSER.parseFrom(bArr, o3Var);
        }

        public static EventFilter parseFrom(InputStream inputStream) throws IOException {
            return (EventFilter) y4.parseWithIOException(PARSER, inputStream);
        }

        public static EventFilter parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (EventFilter) y4.parseWithIOException(PARSER, inputStream, o3Var);
        }

        public static EventFilter parseFrom(r rVar) throws IOException {
            return (EventFilter) y4.parseWithIOException(PARSER, rVar);
        }

        public static EventFilter parseFrom(r rVar, o3 o3Var) throws IOException {
            return (EventFilter) y4.parseWithIOException(PARSER, rVar, o3Var);
        }

        private EventFilter(g4 g4Var) {
            super(g4Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        private EventFilter() {
            this.memoizedIsInitialized = (byte) -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface EventFilterOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo250getDefaultInstanceForType();

        FilterExpression getExpr();

        FilterExpressionOrBuilder getExprOrBuilder();

        boolean hasExpr();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class FilterExpression extends y4 implements FilterExpressionOrBuilder {
        public static final int ALL_FIELD_NUMBER = 1;
        public static final int ANY_FIELD_NUMBER = 2;
        private static final FilterExpression DEFAULT_INSTANCE = new FilterExpression();
        private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Monitor.FilterExpression.1
            @Override // com.explorestack.protobuf.g7
            public FilterExpression parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                return new FilterExpression(rVar, o3Var);
            }
        };
        public static final int RULE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int nodeCase_;
        private Object node_;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends g4 implements FilterExpressionOrBuilder {
            private v7 allBuilder_;
            private v7 anyBuilder_;
            private int nodeCase_;
            private Object node_;
            private v7 ruleBuilder_;

            private Builder() {
                super(null);
                this.nodeCase_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder clearNode() {
                this.nodeCase_ = 0;
                this.node_ = null;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            private v7 getAllFieldBuilder() {
                if (this.allBuilder_ == null) {
                    if (this.nodeCase_ != 1) {
                        this.node_ = All.getDefaultInstance();
                    }
                    this.allBuilder_ = new v7((All) this.node_, getParentForChildren(), isClean());
                    this.node_ = null;
                }
                this.nodeCase_ = 1;
                onChanged();
                return this.allBuilder_;
            }

            private v7 getAnyFieldBuilder() {
                if (this.anyBuilder_ == null) {
                    if (this.nodeCase_ != 2) {
                        this.node_ = Any.getDefaultInstance();
                    }
                    this.anyBuilder_ = new v7((Any) this.node_, getParentForChildren(), isClean());
                    this.node_ = null;
                }
                this.nodeCase_ = 2;
                onChanged();
                return this.anyBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_FilterExpression_descriptor;
            }

            private v7 getRuleFieldBuilder() {
                if (this.ruleBuilder_ == null) {
                    if (this.nodeCase_ != 3) {
                        this.node_ = Rule.getDefaultInstance();
                    }
                    this.ruleBuilder_ = new v7((Rule) this.node_, getParentForChildren(), isClean());
                    this.node_ = null;
                }
                this.nodeCase_ = 3;
                onChanged();
                return this.ruleBuilder_;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public FilterExpression buildPartial() {
                FilterExpression filterExpression = new FilterExpression(this);
                if (this.nodeCase_ == 1) {
                    v7 v7Var = this.allBuilder_;
                    if (v7Var == null) {
                        filterExpression.node_ = this.node_;
                    } else {
                        filterExpression.node_ = v7Var.a();
                    }
                }
                if (this.nodeCase_ == 2) {
                    v7 v7Var2 = this.anyBuilder_;
                    if (v7Var2 == null) {
                        filterExpression.node_ = this.node_;
                    } else {
                        filterExpression.node_ = v7Var2.a();
                    }
                }
                if (this.nodeCase_ == 3) {
                    v7 v7Var3 = this.ruleBuilder_;
                    if (v7Var3 == null) {
                        filterExpression.node_ = this.node_;
                    } else {
                        filterExpression.node_ = v7Var3.a();
                    }
                }
                filterExpression.nodeCase_ = this.nodeCase_;
                onBuilt();
                return filterExpression;
            }

            public Builder clearAll() {
                v7 v7Var = this.allBuilder_;
                int i = this.nodeCase_;
                if (v7Var == null) {
                    if (i == 1) {
                        this.nodeCase_ = 0;
                        this.node_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (i == 1) {
                    this.nodeCase_ = 0;
                    this.node_ = null;
                }
                v7Var.b();
                return this;
            }

            public Builder clearAny() {
                v7 v7Var = this.anyBuilder_;
                int i = this.nodeCase_;
                if (v7Var == null) {
                    if (i == 2) {
                        this.nodeCase_ = 0;
                        this.node_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (i == 2) {
                    this.nodeCase_ = 0;
                    this.node_ = null;
                }
                v7Var.b();
                return this;
            }

            public Builder clearRule() {
                v7 v7Var = this.ruleBuilder_;
                int i = this.nodeCase_;
                if (v7Var == null) {
                    if (i == 3) {
                        this.nodeCase_ = 0;
                        this.node_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (i == 3) {
                    this.nodeCase_ = 0;
                    this.node_ = null;
                }
                v7Var.b();
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
            public All getAll() {
                v7 v7Var = this.allBuilder_;
                int i = this.nodeCase_;
                if (v7Var == null) {
                    return i == 1 ? (All) this.node_ : All.getDefaultInstance();
                }
                return i == 1 ? (All) v7Var.d() : All.getDefaultInstance();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
            public AllOrBuilder getAllOrBuilder() {
                v7 v7Var;
                int i = this.nodeCase_;
                if (i != 1 || (v7Var = this.allBuilder_) == null) {
                    return i == 1 ? (All) this.node_ : All.getDefaultInstance();
                }
                return (AllOrBuilder) v7Var.e();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
            public Any getAny() {
                v7 v7Var = this.anyBuilder_;
                int i = this.nodeCase_;
                if (v7Var == null) {
                    return i == 2 ? (Any) this.node_ : Any.getDefaultInstance();
                }
                return i == 2 ? (Any) v7Var.d() : Any.getDefaultInstance();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
            public AnyOrBuilder getAnyOrBuilder() {
                v7 v7Var;
                int i = this.nodeCase_;
                if (i != 2 || (v7Var = this.anyBuilder_) == null) {
                    return i == 2 ? (Any) this.node_ : Any.getDefaultInstance();
                }
                return (AnyOrBuilder) v7Var.e();
            }

            @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_FilterExpression_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
            public NodeCase getNodeCase() {
                return NodeCase.forNumber(this.nodeCase_);
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
            public Rule getRule() {
                v7 v7Var = this.ruleBuilder_;
                int i = this.nodeCase_;
                if (v7Var == null) {
                    return i == 3 ? (Rule) this.node_ : Rule.getDefaultInstance();
                }
                return i == 3 ? (Rule) v7Var.d() : Rule.getDefaultInstance();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
            public RuleOrBuilder getRuleOrBuilder() {
                v7 v7Var;
                int i = this.nodeCase_;
                if (i != 3 || (v7Var = this.ruleBuilder_) == null) {
                    return i == 3 ? (Rule) this.node_ : Rule.getDefaultInstance();
                }
                return (RuleOrBuilder) v7Var.e();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
            public boolean hasAll() {
                return this.nodeCase_ == 1;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
            public boolean hasAny() {
                return this.nodeCase_ == 2;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
            public boolean hasRule() {
                return this.nodeCase_ == 3;
            }

            @Override // com.explorestack.protobuf.g4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_FilterExpression_fieldAccessorTable;
                w4Var.c(FilterExpression.class, Builder.class);
                return w4Var;
            }

            public Builder mergeAll(All all) {
                v7 v7Var = this.allBuilder_;
                int i = this.nodeCase_;
                if (v7Var == null) {
                    if (i != 1 || this.node_ == All.getDefaultInstance()) {
                        this.node_ = all;
                    } else {
                        this.node_ = All.newBuilder((All) this.node_).mergeFrom(all).buildPartial();
                    }
                    onChanged();
                } else {
                    if (i == 1) {
                        v7Var.f(all);
                    }
                    this.allBuilder_.h(all);
                }
                this.nodeCase_ = 1;
                return this;
            }

            public Builder mergeAny(Any any) {
                v7 v7Var = this.anyBuilder_;
                int i = this.nodeCase_;
                if (v7Var == null) {
                    if (i != 2 || this.node_ == Any.getDefaultInstance()) {
                        this.node_ = any;
                    } else {
                        this.node_ = Any.newBuilder((Any) this.node_).mergeFrom(any).buildPartial();
                    }
                    onChanged();
                } else {
                    if (i == 2) {
                        v7Var.f(any);
                    }
                    this.anyBuilder_.h(any);
                }
                this.nodeCase_ = 2;
                return this;
            }

            public Builder mergeRule(Rule rule) {
                v7 v7Var = this.ruleBuilder_;
                int i = this.nodeCase_;
                if (v7Var == null) {
                    if (i != 3 || this.node_ == Rule.getDefaultInstance()) {
                        this.node_ = rule;
                    } else {
                        this.node_ = Rule.newBuilder((Rule) this.node_).mergeFrom(rule).buildPartial();
                    }
                    onChanged();
                } else {
                    if (i == 3) {
                        v7Var.f(rule);
                    }
                    this.ruleBuilder_.h(rule);
                }
                this.nodeCase_ = 3;
                return this;
            }

            public Builder setAll(All.Builder builder) {
                v7 v7Var = this.allBuilder_;
                if (v7Var == null) {
                    this.node_ = builder.build();
                    onChanged();
                } else {
                    v7Var.h(builder.build());
                }
                this.nodeCase_ = 1;
                return this;
            }

            public Builder setAny(Any.Builder builder) {
                v7 v7Var = this.anyBuilder_;
                if (v7Var == null) {
                    this.node_ = builder.build();
                    onChanged();
                } else {
                    v7Var.h(builder.build());
                }
                this.nodeCase_ = 2;
                return this;
            }

            public Builder setRule(Rule.Builder builder) {
                v7 v7Var = this.ruleBuilder_;
                if (v7Var == null) {
                    this.node_ = builder.build();
                    onChanged();
                } else {
                    v7Var.h(builder.build());
                }
                this.nodeCase_ = 3;
                return this;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = y4.alwaysUseFieldBuilders;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public FilterExpression build() {
                FilterExpression filterExpressionBuildPartial = buildPartial();
                if (filterExpressionBuildPartial.isInitialized()) {
                    return filterExpressionBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) filterExpressionBuildPartial);
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.nodeCase_ = 0;
                this.node_ = null;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo247clone() {
                return (Builder) super.mo247clone();
            }

            public All.Builder getAllBuilder() {
                return (All.Builder) getAllFieldBuilder().c();
            }

            public Any.Builder getAnyBuilder() {
                return (Any.Builder) getAnyFieldBuilder().c();
            }

            public Rule.Builder getRuleBuilder() {
                return (Rule.Builder) getRuleFieldBuilder().c();
            }

            public Builder mergeFrom(FilterExpression filterExpression) {
                if (filterExpression == FilterExpression.getDefaultInstance()) {
                    return this;
                }
                int i = AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$sdk$Monitor$FilterExpression$NodeCase[filterExpression.getNodeCase().ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            mergeRule(filterExpression.getRule());
                        }
                    } else {
                        mergeAny(filterExpression.getAny());
                    }
                } else {
                    mergeAll(filterExpression.getAll());
                }
                mergeUnknownFields(((y4) filterExpression).unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(s8 s8Var) {
                return (Builder) super.mergeUnknownFields(s8Var);
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
            public FilterExpression mo250getDefaultInstanceForType() {
                return FilterExpression.getDefaultInstance();
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
                this.nodeCase_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setAll(All all) {
                v7 v7Var = this.allBuilder_;
                if (v7Var == null) {
                    all.getClass();
                    this.node_ = all;
                    onChanged();
                } else {
                    v7Var.h(all);
                }
                this.nodeCase_ = 1;
                return this;
            }

            public Builder setAny(Any any) {
                v7 v7Var = this.anyBuilder_;
                if (v7Var == null) {
                    any.getClass();
                    this.node_ = any;
                    onChanged();
                } else {
                    v7Var.h(any);
                }
                this.nodeCase_ = 2;
                return this;
            }

            public Builder setRule(Rule rule) {
                v7 v7Var = this.ruleBuilder_;
                if (v7Var == null) {
                    rule.getClass();
                    this.node_ = rule;
                    onChanged();
                } else {
                    v7Var.h(rule);
                }
                this.nodeCase_ = 3;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FilterExpression) {
                    return mergeFrom((FilterExpression) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                FilterExpression filterExpression = null;
                try {
                    try {
                        FilterExpression filterExpression2 = (FilterExpression) FilterExpression.PARSER.parsePartialFrom(rVar, o3Var);
                        if (filterExpression2 != null) {
                            mergeFrom(filterExpression2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        FilterExpression filterExpression3 = (FilterExpression) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            filterExpression = filterExpression3;
                            if (filterExpression != null) {
                                mergeFrom(filterExpression);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (filterExpression != null) {
                        mergeFrom(filterExpression);
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public enum NodeCase implements c5 {
            ALL(1),
            ANY(2),
            RULE(3),
            NODE_NOT_SET(0);

            private final int value;

            public static NodeCase forNumber(int i) {
                if (i == 0) {
                    return NODE_NOT_SET;
                }
                if (i == 1) {
                    return ALL;
                }
                if (i == 2) {
                    return ANY;
                }
                if (i != 3) {
                    return null;
                }
                return RULE;
            }

            @Override // com.explorestack.protobuf.c5
            public int getNumber() {
                return this.value;
            }

            NodeCase(int i) {
                this.value = i;
            }

            @Deprecated
            public static NodeCase valueOf(int i) {
                return forNumber(i);
            }
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FilterExpression)) {
                return super.equals(obj);
            }
            FilterExpression filterExpression = (FilterExpression) obj;
            if (!getNodeCase().equals(filterExpression.getNodeCase())) {
                return false;
            }
            int i = this.nodeCase_;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && !getRule().equals(filterExpression.getRule())) {
                        return false;
                    }
                } else if (!getAny().equals(filterExpression.getAny())) {
                    return false;
                }
            } else if (!getAll().equals(filterExpression.getAll())) {
                return false;
            }
            return this.unknownFields.equals(filterExpression.unknownFields);
        }

        public static FilterExpression getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_FilterExpression_descriptor;
        }

        public static Builder newBuilder(FilterExpression filterExpression) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(filterExpression);
        }

        public static FilterExpression parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FilterExpression) y4.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FilterExpression parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FilterExpression) PARSER.parseFrom(byteBuffer);
        }

        public static g7 parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
        public All getAll() {
            return this.nodeCase_ == 1 ? (All) this.node_ : All.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
        public AllOrBuilder getAllOrBuilder() {
            return this.nodeCase_ == 1 ? (All) this.node_ : All.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
        public Any getAny() {
            return this.nodeCase_ == 2 ? (Any) this.node_ : Any.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
        public AnyOrBuilder getAnyOrBuilder() {
            return this.nodeCase_ == 2 ? (Any) this.node_ : Any.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
        public NodeCase getNodeCase() {
            return NodeCase.forNumber(this.nodeCase_);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public g7 getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
        public Rule getRule() {
            return this.nodeCase_ == 3 ? (Rule) this.node_ : Rule.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
        public RuleOrBuilder getRuleOrBuilder() {
            return this.nodeCase_ == 3 ? (Rule) this.node_ : Rule.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iO = this.nodeCase_ == 1 ? w.o(1, (All) this.node_) : 0;
            if (this.nodeCase_ == 2) {
                iO += w.o(2, (Any) this.node_);
            }
            if (this.nodeCase_ == 3) {
                iO += w.o(3, (Rule) this.node_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iO;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final s8 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
        public boolean hasAll() {
            return this.nodeCase_ == 1;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
        public boolean hasAny() {
            return this.nodeCase_ == 2;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
        public boolean hasRule() {
            return this.nodeCase_ == 3;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int iC;
            int iHashCode;
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode2 = getDescriptor().hashCode() + 779;
            int i2 = this.nodeCase_;
            if (i2 == 1) {
                iC = pv1.c(iHashCode2, 37, 1, 53);
                iHashCode = getAll().hashCode();
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        iC = pv1.c(iHashCode2, 37, 3, 53);
                        iHashCode = getRule().hashCode();
                    }
                    int iHashCode3 = this.unknownFields.a.hashCode() + (iHashCode2 * 29);
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
                }
                iC = pv1.c(iHashCode2, 37, 2, 53);
                iHashCode = getAny().hashCode();
            }
            iHashCode2 = iC + iHashCode;
            int iHashCode4 = this.unknownFields.a.hashCode() + (iHashCode2 * 29);
            this.memoizedHashCode = iHashCode4;
            return iHashCode4;
        }

        @Override // com.explorestack.protobuf.y4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_FilterExpression_fieldAccessorTable;
            w4Var.c(FilterExpression.class, Builder.class);
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
            return new FilterExpression();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(w wVar) throws IOException {
            if (this.nodeCase_ == 1) {
                wVar.M(1, (All) this.node_);
            }
            if (this.nodeCase_ == 2) {
                wVar.M(2, (Any) this.node_);
            }
            if (this.nodeCase_ == 3) {
                wVar.M(3, (Rule) this.node_);
            }
            this.unknownFields.writeTo(wVar);
        }

        private FilterExpression(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
            this();
            o3Var.getClass();
            p8 p8VarB = s8.b();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iF = rVar.F();
                        if (iF != 0) {
                            if (iF != 10) {
                                if (iF != 18) {
                                    if (iF != 26) {
                                        if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                        }
                                    } else {
                                        Rule.Builder builder = this.nodeCase_ == 3 ? ((Rule) this.node_).toBuilder() : null;
                                        MessageLite messageLiteV = rVar.v(Rule.parser(), o3Var);
                                        this.node_ = messageLiteV;
                                        if (builder != null) {
                                            builder.mergeFrom((Rule) messageLiteV);
                                            this.node_ = builder.buildPartial();
                                        }
                                        this.nodeCase_ = 3;
                                    }
                                } else {
                                    Any.Builder builder2 = this.nodeCase_ == 2 ? ((Any) this.node_).toBuilder() : null;
                                    MessageLite messageLiteV2 = rVar.v(Any.parser(), o3Var);
                                    this.node_ = messageLiteV2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((Any) messageLiteV2);
                                        this.node_ = builder2.buildPartial();
                                    }
                                    this.nodeCase_ = 2;
                                }
                            } else {
                                All.Builder builder3 = this.nodeCase_ == 1 ? ((All) this.node_).toBuilder() : null;
                                MessageLite messageLiteV3 = rVar.v(All.parser(), o3Var);
                                this.node_ = messageLiteV3;
                                if (builder3 != null) {
                                    builder3.mergeFrom((All) messageLiteV3);
                                    this.node_ = builder3.buildPartial();
                                }
                                this.nodeCase_ = 1;
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
        public FilterExpression mo250getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static FilterExpression parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (FilterExpression) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
        }

        public static FilterExpression parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
            return (FilterExpression) PARSER.parseFrom(byteBuffer, o3Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FilterExpression parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FilterExpression) PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FilterExpression parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
            return (FilterExpression) PARSER.parseFrom(byteString, o3Var);
        }

        public static FilterExpression parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FilterExpression) PARSER.parseFrom(bArr);
        }

        public static FilterExpression parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
            return (FilterExpression) PARSER.parseFrom(bArr, o3Var);
        }

        public static FilterExpression parseFrom(InputStream inputStream) throws IOException {
            return (FilterExpression) y4.parseWithIOException(PARSER, inputStream);
        }

        public static FilterExpression parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (FilterExpression) y4.parseWithIOException(PARSER, inputStream, o3Var);
        }

        public static FilterExpression parseFrom(r rVar) throws IOException {
            return (FilterExpression) y4.parseWithIOException(PARSER, rVar);
        }

        public static FilterExpression parseFrom(r rVar, o3 o3Var) throws IOException {
            return (FilterExpression) y4.parseWithIOException(PARSER, rVar, o3Var);
        }

        private FilterExpression(g4 g4Var) {
            super(g4Var);
            this.nodeCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        private FilterExpression() {
            this.nodeCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface FilterExpressionOrBuilder extends MessageOrBuilder {
        All getAll();

        AllOrBuilder getAllOrBuilder();

        Any getAny();

        AnyOrBuilder getAnyOrBuilder();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo250getDefaultInstanceForType();

        FilterExpression.NodeCase getNodeCase();

        Rule getRule();

        RuleOrBuilder getRuleOrBuilder();

        boolean hasAll();

        boolean hasAny();

        boolean hasRule();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum MissingBehavior implements c5 {
        MISSING_UNSPECIFIED(0),
        FAIL(1),
        PASS(2),
        UNRECOGNIZED(-1);

        public static final int FAIL_VALUE = 1;
        public static final int MISSING_UNSPECIFIED_VALUE = 0;
        public static final int PASS_VALUE = 2;
        private final int value;
        private static final d5 internalValueMap = new d5() { // from class: io.bidmachine.protobuf.sdk.Monitor.MissingBehavior.1
            public MissingBehavior findValueByNumber(int i) {
                return MissingBehavior.forNumber(i);
            }
        };
        private static final MissingBehavior[] VALUES = values();

        public static MissingBehavior forNumber(int i) {
            if (i == 0) {
                return MISSING_UNSPECIFIED;
            }
            if (i == 1) {
                return FAIL;
            }
            if (i != 2) {
                return null;
            }
            return PASS;
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

        MissingBehavior(int i) {
            this.value = i;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return Monitor.getDescriptor().getEnumTypes().get(1);
        }

        public static MissingBehavior valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static MissingBehavior valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum Operator implements c5 {
        OP_UNSPECIFIED(0),
        IN(1),
        NOT_IN(2),
        EQ(3),
        NEQ(4),
        EXISTS(5),
        NOT_EXISTS(6),
        GREATER_THAN(7),
        GREATER_THAN_OR_EQUAL(8),
        LESS_THAN(9),
        LESS_THAN_OR_EQUAL(10),
        UNRECOGNIZED(-1);

        public static final int EQ_VALUE = 3;
        public static final int EXISTS_VALUE = 5;
        public static final int GREATER_THAN_OR_EQUAL_VALUE = 8;
        public static final int GREATER_THAN_VALUE = 7;
        public static final int IN_VALUE = 1;
        public static final int LESS_THAN_OR_EQUAL_VALUE = 10;
        public static final int LESS_THAN_VALUE = 9;
        public static final int NEQ_VALUE = 4;
        public static final int NOT_EXISTS_VALUE = 6;
        public static final int NOT_IN_VALUE = 2;
        public static final int OP_UNSPECIFIED_VALUE = 0;
        private final int value;
        private static final d5 internalValueMap = new d5() { // from class: io.bidmachine.protobuf.sdk.Monitor.Operator.1
            public Operator findValueByNumber(int i) {
                return Operator.forNumber(i);
            }
        };
        private static final Operator[] VALUES = values();

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

        Operator(int i) {
            this.value = i;
        }

        public static Operator forNumber(int i) {
            switch (i) {
                case 0:
                    return OP_UNSPECIFIED;
                case 1:
                    return IN;
                case 2:
                    return NOT_IN;
                case 3:
                    return EQ;
                case 4:
                    return NEQ;
                case 5:
                    return EXISTS;
                case 6:
                    return NOT_EXISTS;
                case 7:
                    return GREATER_THAN;
                case 8:
                    return GREATER_THAN_OR_EQUAL;
                case 9:
                    return LESS_THAN;
                case 10:
                    return LESS_THAN_OR_EQUAL;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return Monitor.getDescriptor().getEnumTypes().get(0);
        }

        public static Operator valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static Operator valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Record extends y4 implements RecordOrBuilder {
        public static final int ERROR_FIELD_NUMBER = 3;
        public static final int FIELDS_FIELD_NUMBER = 2;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private Error error_;
        private Struct fields_;
        private byte memoizedIsInitialized;
        private Timestamp timestamp_;
        private static final Record DEFAULT_INSTANCE = new Record();
        private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Monitor.Record.1
            @Override // com.explorestack.protobuf.g7
            public Record parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                return new Record(rVar, o3Var);
            }
        };

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends g4 implements RecordOrBuilder {
            private v7 errorBuilder_;
            private Error error_;
            private v7 fieldsBuilder_;
            private Struct fields_;
            private v7 timestampBuilder_;
            private Timestamp timestamp_;

            private Builder() {
                super(null);
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_descriptor;
            }

            private v7 getErrorFieldBuilder() {
                if (this.errorBuilder_ == null) {
                    this.errorBuilder_ = new v7(getError(), getParentForChildren(), isClean());
                    this.error_ = null;
                }
                return this.errorBuilder_;
            }

            private v7 getFieldsFieldBuilder() {
                if (this.fieldsBuilder_ == null) {
                    this.fieldsBuilder_ = new v7(getFields(), getParentForChildren(), isClean());
                    this.fields_ = null;
                }
                return this.fieldsBuilder_;
            }

            private v7 getTimestampFieldBuilder() {
                if (this.timestampBuilder_ == null) {
                    this.timestampBuilder_ = new v7(getTimestamp(), getParentForChildren(), isClean());
                    this.timestamp_ = null;
                }
                return this.timestampBuilder_;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Record buildPartial() {
                Record record = new Record(this);
                v7 v7Var = this.timestampBuilder_;
                if (v7Var == null) {
                    record.timestamp_ = this.timestamp_;
                } else {
                    record.timestamp_ = (Timestamp) v7Var.a();
                }
                v7 v7Var2 = this.fieldsBuilder_;
                if (v7Var2 == null) {
                    record.fields_ = this.fields_;
                } else {
                    record.fields_ = (Struct) v7Var2.a();
                }
                v7 v7Var3 = this.errorBuilder_;
                if (v7Var3 == null) {
                    record.error_ = this.error_;
                } else {
                    record.error_ = (Error) v7Var3.a();
                }
                onBuilt();
                return record;
            }

            public Builder clearError() {
                if (this.errorBuilder_ == null) {
                    this.error_ = null;
                    onChanged();
                    return this;
                }
                this.error_ = null;
                this.errorBuilder_ = null;
                return this;
            }

            public Builder clearFields() {
                if (this.fieldsBuilder_ == null) {
                    this.fields_ = null;
                    onChanged();
                    return this;
                }
                this.fields_ = null;
                this.fieldsBuilder_ = null;
                return this;
            }

            public Builder clearTimestamp() {
                if (this.timestampBuilder_ == null) {
                    this.timestamp_ = null;
                    onChanged();
                    return this;
                }
                this.timestamp_ = null;
                this.timestampBuilder_ = null;
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public Error getError() {
                v7 v7Var = this.errorBuilder_;
                if (v7Var != null) {
                    return (Error) v7Var.d();
                }
                Error error = this.error_;
                return error == null ? Error.getDefaultInstance() : error;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public ErrorOrBuilder getErrorOrBuilder() {
                v7 v7Var = this.errorBuilder_;
                if (v7Var != null) {
                    return (ErrorOrBuilder) v7Var.e();
                }
                Error error = this.error_;
                return error == null ? Error.getDefaultInstance() : error;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public Struct getFields() {
                v7 v7Var = this.fieldsBuilder_;
                if (v7Var != null) {
                    return (Struct) v7Var.d();
                }
                Struct struct = this.fields_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public c8 getFieldsOrBuilder() {
                v7 v7Var = this.fieldsBuilder_;
                if (v7Var != null) {
                    return (c8) v7Var.e();
                }
                Struct struct = this.fields_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public Timestamp getTimestamp() {
                v7 v7Var = this.timestampBuilder_;
                if (v7Var != null) {
                    return (Timestamp) v7Var.d();
                }
                Timestamp timestamp = this.timestamp_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public g8 getTimestampOrBuilder() {
                v7 v7Var = this.timestampBuilder_;
                if (v7Var != null) {
                    return (g8) v7Var.e();
                }
                Timestamp timestamp = this.timestamp_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public boolean hasError() {
                return (this.errorBuilder_ == null && this.error_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public boolean hasFields() {
                return (this.fieldsBuilder_ == null && this.fields_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public boolean hasTimestamp() {
                return (this.timestampBuilder_ == null && this.timestamp_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.g4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_fieldAccessorTable;
                w4Var.c(Record.class, Builder.class);
                return w4Var;
            }

            public Builder mergeError(Error error) {
                v7 v7Var = this.errorBuilder_;
                if (v7Var != null) {
                    v7Var.f(error);
                    return this;
                }
                Error error2 = this.error_;
                if (error2 != null) {
                    this.error_ = Error.newBuilder(error2).mergeFrom(error).buildPartial();
                } else {
                    this.error_ = error;
                }
                onChanged();
                return this;
            }

            public Builder mergeFields(Struct struct) {
                v7 v7Var = this.fieldsBuilder_;
                if (v7Var != null) {
                    v7Var.f(struct);
                    return this;
                }
                Struct struct2 = this.fields_;
                if (struct2 != null) {
                    this.fields_ = z.m(struct2, struct);
                } else {
                    this.fields_ = struct;
                }
                onChanged();
                return this;
            }

            public Builder mergeTimestamp(Timestamp timestamp) {
                v7 v7Var = this.timestampBuilder_;
                if (v7Var != null) {
                    v7Var.f(timestamp);
                    return this;
                }
                Timestamp timestamp2 = this.timestamp_;
                if (timestamp2 != null) {
                    this.timestamp_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                } else {
                    this.timestamp_ = timestamp;
                }
                onChanged();
                return this;
            }

            public Builder setError(Error.Builder builder) {
                v7 v7Var = this.errorBuilder_;
                if (v7Var != null) {
                    v7Var.h(builder.build());
                    return this;
                }
                this.error_ = builder.build();
                onChanged();
                return this;
            }

            public Builder setFields(Struct.Builder builder) {
                v7 v7Var = this.fieldsBuilder_;
                if (v7Var != null) {
                    v7Var.h(builder.build());
                    return this;
                }
                this.fields_ = builder.build();
                onChanged();
                return this;
            }

            public Builder setTimestamp(Timestamp.Builder builder) {
                v7 v7Var = this.timestampBuilder_;
                if (v7Var != null) {
                    v7Var.h(builder.build());
                    return this;
                }
                this.timestamp_ = builder.build();
                onChanged();
                return this;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = y4.alwaysUseFieldBuilders;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Record build() {
                Record recordBuildPartial = buildPartial();
                if (recordBuildPartial.isInitialized()) {
                    return recordBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) recordBuildPartial);
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                if (this.timestampBuilder_ == null) {
                    this.timestamp_ = null;
                } else {
                    this.timestamp_ = null;
                    this.timestampBuilder_ = null;
                }
                if (this.fieldsBuilder_ == null) {
                    this.fields_ = null;
                } else {
                    this.fields_ = null;
                    this.fieldsBuilder_ = null;
                }
                if (this.errorBuilder_ == null) {
                    this.error_ = null;
                    return this;
                }
                this.error_ = null;
                this.errorBuilder_ = null;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo247clone() {
                return (Builder) super.mo247clone();
            }

            public Error.Builder getErrorBuilder() {
                onChanged();
                return (Error.Builder) getErrorFieldBuilder().c();
            }

            public Struct.Builder getFieldsBuilder() {
                onChanged();
                return (Struct.Builder) getFieldsFieldBuilder().c();
            }

            public Timestamp.Builder getTimestampBuilder() {
                onChanged();
                return (Timestamp.Builder) getTimestampFieldBuilder().c();
            }

            public Builder mergeFrom(Record record) {
                if (record == Record.getDefaultInstance()) {
                    return this;
                }
                if (record.hasTimestamp()) {
                    mergeTimestamp(record.getTimestamp());
                }
                if (record.hasFields()) {
                    mergeFields(record.getFields());
                }
                if (record.hasError()) {
                    mergeError(record.getError());
                }
                mergeUnknownFields(((y4) record).unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(s8 s8Var) {
                return (Builder) super.mergeUnknownFields(s8Var);
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
            public Record mo250getDefaultInstanceForType() {
                return Record.getDefaultInstance();
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

            public Builder setError(Error error) {
                v7 v7Var = this.errorBuilder_;
                if (v7Var == null) {
                    error.getClass();
                    this.error_ = error;
                    onChanged();
                    return this;
                }
                v7Var.h(error);
                return this;
            }

            public Builder setFields(Struct struct) {
                v7 v7Var = this.fieldsBuilder_;
                if (v7Var == null) {
                    struct.getClass();
                    this.fields_ = struct;
                    onChanged();
                    return this;
                }
                v7Var.h(struct);
                return this;
            }

            public Builder setTimestamp(Timestamp timestamp) {
                v7 v7Var = this.timestampBuilder_;
                if (v7Var == null) {
                    timestamp.getClass();
                    this.timestamp_ = timestamp;
                    onChanged();
                    return this;
                }
                v7Var.h(timestamp);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Record) {
                    return mergeFrom((Record) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                Record record = null;
                try {
                    try {
                        Record record2 = (Record) Record.PARSER.parsePartialFrom(rVar, o3Var);
                        if (record2 != null) {
                            mergeFrom(record2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Record record3 = (Record) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            record = record3;
                            if (record != null) {
                                mergeFrom(record);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (record != null) {
                        mergeFrom(record);
                    }
                    throw th;
                }
            }
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Record)) {
                return super.equals(obj);
            }
            Record record = (Record) obj;
            if (hasTimestamp() != record.hasTimestamp()) {
                return false;
            }
            if ((hasTimestamp() && !getTimestamp().equals(record.getTimestamp())) || hasFields() != record.hasFields()) {
                return false;
            }
            if ((!hasFields() || getFields().equals(record.getFields())) && hasError() == record.hasError()) {
                return (!hasError() || getError().equals(record.getError())) && this.unknownFields.equals(record.unknownFields);
            }
            return false;
        }

        public static Record getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_descriptor;
        }

        public static Builder newBuilder(Record record) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(record);
        }

        public static Record parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Record) y4.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Record parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(byteBuffer);
        }

        public static g7 parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public Error getError() {
            Error error = this.error_;
            return error == null ? Error.getDefaultInstance() : error;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public Struct getFields() {
            Struct struct = this.fields_;
            return struct == null ? Struct.getDefaultInstance() : struct;
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
            int iO = this.timestamp_ != null ? w.o(1, getTimestamp()) : 0;
            if (this.fields_ != null) {
                iO += w.o(2, getFields());
            }
            if (this.error_ != null) {
                iO += w.o(3, getError());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iO;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public Timestamp getTimestamp() {
            Timestamp timestamp = this.timestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final s8 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public boolean hasError() {
            return this.error_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public boolean hasFields() {
            return this.fields_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public boolean hasTimestamp() {
            return this.timestamp_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTimestamp()) {
                iHashCode = pv1.c(iHashCode, 37, 1, 53) + getTimestamp().hashCode();
            }
            if (hasFields()) {
                iHashCode = pv1.c(iHashCode, 37, 2, 53) + getFields().hashCode();
            }
            if (hasError()) {
                iHashCode = pv1.c(iHashCode, 37, 3, 53) + getError().hashCode();
            }
            int iHashCode2 = this.unknownFields.a.hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.y4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_fieldAccessorTable;
            w4Var.c(Record.class, Builder.class);
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
            return new Record();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(w wVar) throws IOException {
            if (this.timestamp_ != null) {
                wVar.M(1, getTimestamp());
            }
            if (this.fields_ != null) {
                wVar.M(2, getFields());
            }
            if (this.error_ != null) {
                wVar.M(3, getError());
            }
            this.unknownFields.writeTo(wVar);
        }

        private Record(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
            this();
            o3Var.getClass();
            p8 p8VarB = s8.b();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int iF = rVar.F();
                            if (iF != 0) {
                                if (iF != 10) {
                                    if (iF != 18) {
                                        if (iF != 26) {
                                            if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                            }
                                        } else {
                                            Error error = this.error_;
                                            Error.Builder builder = error != null ? error.toBuilder() : null;
                                            Error error2 = (Error) rVar.v(Error.parser(), o3Var);
                                            this.error_ = error2;
                                            if (builder != null) {
                                                builder.mergeFrom(error2);
                                                this.error_ = builder.buildPartial();
                                            }
                                        }
                                    } else {
                                        Struct struct = this.fields_;
                                        Struct.Builder builder2 = struct != null ? struct.toBuilder() : null;
                                        Struct struct2 = (Struct) rVar.v(Struct.parser(), o3Var);
                                        this.fields_ = struct2;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(struct2);
                                            this.fields_ = builder2.buildPartial();
                                        }
                                    }
                                } else {
                                    Timestamp timestamp = this.timestamp_;
                                    Timestamp.Builder builder3 = timestamp != null ? timestamp.toBuilder() : null;
                                    Timestamp timestamp2 = (Timestamp) rVar.v(Timestamp.parser(), o3Var);
                                    this.timestamp_ = timestamp2;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(timestamp2);
                                        this.timestamp_ = builder3.buildPartial();
                                    }
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

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public ErrorOrBuilder getErrorOrBuilder() {
            return getError();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public c8 getFieldsOrBuilder() {
            return getFields();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public g8 getTimestampOrBuilder() {
            return getTimestamp();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Record mo250getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Record parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Record) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
        }

        public static Record parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(byteBuffer, o3Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Record parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Record parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(byteString, o3Var);
        }

        public static Record parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(bArr);
        }

        public static Record parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(bArr, o3Var);
        }

        public static Record parseFrom(InputStream inputStream) throws IOException {
            return (Record) y4.parseWithIOException(PARSER, inputStream);
        }

        public static Record parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Record) y4.parseWithIOException(PARSER, inputStream, o3Var);
        }

        public static Record parseFrom(r rVar) throws IOException {
            return (Record) y4.parseWithIOException(PARSER, rVar);
        }

        public static Record parseFrom(r rVar, o3 o3Var) throws IOException {
            return (Record) y4.parseWithIOException(PARSER, rVar, o3Var);
        }

        private Record(g4 g4Var) {
            super(g4Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        private Record() {
            this.memoizedIsInitialized = (byte) -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface RecordOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo250getDefaultInstanceForType();

        Error getError();

        ErrorOrBuilder getErrorOrBuilder();

        Struct getFields();

        c8 getFieldsOrBuilder();

        Timestamp getTimestamp();

        g8 getTimestampOrBuilder();

        boolean hasError();

        boolean hasFields();

        boolean hasTimestamp();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Rule extends y4 implements RuleOrBuilder {
        public static final int MISSING_FIELD_NUMBER = 4;
        public static final int OP_FIELD_NUMBER = 2;
        public static final int PATH_FIELD_NUMBER = 1;
        public static final int VALUES_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int missing_;
        private int op_;
        private s5 path_;
        private List<Value> values_;
        private static final Rule DEFAULT_INSTANCE = new Rule();
        private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Monitor.Rule.1
            @Override // com.explorestack.protobuf.g7
            public Rule parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                return new Rule(rVar, o3Var);
            }
        };

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends g4 implements RuleOrBuilder {
            private int bitField0_;
            private int missing_;
            private int op_;
            private s5 path_;
            private o7 valuesBuilder_;
            private List<Value> values_;

            private Builder() {
                super(null);
                this.path_ = r5.c;
                this.op_ = 0;
                this.values_ = Collections.EMPTY_LIST;
                this.missing_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder clearMissing() {
                this.missing_ = 0;
                onChanged();
                return this;
            }

            public Builder clearOp() {
                this.op_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            private void ensurePathIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.path_ = new r5(this.path_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureValuesIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.values_ = new ArrayList(this.values_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Rule_descriptor;
            }

            private o7 getValuesFieldBuilder() {
                if (this.valuesBuilder_ == null) {
                    this.valuesBuilder_ = new o7(this.values_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.values_ = null;
                }
                return this.valuesBuilder_;
            }

            public Builder addAllValues(Iterable<? extends Value> iterable) {
                o7 o7Var = this.valuesBuilder_;
                if (o7Var != null) {
                    o7Var.a(iterable);
                    return this;
                }
                ensureValuesIsMutable();
                b.addAll((Iterable) iterable, (List) this.values_);
                onChanged();
                return this;
            }

            public Builder addValues(Value.Builder builder) {
                o7 o7Var = this.valuesBuilder_;
                if (o7Var != null) {
                    o7Var.e(builder.build());
                    return this;
                }
                ensureValuesIsMutable();
                this.values_.add(builder.build());
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Rule buildPartial() {
                Rule rule = new Rule(this);
                if ((this.bitField0_ & 1) != 0) {
                    this.path_ = this.path_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                rule.path_ = this.path_;
                rule.op_ = this.op_;
                o7 o7Var = this.valuesBuilder_;
                if (o7Var == null) {
                    if ((this.bitField0_ & 2) != 0) {
                        this.values_ = Collections.unmodifiableList(this.values_);
                        this.bitField0_ &= -3;
                    }
                    rule.values_ = this.values_;
                } else {
                    rule.values_ = o7Var.f();
                }
                rule.missing_ = this.missing_;
                onBuilt();
                return rule;
            }

            public Builder clearPath() {
                this.path_ = r5.c;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearValues() {
                o7 o7Var = this.valuesBuilder_;
                if (o7Var != null) {
                    o7Var.g();
                    return this;
                }
                this.values_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Rule_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
            public MissingBehavior getMissing() {
                MissingBehavior missingBehaviorValueOf = MissingBehavior.valueOf(this.missing_);
                return missingBehaviorValueOf == null ? MissingBehavior.UNRECOGNIZED : missingBehaviorValueOf;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
            public int getMissingValue() {
                return this.missing_;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
            public Operator getOp() {
                Operator operatorValueOf = Operator.valueOf(this.op_);
                return operatorValueOf == null ? Operator.UNRECOGNIZED : operatorValueOf;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
            public int getOpValue() {
                return this.op_;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
            public String getPath(int i) {
                return (String) this.path_.get(i);
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
            public ByteString getPathBytes(int i) {
                return this.path_.getByteString(i);
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
            public int getPathCount() {
                return this.path_.size();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
            public j7 getPathList() {
                return this.path_.getUnmodifiableView();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
            public Value getValues(int i) {
                o7 o7Var = this.valuesBuilder_;
                return o7Var == null ? this.values_.get(i) : (Value) o7Var.l(i, false);
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
            public int getValuesCount() {
                o7 o7Var = this.valuesBuilder_;
                return o7Var == null ? this.values_.size() : o7Var.b.size();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
            public List<Value> getValuesList() {
                o7 o7Var = this.valuesBuilder_;
                return o7Var == null ? Collections.unmodifiableList(this.values_) : o7Var.m();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
            public ValueOrBuilder getValuesOrBuilder(int i) {
                o7 o7Var = this.valuesBuilder_;
                return o7Var == null ? this.values_.get(i) : (ValueOrBuilder) o7Var.n(i);
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
            public List<? extends ValueOrBuilder> getValuesOrBuilderList() {
                o7 o7Var = this.valuesBuilder_;
                return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.values_);
            }

            @Override // com.explorestack.protobuf.g4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Rule_fieldAccessorTable;
                w4Var.c(Rule.class, Builder.class);
                return w4Var;
            }

            public Builder removeValues(int i) {
                o7 o7Var = this.valuesBuilder_;
                if (o7Var != null) {
                    o7Var.r(i);
                    return this;
                }
                ensureValuesIsMutable();
                this.values_.remove(i);
                onChanged();
                return this;
            }

            public Builder setMissingValue(int i) {
                this.missing_ = i;
                onChanged();
                return this;
            }

            public Builder setOpValue(int i) {
                this.op_ = i;
                onChanged();
                return this;
            }

            public Builder setValues(int i, Value.Builder builder) {
                o7 o7Var = this.valuesBuilder_;
                if (o7Var != null) {
                    o7Var.s(i, builder.build());
                    return this;
                }
                ensureValuesIsMutable();
                this.values_.set(i, builder.build());
                onChanged();
                return this;
            }

            private void maybeForceBuilderInitialization() {
                if (y4.alwaysUseFieldBuilders) {
                    getValuesFieldBuilder();
                }
            }

            public Builder addAllPath(Iterable<String> iterable) {
                ensurePathIsMutable();
                b.addAll((Iterable) iterable, (List) this.path_);
                onChanged();
                return this;
            }

            public Builder addPath(String str) {
                str.getClass();
                ensurePathIsMutable();
                this.path_.add(str);
                onChanged();
                return this;
            }

            public Builder addPathBytes(ByteString byteString) {
                byteString.getClass();
                c.checkByteStringIsUtf8(byteString);
                ensurePathIsMutable();
                this.path_.b(byteString);
                onChanged();
                return this;
            }

            public Value.Builder addValuesBuilder() {
                return (Value.Builder) getValuesFieldBuilder().c(Value.getDefaultInstance());
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Rule build() {
                Rule ruleBuildPartial = buildPartial();
                if (ruleBuildPartial.isInitialized()) {
                    return ruleBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) ruleBuildPartial);
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.path_ = r5.c;
                int i = this.bitField0_;
                this.bitField0_ = i & (-2);
                this.op_ = 0;
                o7 o7Var = this.valuesBuilder_;
                if (o7Var == null) {
                    this.values_ = Collections.EMPTY_LIST;
                    this.bitField0_ = i & (-4);
                } else {
                    o7Var.g();
                }
                this.missing_ = 0;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo247clone() {
                return (Builder) super.mo247clone();
            }

            public Value.Builder getValuesBuilder(int i) {
                return (Value.Builder) getValuesFieldBuilder().j(i);
            }

            public List<Value.Builder> getValuesBuilderList() {
                return getValuesFieldBuilder().k();
            }

            public Builder mergeFrom(Rule rule) {
                if (rule == Rule.getDefaultInstance()) {
                    return this;
                }
                if (!rule.path_.isEmpty()) {
                    if (this.path_.isEmpty()) {
                        this.path_ = rule.path_;
                        this.bitField0_ &= -2;
                    } else {
                        ensurePathIsMutable();
                        this.path_.addAll(rule.path_);
                    }
                    onChanged();
                }
                if (rule.op_ != 0) {
                    setOpValue(rule.getOpValue());
                }
                if (this.valuesBuilder_ == null) {
                    if (!rule.values_.isEmpty()) {
                        if (this.values_.isEmpty()) {
                            this.values_ = rule.values_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureValuesIsMutable();
                            this.values_.addAll(rule.values_);
                        }
                        onChanged();
                    }
                } else if (!rule.values_.isEmpty()) {
                    boolean zIsEmpty = this.valuesBuilder_.b.isEmpty();
                    o7 o7Var = this.valuesBuilder_;
                    if (zIsEmpty) {
                        o7 valuesFieldBuilder = null;
                        o7Var.a = null;
                        this.valuesBuilder_ = null;
                        this.values_ = rule.values_;
                        this.bitField0_ &= -3;
                        if (y4.alwaysUseFieldBuilders) {
                            valuesFieldBuilder = getValuesFieldBuilder();
                        }
                        this.valuesBuilder_ = valuesFieldBuilder;
                    } else {
                        o7Var.a(rule.values_);
                    }
                }
                if (rule.missing_ != 0) {
                    setMissingValue(rule.getMissingValue());
                }
                mergeUnknownFields(((y4) rule).unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(s8 s8Var) {
                return (Builder) super.mergeUnknownFields(s8Var);
            }

            public Builder setMissing(MissingBehavior missingBehavior) {
                missingBehavior.getClass();
                this.missing_ = missingBehavior.getNumber();
                onChanged();
                return this;
            }

            public Builder setOp(Operator operator) {
                operator.getClass();
                this.op_ = operator.getNumber();
                onChanged();
                return this;
            }

            public Builder setPath(int i, String str) {
                str.getClass();
                ensurePathIsMutable();
                this.path_.set(i, str);
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
            public Rule mo250getDefaultInstanceForType() {
                return Rule.getDefaultInstance();
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

            public Value.Builder addValuesBuilder(int i) {
                return (Value.Builder) getValuesFieldBuilder().b(i, Value.getDefaultInstance());
            }

            private Builder(h4 h4Var) {
                super(h4Var);
                this.path_ = r5.c;
                this.op_ = 0;
                this.values_ = Collections.EMPTY_LIST;
                this.missing_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder addValues(int i, Value value) {
                o7 o7Var = this.valuesBuilder_;
                if (o7Var == null) {
                    value.getClass();
                    ensureValuesIsMutable();
                    this.values_.add(i, value);
                    onChanged();
                    return this;
                }
                o7Var.d(i, value);
                return this;
            }

            public Builder setValues(int i, Value value) {
                o7 o7Var = this.valuesBuilder_;
                if (o7Var == null) {
                    value.getClass();
                    ensureValuesIsMutable();
                    this.values_.set(i, value);
                    onChanged();
                    return this;
                }
                o7Var.s(i, value);
                return this;
            }

            public Builder addValues(Value value) {
                o7 o7Var = this.valuesBuilder_;
                if (o7Var == null) {
                    value.getClass();
                    ensureValuesIsMutable();
                    this.values_.add(value);
                    onChanged();
                    return this;
                }
                o7Var.e(value);
                return this;
            }

            public Builder addValues(int i, Value.Builder builder) {
                o7 o7Var = this.valuesBuilder_;
                if (o7Var == null) {
                    ensureValuesIsMutable();
                    this.values_.add(i, builder.build());
                    onChanged();
                    return this;
                }
                o7Var.d(i, builder.build());
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Rule) {
                    return mergeFrom((Rule) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                Rule rule = null;
                try {
                    try {
                        Rule rule2 = (Rule) Rule.PARSER.parsePartialFrom(rVar, o3Var);
                        if (rule2 != null) {
                            mergeFrom(rule2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Rule rule3 = (Rule) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            rule = rule3;
                            if (rule != null) {
                                mergeFrom(rule);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (rule != null) {
                        mergeFrom(rule);
                    }
                    throw th;
                }
            }
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Rule)) {
                return super.equals(obj);
            }
            Rule rule = (Rule) obj;
            return getPathList().equals(rule.getPathList()) && this.op_ == rule.op_ && getValuesList().equals(rule.getValuesList()) && this.missing_ == rule.missing_ && this.unknownFields.equals(rule.unknownFields);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(w wVar) throws IOException {
            int iL = 0;
            while (iL < this.path_.size()) {
                iL = z.l(this.path_, iL, wVar, 1, iL, 1);
            }
            if (this.op_ != Operator.OP_UNSPECIFIED.getNumber()) {
                wVar.K(2, this.op_);
            }
            for (int i = 0; i < this.values_.size(); i++) {
                wVar.M(3, this.values_.get(i));
            }
            if (this.missing_ != MissingBehavior.MISSING_UNSPECIFIED.getNumber()) {
                wVar.K(4, this.missing_);
            }
            this.unknownFields.writeTo(wVar);
        }

        public static Rule getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Rule_descriptor;
        }

        public static Builder newBuilder(Rule rule) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(rule);
        }

        public static Rule parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Rule) y4.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Rule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Rule) PARSER.parseFrom(byteBuffer);
        }

        public static g7 parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
        public MissingBehavior getMissing() {
            MissingBehavior missingBehaviorValueOf = MissingBehavior.valueOf(this.missing_);
            return missingBehaviorValueOf == null ? MissingBehavior.UNRECOGNIZED : missingBehaviorValueOf;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
        public int getMissingValue() {
            return this.missing_;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
        public Operator getOp() {
            Operator operatorValueOf = Operator.valueOf(this.op_);
            return operatorValueOf == null ? Operator.UNRECOGNIZED : operatorValueOf;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
        public int getOpValue() {
            return this.op_;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public g7 getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
        public String getPath(int i) {
            return (String) this.path_.get(i);
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
        public ByteString getPathBytes(int i) {
            return this.path_.getByteString(i);
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
        public int getPathCount() {
            return this.path_.size();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iK = 0;
            for (int i2 = 0; i2 < this.path_.size(); i2++) {
                iK = z.k(this.path_, i2, iK);
            }
            int size = getPathList().size() + iK;
            if (this.op_ != Operator.OP_UNSPECIFIED.getNumber()) {
                size += w.g(2, this.op_);
            }
            for (int i3 = 0; i3 < this.values_.size(); i3++) {
                size += w.o(3, this.values_.get(i3));
            }
            if (this.missing_ != MissingBehavior.MISSING_UNSPECIFIED.getNumber()) {
                size += w.g(4, this.missing_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final s8 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
        public Value getValues(int i) {
            return this.values_.get(i);
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
        public int getValuesCount() {
            return this.values_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
        public List<Value> getValuesList() {
            return this.values_;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
        public ValueOrBuilder getValuesOrBuilder(int i) {
            return this.values_.get(i);
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
        public List<? extends ValueOrBuilder> getValuesOrBuilderList() {
            return this.values_;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getPathCount() > 0) {
                iHashCode = pv1.c(iHashCode, 37, 1, 53) + getPathList().hashCode();
            }
            int iC = pv1.c(iHashCode, 37, 2, 53) + this.op_;
            if (getValuesCount() > 0) {
                iC = pv1.c(iC, 37, 3, 53) + getValuesList().hashCode();
            }
            int iHashCode2 = this.unknownFields.a.hashCode() + ((pv1.c(iC, 37, 4, 53) + this.missing_) * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.y4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Rule_fieldAccessorTable;
            w4Var.c(Rule.class, Builder.class);
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
            return new Rule();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private Rule(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
            this();
            o3Var.getClass();
            p8 p8VarB = s8.b();
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int iF = rVar.F();
                        if (iF != 0) {
                            if (iF != 10) {
                                if (iF != 16) {
                                    if (iF != 26) {
                                        if (iF != 32) {
                                            if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                            }
                                        } else {
                                            this.missing_ = rVar.o();
                                        }
                                    } else {
                                        if ((i & 2) == 0) {
                                            this.values_ = new ArrayList();
                                            i |= 2;
                                        }
                                        this.values_.add((Value) rVar.v(Value.parser(), o3Var));
                                    }
                                } else {
                                    this.op_ = rVar.o();
                                }
                            } else {
                                String strE = rVar.E();
                                if ((i & 1) == 0) {
                                    this.path_ = new r5();
                                    i |= 1;
                                }
                                this.path_.add(strE);
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((i & 1) != 0) {
                        this.path_ = this.path_.getUnmodifiableView();
                    }
                    if ((i & 2) != 0) {
                        this.values_ = Collections.unmodifiableList(this.values_);
                    }
                    this.unknownFields = p8VarB.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 1) != 0) {
                this.path_ = this.path_.getUnmodifiableView();
            }
            if ((i & 2) != 0) {
                this.values_ = Collections.unmodifiableList(this.values_);
            }
            this.unknownFields = p8VarB.build();
            makeExtensionsImmutable();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
        public j7 getPathList() {
            return this.path_;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Rule mo250getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Rule parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Rule) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
        }

        public static Rule parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
            return (Rule) PARSER.parseFrom(byteBuffer, o3Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Rule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Rule) PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Rule parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
            return (Rule) PARSER.parseFrom(byteString, o3Var);
        }

        public static Rule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Rule) PARSER.parseFrom(bArr);
        }

        public static Rule parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
            return (Rule) PARSER.parseFrom(bArr, o3Var);
        }

        public static Rule parseFrom(InputStream inputStream) throws IOException {
            return (Rule) y4.parseWithIOException(PARSER, inputStream);
        }

        public static Rule parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Rule) y4.parseWithIOException(PARSER, inputStream, o3Var);
        }

        public static Rule parseFrom(r rVar) throws IOException {
            return (Rule) y4.parseWithIOException(PARSER, rVar);
        }

        public static Rule parseFrom(r rVar, o3 o3Var) throws IOException {
            return (Rule) y4.parseWithIOException(PARSER, rVar, o3Var);
        }

        private Rule(g4 g4Var) {
            super(g4Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        private Rule() {
            this.memoizedIsInitialized = (byte) -1;
            this.path_ = r5.c;
            this.op_ = 0;
            this.values_ = Collections.EMPTY_LIST;
            this.missing_ = 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface RuleOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo250getDefaultInstanceForType();

        MissingBehavior getMissing();

        int getMissingValue();

        Operator getOp();

        int getOpValue();

        String getPath(int i);

        ByteString getPathBytes(int i);

        int getPathCount();

        List<String> getPathList();

        Value getValues(int i);

        int getValuesCount();

        List<Value> getValuesList();

        ValueOrBuilder getValuesOrBuilder(int i);

        List<? extends ValueOrBuilder> getValuesOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Value extends y4 implements ValueOrBuilder {
        public static final int BOOL_VALUE_FIELD_NUMBER = 3;
        public static final int DOUBLE_VALUE_FIELD_NUMBER = 4;
        public static final int INT_VALUE_FIELD_NUMBER = 2;
        public static final int STRING_VALUE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int kindCase_;
        private Object kind_;
        private byte memoizedIsInitialized;
        private static final Value DEFAULT_INSTANCE = new Value();
        private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Monitor.Value.1
            @Override // com.explorestack.protobuf.g7
            public Value parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                return new Value(rVar, o3Var);
            }
        };

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends g4 implements ValueOrBuilder {
            private int kindCase_;
            private Object kind_;

            private Builder() {
                super(null);
                this.kindCase_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder clearKind() {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setBoolValue(boolean z) {
                this.kindCase_ = 3;
                this.kind_ = Boolean.valueOf(z);
                onChanged();
                return this;
            }

            public Builder setDoubleValue(double d) {
                this.kindCase_ = 4;
                this.kind_ = Double.valueOf(d);
                onChanged();
                return this;
            }

            public Builder setIntValue(long j) {
                this.kindCase_ = 2;
                this.kind_ = Long.valueOf(j);
                onChanged();
                return this;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Value_descriptor;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Value buildPartial() {
                Value value = new Value(this);
                if (this.kindCase_ == 1) {
                    value.kind_ = this.kind_;
                }
                if (this.kindCase_ == 2) {
                    value.kind_ = this.kind_;
                }
                if (this.kindCase_ == 3) {
                    value.kind_ = this.kind_;
                }
                if (this.kindCase_ == 4) {
                    value.kind_ = this.kind_;
                }
                value.kindCase_ = this.kindCase_;
                onBuilt();
                return value;
            }

            public Builder clearBoolValue() {
                if (this.kindCase_ == 3) {
                    this.kindCase_ = 0;
                    this.kind_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearDoubleValue() {
                if (this.kindCase_ == 4) {
                    this.kindCase_ = 0;
                    this.kind_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearIntValue() {
                if (this.kindCase_ == 2) {
                    this.kindCase_ = 0;
                    this.kind_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearStringValue() {
                if (this.kindCase_ == 1) {
                    this.kindCase_ = 0;
                    this.kind_ = null;
                    onChanged();
                }
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
            public boolean getBoolValue() {
                if (this.kindCase_ == 3) {
                    return ((Boolean) this.kind_).booleanValue();
                }
                return false;
            }

            @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Value_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
            public double getDoubleValue() {
                if (this.kindCase_ == 4) {
                    return ((Double) this.kind_).doubleValue();
                }
                return 0.0d;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
            public long getIntValue() {
                if (this.kindCase_ == 2) {
                    return ((Long) this.kind_).longValue();
                }
                return 0L;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
            public KindCase getKindCase() {
                return KindCase.forNumber(this.kindCase_);
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
            public String getStringValue() {
                Object obj = this.kindCase_ == 1 ? this.kind_ : "";
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                if (this.kindCase_ == 1) {
                    this.kind_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
            public ByteString getStringValueBytes() {
                Object obj = this.kindCase_ == 1 ? this.kind_ : "";
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                if (this.kindCase_ == 1) {
                    this.kind_ = byteStringCopyFromUtf8;
                }
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
            public boolean hasBoolValue() {
                return this.kindCase_ == 3;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
            public boolean hasDoubleValue() {
                return this.kindCase_ == 4;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
            public boolean hasIntValue() {
                return this.kindCase_ == 2;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
            public boolean hasStringValue() {
                return this.kindCase_ == 1;
            }

            @Override // com.explorestack.protobuf.g4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Value_fieldAccessorTable;
                w4Var.c(Value.class, Builder.class);
                return w4Var;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = y4.alwaysUseFieldBuilders;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Value build() {
                Value valueBuildPartial = buildPartial();
                if (valueBuildPartial.isInitialized()) {
                    return valueBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) valueBuildPartial);
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.kindCase_ = 0;
                this.kind_ = null;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo247clone() {
                return (Builder) super.mo247clone();
            }

            public Builder mergeFrom(Value value) {
                if (value == Value.getDefaultInstance()) {
                    return this;
                }
                int i = AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$sdk$Monitor$Value$KindCase[value.getKindCase().ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                setDoubleValue(value.getDoubleValue());
                            }
                        } else {
                            setBoolValue(value.getBoolValue());
                        }
                    } else {
                        setIntValue(value.getIntValue());
                    }
                } else {
                    this.kindCase_ = 1;
                    this.kind_ = value.kind_;
                    onChanged();
                }
                mergeUnknownFields(((y4) value).unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(s8 s8Var) {
                return (Builder) super.mergeUnknownFields(s8Var);
            }

            public Builder setStringValue(String str) {
                str.getClass();
                this.kindCase_ = 1;
                this.kind_ = str;
                onChanged();
                return this;
            }

            public Builder setStringValueBytes(ByteString byteString) {
                byteString.getClass();
                c.checkByteStringIsUtf8(byteString);
                this.kindCase_ = 1;
                this.kind_ = byteString;
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
            public Value mo250getDefaultInstanceForType() {
                return Value.getDefaultInstance();
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
                this.kindCase_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Value) {
                    return mergeFrom((Value) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                Value value = null;
                try {
                    try {
                        Value value2 = (Value) Value.PARSER.parsePartialFrom(rVar, o3Var);
                        if (value2 != null) {
                            mergeFrom(value2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Value value3 = (Value) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            value = value3;
                            if (value != null) {
                                mergeFrom(value);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (value != null) {
                        mergeFrom(value);
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public enum KindCase implements c5 {
            STRING_VALUE(1),
            INT_VALUE(2),
            BOOL_VALUE(3),
            DOUBLE_VALUE(4),
            KIND_NOT_SET(0);

            private final int value;

            public static KindCase forNumber(int i) {
                if (i == 0) {
                    return KIND_NOT_SET;
                }
                if (i == 1) {
                    return STRING_VALUE;
                }
                if (i == 2) {
                    return INT_VALUE;
                }
                if (i == 3) {
                    return BOOL_VALUE;
                }
                if (i != 4) {
                    return null;
                }
                return DOUBLE_VALUE;
            }

            @Override // com.explorestack.protobuf.c5
            public int getNumber() {
                return this.value;
            }

            KindCase(int i) {
                this.value = i;
            }

            @Deprecated
            public static KindCase valueOf(int i) {
                return forNumber(i);
            }
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Value)) {
                return super.equals(obj);
            }
            Value value = (Value) obj;
            if (!getKindCase().equals(value.getKindCase())) {
                return false;
            }
            int i = this.kindCase_;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && Double.doubleToLongBits(getDoubleValue()) != Double.doubleToLongBits(value.getDoubleValue())) {
                            return false;
                        }
                    } else if (getBoolValue() != value.getBoolValue()) {
                        return false;
                    }
                } else if (getIntValue() != value.getIntValue()) {
                    return false;
                }
            } else if (!getStringValue().equals(value.getStringValue())) {
                return false;
            }
            return this.unknownFields.equals(value.unknownFields);
        }

        public static Value getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Value_descriptor;
        }

        public static Builder newBuilder(Value value) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(value);
        }

        public static Value parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Value) y4.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Value parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Value) PARSER.parseFrom(byteBuffer);
        }

        public static g7 parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
        public boolean getBoolValue() {
            if (this.kindCase_ == 3) {
                return ((Boolean) this.kind_).booleanValue();
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
        public double getDoubleValue() {
            if (this.kindCase_ == 4) {
                return ((Double) this.kind_).doubleValue();
            }
            return 0.0d;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
        public long getIntValue() {
            if (this.kindCase_ == 2) {
                return ((Long) this.kind_).longValue();
            }
            return 0L;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
        public KindCase getKindCase() {
            return KindCase.forNumber(this.kindCase_);
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
            int iComputeStringSize = this.kindCase_ == 1 ? y4.computeStringSize(1, this.kind_) : 0;
            if (this.kindCase_ == 2) {
                iComputeStringSize += w.n(2, ((Long) this.kind_).longValue());
            }
            if (this.kindCase_ == 3) {
                ((Boolean) this.kind_).getClass();
                iComputeStringSize += w.c(3);
            }
            if (this.kindCase_ == 4) {
                ((Double) this.kind_).getClass();
                iComputeStringSize += w.f(4);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
        public String getStringValue() {
            Object obj = this.kindCase_ == 1 ? this.kind_ : "";
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            if (this.kindCase_ == 1) {
                this.kind_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
        public ByteString getStringValueBytes() {
            Object obj = this.kindCase_ == 1 ? this.kind_ : "";
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            if (this.kindCase_ == 1) {
                this.kind_ = byteStringCopyFromUtf8;
            }
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final s8 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
        public boolean hasBoolValue() {
            return this.kindCase_ == 3;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
        public boolean hasDoubleValue() {
            return this.kindCase_ == 4;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
        public boolean hasIntValue() {
            return this.kindCase_ == 2;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
        public boolean hasStringValue() {
            return this.kindCase_ == 1;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int iC;
            int iHashCode;
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode2 = getDescriptor().hashCode() + 779;
            int i2 = this.kindCase_;
            if (i2 == 1) {
                iC = pv1.c(iHashCode2, 37, 1, 53);
                iHashCode = getStringValue().hashCode();
            } else if (i2 == 2) {
                iC = pv1.c(iHashCode2, 37, 2, 53);
                iHashCode = l5.d(getIntValue());
            } else {
                if (i2 != 3) {
                    if (i2 == 4) {
                        iC = pv1.c(iHashCode2, 37, 4, 53);
                        iHashCode = l5.d(Double.doubleToLongBits(getDoubleValue()));
                    }
                    int iHashCode3 = this.unknownFields.a.hashCode() + (iHashCode2 * 29);
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
                }
                iC = pv1.c(iHashCode2, 37, 3, 53);
                iHashCode = l5.c(getBoolValue());
            }
            iHashCode2 = iC + iHashCode;
            int iHashCode4 = this.unknownFields.a.hashCode() + (iHashCode2 * 29);
            this.memoizedHashCode = iHashCode4;
            return iHashCode4;
        }

        @Override // com.explorestack.protobuf.y4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Value_fieldAccessorTable;
            w4Var.c(Value.class, Builder.class);
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
            return new Value();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(w wVar) throws IOException {
            if (this.kindCase_ == 1) {
                y4.writeString(wVar, 1, this.kind_);
            }
            if (this.kindCase_ == 2) {
                wVar.V(2, ((Long) this.kind_).longValue());
            }
            if (this.kindCase_ == 3) {
                wVar.A(3, ((Boolean) this.kind_).booleanValue());
            }
            if (this.kindCase_ == 4) {
                wVar.E(4, ((Double) this.kind_).doubleValue());
            }
            this.unknownFields.writeTo(wVar);
        }

        private Value(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
            this();
            o3Var.getClass();
            p8 p8VarB = s8.b();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iF = rVar.F();
                        if (iF != 0) {
                            if (iF != 10) {
                                if (iF != 16) {
                                    if (iF != 24) {
                                        if (iF != 33) {
                                            if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                            }
                                        } else {
                                            this.kindCase_ = 4;
                                            this.kind_ = Double.valueOf(rVar.n());
                                        }
                                    } else {
                                        this.kindCase_ = 3;
                                        this.kind_ = Boolean.valueOf(rVar.l());
                                    }
                                } else {
                                    this.kindCase_ = 2;
                                    this.kind_ = Long.valueOf(rVar.u());
                                }
                            } else {
                                String strE = rVar.E();
                                this.kindCase_ = 1;
                                this.kind_ = strE;
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
        public Value mo250getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Value parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Value) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
        }

        public static Value parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
            return (Value) PARSER.parseFrom(byteBuffer, o3Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Value parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Value) PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Value parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
            return (Value) PARSER.parseFrom(byteString, o3Var);
        }

        public static Value parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Value) PARSER.parseFrom(bArr);
        }

        public static Value parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
            return (Value) PARSER.parseFrom(bArr, o3Var);
        }

        public static Value parseFrom(InputStream inputStream) throws IOException {
            return (Value) y4.parseWithIOException(PARSER, inputStream);
        }

        public static Value parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Value) y4.parseWithIOException(PARSER, inputStream, o3Var);
        }

        public static Value parseFrom(r rVar) throws IOException {
            return (Value) y4.parseWithIOException(PARSER, rVar);
        }

        public static Value parseFrom(r rVar, o3 o3Var) throws IOException {
            return (Value) y4.parseWithIOException(PARSER, rVar, o3Var);
        }

        private Value(g4 g4Var) {
            super(g4Var);
            this.kindCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        private Value() {
            this.kindCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ValueOrBuilder extends MessageOrBuilder {
        boolean getBoolValue();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo250getDefaultInstanceForType();

        double getDoubleValue();

        long getIntValue();

        Value.KindCase getKindCase();

        String getStringValue();

        ByteString getStringValueBytes();

        boolean hasBoolValue();

        boolean hasDoubleValue();

        boolean hasIntValue();

        boolean hasStringValue();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Monitor)) {
            return super.equals(obj);
        }
        Monitor monitor = (Monitor) obj;
        return getName().equals(monitor.getName()) && getRecordsList().equals(monitor.getRecordsList()) && this.unknownFields.equals(monitor.unknownFields);
    }

    /* JADX INFO: renamed from: io.bidmachine.protobuf.sdk.Monitor$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$sdk$Monitor$Configuration$ConfigExtensionCase;
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$sdk$Monitor$FilterExpression$NodeCase;
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$sdk$Monitor$Value$KindCase;

        static {
            int[] iArr = new int[Value.KindCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$sdk$Monitor$Value$KindCase = iArr;
            try {
                iArr[Value.KindCase.STRING_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Monitor$Value$KindCase[Value.KindCase.INT_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Monitor$Value$KindCase[Value.KindCase.BOOL_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Monitor$Value$KindCase[Value.KindCase.DOUBLE_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Monitor$Value$KindCase[Value.KindCase.KIND_NOT_SET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[FilterExpression.NodeCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$sdk$Monitor$FilterExpression$NodeCase = iArr2;
            try {
                iArr2[FilterExpression.NodeCase.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Monitor$FilterExpression$NodeCase[FilterExpression.NodeCase.ANY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Monitor$FilterExpression$NodeCase[FilterExpression.NodeCase.RULE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Monitor$FilterExpression$NodeCase[FilterExpression.NodeCase.NODE_NOT_SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr3 = new int[Configuration.ConfigExtensionCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$sdk$Monitor$Configuration$ConfigExtensionCase = iArr3;
            try {
                iArr3[Configuration.ConfigExtensionCase.IMP_EXTENSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Monitor$Configuration$ConfigExtensionCase[Configuration.ConfigExtensionCase.GEN_EXTENSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Monitor$Configuration$ConfigExtensionCase[Configuration.ConfigExtensionCase.CONFIGEXTENSION_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public static Monitor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_descriptor;
    }

    public static Builder newBuilder(Monitor monitor) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(monitor);
    }

    public static Monitor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Monitor) y4.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Monitor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Monitor) PARSER.parseFrom(byteBuffer);
    }

    public static g7 parser() {
        return PARSER;
    }

    @Override // io.p071bidmachine.protobuf.sdk.MonitorOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.p071bidmachine.protobuf.sdk.MonitorOrBuilder
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public g7 getParserForType() {
        return PARSER;
    }

    @Override // io.p071bidmachine.protobuf.sdk.MonitorOrBuilder
    public Record getRecords(int i) {
        return this.records_.get(i);
    }

    @Override // io.p071bidmachine.protobuf.sdk.MonitorOrBuilder
    public int getRecordsCount() {
        return this.records_.size();
    }

    @Override // io.p071bidmachine.protobuf.sdk.MonitorOrBuilder
    public List<Record> getRecordsList() {
        return this.records_;
    }

    @Override // io.p071bidmachine.protobuf.sdk.MonitorOrBuilder
    public RecordOrBuilder getRecordsOrBuilder(int i) {
        return this.records_.get(i);
    }

    @Override // io.p071bidmachine.protobuf.sdk.MonitorOrBuilder
    public List<? extends RecordOrBuilder> getRecordsOrBuilderList() {
        return this.records_;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !getNameBytes().isEmpty() ? y4.computeStringSize(1, this.name_) : 0;
        for (int i2 = 0; i2 < this.records_.size(); i2++) {
            iComputeStringSize += w.o(2, this.records_.get(i2));
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
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
        int iHashCode = getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
        if (getRecordsCount() > 0) {
            iHashCode = getRecordsList().hashCode() + pv1.c(iHashCode, 37, 2, 53);
        }
        int iHashCode2 = this.unknownFields.a.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.y4
    public w4 internalGetFieldAccessorTable() {
        w4 w4Var = SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_fieldAccessorTable;
        w4Var.c(Monitor.class, Builder.class);
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
        return new Monitor();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    private Monitor(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                        if (iF != 10) {
                            if (iF != 18) {
                                if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                }
                            } else {
                                if (!z2) {
                                    this.records_ = new ArrayList();
                                    z2 = true;
                                }
                                this.records_.add((Record) rVar.v(Record.parser(), o3Var));
                            }
                        } else {
                            this.name_ = rVar.E();
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
                    this.records_ = Collections.unmodifiableList(this.records_);
                }
                this.unknownFields = p8VarB.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (z2) {
            this.records_ = Collections.unmodifiableList(this.records_);
        }
        this.unknownFields = p8VarB.build();
        makeExtensionsImmutable();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(w wVar) throws IOException {
        if (!getNameBytes().isEmpty()) {
            y4.writeString(wVar, 1, this.name_);
        }
        for (int i = 0; i < this.records_.size(); i++) {
            wVar.M(2, this.records_.get(i));
        }
        this.unknownFields.writeTo(wVar);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public Monitor mo250getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Monitor parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
        return (Monitor) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
    }

    public static Monitor parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
        return (Monitor) PARSER.parseFrom(byteBuffer, o3Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Monitor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Monitor) PARSER.parseFrom(byteString);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Monitor parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
        return (Monitor) PARSER.parseFrom(byteString, o3Var);
    }

    public static Monitor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Monitor) PARSER.parseFrom(bArr);
    }

    public static Monitor parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
        return (Monitor) PARSER.parseFrom(bArr, o3Var);
    }

    public static Monitor parseFrom(InputStream inputStream) throws IOException {
        return (Monitor) y4.parseWithIOException(PARSER, inputStream);
    }

    public static Monitor parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
        return (Monitor) y4.parseWithIOException(PARSER, inputStream, o3Var);
    }

    public static Monitor parseFrom(r rVar) throws IOException {
        return (Monitor) y4.parseWithIOException(PARSER, rVar);
    }

    public static Monitor parseFrom(r rVar, o3 o3Var) throws IOException {
        return (Monitor) y4.parseWithIOException(PARSER, rVar, o3Var);
    }

    private Monitor(g4 g4Var) {
        super(g4Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    private Monitor() {
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.records_ = Collections.EMPTY_LIST;
    }
}
