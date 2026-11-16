package com.bytedance.sdk.openadsdk.xh;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.sx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class kgy implements Comparable<kgy> {
    private final String ahm;
    private int ct;
    private long kus;
    private int rz;
    private int yo;
    private final ArrayList<Long> kgy = new ArrayList<>();
    private final ArrayList<Long> uq = new ArrayList<>();
    private final ArrayList<Long> noq = new ArrayList<>();
    private final ArrayList<Long> fi = new ArrayList<>();
    private final HashMap<String, ahm> gf = new HashMap<>();
    private int ra = 0;
    private int nu = 0;
    private final HashMap<String, ahm> at = new HashMap<>();
    private int twf = 0;
    private final ArrayList<String> vs = new ArrayList<>();

    private void ahm(@NonNull JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i;
        int i2;
        int i3;
        int[] iArr;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int[] iArrAt = com.bytedance.sdk.openadsdk.noq.kgy.kgy().at();
        if (iArrAt != null) {
            int i4 = 0;
            while (i4 < iArrAt.length) {
                int i5 = iArrAt[i4];
                long j = 60000;
                long j2 = jElapsedRealtime - (((long) i5) * 60000);
                Iterator<String> it = this.at.keySet().iterator();
                long j3 = 0;
                while (it.hasNext()) {
                    long j4 = j;
                    String next = it.next();
                    Iterator<String> it2 = it;
                    ahm ahmVar = this.at.get(next);
                    if (ahmVar != null) {
                        long jKgy = ahmVar.kgy(j2, jElapsedRealtime);
                        j3 += jKgy;
                        if (jKgy <= 0 && i4 == iArrAt.length - 1) {
                            hashSet.add(next);
                        }
                    }
                    it = it2;
                    j = j4;
                }
                if (j3 != 0) {
                    jSONObject.put("lp_stay_t_".concat(String.valueOf(i5)), j3);
                    iArr = iArrAt;
                    long jOptInt = ((long) jSONObject2.optInt("lp_stay_t_".concat(String.valueOf(i5)))) + j3;
                    if (jOptInt != 0) {
                        jSONObject2.put("lp_stay_t_".concat(String.valueOf(i5)), jOptInt);
                    }
                } else {
                    iArr = iArrAt;
                }
                i4++;
                iArrAt = iArr;
            }
        }
        int[] iArrTwf = com.bytedance.sdk.openadsdk.noq.kgy.kgy().twf();
        if (iArrTwf != null) {
            int i6 = 0;
            while (i6 < iArrTwf.length) {
                int i7 = iArrTwf[i6];
                long j5 = jElapsedRealtime - (((long) i7) * 60000);
                long j6 = 0;
                int i8 = 0;
                for (String str : this.gf.keySet()) {
                    HashSet hashSet3 = hashSet;
                    int i9 = i7;
                    ahm ahmVar2 = this.gf.get(str);
                    if (ahmVar2 != null) {
                        long jKgy2 = ahmVar2.kgy(j5, jElapsedRealtime);
                        j6 += jKgy2;
                        if (jKgy2 > 20000) {
                            i8++;
                        }
                        if (jKgy2 <= 0 && i6 == iArrTwf.length - 1) {
                            hashSet2.add(str);
                        }
                    }
                    i7 = i9;
                    hashSet = hashSet3;
                }
                HashSet hashSet4 = hashSet;
                int i10 = i7;
                if (j6 != 0) {
                    jSONObject.put("v_stay_t_".concat(String.valueOf(i10)), j6);
                    long jOptInt2 = ((long) jSONObject2.optInt("v_stay_t_".concat(String.valueOf(i10)))) + j6;
                    if (jOptInt2 != 0) {
                        jSONObject2.put("v_stay_t_".concat(String.valueOf(i10)), jOptInt2);
                    }
                }
                if (i8 != 0) {
                    jSONObject.put("v_20s_play_c_".concat(String.valueOf(i10)), i8);
                    int iOptInt = jSONObject2.optInt("v_20s_play_c_".concat(String.valueOf(i10))) + i8;
                    if (iOptInt != 0) {
                        jSONObject2.put("v_20s_play_c_".concat(String.valueOf(i10)), iOptInt);
                    }
                }
                i6++;
                hashSet = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet;
        if (!hashSet5.isEmpty()) {
            Iterator it3 = hashSet5.iterator();
            while (it3.hasNext()) {
                this.at.remove((String) it3.next());
            }
        }
        if (!hashSet2.isEmpty()) {
            Iterator it4 = hashSet2.iterator();
            while (it4.hasNext()) {
                this.gf.remove((String) it4.next());
            }
        }
        if (com.bytedance.sdk.openadsdk.noq.kgy.kgy().vs() && (i3 = this.ra) != 0) {
            jSONObject.put("v_stay_t_s", i3);
            int iOptInt2 = jSONObject2.optInt("v_stay_t_s") + this.ra;
            if (iOptInt2 != 0) {
                jSONObject2.put("v_stay_t_s", iOptInt2);
            }
        }
        if (com.bytedance.sdk.openadsdk.noq.kgy.kgy().kus() && (i2 = this.twf) != 0) {
            jSONObject.put("lp_stay_t_s", i2);
            int iOptInt3 = jSONObject2.optInt("lp_stay_t_s") + this.twf;
            if (iOptInt3 != 0) {
                jSONObject2.put("lp_stay_t_s", iOptInt3);
            }
        }
        if (!com.bytedance.sdk.openadsdk.noq.kgy.kgy().xh() || (i = this.nu) == 0) {
            return;
        }
        jSONObject.put("v_30p_play_c_s", i);
        int iOptInt4 = jSONObject2.optInt("v_30p_play_c_s") + this.nu;
        if (iOptInt4 != 0) {
            jSONObject2.put("v_30p_play_c_s", iOptInt4);
        }
    }

    public kgy(String str) {
        this.ahm = str;
    }

    public void kgy(@NonNull String str, @Nullable String str2) {
        ahm ahmVar;
        ahm ahmVar2;
        ahm ahmVar3;
        ahm ahmVar4;
        ahm ahmVar5;
        ahm ahmVar6;
        str.getClass();
        switch (str) {
            case "landingContinue":
                if (!TextUtils.isEmpty(str2) && (ahmVar = this.at.get(str2)) != null) {
                    ahmVar.uq(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingPause":
                if (!TextUtils.isEmpty(str2) && (ahmVar2 = this.at.get(str2)) != null) {
                    ahmVar2.rz(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingStart":
                if (!TextUtils.isEmpty(str2) && this.at.get(str2) == null) {
                    ahm ahmVar7 = new ahm();
                    this.at.put(str2, ahmVar7);
                    ahmVar7.kgy(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_over":
            case "feed_break":
            case "videoForceBreak":
            case "play_error":
                if (!TextUtils.isEmpty(str2) && (ahmVar3 = this.gf.get(str2)) != null && ahmVar3.kgy() != ahm.ct) {
                    ahmVar3.ahm(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.noq.kgy.kgy().vs()) {
                        this.ra = (int) (ahmVar3.kgy(this.kus, SystemClock.elapsedRealtime()) + ((long) this.ra));
                    }
                    break;
                }
                break;
            case "feed_play":
                this.noq.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.noq.kgy.kgy().fi()) {
                    this.yo++;
                }
                if (!TextUtils.isEmpty(str2) && this.gf.get(str2) == null) {
                    ahm ahmVar8 = new ahm();
                    this.gf.put(str2, ahmVar8);
                    ahmVar8.kgy(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "show":
                this.kgy.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.noq.kgy.kgy().noq()) {
                    this.rz++;
                    break;
                }
                break;
            case "click":
                if (!this.vs.contains(str2)) {
                    if (this.vs.size() > 50) {
                        this.vs.subList(0, 25).clear();
                    }
                    this.vs.add(str2);
                    this.uq.add(Long.valueOf(SystemClock.elapsedRealtime()));
                    if (com.bytedance.sdk.openadsdk.noq.kgy.kgy().yo()) {
                        this.ct++;
                    }
                    break;
                }
                break;
            case "feed_continue":
                if (!TextUtils.isEmpty(str2) && (ahmVar4 = this.gf.get(str2)) != null) {
                    ahmVar4.uq(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_pause":
                if (!TextUtils.isEmpty(str2) && (ahmVar5 = this.gf.get(str2)) != null) {
                    ahmVar5.rz(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingFinish":
                if (!TextUtils.isEmpty(str2) && (ahmVar6 = this.at.get(str2)) != null && ahmVar6.kgy() != ahm.ct) {
                    ahmVar6.ahm(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.noq.kgy.kgy().kus()) {
                        this.twf = (int) (ahmVar6.kgy(this.kus, SystemClock.elapsedRealtime()) + ((long) this.twf));
                    }
                    break;
                }
                break;
            case "videoPercent30":
                if (com.bytedance.sdk.openadsdk.noq.kgy.kgy().xh()) {
                    this.nu++;
                    break;
                }
                break;
            case "dislike":
                this.fi.add(Long.valueOf(SystemClock.elapsedRealtime()));
                break;
        }
    }

    public String ahm() {
        return this.ahm;
    }

    public JSONObject kgy(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            kgy(jSONObject2, jSONObject);
            ahm(jSONObject2, jSONObject);
            return jSONObject2;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EepC1X", "fessgRaubOSPRttYjwWpJ1XDIpEGsA==", "WO8hlhawaNOF", 188);
            sx.rz(th.getMessage(), new Object[0]);
            return jSONObject2;
        }
    }

    private void kgy(String str, JSONObject jSONObject, ArrayList<Long> arrayList, int[] iArr, long j, JSONObject jSONObject2) throws JSONException {
        int size = arrayList.size() - 1;
        int i = 0;
        for (int i2 : iArr) {
            long j2 = j - (((long) i2) * 60000);
            while (size >= 0 && arrayList.get(size).longValue() >= j2) {
                i++;
                size--;
            }
            if (i != 0) {
                jSONObject.put(str + i2, i);
                int iOptInt = jSONObject2.optInt(str + i2) + i;
                if (iOptInt != 0) {
                    jSONObject2.put(str + i2, iOptInt);
                }
            }
        }
        while (size >= 0) {
            arrayList.remove(0);
            size--;
        }
    }

    private void kgy(@NonNull JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i;
        int i2;
        int i3;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        kgy("show_c_", jSONObject, this.kgy, com.bytedance.sdk.openadsdk.noq.kgy.kgy().gf(), jElapsedRealtime, jSONObject2);
        kgy("click_c_", jSONObject, this.uq, com.bytedance.sdk.openadsdk.noq.kgy.kgy().ra(), jElapsedRealtime, jSONObject2);
        kgy("v_play_c_", jSONObject, this.noq, com.bytedance.sdk.openadsdk.noq.kgy.kgy().nu(), jElapsedRealtime, jSONObject2);
        kgy("dislike_c_", jSONObject, this.fi, com.bytedance.sdk.openadsdk.noq.kgy.kgy().dg(), jElapsedRealtime, jSONObject2);
        if (com.bytedance.sdk.openadsdk.noq.kgy.kgy().noq() && (i3 = this.rz) != 0) {
            jSONObject.put("show_c_s", i3);
            int iOptInt = jSONObject2.optInt("show_c_s") + this.rz;
            if (iOptInt != 0) {
                jSONObject2.put("show_c_s", iOptInt);
            }
        }
        if (com.bytedance.sdk.openadsdk.noq.kgy.kgy().yo() && (i2 = this.ct) != 0) {
            jSONObject.put("click_c_s", i2);
            int iOptInt2 = jSONObject2.optInt("click_c_s") + this.ct;
            if (iOptInt2 != 0) {
                jSONObject2.put("click_c_s", iOptInt2);
            }
        }
        if (!com.bytedance.sdk.openadsdk.noq.kgy.kgy().fi() || (i = this.yo) == 0) {
            return;
        }
        jSONObject.put("v_play_c_s", i);
        int iOptInt3 = jSONObject2.optInt("v_play_c_s") + this.yo;
        if (iOptInt3 != 0) {
            jSONObject2.put("v_play_c_s", iOptInt3);
        }
    }

    public void kgy() {
        this.kus = SystemClock.elapsedRealtime();
        this.nu = 0;
        this.ct = 0;
        this.rz = 0;
        this.twf = 0;
        this.ra = 0;
        this.yo = 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
    public int compareTo(kgy kgyVar) {
        return kgyVar.rz - this.rz;
    }
}
