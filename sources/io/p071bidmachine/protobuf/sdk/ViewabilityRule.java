package io.p071bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.d;
import com.explorestack.protobuf.g4;
import com.explorestack.protobuf.g7;
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
public final class ViewabilityRule extends y4 implements ViewabilityRuleOrBuilder {
    public static final int BILLABLE_FIELD_NUMBER = 2;
    public static final int EVENT_FIELD_NUMBER = 1;
    public static final int MEASUREMENT_FIELD_NUMBER = 3;
    public static final int REQUIRED_METRICS_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private boolean billable_;
    private int event_;
    private Measurement measurement_;
    private byte memoizedIsInitialized;
    private List<MetricRequirement> requiredMetrics_;
    private static final ViewabilityRule DEFAULT_INSTANCE = new ViewabilityRule();
    private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.ViewabilityRule.1
        @Override // com.explorestack.protobuf.g7
        public ViewabilityRule parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
            return new ViewabilityRule(rVar, o3Var);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder extends g4 implements ViewabilityRuleOrBuilder {
        private boolean billable_;
        private int bitField0_;
        private int event_;
        private v7 measurementBuilder_;
        private Measurement measurement_;
        private o7 requiredMetricsBuilder_;
        private List<MetricRequirement> requiredMetrics_;

        private Builder() {
            super(null);
            this.requiredMetrics_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public Builder clearBillable() {
            this.billable_ = false;
            onChanged();
            return this;
        }

        public Builder clearEvent() {
            this.event_ = 0;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        private void ensureRequiredMetricsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.requiredMetrics_ = new ArrayList(this.requiredMetrics_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityRule_descriptor;
        }

        private v7 getMeasurementFieldBuilder() {
            if (this.measurementBuilder_ == null) {
                this.measurementBuilder_ = new v7(getMeasurement(), getParentForChildren(), isClean());
                this.measurement_ = null;
            }
            return this.measurementBuilder_;
        }

        private o7 getRequiredMetricsFieldBuilder() {
            if (this.requiredMetricsBuilder_ == null) {
                this.requiredMetricsBuilder_ = new o7(this.requiredMetrics_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.requiredMetrics_ = null;
            }
            return this.requiredMetricsBuilder_;
        }

        public Builder addAllRequiredMetrics(Iterable<? extends MetricRequirement> iterable) {
            o7 o7Var = this.requiredMetricsBuilder_;
            if (o7Var != null) {
                o7Var.a(iterable);
                return this;
            }
            ensureRequiredMetricsIsMutable();
            b.addAll((Iterable) iterable, (List) this.requiredMetrics_);
            onChanged();
            return this;
        }

        public Builder addRequiredMetrics(MetricRequirement.Builder builder) {
            o7 o7Var = this.requiredMetricsBuilder_;
            if (o7Var != null) {
                o7Var.e(builder.build());
                return this;
            }
            ensureRequiredMetricsIsMutable();
            this.requiredMetrics_.add(builder.build());
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public ViewabilityRule buildPartial() {
            ViewabilityRule viewabilityRule = new ViewabilityRule(this);
            viewabilityRule.event_ = this.event_;
            viewabilityRule.billable_ = this.billable_;
            v7 v7Var = this.measurementBuilder_;
            if (v7Var == null) {
                viewabilityRule.measurement_ = this.measurement_;
            } else {
                viewabilityRule.measurement_ = (Measurement) v7Var.a();
            }
            o7 o7Var = this.requiredMetricsBuilder_;
            if (o7Var == null) {
                if ((this.bitField0_ & 1) != 0) {
                    this.requiredMetrics_ = Collections.unmodifiableList(this.requiredMetrics_);
                    this.bitField0_ &= -2;
                }
                viewabilityRule.requiredMetrics_ = this.requiredMetrics_;
            } else {
                viewabilityRule.requiredMetrics_ = o7Var.f();
            }
            onBuilt();
            return viewabilityRule;
        }

        public Builder clearMeasurement() {
            if (this.measurementBuilder_ == null) {
                this.measurement_ = null;
                onChanged();
                return this;
            }
            this.measurement_ = null;
            this.measurementBuilder_ = null;
            return this;
        }

        public Builder clearRequiredMetrics() {
            o7 o7Var = this.requiredMetricsBuilder_;
            if (o7Var != null) {
                o7Var.g();
                return this;
            }
            this.requiredMetrics_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // io.p071bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public boolean getBillable() {
            return this.billable_;
        }

        @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityRule_descriptor;
        }

        @Override // io.p071bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public int getEvent() {
            return this.event_;
        }

        @Override // io.p071bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public Measurement getMeasurement() {
            v7 v7Var = this.measurementBuilder_;
            if (v7Var != null) {
                return (Measurement) v7Var.d();
            }
            Measurement measurement = this.measurement_;
            return measurement == null ? Measurement.getDefaultInstance() : measurement;
        }

        @Override // io.p071bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public MeasurementOrBuilder getMeasurementOrBuilder() {
            v7 v7Var = this.measurementBuilder_;
            if (v7Var != null) {
                return (MeasurementOrBuilder) v7Var.e();
            }
            Measurement measurement = this.measurement_;
            return measurement == null ? Measurement.getDefaultInstance() : measurement;
        }

        @Override // io.p071bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public MetricRequirement getRequiredMetrics(int i) {
            o7 o7Var = this.requiredMetricsBuilder_;
            return o7Var == null ? this.requiredMetrics_.get(i) : (MetricRequirement) o7Var.l(i, false);
        }

        @Override // io.p071bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public int getRequiredMetricsCount() {
            o7 o7Var = this.requiredMetricsBuilder_;
            return o7Var == null ? this.requiredMetrics_.size() : o7Var.b.size();
        }

        @Override // io.p071bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public List<MetricRequirement> getRequiredMetricsList() {
            o7 o7Var = this.requiredMetricsBuilder_;
            return o7Var == null ? Collections.unmodifiableList(this.requiredMetrics_) : o7Var.m();
        }

        @Override // io.p071bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public MetricRequirementOrBuilder getRequiredMetricsOrBuilder(int i) {
            o7 o7Var = this.requiredMetricsBuilder_;
            return o7Var == null ? this.requiredMetrics_.get(i) : (MetricRequirementOrBuilder) o7Var.n(i);
        }

        @Override // io.p071bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public List<? extends MetricRequirementOrBuilder> getRequiredMetricsOrBuilderList() {
            o7 o7Var = this.requiredMetricsBuilder_;
            return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.requiredMetrics_);
        }

        @Override // io.p071bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public boolean hasMeasurement() {
            return (this.measurementBuilder_ == null && this.measurement_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.g4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityRule_fieldAccessorTable;
            w4Var.c(ViewabilityRule.class, Builder.class);
            return w4Var;
        }

        public Builder mergeMeasurement(Measurement measurement) {
            v7 v7Var = this.measurementBuilder_;
            if (v7Var != null) {
                v7Var.f(measurement);
                return this;
            }
            Measurement measurement2 = this.measurement_;
            if (measurement2 != null) {
                this.measurement_ = Measurement.newBuilder(measurement2).mergeFrom(measurement).buildPartial();
            } else {
                this.measurement_ = measurement;
            }
            onChanged();
            return this;
        }

        public Builder removeRequiredMetrics(int i) {
            o7 o7Var = this.requiredMetricsBuilder_;
            if (o7Var != null) {
                o7Var.r(i);
                return this;
            }
            ensureRequiredMetricsIsMutable();
            this.requiredMetrics_.remove(i);
            onChanged();
            return this;
        }

        public Builder setBillable(boolean z) {
            this.billable_ = z;
            onChanged();
            return this;
        }

        public Builder setEvent(int i) {
            this.event_ = i;
            onChanged();
            return this;
        }

        public Builder setMeasurement(Measurement.Builder builder) {
            v7 v7Var = this.measurementBuilder_;
            if (v7Var != null) {
                v7Var.h(builder.build());
                return this;
            }
            this.measurement_ = builder.build();
            onChanged();
            return this;
        }

        public Builder setRequiredMetrics(int i, MetricRequirement.Builder builder) {
            o7 o7Var = this.requiredMetricsBuilder_;
            if (o7Var != null) {
                o7Var.s(i, builder.build());
                return this;
            }
            ensureRequiredMetricsIsMutable();
            this.requiredMetrics_.set(i, builder.build());
            onChanged();
            return this;
        }

        private void maybeForceBuilderInitialization() {
            if (y4.alwaysUseFieldBuilders) {
                getRequiredMetricsFieldBuilder();
            }
        }

        public MetricRequirement.Builder addRequiredMetricsBuilder() {
            return (MetricRequirement.Builder) getRequiredMetricsFieldBuilder().c(MetricRequirement.getDefaultInstance());
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public ViewabilityRule build() {
            ViewabilityRule viewabilityRuleBuildPartial = buildPartial();
            if (viewabilityRuleBuildPartial.isInitialized()) {
                return viewabilityRuleBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) viewabilityRuleBuildPartial);
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.event_ = 0;
            this.billable_ = false;
            if (this.measurementBuilder_ == null) {
                this.measurement_ = null;
            } else {
                this.measurement_ = null;
                this.measurementBuilder_ = null;
            }
            o7 o7Var = this.requiredMetricsBuilder_;
            if (o7Var == null) {
                this.requiredMetrics_ = Collections.EMPTY_LIST;
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

        public Measurement.Builder getMeasurementBuilder() {
            onChanged();
            return (Measurement.Builder) getMeasurementFieldBuilder().c();
        }

        public MetricRequirement.Builder getRequiredMetricsBuilder(int i) {
            return (MetricRequirement.Builder) getRequiredMetricsFieldBuilder().j(i);
        }

        public List<MetricRequirement.Builder> getRequiredMetricsBuilderList() {
            return getRequiredMetricsFieldBuilder().k();
        }

        public Builder mergeFrom(ViewabilityRule viewabilityRule) {
            if (viewabilityRule == ViewabilityRule.getDefaultInstance()) {
                return this;
            }
            if (viewabilityRule.getEvent() != 0) {
                setEvent(viewabilityRule.getEvent());
            }
            if (viewabilityRule.getBillable()) {
                setBillable(viewabilityRule.getBillable());
            }
            if (viewabilityRule.hasMeasurement()) {
                mergeMeasurement(viewabilityRule.getMeasurement());
            }
            if (this.requiredMetricsBuilder_ == null) {
                if (!viewabilityRule.requiredMetrics_.isEmpty()) {
                    if (this.requiredMetrics_.isEmpty()) {
                        this.requiredMetrics_ = viewabilityRule.requiredMetrics_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureRequiredMetricsIsMutable();
                        this.requiredMetrics_.addAll(viewabilityRule.requiredMetrics_);
                    }
                    onChanged();
                }
            } else if (!viewabilityRule.requiredMetrics_.isEmpty()) {
                boolean zIsEmpty = this.requiredMetricsBuilder_.b.isEmpty();
                o7 o7Var = this.requiredMetricsBuilder_;
                if (zIsEmpty) {
                    o7 requiredMetricsFieldBuilder = null;
                    o7Var.a = null;
                    this.requiredMetricsBuilder_ = null;
                    this.requiredMetrics_ = viewabilityRule.requiredMetrics_;
                    this.bitField0_ &= -2;
                    if (y4.alwaysUseFieldBuilders) {
                        requiredMetricsFieldBuilder = getRequiredMetricsFieldBuilder();
                    }
                    this.requiredMetricsBuilder_ = requiredMetricsFieldBuilder;
                } else {
                    o7Var.a(viewabilityRule.requiredMetrics_);
                }
            }
            mergeUnknownFields(((y4) viewabilityRule).unknownFields);
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
        public ViewabilityRule mo250getDefaultInstanceForType() {
            return ViewabilityRule.getDefaultInstance();
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
            this.requiredMetrics_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public MetricRequirement.Builder addRequiredMetricsBuilder(int i) {
            return (MetricRequirement.Builder) getRequiredMetricsFieldBuilder().b(i, MetricRequirement.getDefaultInstance());
        }

        public Builder setMeasurement(Measurement measurement) {
            v7 v7Var = this.measurementBuilder_;
            if (v7Var == null) {
                measurement.getClass();
                this.measurement_ = measurement;
                onChanged();
                return this;
            }
            v7Var.h(measurement);
            return this;
        }

        public Builder addRequiredMetrics(int i, MetricRequirement metricRequirement) {
            o7 o7Var = this.requiredMetricsBuilder_;
            if (o7Var == null) {
                metricRequirement.getClass();
                ensureRequiredMetricsIsMutable();
                this.requiredMetrics_.add(i, metricRequirement);
                onChanged();
                return this;
            }
            o7Var.d(i, metricRequirement);
            return this;
        }

        public Builder setRequiredMetrics(int i, MetricRequirement metricRequirement) {
            o7 o7Var = this.requiredMetricsBuilder_;
            if (o7Var == null) {
                metricRequirement.getClass();
                ensureRequiredMetricsIsMutable();
                this.requiredMetrics_.set(i, metricRequirement);
                onChanged();
                return this;
            }
            o7Var.s(i, metricRequirement);
            return this;
        }

        public Builder addRequiredMetrics(MetricRequirement metricRequirement) {
            o7 o7Var = this.requiredMetricsBuilder_;
            if (o7Var == null) {
                metricRequirement.getClass();
                ensureRequiredMetricsIsMutable();
                this.requiredMetrics_.add(metricRequirement);
                onChanged();
                return this;
            }
            o7Var.e(metricRequirement);
            return this;
        }

        public Builder addRequiredMetrics(int i, MetricRequirement.Builder builder) {
            o7 o7Var = this.requiredMetricsBuilder_;
            if (o7Var == null) {
                ensureRequiredMetricsIsMutable();
                this.requiredMetrics_.add(i, builder.build());
                onChanged();
                return this;
            }
            o7Var.d(i, builder.build());
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof ViewabilityRule) {
                return mergeFrom((ViewabilityRule) message);
            }
            super.mergeFrom(message);
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
            ViewabilityRule viewabilityRule = null;
            try {
                try {
                    ViewabilityRule viewabilityRule2 = (ViewabilityRule) ViewabilityRule.PARSER.parsePartialFrom(rVar, o3Var);
                    if (viewabilityRule2 != null) {
                        mergeFrom(viewabilityRule2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    ViewabilityRule viewabilityRule3 = (ViewabilityRule) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        viewabilityRule = viewabilityRule3;
                        if (viewabilityRule != null) {
                            mergeFrom(viewabilityRule);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (viewabilityRule != null) {
                    mergeFrom(viewabilityRule);
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
        if (!(obj instanceof ViewabilityRule)) {
            return super.equals(obj);
        }
        ViewabilityRule viewabilityRule = (ViewabilityRule) obj;
        if (getEvent() == viewabilityRule.getEvent() && getBillable() == viewabilityRule.getBillable() && hasMeasurement() == viewabilityRule.hasMeasurement()) {
            return (!hasMeasurement() || getMeasurement().equals(viewabilityRule.getMeasurement())) && getRequiredMetricsList().equals(viewabilityRule.getRequiredMetricsList()) && this.unknownFields.equals(viewabilityRule.unknownFields);
        }
        return false;
    }

    public static ViewabilityRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityRule_descriptor;
    }

    public static Builder newBuilder(ViewabilityRule viewabilityRule) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(viewabilityRule);
    }

    public static ViewabilityRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ViewabilityRule) y4.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ViewabilityRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ViewabilityRule) PARSER.parseFrom(byteBuffer);
    }

    public static g7 parser() {
        return PARSER;
    }

    @Override // io.p071bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public boolean getBillable() {
        return this.billable_;
    }

    @Override // io.p071bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public int getEvent() {
        return this.event_;
    }

    @Override // io.p071bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public Measurement getMeasurement() {
        Measurement measurement = this.measurement_;
        return measurement == null ? Measurement.getDefaultInstance() : measurement;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public g7 getParserForType() {
        return PARSER;
    }

    @Override // io.p071bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public MetricRequirement getRequiredMetrics(int i) {
        return this.requiredMetrics_.get(i);
    }

    @Override // io.p071bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public int getRequiredMetricsCount() {
        return this.requiredMetrics_.size();
    }

    @Override // io.p071bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public List<MetricRequirement> getRequiredMetricsList() {
        return this.requiredMetrics_;
    }

    @Override // io.p071bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public MetricRequirementOrBuilder getRequiredMetricsOrBuilder(int i) {
        return this.requiredMetrics_.get(i);
    }

    @Override // io.p071bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public List<? extends MetricRequirementOrBuilder> getRequiredMetricsOrBuilderList() {
        return this.requiredMetrics_;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.event_;
        int iT = i2 != 0 ? w.t(1, i2) : 0;
        if (this.billable_) {
            iT += w.c(2);
        }
        if (this.measurement_ != null) {
            iT += w.o(3, getMeasurement());
        }
        for (int i3 = 0; i3 < this.requiredMetrics_.size(); i3++) {
            iT += w.o(5, this.requiredMetrics_.get(i3));
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iT;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final s8 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.p071bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public boolean hasMeasurement() {
        return this.measurement_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iC = l5.c(getBillable()) + ((((getEvent() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
        if (hasMeasurement()) {
            iC = pv1.c(iC, 37, 3, 53) + getMeasurement().hashCode();
        }
        if (getRequiredMetricsCount() > 0) {
            iC = pv1.c(iC, 37, 5, 53) + getRequiredMetricsList().hashCode();
        }
        int iHashCode = this.unknownFields.a.hashCode() + (iC * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.y4
    public w4 internalGetFieldAccessorTable() {
        w4 w4Var = SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityRule_fieldAccessorTable;
        w4Var.c(ViewabilityRule.class, Builder.class);
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
        return new ViewabilityRule();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(w wVar) throws IOException {
        int i = this.event_;
        if (i != 0) {
            wVar.T(1, i);
        }
        boolean z = this.billable_;
        if (z) {
            wVar.A(2, z);
        }
        if (this.measurement_ != null) {
            wVar.M(3, getMeasurement());
        }
        for (int i2 = 0; i2 < this.requiredMetrics_.size(); i2++) {
            wVar.M(5, this.requiredMetrics_.get(i2));
        }
        this.unknownFields.writeTo(wVar);
    }

    private ViewabilityRule(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
        Measurement.Builder builder;
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
                            if (iF != 16) {
                                if (iF != 26) {
                                    if (iF != 42) {
                                        if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                        }
                                    } else {
                                        if (!z2) {
                                            this.requiredMetrics_ = new ArrayList();
                                            z2 = true;
                                        }
                                        this.requiredMetrics_.add((MetricRequirement) rVar.v(MetricRequirement.parser(), o3Var));
                                    }
                                } else {
                                    Measurement measurement = this.measurement_;
                                    if (measurement != null) {
                                        builder = measurement.toBuilder();
                                    } else {
                                        builder = null;
                                    }
                                    Measurement measurement2 = (Measurement) rVar.v(Measurement.parser(), o3Var);
                                    this.measurement_ = measurement2;
                                    if (builder != null) {
                                        builder.mergeFrom(measurement2);
                                        this.measurement_ = builder.buildPartial();
                                    }
                                }
                            } else {
                                this.billable_ = rVar.l();
                            }
                        } else {
                            this.event_ = rVar.G();
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
                    this.requiredMetrics_ = Collections.unmodifiableList(this.requiredMetrics_);
                }
                this.unknownFields = p8VarB.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (z2) {
            this.requiredMetrics_ = Collections.unmodifiableList(this.requiredMetrics_);
        }
        this.unknownFields = p8VarB.build();
        makeExtensionsImmutable();
    }

    @Override // io.p071bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public MeasurementOrBuilder getMeasurementOrBuilder() {
        return getMeasurement();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public ViewabilityRule mo250getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static ViewabilityRule parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
        return (ViewabilityRule) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
    }

    public static ViewabilityRule parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
        return (ViewabilityRule) PARSER.parseFrom(byteBuffer, o3Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static ViewabilityRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ViewabilityRule) PARSER.parseFrom(byteString);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static ViewabilityRule parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
        return (ViewabilityRule) PARSER.parseFrom(byteString, o3Var);
    }

    public static ViewabilityRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ViewabilityRule) PARSER.parseFrom(bArr);
    }

    public static ViewabilityRule parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
        return (ViewabilityRule) PARSER.parseFrom(bArr, o3Var);
    }

    public static ViewabilityRule parseFrom(InputStream inputStream) throws IOException {
        return (ViewabilityRule) y4.parseWithIOException(PARSER, inputStream);
    }

    public static ViewabilityRule parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
        return (ViewabilityRule) y4.parseWithIOException(PARSER, inputStream, o3Var);
    }

    public static ViewabilityRule parseFrom(r rVar) throws IOException {
        return (ViewabilityRule) y4.parseWithIOException(PARSER, rVar);
    }

    public static ViewabilityRule parseFrom(r rVar, o3 o3Var) throws IOException {
        return (ViewabilityRule) y4.parseWithIOException(PARSER, rVar, o3Var);
    }

    private ViewabilityRule(g4 g4Var) {
        super(g4Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    private ViewabilityRule() {
        this.memoizedIsInitialized = (byte) -1;
        this.requiredMetrics_ = Collections.EMPTY_LIST;
    }
}
