package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.inject.Provider;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public interface zzaex {
    public static final Logger d9 = new Logger("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    void a(Status status);

    Uri.Builder b(Intent intent, String str, String str2);

    HttpURLConnection c(URL url);

    void d(Uri uri, String str, Provider provider);

    Context zza();

    String zza(String str);
}
