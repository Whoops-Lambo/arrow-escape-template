package com.fyber.inneractive.sdk.mraid;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public enum k {
    CLOSE(CampaignEx.JSON_NATIVE_VIDEO_CLOSE),
    EXPAND("expand"),
    USECUSTOMCLOSE("usecustomclose"),
    OPEN(TtmlNode.TEXT_EMPHASIS_MARK_OPEN),
    RESIZE("resize"),
    GET_RESIZE_PROPERTIES("getResizeProperties"),
    SET_RESIZE_PROPERTIES("setResizeProperties"),
    SET_ORIENTATION_PROPERTIES("setOrientationProperties"),
    PLAY_VIDEO("playVideo"),
    STORE_PICTURE("storePicture"),
    GET_CURRENT_POSITION("getCurrentPosition"),
    GET_DEFAULT_POSITION("getDefaultPosition"),
    GET_MAX_SIZE("getMaxSize"),
    GET_SCREEN_SIZE("getScreenSize"),
    CREATE_CALENDAR_EVENT("createCalendarEvent"),
    UNSPECIFIED("");

    private String mCommand;

    k(String str) {
        this.mCommand = str;
    }

    public static k a(String str) {
        for (k kVar : values()) {
            if (kVar.mCommand.equals(str)) {
                return kVar;
            }
        }
        return UNSPECIFIED;
    }

    public final String a() {
        return this.mCommand;
    }
}
