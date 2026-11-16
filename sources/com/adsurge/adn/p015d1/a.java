package com.adsurge.adn.p015d1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.TextUtils;
import com.adsurge.adn.lib.dysi.IGDTBiz;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class a extends BroadcastReceiver {
    public final IGDTBiz a;
    public final com.adsurge.adn.Q.a b;
    public boolean c = false;

    public final void a(Intent intent) {
        com.adsurge.adn.Q.a aVar = this.b;
        if (aVar == null) {
            return;
        }
        String strR = aVar.r();
        if (TextUtils.isEmpty(strR)) {
            return;
        }
        Uri data = intent.getData();
        String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : "";
        if (!TextUtils.isEmpty(schemeSpecificPart) && schemeSpecificPart.equals(strR)) {
            this.a.onAppInstall();
        }
    }

    public void b(Context context) {
        if (!this.c || context == null) {
            return;
        }
        try {
            context.getApplicationContext().unregisterReceiver(this);
            this.c = false;
        } catch (Exception unused) {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getAction() == null || !"android.intent.action.PACKAGE_ADDED".equals(intent.getAction())) {
            return;
        }
        a(intent);
    }

    public a(IGDTBiz iGDTBiz, com.adsurge.adn.Q.a aVar) {
        this.a = iGDTBiz;
        this.b = aVar;
    }

    public void a(Context context) {
        com.adsurge.adn.Q.a aVar;
        if (this.c || context == null || (aVar = this.b) == null || TextUtils.isEmpty(aVar.r())) {
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme("package");
            context.getApplicationContext().registerReceiver(this, intentFilter);
            this.c = true;
        } catch (Exception unused) {
        }
    }
}
