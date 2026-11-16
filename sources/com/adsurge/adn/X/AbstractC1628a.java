package com.adsurge.adn.X;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.ironsource.R6;
import java.io.IOException;

/* JADX INFO: renamed from: com.adsurge.adn.X.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC1628a {
    public static String a = "";

    /* JADX INFO: renamed from: com.adsurge.adn.X.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class RunnableC0095a implements Runnable {
        public final /* synthetic */ Context a;

        public RunnableC0095a(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AbstractC1628a.a = AdvertisingIdClient.getAdvertisingIdInfo(this.a).getId();
            } catch (GooglePlayServicesNotAvailableException e) {
                e.getMessage();
            } catch (GooglePlayServicesRepairableException e2) {
                e2.getMessage();
            } catch (IOException e3) {
                e3.getMessage();
            } catch (Exception e4) {
                e4.getMessage();
            }
        }
    }

    public static void a(Context context) {
        if (com.adsurge.adn.K.b.a(R6.X0)) {
            return;
        }
        q.c.submit(new RunnableC0095a(context));
    }

    public static String a() {
        if (com.adsurge.adn.K.b.f().i()) {
            return null;
        }
        return a;
    }
}
