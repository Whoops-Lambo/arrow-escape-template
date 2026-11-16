package com.adsurge.adn.O0;

import android.text.TextUtils;
import com.adsurge.adn.R0.c;
import com.adsurge.adn.R0.d;
import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class a extends c {
    public static ThreadLocal b = new ThreadLocal();

    public static byte[] d() {
        byte[] bArr = (byte[]) b.get();
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[4];
        b.set(bArr2);
        return bArr2;
    }

    public a(d dVar) {
        super(dVar);
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 4) {
            return false;
        }
        int iE = e();
        for (int i = 0; i < 4; i++) {
            if (((iE >> (i * 8)) & 255) != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public int e() {
        byte[] bArrD = d();
        read(bArrD, 0, 4);
        return (bArrD[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArrD[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArrD[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArrD[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24);
    }

    public int f() {
        byte[] bArrD = d();
        read(bArrD, 0, 4);
        return (bArrD[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArrD[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArrD[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArrD[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24);
    }

    public short g() {
        byte[] bArrD = d();
        read(bArrD, 0, 2);
        return (short) ((bArrD[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArrD[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8));
    }
}
