package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ι, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractRunnableC1096 implements Runnable {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static final String f3181 = StringFog.decrypt("r0Gyk55MVqmVbYCQlEw=\n", "+wPh8vgpBNw=\n");

    /* JADX INFO: renamed from: ﾒ */
    public abstract void mo344();

    /* JADX INFO: renamed from: ﾒ */
    public void mo587(Throwable th) {
        String str = f3181;
        String str2 = StringFog.decrypt("/Xk8aKrWppiYaCJmq4Xv\n", "uAtOB9j2z/Y=\n") + getClass().getName();
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("+a/GVy/Y\n", "usOnJFzwfvc=\n"));
        sb.append(getClass().getName());
        try {
            AbstractC1290.m904(str, str2, AbstractC1156.m868("Qw==\n", "auh/oqZLvhU=\n", sb), th, null, null, false, false, false);
        } catch (Throwable unused) {
        }
        AbstractC0509.m488(str, StringFog.decrypt("haX1Ur5zYV7gtOtcvyAo\n", "wNeHPcxTCDA=\n") + getClass().getName());
        AbstractC0509.m497(str, str, StringFog.decrypt("+KGQWDt8LRE=\n", "vMTkOVIQXis=\n"), th, null, false);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo344();
        } catch (Throwable th) {
            try {
                mo587(th);
            } catch (Throwable unused) {
            }
        }
    }
}
