package com.bytedance.sdk.component.adexpress.dynamic.uq;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.nj;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ct {
    public static final Map<String, Integer> kgy;
    private String ahm;
    private noq ct;
    private String noq;
    private String rz;
    private noq uq;

    static {
        HashMap map = new HashMap();
        kgy = map;
        map.put("root", 8);
        map.put("footer", 6);
        map.put("empty", 6);
        map.put("title", 0);
        map.put("subtitle", 0);
        map.put("source", 0);
        map.put("score-count", 0);
        map.put("text_star", 0);
        nj.C(map, "text", 0, 17, "tag-group");
        map.put("app-version", 0);
        nj.C(map, "development-name", 0, 23, "privacy-detail");
        map.put("image", 1);
        map.put("image-wide", 1);
        map.put("image-square", 1);
        map.put("image-long", 1);
        map.put("image-splash", 1);
        map.put("image-cover", 1);
        map.put("app-icon", 1);
        nj.C(map, "icon-download", 1, 4, "logoad");
        nj.w(5, map, "logounion", 9, "logo-union");
        map.put("dislike", 3);
        map.put(CampaignEx.JSON_NATIVE_VIDEO_CLOSE, 3);
        map.put("close-fill", 3);
        nj.w(22, map, "webview-close", 12, "feedback-dislike");
        map.put("button", 2);
        map.put("downloadWithIcon", 2);
        map.put("downloadButton", 2);
        map.put("fillButton", 2);
        map.put("laceButton", 2);
        map.put("cardButton", 2);
        map.put("colourMixtureButton", 2);
        map.put("arrowButton", 1);
        map.put("download-progress-button", 2);
        map.put("vessel", 6);
        map.put("image-group", 6);
        nj.C(map, "custom-component-vessel", 6, 24, "carousel");
        nj.w(26, map, "carousel-vessel", 25, "leisure-interact");
        map.put("video-hd", 7);
        map.put("video", 7);
        map.put("video-vd", 7);
        nj.C(map, "video-sq", 7, 10, "muted");
        nj.w(11, map, "star", 19, "skip-countdowns");
        map.put("skip-with-countdowns-skip-btn", 21);
        map.put("skip-with-countdowns-video-countdown", 13);
        nj.w(20, map, "skip-with-countdowns-skip-countdown", 14, "skip-with-time");
        nj.C(map, "skip-with-time-countdown", 13, 15, "skip-with-time-skip-btn");
        map.put("skip", 27);
        map.put("timedown", 13);
        map.put("icon", 16);
        map.put("scoreCountWithIcon", 6);
        map.put("split-line", 18);
        map.put("creative-playable-bait", 0);
        nj.C(map, "score-count-type-2", 0, 28, "lottie");
    }

    public String ahm() {
        return this.ahm;
    }

    public noq ct() {
        return this.uq;
    }

    public int kgy() {
        if (TextUtils.isEmpty(this.ahm)) {
            return 0;
        }
        if (this.ahm.equals("logo")) {
            String str = this.ahm + this.rz;
            this.ahm = str;
            if (str.contains("logoad")) {
                return 4;
            }
            if (this.ahm.contains("logounion")) {
                return 5;
            }
        }
        Map<String, Integer> map = kgy;
        if (map.get(this.ahm) != null) {
            return map.get(this.ahm).intValue();
        }
        return -1;
    }

    public int noq() {
        return this.uq.qi();
    }

    public String rz() {
        return this.rz;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DynamicLayoutBrick{type='");
        sb.append(this.ahm);
        sb.append("', data='");
        sb.append(this.rz);
        sb.append("', value=");
        sb.append(this.uq);
        sb.append(", themeValue=");
        sb.append(this.ct);
        sb.append(", dataExtraInfo='");
        return nj.q(sb, this.noq, "'}");
    }

    public String uq() {
        return this.noq;
    }

    public noq yo() {
        return this.ct;
    }

    public void ahm(String str) {
        this.rz = str;
    }

    public void rz(String str) {
        this.noq = str;
    }

    public void ahm(noq noqVar) {
        this.ct = noqVar;
    }

    public void kgy(String str) {
        this.ahm = str;
    }

    public void kgy(noq noqVar) {
        this.uq = noqVar;
    }
}
