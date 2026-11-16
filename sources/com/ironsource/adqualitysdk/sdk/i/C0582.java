package com.ironsource.adqualitysdk.sdk.i;

import android.util.Log;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.h50;
import defpackage.nj;
import defpackage.rl3;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.Һ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0582 {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static final String f1423 = StringFog.decrypt("OOeP\n", "dsjO4KDs/9w=\n");

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public boolean f1428;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public String f1431;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public String f1432;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public String f1433;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public String f1434;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public String f1435;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public String f1436;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public String f1437;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public EnumC0584 f1430 = EnumC0584.f1445;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public EnumC0591 f1429 = EnumC0591.f1460;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public long f1427 = 0;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public long f1426 = 0;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public long f1425 = 0;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public long f1424 = -1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m528(EnumC0584 enumC0584) {
        String strM515;
        String strDecrypt;
        this.f1430 = enumC0584;
        EnumC0584 enumC0585 = EnumC0584.f1440;
        if (enumC0584 != enumC0585) {
            this.f1429 = EnumC0591.f1460;
        }
        int iOrdinal = enumC0584.ordinal();
        if (iOrdinal == 1) {
            this.f1427 = System.currentTimeMillis();
            return;
        }
        if (iOrdinal == 2) {
            this.f1426 = System.currentTimeMillis();
            return;
        }
        if (iOrdinal == 3) {
            this.f1425 = System.currentTimeMillis();
        } else if (iOrdinal != 4 && iOrdinal != 5) {
            return;
        }
        if (this.f1436.equals(StringFog.decrypt("HHf+ixIc2w==\n", "SxKc3Xt5rPE=\n"))) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(StringFog.decrypt("wX7cb6teYjLBftxvq15v\n", "7FPxQoZzTx8=\n"));
        sb2.append(this.f1436);
        String strM868 = AbstractC1156.m868("4mbUuQIhyrCtd5s=\n", "wgW712xEqcQ=\n", sb2);
        if (this.f1435 != null) {
            strM868 = nj.q(h50.p(strM868), this.f1435, " ");
        }
        StringBuilder sbP = h50.p(strM868);
        sbP.append(StringFog.decrypt("Tun1aBLqQHNO6fVoEuo=\n", "Y8TYRT/HbV4=\n"));
        sb.append(sbP.toString().concat("\n"));
        String string = null;
        if (this.f1436 == null || (strDecrypt = this.f1434) == null) {
            strM515 = null;
        } else {
            if (strDecrypt.equals(f1423) && this.f1430 != EnumC0584.f1441) {
                strDecrypt = StringFog.decrypt("2bM1MU5HBNn/uSU=\n", "l9xBESgicLo=\n");
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f1436);
            strM515 = AbstractC0529.m515("bLuUD+S+SF8/gb8q/ug=\n", "TOjQRMTILS0=\n", sb3, strDecrypt);
        }
        if (strM515 != null) {
            sb.append(strM515.concat("\n"));
        }
        if (this.f1433 != null && this.f1432 != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(StringFog.decrypt("aWxqK/r9ratTR094jOuqqEpHU3/J/OX4\n", "OighC6yY39g=\n"));
            rl3.p(this.f1433, "bHaq\n", sb4, "TFuK7S3n5yU=\n");
            sb4.append(this.f1432);
            string = sb4.toString();
        }
        if (string != null) {
            sb.append(string.concat("\n"));
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(StringFog.decrypt("PCR56zTumyo=\n", "b1AYn0GdoQo=\n"));
        EnumC0584 enumC0586 = this.f1430;
        sb5.append(enumC0586 == enumC0585 ? StringFog.decrypt("ey7JifVu6Q==\n", "LG+bx7wgrjo=\n") : enumC0586.name());
        sb5.append("\n");
        sb.append(sb5.toString());
        EnumC0584 enumC0587 = this.f1430;
        if (enumC0587 == EnumC0584.f1442 || enumC0587 == EnumC0584.f1441) {
            String strDecrypt2 = StringFog.decrypt("SrA1JwNBkQFyhyAZ\n", "C9RkUmIt+HU=\n");
            AbstractC0509.m498(strDecrypt2, strDecrypt2, sb.toString(), true);
            return;
        }
        String strM527 = m527(this.f1429);
        if (strM527 != null) {
            sb.append(StringFog.decrypt("Ucet1m6FYEI8\n", "HKLepQ/iBXg=\n") + strM527);
        }
        String string2 = sb.toString();
        String strDecrypt3 = StringFog.decrypt("fqOQTLmR6Q1GlIVy\n", "P8fBOdj9gHk=\n");
        if (AbstractC0509.m492()) {
            Log.w(AbstractC0509.m494(strDecrypt3), string2);
        } else if (AbstractC0509.m493().shouldPrintLog(ISAdQualityLogLevel.WARNING)) {
            Log.w(AbstractC0509.m494(strDecrypt3), string2);
        }
    }

    public C0582(String str) {
        this.f1437 = str;
        this.f1436 = str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m527(EnumC0591 enumC0591) {
        if (enumC0591 == null) {
            return null;
        }
        switch (enumC0591.ordinal()) {
            case 1:
                return String.format(StringFog.decrypt("BbaziyQ7imBFt+CRLz6KM1Pl4Z0xJcNkRbazsRMRzkdVpP+RNCmKRWSOs44lItl/T6uz3TNwxWQA\nq/aPJSI=\n", "IMWT+EBQqhY=\n"), this.f1436, this.f1434, this.f1431);
            case 2:
                return String.format(StringFog.decrypt("29Vdb44Likqb1A5VpS6KGY2GFE/qLsVI3t8YSOoz30yOyQ9IrySKXoeGCVSvYMlTkMgYX74v2A==\n", "/qZ9PMpAqjw=\n"), this.f1436, this.f1434);
            case 3:
                return StringFog.decrypt("7J+DB+ZJBrPF3oMF6llPpsaXkA6jTkmpxJuJH+xf\n", "qv7qa4MtJsc=\n");
            case 4:
                return StringFog.decrypt("5o5NcTTT+bjPz0dvNNatqYCMS3M/0rq4z50=\n", "oO8kHVG32cw=\n");
            case 5:
                return StringFog.decrypt("rEztccrQiyKFDeJ429fDdolC6nPK1985mA==\n", "6i2EHa+0q1Y=\n");
            case 6:
                return StringFog.decrypt("XcDNyJtj90pt3NTJhjT2CWvb1NSRcA==\n", "CK6mpvQUmWo=\n");
            case 7:
                return StringFog.decrypt("yFA1JObOz6z0Vjoz4N6AvbtRJ3btxZvv6V01Mvo=\n", "mzhUVoOq788=\n");
            default:
                return null;
        }
    }
}
