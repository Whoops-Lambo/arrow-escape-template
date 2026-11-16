package com.vungle.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.vungle.ads.LinkError;
import com.vungle.ads.internal.protos.Sdk;
import java.net.URISyntaxException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class l {
    public static boolean a(String str, String str2, Context context, s sVar, com.vungle.ads.internal.ui.m mVar) {
        context.getClass();
        if ((str != null && str.length() != 0) || (str2 != null && str2.length() != 0)) {
            boolean z = !(context instanceof Activity);
            try {
                Intent intentA = a(z, str);
                Intent intentA2 = a(z, str2);
                d dVar = d.f;
                return a.a(context, intentA, intentA2, mVar);
            } catch (Exception e) {
                if (str != null && str.length() != 0) {
                    new LinkError(Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED, com.iab.omid.library.vungle.d.a("Fail to open ", str)).setLogEntry$vungle_ads_release(sVar).logErrorNoReturnValue$vungle_ads_release();
                } else {
                    new LinkError(Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED, com.iab.omid.library.vungle.d.a("Fail to open ", str2)).setLogEntry$vungle_ads_release(sVar).logErrorNoReturnValue$vungle_ads_release();
                }
                boolean z2 = u.a;
                StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Error while opening url");
                sbA.append(e.getLocalizedMessage());
                t.b("ExternalRouter", sbA.toString());
                t.a("ExternalRouter", "Cannot open url " + str2);
            }
        }
        return false;
    }

    public static Intent a(boolean z, String str) {
        Intent uri = null;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    uri = Intent.parseUri(str, 0);
                }
                if (uri != null && z) {
                    uri.setFlags(268435456);
                    return uri;
                }
            } catch (URISyntaxException e) {
                boolean z2 = u.a;
                StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("url format is not correct ");
                sbA.append(e.getLocalizedMessage());
                t.b("ExternalRouter", sbA.toString());
            }
        } else if (uri != null) {
            uri.setFlags(268435456);
            return uri;
        }
        return uri;
    }
}
