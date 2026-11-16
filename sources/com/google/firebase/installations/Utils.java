package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import defpackage.t40;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Utils {
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static Utils c;
    public final t40 a;

    public Utils(t40 t40Var) {
        this.a = t40Var;
    }

    public final boolean a(PersistedInstallationEntry persistedInstallationEntry) {
        if (!TextUtils.isEmpty(persistedInstallationEntry.a())) {
            long jB = persistedInstallationEntry.b() + persistedInstallationEntry.g();
            this.a.getClass();
            if (jB < (System.currentTimeMillis() / 1000) + 3600) {
                return true;
            }
            return false;
        }
        return true;
    }
}
