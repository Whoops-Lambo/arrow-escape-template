package com.inmobi.media;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class D5 extends CustomTabsServiceConnection {
    public final /* synthetic */ F5 a;

    public D5(F5 f5) {
        this.a = f5;
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        F5 f5 = this.a;
        f5.a = null;
        C4343r3 c4343r3 = f5.c;
        if (c4343r3 != null) {
            Yb yb = c4343r3.c;
            if (yb != null) {
                yb.f = "IN_NATIVE";
            }
            C4304pj c4304pj = (C4304pj) c4343r3.k.get();
            if (c4304pj != null) {
                Mb mb = Mb.LPBrowserOpenFailed;
                Yb yb2 = c4343r3.c;
                mb.getClass();
                c4304pj.a.getLandingPageHandler().a(mb, yb2, (Integer) 8009);
            }
            c4343r3.b();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        componentName.getClass();
        F5 f5 = this.a;
        f5.a = null;
        C4343r3 c4343r3 = f5.c;
        if (c4343r3 != null && c4343r3.m) {
            c4343r3.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0096  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        int iA;
        Yb yb;
        C4304pj c4304pj;
        componentName.getClass();
        customTabsClient.getClass();
        F5 f5 = this.a;
        f5.a = customTabsClient;
        C4343r3 c4343r3 = f5.c;
        if (c4343r3 != null && !c4343r3.n && !c4343r3.m) {
            try {
                F5 f6 = c4343r3.e;
                CustomTabsSession customTabsSessionD = f6.d;
                if (customTabsSessionD == null) {
                    CustomTabsClient customTabsClient2 = f6.a;
                    if (customTabsClient2 != null) {
                        customTabsSessionD = customTabsClient2.d(new E5(f6));
                    } else {
                        customTabsSessionD = null;
                    }
                    f6.d = customTabsSessionD;
                }
                if (customTabsSessionD != null) {
                    Bundle bundle = Bundle.EMPTY;
                    if (customTabsSessionD.b()) {
                        customTabsSessionD.d(c4343r3.a());
                    }
                }
            } catch (Throwable unused) {
            }
            try {
                try {
                    Uri uri = Uri.parse(c4343r3.a);
                    uri.getClass();
                    c4343r3.a(uri);
                    c4343r3.m = true;
                } catch (Exception unused2) {
                    iA = 9;
                    yb = c4343r3.c;
                    if (yb != null) {
                        yb.f = "EX_NATIVE";
                    }
                    if (iA == 0) {
                        c4304pj = (C4304pj) c4343r3.k.get();
                        if (c4304pj != null) {
                            AbstractC4065h3.a(c4304pj, Mb.LPStartSuccess, c4343r3.c);
                        }
                    } else {
                        c4304pj = (C4304pj) c4343r3.k.get();
                        if (c4304pj != null) {
                            AbstractC4065h3.a(c4304pj, Mb.LPStartSuccess, c4343r3.c);
                        }
                    }
                    c4343r3.b();
                }
            } catch (Throwable unused3) {
                Context contextC = c4343r3.c();
                String str = c4343r3.a;
                Object obj = c4343r3.l.get();
                obj.getClass();
                iA = Y3.a(contextC, str, (Ji) obj, c4343r3.d);
                yb = c4343r3.c;
                if (yb != null) {
                    yb.f = "EX_NATIVE";
                }
                if (iA == 0 && iA != 1) {
                    C4304pj c4304pj2 = (C4304pj) c4343r3.k.get();
                    if (c4304pj2 != null) {
                        Mb mb = Mb.LPBrowserOpenFailed;
                        Yb yb2 = c4343r3.c;
                        Integer numValueOf = Integer.valueOf(iA);
                        mb.getClass();
                        c4304pj2.a.getLandingPageHandler().a(mb, yb2, numValueOf);
                    }
                } else {
                    c4304pj = (C4304pj) c4343r3.k.get();
                    if (c4304pj != null) {
                        AbstractC4065h3.a(c4304pj, Mb.LPStartSuccess, c4343r3.c);
                    }
                }
                c4343r3.b();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClass();
        F5 f5 = this.a;
        f5.a = null;
        C4343r3 c4343r3 = f5.c;
        if (c4343r3 != null && c4343r3.m) {
            c4343r3.b();
        }
    }
}
