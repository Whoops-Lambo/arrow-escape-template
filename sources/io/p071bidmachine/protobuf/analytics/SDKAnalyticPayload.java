package io.p071bidmachine.protobuf.analytics;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.c;
import com.explorestack.protobuf.d;
import com.explorestack.protobuf.g4;
import com.explorestack.protobuf.g7;
import com.explorestack.protobuf.g8;
import com.explorestack.protobuf.h4;
import com.explorestack.protobuf.l5;
import com.explorestack.protobuf.o3;
import com.explorestack.protobuf.o7;
import com.explorestack.protobuf.p8;
import com.explorestack.protobuf.r;
import com.explorestack.protobuf.s8;
import com.explorestack.protobuf.v7;
import com.explorestack.protobuf.w;
import com.explorestack.protobuf.w4;
import com.explorestack.protobuf.x4;
import com.explorestack.protobuf.y4;
import defpackage.pv1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SDKAnalyticPayload extends y4 implements SDKAnalyticPayloadOrBuilder {
    public static final int METRICS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private List<Metric> metrics_;
    private static final SDKAnalyticPayload DEFAULT_INSTANCE = new SDKAnalyticPayload();
    private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.1
        @Override // com.explorestack.protobuf.g7
        public SDKAnalyticPayload parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
            return new SDKAnalyticPayload(rVar, o3Var);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder extends g4 implements SDKAnalyticPayloadOrBuilder {
        private int bitField0_;
        private o7 metricsBuilder_;
        private List<Metric> metrics_;

        private Builder() {
            super(null);
            this.metrics_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        private void ensureMetricsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.metrics_ = new ArrayList(this.metrics_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_descriptor;
        }

        private o7 getMetricsFieldBuilder() {
            if (this.metricsBuilder_ == null) {
                this.metricsBuilder_ = new o7(this.metrics_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.metrics_ = null;
            }
            return this.metricsBuilder_;
        }

        public Builder addAllMetrics(Iterable<? extends Metric> iterable) {
            o7 o7Var = this.metricsBuilder_;
            if (o7Var != null) {
                o7Var.a(iterable);
                return this;
            }
            ensureMetricsIsMutable();
            b.addAll((Iterable) iterable, (List) this.metrics_);
            onChanged();
            return this;
        }

        public Builder addMetrics(Metric.Builder builder) {
            o7 o7Var = this.metricsBuilder_;
            if (o7Var != null) {
                o7Var.e(builder.build());
                return this;
            }
            ensureMetricsIsMutable();
            this.metrics_.add(builder.build());
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SDKAnalyticPayload buildPartial() {
            SDKAnalyticPayload sDKAnalyticPayload = new SDKAnalyticPayload(this);
            int i = this.bitField0_;
            o7 o7Var = this.metricsBuilder_;
            if (o7Var == null) {
                if ((i & 1) != 0) {
                    this.metrics_ = Collections.unmodifiableList(this.metrics_);
                    this.bitField0_ &= -2;
                }
                sDKAnalyticPayload.metrics_ = this.metrics_;
            } else {
                sDKAnalyticPayload.metrics_ = o7Var.f();
            }
            onBuilt();
            return sDKAnalyticPayload;
        }

        public Builder clearMetrics() {
            o7 o7Var = this.metricsBuilder_;
            if (o7Var != null) {
                o7Var.g();
                return this;
            }
            this.metrics_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_descriptor;
        }

        @Override // io.p071bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
        public Metric getMetrics(int i) {
            o7 o7Var = this.metricsBuilder_;
            return o7Var == null ? this.metrics_.get(i) : (Metric) o7Var.l(i, false);
        }

        @Override // io.p071bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
        public int getMetricsCount() {
            o7 o7Var = this.metricsBuilder_;
            return o7Var == null ? this.metrics_.size() : o7Var.b.size();
        }

        @Override // io.p071bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
        public List<Metric> getMetricsList() {
            o7 o7Var = this.metricsBuilder_;
            return o7Var == null ? Collections.unmodifiableList(this.metrics_) : o7Var.m();
        }

        @Override // io.p071bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
        public MetricOrBuilder getMetricsOrBuilder(int i) {
            o7 o7Var = this.metricsBuilder_;
            return o7Var == null ? this.metrics_.get(i) : (MetricOrBuilder) o7Var.n(i);
        }

        @Override // io.p071bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
        public List<? extends MetricOrBuilder> getMetricsOrBuilderList() {
            o7 o7Var = this.metricsBuilder_;
            return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.metrics_);
        }

        @Override // com.explorestack.protobuf.g4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_fieldAccessorTable;
            w4Var.c(SDKAnalyticPayload.class, Builder.class);
            return w4Var;
        }

        public Builder removeMetrics(int i) {
            o7 o7Var = this.metricsBuilder_;
            if (o7Var != null) {
                o7Var.r(i);
                return this;
            }
            ensureMetricsIsMutable();
            this.metrics_.remove(i);
            onChanged();
            return this;
        }

        public Builder setMetrics(int i, Metric.Builder builder) {
            o7 o7Var = this.metricsBuilder_;
            if (o7Var != null) {
                o7Var.s(i, builder.build());
                return this;
            }
            ensureMetricsIsMutable();
            this.metrics_.set(i, builder.build());
            onChanged();
            return this;
        }

        private void maybeForceBuilderInitialization() {
            if (y4.alwaysUseFieldBuilders) {
                getMetricsFieldBuilder();
            }
        }

        public Metric.Builder addMetricsBuilder() {
            return (Metric.Builder) getMetricsFieldBuilder().c(Metric.getDefaultInstance());
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SDKAnalyticPayload build() {
            SDKAnalyticPayload sDKAnalyticPayloadBuildPartial = buildPartial();
            if (sDKAnalyticPayloadBuildPartial.isInitialized()) {
                return sDKAnalyticPayloadBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) sDKAnalyticPayloadBuildPartial);
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            o7 o7Var = this.metricsBuilder_;
            if (o7Var == null) {
                this.metrics_ = Collections.EMPTY_LIST;
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

        public Metric.Builder getMetricsBuilder(int i) {
            return (Metric.Builder) getMetricsFieldBuilder().j(i);
        }

        public List<Metric.Builder> getMetricsBuilderList() {
            return getMetricsFieldBuilder().k();
        }

        public Builder mergeFrom(SDKAnalyticPayload sDKAnalyticPayload) {
            if (sDKAnalyticPayload == SDKAnalyticPayload.getDefaultInstance()) {
                return this;
            }
            if (this.metricsBuilder_ == null) {
                if (!sDKAnalyticPayload.metrics_.isEmpty()) {
                    if (this.metrics_.isEmpty()) {
                        this.metrics_ = sDKAnalyticPayload.metrics_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMetricsIsMutable();
                        this.metrics_.addAll(sDKAnalyticPayload.metrics_);
                    }
                    onChanged();
                }
            } else if (!sDKAnalyticPayload.metrics_.isEmpty()) {
                boolean zIsEmpty = this.metricsBuilder_.b.isEmpty();
                o7 o7Var = this.metricsBuilder_;
                if (zIsEmpty) {
                    o7 metricsFieldBuilder = null;
                    o7Var.a = null;
                    this.metricsBuilder_ = null;
                    this.metrics_ = sDKAnalyticPayload.metrics_;
                    this.bitField0_ &= -2;
                    if (y4.alwaysUseFieldBuilders) {
                        metricsFieldBuilder = getMetricsFieldBuilder();
                    }
                    this.metricsBuilder_ = metricsFieldBuilder;
                } else {
                    o7Var.a(sDKAnalyticPayload.metrics_);
                }
            }
            mergeUnknownFields(((y4) sDKAnalyticPayload).unknownFields);
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
        public SDKAnalyticPayload mo250getDefaultInstanceForType() {
            return SDKAnalyticPayload.getDefaultInstance();
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
            this.metrics_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public Metric.Builder addMetricsBuilder(int i) {
            return (Metric.Builder) getMetricsFieldBuilder().b(i, Metric.getDefaultInstance());
        }

        public Builder addMetrics(int i, Metric metric) {
            o7 o7Var = this.metricsBuilder_;
            if (o7Var == null) {
                metric.getClass();
                ensureMetricsIsMutable();
                this.metrics_.add(i, metric);
                onChanged();
                return this;
            }
            o7Var.d(i, metric);
            return this;
        }

        public Builder setMetrics(int i, Metric metric) {
            o7 o7Var = this.metricsBuilder_;
            if (o7Var == null) {
                metric.getClass();
                ensureMetricsIsMutable();
                this.metrics_.set(i, metric);
                onChanged();
                return this;
            }
            o7Var.s(i, metric);
            return this;
        }

        public Builder addMetrics(Metric metric) {
            o7 o7Var = this.metricsBuilder_;
            if (o7Var == null) {
                metric.getClass();
                ensureMetricsIsMutable();
                this.metrics_.add(metric);
                onChanged();
                return this;
            }
            o7Var.e(metric);
            return this;
        }

        public Builder addMetrics(int i, Metric.Builder builder) {
            o7 o7Var = this.metricsBuilder_;
            if (o7Var == null) {
                ensureMetricsIsMutable();
                this.metrics_.add(i, builder.build());
                onChanged();
                return this;
            }
            o7Var.d(i, builder.build());
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof SDKAnalyticPayload) {
                return mergeFrom((SDKAnalyticPayload) message);
            }
            super.mergeFrom(message);
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
            SDKAnalyticPayload sDKAnalyticPayload = null;
            try {
                try {
                    SDKAnalyticPayload sDKAnalyticPayload2 = (SDKAnalyticPayload) SDKAnalyticPayload.PARSER.parsePartialFrom(rVar, o3Var);
                    if (sDKAnalyticPayload2 != null) {
                        mergeFrom(sDKAnalyticPayload2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    SDKAnalyticPayload sDKAnalyticPayload3 = (SDKAnalyticPayload) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        sDKAnalyticPayload = sDKAnalyticPayload3;
                        if (sDKAnalyticPayload != null) {
                            mergeFrom(sDKAnalyticPayload);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (sDKAnalyticPayload != null) {
                    mergeFrom(sDKAnalyticPayload);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Metric extends y4 implements MetricOrBuilder {
        public static final int CONTEXT_FIELD_NUMBER = 1;
        public static final int DATA_FIELD_NUMBER = 2;
        private static final Metric DEFAULT_INSTANCE = new Metric();
        private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.1
            @Override // com.explorestack.protobuf.g7
            public Metric parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                return new Metric(rVar, o3Var);
            }
        };
        private static final long serialVersionUID = 0;
        private volatile Object context_;
        private List<MetricData> data_;
        private byte memoizedIsInitialized;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends g4 implements MetricOrBuilder {
            private int bitField0_;
            private Object context_;
            private o7 dataBuilder_;
            private List<MetricData> data_;

            private Builder() {
                super(null);
                this.context_ = "";
                this.data_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            private void ensureDataIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.data_ = new ArrayList(this.data_);
                    this.bitField0_ |= 1;
                }
            }

            private o7 getDataFieldBuilder() {
                if (this.dataBuilder_ == null) {
                    this.dataBuilder_ = new o7(this.data_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.data_ = null;
                }
                return this.dataBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_descriptor;
            }

            public Builder addAllData(Iterable<? extends MetricData> iterable) {
                o7 o7Var = this.dataBuilder_;
                if (o7Var != null) {
                    o7Var.a(iterable);
                    return this;
                }
                ensureDataIsMutable();
                b.addAll((Iterable) iterable, (List) this.data_);
                onChanged();
                return this;
            }

            public Builder addData(MetricData.Builder builder) {
                o7 o7Var = this.dataBuilder_;
                if (o7Var != null) {
                    o7Var.e(builder.build());
                    return this;
                }
                ensureDataIsMutable();
                this.data_.add(builder.build());
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Metric buildPartial() {
                Metric metric = new Metric(this);
                metric.context_ = this.context_;
                o7 o7Var = this.dataBuilder_;
                if (o7Var == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.data_ = Collections.unmodifiableList(this.data_);
                        this.bitField0_ &= -2;
                    }
                    metric.data_ = this.data_;
                } else {
                    metric.data_ = o7Var.f();
                }
                onBuilt();
                return metric;
            }

            public Builder clearData() {
                o7 o7Var = this.dataBuilder_;
                if (o7Var != null) {
                    o7Var.g();
                    return this;
                }
                this.data_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public String getContext() {
                Object obj = this.context_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.context_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public ByteString getContextBytes() {
                Object obj = this.context_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.context_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public MetricData getData(int i) {
                o7 o7Var = this.dataBuilder_;
                return o7Var == null ? this.data_.get(i) : (MetricData) o7Var.l(i, false);
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public int getDataCount() {
                o7 o7Var = this.dataBuilder_;
                return o7Var == null ? this.data_.size() : o7Var.b.size();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public List<MetricData> getDataList() {
                o7 o7Var = this.dataBuilder_;
                return o7Var == null ? Collections.unmodifiableList(this.data_) : o7Var.m();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public MetricDataOrBuilder getDataOrBuilder(int i) {
                o7 o7Var = this.dataBuilder_;
                return o7Var == null ? this.data_.get(i) : (MetricDataOrBuilder) o7Var.n(i);
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public List<? extends MetricDataOrBuilder> getDataOrBuilderList() {
                o7 o7Var = this.dataBuilder_;
                return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.data_);
            }

            @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_descriptor;
            }

            @Override // com.explorestack.protobuf.g4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_fieldAccessorTable;
                w4Var.c(Metric.class, Builder.class);
                return w4Var;
            }

            public Builder removeData(int i) {
                o7 o7Var = this.dataBuilder_;
                if (o7Var != null) {
                    o7Var.r(i);
                    return this;
                }
                ensureDataIsMutable();
                this.data_.remove(i);
                onChanged();
                return this;
            }

            public Builder setData(int i, MetricData.Builder builder) {
                o7 o7Var = this.dataBuilder_;
                if (o7Var != null) {
                    o7Var.s(i, builder.build());
                    return this;
                }
                ensureDataIsMutable();
                this.data_.set(i, builder.build());
                onChanged();
                return this;
            }

            private void maybeForceBuilderInitialization() {
                if (y4.alwaysUseFieldBuilders) {
                    getDataFieldBuilder();
                }
            }

            public MetricData.Builder addDataBuilder() {
                return (MetricData.Builder) getDataFieldBuilder().c(MetricData.getDefaultInstance());
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Metric build() {
                Metric metricBuildPartial = buildPartial();
                if (metricBuildPartial.isInitialized()) {
                    return metricBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) metricBuildPartial);
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.context_ = "";
                o7 o7Var = this.dataBuilder_;
                if (o7Var == null) {
                    this.data_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    return this;
                }
                o7Var.g();
                return this;
            }

            public Builder clearContext() {
                this.context_ = Metric.getDefaultInstance().getContext();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo247clone() {
                return (Builder) super.mo247clone();
            }

            public MetricData.Builder getDataBuilder(int i) {
                return (MetricData.Builder) getDataFieldBuilder().j(i);
            }

            public List<MetricData.Builder> getDataBuilderList() {
                return getDataFieldBuilder().k();
            }

            public Builder mergeFrom(Metric metric) {
                if (metric == Metric.getDefaultInstance()) {
                    return this;
                }
                if (!metric.getContext().isEmpty()) {
                    this.context_ = metric.context_;
                    onChanged();
                }
                if (this.dataBuilder_ == null) {
                    if (!metric.data_.isEmpty()) {
                        if (this.data_.isEmpty()) {
                            this.data_ = metric.data_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureDataIsMutable();
                            this.data_.addAll(metric.data_);
                        }
                        onChanged();
                    }
                } else if (!metric.data_.isEmpty()) {
                    boolean zIsEmpty = this.dataBuilder_.b.isEmpty();
                    o7 o7Var = this.dataBuilder_;
                    if (zIsEmpty) {
                        o7 dataFieldBuilder = null;
                        o7Var.a = null;
                        this.dataBuilder_ = null;
                        this.data_ = metric.data_;
                        this.bitField0_ &= -2;
                        if (y4.alwaysUseFieldBuilders) {
                            dataFieldBuilder = getDataFieldBuilder();
                        }
                        this.dataBuilder_ = dataFieldBuilder;
                    } else {
                        o7Var.a(metric.data_);
                    }
                }
                mergeUnknownFields(((y4) metric).unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(s8 s8Var) {
                return (Builder) super.mergeUnknownFields(s8Var);
            }

            public Builder setContext(String str) {
                str.getClass();
                this.context_ = str;
                onChanged();
                return this;
            }

            public Builder setContextBytes(ByteString byteString) {
                byteString.getClass();
                c.checkByteStringIsUtf8(byteString);
                this.context_ = byteString;
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
            public Metric mo250getDefaultInstanceForType() {
                return Metric.getDefaultInstance();
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

            public MetricData.Builder addDataBuilder(int i) {
                return (MetricData.Builder) getDataFieldBuilder().b(i, MetricData.getDefaultInstance());
            }

            private Builder(h4 h4Var) {
                super(h4Var);
                this.context_ = "";
                this.data_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder addData(int i, MetricData metricData) {
                o7 o7Var = this.dataBuilder_;
                if (o7Var == null) {
                    metricData.getClass();
                    ensureDataIsMutable();
                    this.data_.add(i, metricData);
                    onChanged();
                    return this;
                }
                o7Var.d(i, metricData);
                return this;
            }

            public Builder setData(int i, MetricData metricData) {
                o7 o7Var = this.dataBuilder_;
                if (o7Var == null) {
                    metricData.getClass();
                    ensureDataIsMutable();
                    this.data_.set(i, metricData);
                    onChanged();
                    return this;
                }
                o7Var.s(i, metricData);
                return this;
            }

            public Builder addData(MetricData metricData) {
                o7 o7Var = this.dataBuilder_;
                if (o7Var == null) {
                    metricData.getClass();
                    ensureDataIsMutable();
                    this.data_.add(metricData);
                    onChanged();
                    return this;
                }
                o7Var.e(metricData);
                return this;
            }

            public Builder addData(int i, MetricData.Builder builder) {
                o7 o7Var = this.dataBuilder_;
                if (o7Var == null) {
                    ensureDataIsMutable();
                    this.data_.add(i, builder.build());
                    onChanged();
                    return this;
                }
                o7Var.d(i, builder.build());
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Metric) {
                    return mergeFrom((Metric) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                Metric metric = null;
                try {
                    try {
                        Metric metric2 = (Metric) Metric.PARSER.parsePartialFrom(rVar, o3Var);
                        if (metric2 != null) {
                            mergeFrom(metric2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Metric metric3 = (Metric) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            metric = metric3;
                            if (metric != null) {
                                mergeFrom(metric);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (metric != null) {
                        mergeFrom(metric);
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class MetricData extends y4 implements MetricDataOrBuilder {
            public static final int DIMENSIONS_FIELD_NUMBER = 3;
            public static final int ERROR_FIELD_NUMBER = 5;
            public static final int MEASURES_FIELD_NUMBER = 4;
            public static final int NAME_FIELD_NUMBER = 2;
            public static final int TIMESTAMP_FIELD_NUMBER = 1;
            public static final int TS_FIELD_NUMBER = 6;
            private static final long serialVersionUID = 0;
            private List<Dimension> dimensions_;
            private Error error_;
            private List<Measure> measures_;
            private byte memoizedIsInitialized;
            private volatile Object name_;
            private volatile Object timestamp_;
            private Timestamp ts_;
            private static final MetricData DEFAULT_INSTANCE = new MetricData();
            private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.1
                @Override // com.explorestack.protobuf.g7
                public MetricData parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                    return new MetricData(rVar, o3Var);
                }
            };

            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            public static final class Builder extends g4 implements MetricDataOrBuilder {
                private int bitField0_;
                private o7 dimensionsBuilder_;
                private List<Dimension> dimensions_;
                private v7 errorBuilder_;
                private Error error_;
                private o7 measuresBuilder_;
                private List<Measure> measures_;
                private Object name_;
                private Object timestamp_;
                private v7 tsBuilder_;
                private Timestamp ts_;

                private Builder() {
                    super(null);
                    this.timestamp_ = "";
                    this.name_ = "";
                    List list = Collections.EMPTY_LIST;
                    this.dimensions_ = list;
                    this.measures_ = list;
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                private void ensureDimensionsIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.dimensions_ = new ArrayList(this.dimensions_);
                        this.bitField0_ |= 1;
                    }
                }

                private void ensureMeasuresIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.measures_ = new ArrayList(this.measures_);
                        this.bitField0_ |= 2;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_descriptor;
                }

                private o7 getDimensionsFieldBuilder() {
                    if (this.dimensionsBuilder_ == null) {
                        this.dimensionsBuilder_ = new o7(this.dimensions_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.dimensions_ = null;
                    }
                    return this.dimensionsBuilder_;
                }

                private v7 getErrorFieldBuilder() {
                    if (this.errorBuilder_ == null) {
                        this.errorBuilder_ = new v7(getError(), getParentForChildren(), isClean());
                        this.error_ = null;
                    }
                    return this.errorBuilder_;
                }

                private o7 getMeasuresFieldBuilder() {
                    if (this.measuresBuilder_ == null) {
                        this.measuresBuilder_ = new o7(this.measures_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                        this.measures_ = null;
                    }
                    return this.measuresBuilder_;
                }

                private v7 getTsFieldBuilder() {
                    if (this.tsBuilder_ == null) {
                        this.tsBuilder_ = new v7(getTs(), getParentForChildren(), isClean());
                        this.ts_ = null;
                    }
                    return this.tsBuilder_;
                }

                public Builder addAllDimensions(Iterable<? extends Dimension> iterable) {
                    o7 o7Var = this.dimensionsBuilder_;
                    if (o7Var != null) {
                        o7Var.a(iterable);
                        return this;
                    }
                    ensureDimensionsIsMutable();
                    b.addAll((Iterable) iterable, (List) this.dimensions_);
                    onChanged();
                    return this;
                }

                public Builder addAllMeasures(Iterable<? extends Measure> iterable) {
                    o7 o7Var = this.measuresBuilder_;
                    if (o7Var != null) {
                        o7Var.a(iterable);
                        return this;
                    }
                    ensureMeasuresIsMutable();
                    b.addAll((Iterable) iterable, (List) this.measures_);
                    onChanged();
                    return this;
                }

                public Builder addDimensions(Dimension.Builder builder) {
                    o7 o7Var = this.dimensionsBuilder_;
                    if (o7Var != null) {
                        o7Var.e(builder.build());
                        return this;
                    }
                    ensureDimensionsIsMutable();
                    this.dimensions_.add(builder.build());
                    onChanged();
                    return this;
                }

                public Builder addMeasures(Measure.Builder builder) {
                    o7 o7Var = this.measuresBuilder_;
                    if (o7Var != null) {
                        o7Var.e(builder.build());
                        return this;
                    }
                    ensureMeasuresIsMutable();
                    this.measures_.add(builder.build());
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public MetricData buildPartial() {
                    MetricData metricData = new MetricData(this);
                    metricData.timestamp_ = this.timestamp_;
                    metricData.name_ = this.name_;
                    o7 o7Var = this.dimensionsBuilder_;
                    if (o7Var == null) {
                        if ((this.bitField0_ & 1) != 0) {
                            this.dimensions_ = Collections.unmodifiableList(this.dimensions_);
                            this.bitField0_ &= -2;
                        }
                        metricData.dimensions_ = this.dimensions_;
                    } else {
                        metricData.dimensions_ = o7Var.f();
                    }
                    o7 o7Var2 = this.measuresBuilder_;
                    if (o7Var2 == null) {
                        if ((this.bitField0_ & 2) != 0) {
                            this.measures_ = Collections.unmodifiableList(this.measures_);
                            this.bitField0_ &= -3;
                        }
                        metricData.measures_ = this.measures_;
                    } else {
                        metricData.measures_ = o7Var2.f();
                    }
                    v7 v7Var = this.errorBuilder_;
                    if (v7Var == null) {
                        metricData.error_ = this.error_;
                    } else {
                        metricData.error_ = (Error) v7Var.a();
                    }
                    v7 v7Var2 = this.tsBuilder_;
                    if (v7Var2 == null) {
                        metricData.ts_ = this.ts_;
                    } else {
                        metricData.ts_ = (Timestamp) v7Var2.a();
                    }
                    onBuilt();
                    return metricData;
                }

                public Builder clearDimensions() {
                    o7 o7Var = this.dimensionsBuilder_;
                    if (o7Var != null) {
                        o7Var.g();
                        return this;
                    }
                    this.dimensions_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
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

                public Builder clearMeasures() {
                    o7 o7Var = this.measuresBuilder_;
                    if (o7Var != null) {
                        o7Var.g();
                        return this;
                    }
                    this.measures_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                public Builder clearTs() {
                    if (this.tsBuilder_ == null) {
                        this.ts_ = null;
                        onChanged();
                        return this;
                    }
                    this.ts_ = null;
                    this.tsBuilder_ = null;
                    return this;
                }

                @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_descriptor;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public Dimension getDimensions(int i) {
                    o7 o7Var = this.dimensionsBuilder_;
                    return o7Var == null ? this.dimensions_.get(i) : (Dimension) o7Var.l(i, false);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public int getDimensionsCount() {
                    o7 o7Var = this.dimensionsBuilder_;
                    return o7Var == null ? this.dimensions_.size() : o7Var.b.size();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public List<Dimension> getDimensionsList() {
                    o7 o7Var = this.dimensionsBuilder_;
                    return o7Var == null ? Collections.unmodifiableList(this.dimensions_) : o7Var.m();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public DimensionOrBuilder getDimensionsOrBuilder(int i) {
                    o7 o7Var = this.dimensionsBuilder_;
                    return o7Var == null ? this.dimensions_.get(i) : (DimensionOrBuilder) o7Var.n(i);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public List<? extends DimensionOrBuilder> getDimensionsOrBuilderList() {
                    o7 o7Var = this.dimensionsBuilder_;
                    return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.dimensions_);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public Error getError() {
                    v7 v7Var = this.errorBuilder_;
                    if (v7Var != null) {
                        return (Error) v7Var.d();
                    }
                    Error error = this.error_;
                    return error == null ? Error.getDefaultInstance() : error;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public ErrorOrBuilder getErrorOrBuilder() {
                    v7 v7Var = this.errorBuilder_;
                    if (v7Var != null) {
                        return (ErrorOrBuilder) v7Var.e();
                    }
                    Error error = this.error_;
                    return error == null ? Error.getDefaultInstance() : error;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public Measure getMeasures(int i) {
                    o7 o7Var = this.measuresBuilder_;
                    return o7Var == null ? this.measures_.get(i) : (Measure) o7Var.l(i, false);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public int getMeasuresCount() {
                    o7 o7Var = this.measuresBuilder_;
                    return o7Var == null ? this.measures_.size() : o7Var.b.size();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public List<Measure> getMeasuresList() {
                    o7 o7Var = this.measuresBuilder_;
                    return o7Var == null ? Collections.unmodifiableList(this.measures_) : o7Var.m();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public MeasureOrBuilder getMeasuresOrBuilder(int i) {
                    o7 o7Var = this.measuresBuilder_;
                    return o7Var == null ? this.measures_.get(i) : (MeasureOrBuilder) o7Var.n(i);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public List<? extends MeasureOrBuilder> getMeasuresOrBuilderList() {
                    o7 o7Var = this.measuresBuilder_;
                    return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.measures_);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public ByteString getNameBytes() {
                    Object obj = this.name_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.name_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                @Deprecated
                public String getTimestamp() {
                    Object obj = this.timestamp_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.timestamp_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                @Deprecated
                public ByteString getTimestampBytes() {
                    Object obj = this.timestamp_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.timestamp_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public Timestamp getTs() {
                    v7 v7Var = this.tsBuilder_;
                    if (v7Var != null) {
                        return (Timestamp) v7Var.d();
                    }
                    Timestamp timestamp = this.ts_;
                    return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public g8 getTsOrBuilder() {
                    v7 v7Var = this.tsBuilder_;
                    if (v7Var != null) {
                        return (g8) v7Var.e();
                    }
                    Timestamp timestamp = this.ts_;
                    return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public boolean hasError() {
                    return (this.errorBuilder_ == null && this.error_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public boolean hasTs() {
                    return (this.tsBuilder_ == null && this.ts_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.g4
                public w4 internalGetFieldAccessorTable() {
                    w4 w4Var = SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_fieldAccessorTable;
                    w4Var.c(MetricData.class, Builder.class);
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

                public Builder mergeTs(Timestamp timestamp) {
                    v7 v7Var = this.tsBuilder_;
                    if (v7Var != null) {
                        v7Var.f(timestamp);
                        return this;
                    }
                    Timestamp timestamp2 = this.ts_;
                    if (timestamp2 != null) {
                        this.ts_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                    } else {
                        this.ts_ = timestamp;
                    }
                    onChanged();
                    return this;
                }

                public Builder removeDimensions(int i) {
                    o7 o7Var = this.dimensionsBuilder_;
                    if (o7Var != null) {
                        o7Var.r(i);
                        return this;
                    }
                    ensureDimensionsIsMutable();
                    this.dimensions_.remove(i);
                    onChanged();
                    return this;
                }

                public Builder removeMeasures(int i) {
                    o7 o7Var = this.measuresBuilder_;
                    if (o7Var != null) {
                        o7Var.r(i);
                        return this;
                    }
                    ensureMeasuresIsMutable();
                    this.measures_.remove(i);
                    onChanged();
                    return this;
                }

                public Builder setDimensions(int i, Dimension.Builder builder) {
                    o7 o7Var = this.dimensionsBuilder_;
                    if (o7Var != null) {
                        o7Var.s(i, builder.build());
                        return this;
                    }
                    ensureDimensionsIsMutable();
                    this.dimensions_.set(i, builder.build());
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

                public Builder setMeasures(int i, Measure.Builder builder) {
                    o7 o7Var = this.measuresBuilder_;
                    if (o7Var != null) {
                        o7Var.s(i, builder.build());
                        return this;
                    }
                    ensureMeasuresIsMutable();
                    this.measures_.set(i, builder.build());
                    onChanged();
                    return this;
                }

                public Builder setTs(Timestamp.Builder builder) {
                    v7 v7Var = this.tsBuilder_;
                    if (v7Var != null) {
                        v7Var.h(builder.build());
                        return this;
                    }
                    this.ts_ = builder.build();
                    onChanged();
                    return this;
                }

                private void maybeForceBuilderInitialization() {
                    if (y4.alwaysUseFieldBuilders) {
                        getDimensionsFieldBuilder();
                        getMeasuresFieldBuilder();
                    }
                }

                public Dimension.Builder addDimensionsBuilder() {
                    return (Dimension.Builder) getDimensionsFieldBuilder().c(Dimension.getDefaultInstance());
                }

                public Measure.Builder addMeasuresBuilder() {
                    return (Measure.Builder) getMeasuresFieldBuilder().c(Measure.getDefaultInstance());
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public MetricData build() {
                    MetricData metricDataBuildPartial = buildPartial();
                    if (metricDataBuildPartial.isInitialized()) {
                        return metricDataBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) metricDataBuildPartial);
                }

                @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.timestamp_ = "";
                    this.name_ = "";
                    o7 o7Var = this.dimensionsBuilder_;
                    if (o7Var == null) {
                        this.dimensions_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -2;
                    } else {
                        o7Var.g();
                    }
                    o7 o7Var2 = this.measuresBuilder_;
                    if (o7Var2 == null) {
                        this.measures_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -3;
                    } else {
                        o7Var2.g();
                    }
                    if (this.errorBuilder_ == null) {
                        this.error_ = null;
                    } else {
                        this.error_ = null;
                        this.errorBuilder_ = null;
                    }
                    if (this.tsBuilder_ == null) {
                        this.ts_ = null;
                        return this;
                    }
                    this.ts_ = null;
                    this.tsBuilder_ = null;
                    return this;
                }

                public Builder clearName() {
                    this.name_ = MetricData.getDefaultInstance().getName();
                    onChanged();
                    return this;
                }

                @Deprecated
                public Builder clearTimestamp() {
                    this.timestamp_ = MetricData.getDefaultInstance().getTimestamp();
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo247clone() {
                    return (Builder) super.mo247clone();
                }

                public Dimension.Builder getDimensionsBuilder(int i) {
                    return (Dimension.Builder) getDimensionsFieldBuilder().j(i);
                }

                public List<Dimension.Builder> getDimensionsBuilderList() {
                    return getDimensionsFieldBuilder().k();
                }

                public Error.Builder getErrorBuilder() {
                    onChanged();
                    return (Error.Builder) getErrorFieldBuilder().c();
                }

                public Measure.Builder getMeasuresBuilder(int i) {
                    return (Measure.Builder) getMeasuresFieldBuilder().j(i);
                }

                public List<Measure.Builder> getMeasuresBuilderList() {
                    return getMeasuresFieldBuilder().k();
                }

                public Timestamp.Builder getTsBuilder() {
                    onChanged();
                    return (Timestamp.Builder) getTsFieldBuilder().c();
                }

                public Builder mergeFrom(MetricData metricData) {
                    o7 dimensionsFieldBuilder;
                    if (metricData == MetricData.getDefaultInstance()) {
                        return this;
                    }
                    if (!metricData.getTimestamp().isEmpty()) {
                        this.timestamp_ = metricData.timestamp_;
                        onChanged();
                    }
                    if (!metricData.getName().isEmpty()) {
                        this.name_ = metricData.name_;
                        onChanged();
                    }
                    o7 measuresFieldBuilder = null;
                    if (this.dimensionsBuilder_ == null) {
                        if (!metricData.dimensions_.isEmpty()) {
                            if (this.dimensions_.isEmpty()) {
                                this.dimensions_ = metricData.dimensions_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureDimensionsIsMutable();
                                this.dimensions_.addAll(metricData.dimensions_);
                            }
                            onChanged();
                        }
                    } else if (!metricData.dimensions_.isEmpty()) {
                        boolean zIsEmpty = this.dimensionsBuilder_.b.isEmpty();
                        o7 o7Var = this.dimensionsBuilder_;
                        if (zIsEmpty) {
                            o7Var.a = null;
                            this.dimensionsBuilder_ = null;
                            this.dimensions_ = metricData.dimensions_;
                            this.bitField0_ &= -2;
                            if (y4.alwaysUseFieldBuilders) {
                                dimensionsFieldBuilder = getDimensionsFieldBuilder();
                            } else {
                                dimensionsFieldBuilder = null;
                            }
                            this.dimensionsBuilder_ = dimensionsFieldBuilder;
                        } else {
                            o7Var.a(metricData.dimensions_);
                        }
                    }
                    if (this.measuresBuilder_ == null) {
                        if (!metricData.measures_.isEmpty()) {
                            if (this.measures_.isEmpty()) {
                                this.measures_ = metricData.measures_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureMeasuresIsMutable();
                                this.measures_.addAll(metricData.measures_);
                            }
                            onChanged();
                        }
                    } else if (!metricData.measures_.isEmpty()) {
                        boolean zIsEmpty2 = this.measuresBuilder_.b.isEmpty();
                        o7 o7Var2 = this.measuresBuilder_;
                        if (zIsEmpty2) {
                            o7Var2.a = null;
                            this.measuresBuilder_ = null;
                            this.measures_ = metricData.measures_;
                            this.bitField0_ &= -3;
                            if (y4.alwaysUseFieldBuilders) {
                                measuresFieldBuilder = getMeasuresFieldBuilder();
                            }
                            this.measuresBuilder_ = measuresFieldBuilder;
                        } else {
                            o7Var2.a(metricData.measures_);
                        }
                    }
                    if (metricData.hasError()) {
                        mergeError(metricData.getError());
                    }
                    if (metricData.hasTs()) {
                        mergeTs(metricData.getTs());
                    }
                    mergeUnknownFields(((y4) metricData).unknownFields);
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

                @Deprecated
                public Builder setTimestamp(String str) {
                    str.getClass();
                    this.timestamp_ = str;
                    onChanged();
                    return this;
                }

                @Deprecated
                public Builder setTimestampBytes(ByteString byteString) {
                    byteString.getClass();
                    c.checkByteStringIsUtf8(byteString);
                    this.timestamp_ = byteString;
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
                public MetricData mo250getDefaultInstanceForType() {
                    return MetricData.getDefaultInstance();
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

                public Dimension.Builder addDimensionsBuilder(int i) {
                    return (Dimension.Builder) getDimensionsFieldBuilder().b(i, Dimension.getDefaultInstance());
                }

                public Measure.Builder addMeasuresBuilder(int i) {
                    return (Measure.Builder) getMeasuresFieldBuilder().b(i, Measure.getDefaultInstance());
                }

                private Builder(h4 h4Var) {
                    super(h4Var);
                    this.timestamp_ = "";
                    this.name_ = "";
                    List list = Collections.EMPTY_LIST;
                    this.dimensions_ = list;
                    this.measures_ = list;
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

                public Builder setTs(Timestamp timestamp) {
                    v7 v7Var = this.tsBuilder_;
                    if (v7Var == null) {
                        timestamp.getClass();
                        this.ts_ = timestamp;
                        onChanged();
                        return this;
                    }
                    v7Var.h(timestamp);
                    return this;
                }

                public Builder addDimensions(int i, Dimension dimension) {
                    o7 o7Var = this.dimensionsBuilder_;
                    if (o7Var == null) {
                        dimension.getClass();
                        ensureDimensionsIsMutable();
                        this.dimensions_.add(i, dimension);
                        onChanged();
                        return this;
                    }
                    o7Var.d(i, dimension);
                    return this;
                }

                public Builder addMeasures(int i, Measure measure) {
                    o7 o7Var = this.measuresBuilder_;
                    if (o7Var == null) {
                        measure.getClass();
                        ensureMeasuresIsMutable();
                        this.measures_.add(i, measure);
                        onChanged();
                        return this;
                    }
                    o7Var.d(i, measure);
                    return this;
                }

                public Builder setDimensions(int i, Dimension dimension) {
                    o7 o7Var = this.dimensionsBuilder_;
                    if (o7Var == null) {
                        dimension.getClass();
                        ensureDimensionsIsMutable();
                        this.dimensions_.set(i, dimension);
                        onChanged();
                        return this;
                    }
                    o7Var.s(i, dimension);
                    return this;
                }

                public Builder setMeasures(int i, Measure measure) {
                    o7 o7Var = this.measuresBuilder_;
                    if (o7Var == null) {
                        measure.getClass();
                        ensureMeasuresIsMutable();
                        this.measures_.set(i, measure);
                        onChanged();
                        return this;
                    }
                    o7Var.s(i, measure);
                    return this;
                }

                public Builder addDimensions(Dimension dimension) {
                    o7 o7Var = this.dimensionsBuilder_;
                    if (o7Var == null) {
                        dimension.getClass();
                        ensureDimensionsIsMutable();
                        this.dimensions_.add(dimension);
                        onChanged();
                        return this;
                    }
                    o7Var.e(dimension);
                    return this;
                }

                public Builder addMeasures(Measure measure) {
                    o7 o7Var = this.measuresBuilder_;
                    if (o7Var == null) {
                        measure.getClass();
                        ensureMeasuresIsMutable();
                        this.measures_.add(measure);
                        onChanged();
                        return this;
                    }
                    o7Var.e(measure);
                    return this;
                }

                public Builder addDimensions(int i, Dimension.Builder builder) {
                    o7 o7Var = this.dimensionsBuilder_;
                    if (o7Var == null) {
                        ensureDimensionsIsMutable();
                        this.dimensions_.add(i, builder.build());
                        onChanged();
                        return this;
                    }
                    o7Var.d(i, builder.build());
                    return this;
                }

                public Builder addMeasures(int i, Measure.Builder builder) {
                    o7 o7Var = this.measuresBuilder_;
                    if (o7Var == null) {
                        ensureMeasuresIsMutable();
                        this.measures_.add(i, builder.build());
                        onChanged();
                        return this;
                    }
                    o7Var.d(i, builder.build());
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof MetricData) {
                        return mergeFrom((MetricData) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                    MetricData metricData = null;
                    try {
                        try {
                            MetricData metricData2 = (MetricData) MetricData.PARSER.parsePartialFrom(rVar, o3Var);
                            if (metricData2 != null) {
                                mergeFrom(metricData2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            MetricData metricData3 = (MetricData) e.getUnfinishedMessage();
                            try {
                                throw e.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                metricData = metricData3;
                                if (metricData != null) {
                                    mergeFrom(metricData);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (metricData != null) {
                            mergeFrom(metricData);
                        }
                        throw th;
                    }
                }
            }

            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            public static final class Dimension extends y4 implements DimensionOrBuilder {
                public static final int NAME_FIELD_NUMBER = 1;
                public static final int VALUE_FIELD_NUMBER = 2;
                private static final long serialVersionUID = 0;
                private byte memoizedIsInitialized;
                private volatile Object name_;
                private volatile Object value_;
                private static final Dimension DEFAULT_INSTANCE = new Dimension();
                private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Dimension.1
                    @Override // com.explorestack.protobuf.g7
                    public Dimension parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                        return new Dimension(rVar, o3Var);
                    }
                };

                /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
                public static final class Builder extends g4 implements DimensionOrBuilder {
                    private Object name_;
                    private Object value_;

                    private Builder() {
                        super(null);
                        this.name_ = "";
                        this.value_ = "";
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_descriptor;
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Dimension buildPartial() {
                        Dimension dimension = new Dimension(this);
                        dimension.name_ = this.name_;
                        dimension.value_ = this.value_;
                        onBuilt();
                        return dimension;
                    }

                    @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_descriptor;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                    public String getName() {
                        Object obj = this.name_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.name_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                    public ByteString getNameBytes() {
                        Object obj = this.name_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.name_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                    public String getValue() {
                        Object obj = this.value_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.value_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                    public ByteString getValueBytes() {
                        Object obj = this.value_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.value_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.g4
                    public w4 internalGetFieldAccessorTable() {
                        w4 w4Var = SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_fieldAccessorTable;
                        w4Var.c(Dimension.class, Builder.class);
                        return w4Var;
                    }

                    private void maybeForceBuilderInitialization() {
                        boolean unused = y4.alwaysUseFieldBuilders;
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Dimension build() {
                        Dimension dimensionBuildPartial = buildPartial();
                        if (dimensionBuildPartial.isInitialized()) {
                            return dimensionBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) dimensionBuildPartial);
                    }

                    @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder clear() {
                        super.clear();
                        this.name_ = "";
                        this.value_ = "";
                        return this;
                    }

                    public Builder clearName() {
                        this.name_ = Dimension.getDefaultInstance().getName();
                        onChanged();
                        return this;
                    }

                    public Builder clearValue() {
                        this.value_ = Dimension.getDefaultInstance().getValue();
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder
                    /* JADX INFO: renamed from: clone */
                    public Builder mo247clone() {
                        return (Builder) super.mo247clone();
                    }

                    public Builder mergeFrom(Dimension dimension) {
                        if (dimension == Dimension.getDefaultInstance()) {
                            return this;
                        }
                        if (!dimension.getName().isEmpty()) {
                            this.name_ = dimension.name_;
                            onChanged();
                        }
                        if (!dimension.getValue().isEmpty()) {
                            this.value_ = dimension.value_;
                            onChanged();
                        }
                        mergeUnknownFields(((y4) dimension).unknownFields);
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

                    public Builder setValue(String str) {
                        str.getClass();
                        this.value_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setValueBytes(ByteString byteString) {
                        byteString.getClass();
                        c.checkByteStringIsUtf8(byteString);
                        this.value_ = byteString;
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
                    public Dimension mo250getDefaultInstanceForType() {
                        return Dimension.getDefaultInstance();
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
                        this.name_ = "";
                        this.value_ = "";
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder mergeFrom(Message message) {
                        if (message instanceof Dimension) {
                            return mergeFrom((Dimension) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                        Dimension dimension = null;
                        try {
                            try {
                                Dimension dimension2 = (Dimension) Dimension.PARSER.parsePartialFrom(rVar, o3Var);
                                if (dimension2 != null) {
                                    mergeFrom(dimension2);
                                }
                                return this;
                            } catch (InvalidProtocolBufferException e) {
                                Dimension dimension3 = (Dimension) e.getUnfinishedMessage();
                                try {
                                    throw e.unwrapIOException();
                                } catch (Throwable th) {
                                    th = th;
                                    dimension = dimension3;
                                    if (dimension != null) {
                                        mergeFrom(dimension);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (dimension != null) {
                                mergeFrom(dimension);
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
                    if (!(obj instanceof Dimension)) {
                        return super.equals(obj);
                    }
                    Dimension dimension = (Dimension) obj;
                    return getName().equals(dimension.getName()) && getValue().equals(dimension.getValue()) && this.unknownFields.equals(dimension.unknownFields);
                }

                public static Dimension getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_descriptor;
                }

                public static Builder newBuilder(Dimension dimension) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(dimension);
                }

                public static Dimension parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Dimension) y4.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Dimension parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (Dimension) PARSER.parseFrom(byteBuffer);
                }

                public static g7 parser() {
                    return PARSER;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
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

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public int getSerializedSize() {
                    int i = this.memoizedSize;
                    if (i != -1) {
                        return i;
                    }
                    int iComputeStringSize = !getNameBytes().isEmpty() ? y4.computeStringSize(1, this.name_) : 0;
                    if (!getValueBytes().isEmpty()) {
                        iComputeStringSize += y4.computeStringSize(2, this.value_);
                    }
                    int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.explorestack.protobuf.MessageOrBuilder
                public final s8 getUnknownFields() {
                    return this.unknownFields;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                public String getValue() {
                    Object obj = this.value_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.value_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                public ByteString getValueBytes() {
                    Object obj = this.value_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.value_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public int hashCode() {
                    int i = this.memoizedHashCode;
                    if (i != 0) {
                        return i;
                    }
                    int iHashCode = this.unknownFields.a.hashCode() + ((getValue().hashCode() + ((((getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
                    this.memoizedHashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.explorestack.protobuf.y4
                public w4 internalGetFieldAccessorTable() {
                    w4 w4Var = SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_fieldAccessorTable;
                    w4Var.c(Dimension.class, Builder.class);
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
                    return new Dimension();
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                private Dimension(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                                            this.value_ = rVar.E();
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
                            this.unknownFields = p8VarB.build();
                            makeExtensionsImmutable();
                            throw th;
                        }
                    }
                    this.unknownFields = p8VarB.build();
                    makeExtensionsImmutable();
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(w wVar) throws IOException {
                    if (!getNameBytes().isEmpty()) {
                        y4.writeString(wVar, 1, this.name_);
                    }
                    if (!getValueBytes().isEmpty()) {
                        y4.writeString(wVar, 2, this.value_);
                    }
                    this.unknownFields.writeTo(wVar);
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                public Dimension mo250getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                public static Dimension parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
                    return (Dimension) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
                }

                public static Dimension parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
                    return (Dimension) PARSER.parseFrom(byteBuffer, o3Var);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Dimension parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (Dimension) PARSER.parseFrom(byteString);
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Dimension parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
                    return (Dimension) PARSER.parseFrom(byteString, o3Var);
                }

                public static Dimension parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (Dimension) PARSER.parseFrom(bArr);
                }

                public static Dimension parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
                    return (Dimension) PARSER.parseFrom(bArr, o3Var);
                }

                public static Dimension parseFrom(InputStream inputStream) throws IOException {
                    return (Dimension) y4.parseWithIOException(PARSER, inputStream);
                }

                public static Dimension parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
                    return (Dimension) y4.parseWithIOException(PARSER, inputStream, o3Var);
                }

                public static Dimension parseFrom(r rVar) throws IOException {
                    return (Dimension) y4.parseWithIOException(PARSER, rVar);
                }

                public static Dimension parseFrom(r rVar, o3 o3Var) throws IOException {
                    return (Dimension) y4.parseWithIOException(PARSER, rVar, o3Var);
                }

                private Dimension(g4 g4Var) {
                    super(g4Var);
                    this.memoizedIsInitialized = (byte) -1;
                }

                private Dimension() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.name_ = "";
                    this.value_ = "";
                }
            }

            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            public interface DimensionOrBuilder extends MessageOrBuilder {
                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                /* synthetic */ MessageLite mo250getDefaultInstanceForType();

                String getName();

                ByteString getNameBytes();

                String getValue();

                ByteString getValueBytes();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            public static final class Error extends y4 implements ErrorOrBuilder {
                public static final int DESCRIPTION_FIELD_NUMBER = 2;
                public static final int NAME_FIELD_NUMBER = 1;
                private static final long serialVersionUID = 0;
                private volatile Object description_;
                private byte memoizedIsInitialized;
                private volatile Object name_;
                private static final Error DEFAULT_INSTANCE = new Error();
                private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Error.1
                    @Override // com.explorestack.protobuf.g7
                    public Error parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                        return new Error(rVar, o3Var);
                    }
                };

                /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
                public static final class Builder extends g4 implements ErrorOrBuilder {
                    private Object description_;
                    private Object name_;

                    private Builder() {
                        super(null);
                        this.name_ = "";
                        this.description_ = "";
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_descriptor;
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Error buildPartial() {
                        Error error = new Error(this);
                        error.name_ = this.name_;
                        error.description_ = this.description_;
                        onBuilt();
                        return error;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                    public String getDescription() {
                        Object obj = this.description_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.description_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                    public ByteString getDescriptionBytes() {
                        Object obj = this.description_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.description_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_descriptor;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                    public String getName() {
                        Object obj = this.name_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.name_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                    public ByteString getNameBytes() {
                        Object obj = this.name_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.name_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.g4
                    public w4 internalGetFieldAccessorTable() {
                        w4 w4Var = SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_fieldAccessorTable;
                        w4Var.c(Error.class, Builder.class);
                        return w4Var;
                    }

                    private void maybeForceBuilderInitialization() {
                        boolean unused = y4.alwaysUseFieldBuilders;
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Error build() {
                        Error errorBuildPartial = buildPartial();
                        if (errorBuildPartial.isInitialized()) {
                            return errorBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) errorBuildPartial);
                    }

                    @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder clear() {
                        super.clear();
                        this.name_ = "";
                        this.description_ = "";
                        return this;
                    }

                    public Builder clearDescription() {
                        this.description_ = Error.getDefaultInstance().getDescription();
                        onChanged();
                        return this;
                    }

                    public Builder clearName() {
                        this.name_ = Error.getDefaultInstance().getName();
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder
                    /* JADX INFO: renamed from: clone */
                    public Builder mo247clone() {
                        return (Builder) super.mo247clone();
                    }

                    public Builder mergeFrom(Error error) {
                        if (error == Error.getDefaultInstance()) {
                            return this;
                        }
                        if (!error.getName().isEmpty()) {
                            this.name_ = error.name_;
                            onChanged();
                        }
                        if (!error.getDescription().isEmpty()) {
                            this.description_ = error.description_;
                            onChanged();
                        }
                        mergeUnknownFields(((y4) error).unknownFields);
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                    public final Builder mergeUnknownFields(s8 s8Var) {
                        return (Builder) super.mergeUnknownFields(s8Var);
                    }

                    public Builder setDescription(String str) {
                        str.getClass();
                        this.description_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setDescriptionBytes(ByteString byteString) {
                        byteString.getClass();
                        c.checkByteStringIsUtf8(byteString);
                        this.description_ = byteString;
                        onChanged();
                        return this;
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
                    public Error mo250getDefaultInstanceForType() {
                        return Error.getDefaultInstance();
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
                        this.name_ = "";
                        this.description_ = "";
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder mergeFrom(Message message) {
                        if (message instanceof Error) {
                            return mergeFrom((Error) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                        Error error = null;
                        try {
                            try {
                                Error error2 = (Error) Error.PARSER.parsePartialFrom(rVar, o3Var);
                                if (error2 != null) {
                                    mergeFrom(error2);
                                }
                                return this;
                            } catch (InvalidProtocolBufferException e) {
                                Error error3 = (Error) e.getUnfinishedMessage();
                                try {
                                    throw e.unwrapIOException();
                                } catch (Throwable th) {
                                    th = th;
                                    error = error3;
                                    if (error != null) {
                                        mergeFrom(error);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (error != null) {
                                mergeFrom(error);
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
                    if (!(obj instanceof Error)) {
                        return super.equals(obj);
                    }
                    Error error = (Error) obj;
                    return getName().equals(error.getName()) && getDescription().equals(error.getDescription()) && this.unknownFields.equals(error.unknownFields);
                }

                public static Error getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_descriptor;
                }

                public static Builder newBuilder(Error error) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(error);
                }

                public static Error parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Error) y4.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Error parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (Error) PARSER.parseFrom(byteBuffer);
                }

                public static g7 parser() {
                    return PARSER;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                public String getDescription() {
                    Object obj = this.description_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.description_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                public ByteString getDescriptionBytes() {
                    Object obj = this.description_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.description_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
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

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public int getSerializedSize() {
                    int i = this.memoizedSize;
                    if (i != -1) {
                        return i;
                    }
                    int iComputeStringSize = !getNameBytes().isEmpty() ? y4.computeStringSize(1, this.name_) : 0;
                    if (!getDescriptionBytes().isEmpty()) {
                        iComputeStringSize += y4.computeStringSize(2, this.description_);
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
                    int iHashCode = this.unknownFields.a.hashCode() + ((getDescription().hashCode() + ((((getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
                    this.memoizedHashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.explorestack.protobuf.y4
                public w4 internalGetFieldAccessorTable() {
                    w4 w4Var = SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_fieldAccessorTable;
                    w4Var.c(Error.class, Builder.class);
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
                    return new Error();
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                private Error(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                                            this.description_ = rVar.E();
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
                            this.unknownFields = p8VarB.build();
                            makeExtensionsImmutable();
                            throw th;
                        }
                    }
                    this.unknownFields = p8VarB.build();
                    makeExtensionsImmutable();
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(w wVar) throws IOException {
                    if (!getNameBytes().isEmpty()) {
                        y4.writeString(wVar, 1, this.name_);
                    }
                    if (!getDescriptionBytes().isEmpty()) {
                        y4.writeString(wVar, 2, this.description_);
                    }
                    this.unknownFields.writeTo(wVar);
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                public Error mo250getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                public static Error parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
                    return (Error) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
                }

                public static Error parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
                    return (Error) PARSER.parseFrom(byteBuffer, o3Var);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Error parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (Error) PARSER.parseFrom(byteString);
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Error parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
                    return (Error) PARSER.parseFrom(byteString, o3Var);
                }

                public static Error parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (Error) PARSER.parseFrom(bArr);
                }

                public static Error parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
                    return (Error) PARSER.parseFrom(bArr, o3Var);
                }

                public static Error parseFrom(InputStream inputStream) throws IOException {
                    return (Error) y4.parseWithIOException(PARSER, inputStream);
                }

                public static Error parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
                    return (Error) y4.parseWithIOException(PARSER, inputStream, o3Var);
                }

                public static Error parseFrom(r rVar) throws IOException {
                    return (Error) y4.parseWithIOException(PARSER, rVar);
                }

                public static Error parseFrom(r rVar, o3 o3Var) throws IOException {
                    return (Error) y4.parseWithIOException(PARSER, rVar, o3Var);
                }

                private Error(g4 g4Var) {
                    super(g4Var);
                    this.memoizedIsInitialized = (byte) -1;
                }

                private Error() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.name_ = "";
                    this.description_ = "";
                }
            }

            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            public interface ErrorOrBuilder extends MessageOrBuilder {
                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                /* synthetic */ MessageLite mo250getDefaultInstanceForType();

                String getDescription();

                ByteString getDescriptionBytes();

                String getName();

                ByteString getNameBytes();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            public static final class Measure extends y4 implements MeasureOrBuilder {
                public static final int NAME_FIELD_NUMBER = 1;
                public static final int VALUE_FIELD_NUMBER = 2;
                private static final long serialVersionUID = 0;
                private byte memoizedIsInitialized;
                private volatile Object name_;
                private double value_;
                private static final Measure DEFAULT_INSTANCE = new Measure();
                private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Measure.1
                    @Override // com.explorestack.protobuf.g7
                    public Measure parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                        return new Measure(rVar, o3Var);
                    }
                };

                /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
                public static final class Builder extends g4 implements MeasureOrBuilder {
                    private Object name_;
                    private double value_;

                    private Builder() {
                        super(null);
                        this.name_ = "";
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_descriptor;
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Measure buildPartial() {
                        Measure measure = new Measure(this);
                        measure.name_ = this.name_;
                        measure.value_ = this.value_;
                        onBuilt();
                        return measure;
                    }

                    public Builder clearValue() {
                        this.value_ = 0.0d;
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_descriptor;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
                    public String getName() {
                        Object obj = this.name_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.name_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
                    public ByteString getNameBytes() {
                        Object obj = this.name_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.name_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
                    public double getValue() {
                        return this.value_;
                    }

                    @Override // com.explorestack.protobuf.g4
                    public w4 internalGetFieldAccessorTable() {
                        w4 w4Var = SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_fieldAccessorTable;
                        w4Var.c(Measure.class, Builder.class);
                        return w4Var;
                    }

                    public Builder setValue(double d) {
                        this.value_ = d;
                        onChanged();
                        return this;
                    }

                    private void maybeForceBuilderInitialization() {
                        boolean unused = y4.alwaysUseFieldBuilders;
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Measure build() {
                        Measure measureBuildPartial = buildPartial();
                        if (measureBuildPartial.isInitialized()) {
                            return measureBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) measureBuildPartial);
                    }

                    @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder clear() {
                        super.clear();
                        this.name_ = "";
                        this.value_ = 0.0d;
                        return this;
                    }

                    public Builder clearName() {
                        this.name_ = Measure.getDefaultInstance().getName();
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder
                    /* JADX INFO: renamed from: clone */
                    public Builder mo247clone() {
                        return (Builder) super.mo247clone();
                    }

                    public Builder mergeFrom(Measure measure) {
                        if (measure == Measure.getDefaultInstance()) {
                            return this;
                        }
                        if (!measure.getName().isEmpty()) {
                            this.name_ = measure.name_;
                            onChanged();
                        }
                        if (measure.getValue() != 0.0d) {
                            setValue(measure.getValue());
                        }
                        mergeUnknownFields(((y4) measure).unknownFields);
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
                    public Measure mo250getDefaultInstanceForType() {
                        return Measure.getDefaultInstance();
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
                        this.name_ = "";
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder mergeFrom(Message message) {
                        if (message instanceof Measure) {
                            return mergeFrom((Measure) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                        Measure measure = null;
                        try {
                            try {
                                Measure measure2 = (Measure) Measure.PARSER.parsePartialFrom(rVar, o3Var);
                                if (measure2 != null) {
                                    mergeFrom(measure2);
                                }
                                return this;
                            } catch (InvalidProtocolBufferException e) {
                                Measure measure3 = (Measure) e.getUnfinishedMessage();
                                try {
                                    throw e.unwrapIOException();
                                } catch (Throwable th) {
                                    th = th;
                                    measure = measure3;
                                    if (measure != null) {
                                        mergeFrom(measure);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (measure != null) {
                                mergeFrom(measure);
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
                    if (!(obj instanceof Measure)) {
                        return super.equals(obj);
                    }
                    Measure measure = (Measure) obj;
                    return getName().equals(measure.getName()) && Double.doubleToLongBits(getValue()) == Double.doubleToLongBits(measure.getValue()) && this.unknownFields.equals(measure.unknownFields);
                }

                public static Measure getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_descriptor;
                }

                public static Builder newBuilder(Measure measure) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(measure);
                }

                public static Measure parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Measure) y4.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Measure parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (Measure) PARSER.parseFrom(byteBuffer);
                }

                public static g7 parser() {
                    return PARSER;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
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

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public int getSerializedSize() {
                    int i = this.memoizedSize;
                    if (i != -1) {
                        return i;
                    }
                    int iComputeStringSize = !getNameBytes().isEmpty() ? y4.computeStringSize(1, this.name_) : 0;
                    if (this.value_ != 0.0d) {
                        iComputeStringSize += w.f(2);
                    }
                    int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.explorestack.protobuf.MessageOrBuilder
                public final s8 getUnknownFields() {
                    return this.unknownFields;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
                public double getValue() {
                    return this.value_;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public int hashCode() {
                    int i = this.memoizedHashCode;
                    if (i != 0) {
                        return i;
                    }
                    int iHashCode = this.unknownFields.a.hashCode() + ((l5.d(Double.doubleToLongBits(getValue())) + ((((getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
                    this.memoizedHashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.explorestack.protobuf.y4
                public w4 internalGetFieldAccessorTable() {
                    w4 w4Var = SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_fieldAccessorTable;
                    w4Var.c(Measure.class, Builder.class);
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
                    return new Measure();
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                private Measure(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                                        if (iF != 17) {
                                            if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                            }
                                        } else {
                                            this.value_ = rVar.n();
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
                            this.unknownFields = p8VarB.build();
                            makeExtensionsImmutable();
                            throw th;
                        }
                    }
                    this.unknownFields = p8VarB.build();
                    makeExtensionsImmutable();
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(w wVar) throws IOException {
                    if (!getNameBytes().isEmpty()) {
                        y4.writeString(wVar, 1, this.name_);
                    }
                    double d = this.value_;
                    if (d != 0.0d) {
                        wVar.E(2, d);
                    }
                    this.unknownFields.writeTo(wVar);
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                public Measure mo250getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                public static Measure parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
                    return (Measure) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
                }

                public static Measure parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
                    return (Measure) PARSER.parseFrom(byteBuffer, o3Var);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Measure parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (Measure) PARSER.parseFrom(byteString);
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Measure parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
                    return (Measure) PARSER.parseFrom(byteString, o3Var);
                }

                public static Measure parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (Measure) PARSER.parseFrom(bArr);
                }

                public static Measure parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
                    return (Measure) PARSER.parseFrom(bArr, o3Var);
                }

                public static Measure parseFrom(InputStream inputStream) throws IOException {
                    return (Measure) y4.parseWithIOException(PARSER, inputStream);
                }

                public static Measure parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
                    return (Measure) y4.parseWithIOException(PARSER, inputStream, o3Var);
                }

                public static Measure parseFrom(r rVar) throws IOException {
                    return (Measure) y4.parseWithIOException(PARSER, rVar);
                }

                public static Measure parseFrom(r rVar, o3 o3Var) throws IOException {
                    return (Measure) y4.parseWithIOException(PARSER, rVar, o3Var);
                }

                private Measure(g4 g4Var) {
                    super(g4Var);
                    this.memoizedIsInitialized = (byte) -1;
                }

                private Measure() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.name_ = "";
                }
            }

            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            public interface MeasureOrBuilder extends MessageOrBuilder {
                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                /* synthetic */ MessageLite mo250getDefaultInstanceForType();

                String getName();

                ByteString getNameBytes();

                double getValue();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof MetricData)) {
                    return super.equals(obj);
                }
                MetricData metricData = (MetricData) obj;
                if (!getTimestamp().equals(metricData.getTimestamp()) || !getName().equals(metricData.getName()) || !getDimensionsList().equals(metricData.getDimensionsList()) || !getMeasuresList().equals(metricData.getMeasuresList()) || hasError() != metricData.hasError()) {
                    return false;
                }
                if ((!hasError() || getError().equals(metricData.getError())) && hasTs() == metricData.hasTs()) {
                    return (!hasTs() || getTs().equals(metricData.getTs())) && this.unknownFields.equals(metricData.unknownFields);
                }
                return false;
            }

            public static MetricData getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_descriptor;
            }

            public static Builder newBuilder(MetricData metricData) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(metricData);
            }

            public static MetricData parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (MetricData) y4.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static MetricData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (MetricData) PARSER.parseFrom(byteBuffer);
            }

            public static g7 parser() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public Dimension getDimensions(int i) {
                return this.dimensions_.get(i);
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public int getDimensionsCount() {
                return this.dimensions_.size();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public List<Dimension> getDimensionsList() {
                return this.dimensions_;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public DimensionOrBuilder getDimensionsOrBuilder(int i) {
                return this.dimensions_.get(i);
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public List<? extends DimensionOrBuilder> getDimensionsOrBuilderList() {
                return this.dimensions_;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public Error getError() {
                Error error = this.error_;
                return error == null ? Error.getDefaultInstance() : error;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public Measure getMeasures(int i) {
                return this.measures_.get(i);
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public int getMeasuresCount() {
                return this.measures_.size();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public List<Measure> getMeasuresList() {
                return this.measures_;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public MeasureOrBuilder getMeasuresOrBuilder(int i) {
                return this.measures_.get(i);
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public List<? extends MeasureOrBuilder> getMeasuresOrBuilderList() {
                return this.measures_;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
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

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int iComputeStringSize = !getTimestampBytes().isEmpty() ? y4.computeStringSize(1, this.timestamp_) : 0;
                if (!getNameBytes().isEmpty()) {
                    iComputeStringSize += y4.computeStringSize(2, this.name_);
                }
                for (int i2 = 0; i2 < this.dimensions_.size(); i2++) {
                    iComputeStringSize += w.o(3, this.dimensions_.get(i2));
                }
                for (int i3 = 0; i3 < this.measures_.size(); i3++) {
                    iComputeStringSize += w.o(4, this.measures_.get(i3));
                }
                if (this.error_ != null) {
                    iComputeStringSize += w.o(5, getError());
                }
                if (this.ts_ != null) {
                    iComputeStringSize += w.o(6, getTs());
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            @Deprecated
            public String getTimestamp() {
                Object obj = this.timestamp_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.timestamp_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            @Deprecated
            public ByteString getTimestampBytes() {
                Object obj = this.timestamp_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.timestamp_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public Timestamp getTs() {
                Timestamp timestamp = this.ts_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final s8 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public boolean hasError() {
                return this.error_ != null;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public boolean hasTs() {
                return this.ts_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = getName().hashCode() + ((((getTimestamp().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
                if (getDimensionsCount() > 0) {
                    iHashCode = pv1.c(iHashCode, 37, 3, 53) + getDimensionsList().hashCode();
                }
                if (getMeasuresCount() > 0) {
                    iHashCode = pv1.c(iHashCode, 37, 4, 53) + getMeasuresList().hashCode();
                }
                if (hasError()) {
                    iHashCode = pv1.c(iHashCode, 37, 5, 53) + getError().hashCode();
                }
                if (hasTs()) {
                    iHashCode = pv1.c(iHashCode, 37, 6, 53) + getTs().hashCode();
                }
                int iHashCode2 = this.unknownFields.a.hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.y4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_fieldAccessorTable;
                w4Var.c(MetricData.class, Builder.class);
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
                return new MetricData();
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            private MetricData(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                                    if (iF != 18) {
                                        if (iF != 26) {
                                            if (iF != 34) {
                                                if (iF != 42) {
                                                    if (iF != 50) {
                                                        if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                                        }
                                                    } else {
                                                        Timestamp timestamp = this.ts_;
                                                        Timestamp.Builder builder = timestamp != null ? timestamp.toBuilder() : null;
                                                        Timestamp timestamp2 = (Timestamp) rVar.v(Timestamp.parser(), o3Var);
                                                        this.ts_ = timestamp2;
                                                        if (builder != null) {
                                                            builder.mergeFrom(timestamp2);
                                                            this.ts_ = builder.buildPartial();
                                                        }
                                                    }
                                                } else {
                                                    Error error = this.error_;
                                                    Error.Builder builder2 = error != null ? error.toBuilder() : null;
                                                    Error error2 = (Error) rVar.v(Error.parser(), o3Var);
                                                    this.error_ = error2;
                                                    if (builder2 != null) {
                                                        builder2.mergeFrom(error2);
                                                        this.error_ = builder2.buildPartial();
                                                    }
                                                }
                                            } else {
                                                int i2 = (i == true ? 1 : 0) & 2;
                                                i = i;
                                                if (i2 == 0) {
                                                    this.measures_ = new ArrayList();
                                                    i = (i == true ? 1 : 0) | 2;
                                                }
                                                this.measures_.add((Measure) rVar.v(Measure.parser(), o3Var));
                                            }
                                        } else {
                                            int i3 = (i == true ? 1 : 0) & 1;
                                            i = i;
                                            if (i3 == 0) {
                                                this.dimensions_ = new ArrayList();
                                                i = (i == true ? 1 : 0) | 1;
                                            }
                                            this.dimensions_.add((Dimension) rVar.v(Dimension.parser(), o3Var));
                                        }
                                    } else {
                                        this.name_ = rVar.E();
                                    }
                                } else {
                                    this.timestamp_ = rVar.E();
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th) {
                        if (((i == true ? 1 : 0) & 1) != 0) {
                            this.dimensions_ = Collections.unmodifiableList(this.dimensions_);
                        }
                        if (((i == true ? 1 : 0) & 2) != 0) {
                            this.measures_ = Collections.unmodifiableList(this.measures_);
                        }
                        this.unknownFields = p8VarB.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (((i == true ? 1 : 0) & 1) != 0) {
                    this.dimensions_ = Collections.unmodifiableList(this.dimensions_);
                }
                if (((i == true ? 1 : 0) & 2) != 0) {
                    this.measures_ = Collections.unmodifiableList(this.measures_);
                }
                this.unknownFields = p8VarB.build();
                makeExtensionsImmutable();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public ErrorOrBuilder getErrorOrBuilder() {
                return getError();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public g8 getTsOrBuilder() {
                return getTs();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(w wVar) throws IOException {
                if (!getTimestampBytes().isEmpty()) {
                    y4.writeString(wVar, 1, this.timestamp_);
                }
                if (!getNameBytes().isEmpty()) {
                    y4.writeString(wVar, 2, this.name_);
                }
                for (int i = 0; i < this.dimensions_.size(); i++) {
                    wVar.M(3, this.dimensions_.get(i));
                }
                for (int i2 = 0; i2 < this.measures_.size(); i2++) {
                    wVar.M(4, this.measures_.get(i2));
                }
                if (this.error_ != null) {
                    wVar.M(5, getError());
                }
                if (this.ts_ != null) {
                    wVar.M(6, getTs());
                }
                this.unknownFields.writeTo(wVar);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public MetricData mo250getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static MetricData parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
                return (MetricData) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
            }

            public static MetricData parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
                return (MetricData) PARSER.parseFrom(byteBuffer, o3Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static MetricData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (MetricData) PARSER.parseFrom(byteString);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static MetricData parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
                return (MetricData) PARSER.parseFrom(byteString, o3Var);
            }

            public static MetricData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (MetricData) PARSER.parseFrom(bArr);
            }

            public static MetricData parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
                return (MetricData) PARSER.parseFrom(bArr, o3Var);
            }

            public static MetricData parseFrom(InputStream inputStream) throws IOException {
                return (MetricData) y4.parseWithIOException(PARSER, inputStream);
            }

            public static MetricData parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
                return (MetricData) y4.parseWithIOException(PARSER, inputStream, o3Var);
            }

            public static MetricData parseFrom(r rVar) throws IOException {
                return (MetricData) y4.parseWithIOException(PARSER, rVar);
            }

            public static MetricData parseFrom(r rVar, o3 o3Var) throws IOException {
                return (MetricData) y4.parseWithIOException(PARSER, rVar, o3Var);
            }

            private MetricData(g4 g4Var) {
                super(g4Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            private MetricData() {
                this.memoizedIsInitialized = (byte) -1;
                this.timestamp_ = "";
                this.name_ = "";
                List list = Collections.EMPTY_LIST;
                this.dimensions_ = list;
                this.measures_ = list;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public interface MetricDataOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo250getDefaultInstanceForType();

            MetricData.Dimension getDimensions(int i);

            int getDimensionsCount();

            List<MetricData.Dimension> getDimensionsList();

            MetricData.DimensionOrBuilder getDimensionsOrBuilder(int i);

            List<? extends MetricData.DimensionOrBuilder> getDimensionsOrBuilderList();

            MetricData.Error getError();

            MetricData.ErrorOrBuilder getErrorOrBuilder();

            MetricData.Measure getMeasures(int i);

            int getMeasuresCount();

            List<MetricData.Measure> getMeasuresList();

            MetricData.MeasureOrBuilder getMeasuresOrBuilder(int i);

            List<? extends MetricData.MeasureOrBuilder> getMeasuresOrBuilderList();

            String getName();

            ByteString getNameBytes();

            @Deprecated
            String getTimestamp();

            @Deprecated
            ByteString getTimestampBytes();

            Timestamp getTs();

            g8 getTsOrBuilder();

            boolean hasError();

            boolean hasTs();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Metric)) {
                return super.equals(obj);
            }
            Metric metric = (Metric) obj;
            return getContext().equals(metric.getContext()) && getDataList().equals(metric.getDataList()) && this.unknownFields.equals(metric.unknownFields);
        }

        public static Metric getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_descriptor;
        }

        public static Builder newBuilder(Metric metric) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(metric);
        }

        public static Metric parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Metric) y4.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Metric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Metric) PARSER.parseFrom(byteBuffer);
        }

        public static g7 parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public String getContext() {
            Object obj = this.context_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.context_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public ByteString getContextBytes() {
            Object obj = this.context_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.context_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public MetricData getData(int i) {
            return this.data_.get(i);
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public int getDataCount() {
            return this.data_.size();
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public List<MetricData> getDataList() {
            return this.data_;
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public MetricDataOrBuilder getDataOrBuilder(int i) {
            return this.data_.get(i);
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public List<? extends MetricDataOrBuilder> getDataOrBuilderList() {
            return this.data_;
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
            int iComputeStringSize = !getContextBytes().isEmpty() ? y4.computeStringSize(1, this.context_) : 0;
            for (int i2 = 0; i2 < this.data_.size(); i2++) {
                iComputeStringSize += w.o(2, this.data_.get(i2));
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
            int iHashCode = getContext().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
            if (getDataCount() > 0) {
                iHashCode = getDataList().hashCode() + pv1.c(iHashCode, 37, 2, 53);
            }
            int iHashCode2 = this.unknownFields.a.hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.y4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_fieldAccessorTable;
            w4Var.c(Metric.class, Builder.class);
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
            return new Metric();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private Metric(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                                        this.data_ = new ArrayList();
                                        z2 = true;
                                    }
                                    this.data_.add((MetricData) rVar.v(MetricData.parser(), o3Var));
                                }
                            } else {
                                this.context_ = rVar.E();
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
                        this.data_ = Collections.unmodifiableList(this.data_);
                    }
                    this.unknownFields = p8VarB.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2) {
                this.data_ = Collections.unmodifiableList(this.data_);
            }
            this.unknownFields = p8VarB.build();
            makeExtensionsImmutable();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(w wVar) throws IOException {
            if (!getContextBytes().isEmpty()) {
                y4.writeString(wVar, 1, this.context_);
            }
            for (int i = 0; i < this.data_.size(); i++) {
                wVar.M(2, this.data_.get(i));
            }
            this.unknownFields.writeTo(wVar);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Metric mo250getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Metric parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Metric) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
        }

        public static Metric parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
            return (Metric) PARSER.parseFrom(byteBuffer, o3Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Metric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Metric) PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Metric parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
            return (Metric) PARSER.parseFrom(byteString, o3Var);
        }

        public static Metric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Metric) PARSER.parseFrom(bArr);
        }

        public static Metric parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
            return (Metric) PARSER.parseFrom(bArr, o3Var);
        }

        public static Metric parseFrom(InputStream inputStream) throws IOException {
            return (Metric) y4.parseWithIOException(PARSER, inputStream);
        }

        public static Metric parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Metric) y4.parseWithIOException(PARSER, inputStream, o3Var);
        }

        public static Metric parseFrom(r rVar) throws IOException {
            return (Metric) y4.parseWithIOException(PARSER, rVar);
        }

        public static Metric parseFrom(r rVar, o3 o3Var) throws IOException {
            return (Metric) y4.parseWithIOException(PARSER, rVar, o3Var);
        }

        private Metric(g4 g4Var) {
            super(g4Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        private Metric() {
            this.memoizedIsInitialized = (byte) -1;
            this.context_ = "";
            this.data_ = Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface MetricOrBuilder extends MessageOrBuilder {
        String getContext();

        ByteString getContextBytes();

        Metric.MetricData getData(int i);

        int getDataCount();

        List<Metric.MetricData> getDataList();

        Metric.MetricDataOrBuilder getDataOrBuilder(int i);

        List<? extends Metric.MetricDataOrBuilder> getDataOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo250getDefaultInstanceForType();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SDKAnalyticPayload)) {
            return super.equals(obj);
        }
        SDKAnalyticPayload sDKAnalyticPayload = (SDKAnalyticPayload) obj;
        return getMetricsList().equals(sDKAnalyticPayload.getMetricsList()) && this.unknownFields.equals(sDKAnalyticPayload.unknownFields);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(w wVar) throws IOException {
        for (int i = 0; i < this.metrics_.size(); i++) {
            wVar.M(1, this.metrics_.get(i));
        }
        this.unknownFields.writeTo(wVar);
    }

    public static SDKAnalyticPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_descriptor;
    }

    public static Builder newBuilder(SDKAnalyticPayload sDKAnalyticPayload) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(sDKAnalyticPayload);
    }

    public static SDKAnalyticPayload parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SDKAnalyticPayload) y4.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SDKAnalyticPayload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SDKAnalyticPayload) PARSER.parseFrom(byteBuffer);
    }

    public static g7 parser() {
        return PARSER;
    }

    @Override // io.p071bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
    public Metric getMetrics(int i) {
        return this.metrics_.get(i);
    }

    @Override // io.p071bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
    public int getMetricsCount() {
        return this.metrics_.size();
    }

    @Override // io.p071bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
    public List<Metric> getMetricsList() {
        return this.metrics_;
    }

    @Override // io.p071bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
    public MetricOrBuilder getMetricsOrBuilder(int i) {
        return this.metrics_.get(i);
    }

    @Override // io.p071bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
    public List<? extends MetricOrBuilder> getMetricsOrBuilderList() {
        return this.metrics_;
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
        for (int i2 = 0; i2 < this.metrics_.size(); i2++) {
            iO += w.o(1, this.metrics_.get(i2));
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
        if (getMetricsCount() > 0) {
            iHashCode = pv1.c(iHashCode, 37, 1, 53) + getMetricsList().hashCode();
        }
        int iHashCode2 = this.unknownFields.a.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.y4
    public w4 internalGetFieldAccessorTable() {
        w4 w4Var = SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_fieldAccessorTable;
        w4Var.c(SDKAnalyticPayload.class, Builder.class);
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
        return new SDKAnalyticPayload();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    private SDKAnalyticPayload(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                                    this.metrics_ = new ArrayList();
                                    z2 = true;
                                }
                                this.metrics_.add((Metric) rVar.v(Metric.parser(), o3Var));
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
                    this.metrics_ = Collections.unmodifiableList(this.metrics_);
                }
                this.unknownFields = p8VarB.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (z2) {
            this.metrics_ = Collections.unmodifiableList(this.metrics_);
        }
        this.unknownFields = p8VarB.build();
        makeExtensionsImmutable();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public SDKAnalyticPayload mo250getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static SDKAnalyticPayload parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
        return (SDKAnalyticPayload) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
    }

    public static SDKAnalyticPayload parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
        return (SDKAnalyticPayload) PARSER.parseFrom(byteBuffer, o3Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static SDKAnalyticPayload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SDKAnalyticPayload) PARSER.parseFrom(byteString);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static SDKAnalyticPayload parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
        return (SDKAnalyticPayload) PARSER.parseFrom(byteString, o3Var);
    }

    public static SDKAnalyticPayload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SDKAnalyticPayload) PARSER.parseFrom(bArr);
    }

    public static SDKAnalyticPayload parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
        return (SDKAnalyticPayload) PARSER.parseFrom(bArr, o3Var);
    }

    public static SDKAnalyticPayload parseFrom(InputStream inputStream) throws IOException {
        return (SDKAnalyticPayload) y4.parseWithIOException(PARSER, inputStream);
    }

    public static SDKAnalyticPayload parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
        return (SDKAnalyticPayload) y4.parseWithIOException(PARSER, inputStream, o3Var);
    }

    public static SDKAnalyticPayload parseFrom(r rVar) throws IOException {
        return (SDKAnalyticPayload) y4.parseWithIOException(PARSER, rVar);
    }

    public static SDKAnalyticPayload parseFrom(r rVar, o3 o3Var) throws IOException {
        return (SDKAnalyticPayload) y4.parseWithIOException(PARSER, rVar, o3Var);
    }

    private SDKAnalyticPayload(g4 g4Var) {
        super(g4Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    private SDKAnalyticPayload() {
        this.memoizedIsInitialized = (byte) -1;
        this.metrics_ = Collections.EMPTY_LIST;
    }
}
