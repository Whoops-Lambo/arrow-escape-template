package com.safedk.android.analytics.brandsafety.creatives;

import android.text.TextUtils;
import com.safedk.android.utils.Logger;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class f extends i {
    private static final String b = "PrefetchVastAdTagUri";
    private static final String c = "\\[[\\s\\S].*?\\]";
    private final String[] d;

    public f(String str) {
        super(str);
        this.d = a(str);
        Logger.d(b, "Prefetch URI, unique parts: ", Arrays.toString(this.d));
    }

    private String[] a(String str) {
        if (str != null) {
            return str.split(c);
        }
        return new String[0];
    }

    private boolean b(String str) {
        String strSubstring = str;
        for (String str2 : this.d) {
            if (TextUtils.isEmpty(strSubstring)) {
                return false;
            }
            int iIndexOf = strSubstring.indexOf(str2);
            if (iIndexOf < 0) {
                return a(str2, strSubstring);
            }
            strSubstring = strSubstring.substring(iIndexOf + str2.length());
        }
        return true;
    }

    private static boolean a(String str, String str2) {
        int iIndexOf = str2.indexOf(38);
        if (iIndexOf > 0) {
            str2 = str2.substring(iIndexOf);
        }
        if (!str.contains(str2)) {
            return false;
        }
        Logger.d(b, "Prefetch URI, VastAdTagUri in the prefetch has a tail that is not included in the loaded URL");
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.i
    public boolean equals(Object obj) {
        return b(obj.toString());
    }
}
