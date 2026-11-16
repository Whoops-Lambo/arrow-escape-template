package com.unity3d.mediation;

import com.ironsource.C4922pb;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class LevelPlayPrivacySettings {

    @NotNull
    public static final LevelPlayPrivacySettings INSTANCE = new LevelPlayPrivacySettings();

    public static final void setCCPA(boolean z) {
        IronLog.API.info("LevelPlayPrivacySettings.setCCPA() value: " + z);
        C4922pb.d.a().a(z);
    }

    public static final void setCOPPA(boolean z) {
        IronLog.API.info("LevelPlayPrivacySettings.setCOPPA() value: " + z);
        C4922pb.d.a().b(z);
    }

    public static final void setGDPRConsent(boolean z) {
        IronLog.API.info("LevelPlayPrivacySettings.setGDPRConsent() consent: " + z);
        C4922pb.d.a().c(z);
    }

    private LevelPlayPrivacySettings() {
    }

    public static final void setGDPRConsents(@NotNull Map<String, Boolean> map) {
        map.getClass();
        IronLog.API.info("LevelPlayPrivacySettings.setGDPRConsents() networkConsents: " + map);
        C4922pb.d.a().a(map);
    }
}
