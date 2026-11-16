package com.google.android.gms.internal.ads;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C4664b4;
import defpackage.jc1;
import defpackage.pv1;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzguy {
    public final String a;

    public static String e(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                String strJoin = TextUtils.join(", ", objArr);
                int length = str2.length();
                str2 = pv1.p(new StringBuilder(String.valueOf(strJoin).length() + length + 2 + 1), str2, " [", strJoin, C4664b4.j.e);
            }
        }
        return jc1.o(str, " : ", new StringBuilder(str.length() + 3 + str2.length()), str2);
    }

    public final void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", e(this.a, str, objArr));
        }
    }

    public final void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", e(this.a, str, objArr));
        }
    }

    public final void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", e(this.a, str, objArr));
        }
    }

    public final void d(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", e(this.a, str, objArr), remoteException);
        }
    }

    public zzguy(String str) {
        int iMyUid = Process.myUid();
        int iMyPid = Process.myPid();
        StringBuilder sb = new StringBuilder(String.valueOf(iMyUid).length() + 15 + String.valueOf(iMyPid).length() + 2);
        pv1.s(iMyUid, iMyPid, "UID: [", "]  PID: [", sb);
        sb.append("] ");
        this.a = sb.toString().concat(str);
    }
}
