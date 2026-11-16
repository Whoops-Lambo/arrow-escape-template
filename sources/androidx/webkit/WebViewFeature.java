package androidx.webkit;

import androidx.annotation.RestrictTo;
import androidx.webkit.internal.ApiFeature;
import androidx.webkit.internal.ConditionallySupportedFeature;
import androidx.webkit.internal.WebViewFeatureInternal;
import io.p071bidmachine.media3.extractor.ts.y;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class WebViewFeature {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface WebViewStartupFeature {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface WebViewSupportFeature {
    }

    public static boolean a(String str) {
        ApiFeature.N n = WebViewFeatureInternal.a;
        Set<ConditionallySupportedFeature> setUnmodifiableSet = Collections.unmodifiableSet(ApiFeature.c);
        HashSet hashSet = new HashSet();
        for (ConditionallySupportedFeature conditionallySupportedFeature : setUnmodifiableSet) {
            if (conditionallySupportedFeature.a().equals(str)) {
                hashSet.add(conditionallySupportedFeature);
            }
        }
        if (hashSet.isEmpty()) {
            y.j("Unknown feature ".concat(str));
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((ConditionallySupportedFeature) it.next()).isSupported()) {
                return true;
            }
        }
        return false;
    }
}
