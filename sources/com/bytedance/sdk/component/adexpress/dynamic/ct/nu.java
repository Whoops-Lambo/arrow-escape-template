package com.bytedance.sdk.component.adexpress.dynamic.ct;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.ahm.twf;
import com.bytedance.sdk.component.utils.ay;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.n30;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class nu {
    private static String ahm;
    private static final Set<String> kgy = Collections.unmodifiableSet(new HashSet(Arrays.asList("dislike", CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "close-fill", "webview-close")));

    public static int[] ahm(String str, float f, boolean z) {
        try {
            TextView textView = new TextView(com.bytedance.sdk.component.adexpress.uq.kgy());
            textView.setTextSize(f);
            textView.setText(str);
            textView.setIncludeFontPadding(false);
            if (z) {
                textView.setSingleLine();
            }
            textView.measure(-2, -2);
            return new int[]{textView.getMeasuredWidth() + 2, textView.getMeasuredHeight() + 2};
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "d+80mhaoXMmJXuRUlhSVPFLiPg==", "XOs5oQakffeYed5HiQ==", 398);
            return new int[]{0, 0};
        }
    }

    /* JADX WARN: Code duplicated, block: B:234:0x0466  */
    /* JADX WARN: Code duplicated, block: B:237:0x0475 A[Catch: Exception -> 0x0487, TryCatch #4 {Exception -> 0x0487, blocks: (B:235:0x046a, B:237:0x0475, B:242:0x0480), top: B:303:0x046a, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:239:0x047c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:241:0x047f  */
    /* JADX WARN: Code duplicated, block: B:246:0x0489 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [com.bytedance.sdk.component.adexpress.dynamic.ct.ahm$rz] */
    public static ahm.rz kgy(String str, String str2, String str3, boolean z, boolean z2, int i, com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar, double d, int i2, double d2, String str4, twf twfVar) {
        int i3;
        int i4;
        ahm.rz rzVar;
        int i5;
        float f;
        float f2;
        float f3;
        ahm.rz rzVarKgy;
        int i6;
        com.bytedance.sdk.component.adexpress.dynamic.uq.noq noqVarCt;
        String strOptString = str;
        String strUq = twfVar.uq();
        int iYo = twfVar.yo();
        if (com.bytedance.sdk.component.adexpress.uq.ahm() && i2 != 4 && (TextUtils.equals(str2, "text_star") || TextUtils.equals(str2, "score-count") || TextUtils.equals(str2, "score-count-type-1") || TextUtils.equals(str2, "score-count-type-2"))) {
            return new ahm.rz(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        ahm.rz rzVar2 = new ahm.rz();
        if (strOptString.startsWith("<svg") || kgy.contains(str2)) {
            try {
                if (!CampaignEx.JSON_NATIVE_VIDEO_CLOSE.equals(str2)) {
                    if (com.bytedance.sdk.component.adexpress.uq.ahm() && "close-fill".equals(str2)) {
                    }
                    rzVar2.kgy = 10.0f;
                    rzVar2.ahm = 10.0f;
                    return rzVar2;
                }
                float fOptDouble = (float) PangleNetworkBridge.jsonObjectInit(str3).optDouble("fontSize");
                rzVar2.kgy = fOptDouble;
                rzVar2.ahm = fOptDouble;
                return rzVar2;
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "d+80mhaoXMmJXuRUlhSVPFLiPg==", "XOs5uQKlZtKUf9lUmCKpMl4=", 65);
            }
        } else {
            if ("logo".equals(str2)) {
                if (!com.bytedance.sdk.component.adexpress.uq.ahm() && ((!TextUtils.isEmpty(strOptString) && strOptString.contains("adx:")) || ahm())) {
                    return ahm() ? kgy(rzVar2, strOptString, str3, ahm) : kgy(rzVar2, strOptString, str3, "");
                }
                rzVar2.kgy = "union".equals(strOptString) ? 14.0f : 20.0f;
                rzVar2.ahm = 10.0f;
                if (!com.bytedance.sdk.component.adexpress.uq.ahm()) {
                    return rzVar2;
                }
                String strFt = twfVar.ft();
                if ("union".equals(strOptString) && TextUtils.isEmpty(strFt)) {
                    rzVar2.kgy = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                String strM = n30.m(str2, strOptString);
                float fAhm = (float) ahm(str3);
                if (strM.contains("logoad")) {
                    String strWy = twfVar.wy();
                    if (!TextUtils.isEmpty(strWy)) {
                        return kgy(strWy, str3);
                    }
                    rzVar2.kgy = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                rzVar2.ahm = fAhm;
                return rzVar2;
            }
            if ("development-name".equals(str2)) {
                strOptString = ay.kgy(com.bytedance.sdk.component.adexpress.uq.kgy(), "tt_text_privacy_development") + strOptString;
            }
            if ("app-version".equals(str2)) {
                strOptString = ay.kgy(com.bytedance.sdk.component.adexpress.uq.kgy(), "tt_text_privacy_app_version") + strOptString;
            }
            if ("score-count".equals(str2)) {
                try {
                    i3 = Integer.parseInt(strOptString);
                } catch (NumberFormatException e2) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e2, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "d+80mhaoXMmJXuRUlhSVPFLiPg==", "XOs5uQKlZtKUf9lUmCKpMl4=", Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                    i3 = 0;
                }
                if (com.bytedance.sdk.component.adexpress.uq.ahm() && i3 < 0) {
                    return new ahm.rz(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                return kgy("(" + String.format(ay.kgy(com.bytedance.sdk.component.adexpress.uq.kgy(), "tt_comment_num"), Integer.valueOf(i3)) + ")", str3);
            }
            if ("score-count-type-2".equals(str2)) {
                try {
                    i4 = Integer.parseInt(strOptString);
                } catch (NumberFormatException e3) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e3, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "d+80mhaoXMmJXuRUlhSVPFLiPg==", "XOs5uQKlZtKUf9lUmCKpMl4=", Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
                    i4 = 0;
                }
                if (com.bytedance.sdk.component.adexpress.uq.ahm() && i4 < 0) {
                    return new ahm.rz(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                return kgy("(" + String.format(new DecimalFormat("###,###,###").format(i4), Integer.valueOf(i4)) + ")", str3);
            }
            if ("feedback-dislike".equals(str2) && com.bytedance.sdk.component.adexpress.uq.ahm()) {
                ahm.rz rzVar3 = new ahm.rz();
                float fAhm2 = (float) ahm(str3);
                rzVar3.kgy = fAhm2;
                rzVar3.ahm = fAhm2;
                return rzVar3;
            }
            if ("skip-with-time-countdown".equals(str2) || TextUtils.equals("skip-with-countdowns-video-countdown", str2)) {
                if (!twfVar.kgy() || !com.bytedance.sdk.component.adexpress.uq.noq.ahm(strUq)) {
                    return d < 10.0d ? kgy("0S", str3) : kgy("00S", str3);
                }
                if (((int) (d + 0.5d)) - iYo < 10) {
                    return com.bytedance.sdk.component.adexpress.uq.ahm() ? kgy("0s", str3) : kgy(String.format(ay.kgy(com.bytedance.sdk.component.adexpress.uq.kgy(), "tt_reward_full_skip"), "0"), str3);
                }
                return com.bytedance.sdk.component.adexpress.uq.ahm() ? kgy("00s", str3) : kgy(String.format(ay.kgy(com.bytedance.sdk.component.adexpress.uq.kgy(), "tt_reward_full_skip"), "00"), str3);
            }
            if (TextUtils.equals("skip-with-countdowns-skip-btn", str2)) {
                return kgy("| " + ay.kgy(com.bytedance.sdk.component.adexpress.uq.kgy(), "tt_reward_screen_skip_tx"), str3);
            }
            if (TextUtils.equals("skip-with-countdowns-skip-countdown", str2)) {
                return kgy("| ".concat(String.format(ay.kgy(com.bytedance.sdk.component.adexpress.uq.kgy(), "tt_reward_full_skip_count_down"), "00")), str3);
            }
            if ("skip-with-time-skip-btn".equals(str2)) {
                ahm.rz rzVarKgy2 = kgy("| " + ay.kgy(com.bytedance.sdk.component.adexpress.uq.kgy(), "tt_reward_screen_skip_tx"), str3);
                if (com.bytedance.sdk.component.adexpress.uq.ahm()) {
                    try {
                        rzVarKgy2.ahm = (float) ((((double) rzVarKgy2.ahm) * PangleNetworkBridge.jsonObjectInit(str3).optDouble("lineHeight")) / 1.2d);
                    } catch (Throwable th) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "d+80mhaoXMmJXuRUlhSVPFLiPg==", "XOs5uQKlZtKUf9lUmCKpMl4=", 190);
                    }
                    rzVarKgy2.kgy = rzVarKgy2.ahm;
                }
                return rzVarKgy2;
            }
            if ("skip".equals(str2)) {
                return kgy(ay.kgy(com.bytedance.sdk.component.adexpress.uq.kgy(), "tt_reward_screen_skip_tx"), str3);
            }
            if ("timedown".equals(str2)) {
                return kgy("0.0", str3);
            }
            if ("text_star".equals(str2)) {
                return (!com.bytedance.sdk.component.adexpress.uq.ahm() || (d2 >= 0.0d && d2 <= 5.0d)) ? kgy("0.0", str3) : new ahm.rz(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            if (TextUtils.equals("privacy-detail", str2)) {
                return kgy("Permission list | Privacy policy", str3);
            }
            if ("arrowButton".equals(str2)) {
                return kgy("Download", str3);
            }
            if ("text".equals(str2) && com.bytedance.sdk.component.adexpress.uq.ahm() && TextUtils.isEmpty(strOptString) && (noqVarCt = fiVar.ra().ct()) != null) {
                strOptString = noqVarCt.yx() != null ? fiVar.ra().ct().yx().optString(com.bytedance.sdk.component.adexpress.uq.yo.rz(com.bytedance.sdk.component.adexpress.uq.kgy())) : "";
            }
            if ("fillButton".equals(str2) || "text".equals(str2) || "button".equals(str2) || "downloadWithIcon".equals(str2) || "downloadButton".equals(str2) || "laceButton".equals(str2) || "cardButton".equals(str2) || "colourMixtureButton".equals(str2) || "arrowButton".equals(str2) || (("source".equals(str2) && !(com.bytedance.sdk.component.adexpress.uq.ahm() && "open_ad".equals(strUq))) || TextUtils.equals("app-version", str2) || TextUtils.equals("development-name", str2))) {
                return kgy(strOptString, str3);
            }
            try {
                JSONObject jSONObjectJsonObjectInit = PangleNetworkBridge.jsonObjectInit(str3);
                int length = strOptString.length();
                float fOptDouble2 = (float) jSONObjectJsonObjectInit.optDouble("fontSize");
                float fOptDouble3 = (float) jSONObjectJsonObjectInit.optDouble("letterSpacing");
                float fOptDouble4 = (float) jSONObjectJsonObjectInit.optDouble("lineHeight");
                float fOptDouble5 = (float) jSONObjectJsonObjectInit.optDouble("maxWidth");
                float f4 = ((fOptDouble2 + fOptDouble3) * length) - fOptDouble3;
                ?? Equals = "muted".equals(str2);
                try {
                    if (Equals != 0) {
                        rzVar2.kgy = fOptDouble2;
                        rzVar2.ahm = fOptDouble2;
                        return rzVar2;
                    }
                    Equals = rzVar2;
                    if ("star".equals(str2)) {
                        if (com.bytedance.sdk.component.adexpress.uq.ahm() && (d2 < 0.0d || d2 > 4617315517961601024 || i2 != 4)) {
                            return new ahm.rz(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                        ahm.rz rzVarKgy3 = kgy("str", str3);
                        rzVarKgy3.kgy = fOptDouble2 * 5.0f;
                        return rzVarKgy3;
                    }
                    if ("icon".equals(str2)) {
                        Equals.kgy = fOptDouble2;
                        Equals.ahm = fOptDouble2;
                        return Equals;
                    }
                    if (!z) {
                        i5 = i;
                        f = f4;
                        f2 = (float) (((double) (fOptDouble4 * fOptDouble2)) * 1.2d);
                        if (f <= fOptDouble5) {
                            f3 = f;
                        }
                        if ("title".equals(str2) || (com.bytedance.sdk.component.adexpress.uq.ahm() && "open_ad".equals(strUq) && "source".equals(str2))) {
                            try {
                                rzVarKgy = kgy(strOptString.replace('\n', ' '), str3, false);
                                if (!z) {
                                    return rzVarKgy;
                                }
                                i6 = ((int) (f / fOptDouble5)) + 1;
                                if (z2 || i6 < i5) {
                                    i5 = i6;
                                }
                                rzVarKgy.ahm *= i5;
                                return rzVarKgy;
                            } catch (Exception e4) {
                                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e4, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "d+80mhaoXMmJXuRUlhSVPFLiPg==", "XOs5uQKlZtKUf9lUmCKpMl4=", Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE);
                            }
                        }
                        Equals.kgy = f3;
                        Equals.ahm = f2;
                        return Equals;
                    }
                    int i7 = ((int) (f4 / fOptDouble5)) + 1;
                    i5 = i;
                    if (z2 && i7 >= i5) {
                        i7 = i5;
                    }
                    f = f4;
                    f2 = (float) (((double) (fOptDouble2 * fOptDouble4 * i7)) * 1.2d);
                    f3 = fOptDouble5;
                    if ("title".equals(str2)) {
                        rzVarKgy = kgy(strOptString.replace('\n', ' '), str3, false);
                        if (!z) {
                            return rzVarKgy;
                        }
                        i6 = ((int) (f / fOptDouble5)) + 1;
                        if (z2) {
                            i5 = i6;
                        } else {
                            i5 = i6;
                        }
                        rzVarKgy.ahm *= i5;
                        return rzVarKgy;
                    }
                    rzVarKgy = kgy(strOptString.replace('\n', ' '), str3, false);
                    if (!z) {
                        return rzVarKgy;
                    }
                    i6 = ((int) (f / fOptDouble5)) + 1;
                    if (z2) {
                        i5 = i6;
                    } else {
                        i5 = i6;
                    }
                    rzVarKgy.ahm *= i5;
                    return rzVarKgy;
                    Equals.kgy = f3;
                    Equals.ahm = f2;
                    return Equals;
                } catch (JSONException e5) {
                    e = e5;
                    rzVar = Equals;
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "d+80mhaoXMmJXuRUlhSVPFLiPg==", "XOs5uQKlZtKUf9lUmCKpMl4=", Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE);
                    return rzVar;
                }
            } catch (JSONException e6) {
                e = e6;
                rzVar = rzVar2;
            }
        }
    }

    public static double ahm(String str) {
        try {
            return Double.parseDouble(PangleNetworkBridge.jsonObjectInit(str).optString("fontSize"));
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "d+80mhaoXMmJXuRUlhSVPFLiPg==", "XOs5oQakffSJUNJ/lSK0MVfr", 376);
            return 0.0d;
        }
    }

    public static boolean ahm() {
        return !TextUtils.isEmpty(ahm);
    }

    public static String kgy(String str) {
        String[] strArrSplit;
        return (TextUtils.isEmpty(str) || (strArrSplit = str.split("adx:")) == null || strArrSplit.length < 2) ? "" : strArrSplit[1];
    }

    private static ahm.rz kgy(ahm.rz rzVar, String str, String str2, String str3) {
        if (str.contains("union")) {
            rzVar.kgy = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            rzVar.ahm = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return rzVar;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = kgy(str);
        }
        if (TextUtils.isEmpty(str3)) {
            rzVar.kgy = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            rzVar.ahm = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return rzVar;
        }
        return kgy(str3, str2);
    }

    public static ahm.rz kgy(String str, String str2) {
        return kgy(str, str2, false);
    }

    public static ahm.rz kgy(String str, String str2, boolean z) {
        ahm.rz rzVar = new ahm.rz();
        try {
            JSONObject jSONObjectJsonObjectInit = PangleNetworkBridge.jsonObjectInit(str2);
            int[] iArrKgy = kgy(str, (float) ahm(str2), z);
            rzVar.kgy = iArrKgy[0];
            rzVar.ahm = iArrKgy[1];
            if (jSONObjectJsonObjectInit.optDouble("lineHeight", 1.0d) != 0.0d) {
                return rzVar;
            }
            rzVar.ahm = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return rzVar;
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "d+80mhaoXMmJXuRUlhSVPFLiPg==", "XOs5oQakffSJUNJ/lSK0MVfr", 367);
            return rzVar;
        }
    }

    public static int[] kgy(String str, float f, boolean z) {
        int[] iArrAhm = ahm(str, f, z);
        return new int[]{com.bytedance.sdk.component.adexpress.uq.yo.ahm(com.bytedance.sdk.component.adexpress.uq.kgy(), iArrAhm[0]), com.bytedance.sdk.component.adexpress.uq.yo.ahm(com.bytedance.sdk.component.adexpress.uq.kgy(), iArrAhm[1])};
    }

    public static String kgy() {
        return ahm;
    }
}
