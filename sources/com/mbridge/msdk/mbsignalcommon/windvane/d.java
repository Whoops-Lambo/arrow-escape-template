package com.mbridge.msdk.mbsignalcommon.windvane;

import androidx.media3.common.MimeTypes;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public enum d {
    JS("js", "application/x-javascript"),
    CSS("css", "text/css"),
    JPG("jpg", "image/jpeg"),
    JPEG("jpep", "image/jpeg"),
    PNG("png", MimeTypes.IMAGE_PNG),
    WEBP("webp", MimeTypes.IMAGE_WEBP),
    GIF("gif", "image/gif"),
    HTM("htm", "text/html"),
    HTML(CreativeInfo.al, "text/html");

    private String a;
    private String b;

    public String f() {
        return this.b;
    }

    public String g() {
        return this.a;
    }

    d(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
