package com.facebook.internal;

import android.R;
import com.singular.sdk.internal.Constants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public enum z {
    Unknown(-1),
    Core(0),
    AppEvents(65536),
    CodelessEvents(65792),
    CloudBridge(67584),
    RestrictiveDataFiltering(66048),
    AAM(66304),
    PrivacyProtection(66560),
    SuggestedEvents(66561),
    IntelligentIntegrity(66562),
    ModelRequest(66563),
    ProtectedMode(66564),
    MACARuleMatching(66565),
    BlocklistEvents(66566),
    FilterRedactedEvents(66567),
    FilterSensitiveParams(66568),
    StdParamEnforcement(R.attr.trimPathEnd),
    BannedParamFiltering(R.attr.trimPathOffset),
    VVP(66571),
    EventDeactivation(66816),
    OnDeviceEventProcessing(67072),
    OnDevicePostInstallEventProcessing(67073),
    IapLogging(67328),
    IapLoggingLib2(67329),
    IapLoggingLib5To7(67330),
    AndroidManualImplicitPurchaseDedupe(67331),
    AndroidManualImplicitSubsDedupe(67332),
    AndroidIAPSubscriptionAutoLogging(67333),
    Instrument(131072),
    CrashReport(131328),
    CrashShield(131329),
    ThreadCheck(131330),
    ErrorReport(131584),
    AnrReport(131840),
    Monitoring(196608),
    ServiceUpdateCompliance(196864),
    /* JADX INFO: Fake field, exist only in values array */
    Login(Constants.REFERRER_LINK_MAX_RESPONSE_CHARS),
    /* JADX INFO: Fake field, exist only in values array */
    Elora(327680),
    GPSARATriggers(393216),
    GPSPACAProcessing(458752),
    GPSTopicsObservation(524288),
    ReferrerForDeepLink(589824),
    /* JADX INFO: Fake field, exist only in values array */
    Login(16777216),
    ChromeCustomTabsPrefetching(R.attr.theme),
    IgnoreAppSwitchToLoggedOut(R.id.background),
    BypassAppSwitch(R.style.Animation),
    /* JADX INFO: Fake field, exist only in values array */
    LoginSSO(R.string.cancel),
    /* JADX INFO: Fake field, exist only in values array */
    Share(33554432);

    public final int a;

    @Override // java.lang.Enum
    public final String toString() {
        switch (y.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return "CoreKit";
            case 2:
                return "AppEvents";
            case 3:
                return "CodelessEvents";
            case 4:
                return "RestrictiveDataFiltering";
            case 5:
                return "Instrument";
            case 6:
                return "CrashReport";
            case 7:
                return "CrashShield";
            case 8:
                return "ThreadCheck";
            case 9:
                return "ErrorReport";
            case 10:
                return "AnrReport";
            case 11:
                return "AAM";
            case 12:
                return "AppEventsCloudbridge";
            case 13:
                return "PrivacyProtection";
            case 14:
                return "SuggestedEvents";
            case 15:
                return "IntelligentIntegrity";
            case 16:
                return "StdParamEnforcement";
            case 17:
                return "ProtectedMode";
            case 18:
                return "BannedParamFiltering";
            case 19:
                return "MACARuleMatching";
            case 20:
                return "BlocklistEvents";
            case 21:
                return "FilterRedactedEvents";
            case 22:
                return "FilterSensitiveParams";
            case 23:
                return "ModelRequest";
            case 24:
                return "EventDeactivation";
            case 25:
                return "OnDeviceEventProcessing";
            case 26:
                return "OnDevicePostInstallEventProcessing";
            case 27:
                return "IAPLogging";
            case 28:
                return "IAPLoggingLib2";
            case 29:
                return "IAPLoggingLib5To7";
            case 30:
                return "AndroidManualImplicitPurchaseDedupe";
            case 31:
                return "AndroidManualImplicitSubsDedupe";
            case 32:
                return "AndroidIAPSubscriptionAutoLogging";
            case 33:
                return "Monitoring";
            case 34:
                return "Megatron";
            case 35:
                return "Elora";
            case 36:
                return "GPSARATriggers";
            case 37:
                return "GPSPACAProcessing";
            case 38:
                return "GPSTopicsObservation";
            case 39:
                return "VVP";
            case 40:
                return "ReferrerForDeepLink";
            case 41:
                return "ServiceUpdateCompliance";
            case 42:
                return "LoginKit";
            case 43:
                return "ChromeCustomTabsPrefetching";
            case 44:
                return "IgnoreAppSwitchToLoggedOut";
            case 45:
                return "BypassAppSwitch";
            case 46:
                return "LoginSSO";
            case 47:
                return "ShareKit";
            default:
                return "unknown";
        }
    }

    z(int i) {
        this.a = i;
    }
}
