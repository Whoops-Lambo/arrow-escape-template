package com.moloco.sdk.publisher;

import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import defpackage.ek2;
import defpackage.jh0;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000e"}, d2 = {"Lcom/moloco/sdk/publisher/AdFormatType;", "", "<init>", "(Ljava/lang/String;I)V", "BANNER", AdSurgeAdFormat.Constants.INTERSTITIAL_LABEL, "REWARDED", BrandSafetyUtils.o, "NATIVE", "INLINE_ADAPTIVE_BANNER", "ANCHORED_ADAPTIVE_BANNER", "toLowercase", "", "toTitlecase", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum AdFormatType {
    BANNER,
    INTERSTITIAL,
    REWARDED,
    MREC,
    NATIVE,
    INLINE_ADAPTIVE_BANNER,
    ANCHORED_ADAPTIVE_BANNER;

    private static final /* synthetic */ jh0 $ENTRIES = ek2.m(values());

    @NotNull
    public static jh0 getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String toLowercase() {
        String lowerCase = toString().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    @NotNull
    public final String toTitlecase() {
        String strValueOf;
        String lowercase = toLowercase();
        if (lowercase.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char cCharAt = lowercase.charAt(0);
            if (Character.isLowerCase(cCharAt)) {
                String strValueOf2 = String.valueOf(cCharAt);
                strValueOf2.getClass();
                Locale locale = Locale.ROOT;
                strValueOf = strValueOf2.toUpperCase(locale);
                strValueOf.getClass();
                if (strValueOf.length() > 1) {
                    if (cCharAt != 329) {
                        char cCharAt2 = strValueOf.charAt(0);
                        String lowerCase = strValueOf.substring(1).toLowerCase(locale);
                        lowerCase.getClass();
                        strValueOf = cCharAt2 + lowerCase;
                    }
                } else {
                    strValueOf = String.valueOf(Character.toTitleCase(cCharAt));
                }
            } else {
                strValueOf = String.valueOf(cCharAt);
            }
            sb.append((Object) strValueOf);
            sb.append(lowercase.substring(1));
            return sb.toString();
        }
        return lowercase;
    }
}
