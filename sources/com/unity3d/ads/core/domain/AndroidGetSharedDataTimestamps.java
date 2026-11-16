package com.unity3d.ads.core.domain;

import android.os.SystemClock;
import com.unity3d.ads.core.data.datasource.ForegroundDurationReader;
import com.unity3d.ads.core.extensions.TimestampExtensionsKt;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.v1.TimestampsKt;
import gatewayprotocol.v1.TimestampsOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetSharedDataTimestamps;", "Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;", "foregroundDurationReader", "Lcom/unity3d/ads/core/data/datasource/ForegroundDurationReader;", "<init>", "(Lcom/unity3d/ads/core/data/datasource/ForegroundDurationReader;)V", "invoke", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidGetSharedDataTimestamps implements GetSharedDataTimestamps {

    @NotNull
    private final ForegroundDurationReader foregroundDurationReader;

    @Override // com.unity3d.ads.core.domain.GetSharedDataTimestamps
    @NotNull
    public TimestampsOuterClass.Timestamps invoke() {
        TimestampsKt.Dsl.Companion companion = TimestampsKt.Dsl.INSTANCE;
        TimestampsOuterClass.Timestamps.Builder builderNewBuilder = TimestampsOuterClass.Timestamps.newBuilder();
        builderNewBuilder.getClass();
        TimestampsKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setTimestamp(TimestampExtensionsKt.fromMillis(System.currentTimeMillis()));
        dsl_create.setSessionTimestamp(SystemClock.elapsedRealtime() - SdkProperties.getInitializationTime());
        dsl_create.setSessionDurationInForeground(this.foregroundDurationReader.getSessionDurationInForegroundMs());
        return dsl_create._build();
    }

    public AndroidGetSharedDataTimestamps(@NotNull ForegroundDurationReader foregroundDurationReader) {
        foregroundDurationReader.getClass();
        this.foregroundDurationReader = foregroundDurationReader;
    }
}
