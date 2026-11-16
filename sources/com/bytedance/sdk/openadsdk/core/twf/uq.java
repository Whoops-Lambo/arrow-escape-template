package com.bytedance.sdk.openadsdk.core.twf;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.ioy;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.UnityAdsConstants;
import defpackage.bb3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class uq {
    private String ay;
    private long dg;
    private boolean fpp;
    private String gm;
    private boolean sx;
    private boolean um;
    private boolean vs;
    private ioy xh;
    private final AtomicBoolean twf = new AtomicBoolean(false);
    private final AtomicBoolean kus = new AtomicBoolean(false);
    public List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> kgy = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> ahm = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> rz = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> uq = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> ct = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> noq = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> yo = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> fi = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> gf = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> ra = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.twf.ahm.ahm> nu = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.twf.ahm.kgy> at = new ArrayList();

    public void ahm(long j) {
        if (!kgy(j, this.rz, null, this.vs ? null : new com.bytedance.sdk.openadsdk.core.twf.ahm.rz.ahm(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, this.xh, j)) || this.vs) {
            return;
        }
        com.bytedance.sdk.openadsdk.uq.rz.ahm(this.xh, this.gm, "track_pause", (JSONObject) null);
    }

    public void at(List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> list) {
        this.ra.addAll(list);
    }

    public void ct(long j) {
        if (this.kus.compareAndSet(false, true)) {
            kgy(j, this.noq, (com.bytedance.sdk.openadsdk.core.twf.kgy.kgy) null);
        }
    }

    public void fi(long j) {
        if (!kgy(j, this.gf, null, this.vs ? null : new com.bytedance.sdk.openadsdk.core.twf.ahm.rz.ahm(CampaignEx.JSON_NATIVE_VIDEO_MUTE, this.xh, j)) || this.vs) {
            return;
        }
        com.bytedance.sdk.openadsdk.uq.rz.ahm(this.xh, this.gm, "track_mute", (JSONObject) null);
    }

    public void gf(long j) {
        if (!kgy(j, this.ra, null, this.vs ? null : new com.bytedance.sdk.openadsdk.core.twf.ahm.rz.ahm(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE, this.xh, j)) || this.vs) {
            return;
        }
        com.bytedance.sdk.openadsdk.uq.rz.ahm(this.xh, this.gm, "track_unmute", (JSONObject) null);
    }

    public void noq(long j) {
        if (!kgy(j, this.yo, null, this.vs ? null : new com.bytedance.sdk.openadsdk.core.twf.ahm.rz.ahm("skip", this.xh)) || this.vs) {
            return;
        }
        com.bytedance.sdk.openadsdk.uq.rz.ahm(this.xh, this.gm, "track_skip", (JSONObject) null);
    }

    public void nu(List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> list) {
        this.gf.addAll(list);
    }

    public void ra(List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> list) {
        this.kgy.addAll(list);
    }

    public void rz(long j) {
        if (!kgy(j, this.uq, null, this.vs ? null : new com.bytedance.sdk.openadsdk.core.twf.ahm.rz.ahm(CampaignEx.JSON_NATIVE_VIDEO_RESUME, this.xh, j)) || this.vs) {
            return;
        }
        com.bytedance.sdk.openadsdk.uq.rz.ahm(this.xh, this.gm, "track_resume", (JSONObject) null);
    }

    public void uq(long j) {
        if (!kgy(j, this.ct, null, new com.bytedance.sdk.openadsdk.core.twf.ahm.rz.ahm(this.vs ? "video_progress" : CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, this.xh, 1.0f)) || this.vs) {
            return;
        }
        com.bytedance.sdk.openadsdk.uq.rz.ahm(this.xh, this.gm, "track_complete", (JSONObject) null);
    }

    public void yo(long j) {
        if (!kgy(j, this.fi, null, new com.bytedance.sdk.openadsdk.core.twf.ahm.rz.ahm(this.vs ? "click" : "clickTracking", this.xh)) || this.vs) {
            return;
        }
        com.bytedance.sdk.openadsdk.uq.rz.ahm(this.xh, this.gm, "track_video_click", (JSONObject) null);
    }

    public void kgy(long j, long j2, noq noqVar) {
        com.bytedance.sdk.openadsdk.core.twf.ahm.rz.ahm ahmVar;
        if (System.currentTimeMillis() - this.dg >= 1000 && j >= 0 && j2 > 0) {
            this.dg = System.currentTimeMillis();
            float f = j / j2;
            List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> listKgy = kgy(j, f);
            float f2 = 0.25f;
            if (f >= 0.25f && !this.um) {
                kgy("firstQuartile");
                this.um = true;
                if (noqVar != null) {
                    kgy(noqVar, 6);
                }
                if (!this.vs) {
                    ahmVar = new com.bytedance.sdk.openadsdk.core.twf.ahm.rz.ahm("firstQuartile", this.xh, 0.25f);
                    f = f2;
                }
                f = f2;
                ahmVar = null;
            } else {
                f2 = 0.5f;
                if (f >= 0.5f && !this.fpp) {
                    kgy(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
                    this.fpp = true;
                    if (noqVar != null) {
                        kgy(noqVar, 7);
                    }
                    if (!this.vs) {
                        ahmVar = new com.bytedance.sdk.openadsdk.core.twf.ahm.rz.ahm(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT, this.xh, 0.5f);
                        f = f2;
                    }
                    f = f2;
                    ahmVar = null;
                } else {
                    f2 = 0.75f;
                    if (f < 0.75f || this.sx) {
                        ahmVar = null;
                    } else {
                        kgy("thirdQuartile");
                        this.sx = true;
                        if (noqVar != null) {
                            kgy(noqVar, 8);
                        }
                        if (!this.vs) {
                            ahmVar = new com.bytedance.sdk.openadsdk.core.twf.ahm.rz.ahm("thirdQuartile", this.xh, 0.75f);
                            f = f2;
                        }
                        f = f2;
                        ahmVar = null;
                    }
                }
            }
            if (f < 0.03f) {
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            if (!this.vs && !listKgy.isEmpty()) {
                com.bytedance.sdk.openadsdk.core.twf.ahm.rz rzVar = listKgy.get(0);
                if ((rzVar instanceof com.bytedance.sdk.openadsdk.core.twf.ahm.kgy) && ((com.bytedance.sdk.openadsdk.core.twf.ahm.kgy) rzVar).kgy() == 0) {
                    com.bytedance.sdk.openadsdk.uq.rz.ahm(this.xh, this.gm, "track_start", (JSONObject) null);
                    ahmVar = new com.bytedance.sdk.openadsdk.core.twf.ahm.rz.ahm("start", this.xh, f);
                }
            }
            if (!listKgy.isEmpty()) {
                if (ahmVar == null) {
                    ahmVar = new com.bytedance.sdk.openadsdk.core.twf.ahm.rz.ahm("video_progress", this.xh, f);
                }
                kgy(j, listKgy, null, ahmVar);
            }
        }
    }

    public void ct(List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> list) {
        this.noq.addAll(list);
    }

    public void noq(List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> list) {
        this.yo.addAll(list);
    }

    public void yo(List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> list) {
        this.fi.addAll(list);
    }

    public void ahm(List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> list) {
        this.rz.addAll(list);
    }

    public void fi(List<com.bytedance.sdk.openadsdk.core.twf.ahm.ahm> list) {
        this.nu.addAll(list);
        Collections.sort(this.nu);
    }

    public void gf(List<com.bytedance.sdk.openadsdk.core.twf.ahm.kgy> list) {
        this.at.addAll(list);
        Collections.sort(this.at);
    }

    public void rz(List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> list) {
        this.uq.addAll(list);
    }

    public void uq(List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> list) {
        this.ct.addAll(list);
    }

    public void kgy(long j) {
        if (this.twf.compareAndSet(false, true)) {
            if (!kgy(j, this.ahm, null, new com.bytedance.sdk.openadsdk.core.twf.ahm.rz.ahm(this.vs ? "show_impression" : "impression", this.xh)) || this.vs) {
                return;
            }
            com.bytedance.sdk.openadsdk.uq.rz.ahm(this.xh, this.gm, "track_impression", (JSONObject) null);
        }
    }

    public void kgy(com.bytedance.sdk.openadsdk.core.twf.kgy.kgy kgyVar) {
        if (!kgy(-1L, this.kgy, kgyVar, this.vs ? null : new com.bytedance.sdk.openadsdk.core.twf.ahm.rz.ahm("error", this.xh, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) || this.vs) {
            return;
        }
        com.bytedance.sdk.openadsdk.uq.rz.ahm(this.xh, this.gm, "track_error", (JSONObject) null);
    }

    public void kgy(int i, long j, long j2) {
        if (System.currentTimeMillis() - this.dg < 1000) {
            return;
        }
        this.dg = System.currentTimeMillis();
        float f = j / j2;
        List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> listKgy = kgy(j, f);
        com.bytedance.sdk.openadsdk.core.twf.ahm.rz.ahm ahmVar = null;
        if (i != 6) {
            if (i == 7) {
                kgy(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
                this.fpp = true;
                f = 0.5f;
                if (!this.vs) {
                    ahmVar = new com.bytedance.sdk.openadsdk.core.twf.ahm.rz.ahm(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT, this.xh, 0.5f);
                }
            } else if (i != 8) {
                if (i == 15 && (listKgy.get(0) instanceof com.bytedance.sdk.openadsdk.core.twf.ahm.kgy)) {
                    com.bytedance.sdk.openadsdk.uq.rz.ahm(this.xh, this.gm, "track_start", (JSONObject) null);
                    ahmVar = new com.bytedance.sdk.openadsdk.core.twf.ahm.rz.ahm("start", this.xh, f);
                }
            } else {
                kgy("thirdQuartile");
                this.sx = true;
                f = 0.75f;
                if (!this.vs) {
                    ahmVar = new com.bytedance.sdk.openadsdk.core.twf.ahm.rz.ahm("thirdQuartile", this.xh, 0.75f);
                }
            }
        } else if (!this.um) {
            kgy("firstQuartile");
            this.um = true;
            f = 0.25f;
            if (!this.vs) {
                ahmVar = new com.bytedance.sdk.openadsdk.core.twf.ahm.rz.ahm("firstQuartile", this.xh, 0.25f);
            }
        }
        if (listKgy.isEmpty()) {
            return;
        }
        if (ahmVar == null) {
            ahmVar = new com.bytedance.sdk.openadsdk.core.twf.ahm.rz.ahm("video_progress", this.xh, f);
        }
        kgy(j, listKgy, null, ahmVar);
    }

    private void kgy(final noq noqVar, final int i) {
        com.bytedance.sdk.component.utils.gf.ahm().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.twf.uq.1
            @Override // java.lang.Runnable
            public void run() {
                noq noqVar2 = noqVar;
                if (noqVar2 != null) {
                    noqVar2.kgy(i);
                }
            }
        });
    }

    private void kgy(String str) {
        try {
            if (this.vs) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event", str);
                com.bytedance.sdk.openadsdk.uq.rz.ahm(this.xh, this.gm, "vast_play_track", jSONObject);
            } else if ("firstQuartile".equals(str)) {
                com.bytedance.sdk.openadsdk.uq.rz.ahm(this.xh, this.gm, "track_first_quartile", (JSONObject) null);
            } else if (CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT.equals(str)) {
                com.bytedance.sdk.openadsdk.uq.rz.ahm(this.xh, this.gm, "track_midpoint", (JSONObject) null);
            } else if ("thirdQuartile".equals(str)) {
                com.bytedance.sdk.openadsdk.uq.rz.ahm(this.xh, this.gm, "track_third_quartile", (JSONObject) null);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+CyGFw==", "becpkAyIe8aDQdJPnw==", "Ses9mhGoT9WBScNUgx+hJA==", 323);
        }
    }

    private boolean kgy(long j, List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> list, com.bytedance.sdk.openadsdk.core.twf.kgy.kgy kgyVar, com.bytedance.sdk.openadsdk.core.twf.ahm.rz.ahm ahmVar) {
        bb3 bb3VarJw;
        ioy ioyVar = this.xh;
        String str = null;
        if (ioyVar != null && (bb3VarJw = ioyVar.jw()) != null) {
            str = bb3VarJw.g;
        }
        return com.bytedance.sdk.openadsdk.core.twf.ahm.rz.kgy(this.xh, list, kgyVar, j, str, ahmVar, kgy());
    }

    private String kgy() {
        if (this.ay == null) {
            this.ay = UUID.randomUUID().toString();
        }
        return this.ay;
    }

    private boolean kgy(long j, List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> list, com.bytedance.sdk.openadsdk.core.twf.kgy.kgy kgyVar) {
        return kgy(j, list, kgyVar, null);
    }

    public List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> kgy(long j, float f) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.nu.size(); i++) {
            com.bytedance.sdk.openadsdk.core.twf.ahm.ahm ahmVar = this.nu.get(i);
            if (ahmVar.kgy(f)) {
                arrayList.add(ahmVar);
            }
        }
        for (int i2 = 0; i2 < this.at.size(); i2++) {
            com.bytedance.sdk.openadsdk.core.twf.ahm.kgy kgyVar = this.at.get(i2);
            if (kgyVar.kgy(j)) {
                arrayList.add(kgyVar);
            }
        }
        return arrayList;
    }

    public void kgy(List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> list) {
        this.ahm.addAll(list);
    }

    public void kgy(JSONObject jSONObject) {
        ra(com.bytedance.sdk.openadsdk.core.twf.ahm.rz.kgy(jSONObject.optJSONArray("errorTrackers")));
        kgy(com.bytedance.sdk.openadsdk.core.twf.ahm.rz.kgy(jSONObject.optJSONArray("impressionTrackers")));
        ahm(com.bytedance.sdk.openadsdk.core.twf.ahm.rz.kgy(jSONObject.optJSONArray("pauseTrackers"), true));
        rz(com.bytedance.sdk.openadsdk.core.twf.ahm.rz.kgy(jSONObject.optJSONArray("resumeTrackers"), true));
        uq(com.bytedance.sdk.openadsdk.core.twf.ahm.rz.kgy(jSONObject.optJSONArray("completeTrackers")));
        ct(com.bytedance.sdk.openadsdk.core.twf.ahm.rz.kgy(jSONObject.optJSONArray("closeTrackers")));
        noq(com.bytedance.sdk.openadsdk.core.twf.ahm.rz.kgy(jSONObject.optJSONArray("skipTrackers")));
        yo(com.bytedance.sdk.openadsdk.core.twf.ahm.rz.kgy(jSONObject.optJSONArray("clickTrackers")));
        nu(com.bytedance.sdk.openadsdk.core.twf.ahm.rz.kgy(jSONObject.optJSONArray("muteTrackers"), true));
        at(com.bytedance.sdk.openadsdk.core.twf.ahm.rz.kgy(jSONObject.optJSONArray("unMuteTrackers"), true));
        fi(com.bytedance.sdk.openadsdk.core.twf.ahm.rz.ahm(jSONObject.optJSONArray("fractionalTrackers")));
        gf(com.bytedance.sdk.openadsdk.core.twf.ahm.rz.rz(jSONObject.optJSONArray("absoluteTrackers")));
    }

    public void kgy(ioy ioyVar) {
        this.xh = ioyVar;
        this.gm = ioyVar.ct();
        this.vs = ioyVar.ug();
    }

    public void kgy(String str, long j) {
        if (TextUtils.isEmpty(str) || j < 0) {
            return;
        }
        gf(Collections.singletonList(new com.bytedance.sdk.openadsdk.core.twf.ahm.kgy.C0264kgy(str, j).kgy()));
    }

    public void kgy(String str, float f) {
        if (TextUtils.isEmpty(str) || f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        fi(Collections.singletonList(new com.bytedance.sdk.openadsdk.core.twf.ahm.ahm.kgy(str, f).kgy()));
    }

    public void kgy(uq uqVar) {
        ra(uqVar.kgy);
        kgy(uqVar.ahm);
        ahm(uqVar.rz);
        rz(uqVar.uq);
        uq(uqVar.ct);
        ct(uqVar.noq);
        noq(uqVar.yo);
        yo(uqVar.fi);
        nu(uqVar.gf);
        at(uqVar.ra);
        fi(uqVar.nu);
        gf(uqVar.at);
    }
}
