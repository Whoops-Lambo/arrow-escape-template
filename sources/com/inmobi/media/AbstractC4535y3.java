package com.inmobi.media;

import android.content.ContentValues;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.y3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4535y3 {
    public static final ContentValues a(C4371s3 c4371s3) {
        String string;
        c4371s3.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(c4371s3.a));
        contentValues.put("url", c4371s3.b);
        contentValues.put("pending_attempts", Integer.valueOf(c4371s3.f));
        contentValues.put("ts", Long.valueOf(c4371s3.g));
        contentValues.put("created_ts", Long.valueOf(c4371s3.h));
        contentValues.put("follow_redirect", Boolean.valueOf(c4371s3.d));
        contentValues.put("ping_in_webview", Boolean.valueOf(c4371s3.e));
        Map map = c4371s3.c;
        if (map != null && !map.isEmpty()) {
            try {
                Map map2 = c4371s3.c;
                map2.getClass();
                string = new JSONObject(map2).toString();
            } catch (Exception unused) {
                string = "";
            }
            string.getClass();
            contentValues.put("track_extras", string);
        }
        return contentValues;
    }
}
