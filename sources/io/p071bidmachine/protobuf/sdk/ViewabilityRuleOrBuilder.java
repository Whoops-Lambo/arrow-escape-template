package io.p071bidmachine.protobuf.sdk;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface ViewabilityRuleOrBuilder extends MessageOrBuilder {
    boolean getBillable();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo250getDefaultInstanceForType();

    int getEvent();

    Measurement getMeasurement();

    MeasurementOrBuilder getMeasurementOrBuilder();

    MetricRequirement getRequiredMetrics(int i);

    int getRequiredMetricsCount();

    List<MetricRequirement> getRequiredMetricsList();

    MetricRequirementOrBuilder getRequiredMetricsOrBuilder(int i);

    List<? extends MetricRequirementOrBuilder> getRequiredMetricsOrBuilderList();

    boolean hasMeasurement();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
