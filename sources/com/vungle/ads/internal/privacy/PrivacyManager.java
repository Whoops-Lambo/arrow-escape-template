package com.vungle.ads.internal.privacy;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.ironsource.C4664b4;
import com.ironsource.C4671bb;
import com.ironsource.C4788i2;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.ServiceLocator;
import com.vungle.ads.internal.model.o2;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import defpackage.j52;
import defpackage.k52;
import defpackage.s71;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/privacy/PrivacyManager;", "", "Lcom/vungle/ads/internal/privacy/PrivacyConsent;", C4664b4.j.b0, "Laz2;", "updateCcpaConsent", "(Lcom/vungle/ads/internal/privacy/PrivacyConsent;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class PrivacyManager {

    @NotNull
    public static final PrivacyManager INSTANCE = new PrivacyManager();
    public static final AtomicReference a = new AtomicReference();
    public static final AtomicReference b = new AtomicReference();
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static String d;
    public static String e;
    public static String f;
    public static Long g;
    public static PrivacyConsent h;
    public static FilePreferences i;
    public static SharedPreferences j;

    public final synchronized void a(Context context) {
        context.getClass();
        AtomicBoolean atomicBoolean = c;
        if (atomicBoolean.get()) {
            boolean z = u.a;
            t.c("PrivacyManager", "PrivacyManager already initialized");
            return;
        }
        j = PreferenceManager.getDefaultSharedPreferences(context);
        FilePreferences filePreferences = (FilePreferences) ServiceLocator.d.a(context).getService(FilePreferences.class);
        i = filePreferences;
        AtomicReference atomicReference = a;
        Boolean bool = (Boolean) atomicReference.get();
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            FilePreferences filePreferences2 = i;
            if (filePreferences2 != null) {
                filePreferences2.a(zBooleanValue, "disable_ad_id").b();
            }
        } else {
            Boolean boolA = filePreferences.a("disable_ad_id");
            if (boolA != null) {
                atomicReference.set(boolA);
            }
        }
        String str = d;
        if (str != null) {
            String str2 = e;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = f;
            if (str3 == null) {
                str3 = "";
            }
            Long l = g;
            long jLongValue = l != null ? l.longValue() : 0L;
            FilePreferences filePreferences3 = i;
            if (filePreferences3 != null) {
                filePreferences3.a("gdpr_status", str).a("gdpr_source", str2).a("gdpr_message_version", str3).b("gdpr_timestamp", jLongValue).b();
            }
        } else {
            String string = filePreferences.getString("gdpr_status");
            PrivacyConsent privacyConsent = PrivacyConsent.OPT_IN;
            if (s71.b(string, privacyConsent.getValue())) {
                string = privacyConsent.getValue();
            } else {
                PrivacyConsent privacyConsent2 = PrivacyConsent.OPT_OUT;
                if (s71.b(string, privacyConsent2.getValue())) {
                    string = privacyConsent2.getValue();
                }
            }
            d = string;
            e = filePreferences.getString("gdpr_source");
            f = filePreferences.getString("gdpr_message_version");
            g = Long.valueOf(filePreferences.a("gdpr_timestamp", 0L));
        }
        PrivacyConsent privacyConsent3 = h;
        if (privacyConsent3 != null) {
            FilePreferences filePreferences4 = i;
            if (filePreferences4 != null) {
                filePreferences4.a("ccpa_status", privacyConsent3.getValue()).b();
            }
        } else {
            String string2 = filePreferences.getString("ccpa_status");
            PrivacyConsent privacyConsent4 = PrivacyConsent.OPT_OUT;
            if (!s71.b(privacyConsent4.getValue(), string2)) {
                privacyConsent4 = PrivacyConsent.OPT_IN;
            }
            h = privacyConsent4;
        }
        AtomicReference atomicReference2 = b;
        Boolean bool2 = (Boolean) atomicReference2.get();
        if (bool2 != null) {
            boolean zBooleanValue2 = bool2.booleanValue();
            FilePreferences filePreferences5 = i;
            if (filePreferences5 != null) {
                filePreferences5.a(zBooleanValue2, C4671bb.G).b();
            }
        } else {
            Boolean boolA2 = filePreferences.a(C4671bb.G);
            if (boolA2 != null) {
                atomicReference2.set(boolA2);
            }
        }
        atomicBoolean.set(true);
    }

    public static String b() {
        String str = d;
        return str == null ? "unknown" : str;
    }

    public static COPPA c() {
        AtomicReference atomicReference = b;
        if (atomicReference.get() == null) {
            return COPPA.COPPA_NOTSET;
        }
        if (s71.b(atomicReference.get(), Boolean.TRUE)) {
            return COPPA.COPPA_ENABLED;
        }
        return s71.b(atomicReference.get(), Boolean.FALSE) ? COPPA.COPPA_DISABLED : COPPA.COPPA_NOTSET;
    }

    public static Boolean d() {
        Object j52Var;
        String string;
        try {
            SharedPreferences sharedPreferences = j;
            j52Var = sharedPreferences != null ? Integer.valueOf(sharedPreferences.getInt("IABTCF_gdprApplies", -1)) : null;
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        if (k52.b(j52Var) != null) {
            try {
                SharedPreferences sharedPreferences2 = j;
                j52Var = (sharedPreferences2 == null || (string = sharedPreferences2.getString("IABTCF_gdprApplies", C4788i2.f)) == null) ? null : Integer.valueOf(Integer.parseInt(string));
            } catch (Throwable th2) {
                j52Var = new j52(th2);
            }
        }
        if (j52Var instanceof j52) {
            j52Var = null;
        }
        Integer num = (Integer) j52Var;
        if (num != null && num.intValue() == 1) {
            return Boolean.TRUE;
        }
        if (num != null && num.intValue() == 0) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static boolean e() {
        Boolean bool;
        int iA = com.vungle.ads.internal.u.a(a());
        if (iA != 0) {
            if (iA != 1) {
                if (iA != 2) {
                    e.b();
                    return false;
                }
                bool = (Boolean) a.get();
                if (bool == null) {
                }
            }
        } else {
            bool = (Boolean) a.get();
            if (bool == null && !bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    public static boolean f() {
        int i2;
        SharedPreferences sharedPreferences;
        String strC;
        String str;
        String string;
        FilePreferences filePreferences;
        FilePreferences filePreferences2;
        if (s71.b(d(), Boolean.TRUE)) {
            ConfigManager.INSTANCE.getClass();
            o2 o2VarP = ConfigManager.p();
            if (o2VarP == null) {
                i2 = -1;
            } else {
                i2 = a.a[o2VarP.ordinal()];
            }
            if (i2 != -1) {
                if (i2 != 1 && i2 != 2) {
                    if (i2 != 3) {
                        e.b();
                        return false;
                    }
                    sharedPreferences = j;
                    strC = null;
                    str = "";
                    if (sharedPreferences != null) {
                        string = sharedPreferences.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, "");
                    } else {
                        string = null;
                    }
                    if (string != null) {
                        str = string;
                    }
                    filePreferences = i;
                    if (filePreferences != null) {
                        strC = filePreferences.c();
                    }
                    if (!s71.b(strC, str)) {
                        if (str.length() != 0) {
                            filePreferences2.a("previous_tcf_token", str).b();
                        }
                    }
                }
            } else {
                sharedPreferences = j;
                strC = null;
                str = "";
                if (sharedPreferences != null) {
                    string = sharedPreferences.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, "");
                } else {
                    string = null;
                }
                if (string != null) {
                    str = string;
                }
                filePreferences = i;
                if (filePreferences != null) {
                    strC = filePreferences.c();
                }
                if (!s71.b(strC, str)) {
                    if (str.length() != 0 && (filePreferences2 = i) != null) {
                        filePreferences2.a("previous_tcf_token", str).b();
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void updateCcpaConsent(@NotNull PrivacyConsent consent) {
        consent.getClass();
        h = consent;
        FilePreferences filePreferences = i;
        if (filePreferences != null) {
            filePreferences.a("ccpa_status", consent.getValue()).b();
        }
    }

    public static void a(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        d = str;
        e = str2;
        f = str3;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        g = Long.valueOf(jCurrentTimeMillis);
        String str4 = f;
        if (str4 == null) {
            str4 = "";
        }
        FilePreferences filePreferences = i;
        if (filePreferences != null) {
            filePreferences.a("gdpr_status", str).a("gdpr_source", str2).a("gdpr_message_version", str4).b("gdpr_timestamp", jCurrentTimeMillis).b();
        }
    }

    public static void a(boolean z) {
        a.set(Boolean.valueOf(z));
        FilePreferences filePreferences = i;
        if (filePreferences != null) {
            filePreferences.a(z, "disable_ad_id").b();
        }
    }

    public static int a() {
        Boolean boolD = d();
        if (!s71.b(boolD, Boolean.TRUE)) {
            return boolD == null ? 3 : 1;
        }
        ConfigManager.INSTANCE.getClass();
        o2 o2VarP = ConfigManager.p();
        int i2 = o2VarP == null ? -1 : a.a[o2VarP.ordinal()];
        if (i2 != -1) {
            if (i2 == 1) {
                return 2;
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    e.b();
                    return 0;
                }
            }
        }
    }
}
