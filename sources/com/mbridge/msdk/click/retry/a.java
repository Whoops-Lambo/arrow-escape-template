package com.mbridge.msdk.click.retry;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.C4664b4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.f;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import defpackage.h50;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class a {
    public static String e = "mtg_retry_report=1";
    public static int f = 10000;
    public static int g = 3;
    public static int h = 50;
    public static int i = 600000;
    private static int j = 0;
    private static int k = 0;
    public static int l = 0;
    public static int m = 1;
    public static int n = 2;
    public static int o = 3;
    public static int p = 4;
    public static int q = 5;
    private ConcurrentHashMap<String, com.mbridge.msdk.click.retry.b> a;
    private com.mbridge.msdk.click.retry.c b;
    private BroadcastReceiver c;
    private final Handler d;

    /* JADX INFO: renamed from: com.mbridge.msdk.click.retry.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class C1398a extends BroadcastReceiver {
        public C1398a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                a.this.d.sendEmptyMessage(2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class b {
        private static a a = new a(null);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class c extends Handler {
        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                a.b().c();
            } else {
                Object obj = message.obj;
                if (obj instanceof String) {
                    a.b().a((String) obj, com.mbridge.msdk.click.retry.b.k);
                }
            }
        }

        public c(Looper looper) {
            super(looper);
        }
    }

    private boolean b(int i2) {
        return i2 == m || i2 == n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        com.mbridge.msdk.click.retry.c cVar = this.b;
        if (cVar != null) {
            Iterator<String> it = cVar.a().iterator();
            while (it.hasNext()) {
                a(it.next(), com.mbridge.msdk.click.retry.b.l);
            }
        }
    }

    private a() {
        this.a = new ConcurrentHashMap<>();
        this.b = new com.mbridge.msdk.click.retry.c(h);
        this.d = new c(Looper.getMainLooper());
        g gVarD = i.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        g = gVarD.j0();
        f = gVarD.l0() * 1000;
        i = gVarD.m0() * 1000;
        j = gVarD.i0();
        k = gVarD.k0();
        a();
    }

    public void a(String str, String str2, CampaignEx campaignEx, String str3, boolean z, boolean z2, int i2) {
        if (c(i2) && !TextUtils.isEmpty(str)) {
            String strReplace = str.replace("?" + e, "").replace(C4664b4.j.c + e, "");
            if (this.a == null) {
                this.a = new ConcurrentHashMap<>();
            }
            com.mbridge.msdk.click.retry.b bVarRemove = this.a.remove(strReplace);
            if (bVarRemove == null) {
                bVarRemove = new com.mbridge.msdk.click.retry.b(str, str2);
                bVarRemove.b(i2);
                bVarRemove.a(z);
                bVarRemove.b(z2);
                bVarRemove.a(campaignEx);
                bVarRemove.b(str3);
            } else if (bVarRemove.d() != com.mbridge.msdk.click.retry.b.l) {
                bVarRemove.a(str2);
            }
            if ((a(i2) && j != 0) || ((b(i2) && k != 0) || i2 == q)) {
                if (System.currentTimeMillis() < bVarRemove.c() + ((long) i)) {
                    a(strReplace, bVarRemove);
                    if (bVarRemove.d() == com.mbridge.msdk.click.retry.b.k) {
                        if (bVarRemove.e() <= g) {
                            a(strReplace);
                            return;
                        } else {
                            a(bVarRemove);
                            return;
                        }
                    }
                    return;
                }
                if (bVarRemove.d() == com.mbridge.msdk.click.retry.b.k) {
                    a(bVarRemove);
                    return;
                }
                return;
            }
            a(bVarRemove);
        }
    }

    public static a b() {
        return b.a;
    }

    private boolean c(int i2) {
        return a(i2) || b(i2) || i2 == q;
    }

    public /* synthetic */ a(C1398a c1398a) {
        this();
    }

    private void a(com.mbridge.msdk.click.retry.b bVar) {
        String str;
        String requestIdNotice;
        try {
            CampaignEx campaignExA = bVar.a();
            if (campaignExA != null) {
                String requestId = campaignExA.getRequestId();
                requestIdNotice = campaignExA.getRequestIdNotice();
                str = requestId;
            } else {
                str = "";
                requestIdNotice = str;
            }
            a(com.mbridge.msdk.foundation.controller.c.n().d(), bVar.b().toString(), bVar.g(), str, requestIdNotice, bVar.h());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static void a(Context context, String str, String str2, String str3, String str4, int i2) {
        f.a().a(context, str, str2, str3, str4, i2);
    }

    private void a(String str, com.mbridge.msdk.click.retry.b bVar) {
        if (this.b == null) {
            this.b = new com.mbridge.msdk.click.retry.c(h);
        }
        this.b.a(str, bVar);
    }

    private void a(String str) {
        Message messageObtainMessage = this.d.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = str;
        this.d.sendMessageDelayed(messageObtainMessage, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i2) {
        String string;
        com.mbridge.msdk.click.retry.c cVar = this.b;
        if (cVar != null) {
            com.mbridge.msdk.click.retry.b bVarA = cVar.a(str);
            this.b.b(str);
            if (bVarA == null) {
                com.mbridge.msdk.click.retry.b bVar = this.a.get(str);
                if (bVar == null || System.currentTimeMillis() > bVar.c() + ((long) i) || bVar.e() >= g || i2 == com.mbridge.msdk.click.retry.b.l) {
                    return;
                }
                a(str);
                return;
            }
            if (System.currentTimeMillis() <= bVarA.c() + ((long) i)) {
                bVarA.a(i2);
                this.a.put(str, bVarA);
                if (c1.c(str) == 0) {
                    StringBuilder sbQ = h50.q(str, "?");
                    sbQ.append(e);
                    string = sbQ.toString();
                } else {
                    StringBuilder sbQ2 = h50.q(str, C4664b4.j.c);
                    sbQ2.append(e);
                    string = sbQ2.toString();
                }
                String str2 = string;
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), bVarA.a(), bVarA.f(), str2, bVarA.i(), bVarA.j(), bVarA.h());
                return;
            }
            if (i2 != com.mbridge.msdk.click.retry.b.l) {
                a(bVarA);
            }
        }
    }

    private void a() {
        try {
            if (this.c == null) {
                this.c = new C1398a();
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                if (contextD != null) {
                    contextD.registerReceiver(this.c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private boolean a(int i2) {
        return i2 == p || i2 == o;
    }
}
