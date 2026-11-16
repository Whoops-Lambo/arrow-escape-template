package com.ironsource.adqualitysdk.sdk.i;

import android.util.Log;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᑉ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0804 extends RuntimeException {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Throwable f2106;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC1246 f2107;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String f2108;

    /* JADX INFO: renamed from: ﾒ */
    public abstract String mo361();

    @Override // java.lang.Throwable
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(mo361());
        sb.append(StringFog.decrypt("G7k=\n", "IZlG/H4Izlg=\n"));
        sb.append(this.f2108);
        sb.append('\n');
        sb.append(this.f2107);
        if (this.f2106 != null) {
            str = StringFog.decrypt("8Nc/dH7+1tmY7WQh\n", "+pReAQ2bsvk=\n") + Log.getStackTraceString(this.f2106);
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m614(String str) {
        AbstractC0914.m680(str, this.f2108, null, this);
    }

    public AbstractC0804(String str, AbstractC1246 abstractC1246, Throwable th) {
        this.f2108 = str;
        this.f2107 = abstractC1246;
        this.f2106 = th;
    }
}
