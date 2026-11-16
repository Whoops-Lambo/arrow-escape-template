package com.apm.insight;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.Ba;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements ICrashCallback, IOOMCallback {
    private IOOMCallback a;
    private ICrashCallback b;
    private String c;

    @Override // com.apm.insight.ICrashCallback
    public final void onCrash(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread) {
    }

    public final void a(@NonNull CrashType crashType, @Nullable Throwable th, @Nullable Thread thread, long j, JSONArray jSONArray) {
        CrashType crashType2;
        Throwable th2;
        Thread thread2;
        long j2;
        if (this.a == null || jSONArray == null) {
            return;
        }
        int i = 0;
        while (i < jSONArray.length()) {
            if (TextUtils.equals(a.a(jSONArray.optJSONObject(i), "header", Ba.b), this.c)) {
                crashType2 = crashType;
                th2 = th;
                thread2 = thread;
                j2 = j;
                this.a.onCrash(crashType2, th2, thread2, j2);
            } else {
                crashType2 = crashType;
                th2 = th;
                thread2 = thread;
                j2 = j;
            }
            i++;
            crashType = crashType2;
            th = th2;
            thread = thread2;
            j = j2;
        }
    }

    @Override // com.apm.insight.IOOMCallback
    public final void onCrash(@NonNull CrashType crashType, @Nullable Throwable th, @Nullable Thread thread, long j) {
    }

    public b(String str, ICrashCallback iCrashCallback) {
        this.c = str;
        this.b = iCrashCallback;
    }

    public b(String str, IOOMCallback iOOMCallback) {
        this.c = str;
        this.a = iOOMCallback;
    }

    public final void a(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread, JSONArray jSONArray) {
        if (this.b == null || jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            if (TextUtils.equals(a.a(jSONArray.optJSONObject(i), "header", Ba.b), this.c)) {
                this.b.onCrash(crashType, str, thread);
            }
        }
    }

    public final void a(@NonNull CrashType crashType, @Nullable String str, @Nullable String str2, String str3) {
        d dVarA;
        if (this.b == null || (dVarA = d.a(this.c)) == null || !dVarA.a(str3, str2)) {
            return;
        }
        this.b.onCrash(crashType, str, null);
    }
}
