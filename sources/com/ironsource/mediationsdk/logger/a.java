package com.ironsource.mediationsdk.logger;

import android.os.Looper;
import android.util.Log;
import com.ironsource.C4664b4;
import com.ironsource.environment.ContextProvider;
import defpackage.h50;
import defpackage.jc1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class a extends IronSourceLogger {
    public static final String c = "console";
    public static final String d = "LevelPlaySDK: ";

    private a() {
        super("console");
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        String strN = h50.n(new StringBuilder("UIThread: "), Looper.getMainLooper() == Looper.myLooper(), " ");
        String strP = jc1.p(new StringBuilder("Activity: "), ContextProvider.getInstance().getCurrentActiveActivity() != null ? Integer.valueOf(ContextProvider.getInstance().getCurrentActiveActivity().hashCode()) : Boolean.FALSE, " ");
        if (i == 0) {
            Log.v(d + ironSourceTag, strN + strP + str);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                Log.w(d + ironSourceTag, str);
                return;
            } else if (i == 3) {
                Log.e(d + ironSourceTag, str);
                return;
            } else if (i != 4) {
                return;
            }
        }
        Log.i(d + ironSourceTag, str);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        StringBuilder sbQ = h50.q(str, ":stacktrace[");
        sbQ.append(Log.getStackTraceString(th));
        sbQ.append(C4664b4.j.e);
        log(ironSourceTag, sbQ.toString(), 3);
    }

    public a(int i) {
        super("console", i);
    }
}
