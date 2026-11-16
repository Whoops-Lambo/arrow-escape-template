package defpackage;

import com.google.firebase.crashlytics.internal.common.CrashlyticsController;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mz implements FilenameFilter {
    public final /* synthetic */ int a;

    public /* synthetic */ mz(int i) {
        this.a = i;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.a) {
            case 0:
                return str.startsWith("aqs.");
            case 1:
                mz mzVar = CrashlyticsController.t;
                return str.startsWith(".ae");
            case 2:
                mz mzVar2 = CrashlyticsController.t;
                Object[] objArr = {"trigger-type-anomaly", "trigger-type-oom"};
                ArrayList arrayList = new ArrayList(2);
                for (int i = 0; i < 2; i++) {
                    Object obj = objArr[i];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                return Collections.unmodifiableList(arrayList).contains(str);
            case 3:
                return str.startsWith("event");
            case 4:
                return str.startsWith("event") && !str.endsWith("_");
            case 5:
                str.getClass();
                Pattern patternCompile = Pattern.compile(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1)));
                patternCompile.getClass();
                return patternCompile.matcher(str).matches();
            case 6:
                str.getClass();
                Pattern patternCompile2 = Pattern.compile(String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3)));
                patternCompile2.getClass();
                return patternCompile2.matcher(str).matches();
            case 7:
                str.getClass();
                Pattern patternCompile3 = Pattern.compile(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1)));
                patternCompile3.getClass();
                return patternCompile3.matcher(str).matches();
            case 8:
                str.getClass();
                Pattern patternCompile4 = Pattern.compile(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1)));
                patternCompile4.getClass();
                return patternCompile4.matcher(str).matches();
            default:
                return Pattern.matches("cpu[0-9]+", str);
        }
    }
}
