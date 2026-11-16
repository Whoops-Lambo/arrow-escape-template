package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Calendar;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ḟ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C1038 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0992 f3018;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ MotionEvent f3019;

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        try {
            int iRound = Math.round(this.f3019.getRawX());
            int iRound2 = Math.round(this.f3019.getRawY());
            String str = AbstractC1334.f4001;
            if (iRound >= 0 && iRound2 >= 0 && iRound <= AbstractC1125.m833(AbstractC1334.m970(), false).optInt(AbstractC1334.f3994) && iRound2 <= AbstractC1125.m833(AbstractC1334.m970(), false).optInt(AbstractC1334.f3993)) {
                String str2 = AbstractC0388.f814;
                C4648w c4648w = new C4648w(iRound, iRound2, Calendar.getInstance().getTimeInMillis(), SystemClock.elapsedRealtime());
                C0992 c0992 = this.f3018;
                synchronized (c0992) {
                    c0992.f2828 = c4648w;
                }
                return;
            }
            AbstractC0509.m488(StringFog.decrypt("A5uvslOAgdExlKicW5+h2yqSsoNXnqPXJ5I=\n", "RPfA0DLs1b4=\n"), StringFog.decrypt("EM1wTIfdiQUhzHEPnZiPFi3UYEvPkpkHZM1jD42SmR0g0SVMgJKeFy3MZFuKjtZTPw==\n", "RKIFL+/97HM=\n") + iRound + StringFog.decrypt("QNc=\n", "bPeWAlAU51M=\n") + iRound2 + StringFog.decrypt("5g==\n", "m8RoUhtjJ2A=\n"));
        } catch (Throwable th) {
            AbstractC1290.m905(StringFog.decrypt("5kO39QCFilbUTLDbCJqqXM9KqsQEm6hQwko=\n", "oS/Yl2Hp3jk=\n"), StringFog.decrypt("IB1smedONQtFAHCi+hs/DQ==\n", "ZW8e9pVuXGU=\n"), th, false);
        }
    }

    public C1038(C0992 c0992, MotionEvent motionEvent) {
        this.f3018 = c0992;
        this.f3019 = motionEvent;
    }
}
