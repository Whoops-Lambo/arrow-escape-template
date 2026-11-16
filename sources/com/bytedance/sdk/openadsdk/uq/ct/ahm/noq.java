package com.bytedance.sdk.openadsdk.uq.ct.ahm;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.component.utils.sx;
import defpackage.zg3;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class noq extends rz {
    private long ahm;
    private final zg3 kgy;
    private long rz;
    private int uq = 0;

    public void ahm(long j) {
        this.rz = j;
    }

    @Override // com.bytedance.sdk.openadsdk.uq.ct.ahm.rz
    public void kgy(kgy kgyVar) {
        int integer;
        super.kgy(kgyVar);
        JSONObject jSONObjectUq = kgyVar.uq();
        File file = new File(this.kgy.ct(), this.kgy.xh());
        if (file.exists()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            String absolutePath = file.getAbsolutePath();
            MediaExtractor mediaExtractor = null;
            try {
                MediaExtractor mediaExtractor2 = new MediaExtractor();
                try {
                    mediaExtractor2.setDataSource(absolutePath);
                    int trackCount = mediaExtractor2.getTrackCount();
                    int i = 0;
                    while (true) {
                        if (i >= trackCount) {
                            mediaExtractor2.release();
                            integer = -1;
                            break;
                        }
                        MediaFormat trackFormat = mediaExtractor2.getTrackFormat(i);
                        String string = trackFormat.getString("mime");
                        if (string != null && ("video/avc".equals(string) || "video/hevc".equals(string))) {
                            if (trackFormat.containsKey(AppLovinEventTypes.USER_COMPLETED_LEVEL)) {
                                integer = trackFormat.getInteger(AppLovinEventTypes.USER_COMPLETED_LEVEL);
                                mediaExtractor2.release();
                                break;
                            }
                            integer = -1;
                            break;
                        }
                        i++;
                    }
                } catch (Throwable th) {
                    th = th;
                    mediaExtractor = mediaExtractor2;
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOUE7Un0pRD204=", "becpkAyYbMSPTtJomBis", "XOs5uDPoRcKWT9s=", 179);
                    if (mediaExtractor != null) {
                        mediaExtractor.release();
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                jSONObjectUq.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, integer);
                jSONObjectUq.put("level_cost_time", SystemClock.elapsedRealtime() - jElapsedRealtime);
            } catch (JSONException e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZPoDucB7lmiY1F01iA", "fesokSyqbNWtRdNYgA==", "WesrmhG5W8KQRcVJqQelJk8=", 74);
            }
        }
    }

    public noq(zg3 zg3Var) {
        this.kgy = zg3Var;
    }

    public void kgy(int i) {
        this.uq = i;
    }

    @Override // com.bytedance.sdk.openadsdk.uq.ct.ahm.rz
    public void kgy(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("total_duration", this.ahm);
            jSONObject.put("buffers_time", this.rz);
            jSONObject.put("video_backup", this.uq);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZPoDucB7lmiY1F01iA", "fesokSyqbNWtRdNYgA==", "WuopoQyWesiOZdVXiRK0", 56);
            sx.rz("FeedOverModel", th.getMessage());
        }
    }

    public void kgy(long j) {
        this.ahm = j;
    }
}
