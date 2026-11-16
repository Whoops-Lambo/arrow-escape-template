package androidx.webkit.internal;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class ApiFeature implements ConditionallySupportedFeature {
    public static final HashSet c = new HashSet();
    public final String a;
    public final String b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class LAZY_HOLDER {
        public static final HashSet a = new HashSet(Arrays.asList(WebViewGlueCommunicator.LAZY_FACTORY_HOLDER.a.a()));
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class M extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean b() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class N extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean b() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class NoFramework extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean b() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class O extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class O_MR1 extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class P extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Q extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class T extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    public abstract boolean b();

    @Override // androidx.webkit.internal.ConditionallySupportedFeature
    public final String a() {
        return this.a;
    }

    public boolean c() {
        HashSet hashSet = LAZY_HOLDER.a;
        String str = this.b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        return ("eng".equals(str2) || "userdebug".equals(str2)) && hashSet.contains(str.concat(":dev"));
    }

    public ApiFeature(String str, String str2) {
        this.a = str;
        this.b = str2;
        c.add(this);
    }

    @Override // androidx.webkit.internal.ConditionallySupportedFeature
    public final boolean isSupported() {
        if (!b() && !c()) {
            return false;
        }
        return true;
    }
}
