package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.services.core.fid.Constants;
import defpackage.pv1;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzao implements zzd {
    public final Application a;
    public final zzaq b;
    public final zzl c;
    public final Executor d;

    /* JADX WARN: Code duplicated, block: B:100:0x0267  */
    /* JADX WARN: Code duplicated, block: B:102:0x026a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0278  */
    /* JADX WARN: Code duplicated, block: B:108:0x027f  */
    /* JADX WARN: Code duplicated, block: B:112:0x028f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0292  */
    /* JADX WARN: Code duplicated, block: B:115:0x0296  */
    /* JADX WARN: Code duplicated, block: B:116:0x0299  */
    /* JADX WARN: Code duplicated, block: B:118:0x029c  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:121:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:123:0x02af  */
    /* JADX WARN: Code duplicated, block: B:125:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:127:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:138:0x02da  */
    /* JADX WARN: Code duplicated, block: B:139:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:140:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:94:0x0256  */
    /* JADX WARN: Code duplicated, block: B:96:0x025d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0264  */
    /* JADX WARN: Failed to find 'out' block for switch in B:77:0x020d. Please report as an issue. */
    /* JADX WARN: Instruction removed from duplicated block: B:94:0x0256, please report this as an issue */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final boolean d(String str, JSONObject jSONObject) {
        zzaq zzaqVar;
        HashMap map;
        HashMap map2;
        String str2;
        String str3;
        String str4;
        int iIntValue;
        String str5;
        Integer num;
        Iterator it;
        Object obj;
        Object obj2;
        int iHashCode = str.hashCode();
        Application application = this.a;
        boolean zBooleanValue = false;
        if (iHashCode == 94746189) {
            if (!str.equals("clear")) {
                return false;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("keys");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                Log.d("UserMessagingPlatform", "Action[clear]: wrong args.".concat(String.valueOf(jSONObject.toString())));
                return true;
            }
            HashSet hashSet = new HashSet();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                String strOptString = jSONArrayOptJSONArray.optString(i);
                if (TextUtils.isEmpty(strOptString)) {
                    Log.d("UserMessagingPlatform", "Action[clear]: empty key at index: " + i);
                } else {
                    hashSet.add(strOptString);
                }
            }
            zzcw.b(application, hashSet);
            return true;
        }
        if (iHashCode != 113399775 || !str.equals("write")) {
            return false;
        }
        zzcv zzcvVar = new zzcv(application);
        Iterator<String> itKeys = jSONObject.keys();
        while (true) {
            boolean zHasNext = itKeys.hasNext();
            zzaqVar = this.b;
            map = zzcvVar.c;
            map2 = zzcvVar.a;
            if (!zHasNext) {
                break;
            }
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            Log.d("UserMessagingPlatform", "Writing to storage: [" + next + "] " + String.valueOf(objOpt));
            Context context = zzcvVar.b;
            zzcu zzcuVarA = zzcw.a(context, next);
            if (zzcuVarA != null) {
                String str6 = zzcuVarA.b;
                String str7 = zzcuVarA.a;
                if (!map.containsKey(str7)) {
                    map.put(str7, context.getSharedPreferences(str7, 0).edit());
                }
                SharedPreferences.Editor editor = (SharedPreferences.Editor) map.get(str7);
                if (objOpt instanceof Integer) {
                    Integer num2 = (Integer) objOpt;
                    editor.putInt(str6, num2.intValue());
                    if (zzcv.d.contains(str6)) {
                        map2.put(str6, num2);
                    }
                } else if (objOpt instanceof Long) {
                    editor.putLong(str6, ((Long) objOpt).longValue());
                } else if (objOpt instanceof Double) {
                    editor.putFloat(str6, ((Double) objOpt).floatValue());
                } else if (objOpt instanceof Float) {
                    editor.putFloat(str6, ((Float) objOpt).floatValue());
                } else if (objOpt instanceof Boolean) {
                    editor.putBoolean(str6, ((Boolean) objOpt).booleanValue());
                } else if (objOpt instanceof String) {
                    editor.putString(str6, (String) objOpt);
                }
                zzaqVar.c.add(next);
            }
            Log.d("UserMessagingPlatform", "Failed writing key: ".concat(String.valueOf(next)));
        }
        zzaqVar.b.edit().putStringSet("written_values", zzaqVar.c).commit();
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            ((SharedPreferences.Editor) it2.next()).commit();
        }
        if (map2.size() <= 1) {
            return true;
        }
        zzl zzlVar = this.c;
        zzam zzamVar = zzlVar.a;
        AtomicReference atomicReference = zzamVar.g;
        AtomicReference atomicReference2 = zzamVar.f;
        AtomicReference atomicReference3 = zzamVar.e;
        AtomicReference atomicReference4 = zzamVar.d;
        AtomicReference atomicReference5 = zzamVar.c;
        AtomicReference atomicReference6 = zzamVar.b;
        if (atomicReference.get() != null) {
            zBooleanValue = ((Boolean) atomicReference.get()).booleanValue();
        } else {
            Context context2 = zzamVar.a;
            if (context2 == null) {
                atomicReference.set(Boolean.FALSE);
            } else {
                try {
                    atomicReference6.set(FirebaseAnalytics.class.getDeclaredMethod(Constants.GET_INSTANCE, Context.class).invoke(null, context2));
                    atomicReference5.set(FirebaseAnalytics.class.getDeclaredMethod("setConsent", Map.class));
                    FirebaseAnalytics.ConsentStatus consentStatus = FirebaseAnalytics.ConsentStatus.GRANTED;
                    FirebaseAnalytics.ConsentType consentType = FirebaseAnalytics.ConsentType.AD_STORAGE;
                    Method declaredMethod = FirebaseAnalytics.ConsentStatus.class.getDeclaredMethod("valueOf", String.class);
                    Method declaredMethod2 = FirebaseAnalytics.ConsentType.class.getDeclaredMethod("valueOf", String.class);
                    atomicReference4.set(declaredMethod);
                    atomicReference3.set(declaredMethod2);
                    atomicReference.set(Boolean.TRUE);
                    zBooleanValue = true;
                } catch (Exception e) {
                    Log.w("UserMessagingPlatform", "No Firebase class found. ", e);
                    atomicReference.set(Boolean.FALSE);
                    zBooleanValue = false;
                }
            }
        }
        if (zBooleanValue) {
            Context context3 = zzlVar.b;
            if (atomicReference2.get() == null) {
                try {
                    atomicReference2.set(Wrappers.packageManager(context3).getApplicationInfo(context3.getPackageName(), 128).metaData);
                } catch (PackageManager.NameNotFoundException | NullPointerException e2) {
                    Log.w("UserMessagingPlatform", "Failed to get metadata. ", e2);
                }
            }
            String str8 = "IABTCF_gdprApplies";
            Integer num3 = (Integer) map2.get("IABTCF_gdprApplies");
            HashMap map3 = new HashMap();
            Iterator it3 = map2.keySet().iterator();
            while (it3.hasNext()) {
                String str9 = (String) it3.next();
                if (!str9.equals(str8)) {
                    switch (str9) {
                        case "UMP_CoMoAdPersonalizationPurposeConsentStatus":
                            str2 = "google_analytics_default_allow_ad_personalization_signals";
                            str3 = "AD_PERSONALIZATION";
                            iIntValue = ((Integer) map2.get(str9)).intValue();
                            str5 = str8;
                            if (iIntValue != -1) {
                                num = num3;
                                if (iIntValue != 1) {
                                    map3.put(str3, "GRANTED");
                                    str8 = str5;
                                    num3 = num;
                                    break;
                                } else {
                                    it = it3;
                                    if (iIntValue != 2) {
                                        map3.put(str3, "DENIED");
                                    } else if (iIntValue != 4) {
                                        if (iIntValue != 5) {
                                            pv1.u(iIntValue, "Invalid CoMo consent status: ", "UserMessagingPlatform");
                                        } else {
                                            if (atomicReference2.get() != null || (obj2 = ((Bundle) atomicReference2.get()).get(str2)) == null) {
                                                obj = null;
                                            } else if (obj2 instanceof Boolean) {
                                                obj = (Boolean) obj2;
                                            } else if (obj2 instanceof String) {
                                                obj = (String) obj2;
                                            } else {
                                                obj = null;
                                            }
                                            if (obj == null) {
                                                Log.w("UserMessagingPlatform", "No default metadata");
                                            } else if (obj instanceof Boolean) {
                                                map3.put(str3, true != ((Boolean) obj).booleanValue() ? "DENIED" : "GRANTED");
                                            } else if ((obj instanceof String) || !obj.equals("eu_consent_policy") || (!(str3.equals("AD_PERSONALIZATION") || str3.equals("AD_USER_DATA")) || num == null)) {
                                                Log.w("UserMessagingPlatform", "Failed to get the default eu_consent_policy value.");
                                            } else {
                                                map3.put(str3, num.intValue() == 1 ? "DENIED" : "GRANTED");
                                            }
                                        }
                                    }
                                }
                            }
                            str8 = str5;
                            num3 = num;
                            it3 = it;
                            break;
                        case "UMP_CoMoAnalyticsStoragePurposeConsentStatus":
                            str2 = "google_analytics_default_allow_analytics_storage";
                            str4 = "ANALYTICS_STORAGE";
                            str3 = str4;
                            iIntValue = ((Integer) map2.get(str9)).intValue();
                            str5 = str8;
                            if (iIntValue != -1) {
                                num = num3;
                                if (iIntValue != 1) {
                                    map3.put(str3, "GRANTED");
                                    str8 = str5;
                                    num3 = num;
                                    break;
                                } else {
                                    it = it3;
                                    if (iIntValue != 2) {
                                        map3.put(str3, "DENIED");
                                    } else if (iIntValue != 4) {
                                        if (iIntValue != 5) {
                                            pv1.u(iIntValue, "Invalid CoMo consent status: ", "UserMessagingPlatform");
                                        } else {
                                            if (atomicReference2.get() != null) {
                                                obj = null;
                                            } else if (obj2 instanceof Boolean) {
                                                obj = (Boolean) obj2;
                                            } else if (obj2 instanceof String) {
                                                obj = (String) obj2;
                                            } else {
                                                obj = null;
                                            }
                                            if (obj == null) {
                                                Log.w("UserMessagingPlatform", "No default metadata");
                                            } else if (obj instanceof Boolean) {
                                                map3.put(str3, true != ((Boolean) obj).booleanValue() ? "DENIED" : "GRANTED");
                                            } else if (obj instanceof String) {
                                                Log.w("UserMessagingPlatform", "Failed to get the default eu_consent_policy value.");
                                            } else {
                                                Log.w("UserMessagingPlatform", "Failed to get the default eu_consent_policy value.");
                                            }
                                        }
                                    }
                                }
                            }
                            str8 = str5;
                            num3 = num;
                            it3 = it;
                            break;
                        case "UMP_CoMoAdStoragePurposeConsentStatus":
                            str2 = "google_analytics_default_allow_ad_storage";
                            str4 = "AD_STORAGE";
                            str3 = str4;
                            iIntValue = ((Integer) map2.get(str9)).intValue();
                            str5 = str8;
                            if (iIntValue != -1) {
                                num = num3;
                                if (iIntValue != 1) {
                                    map3.put(str3, "GRANTED");
                                    str8 = str5;
                                    num3 = num;
                                    break;
                                } else {
                                    it = it3;
                                    if (iIntValue != 2) {
                                        map3.put(str3, "DENIED");
                                    } else if (iIntValue != 4) {
                                        if (iIntValue != 5) {
                                            pv1.u(iIntValue, "Invalid CoMo consent status: ", "UserMessagingPlatform");
                                        } else {
                                            if (atomicReference2.get() != null) {
                                                obj = null;
                                            } else if (obj2 instanceof Boolean) {
                                                obj = (Boolean) obj2;
                                            } else if (obj2 instanceof String) {
                                                obj = (String) obj2;
                                            } else {
                                                obj = null;
                                            }
                                            if (obj == null) {
                                                Log.w("UserMessagingPlatform", "No default metadata");
                                            } else if (obj instanceof Boolean) {
                                                map3.put(str3, true != ((Boolean) obj).booleanValue() ? "DENIED" : "GRANTED");
                                            } else if (obj instanceof String) {
                                                Log.w("UserMessagingPlatform", "Failed to get the default eu_consent_policy value.");
                                            } else {
                                                Log.w("UserMessagingPlatform", "Failed to get the default eu_consent_policy value.");
                                            }
                                        }
                                    }
                                }
                            }
                            str8 = str5;
                            num3 = num;
                            it3 = it;
                            break;
                        case "UMP_CoMoAdUserDataPurposeConsentStatus":
                            str2 = "google_analytics_default_allow_ad_user_data";
                            str3 = "AD_USER_DATA";
                            iIntValue = ((Integer) map2.get(str9)).intValue();
                            str5 = str8;
                            if (iIntValue != -1) {
                                num = num3;
                                if (iIntValue != 1) {
                                    map3.put(str3, "GRANTED");
                                    str8 = str5;
                                    num3 = num;
                                    break;
                                } else {
                                    it = it3;
                                    if (iIntValue != 2) {
                                        map3.put(str3, "DENIED");
                                    } else if (iIntValue != 4) {
                                        if (iIntValue != 5) {
                                            pv1.u(iIntValue, "Invalid CoMo consent status: ", "UserMessagingPlatform");
                                        } else {
                                            if (atomicReference2.get() != null) {
                                                obj = null;
                                            } else if (obj2 instanceof Boolean) {
                                                obj = (Boolean) obj2;
                                            } else if (obj2 instanceof String) {
                                                obj = (String) obj2;
                                            } else {
                                                obj = null;
                                            }
                                            if (obj == null) {
                                                Log.w("UserMessagingPlatform", "No default metadata");
                                            } else if (obj instanceof Boolean) {
                                                map3.put(str3, true != ((Boolean) obj).booleanValue() ? "DENIED" : "GRANTED");
                                            } else if (obj instanceof String) {
                                                Log.w("UserMessagingPlatform", "Failed to get the default eu_consent_policy value.");
                                            } else {
                                                Log.w("UserMessagingPlatform", "Failed to get the default eu_consent_policy value.");
                                            }
                                        }
                                    }
                                }
                            }
                            str8 = str5;
                            num3 = num;
                            it3 = it;
                            break;
                        default:
                            str5 = str8;
                            num = num3;
                            it = it3;
                            str8 = str5;
                            num3 = num;
                            it3 = it;
                            break;
                    }
                }
            }
            Log.d("UserMessagingPlatform", "Update Firebase: ".concat(map3.toString()));
            HashMap map4 = new HashMap();
            for (String str10 : map3.keySet()) {
                try {
                    try {
                        map4.put((Enum) ((Method) atomicReference3.get()).invoke(null, str10), (Enum) ((Method) atomicReference4.get()).invoke(null, map3.get(str10)));
                    } catch (Exception e3) {
                        e = e3;
                        Log.w("UserMessagingPlatform", "Failed to invoke the Firebase static method.", e);
                    }
                } catch (Exception e4) {
                    e = e4;
                }
            }
            if (atomicReference5.get() != null && !map4.isEmpty()) {
                try {
                    ((Method) atomicReference5.get()).invoke(atomicReference6.get(), map4);
                } catch (Exception e5) {
                    Log.w("UserMessagingPlatform", "Failed to invoke Firebase method. ", e5);
                }
            }
        }
        map2.clear();
        return true;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final Executor zza() {
        return this.d;
    }

    public zzao(Application application, zzaq zzaqVar, zzl zzlVar, Executor executor) {
        this.a = application;
        this.b = zzaqVar;
        this.d = executor;
        this.c = zzlVar;
    }
}
