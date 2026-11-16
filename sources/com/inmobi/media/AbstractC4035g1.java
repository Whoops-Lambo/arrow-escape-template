package com.inmobi.media;

import android.util.Log;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import defpackage.cz;
import defpackage.n30;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.g1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4035g1 implements InterfaceC4508x3, Wn {
    public static final String f = "g1";
    public final cz a;
    public final Y9 b;
    public AdSession c;
    public MediaEvents d;
    public AdEvents e;

    public abstract void a(String str, List list, Map map, String str2, String str3, boolean z);

    public final void b() {
        Y9 y9 = this.b;
        if (y9 != null) {
            ((Z9) y9).a(f, "initAdEvents");
        }
        try {
            this.e = AdEvents.createAdEvents(this.c);
        } catch (IllegalArgumentException e) {
            Y9 y10 = this.b;
            if (y10 != null) {
                ((Z9) y10).a(f, n30.y("Failure initAdEvents: ", Log.getStackTraceString(e)));
            }
        }
    }

    public final void c() {
        Y9 y9 = this.b;
        if (y9 != null) {
            ((Z9) y9).a(f, "initMediaAdEvents");
        }
        try {
            this.d = MediaEvents.createMediaEvents(this.c);
        } catch (IllegalArgumentException e) {
            Y9 y10 = this.b;
            if (y10 != null) {
                ((Z9) y10).a(f, n30.y("Failure initMediaAdEvents: ", Log.getStackTraceString(e)));
            }
        }
    }

    public AbstractC4035g1(cz czVar, Y9 y9) {
        czVar.getClass();
        this.a = czVar;
        this.b = y9;
    }

    public final void a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        adSessionConfiguration.getClass();
        adSessionContext.getClass();
        AdSession adSession = this.c;
        Y9 y9 = this.b;
        if (adSession != null) {
            if (y9 != null) {
                ((Z9) y9).a(f, "initAdSession: adSession is already created");
                return;
            }
            return;
        }
        if (y9 != null) {
            ((Z9) y9).a(f, "initAdSession");
        }
        try {
            this.c = AdSession.createAdSession(adSessionConfiguration, adSessionContext);
        } catch (Exception e) {
            Y9 y10 = this.b;
            if (y10 != null) {
                ((Z9) y10).a(f, "AdSession creation failed. " + e);
            }
        }
    }

    public void a(boolean z) {
    }

    public void a(AbstractC4002eo abstractC4002eo) {
        abstractC4002eo.getClass();
    }

    public final void a(InteractionType interactionType) {
        interactionType.getClass();
        MediaEvents mediaEvents = this.d;
        Y9 y9 = this.b;
        if (mediaEvents == null) {
            if (y9 != null) {
                ((Z9) y9).a(f, "Failed to register adUserInteractionEvent with type: " + interactionType);
                return;
            }
            return;
        }
        if (y9 != null) {
            ((Z9) y9).a(f, "trackAdUserInteractionEvent with type: " + interactionType);
        }
        AbstractC4318q5.a(this.a, new C4007f1(this, interactionType, null));
    }

    public void a() {
    }
}
