package com.ironsource;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.unity3d.mediation.LevelPlay;
import defpackage.h50;
import defpackage.n30;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class If {
    private static final Map<IronSource.a, C4946r0> a = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class b {
        private final IronSource.a a;

        private String b() {
            IronSource.a aVar = this.a;
            return aVar != null ? aVar.name() : "";
        }

        public String a(String str, String str2) {
            StringBuilder sb = new StringBuilder();
            sb.append(b());
            sb.append(TextUtils.isEmpty(str2) ? "" : n30.y(" - ", str2));
            String string = sb.toString();
            return TextUtils.isEmpty(str) ? string : h50.i(string, " - ", str);
        }

        public b(IronSource.a aVar) {
            this.a = aVar;
        }

        public String a(String str) {
            return a(str, null);
        }

        public String a() {
            return a(null);
        }
    }

    public static IronSource.a b(LevelPlay.AdFormat adFormat) {
        if (adFormat == null) {
            return null;
        }
        int i = a.b[adFormat.ordinal()];
        if (i == 1) {
            return IronSource.a.REWARDED_VIDEO;
        }
        if (i == 2) {
            return IronSource.a.INTERSTITIAL;
        }
        if (i == 3) {
            return IronSource.a.BANNER;
        }
        if (i != 4) {
            return null;
        }
        return IronSource.a.NATIVE_AD;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            b = iArr;
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[IronSource.a.values().length];
            a = iArr2;
            try {
                iArr2[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[IronSource.a.NATIVE_AD.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[IronSource.a.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static boolean a(AdapterBaseInterface adapterBaseInterface, IronSource.a aVar, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !(adapterBaseInterface instanceof AdapterSettingsInterface) || !((AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(a(aVar))) {
            return false;
        }
        ironLog.verbose(str + " - is using activity before impression and activity is null");
        return true;
    }

    public static int c(IronSource.a aVar) {
        int i = a.a[aVar.ordinal()];
        if (i == 1) {
            return AbstractC4949r3.e.REWARDED_VIDEO.b();
        }
        if (i == 2) {
            return AbstractC4949r3.e.INTERSTITIAL.b();
        }
        if (i != 3) {
            return i != 4 ? AbstractC4949r3.e.NOT_SUPPORTED.b() : AbstractC4949r3.e.BANNER.b();
        }
        return AbstractC4949r3.e.NATIVE_AD.b();
    }

    public static b b(IronSource.a aVar) {
        return new b(aVar);
    }

    private static C4946r0 a(AbstractC5054x0 abstractC5054x0) {
        Map<IronSource.a, C4946r0> map = a;
        if (map.containsKey(abstractC5054x0.b().a())) {
            return map.get(abstractC5054x0.b().a());
        }
        C4946r0 c4946r0 = new C4946r0();
        map.put(abstractC5054x0.b().a(), c4946r0);
        return c4946r0;
    }

    public static C4796ia a() {
        return com.ironsource.mediationsdk.p.g().m();
    }

    public static void a(Throwable th) {
        IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "SafeRunnable", th);
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put("reason", th.getMessage());
        } catch (JSONException e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        a(D5.TROUBLESHOOTING_SDK_INTERNAL_ERROR, jSONObjectJsonObjectInit);
    }

    public static void a(Exception exc) {
        IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "Exception", exc);
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put("reason", exc.getMessage());
        } catch (JSONException e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        a(D5.TROUBLESHOOTING_LOAD_ARM_DATA_PARSE_ERROR, jSONObjectJsonObjectInit);
    }

    public static void a(D5 d5, JSONObject jSONObject) {
        Pb.k0().q().a(new C5(d5, C4921pa.a(IronSourceUtils.b(false), jSONObject)));
    }

    public static Q0 a(AbstractC5054x0 abstractC5054x0, int i) {
        return a(abstractC5054x0).a(abstractC5054x0.b().c(), abstractC5054x0.n(), i);
    }

    public static String a(LevelPlay.AdFormat adFormat) {
        int i = a.b[adFormat.ordinal()];
        if (i == 1) {
            return "rewarded";
        }
        if (i == 2) {
            return "interstitial";
        }
        if (i == 3) {
            return "banner";
        }
        if (i != 4) {
            return "";
        }
        return "nativeAd";
    }

    public static LevelPlay.AdFormat a(IronSource.a aVar) {
        int i = a.a[aVar.ordinal()];
        if (i == 1) {
            return LevelPlay.AdFormat.REWARDED;
        }
        if (i == 2) {
            return LevelPlay.AdFormat.INTERSTITIAL;
        }
        if (i == 3) {
            return LevelPlay.AdFormat.NATIVE_AD;
        }
        if (i != 4) {
            return null;
        }
        return LevelPlay.AdFormat.BANNER;
    }
}
