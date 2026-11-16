package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.Ξ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C0510 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final /* synthetic */ C1328 f1142;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ Activity f1143;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ Application f1144;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ String f1145;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ String f1146;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ISAdQualityConfig f1147;

    public C0510(C1328 c1328, ISAdQualityConfig iSAdQualityConfig, String str, String str2, Application application, Activity activity) {
        this.f1142 = c1328;
        this.f1147 = iSAdQualityConfig;
        this.f1146 = str;
        this.f1145 = str2;
        this.f1144 = application;
        this.f1143 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        try {
            String userId = this.f1147.getUserId();
            C1328 c1328 = this.f1142;
            ISAdQualityLogLevel logLevel = this.f1147.getLogLevel();
            synchronized (c1328) {
                c1328.f3960 = logLevel;
            }
            this.f1142.m954();
            boolean zIsEmpty = TextUtils.isEmpty(this.f1146);
            if (zIsEmpty) {
                String strDecrypt = StringFog.decrypt("tBDrNvEQJyOMJ/4I\n", "9XS6Q5B8Tlc=\n");
                AbstractC0509.m498(strDecrypt, strDecrypt, StringFog.decrypt("FRW/qlsrItkmEri5Ej0nxDRbsb9fL27ZOFs=\n", "XHvW3jJKTrA=\n") + this.f1145, true);
            } else {
                String strDecrypt2 = StringFog.decrypt("Mh+Rv2fJu9QKKISB\n", "c3vAygal0qA=\n");
                AbstractC0509.m498(strDecrypt2, strDecrypt2, StringFog.decrypt("CWyobtT9SRs6a699netMBigioGrNvE4XOSI=\n", "QALBGr2cJXI=\n") + this.f1146, true);
            }
            C1255.m893(this.f1144.getApplicationContext()).m896();
            C1328.m953(this.f1142, this.f1147.isTestMode());
            if (this.f1147.isTestMode()) {
                AbstractC0509.m490(StringFog.decrypt("OCP3N1F0UHQAFOIJ\n", "eUemQjAYOQA=\n"), StringFog.decrypt("3MeRZEIXEjqqp+NuZHk7dP+mpEUrNTxt7qa0Q38xdW/u9bdnZD0wJv/0tk8qeHQ7zvCmRH8qdWzi\n8qsKfzwmb8bpp082LSdu7qa0Q2c1dXnupqdDeDo0ae/jpwsqeA==\n", "i4bDKgtZVRs=\n"));
            }
            try {
                Class.forName(StringFog.decrypt("jgpZDBh6T8OAFxM/BGpFjrsFThU=\n", "72Q9fncTK+0=\n"));
            } catch (Throwable unused) {
            }
            Activity activity = this.f1143;
            if (activity != null) {
                AbstractC1334.m972(activity);
            } else {
                Application application = this.f1144;
                String str = AbstractC1334.f4001;
                if (application != null) {
                    AbstractC1334.m966(application.getApplicationContext());
                }
            }
            C1328 c1329 = this.f1142;
            if (zIsEmpty) {
                C1328.m947(c1329).f318 = this.f1145;
            } else {
                C1328.m947(c1329).f319 = this.f1146;
            }
            C1328.m947(this.f1142).f315 = this.f1147.getInitializationSource();
            C1328.m947(this.f1142).f314 = this.f1147.getCoppa();
            C1328.m947(this.f1142).f313 = this.f1147.getDeviceIdType();
            if (this.f1147.getMetaData() != null) {
                C4610d0 c4610d0M947 = C1328.m947(this.f1142);
                Map<String, String> metaData = this.f1147.getMetaData();
                c4610d0M947.f312.clear();
                if (metaData != null) {
                    c4610d0M947.f312.putAll(metaData);
                }
                if (this.f1147.getMetaData().containsKey(StringFog.decrypt("EJUUPX4LwPwWnR8gfgzK5ACa\n", "ZfRwTiF4pY8=\n"))) {
                    C1328.m947(this.f1142).f310 = this.f1147.getMetaData().get(StringFog.decrypt("YgvCn1Eoc+JkA8mCUS95+nIE\n", "F2qm7A5bFpE=\n"));
                }
            }
            Context applicationContext = this.f1144.getApplicationContext();
            this.f1142.f3959 = applicationContext;
            C0843.f2235.m629(applicationContext, !zIsEmpty ? this.f1146 : this.f1145);
            this.f1142.f3955 = new C1051(applicationContext);
            C1328 c13210 = this.f1142;
            c13210.f3953 = new C0969(applicationContext, c13210.f3958.f301, "B0r1sW@sH3re");
            AbstractC1081 abstractC1081M765 = AbstractC1081.m765();
            C1328 c13211 = this.f1142;
            abstractC1081M765.mo787(applicationContext, c13211.f3955, c13211.f3958, new C0671(this), C1328.m946(c13211));
            C1328 c13212 = this.f1142;
            C1328 c13213 = this.f1142;
            c13212.f3952 = new C0905(applicationContext, c13213.f3955, c13213.f3958.f302);
            String strM590 = AbstractC0719.m590(applicationContext);
            AbstractC1081 abstractC1081M766 = AbstractC1081.m765();
            C0670 c0670 = new C0670(this, strM590);
            C1082 c1082 = (C1082) abstractC1081M766;
            Handler handler = c1082.f3131;
            if (handler != null) {
                handler.post(new C1101(c1082, c0670));
            }
            AbstractC1081 abstractC1081M767 = AbstractC1081.m765();
            C0657 c0657 = new C0657(this);
            C1082 c1083 = (C1082) abstractC1081M767;
            Handler handler2 = c1083.f3131;
            if (handler2 != null) {
                handler2.post(new C1116(c1083, c0657));
            }
            C1328.m952(this.f1142, applicationContext);
            this.f1142.f3954 = new C0949(applicationContext, C1328.m947(this.f1142), this.f1142.f3958, this.f1143 != null, strM590, new C0630(this));
            if (!this.f1147.isUserIdSet()) {
                C1328.m947(this.f1142).f311 = true;
                C0969 c0969 = new C0969(this.f1142.f3954.f2559, C0949.f2551, C0949.f2550);
                String str2 = C0949.f2548;
                String strM741 = c0969.m741(str2);
                if (TextUtils.isEmpty(strM741)) {
                    strM741 = UUID.randomUUID().toString();
                    c0969.m742(str2, strM741);
                }
                userId = strM741;
            }
            if (this.f1142.m958()) {
                this.f1142.f3954.m727(new C0607(this));
            }
            this.f1142.f3954.m726(new C0564(this));
            C0517 c0517 = new C0517(new C0561(this));
            C1328 c13214 = this.f1142;
            C1328 c13215 = this.f1142;
            c13214.f3957 = new C0604(c13215.f3952, c13215.f3954, strM590, c0517, new C0531(this));
            C1328 c13216 = this.f1142;
            c13216.f3957.f1474.f3261 = new C0523(this);
            c13216.f3950 = new C0396(this.f1142.f3957);
            C1328 c13217 = this.f1142;
            c13217.f3949 = new C0787(c13217.f3954);
            AbstractC0509.m495(StringFog.decrypt("r55G6bry+IGXqVPX\n", "7voXnNuekfU=\n"), StringFog.decrypt("prIVq44md86GlS2cmxg20ZuAJru2PXGCiY4m76ohepjP\n", "7+FUz99TFqI=\n") + this.f1142.f3958.f304);
            C1328 c13218 = this.f1142;
            Activity activity2 = this.f1143;
            c13218.m963(activity2 != null ? activity2 : applicationContext, userId, true, false, true);
            C1328.m950(this.f1142, applicationContext);
            C1328.m951(this.f1142);
            C1328.m949(this.f1142);
        } catch (Throwable th) {
            String strDecrypt3 = StringFog.decrypt("qSzKEQcuKEuFKtEfGWc7TII5mDcmTyV0mT/UFwF3YXaoFQ==\n", "7F64fnUOQSU=\n");
            AbstractC1290.m906(StringFog.decrypt("ndiS42qaa8ql74fd\n", "3LzDlgv2Ar4=\n"), strDecrypt3, th, true, false, true);
            C1150 c1150 = this.f1142.f3951;
            c1150.m845(c1150.f3339, ISAdQualityInitError.EXCEPTION_ON_INIT, strDecrypt3);
        }
    }
}
