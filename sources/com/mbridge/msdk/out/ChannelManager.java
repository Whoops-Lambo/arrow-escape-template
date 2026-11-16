package com.mbridge.msdk.out;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.net.Aa;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class ChannelManager {
    public static void setChannel(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                Aa aa = new Aa();
                Method declaredMethod = Aa.class.getDeclaredMethod("b", String.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(aa, str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
