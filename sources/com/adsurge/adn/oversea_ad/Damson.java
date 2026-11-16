package com.adsurge.adn.oversea_ad;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class Damson implements Norma {
    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    @Override // com.adsurge.adn.oversea_ad.Norma
    public final Codlin a(Context context) {
        Uri uri = Uri.parse(CanisMinor.a(CanisMinor.v0));
        String strA = CanisMinor.a(CanisMinor.a);
        ContentProviderClient contentProviderClientAcquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(uri);
        Bundle bundleCall = null;
        try {
            bundleCall = contentProviderClientAcquireContentProviderClient.call(strA, null, null);
        } catch (Throwable unused) {
            if (contentProviderClientAcquireContentProviderClient != null) {
            }
            if (bundleCall == null) {
                return new Codlin("");
            }
            return bundleCall.getInt(CanisMinor.a(CanisMinor.w0), -1) != 0 ? new Codlin("") : new Codlin(bundleCall.getString(CanisMinor.a(CanisMinor.x0)));
        }
        contentProviderClientAcquireContentProviderClient.close();
        if (bundleCall == null) {
            return new Codlin("");
        }
        if (bundleCall.getInt(CanisMinor.a(CanisMinor.w0), -1) != 0) {
        }
    }
}
