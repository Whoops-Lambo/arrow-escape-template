package com.inmobi.media;

import androidx.media3.common.MediaLibraryInfo;
import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.dk2;
import defpackage.kk2;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.gp, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4059gp {
    public static final void a(String str) {
        try {
            Class.forName("androidx.media3.exoplayer.ExoPlayerImpl");
            if (str == null || str.length() == 0) {
                return;
            }
            String str2 = null;
            try {
                String str3 = MediaLibraryInfo.TAG;
                Field declaredField = MediaLibraryInfo.class.getDeclaredField("VERSION");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                String str4 = obj instanceof String ? (String) obj : null;
                if (str4 != null && !dk2.Z(str4)) {
                    str2 = str4;
                }
            } catch (Throwable unused) {
            }
            if (str2 == null) {
                throw new Jh(8800);
            }
            C4444uk c4444ukB = b(str2);
            if (c4444ukB == null) {
                throw new Jh(8802);
            }
            C4444uk c4444ukB2 = b(str);
            if (c4444ukB2 == null) {
                throw new Jh(8803);
            }
            int i = c4444ukB.a;
            int i2 = c4444ukB2.a;
            if (i >= i2) {
                if (i != i2 || c4444ukB.b > c4444ukB2.b) {
                    throw new Jh(8804);
                }
            }
        } catch (ClassNotFoundException unused2) {
            throw new Jh(8800);
        }
    }

    public static final C4444uk b(String str) {
        List listN0 = dk2.n0(str, new String[]{UserDetailsUtils.UserDetailsLiterals.DOT}, 3, 2);
        if (listN0.size() < 2) {
            return null;
        }
        int iC = c((String) listN0.get(0));
        int iC2 = c((String) listN0.get(1));
        int iC3 = listN0.size() >= 3 ? c((String) listN0.get(2)) : 0;
        if (iC < 0 || iC2 < 0) {
            return null;
        }
        return new C4444uk(iC, iC2, iC3);
    }

    public static final int c(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                str = str.substring(0, i);
                break;
            }
        }
        Integer numM = kk2.M(str);
        if (numM == null) {
            return 0;
        }
        return numM.intValue();
    }
}
