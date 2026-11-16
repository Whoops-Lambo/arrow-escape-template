package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zziff;
import com.google.android.gms.internal.ads.zzifg;
import defpackage.rl3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zziff<MessageType extends zzifg<MessageType, BuilderType>, BuilderType extends zziff<MessageType, BuilderType>> implements zziih {
    @Override // 
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public abstract zzigw clone();

    public static void k(int i, List list) {
        int size = list.size() - i;
        String strK = rl3.k(new StringBuilder(String.valueOf(size).length() + 26), "Element at index ", size, " is null.");
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 >= i) {
                list.remove(size2);
            } else {
                throw new NullPointerException(strK);
            }
        }
    }
}
