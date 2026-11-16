package io.p071bidmachine.tracking;

import io.p071bidmachine.AdsType;
import io.p071bidmachine.TrackEventType;
import io.p071bidmachine.protobuf.AdExtension;
import io.p071bidmachine.utils.a;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public interface e {
    void clearEvent(TrackEventType trackEventType);

    void eventFinish(TrackEventType trackEventType, AdsType adsType, a aVar, a aVar2);

    void eventStart(TrackEventType trackEventType);

    void eventStart(TrackEventType trackEventType, d dVar);

    AdExtension.EventConfiguration getEventConfiguration();

    Object getTrackingKey();

    List getTrackingUrls(TrackEventType trackEventType);
}
