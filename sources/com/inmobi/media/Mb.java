package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public enum Mb {
    LPClickStart("clickStartCalled", "sdk_click_detected", 0),
    LPStartFailed("landingsStartFailed", "valid_click_failed", 1),
    LPStartSuccess("landingsStartSuccess", "browser_open_success", 2),
    LPBrowserOpenFailed("browserOpenFailed", "browser_open_failed", 2),
    LPPageStart("landingsPageStarted", "on_page_started", 3),
    LPCompleteSuccess("landingsCompleteSuccess", "landing_success", 4),
    LPCompleteFailed("landingsCompleteFailed", "landing_failed", 4);

    public final String a;
    public final String b;
    public final int c;

    Mb(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }
}
