package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.LibraryVersion;
import com.ironsource.C4788i2;
import defpackage.n30;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzafh {
    public final int a;

    public static zzafh a() throws Throwable {
        String version = LibraryVersion.getInstance().getVersion("firebase-auth");
        if (TextUtils.isEmpty(version) || version.equals("UNKNOWN")) {
            version = C4788i2.f;
        }
        return new zzafh(version);
    }

    public final String b() {
        return n30.y("X", Integer.toString(this.a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005e -> B:16:0x005f). Please report as a decompilation issue!!! */
    public zzafh(String str) {
        ?? r0 = 3;
        r0 = 3;
        r0 = 3;
        ?? r1 = 3;
        try {
            List listC = zzt.a().c(str);
            if (listC.size() == 1) {
                str = Integer.parseInt(str);
            } else if (listC.size() >= 3) {
                str = Integer.parseInt((String) listC.get(2)) + (Integer.parseInt((String) listC.get(1)) * 1000) + (Integer.parseInt((String) listC.get(0)) * 1000000);
            } else {
                str = -1;
                r0 = r1;
            }
        } catch (IllegalArgumentException e) {
            boolean zIsLoggable = Log.isLoggable("LibraryVersionContainer", r0);
            r1 = zIsLoggable;
            if (zIsLoggable) {
                Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", str, e));
                r1 = "Version code parsing failed for: %s with exception %s.";
            }
        }
        this.a = str;
    }
}
