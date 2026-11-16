package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.ironsource.qd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4942qd implements Q7, Q7.a {
    private static final String a = "CappingManager.IS_DELIVERY_ENABLED";
    private static final String b = "CappingManager.IS_CAPPING_ENABLED";
    private static final String c = "CappingManager.IS_PACING_ENABLED";
    private static final String d = "CappingManager.MAX_NUMBER_OF_SHOWS";
    private static final String e = "CappingManager.CAPPING_TYPE";
    private static final String f = "CappingManager.SECONDS_BETWEEN_SHOWS";
    private static final String g = "CappingManager.CURRENT_NUMBER_OF_SHOWS";
    private static final String h = "CappingManager.CAPPING_TIME_THRESHOLD";
    private static final String i = "CappingManager.TIME_OF_THE_PREVIOUS_SHOW";

    /* JADX INFO: renamed from: com.ironsource.qd$b */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum b {
        CAPPED_PER_DELIVERY,
        CAPPED_PER_COUNT,
        CAPPED_PER_PACE,
        NOT_CAPPED
    }

    @Override // com.ironsource.Q7
    public synchronized boolean c(Context context, AbstractC4985t3 abstractC4985t3, IronSource.a aVar) {
        return a(context, abstractC4985t3, aVar) != b.NOT_CAPPED;
    }

    /* JADX INFO: renamed from: com.ironsource.qd$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4959rd.values().length];
            a = iArr;
            try {
                iArr[EnumC4959rd.PER_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC4959rd.PER_HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void a(Context context, String str, String str2) {
        EnumC4959rd enumC4959rd;
        int i2 = 0;
        if (IronSourceUtils.a(context, a(str, c, str2), false)) {
            IronSourceUtils.b(context, a(str, i, str2), System.currentTimeMillis());
        }
        if (IronSourceUtils.a(context, a(str, b, str2), false)) {
            String strA = a(str, g, str2);
            int iA = IronSourceUtils.a(context, strA, 0);
            if (iA == 0) {
                String strC = IronSourceUtils.c(context, a(str, e, str2), EnumC4959rd.PER_DAY.toString());
                EnumC4959rd[] enumC4959rdArrValues = EnumC4959rd.values();
                int length = enumC4959rdArrValues.length;
                while (true) {
                    if (i2 >= length) {
                        enumC4959rd = null;
                        break;
                    }
                    enumC4959rd = enumC4959rdArrValues[i2];
                    if (enumC4959rd.a.equals(strC)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                IronSourceUtils.b(context, a(str, h, str2), a(enumC4959rd));
            }
            IronSourceUtils.b(context, strA, iA + 1);
        }
    }

    private b b(Context context, String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!IronSourceUtils.a(context, a(str, a, str2), true)) {
            return b.CAPPED_PER_DELIVERY;
        }
        if (IronSourceUtils.a(context, a(str, c, str2), false)) {
            if (jCurrentTimeMillis - IronSourceUtils.a(context, a(str, i, str2), 0L) < IronSourceUtils.a(context, a(str, f, str2), 0) * 1000) {
                return b.CAPPED_PER_PACE;
            }
        }
        if (IronSourceUtils.a(context, a(str, b, str2), false)) {
            int iA = IronSourceUtils.a(context, a(str, d, str2), 0);
            String strA = a(str, g, str2);
            int iA2 = IronSourceUtils.a(context, strA, 0);
            String strA2 = a(str, h, str2);
            if (jCurrentTimeMillis >= IronSourceUtils.a(context, strA2, 0L)) {
                IronSourceUtils.b(context, strA, 0);
                IronSourceUtils.b(context, strA2, 0L);
            } else if (iA2 >= iA) {
                return b.CAPPED_PER_COUNT;
            }
        }
        return b.NOT_CAPPED;
    }

    @Override // com.ironsource.Q7.a
    public synchronized void a(Context context, String str, IronSource.a aVar) {
        if (context == null) {
            return;
        }
        if (str == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(context, a(aVar), str);
    }

    private String a(String str, String str2, String str3) {
        return str + "_" + str2 + "_" + str3;
    }

    @Override // com.ironsource.Q7
    public synchronized b a(Context context, AbstractC4985t3 abstractC4985t3, IronSource.a aVar) {
        try {
            if (context == null) {
                return b.NOT_CAPPED;
            }
            if (abstractC4985t3 == null) {
                return b.NOT_CAPPED;
            }
            String strA = a(aVar);
            if (abstractC4985t3.c() == null) {
                return b.NOT_CAPPED;
            }
            if (abstractC4985t3.a() == null) {
                return b.NOT_CAPPED;
            }
            return b(context, strA, abstractC4985t3.c());
        } catch (Throwable th) {
            throw th;
        }
    }

    private long a(EnumC4959rd enumC4959rd) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        int i2 = a.a[enumC4959rd.ordinal()];
        if (i2 == 1) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.set(11, 0);
            calendar.add(6, 1);
        } else if (i2 == 2) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.add(11, 1);
        }
        return calendar.getTimeInMillis();
    }

    @Override // com.ironsource.Q7.a
    public synchronized void b(Context context, AbstractC4985t3 abstractC4985t3, IronSource.a aVar) {
        if (context == null || abstractC4985t3 == null) {
            return;
        }
        C4888nd c4888ndA = abstractC4985t3.a();
        if (c4888ndA == null) {
            return;
        }
        a(context, a(aVar), abstractC4985t3.c(), c4888ndA);
    }

    private void a(Context context, String str, String str2, C4888nd c4888nd) {
        boolean zE = c4888nd.e();
        IronSourceUtils.b(context, a(str, a, str2), zE);
        if (zE) {
            boolean zD = c4888nd.d();
            IronSourceUtils.b(context, a(str, b, str2), zD);
            if (zD) {
                IronSourceUtils.b(context, a(str, d, str2), c4888nd.b());
                IronSourceUtils.f(context, a(str, e, str2), c4888nd.a().toString());
            }
            boolean zF = c4888nd.f();
            IronSourceUtils.b(context, a(str, c, str2), zF);
            if (zF) {
                IronSourceUtils.b(context, a(str, f, str2), c4888nd.c());
            }
        }
    }

    private String a(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return IronSourceConstants.REWARDED_VIDEO_AD_UNIT;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return "Interstitial";
        }
        if (aVar == IronSource.a.BANNER) {
            return "Banner";
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return IronSourceConstants.NATIVE_AD_UNIT;
        }
        return aVar.toString();
    }
}
