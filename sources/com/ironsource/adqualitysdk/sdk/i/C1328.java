package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.ISAdQualityMediationNetwork;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import defpackage.q63;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ｲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C1328 extends IronSourceAdQuality {

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public static C1328 f3946;

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public C0787 f3949;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public C0396 f3950;

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    public C0905 f3952;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public C0969 f3953;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public C0949 f3954;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public C1051 f3955;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public ISAdQualityAdListener f3956;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public C0604 f3957;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public Context f3959;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public ISAdQualityConfig f3966;

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public static final String f3948 = StringFog.decrypt("/9Co5jiYf/nH573Y\n", "vrT5k1n0Fo0=\n");

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public static final String f3947 = StringFog.decrypt("69rxKZJ6\n", "mLWeRP4b0E8=\n");

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final C4610d0 f3967 = new C4610d0();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public boolean f3965 = false;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public boolean f3964 = false;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public boolean f3963 = false;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public boolean f3962 = false;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public boolean f3961 = false;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public ISAdQualityLogLevel f3960 = ISAdQualityLogLevel.INFO;

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public final C1150 f3951 = new C1150(new C0684(this));

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final C4603b f3958 = new C4603b();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m946(C1328 c1328) {
        boolean z;
        synchronized (c1328) {
            z = c1328.f3962;
        }
        return z;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static C4610d0 m947(C1328 c1328) {
        C4610d0 c4610d0;
        synchronized (c1328) {
            c4610d0 = c1328.f3967;
        }
        return c4610d0;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void sendCustomMediationRevenue(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        boolean z;
        synchronized (this) {
            z = this.f3963;
        }
        if (z) {
            AbstractC0509.m490(f3948, StringFog.decrypt("4v9K3pHm7zbP+gSakLXoPMy+SZyBr/0nyPFK2Zej6jbP60HZyObVAOD6dYyEqvUn2L53va7m6zLS\nvleRkLL4PNbwCg==\n", "oZ4k+eXGnFM=\n"));
            return;
        }
        if (!m957()) {
            AbstractC0509.m490(f3948, StringFog.decrypt("J44qT/r5bN8Ki2QL+6pr1QnPKQ3qsH7ODYAqSPy8ad8KmiFIo/lW6SWLFR3vtXbOHc8XLMX5dslE\ngSscrrBx0xCGJQTno3reSg==\n", "ZO9EaI7ZH7o=\n"));
            return;
        }
        this.f3950.getClass();
        if (iSAdQualityCustomMediationRevenue != null && iSAdQualityCustomMediationRevenue.getMediationNetwork() == ISAdQualityMediationNetwork.LEVEL_PLAY && iSAdQualityCustomMediationRevenue.getCustomData() != null && iSAdQualityCustomMediationRevenue.getCustomData().length() > 0) {
            C0396 c0396 = this.f3950;
            c0396.getClass();
            AbstractC4631n.m405(new C0399(c0396, iSAdQualityCustomMediationRevenue));
            return;
        }
        C0396 c0397 = this.f3950;
        c0397.getClass();
        if (iSAdQualityCustomMediationRevenue != null) {
            if (iSAdQualityCustomMediationRevenue.getRevenue() < 0.0d) {
                AbstractC0509.m490(C0396.f827, StringFog.decrypt("/7p+VqGqIobSvzASoPkljNH7fRSx4zCX1bR+UafvJ4bSrnVL9fg0ldm1ZRT1+TmMybd0UbfvcY3T\ntT0fsO0wl9WtdQ==\n", "vNsQcdWKUeM=\n"));
                return;
            }
            ISAdQualityMediationNetwork mediationNetwork = iSAdQualityCustomMediationRevenue.getMediationNetwork();
            if (mediationNetwork == null || TextUtils.isEmpty(C0396.m460(mediationNetwork))) {
                AbstractC0509.m490(C0396.f827, StringFog.decrypt("ixfqjgVo4XCmEqTKBDvmeqVW6cwVIfNhoRnqiQMt5HCmA+GTUSX7Zrsf6s5RJfdxoRfwwB4msnut\nAvPGAyM=\n", "yHaEqXFIkhU=\n"));
                return;
            }
            ISAdQualityAdType adType = iSAdQualityCustomMediationRevenue.getAdType();
            if (adType != ISAdQualityAdType.INTERSTITIAL && adType != ISAdQualityAdType.VIDEO && adType != ISAdQualityAdType.REWARDED_VIDEO && adType != ISAdQualityAdType.REWARDED && (iSAdQualityCustomMediationRevenue.getMediationNetwork() != ISAdQualityMediationNetwork.LEVEL_PLAY || iSAdQualityCustomMediationRevenue.getCustomData() == null || iSAdQualityCustomMediationRevenue.getCustomData().length() <= 0)) {
                AbstractC0509.m490(C0396.f827, StringFog.decrypt("O8plvZM4IHAWzyv5kmsnehWLZv+DcTJhEcRlupV9JXAW3m6gx2smZQjEee6CfHN0HIt/45d9IDUZ\n2W66jnYncArYf/OTcTJ5VIt984N9PDlY2W7thmo3cByLffODfTw1GcVvupV9JHQKz27+\n", "eKsLmucYUxU=\n"));
                return;
            }
            C0404 c0404 = new C0404(c0397, iSAdQualityCustomMediationRevenue);
            C1127 c1127 = ((C1082) AbstractC1081.m765()).f2543;
            int iOptInt = IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
            if (c1127 != null) {
                iOptInt = c1127.f3271.optInt(StringFog.decrypt("g+Wuyw==\n", "4Ijcr/44qE8=\n"), IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
            }
            AbstractC4631n.m406(c0404, iOptInt);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void setAdListener(ISAdQualityAdListener iSAdQualityAdListener) {
        boolean z;
        synchronized (this) {
            z = this.f3963;
        }
        if (z) {
            AbstractC0509.m490(f3948, StringFog.decrypt("jdLeA5agnE+6k9FAwuyGWbrW3kGQoMIKh+DxQLP1jkanx8kEscSkCrnSwwSR6JpeqtzHSsw=\n", "zrOwJOKA7yo=\n"));
        } else {
            this.f3956 = iSAdQualityAdListener;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void setConfig(ISAdQualityConfig iSAdQualityConfig) {
        boolean z;
        synchronized (this) {
            z = this.f3963;
        }
        if (z) {
            AbstractC0509.m490(f3948, StringFog.decrypt("wZjPg1FBJXL22cLLSwc/cKLUge12IDJG95jNzVEYdkTGsoHTRBJ2ZOqM1cBKFjg5\n", "gvmhpCVhVhc=\n"));
        } else if (m959()) {
            AbstractC0509.m490(f3948, StringFog.decrypt("bwnAcZ4GBN9YSM05hEAe3QxFjh+5ZxPrWQnCP55fV+loI44/mQYW1l4NzzKTBh7URRzHN4ZPDd9I\nRg==\n", "LGiuVuomd7o=\n"));
        } else {
            this.f3966 = iSAdQualityConfig;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void setMetaData(String str, String str2) {
        boolean z;
        try {
            synchronized (this) {
                z = this.f3963;
            }
            if (z) {
                AbstractC0509.m490(f3948, StringFog.decrypt("5GTBjaaHk0PTJcLPpsbAQsZxzor/h6l15mH+37PLiVLeJfzumYeXR9Ql3MKn04RJ0GuB\n", "pwWvqtKn4CY=\n"));
                return;
            }
            if (!m957()) {
                String str3 = f3948;
                String strDecrypt = StringFog.decrypt("FbUcDtKTWaRsswdHy49LvCWgDA72tWu0Ha8IQtaSU/AfniIO3YNMvz6/SU3eika5Ir1JCcyDXp0p\nrghq3pJL9w==\n", "TNppLr/mKtA=\n");
                if (AbstractC0509.m492()) {
                    Log.w(AbstractC0509.m494(str3), strDecrypt);
                    return;
                } else {
                    if (AbstractC0509.m493().shouldPrintLog(ISAdQualityLogLevel.WARNING)) {
                        Log.w(AbstractC0509.m494(str3), strDecrypt);
                        return;
                    }
                    return;
                }
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                if (!AbstractC0533.f1282.contains(str)) {
                    if (AbstractC0533.m516(m960().f312, str)) {
                        AbstractC0509.m490(f3948, StringFog.decrypt("c9o6GflpEmJhyy98vA==\n", "AL9OVJwdcyY=\n") + str + StringFog.decrypt("WbFcXyA0TYIa6RkHbHEAwxX0EQomNE3DDfJc\n", "eZ18Y1JRKeM=\n") + 5 + StringFog.decrypt("AQjdCMPLWhZVBJgKw4dLElJLmDXFhVEFSAvfXM+OShYBAdkIw8tIFk0Q3VI=\n", "IWW4fKLrPnc=\n"));
                        return;
                    }
                    if (!AbstractC0793.m612(str, 64) || !AbstractC0793.m612(str2, 64)) {
                        AbstractC0509.m490(f3948, StringFog.decrypt("NXvy+he1C1MnauefUg==\n", "Rh6Gt3LBahc=\n") + str + StringFog.decrypt("cDWMYS1D1vQzbck5YQabtSRxyX0zQ9zyJHGMMjkG0PokcYwpN0OS/jVgjDwxQpLhOHyMKz5Kx/Bw\nasQyKkrWtTJ8jD86UsXwNXeM\n", "UBmsXV8mspU=\n") + 1 + StringFog.decrypt("R/FPPIM=\n", "Z5AhWKM7brc=\n") + 64 + StringFog.decrypt("76ArjfmU0FOqsTDC\n", "z8ND7Iv1syc=\n"));
                        return;
                    }
                }
                C4610d0 c4610d0M960 = m960();
                if (str == null) {
                    c4610d0M960.getClass();
                } else if (str2 == null) {
                    c4610d0M960.f312.remove(str);
                } else {
                    c4610d0M960.f312.put(str, str2);
                }
                if (StringFog.decrypt("mjAK6v+jAzqcOAH3/6QJIoo/\n", "71FumaDQZkk=\n").equals(str)) {
                    m960().f310 = str2;
                }
            }
        } catch (Exception e) {
            AbstractC1290.m906(f3948, q63.i("0Hfzq2ufacLhceiqfp93wuFkoaB4y3uH\n", "lQWBxBm/Gqc=\n", str), e, true, false, true);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void setSegment(ISAdQualitySegment iSAdQualitySegment) {
        boolean z;
        synchronized (this) {
            z = this.f3963;
        }
        if (z) {
            AbstractC0509.m490(f3948, StringFog.decrypt("ZGWB67C72LJTJJypo/bOuVMkwuyNyOqzdnGOoK3v0vd0QKTss/rY91Rsmrig9Ny5CQ==\n", "JwTvzMSbq9c=\n"));
        } else {
            AbstractC4631n.m405(new C1347(this, iSAdQualitySegment));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void setUserConsent(boolean z) {
        C4610d0 c4610d0;
        synchronized (this) {
            c4610d0 = this.f3967;
        }
        c4610d0.f316 = z;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final synchronized void shutdown() {
        m964(false);
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final synchronized void m954() {
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final synchronized void m955() {
        if (m956()) {
            AbstractC0509.m490(f3948, StringFog.decrypt("YPIPhlDvQWpXswjPUKpAYUL/QdVBvEYvTvwFxATiEkZw0gXwUa5eZlfqQfJghBJ4QuBB0ky6RmtM\n5A+P\n", "I5NhoSTPMg8=\n"));
        } else if (m957()) {
            AbstractC0509.m490(f3948, StringFog.decrypt("y6VzxvAramKmuW7GtSphd+rwdNejLC976bRlkrI9aXn0tSDbvjF7f+e8aci5Nmg3\n", "htAAstBYDxY=\n"));
        } else {
            this.f3961 = true;
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final synchronized boolean m956() {
        return this.f3963;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final synchronized boolean m957() {
        return this.f3965;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized boolean m958() {
        return this.f3961;
    }

    static {
        StringFog.decrypt("9AnJpRmSuKf1Gt7lAo+cueE62q4Dlec=\n", "kX+sy23h3ck=\n");
        f3946 = null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void initialize(Context context, String str, ISAdQualityConfig iSAdQualityConfig) throws Throwable {
        if (context instanceof Application) {
            m962((Application) context, (Activity) null, str, (String) null, iSAdQualityConfig);
            return;
        }
        if (context != null && (context.getApplicationContext() instanceof Application)) {
            m962((Application) context.getApplicationContext(), (Activity) null, str, (String) null, iSAdQualityConfig);
            return;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            m962(activity.getApplication(), activity, str, (String) null, iSAdQualityConfig);
        } else {
            String strDecrypt = StringFog.decrypt("sIkhwRW7f7iQrhn2AIUwvZezFMwloneunPoDyiq6e6yN+gHXI+5zoYquQMch7nGy2a4Z1SHuX7eN\nsxbMMLcxlYmqDMwnr2q9lrQ=\n", "+dpgpUTOHtQ=\n");
            AbstractC0509.m490(f3948, strDecrypt);
            this.f3951.m845(iSAdQualityConfig != null ? iSAdQualityConfig.getAdQualityInitListeners() : null, ISAdQualityInitError.EXCEPTION_ON_INIT, strDecrypt);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void initializeWithGameId(Context context, String str, ISAdQualityConfig iSAdQualityConfig) throws Throwable {
        if (str == null) {
            str = "";
        }
        String str2 = str;
        if (context instanceof Application) {
            m962((Application) context, (Activity) null, (String) null, str2, iSAdQualityConfig);
            return;
        }
        if (context != null && (context.getApplicationContext() instanceof Application)) {
            m962((Application) context.getApplicationContext(), (Activity) null, (String) null, str2, iSAdQualityConfig);
            return;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            m962(activity.getApplication(), activity, (String) null, str2, iSAdQualityConfig);
        } else {
            String strDecrypt = StringFog.decrypt("VRPkoNiKxHt1NNyXzbSLfnIp0a3ok8xteWDGq+eLwG9oYMS27t/IYm80habs38pxPDTctOzf5HRo\nKdOt/YaKVmwwya3qntF+cy4=\n", "HEClxIn/pRc=\n");
            AbstractC0509.m490(f3948, strDecrypt);
            this.f3951.m845(iSAdQualityConfig != null ? iSAdQualityConfig.getAdQualityInitListeners() : null, ISAdQualityInitError.EXCEPTION_ON_INIT, strDecrypt);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0126 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:89:0x012d
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m962(android.app.Application r11, android.app.Activity r12, java.lang.String r13, java.lang.String r14, com.ironsource.adqualitysdk.sdk.ISAdQualityConfig r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.C1328.m962(android.app.Application, android.app.Activity, java.lang.String, java.lang.String, com.ironsource.adqualitysdk.sdk.ISAdQualityConfig):void");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m950(C1328 c1328, Context context) {
        c1328.getClass();
        try {
            context.registerReceiver(new C1348(), new IntentFilter(StringFog.decrypt("fEc5GJz5Aip0RykPneRIZX5dNAWdviRFSX0YOKrPJUxcZxovtw==\n", "HSldavOQZgQ=\n")), null, AbstractC4631n.f409);
        } catch (Throwable th) {
            String str = f3948;
            AbstractC0509.m497(str, str, StringFog.decrypt("+rUjPsZDxfjT9Dg3xE6W+NmmajDCU5Hpzq1qIMZEgOXKsTg=\n", "vNRKUqMn5Yw=\n"), th, null, true);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void changeUserId(String str) {
        Exception exc;
        C4610d0 c4610d0;
        try {
            if (!m965(str)) {
                return;
            }
            synchronized (this) {
                try {
                    c4610d0 = this.f3967;
                } catch (Exception e) {
                    e = e;
                    exc = e;
                }
            }
            boolean zEquals = str.equals(c4610d0.m362());
            boolean z = !zEquals;
            boolean zMo886 = AbstractC1227.m885().mo886();
            if (!zEquals && zMo886) {
                try {
                    C0949 c0949 = this.f3954;
                    c0949.getClass();
                    AbstractC4631n.m402(new C1066(c0949));
                } catch (Exception e2) {
                    exc = e2;
                }
            }
            m963(this.f3959, str, z, true, zMo886);
            return;
        } catch (Exception e3) {
            e = e3;
        }
        exc = e;
        AbstractC1290.m906(f3948, q63.i("s3xaUDV6OeuCekFRIHo//ZN8YVtn\n", "9g4oP0daSo4=\n", str), exc, true, false, true);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized boolean m959() {
        return this.f3964;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized C4610d0 m960() {
        return this.f3967;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m949(C1328 c1328) {
        synchronized (c1328) {
            c1328.f3964 = false;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static C1328 m948() {
        synchronized (C1328.class) {
            try {
                if (f3946 == null) {
                    f3946 = new C1328();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3946;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void initialize(Context context, String str) throws Throwable {
        initialize(context, str, null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void initializeWithGameId(Context context, String str) throws Throwable {
        initializeWithGameId(context, str, null);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m951(C1328 c1328) {
        synchronized (c1328) {
            c1328.f3965 = true;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m953(C1328 c1328, boolean z) {
        synchronized (c1328) {
            c1328.f3962 = z;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m964(boolean z) {
        String str;
        String str2;
        C0839 c0839;
        try {
            if (m956()) {
                AbstractC0509.m490(f3948, StringFog.decrypt("6sgHVHI5V0jK7z9jZwcWU8LoZlFPPlNFx+JmQ0s5QkDM7Cge\n", "o5tGMCNMNiQ=\n"));
                return;
            }
            if (!m957()) {
                AbstractC0509.m490(f3948, StringFog.decrypt("MjH/eZe8FRoSFsdOgoJUARoRnnOjvxEEWwvQdLKgFRoSGNt55uRUGBRC0HijrVQCFELNdbO9EBkM\nDJA=\n", "e2K+HcbJdHY=\n"));
                return;
            }
            String strDecrypt = StringFog.decrypt("4GZ6J2WEO7rAQUJjZ7UR9t5USGNHmS+izVpMLQ==\n", "qTU7QzTxWtY=\n");
            if (z) {
                strDecrypt = strDecrypt + StringFog.decrypt("uGjQJbxz5K/Je8MmuCfc6+hiwz63PNem\n", "mA6iStFTpcs=\n");
            }
            JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            if (z) {
                str = "6sz2FPUC\n";
                str2 = "mamEYpBwiVg=\n";
            } else {
                str = "K99A\n";
                str2 = "WLsr8S8WHQE=\n";
            }
            try {
                jSONObjectJsonObjectInit.put(StringFog.decrypt("vQ==\n", "zp4hf0/074s=\n"), StringFog.decrypt(str, str2));
            } catch (JSONException unused) {
            }
            this.f3954.m728(StringFog.decrypt("PcRpJZ0=\n", "SbQ2Ue6SAOE=\n"), jSONObjectJsonObjectInit);
            AbstractC1081 abstractC1081M765 = AbstractC1081.m765();
            String str3 = f3947;
            C1082 c1082 = (C1082) abstractC1081M765;
            if (str3 != null) {
                c0839 = (C0839) c1082.mo781().get(str3);
            } else {
                c1082.getClass();
                c0839 = null;
            }
            String str4 = c0839 != null ? c0839.f2222 : null;
            if (!TextUtils.isEmpty(str4)) {
                strDecrypt = strDecrypt + StringFog.decrypt("92n6ROl3UhO2bfxeu3c=\n", "1x6TMIFXIHY=\n") + str4;
            }
            AbstractC0509.m495(f3948, strDecrypt);
            C1150 c1150 = this.f3951;
            c1150.m845(c1150.f3339, ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN, strDecrypt);
            this.f3963 = true;
            this.f3951.f3334 = true;
            AbstractC1081.m765().mo767();
            C1255.m893(this.f3959).m895();
            this.f3957.m540();
            C1051 c1051 = this.f3955;
            C0994 c0994 = c1051.f3040;
            c0994.f2835.unregisterReceiver(c0994);
            c1051.f3039 = true;
            this.f3954.m717();
            C0843.f2235.m628();
            C0891.m647();
        } catch (Exception e) {
            AbstractC1290.m906(f3948, StringFog.decrypt("rVMq8ZVVNVOdVSz3iRJmX4dWNg==\n", "6CFYnud1Rjs=\n"), e, true, false, true);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m965(String str) {
        boolean z;
        synchronized (this) {
            z = this.f3963;
        }
        if (z) {
            AbstractC0509.m490(f3948, StringFog.decrypt("LKntMOSwYAkOpuRysOVwBB3o6nOwvSMoPInnRuXxbwgbsaNE1NsjFg67o2T45XcFAL/tOQ==\n", "b8iDF5CQA2E=\n"));
            return false;
        }
        if (!m957()) {
            AbstractC0509.m490(f3948, StringFog.decrypt("U/f5ir2orRMq8eLDpLS/C2Pi6YqZjp8DW+3txrmpp0dZ3MeKsri4CHj9rMmxsbIOZP+sjbO1vwlt\n/dnZta+XAy0=\n", "CpiMqtDd3mc=\n"));
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        AbstractC0509.m490(f3948, StringFog.decrypt("UytAlt77zMk9J1OWyOnHnGluVdOL5tzXcW5YxIvtxMtpNw==\n", "HU43tquIqbs=\n"));
        return false;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m963(Context context, String str, boolean z, boolean z2, boolean z3) {
        C4610d0 c4610d0;
        synchronized (this) {
            c4610d0 = this.f3967;
        }
        String strM362 = c4610d0.m362();
        m960().m363(str);
        if (str == null) {
            AbstractC0509.m490(f3948, StringFog.decrypt("qj93ZzcbiTmcCFcILH6JJZxNS10JVodsvwFASRZfiSGOBkAIFk/bKc8ZSggVW9o/zwwFXgRWwCjP\nA0pGSFTcIINNUFsASIkFq01RR0Vz+g2LPFBJCVPdNc8+YWNL\n", "720lKGU6qUw=\n"));
        } else if (str.equals(StringFog.decrypt("UtOqou4viUAexLyjqzGGSUc=\n", "M73T1oZG5yc=\n"))) {
            String str2 = f3948;
            StringBuilder sbM577 = AbstractC0688.m577("/56w7rotgbPVucXTjSzUmdOihYGcZMTK3qmEwJ1g1crPv4fTyEXlyg==\n", "uszioegMoeo=\n", new StringBuilder(), str);
            sbM577.append(StringFog.decrypt("9W0jqOXRhtj7IBKv5ZCGyKkoU7DvkIXcqD5TpaDFm9SqOBbk9cOQz/sEN+Tm34edviwQrKDFhtip\nbQeroPmm/L8cBqXs2YHE+x43j64=\n", "201zxICw9b0=\n"));
            AbstractC0509.m490(str2, sbM577.toString());
        } else {
            String str3 = f3948;
            AbstractC0509.m498(str3, str3, q63.i("gWuZLWrc+Gy8VZk+JvzfVPhXqBRq4NhIqiSlG2r82Bf4\n", "2ATsX0qVqy0=\n", str), true);
        }
        AbstractC1081 abstractC1081M765 = AbstractC1081.m765();
        C0365 c0365 = new C0365(this, z, context, z2, strM362, z3);
        C1082 c1082 = (C1082) abstractC1081M765;
        Handler handler = c1082.f3131;
        if (handler != null) {
            handler.post(new C1135(c1082, c0365));
        }
        JSONObject jSONObjectM961 = m961();
        if (jSONObjectM961 != null) {
            AbstractC1081 abstractC1081M766 = AbstractC1081.m765();
            C4610d0 c4610d0M960 = m960();
            C1082 c1083 = (C1082) abstractC1081M766;
            c1083.f3116 = 0L;
            c1083.f3115 = c4610d0M960;
            c1083.mo706(jSONObjectM961);
            c1083.m793();
            c1083.m789();
            return;
        }
        AbstractC1081.m765().mo786(context, m960(), true);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m961() {
        C4610d0 c4610d0;
        synchronized (this) {
            c4610d0 = this.f3967;
        }
        ConcurrentHashMap concurrentHashMap = c4610d0.f312;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(StringFog.decrypt("MIS9vHaISqYOgqCMfQ==\n", "UeDM4x/mI9I=\n"))) {
            return null;
        }
        try {
            return IronSourceNetworkBridge.jsonObjectInit((String) concurrentHashMap.get(StringFog.decrypt("Z9fMAFDH1P9Z0dEwWw==\n", "BrO9XzmpvYs=\n")));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m952(C1328 c1328, Context context) {
        String strM741 = c1328.f3953.m741(StringFog.decrypt("7pPZELPAodbOmQ==\n", "h/2tPsCl0qU=\n"));
        if (TextUtils.isEmpty(strM741)) {
            return;
        }
        String strDecrypt = StringFog.decrypt("yqz8sEiRs6nV8PalA5ew5N+w/L9Uh7upzQ==\n", "vt6d0y3z0so=\n");
        String strDecrypt2 = StringFog.decrypt("aGgXYKzNiEV+ZApotIGRV3VmFHS0xcZF\n", "Gwd4DcCspTY=\n");
        Context applicationContext = context.getApplicationContext();
        C0512 c0512 = new C0512(applicationContext, strDecrypt);
        C0578 c0578 = new C0578(AbstractC0541.f1303, applicationContext.getPackageName(), AbstractC0453.m477(applicationContext), strDecrypt2);
        try {
            c0512.m508(StringFog.decrypt("6TPMlEjsonPJOQ==\n", "gF24ujuJ0QA=\n"), c0578.m525(strM741));
        } catch (Throwable unused) {
        }
        c1328.f3953.m740(StringFog.decrypt("sFU+slzDQwGQXw==\n", "2TtKnC+mMHI=\n"));
    }
}
