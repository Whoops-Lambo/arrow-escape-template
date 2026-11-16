package com.inmobi.media;

import android.content.SharedPreferences;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.sdk.InMobiSdk;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.z7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4566z7 {
    public static JSONObject a;
    public static JSONObject b;

    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static boolean a() {
        ?? r0;
        JSONObject jSONObjectB = b();
        if (jSONObjectB != null) {
            if (!jSONObjectB.has(InMobiSdk.IM_GDPR_CONSENT_IAB)) {
                if (jSONObjectB.has(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE)) {
                    try {
                        r0 = jSONObjectB.getBoolean(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE);
                    } catch (JSONException unused) {
                        r0 = -1;
                    }
                } else {
                    r0 = -1;
                }
            } else {
                r0 = 1;
            }
        } else {
            r0 = -1;
        }
        boolean zShouldTransmitRequest = ((RootConfig) AbstractC4563z4.a.a(RootConfig.class)).shouldTransmitRequest();
        if (r0 == 1 || zShouldTransmitRequest) {
            return true;
        }
        return false;
    }

    public static final JSONObject b() {
        Iterator<String> itKeys;
        Iterator<String> itKeys2;
        Object objOpt;
        Object objOpt2;
        String string;
        int i;
        JSONObject jSONObject;
        String string2;
        String string3;
        SharedPreferences sharedPreferencesA = Ck.a();
        if (sharedPreferencesA != null) {
            try {
                string = sharedPreferencesA.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, null);
                try {
                    i = sharedPreferencesA.getInt("IABTCF_gdprApplies", -1);
                } catch (Exception unused) {
                    i = -1;
                }
            } catch (Exception unused2) {
                string = null;
            }
            if (string != null) {
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put(InMobiSdk.IM_GDPR_CONSENT_IAB, string);
                    if (i != -1) {
                        jSONObject.put(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, String.valueOf(i));
                    }
                } catch (JSONException unused3) {
                    jSONObject = null;
                }
            } else {
                jSONObject = null;
            }
            if (jSONObject == null) {
                try {
                    string2 = sharedPreferencesA.getString("IABConsent_ConsentString", null);
                    try {
                        string3 = sharedPreferencesA.getString("IABConsent_SubjectToGDPR", null);
                    } catch (Exception unused4) {
                        string3 = null;
                    }
                } catch (Exception unused5) {
                    string2 = null;
                }
                if (string2 != null) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(InMobiSdk.IM_GDPR_CONSENT_IAB, string2);
                        if (string3 != null) {
                            jSONObject2.put(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, string3);
                        }
                        jSONObject = jSONObject2;
                    } catch (JSONException unused6) {
                        jSONObject = null;
                    }
                } else {
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                return jSONObject;
            }
        }
        JSONObject jSONObject3 = b;
        if (jSONObject3 == null) {
            return a;
        }
        if (a != null) {
            jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = b;
            if (jSONObject4 != null) {
                itKeys = jSONObject4.keys();
            } else {
                itKeys = null;
            }
            if (itKeys != null) {
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        JSONObject jSONObject5 = b;
                        if (jSONObject5 != null) {
                            objOpt2 = jSONObject5.opt(next);
                        } else {
                            objOpt2 = null;
                        }
                        jSONObject3.put(next, objOpt2);
                    } catch (JSONException unused7) {
                    }
                }
            }
            JSONObject jSONObject6 = a;
            if (jSONObject6 != null) {
                itKeys2 = jSONObject6.keys();
            } else {
                itKeys2 = null;
            }
            if (itKeys2 != null) {
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    try {
                        JSONObject jSONObject7 = a;
                        if (jSONObject7 != null) {
                            objOpt = jSONObject7.opt(next2);
                        } else {
                            objOpt = null;
                        }
                        jSONObject3.put(next2, objOpt);
                    } catch (JSONException unused8) {
                    }
                }
            }
        }
        return jSONObject3;
    }

    public static final void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = a;
        Objects.toString(jSONObject);
        Objects.toString(jSONObject2);
        if (jSONObject != null) {
            a = jSONObject;
        }
    }
}
