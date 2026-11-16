package com.google.firebase.crashlytics.internal.common;

import android.util.Log;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class CrashlyticsFileMarker {
    public final String a;
    public final FileStore b;

    public final void a() {
        String str = this.a;
        try {
            FileStore fileStore = this.b;
            fileStore.getClass();
            new File(fileStore.c, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    public CrashlyticsFileMarker(FileStore fileStore, String str) {
        this.a = str;
        this.b = fileStore;
    }
}
