package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzabw;
import com.google.android.gms.internal.measurement.zzabx;
import defpackage.d31;
import defpackage.d42;
import defpackage.mg2;
import defpackage.t45;
import defpackage.y32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzof {
    public static final y32 a = d31.H("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final int c(zzabw zzabwVar) {
        if (zzabwVar == zzabw.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (zzabwVar == zzabw.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (zzabwVar == zzabw.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return zzabwVar == zzabw.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final boolean b(zzabw zzabwVar, d42 d42Var, d42 d42Var2, mg2 mg2Var, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
        t45 t45Var;
        char c;
        int iC = c(zzabwVar);
        if (iC > 0 && (i2 != 1 || i != 1)) {
            cArr[iC] = '2';
        }
        if (g(zzabwVar, d42Var2) == zzabx.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c = '3';
        } else {
            if (zzabwVar == zzabw.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i3 == 1 && mg2Var.d.equals(str)) {
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = '1';
                }
                return true;
            }
            if (!d42Var.containsKey(zzabwVar) || (t45Var = (t45) d42Var.get(zzabwVar)) == null) {
                c = '0';
            } else {
                int iOrdinal = t45Var.ordinal();
                zzabx zzabxVar = zzabx.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (iOrdinal != 0) {
                    zzabx zzabxVar2 = zzabx.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            if (iOrdinal == 3) {
                                if (g(zzabwVar, d42Var2) == zzabxVar2) {
                                    return e(zzabwVar, cArr, str2, z);
                                }
                                return f(zzabwVar, cArr, str3, z2);
                            }
                            c = '0';
                        } else {
                            if (g(zzabwVar, d42Var2) == zzabxVar) {
                                return f(zzabwVar, cArr, str3, z2);
                            }
                            return e(zzabwVar, cArr, str2, z);
                        }
                    } else if (g(zzabwVar, d42Var2) != zzabxVar2) {
                        return f(zzabwVar, cArr, str3, z2);
                    }
                } else if (g(zzabwVar, d42Var2) != zzabxVar) {
                    return e(zzabwVar, cArr, str2, z);
                }
                c = '8';
            }
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c;
            return false;
        }
        return false;
    }

    public static final String d(zzabw zzabwVar, String str, String str2) {
        String strValueOf;
        String strValueOf2 = "0";
        if (TextUtils.isEmpty(str) || str.length() < zzabwVar.zza()) {
            strValueOf = "0";
        } else {
            strValueOf = String.valueOf(str.charAt(zzabwVar.zza() - 1));
        }
        if (!TextUtils.isEmpty(str2) && str2.length() >= zzabwVar.zza()) {
            strValueOf2 = String.valueOf(str2.charAt(zzabwVar.zza() - 1));
        }
        return String.valueOf(strValueOf).concat(String.valueOf(strValueOf2));
    }

    public static final boolean e(zzabw zzabwVar, char[] cArr, String str, boolean z) {
        char c;
        int iC = c(zzabwVar);
        boolean z2 = false;
        if (!z) {
            c = '4';
        } else if (str.length() < zzabwVar.zza()) {
            c = '0';
        } else {
            char cCharAt = str.charAt(zzabwVar.zza() - 1);
            char c2 = '1';
            if (cCharAt == '1') {
                z2 = true;
            }
            if (iC > 0 && cArr[iC] != '2') {
                if (cCharAt != '1') {
                    c2 = '6';
                }
                cArr[iC] = c2;
            }
            return z2;
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c;
        }
        return false;
    }

    public static final boolean f(zzabw zzabwVar, char[] cArr, String str, boolean z) {
        char c;
        int iC = c(zzabwVar);
        boolean z2 = false;
        if (!z) {
            c = '5';
        } else if (str.length() < zzabwVar.zza()) {
            c = '0';
        } else {
            char cCharAt = str.charAt(zzabwVar.zza() - 1);
            char c2 = '1';
            if (cCharAt == '1') {
                z2 = true;
            }
            if (iC > 0 && cArr[iC] != '2') {
                if (cCharAt != '1') {
                    c2 = '7';
                }
                cArr[iC] = c2;
            }
            return z2;
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c;
        }
        return false;
    }

    public static final zzabx g(zzabw zzabwVar, d42 d42Var) {
        Object obj = d42Var.get(zzabwVar);
        if (obj == null) {
            obj = zzabx.PURPOSE_RESTRICTION_UNDEFINED;
        }
        return (zzabx) obj;
    }
}
