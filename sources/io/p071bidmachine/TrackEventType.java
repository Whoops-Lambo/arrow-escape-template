package io.p071bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.nj;
import io.p071bidmachine.protobuf.EventTypeExtended;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public enum TrackEventType {
    GetBidToken(EventTypeExtended.EVENT_TYPE_EXTENDED_TOKEN_GENERATED_VALUE),
    InitLoading(506),
    AuctionRequest(507),
    AuctionRequestCancel(508),
    AuctionRequestExpired(509),
    AuctionRequestDestroy(510),
    BrokenCreativeDetector(EventTypeExtended.EVENT_TYPE_EXTENDED_BROKEN_CREATIVE_DETECTOR_VALUE),
    EngagedClick(1201),
    Load(500),
    FillAd(512),
    Impression(502),
    Show(501),
    Click(503),
    Close(504),
    Expired(EventTypeExtended.EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE),
    Destroy(505),
    Error(1000),
    TrackingError(1001),
    HeaderBiddingNetworksPrepare(703),
    HeaderBiddingNetworkInitialize(701),
    HeaderBiddingNetworkPrepare(702),
    MediationWin(EventTypeExtended.EVENT_TYPE_EXTENDED_CUSTOM_WIN_VALUE),
    MediationLoss(EventTypeExtended.EVENT_TYPE_EXTENDED_CUSTOM_LOSS_VALUE),
    WaterfallLoadStart(EventTypeExtended.EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE),
    WaterfallLoadFinish(EventTypeExtended.EVENT_TYPE_EXTENDED_WATERFALL_FINISHED_VALUE),
    AdUnitLoadStart(EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_LOADED_VALUE),
    AdUnitLoadFinish(EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_FINISHED_VALUE),
    AdUnitExpired(EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_EXPIRED_VALUE),
    AdUnitCheapestDequeued(EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_INVALIDATED_VALUE),
    AdUnitShown(EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_IMPRESSION_VALUE),
    AdUnitWin(EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_WIN_VALUE),
    AdUnitLoss(EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_LOSS_VALUE),
    AdUnitPaidEvent(EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_PAID_VALUE),
    ImpressionOpportunity(EventTypeExtended.EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE),
    CrashReport(EventTypeExtended.EVENT_TYPE_SDK_CRASH_VALUE),
    AnrReport(1301);

    private final int actionValue;

    public int getActionValue() {
        return this.actionValue;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name());
        sb.append(" (");
        return nj.l(this.actionValue, ")", sb);
    }

    TrackEventType(int i) {
        this.actionValue = i;
    }

    @Nullable
    public static TrackEventType fromNumber(int i) {
        for (TrackEventType trackEventType : values()) {
            if (trackEventType.actionValue == i) {
                return trackEventType;
            }
        }
        return null;
    }
}
