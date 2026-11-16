package com.google.firebase.crashlytics.internal.common;

import android.util.Log;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import defpackage.ls;
import defpackage.mz;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class CrashlyticsAppQualitySessionsSubscriber {
    public final DataCollectionArbiter a;
    public final ls b;

    public final String a(String str) {
        String strSubstring;
        ls lsVar = this.b;
        synchronized (lsVar) {
            if (Objects.equals((String) lsVar.c, str)) {
                return (String) lsVar.d;
            }
            FileStore fileStore = (FileStore) lsVar.b;
            mz mzVar = ls.e;
            File file = new File(fileStore.d, str);
            file.mkdirs();
            List listF = FileStore.f(file.listFiles(mzVar));
            if (listF.isEmpty()) {
                strSubstring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                strSubstring = ((File) Collections.min(listF, ls.f)).getName().substring(4);
            }
            return strSubstring;
        }
    }

    public final void b(String str) {
        ls lsVar = this.b;
        synchronized (lsVar) {
            if (!Objects.equals((String) lsVar.c, str)) {
                ls.G((FileStore) lsVar.b, str, (String) lsVar.d);
                lsVar.c = str;
            }
        }
    }

    public CrashlyticsAppQualitySessionsSubscriber(DataCollectionArbiter dataCollectionArbiter, FileStore fileStore) {
        this.a = dataCollectionArbiter;
        this.b = new ls(fileStore);
    }
}
