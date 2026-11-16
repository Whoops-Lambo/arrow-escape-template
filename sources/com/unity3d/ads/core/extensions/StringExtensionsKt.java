package com.unity3d.ads.core.extensions;

import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.dk2;
import defpackage.du;
import defpackage.er;
import defpackage.kk2;
import defpackage.s71;
import defpackage.w32;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0019\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "getSHA256Hash", "(Ljava/lang/String;)Ljava/lang/String;", "guessMimeType", "other", "", "compareVersion", "(Ljava/lang/String;Ljava/lang/String;)I", "Lw32;", "VERSION_REGEX", "Lw32;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class StringExtensionsKt {

    @NotNull
    private static final w32 VERSION_REGEX = new w32("[0-9.]+");

    public static final int compareVersion(@NotNull String str, @NotNull String str2) {
        int iIntValue;
        int iIntValue2;
        Integer numM;
        Integer numM2;
        str.getClass();
        str2.getClass();
        if (str.length() != 0 && str2.length() != 0) {
            String strG0 = dk2.g0(dk2.g0(str, "v"), "V");
            String strG1 = dk2.g0(dk2.g0(str2, "v"), "V");
            w32 w32Var = VERSION_REGEX;
            if (w32Var.c(strG0) && w32Var.c(strG1) && !dk2.O(strG0, "..", false) && !dk2.O(strG1, "..", false)) {
                List listN0 = dk2.n0(strG0, new String[]{UserDetailsUtils.UserDetailsLiterals.DOT}, 0, 6);
                List listN1 = dk2.n0(strG1, new String[]{UserDetailsUtils.UserDetailsLiterals.DOT}, 0, 6);
                int iMax = Math.max(listN0.size(), listN1.size());
                for (int i = 0; i < iMax; i++) {
                    String str3 = (String) du.d0(i, listN0);
                    if (str3 != null && (numM2 = kk2.M(str3)) != null) {
                        iIntValue = numM2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    String str4 = (String) du.d0(i, listN1);
                    if (str4 != null && (numM = kk2.M(str4)) != null) {
                        iIntValue2 = numM.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    if (iIntValue != iIntValue2) {
                        return s71.h(iIntValue, iIntValue2);
                    }
                }
                return 0;
            }
            return -1;
        }
        return -1;
    }

    @NotNull
    public static final String getSHA256Hash(@NotNull String str) {
        str.getClass();
        byte[] bytes = str.getBytes(er.a);
        bytes.getClass();
        String strHex = ByteString.of(Arrays.copyOf(bytes, bytes.length)).sha256().hex();
        strHex.getClass();
        return strHex;
    }

    @Nullable
    public static final String guessMimeType(@NotNull String str) {
        str.getClass();
        return URLConnection.guessContentTypeFromName(str);
    }
}
