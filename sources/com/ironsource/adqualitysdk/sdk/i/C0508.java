package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.Κ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class C0508 {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static final String f1138 = StringFog.decrypt("BEXGpb93AL88c/Khq34avwJE+bWseh2kNw==\n", "RSGX0N4bacs=\n");

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final long f1139;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final C4610d0 f1140;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Context f1141;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public JSONObject mo486(JSONObject jSONObject, boolean z, boolean z2, boolean z3) throws JSONException {
        String str;
        String str2;
        if (jSONObject == null) {
            jSONObject = IronSourceNetworkBridge.jsonObjectInit();
        }
        JSONObject jSONObjectM833 = AbstractC1125.m833(jSONObject, false);
        if (!TextUtils.isEmpty(this.f1140.f319)) {
            jSONObjectM833.put(StringFog.decrypt("gNB58lTq\n", "4aAJuTGTc6w=\n"), this.f1140.f319);
        } else if (!TextUtils.isEmpty(this.f1140.f318)) {
            jSONObjectM833.put(StringFog.decrypt("9/9E\n", "kLYgSiHLsuQ=\n"), this.f1140.f318);
        }
        String str3 = this.f1140.f315;
        if (!TextUtils.isEmpty(str3)) {
            jSONObjectM833.put(StringFog.decrypt("kvB3rw==\n", "+4MFzC8/33Y=\n"), str3);
        }
        if (z2) {
            if (this.f1139 > 0) {
                jSONObjectM833.put(StringFog.decrypt("xZaAfg==\n", "qfX0DRMisss=\n"), this.f1139);
            }
            jSONObjectM833.put(StringFog.decrypt("e7BJk20=\n", "GN854wyB82M=\n"), this.f1140.f314);
            jSONObjectM833.put(StringFog.decrypt("e4vp\n", "H+Kdr2Auo4k=\n"), this.f1140.f313);
            String strDecrypt = StringFog.decrypt("bNRM\n", "Gb0oRpAO+WA=\n");
            C4610d0 c4610d0 = this.f1140;
            synchronized (c4610d0) {
                str = c4610d0.f317;
            }
            jSONObjectM833.put(strDecrypt, str);
            jSONObjectM833.put(StringFog.decrypt("GH4=\n", "bR0y5gS40Vw=\n"), this.f1140.f316);
            jSONObjectM833.put(StringFog.decrypt("W5g=\n", "L+JrXAbS0Fw=\n"), ((double) Calendar.getInstance().getTimeZone().getRawOffset()) / 3600000.0d);
            jSONObjectM833.put(StringFog.decrypt("jdVr3Hc=\n", "+aU9uQWwT2o=\n"), IronSourceAdQuality.getSDKVersion());
            String strDecrypt2 = StringFog.decrypt("tA==\n", "wHjTFALTMcE=\n");
            String str4 = AbstractC0719.f1809;
            try {
                try {
                    Class.forName(StringFog.decrypt("dUSJS3LwXRNvGIBLd/JVHnNZyjBp90AeRkeFHGLs\n", "FivkZQeeNGc=\n"));
                    str2 = AbstractC0719.f1803;
                } catch (ClassNotFoundException unused) {
                    Class.forName(StringFog.decrypt("jRlK/SsaukedGVKhIQ37SIoHUrIuAaFQnRJM/TEMvgePH1X9EQe6RIIXc6EjC7BLjxVMljocsEed\nH0i9\n", "7nYn00Jo1Sk=\n"));
                    str2 = AbstractC0719.f1802;
                }
            } catch (ClassNotFoundException unused2) {
                str2 = AbstractC0719.f1801;
            }
            jSONObjectM833.put(strDecrypt2, str2);
            jSONObjectM833.put(StringFog.decrypt("g3XtLco=\n", "7hqJSKZCQkg=\n"), Build.MODEL);
            jSONObjectM833.put(StringFog.decrypt("JpKBlKXAkJA+gYqT\n", "S/Pv4cOh8+Q=\n"), Build.MANUFACTURER);
            jSONObjectM833.put(StringFog.decrypt("kt+0ZDAr4rg=\n", "4rPVEFZEkNU=\n"), StringFog.decrypt("sHVsegB7DA==\n", "0RsICG8SaFw=\n"));
            String strDecrypt3 = StringFog.decrypt("IOo0\n", "T5lC09wrzBI=\n");
            String str5 = AbstractC1334.f4001;
            jSONObjectM833.put(strDecrypt3, Build.VERSION.RELEASE);
            AbstractC0719.m591(this.f1141, jSONObjectM833);
            Context context = this.f1141;
            try {
                if (context.checkCallingOrSelfPermission(StringFog.decrypt("htcZylwVOB+X3A/VWg8vWIjXU/lwPxlitOYq8XU1A2Kz+Cn9\n", "57l9uDN8XDE=\n")) == 0) {
                    AbstractC1125.m835(jSONObjectM833, AbstractC1334.m967(context), false);
                }
            } catch (Throwable th) {
                String str6 = AbstractC1334.f4001;
                AbstractC0509.m497(str6, str6, StringFog.decrypt("Kx2MbrRo4XMKBpBm5j/pcQdPl2+gJ6BjAU+bd6Mm9A==\n", "bm/+AcZIgBc=\n"), th, null, false);
            }
            Context context2 = this.f1141;
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService(StringFog.decrypt("4uhTyx02Gp/37knc\n", "gYc9pXhVbvY=\n"));
                TelephonyManager telephonyManager = (TelephonyManager) context2.getSystemService(StringFog.decrypt("iCfqyMU=\n", "+E+FpqB/Xpg=\n"));
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
                if (networkInfo != null) {
                    jSONObjectM833.put(AbstractC1334.f3987, networkInfo.getState());
                    if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                        jSONObjectM833.put(AbstractC1334.f3986, networkInfo.getType());
                        jSONObjectM833.put(AbstractC1334.f3985, networkInfo.getTypeName());
                        jSONObjectM833.put(AbstractC1334.f3984, networkInfo.getSubtype());
                        jSONObjectM833.put(AbstractC1334.f3983, networkInfo.getSubtypeName());
                        jSONObjectM833.put(AbstractC1334.f3982, telephonyManager.getNetworkOperator());
                        jSONObjectM833.put(AbstractC1334.f3981, telephonyManager.getNetworkOperatorName());
                        jSONObjectM833.put(AbstractC1334.f3980, telephonyManager.getNetworkCountryIso());
                        if (z3) {
                            jSONObjectM833.put(AbstractC1334.f3979, telephonyManager.getSimOperator());
                            jSONObjectM833.put(AbstractC1334.f3978, telephonyManager.getSimOperatorName());
                        }
                    }
                }
            } catch (Throwable th2) {
                String str7 = AbstractC1334.f4001;
                AbstractC0509.m497(str7, str7, StringFog.decrypt("6grFi/YXOgfLEdmDpFo0AcYU0sTtWT0MjwzYxOFBPg3b\n", "r3i35IQ3W2M=\n"), th2, null, false);
            }
            AbstractC1334.m974(jSONObjectM833);
            AbstractC1334.m968(jSONObjectM833);
            jSONObjectM833.put(StringFog.decrypt("YP0DiA==\n", "Dopi/rBReCc=\n"), z);
            AbstractC1334.m973(this.f1141, jSONObjectM833);
            try {
                jSONObjectM833.put(AbstractC1334.f3992, AbstractC1125.m833(AbstractC1334.m970(), false));
            } catch (JSONException unused3) {
            }
            try {
                JSONObject jSONObject2 = new JSONObject(this.f1140.f312);
                jSONObject2.remove(StringFog.decrypt("jCLtzUcLvn+yJPD9TA==\n", "7Uacki5l1ws=\n"));
                jSONObject2.remove(StringFog.decrypt("X1LeKxqQ2BNZWtU2GpfSC09d\n", "KjO6WEXjvWA=\n"));
                if (jSONObject2.length() > 0) {
                    jSONObjectM833.putOpt(StringFog.decrypt("DT20bw==\n", "YEnQG2iCf+0=\n"), jSONObject2);
                }
            } catch (Exception e) {
                String str8 = f1138;
                AbstractC0509.m497(str8, str8, StringFog.decrypt("OZgAFzzWvvQYgxwfbpu65B3KFhk6l//6D4UcWDqZ//UKjxwM\n", "fOpyeE7235A=\n"), e, null, false);
            }
        }
        return jSONObjectM833;
    }

    public C0508(Context context, C4610d0 c4610d0, long j) {
        this.f1141 = context;
        this.f1140 = c4610d0;
        this.f1139 = j;
        new C1200(context);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m487(boolean z) {
        JSONObject jSONObjectMo486 = mo486(IronSourceNetworkBridge.jsonObjectInit(), z, true, false);
        try {
            String string = this.f1141.getSharedPreferences(AbstractC4604b0.f306, 0).getString(AbstractC4604b0.f305, null);
            if (TextUtils.isEmpty(string)) {
                return jSONObjectMo486;
            }
            jSONObjectMo486.put(StringFog.decrypt("MCQbIA==\n", "WUB9SSGoK5Y=\n"), string);
            return jSONObjectMo486;
        } catch (Throwable th) {
            String str = AbstractC4604b0.f307;
            AbstractC0509.m497(str, str, StringFog.decrypt("++K87SOKwi+Y7K3lZ7GLMsz06cAjl8Uy3OugoTOLxTHL4qc=\n", "uI3JgUfk5Vs=\n"), th, null, false);
            return jSONObjectMo486;
        }
    }
}
