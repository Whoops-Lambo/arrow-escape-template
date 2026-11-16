package com.inmobi.media;

import android.content.Context;
import com.iab.omid.library.inmobi.Omid;

/* JADX INFO: renamed from: com.inmobi.media.mg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4217mg {
    public static final /* synthetic */ int a = 0;

    public static boolean a(Context context) {
        context.getClass();
        try {
            if (!Omid.isActive()) {
                Omid.activate(context);
            }
            return Omid.isActive();
        } catch (Throwable th) {
            th.getStackTrace();
            return false;
        }
    }
}
