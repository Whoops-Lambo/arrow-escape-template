package com.google.firebase.installations.local;

import androidx.datastore.preferences.core.Preferences;
import com.google.firebase.FirebaseApp;
import defpackage.z81;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class IidStore {
    public static final Preferences.Key c = new Preferences.Key("|S||P|");
    public static final Preferences.Key d = new Preferences.Key("|S|id");
    public static final String[] e = {"*", "FCM", "GCM", ""};
    public final z81 a;
    public final String b;

    /* JADX WARN: Code duplicated, block: B:12:0x003f  */
    public IidStore(FirebaseApp firebaseApp) {
        this.a = new z81(firebaseApp.getApplicationContext(), "com.google.android.gms.appid");
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId == null) {
            gcmSenderId = firebaseApp.getOptions().getApplicationId();
            if (gcmSenderId.startsWith("1:") || gcmSenderId.startsWith("2:")) {
                String[] strArrSplit = gcmSenderId.split(":");
                if (strArrSplit.length != 4) {
                    gcmSenderId = null;
                } else {
                    gcmSenderId = strArrSplit[1];
                    if (gcmSenderId.isEmpty()) {
                        gcmSenderId = null;
                    }
                }
            }
        }
        this.b = gcmSenderId;
    }
}
