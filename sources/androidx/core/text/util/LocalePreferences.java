package androidx.core.text.util;

import android.icu.text.DateFormat;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@RequiresApi
public final class LocalePreferences {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api24Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api33Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class CalendarType {

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface CalendarTypes {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class FirstDayOfWeek {

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface Days {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class HourCycle {

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface HourCycleTypes {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class TemperatureUnit {

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface TemperatureUnits {
        }
    }

    /* JADX INFO: renamed from: androidx.core.text.util.LocalePreferences$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DateFormat.HourCycle.values().length];
            a = iArr;
            try {
                DateFormat.HourCycle unused = DateFormat.HourCycle.HOUR_CYCLE_11;
                iArr[DateFormat.HourCycle.HOUR_CYCLE_11.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr2 = a;
                DateFormat.HourCycle unused3 = DateFormat.HourCycle.HOUR_CYCLE_12;
                iArr2[DateFormat.HourCycle.HOUR_CYCLE_12.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr3 = a;
                DateFormat.HourCycle unused5 = DateFormat.HourCycle.HOUR_CYCLE_23;
                iArr3[DateFormat.HourCycle.HOUR_CYCLE_23.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr4 = a;
                DateFormat.HourCycle unused7 = DateFormat.HourCycle.HOUR_CYCLE_24;
                iArr4[DateFormat.HourCycle.HOUR_CYCLE_24.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }
}
