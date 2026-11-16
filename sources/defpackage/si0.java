package defpackage;

import com.facebook.a0;
import com.facebook.internal.b0;
import com.facebook.internal.z;
import com.facebook.w0;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class si0 {
    public static boolean a;

    public static final void a(Throwable th) {
        HashMap map;
        z zVar;
        if (a) {
            HashSet hashSet = new HashSet();
            StackTraceElement[] stackTrace = th.getStackTrace();
            stackTrace.getClass();
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                className.getClass();
                synchronized (b0.a) {
                    map = b0.b;
                    if (map.isEmpty()) {
                        map.put(z.AAM, new String[]{"com.facebook.appevents.aam."});
                        map.put(z.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
                        map.put(z.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
                        map.put(z.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
                        map.put(z.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
                        map.put(z.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
                        map.put(z.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
                        map.put(z.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                        map.put(z.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                        map.put(z.ProtectedMode, new String[]{"com.facebook.appevents.integrity.ProtectedModeManager"});
                        map.put(z.MACARuleMatching, new String[]{"com.facebook.appevents.integrity.MACARuleMatchingManager"});
                        map.put(z.BlocklistEvents, new String[]{"com.facebook.appevents.integrity.BlocklistEventsManager"});
                        map.put(z.FilterRedactedEvents, new String[]{"com.facebook.appevents.integrity.RedactedEventsManager"});
                        map.put(z.FilterSensitiveParams, new String[]{"com.facebook.appevents.integrity.SensitiveParamsManager"});
                        map.put(z.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
                        map.put(z.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
                        map.put(z.IapLogging, new String[]{"com.facebook.appevents.iap."});
                        map.put(z.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
                        map.put(z.GPSARATriggers, new String[]{"com.facebook.appevents.gps.ara.GpsARAManager"});
                        map.put(z.GPSPACAProcessing, new String[]{"com.facebook.appevents.gps.pa.PACustomAudienceClient"});
                        map.put(z.GPSTopicsObservation, new String[]{"com.facebook.appevents.gps.topics.GpsTopicsManager"});
                        map.put(z.VVP, new String[]{"com.facebook.appevents.integrity.VVPManager"});
                    }
                }
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zVar = z.Unknown;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    zVar = (z) entry.getKey();
                    for (String str : (String[]) entry.getValue()) {
                        if (kk2.L(className, str, false)) {
                            break;
                        }
                    }
                }
                if (zVar != z.Unknown) {
                    zVar.getClass();
                    a0.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString("FBSDKFeature" + zVar, "18.3.0").apply();
                    hashSet.add(zVar.toString());
                }
            }
            a0 a0Var = a0.a;
            if (!w0.c() || hashSet.isEmpty()) {
                return;
            }
            JSONArray jSONArray = new JSONArray((Collection) hashSet);
            y61 y61Var = new y61();
            y61Var.b = w61.b;
            Long lValueOf = Long.valueOf(System.currentTimeMillis() / 1000);
            y61Var.g = lValueOf;
            y61Var.c = jSONArray;
            StringBuffer stringBuffer = new StringBuffer("analysis_log_");
            stringBuffer.append(String.valueOf(lValueOf));
            stringBuffer.append(".json");
            String string = stringBuffer.toString();
            string.getClass();
            y61Var.a = string;
            y61Var.b();
        }
    }
}
