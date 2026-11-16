package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.CreativeType;
import com.iab.omid.library.ironsrc.adsession.ImpressionType;
import com.iab.omid.library.ironsrc.adsession.Owner;
import com.iab.omid.library.ironsrc.adsession.Partner;
import com.ironsource.sdk.utils.SDKUtils;
import defpackage.e32;
import defpackage.n30;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class Nc {
    public static final String d = "Ironsrc";
    public static final String e = "7";
    public static final String f = Omid.getVersion();
    public static final String g = "omidVersion";
    public static final String h = "omidPartnerName";
    public static final String i = "omidPartnerVersion";
    public static final String j = "omidActiveAdSessions";
    private static final String k = "Invalid OMID impressionOwner";
    private static final String l = "Invalid OMID videoEventsOwner";
    private static final String m = "Missing OMID impressionOwner";
    private static final String n = "Missing OMID videoEventsOwner";
    private static final String o = "OMID has not been activated";
    private static final String p = "Missing OMID creativeType";
    private static final String q = "Missing adview id in OMID params";
    private static final String r = "No adview found with the provided adViewId";
    private static final String s = "OMID Session has already started";
    private static final String t = "OMID Session has not started";
    private final Partner a = Partner.createPartner(d, e);
    private boolean c = false;
    private final HashMap<String, AdSession> b = new HashMap<>();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        private static final String i = "isolateVerificationScripts";
        private static final String j = "impressionOwner";
        private static final String k = "videoEventsOwner";
        private static final String l = "customReferenceData";
        private static final String m = "creativeType";
        private static final String n = "impressionType";
        public static final String o = "adViewId";
        public boolean a;
        public Owner b;
        public Owner c;
        public String d;
        public ImpressionType e;
        public CreativeType f;
        public String g;
        public Owner h;

        public static a a(JSONObject jSONObject) throws IllegalArgumentException {
            a aVar = new a();
            aVar.a = jSONObject.optBoolean("isolateVerificationScripts", false);
            String strOptString = jSONObject.optString("impressionOwner", "");
            if (TextUtils.isEmpty(strOptString)) {
                defpackage.d.r(Nc.m);
                return null;
            }
            try {
                aVar.b = Owner.valueOf(strOptString.toUpperCase(Locale.getDefault()));
                String strOptString2 = jSONObject.optString("videoEventsOwner", "");
                if (TextUtils.isEmpty(strOptString)) {
                    defpackage.d.r(Nc.n);
                    return null;
                }
                try {
                    aVar.c = Owner.valueOf(strOptString2.toUpperCase(Locale.getDefault()));
                    aVar.d = jSONObject.optString("customReferenceData", "");
                    aVar.f = b(jSONObject);
                    aVar.e = c(jSONObject);
                    aVar.g = e(jSONObject);
                    aVar.h = d(jSONObject);
                    return aVar;
                } catch (IllegalArgumentException e) {
                    C4950r4.d().a(e);
                    defpackage.d.r(n30.y("Invalid OMID videoEventsOwner ", strOptString2));
                    return null;
                }
            } catch (IllegalArgumentException e2) {
                C4950r4.d().a(e2);
                defpackage.d.r(n30.y("Invalid OMID impressionOwner ", strOptString));
                return null;
            }
        }

        private static CreativeType b(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("creativeType", "");
            if (TextUtils.isEmpty(strOptString)) {
                defpackage.d.r(n30.y(Nc.p, strOptString));
                return null;
            }
            for (CreativeType creativeType : CreativeType.values()) {
                if (strOptString.equalsIgnoreCase(creativeType.toString())) {
                    return creativeType;
                }
            }
            defpackage.d.r(n30.y(Nc.p, strOptString));
            return null;
        }

        private static ImpressionType c(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("impressionType", "");
            if (TextUtils.isEmpty(strOptString)) {
                defpackage.d.r(n30.y(Nc.p, strOptString));
                return null;
            }
            for (ImpressionType impressionType : ImpressionType.values()) {
                if (strOptString.equalsIgnoreCase(impressionType.toString())) {
                    return impressionType;
                }
            }
            defpackage.d.r(n30.y(Nc.p, strOptString));
            return null;
        }

        private static Owner d(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("videoEventsOwner", "");
            Owner owner = Owner.NONE;
            try {
                return Owner.valueOf(strOptString.toUpperCase(Locale.getDefault()));
            } catch (IllegalArgumentException e) {
                C4950r4.d().a(e);
                return owner;
            }
        }

        private static String e(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("adViewId", "");
            if (!TextUtils.isEmpty(strOptString)) {
                return strOptString;
            }
            defpackage.d.r(n30.y(Nc.q, strOptString));
            return null;
        }
    }

    public void a(a aVar) throws IllegalStateException, IllegalArgumentException {
        if (!this.c) {
            e32.i(o);
            return;
        }
        if (TextUtils.isEmpty(aVar.g)) {
            e32.i(q);
            return;
        }
        String str = aVar.g;
        if (this.b.containsKey(str)) {
            e32.i(s);
            return;
        }
        L8 l8A = C4937q8.a().a(str);
        if (l8A == null) {
            e32.i(r);
            return;
        }
        AdSession adSessionA = a(aVar, l8A);
        adSessionA.start();
        this.b.put(str, adSessionA);
    }

    public void b(JSONObject jSONObject) throws IllegalStateException {
        a(jSONObject);
        String strOptString = jSONObject.optString("adViewId");
        AdSession adSession = this.b.get(strOptString);
        if (adSession != null) {
            adSession.finish();
            this.b.remove(strOptString);
        } else {
            e32.i(t);
        }
    }

    public void c(JSONObject jSONObject) throws IllegalStateException, IllegalArgumentException {
        a(jSONObject);
        AdSession adSession = this.b.get(jSONObject.optString("adViewId"));
        if (adSession != null) {
            AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSession);
            if (jSONObject.optBoolean("signalLoaded")) {
                adEventsCreateAdEvents.loaded();
            }
            adEventsCreateAdEvents.impressionOccurred();
            return;
        }
        e32.i(t);
    }

    public void d(JSONObject jSONObject) throws IllegalStateException, IllegalArgumentException {
        a(a.a(jSONObject));
    }

    public C4871me a() {
        C4871me c4871me = new C4871me();
        c4871me.b(g, SDKUtils.encodeString(f));
        c4871me.b(h, SDKUtils.encodeString(d));
        c4871me.b(i, SDKUtils.encodeString(e));
        c4871me.b(j, SDKUtils.encodeString(Arrays.toString(this.b.keySet().toArray())));
        return c4871me;
    }

    public void a(Context context) throws IllegalArgumentException {
        if (this.c) {
            return;
        }
        Omid.activate(context);
        this.c = true;
    }

    private AdSession a(a aVar, L8 l8) throws IllegalArgumentException {
        AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(aVar.f, aVar.e, aVar.b, aVar.c, aVar.a), AdSessionContext.createHtmlAdSessionContext(this.a, l8.getPresentingView(), null, aVar.d));
        adSessionCreateAdSession.registerAdView(l8.getPresentingView());
        return adSessionCreateAdSession;
    }

    private void a(JSONObject jSONObject) throws IllegalStateException {
        if (!this.c) {
            e32.i(o);
        } else {
            if (jSONObject != null) {
                return;
            }
            e32.i(t);
        }
    }
}
